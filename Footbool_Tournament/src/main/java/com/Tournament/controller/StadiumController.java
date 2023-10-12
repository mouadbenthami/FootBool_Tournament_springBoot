package com.Tournament.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Tournament.entities.Stadium;
import com.Tournament.services.StadiumServiceImpl;

@RestController
public class StadiumController 
{
	@Autowired
    private StadiumServiceImpl psi;
	
	@PostMapping("/createStadium")
    public Stadium add(@RequestBody Stadium match) {
    	return psi.createStadium(match);
    }
    @PostMapping("/updateStadium")
    public String update(@RequestBody Stadium match) {
        psi.UpdateStadium(match);
        return "AddMatch";
    }
    @PostMapping("/deleteStadium")
    public void deleteStadium(@RequestBody Stadium match) {
        psi.deleteStadium(match);
    }
    @PostMapping("/getAllStadiums")
    public List<Stadium> getAllPlayers() {
       return psi.getAllStadium(); 
    }
	

}
