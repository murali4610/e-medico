package com.createiq.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String fistName;
	private String lastName;
	private String mobile;
	private String email;
	private String profssionalstmt;
	private String practicingFrom;
	@OneToOne(cascade =CascadeType.ALL,fetch =FetchType.LAZY)
	@JoinColumn(name = "aid")
	private Address address;
	@ManyToOne(cascade =CascadeType.ALL,fetch =FetchType.LAZY)
	@JoinColumn(name = "qid")
	private Qualification qualification;
	@ManyToMany(cascade =CascadeType.ALL,fetch =FetchType.LAZY)
	@JoinTable(name="doctor_specialization", joinColumns = {@JoinColumn(name="did",referencedColumnName = "id")},inverseJoinColumns= {@JoinColumn(name="sid",referencedColumnName="id")})	
	private List<Specialization> specialization;
	
	@ManyToOne(cascade =CascadeType.ALL,fetch =FetchType.LAZY)
	@JoinColumn(name = "hid")
	private Hospital hospital;
}
