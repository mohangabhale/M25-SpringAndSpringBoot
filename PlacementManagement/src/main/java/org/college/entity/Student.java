package org.college.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	private Integer id;
	private String certificate;
	private String college;
	private String course;
	private String hallticketno;
	private String name;
	private String qualification;
	private String roll;
	private String year;

	public Student() {
	}

	public Student(Integer id, String certificate, String college, String course, String hallticketno, String name,
			String qualification, String roll, String year) {
		this.certificate = certificate;
		this.college = college;
		this.course = course;
		this.hallticketno = hallticketno;
		this.name = name;
		this.qualification = qualification;
		this.roll = roll;
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

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getHallticketno() {
		return hallticketno;
	}

	public void setHallticketno(String hallticketno) {
		this.hallticketno = hallticketno;
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

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", certificate=" + certificate + ", college=" + college + ", course=" + course
				+ ", hallticketno=" + hallticketno + ", name=" + name + ", qualification=" + qualification + ", roll="
				+ roll + ", year=" + year + "]";
	}

}