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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "`Team`")

public class Team 
{
	@Id
	@GeneratedValue
	private Integer id;
	@Column(nullable=false)
	private String Name;
	@Column(nullable=false)
	private String country;
	@OneToMany(mappedBy = "team", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Player> players = new ArrayList<>();
	@ManyToMany(mappedBy = "teammms")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Match> games;
	
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
