package com.basti.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="contact")
public class Contact implements Serializable {

    @Id
    private int id;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    
}