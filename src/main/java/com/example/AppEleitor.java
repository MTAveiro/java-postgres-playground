package com.example;

import java.time.LocalDate;

public class AppEleitor {
    
    public static void main(String[] args) {
        var cidadao = new Cidadao();
        cidadao.setDataDeNascimento(LocalDate.of(0020,10,1));
        System.out.println(cidadao.idade());
        System.out.println(cidadao.eleitor());

    }
}
