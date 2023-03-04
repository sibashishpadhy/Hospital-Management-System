package org.jsp.hospitalmanagementsystem.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Address 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String city,state;
	private long pin;
	
	@OneToOne
	@JoinColumn
	private Branch branch;
}
