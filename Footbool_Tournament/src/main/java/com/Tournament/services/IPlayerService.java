package com.Tournament.services;

import java.util.List;

import com.Tournament.entities.Player;

public interface IPlayerService 
{
	Player createPlayer(Player player);
	Player UpdatePlayer(Player player);
	List<Player> getAllPlayers();
	void deletePlayer(Player player);
	void deletePlayerById(Integer id);
	Player getPlayerById(Integer id);

}
