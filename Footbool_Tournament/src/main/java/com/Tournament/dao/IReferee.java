package com.Tournament.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Tournament.entities.Referee;

public interface IReferee extends JpaRepository<Referee, Integer>{

}
