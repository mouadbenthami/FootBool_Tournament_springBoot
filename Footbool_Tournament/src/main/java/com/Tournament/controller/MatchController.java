package com.Tournament.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Tournament.entities.Match;
import com.Tournament.services.MatchServiceImpl;

@RestController
public class MatchController 
{
	@Autowired
    private MatchServiceImpl msi;
	
	@PostMapping("/createMatch")
    public Match add(@RequestBody Match match) {
    	return msi.createMatch(match);
    }
    @PostMapping("/updateMatch")
    public String update(@RequestBody Match match) {
        msi.UpdateMatch(match);
        return "AddMatch";
    }
    @PostMapping("/deleteMatch")
    public void deleteMatch(@RequestBody Match match) {
        msi.deleteMatch(match);
    }
    @GetMapping("/getAllMatchs")
    public List<Match> getAllMatchs() {
    	return msi.getAllMatch(); 
    }


}
