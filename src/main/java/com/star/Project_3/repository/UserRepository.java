package com.star.Project_3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.star.Project_3.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
