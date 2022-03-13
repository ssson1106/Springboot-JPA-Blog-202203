package com.sjh.first.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class User {
	@Id
	private String id;
	private String username;
	private String password;
	private String email;
}
