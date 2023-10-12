package com.Tournament.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Tournament.dao.IPlayer;
import com.Tournament.entities.Player;
@Service
@Transactional
public class PlayerServiceImpl implements IPlayerService
{
	@Autowired 
    IPlayer iplayer;
	@Override
	public Player createPlayer(Player player) 
	{	
		return iplayer.save(player);
	}

	@Override
	public Player UpdatePlayer(Player player) 
	{
		return iplayer.save(player);
	}

	@Override
	public List<Player> getAllPlayers() 
	{
		return iplayer.findAll();
	}

	@Override
	public void deletePlayer(Player player) 
	{
	     iplayer.delete(player);
	}

	@Override
	public void deletePlayerById(Integer id) 
	{
		iplayer.deleteById(id);		
	}

	@Override
	public Player getPlayerById(Integer id) 
	{	
		return iplayer.findById(id).get();
	}

}
