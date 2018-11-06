package com.resolucao08;

import java.util.UUID;

public class Funcionario {
    
    private UUID id;
    private String nome;
    private int idade;
    private float salario;
    
    public Funcionario(){}     
    
    public Funcionario (String nome, int idade, float salario){
        this.nome = nome;
        this.idade = idade;
        this. salario = salario;
    }
    
    public UUID getId(){
        return id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public float getSalario(){
        return salario;
    }
    
    public void setId(UUID id) {
	this.id = id;
    }
    
    public void setNome(String nome) {
	this.nome = nome;
    }
    
    public void setIdade(int idade) {
	this.idade = idade;
    }
    
    public void setSalario(float salario) {
	this.salario = salario;
    }
}
