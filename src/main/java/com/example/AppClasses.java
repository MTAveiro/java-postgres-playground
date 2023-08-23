package com.example;

public class AppClasses {
    public static void main (String[] args){
        Cliente cliente = new Cliente();
        cliente.setRenda(1500);
        cliente.setSexo('F');
        cliente.setAnoNascimento(1980);
        System.out.println(cliente.getRenda());
        System.out.println(cliente.getSexo());
        System.out.println(cliente.getAnoNascimento());
        System.out.println();
        Cliente cliente2 = new Cliente();
        cliente2.setRenda(2500);
        cliente2.setSexo('F');
        cliente2.setAnoNascimento(1970);
        System.out.println(cliente2.getRenda());
        System.out.println(cliente2.getSexo());
        System.out.println(cliente2.getAnoNascimento());
    }
}

