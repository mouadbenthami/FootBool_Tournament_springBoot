package com.Tournament.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Tournament.entities.Match;

public interface IMatch extends JpaRepository<Match, Integer>
{

}
