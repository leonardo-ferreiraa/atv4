/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv4;

/**
 *
 * @Leonardo Ferreira 11211100857@alunos.umc.br
 */
public class Contribuinte {

    private String nome;
    private String cpf;
    private String perc;
    float salario;
    float desc_irpf;

    public Contribuinte(String nome, String cpf, String perc, float salario, float desc_irpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.perc = perc;
        this.salario = salario;
        this.desc_irpf = desc_irpf;

    }

    public float calcularSalarioLiquido() {
        return salario = salario - desc_irpf;
    }

    public void calcirpf() {

        if (salario <= 1903.38) {
            desc_irpf = salario * 0;
            perc = "0%";
        } else if (salario >= 1903.38 && salario <= 2826.65) {
            desc_irpf = salario * 0.0075f;
            perc = "7.5%";
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            desc_irpf = salario * 0.015f;
            perc = "15%";
        } else if (salario >= 3751.06 && salario < 4664.68) {
            desc_irpf = salario * 0.0225f;
            perc = "22.5%";
        } else {
            desc_irpf = salario * 0.0275f;
            perc = "27.5%";
        }
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Valor descontad: " + desc_irpf);
        System.out.println("Porcentagem do desconto: " + perc);
        System.out.println("Salário liquido: " + calcularSalarioLiquido());
        System.out.println("---------------------------------------------");
    }

    public String GetNome() {
        return nome;
    }

    public String GetCpf() {
        return cpf;
    }

    public double GetSalario() {
        return salario;
    }

    public double Getdesc_irpf() {
        return desc_irpf;
    }

}
