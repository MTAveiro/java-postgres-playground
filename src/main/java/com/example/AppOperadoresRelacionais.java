package com.example;

public class AppOperadoresRelacionais {
    public static void main(String[] args) {
        var cliente1= new Cliente();
        cliente1.setAnoNascimento(2001);

        var cliente2= new Cliente();
        cliente2.setAnoNascimento(1980);

        boolean clienteMaisJovem = cliente1.getAnoNascimento() > cliente2.getAnoNascimento();
        boolean clienteMaisVelho = cliente1.getAnoNascimento() < cliente2.getAnoNascimento();

        if (clienteMaisJovem) {
            System.out.println("Cliente 1 é mais velho que cliente 2");
        } else if (clienteMaisVelho) {
            System.out.println("Cliente 2 é mais velho que cliente 1");
        } else {
            System.out.println("Clientes tem a mesma idade");
        }
    }
}
