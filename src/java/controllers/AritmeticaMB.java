/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author ander
 */
@ManagedBean(name = "ariMB")
@RequestScoped
public class AritmeticaMB {

    //Atributos:
    private int n1;
    private int n2;
    
    public AritmeticaMB() {
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    //Método que realiza la suma:
    public String sumar(){
        int res = n1 + n2;
        return n1 + " + " + n2 + " = " + res;
    }
    
}
