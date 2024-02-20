package com.cts.web.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.web.Model.User;

public interface UserRepository extends JpaRepository<User,String> {
	 User findByEmailAndPassword(String email, String password);
	
}
