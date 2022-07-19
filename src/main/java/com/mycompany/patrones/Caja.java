/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrones;

/**
 *
 * @author Miguel
 */
public class Caja<T> 
{
    private T e;

    public Caja(T e) {
        this.e = e;
    }

    public T getE() {
        return e;
    }

    public void setE(T e) {
        this.e = e;
    }
    
    
    public String decorar()
    {        
        String  x = "";
        String eString = this.e + "";
        String lineaA = "";
        
        for (int i = 0; i < eString.length() + 2; i++) {
            lineaA = lineaA + "*";
        }
        
        x = lineaA + "\n" + "*" + this.e + "*\n" + lineaA;
        return x;                
    }
    
    public int decorar2()
    {
        Integer t;
        if(e instanceof  Integer)
        {
            t = (Integer) e;
            t = t + 2;        
        }
        else
        {
            t=0;
        }
        
        return t;
    }
    
    
}
