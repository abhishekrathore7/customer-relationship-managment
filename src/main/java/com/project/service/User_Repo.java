package com.project.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.dao.User_details;


public interface User_Repo  extends JpaRepository<User_details , Long>{

}