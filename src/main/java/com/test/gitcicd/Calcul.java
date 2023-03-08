package com.test.gitcicd;
/**
 * class calcul with 3 methods
 */
public class Calcul {
    /**
     * add attributes
     */
    private int a ;
    private int b ;
    /**
     * initialize our variables
     */
    public Calcul(int a , int b){
        this.a = a;
        this.b = b ;
    }
    /**
     * method somme add to variables
     */
    public int somme(){
        return this.a + this.b ;
    }
    /**
     * methode soustraction
     */
    public int soustractio(){
     return  a - b ;
    }
    /**
     * methode multiplication
     */
    public int multuplication() {
        return a * b ;
    }
    /**
     * methode that define the greatest val
     */
    public String greatest(){
        if (a > b) return  "a" ;
        else return  "b" ;
    }
}
