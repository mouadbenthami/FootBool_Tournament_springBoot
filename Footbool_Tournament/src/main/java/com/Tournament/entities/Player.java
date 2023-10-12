package com.Tournament.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "`Player`")

public class Player 
{
	@Id
	@GeneratedValue
	private Integer id;
	@Column(nullable=false)
	private String playerName;
	@Column(nullable=false)
	private String post;
	@ManyToOne
	private Team team;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPlayerName() {
		return playerName;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}

}


