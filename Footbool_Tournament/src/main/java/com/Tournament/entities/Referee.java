package com.Tournament.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "`refree`")

public class Referee 
{
	@Id
	@GeneratedValue
	private Integer id;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private String nationality;
	@OneToMany(mappedBy = "referee", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Match> matchs = new ArrayList<>();
	
	public List<Match> getMatchs(){
		return matchs;
	}
	public void setMatchs(List<Match> matchs){
		this.matchs = matchs;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
}


