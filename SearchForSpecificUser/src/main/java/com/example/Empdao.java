package com.example;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class Empdao {

	HibernateTemplate temp;

	public void setTemp(HibernateTemplate temp) {
		this.temp = temp;
	}

	public int insert(Employee e) {
		return (Integer) temp.save(e);
	}

	public List<Employee> getall() {
		String sql = "from Employee";
		return (List<Employee>) temp.find(sql);
	}

	public String update(Employee e) {
		temp.update(e);

		return "Success";
	}

}
