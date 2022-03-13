package com.sjh.first.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sjh.first.blog.model.User;

@Repository //생략가능
public interface UserRepository extends JpaRepository<User, Integer>{

}
