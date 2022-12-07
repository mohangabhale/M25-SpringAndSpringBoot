package org.college.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "placement")
public class Placement {
	private Integer id;
	private String college;
	private String date;
	private String name;
	private String qualification;
	private String year;

	public Placement() {
	}

	public Placement(Integer id, String college, String date, String name, String qualification, String year) {

		this.college = college;
		this.date = date;
		this.name = name;
		this.qualification = qualification;
		this.year = year;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Placement [id=" + id + ", college=" + college + ", date=" + date + ", name=" + name + ", qualification="
				+ qualification + ", year=" + year + "]";
	}

}
