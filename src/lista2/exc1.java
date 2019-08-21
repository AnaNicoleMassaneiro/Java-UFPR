/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

/**
 *
 * @author ana
 */
public class exc1 extends forma {

    private double raio;
   
    public exc1 (double raio) throws Exception {
        if(raio >=0) {
            this.raio = raio;
        }
        else {
            throw new RuntimeException("O raio não pode ser negativo!!");
        }
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double getArea() {
        return (Math.PI*(Math.pow(this.raio,2)));
    }

}
