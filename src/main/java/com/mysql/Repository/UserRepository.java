package com.mysql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.mysql.Entity.User;
@Component
public interface UserRepository extends JpaRepository<User, Integer> {

	
}
