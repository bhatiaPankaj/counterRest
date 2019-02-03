package com.project.counter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * This class acts as the DTO which is mapped to the table 'number' in the
 * database
 * 
 * @author Pankaj
 *
 */
@Component
@Entity
@Table(name = "number")
public class Count {
	/**
	 * This parameter is mapped to the 'id' field of the database
	 */
	@Id
	@Column(name = "id")
	private int id;

	/**
	 * This field is mapped to the counter field i.e 'num' in the database
	 */
	@Column(name = "num")
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
