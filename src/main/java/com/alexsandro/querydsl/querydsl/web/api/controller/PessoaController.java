package com.alexsandro.querydsl.querydsl.web.api.controller;

import static lombok.AccessLevel.PRIVATE;

import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexsandro.querydsl.querydsl.domain.model.Pessoa;
import com.alexsandro.querydsl.querydsl.repository.PessoaRepository;
import com.querydsl.core.types.Predicate;

import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/pessoas")
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class PessoaController {
	
	PessoaRepository pessoaRepository;
	
	@GetMapping
	public Iterable<Pessoa> getPessoas(@QuerydslPredicate(root = Pessoa.class) Predicate predicate) {
		return  pessoaRepository.findAll(predicate);
	}
	
}
