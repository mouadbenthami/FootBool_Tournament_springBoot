package com.Tournament.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Tournament.entities.Stadium;

public interface IStadium extends JpaRepository<Stadium, Integer>{

}
