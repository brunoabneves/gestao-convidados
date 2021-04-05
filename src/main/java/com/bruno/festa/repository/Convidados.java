package com.bruno.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruno.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long>{

}
