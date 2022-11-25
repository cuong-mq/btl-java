package net.codejava.loginRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.codejava.logindomain.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{
       Login findByUsernameAndPassword(String username, String password);
 
}
