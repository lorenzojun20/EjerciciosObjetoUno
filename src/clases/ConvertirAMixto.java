/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Lorenzo
 */
public class ConvertirAMixto {
    private int numerador;
    private int denominador;
    private int mixto;
    
    public ConvertirAMixto(int numerador, int denominador, int mixto){
        this.numerador = numerador;
        this.denominador = denominador;
        this.mixto = mixto;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getMixto() {
        return mixto;
    }

    public void setMixto(int mixto) {
        this.mixto = mixto;
    }
    
    public ConvertirAMixto mixto(){
        int num, den, mix;
        ConvertirAMixto c;
        
        mix = this.numerador/this.denominador;
        num = this.numerador%this.denominador;
        den = this.denominador;
        
        c = new ConvertirAMixto(num, den, mix);
        return c;
        
    }
}
