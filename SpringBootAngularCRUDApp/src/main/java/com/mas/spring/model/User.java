package com.mas.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/*
 * MAS - CRUD - Spring / JPA / AngularJS / Hibernate
 * 
 */

@Entity
@Table(name="APP_NAME")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8839574821007801298L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@Column(name="NAME", nullable=false)
	private String name;
	
	@Column(name="AGE", nullable=false)
	private Integer age;
	
	@Column(name="SALARY", nullable=false)
	private double salary;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) 
			return true;
		if (obj == null || getClass() != obj.getClass()) 
			return false;

		User user = (User) obj;

		if (Double.compare(user.salary, salary) != 0) 
			return false;
		if (id != null ? !id.equals(user.id) : user.id != null) 
			return false;
		if (name != null ? !name.equals(user.name) : user.name != null) 
			return false;
		
		return age != null ? age.equals(user.age) : user.age == null;
	}

	@Override
	public String toString() {
		return "User [id=" + id + 
				  ", name=" + name + 
				  ", age=" + age + 
				  ", salary=" + salary + "]";
	}
	
}
