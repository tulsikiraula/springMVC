package service;

public class LoginService {

	public boolean checkLoginCredentials(String username, String password) {

		if ("tulsi".equals(username) && "password".equals(password))
			return true;

		return false;

	}
}
