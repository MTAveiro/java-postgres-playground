package com.example;

import java.util.Scanner;

public class AppScanner {
    public static void main (String[] args){
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome:");
        cliente.setNome(scanner.nextLine());
        System.out.println("Digite o CPF:");
        cliente.setCpf(scanner.nextLine());

        System.out.println("Digite a renda:");
        cliente.setRenda(scanner.nextDouble());

        scanner.nextLine();
        System.out.println("Digite o sexo:");
        String sexo = scanner.nextLine();
        cliente.setSexo(sexo.charAt(0));



        System.out.println(cliente.getRenda());
        System.out.println(cliente.getSexo());
        System.out.println(cliente.getAnoNascimento());
        System.out.println();

        

    }
}

