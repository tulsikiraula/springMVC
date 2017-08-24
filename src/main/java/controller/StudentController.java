package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import bean.Student;

@Controller
public class StudentController {
	
	//command is required if form:form is used in jsp and return empty student object in student page
	//Login-context.xml is required for redirecting the page using controller for the first time.
	@RequestMapping(value="/student",method=RequestMethod.GET)
	  public ModelAndView student() {
	      return new ModelAndView("student", "command", new Student());
	   }
	
	@RequestMapping(value = "/addStudent" , method=RequestMethod.POST)
	 public String addStudent(Student student, 
			   ModelMap model) {
			      model.addAttribute("name", student.getName());
			      model.addAttribute("age", student.getAge());
			      model.addAttribute("id", student.getId());
			      
			      return "showDetails";
	}
}
