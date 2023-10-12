package com.Tournament.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Tournament.dao.IStadium;
import com.Tournament.entities.Stadium;
@Service
@Transactional
public class StadiumServiceImpl implements IStadiumService
{
	@Autowired 
	IStadium istadium;
	@Override
	public Stadium createStadium(Stadium stadium) {	
		return istadium.save(stadium);
	}

	@Override
	public Stadium UpdateStadium(Stadium stadium) {	
		return istadium.save(stadium);
	}

	@Override
	public List<Stadium> getAllStadium() {
		return istadium.findAll();
	}

	@Override
	public void deleteStadium(Stadium stadium) {
		istadium.delete(stadium);
	}

	@Override
	public void deleteStadiumById(Integer id) {
		istadium.deleteById(id);	
	}

	@Override
	public Stadium getStadiumById(Integer id) {
		return istadium.findById(id).get();
	}
}
