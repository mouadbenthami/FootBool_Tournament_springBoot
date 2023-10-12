package com.Tournament.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Tournament.dao.IMatch;
import com.Tournament.entities.Match;


@Service
@Transactional
public class MatchServiceImpl implements IMatchService
{
    @Autowired 
    IMatch imatch;
	@Override
	public Match createMatch(Match match) 
	{
		return imatch.save(match);
	}
	@Override
	public Match UpdateMatch(Match match) 
	{
		return imatch.save(match);
	}
	@Override
	public List<Match> getAllMatch() 
	{
		
		return imatch.findAll();
	}
	@Override
	public void deleteMatch(Match match) 
	{
		imatch.delete(match);
	}
	@Override
	public void deleteMatchById(Integer Id)
	{
		imatch.deleteById(Id);
	}
	@Override
	public Match getMatchById(Integer Id)
	{
		return imatch.findById(Id).get();
	}
}
