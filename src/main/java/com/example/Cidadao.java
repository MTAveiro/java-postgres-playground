package com.example;

import java.time.LocalDate;

public class Cidadao {
    private LocalDate dataDeNascimento;

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public int idade(){
        return LocalDate.now().getYear() - dataDeNascimento.getYear();
    }
    
    public String eleitor(){
        int idade = idade();
        if (idade < 16) 
            return "não é eleitor";
         if(idade>15 && idade < 18 || idade > 70)
            return "eleitor facultativo";
        return "eleitor obrigatório";

    }
}
