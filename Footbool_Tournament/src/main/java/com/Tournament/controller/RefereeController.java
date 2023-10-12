package com.Tournament.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Tournament.entities.Referee;
import com.Tournament.services.RefereeServiceImpl;



@RestController
public class RefereeController 
{
	@Autowired
    private RefereeServiceImpl rsi;

    @PostMapping("/createReferee")
    public Referee add(@RequestBody Referee referee) {
    	return rsi.createReferee(referee);
    }
    @PostMapping("/updateReferee")
    public String update(@RequestBody Referee referee) {
        rsi.UpdateReferee(referee);
        return "AddReferee";
    }
    @PostMapping("/deleteReferee")
    public void delete(@RequestBody Referee referee) {
        rsi.deleteReferee(referee);
    }
    @GetMapping("/getA")
    public List<Referee> getA() {
        return rsi.getAllReferee();
    }

}
