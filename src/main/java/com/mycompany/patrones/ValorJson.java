/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrones;

/**
 *
 * @author Miguel
 */
public class ValorJson<L,V>
{
    private L llave;
    private V valor;

    public ValorJson()
    {
        
    }
    public ValorJson(L llave, V valor) {
        this.llave = llave;
        this.valor = valor;
    }

    public void setLlave(L llave) {
        this.llave = llave;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    public L getLlave() {
        return llave;
    }

    public V getValor() {
        return valor;
    }
    
    public V devolverValor(L llave)
    {
        if(llave == this.llave)
        {
            return this.valor;
        }
        else
        {
            return null;
        }
    }
}
