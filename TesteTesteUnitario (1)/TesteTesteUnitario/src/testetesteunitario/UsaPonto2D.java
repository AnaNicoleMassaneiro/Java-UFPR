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
public class UsaPonto2D {
    
    public static void main(String args[]){
        Ponto2D p1 = new Ponto2D();
        Ponto2D p2 = new Ponto2D(5,5);
        double dist = p1.distancia(p2);
        System.out.println("Distancia = "+dist);
        
        
        double dist2 = Ponto2D.distancia(0, 0, 5, 5);
        
        double dist3 = Ponto2D.distancia(p1,p2);
        
        System.out.println("Distancia2= "+dist2);
        
    }
    
}
