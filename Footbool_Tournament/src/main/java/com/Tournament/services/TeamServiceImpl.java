package com.Tournament.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Tournament.dao.ITeam;
import com.Tournament.entities.Team;
@Service
@Transactional
public class TeamServiceImpl implements ITeamService
{
	@Autowired 
	ITeam iteam;
	@Override
	public Team createTeam(Team team) {
		return iteam.save(team);
	}

	@Override
	public Team UpdateTeam(Team team) {
		return iteam.save(team);
	}

	@Override
	public List<Team> getAllStadium() {
		return iteam.findAll();
	}

	@Override
	public void deleteTeam(Team Team) {
		iteam.delete(Team);
	}

	@Override
	public void deleteTeamById(Integer id) {
		iteam.deleteById(id);	
	}

	@Override
	public Team getTeamById(Integer id) {
		return iteam.findById(id).get();
	}

}
