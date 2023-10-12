package com.Tournament.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Tournament.entities.Player;

public interface IPlayer extends JpaRepository<Player, Integer>
{

}
