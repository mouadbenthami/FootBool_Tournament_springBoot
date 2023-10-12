package com.Tournament.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Tournament.dao.IReferee;
import com.Tournament.entities.Referee;
@Service
@Transactional
public class RefereeServiceImpl implements IRefereeService
{
	@Autowired 
    IReferee ireferee;
	@Override
	public Referee createReferee(Referee referee) 
	{
		return ireferee.save(referee);
	}

	@Override
	public Referee UpdateReferee(Referee referee)
	{
		return ireferee.save(referee);
	}

	@Override
	public List<Referee> getAllReferee() 
	{
		return ireferee.findAll();
	}

	@Override
	public void deleteReferee(Referee referee) 
	{
		ireferee.delete(referee);
	}

	@Override
	public void deleteRefereeById(Integer id) {
		ireferee.deleteAll();
	}

	@Override
	public Referee getRefereeById(Integer id) {
		return ireferee.findById(id).get();
	}

}
