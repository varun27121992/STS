
package com.GlobalException;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "worker_details")
public class worker{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private String name;
	public worker(String name, int salary, String address) {
		super();
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	private int salary;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
