package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import bean.SpringException;
import bean.Student;

@Controller
public class StudentController {
	
	//command is required if form:form is used in jsp and return empty student object in student page
	//Login-context.xml is required for redirecting the page using controller for the first time when used with model object. 
	@RequestMapping(value="/student",method=RequestMethod.GET)
	  public ModelAndView student() {
	      return new ModelAndView("student", "command", new Student());
	   }
	
	@RequestMapping(value = "/addStudent" , method=RequestMethod.POST)
	 public String addStudent(Student student, 
			ModelMap model) {

		if (student.getName().length() < 5)
			throw new SpringException("Name cannot be less than 5 chars");
		else
			model.addAttribute("name", student.getName());
		if (student.getAge() < 1)
			throw new SpringException("Age cannot be less than 1");
		else
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());

		return "showDetails"; // (use "redirect:page_name" to redirect to any page)
	}
}
