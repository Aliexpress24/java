/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner scanner = new Scanner(System.in);
        int idade;

    System.out.println("------Programa de comparação maior idade");
    System.out.println("DIgite a idade");
    idade=scanner.nextInt();
    
    //Processamento
    if(idade>=18){
        System.out.println("aluno maior de idade");
        
    }else{
        System.out.println ("aluno menor de idade");
    }
    }
    }
    
}
