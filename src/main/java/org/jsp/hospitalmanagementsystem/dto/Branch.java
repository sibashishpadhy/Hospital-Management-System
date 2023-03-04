package org.jsp.hospitalmanagementsystem.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;




@Entity
@Data
public class Branch
{
	private int id;
	private String name,email,phone;
	
	@ManyToOne
	@JoinColumn
	private Hospital hospital;
	@OneToOne(mappedBy = "branch")
	private Address address;
	@OneToMany(mappedBy = "branch")
	private List<Encounters> encounters;
}
