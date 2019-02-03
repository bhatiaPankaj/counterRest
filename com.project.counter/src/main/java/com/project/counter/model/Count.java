package com.project.counter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="number" )
public class Count {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="num")
	private int num;

	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Count [id=" + id + ", num=" + num + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	

}
