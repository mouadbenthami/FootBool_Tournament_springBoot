package com.Tournament.services;

import java.util.List;

import com.Tournament.entities.Referee;

public interface IRefereeService 
{
	Referee createReferee(Referee referee);
	Referee UpdateReferee(Referee referee);
	List<Referee> getAllReferee();
	void deleteReferee(Referee referee);
	void deleteRefereeById(Integer id);
	Referee getRefereeById(Integer id);
}
