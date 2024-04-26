package com.example.subject;

import jakarta.persistence.*;

@Entity
public class Subject {
    
	  @Id
	  @Column(name="subject_name")
	  private String name;
	  
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	  
	  
}
