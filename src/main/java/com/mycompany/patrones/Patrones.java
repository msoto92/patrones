/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.patrones;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Patrones {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite entero:");
        int e = Integer.parseInt(sc.nextLine());
        
        Caja<Integer> c = new Caja(e);
        
        System.out.println("Digite real:");
        double d = Double.parseDouble(sc.nextLine());
        
        Caja<Double> c2 = new Caja(d);
        
        System.out.println("Digite cadena:");
        String cd = sc.nextLine();
        
        Caja<String> c3 = new Caja(cd);
        
        System.out.println(c.decorar());
        System.out.println(c2.decorar());
        System.out.print(c3.decorar2());
        
        // Creado generico
        
        ValorJson<String,String> v = new ValorJson<String,String>();
        v.setLlave("nombre");
        v.setValor("Miguel");
    }
}
