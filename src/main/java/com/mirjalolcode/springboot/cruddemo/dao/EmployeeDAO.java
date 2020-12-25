package com.mirjalolcode.springboot.cruddemo.dao;

import java.util.List;

import com.mirjalolcode.springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {

	public List<Employee>findAll();
}
