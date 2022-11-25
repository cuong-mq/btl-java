package net.codejava.loginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.logindomain.Login;
import net.codejava.loginRepository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	private LoginRepository repo;

	public Login login(String username, String password) {
		Login user = repo.findByUsernameAndPassword(username, password);
		return user;
	}

}