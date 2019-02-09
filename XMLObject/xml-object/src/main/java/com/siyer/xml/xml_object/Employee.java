package com.siyer.xml.xml_object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "employee")
@XmlType(propOrder={"name", "role" , "age", "gender", "experience" })
public class Employee {

    private int id;

    private String gender;

    private int age;
    private String name;
    private String role;
   
    
  
   
    private List<Experience> experience = new ArrayList<Experience>();

    private String password;


    @XmlTransient
    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    @XmlElementWrapper(name="experience")
    @XmlElement(name="projects")
    public List<Experience> getExperience() {
		return experience;
	}


	public void setExperience(List<Experience> experience) {
		this.experience = experience;
	}


	@XmlAttribute
    public int getId() {
        return id;
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


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getRole() {
        return role;
    }


    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "ID = " + id + " NAME=" + name + " AGE=" + age + " GENDER=" + gender + " ROLE=" +
                role + " PASSWORD=" + password;
    }

}