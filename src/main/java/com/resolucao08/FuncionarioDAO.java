package com.resolucao08;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncionarioDAO {
    
    @PostMapping ("/funcionario")
    public Funcionario create (@RequestBody Funcionario funcionario){
        funcionario.setId(UUID.randomUUID());
        return funcionario;
    }
    
    @GetMapping ("/funcionario")
    public List <Funcionario> read(){
	return Stream.of(
		new Funcionario ("John Connor", 14, 12000),
		new Funcionario ("Sara Connor", 32, 2000)
		).collect(Collectors.toList());
    } 
    
    @PutMapping ("/funcionario")
    public Funcionario update(@RequestBody Funcionario funcionario){
	funcionario.setNome(funcionario.getNome()+" -- updated!");
        return funcionario;
    }
    
    @DeleteMapping ("/funcionario/{id}")
    public String delete (@PathVariable int id){
	return "deleted!";
    }
}
