package com.example;

public class Cliente{
    private String cpf;
    private String nome;
    private double renda;
    private char sexo;
    private int anoNascimento;
    private boolean especial;

    public Cliente(){
            double aleatorio = Math.random();
            if (aleatorio > 0.5) {
                especial = true;
            }
    }

   public Cliente(double renda, char sexo){
        this();
        setRenda(renda);
        setSexo(sexo);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase().trim();
    }

   public boolean isEspecial() {
    return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        if (renda>=0) {
            this.renda = renda;
        }else{
            System.out.println("renda deve ser maior que zero");

        }
        
    }

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F') {
            this.sexo = sexo;
        } else {
            System.out.println("Sexo deve ser M ou F");
        }
        
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        if (anoNascimento>=1900) {
            this.anoNascimento = anoNascimento;
        }else{
            System.out.println("Ano de nascimento deve ser maior que 1900");

        }
        this.anoNascimento = anoNascimento;
    }
}