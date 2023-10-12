package com.Tournament.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "`match`")
public class Match 
{
	@Id
	@GeneratedValue
	private Integer id;
	@Column(nullable=false)
	private String date;
	@Column(nullable=false)
	private String time;
	@ManyToOne
	private Referee referee;
	@ManyToOne
	private Stadium staduim;
	@ManyToMany
	@JsonProperty(access = Access.WRITE_ONLY)
	@JoinTable(name = "match_team",joinColumns = @JoinColumn(name="match_id"),inverseJoinColumns = @JoinColumn(name="team_id"))
	private List<Team> teammms;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Referee getReferee() {
		return referee;
	}
	public void setReferee(Referee referee) {
		this.referee = referee;
	}
	public Stadium getStaduim() {
		return staduim;
	}
	public void setStaduim(Stadium staduim) {
		this.staduim = staduim;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	

}
