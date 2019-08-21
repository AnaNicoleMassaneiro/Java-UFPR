/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testetesteunitario;

/**
 *
 * @author Rafael
 */
public class Carro {
    private double velocidade;
    private int marcha;
    public final static double VELOCIDADE_MAX=200;
    public final static double MARCHAS=6;
    public final static double INCREMENTO=10;
    
    
    public Carro(double velocidade, int marcha){
        if(velocidade<0)
            throw new RuntimeException("Velocidade negativa não permitida.");
        if(velocidade>VELOCIDADE_MAX)
            throw new RuntimeException("Não é permitido velocidade maior do que 200km/h.");
        if(marcha<0)
            throw new RuntimeException("Marcha negativa não permitida.");
        if(marcha>MARCHAS)
            throw new RuntimeException("O carro tem somente 6 marchas.");
        this.velocidade=velocidade;
        this.marcha=marcha;
    }       
    public Carro(){
    }
    public void acelerar() {
        if((this.velocidade+10)>VELOCIDADE_MAX)
            this.velocidade = VELOCIDADE_MAX;
        else
            this.velocidade += INCREMENTO;
        
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void frear() {
        if((velocidade-10)<0)
            velocidade = 0;
        else
            velocidade -= INCREMENTO;        
    }

    public void aumentarMarcha() {
        marcha++;
    }

    public double getMarcha() {
        return marcha;
    }

    public void diminuirMarcha() {
        if(marcha-1>=0)
            marcha--;
    }
    
    
    
    
    
    
}
