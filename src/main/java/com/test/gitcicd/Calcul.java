package com.test.gitcicd;

public class Calcul {
    private int a ;
    private int b ;
    public Calcul(int a , int b){
        this.a = a;
        this.b = b ;
    }
    public int somme(){
        return this.a + this.b ;
    }
    public int soustractio(){
     return  a - b ;
    }

    public int multuplication() {
        return a * b ;
    }
    public String greatest(){
        if (a > b) return  "a" ;
        else return  "b" ;
    }
}
