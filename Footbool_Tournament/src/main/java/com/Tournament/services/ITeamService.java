package com.Tournament.services;

import java.util.List;

import com.Tournament.entities.Team;

public interface ITeamService 
{
	Team createTeam(Team team);
	Team UpdateTeam(Team team);
	List<Team> getAllStadium();
	void deleteTeam(Team Team);
	void deleteTeamById(Integer id);
	Team getTeamById(Integer id);
}
