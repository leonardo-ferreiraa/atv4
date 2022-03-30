/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.atv4;

/**
 *
 * @Leonardo Ferreira 11211100857@alunos.umc.br
 */
public class Atv4 {

    public static void main(String[] args) {
        Contribuinte C1 = new Contribuinte("leonardo", "", "509.424.568.93", 1300.00f, 0);
        C1.calcirpf();
        C1.imprimir();
        Contribuinte C2 = new Contribuinte("marcos", "", "475.683.975.54", 2150.00f, 0);
        C2.calcirpf();
        C2.imprimir();
        Contribuinte C3 = new Contribuinte("joão", "", "729.610.573.72", 3500.00f, 0);
        C3.calcirpf();
        C3.imprimir();
        Contribuinte C4 = new Contribuinte("lucas", "", "768.554.353.07", 5600.00f, 0);
        C4.calcirpf();
        C4.imprimir();
    }
}
