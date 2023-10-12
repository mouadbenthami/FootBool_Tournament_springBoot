package com.Tournament.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Tournament.entities.Team;

public interface ITeam extends JpaRepository<Team, Integer>{

}
