package com.Tournament.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Tournament.entities.Team;
import com.Tournament.services.TeamServiceImpl;

@RestController
public class TeamController 
{
	@Autowired
    private TeamServiceImpl psi;
	
	@PostMapping("/createTeam")
    public Team add(@RequestBody Team match) {
    	return psi.createTeam(match);
    }
    @PostMapping("/updateTeam")
    public String update(@RequestBody Team match) {
        psi.UpdateTeam(match);
        return "AddMatch";
    }
    @PostMapping("/deleteTeam")
    public void deleteStadium(@RequestBody Team match) {
        psi.deleteTeam(match);
    }
    @PostMapping("/getAllTeams")
    public List<Team> getAllTeams() {
       return psi.getAllStadium(); 
    }
	
	

}
