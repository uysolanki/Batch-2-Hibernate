package com.excelr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="MyStudent")
public class Student {

			@Id
			@GeneratedValue(strategy =GenerationType.IDENTITY )
			@Column(name="RollNo")
			
			private int rno;
			private String sname;
			private double per;
			
			@Transient
			private int x;
			
			public Student() {}
			public Student(int rno, String sname, double per) {
				this.rno = rno;
				this.sname = sname;
				this.per = per;
			}
			public int getRno() {
				return rno;
			}
			public void setRno(int rno) {
				this.rno = rno;
			}
			public String getSname() {
				return sname;
			}
			public void setSname(String sname) {
				this.sname = sname;
			}
			public double getPer() {
				return per;
			}
			public void setPer(double per) {
				this.per = per;
			}
			@Override
			public String toString() {
				return "Student [rno=" + rno + ", sname=" + sname + ", per=" + per + "]";
			}
			
			
			
}
