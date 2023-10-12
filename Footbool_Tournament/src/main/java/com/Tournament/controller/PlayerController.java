package com.Tournament.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Tournament.entities.Player;
import com.Tournament.services.PlayerServiceImpl;

@RestController
public class PlayerController {
	
	@Autowired
    private PlayerServiceImpl psi;
	
	@PostMapping("/createPlayer")
    public Player add(@RequestBody Player match) {
    	return psi.createPlayer(match);
    }
    @PostMapping("/updatePlayer")
    public String update(@RequestBody Player match) {
        psi.UpdatePlayer(match);
        return "AddMatch";
    }
    @PostMapping("/deletePlayer")
    public void deletePlayer(@RequestBody Player match) {
        psi.deletePlayer(match);
    }
    @PostMapping("/getAllPlayers")
    public List<Player> getAllPlayers() {
       return psi.getAllPlayers(); 
    }

}
