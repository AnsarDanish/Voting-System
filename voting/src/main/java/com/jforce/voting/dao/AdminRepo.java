package com.jforce.voting.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jforce.voting.model.Admin;

public interface AdminRepo  extends JpaRepository<Admin, String> {

}
