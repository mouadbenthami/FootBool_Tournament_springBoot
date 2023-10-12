package com.Tournament.services;

import java.util.List;

import com.Tournament.entities.Match;

public interface IMatchService 
{
	Match createMatch(Match match);
	Match UpdateMatch(Match match);
	List<Match> getAllMatch();
	void deleteMatch(Match match);
	void deleteMatchById(Integer Id);
	Match getMatchById(Integer Id);
}
