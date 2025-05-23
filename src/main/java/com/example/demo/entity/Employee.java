/**
 * 
 */
package com.example.demo.entity;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Employee class represents the data model for employee
 * 
 * @author Daniel Manzano Borja
 * @since 21-MAY-2025	
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "employee")
public class Employee implements Serializable {
	
	private static final long serialVersionUID = 7131895514175903278L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="secondName")
	private String secondName;
	
	@Column(name="paternalLastName")
	private String paternalLastName;
	
	@Column(name="maternalLastName")
	private String maternalLastName;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="dateOfBirth")
	private LocalDate dateOfBirth;
	
	@Column(name="position")
	private String position;

}
