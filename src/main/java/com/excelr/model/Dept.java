package com.excelr.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Dept {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int dno;
		private String dname;
		private String city;
		
		@OneToMany(mappedBy = "myDept")
		private List<Employee> deptEmps;
}
