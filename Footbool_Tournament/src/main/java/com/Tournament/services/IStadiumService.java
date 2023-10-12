package com.Tournament.services;

import java.util.List;

import com.Tournament.entities.Stadium;

public interface IStadiumService 
{
	Stadium createStadium(Stadium stadium);
	Stadium UpdateStadium(Stadium stadium);
	List<Stadium> getAllStadium();
	void deleteStadium(Stadium stadium);
	void deleteStadiumById(Integer id);
	Stadium getStadiumById(Integer id);
}
