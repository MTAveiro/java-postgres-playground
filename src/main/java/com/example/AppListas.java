package com.example;


import java.util.LinkedList;
import java.util.List;

public class AppListas {
    public static void main(String[] args) {
        List<Cliente> listaClientes = new LinkedList<>();
        var cliente1 = new Cliente();
        cliente1.setNome("Manuel");

        var cliente2 = new Cliente();
        cliente2.setNome("Manuela");
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);

        listaClientes.remove(0);
        listaClientes.remove(cliente1);
        int i = listaClientes.size()-1;
        listaClientes.remove(i);

        
        for (Cliente cliente : listaClientes) {
            System.err.println(cliente);
        }

        

    }
}
