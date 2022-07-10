package com.alexsandro.querydsl.querydsl.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter @Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Pessoa {
	
	@Id	Long id;
	String nome;
	String sexo;
	int idade;

}
