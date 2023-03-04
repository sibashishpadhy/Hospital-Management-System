package org.jsp.hospitalmanagementsystem.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;


@Entity
@Data
public class Encounters
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalTime time;
	private LocalDate date;
	private int numberOfOccurance;
	
	@ManyToOne
	@JoinColumn
	private Person person;
	@ManyToOne
	@JoinColumn
	private Branch branch;
	@OneToMany(mappedBy = "encounters")
	private List<MedOrder> medOrders;
	
}
