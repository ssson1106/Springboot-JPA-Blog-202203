package com.sjh.first.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
	@Id
	private String id;
	private String name;
	private String adrress;
}
