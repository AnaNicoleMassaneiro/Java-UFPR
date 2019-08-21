/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import org.junit.Test;
import testetesteunitario.Carro;

/**
 *
 * @author Rafael
 */
public class TesteParaAutomovel {
    
    public TesteParaAutomovel() {
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testarAceleracao() {
         Carro carro = new Carro();
         carro.acelerar();
         
         assertEquals(10, carro.getVelocidade(),0);
         
     }
     
    @Test
     public void testarAceleracao2Vezes() {
         Carro carro = new Carro();
         carro.acelerar();
         carro.acelerar();
         
         assertEquals(20, carro.getVelocidade(),0);
         
     }
     
     @Test
     public void testarFreio() {
         Carro carro = new Carro();
         carro.acelerar();
         carro.frear();
         
         assertEquals(0, carro.getVelocidade(),0);
         
     }
     
     @Test
     public void testarVelocidadeMaxima() {
         Carro carro = new Carro();
         for(int i=0; i<21;i++)
            carro.acelerar();
      
         assertEquals(200, carro.getVelocidade(),0);
         
     }
     
     @Test
     public void testarVelocidadeMinima() {
         Carro carro = new Carro();
         for(int i=0; i<21;i++)
            carro.frear();
      
         assertEquals(0, carro.getVelocidade(),0);
         
     }  
     
     @Test
     public void testarAumentarMarcha() {
         Carro carro = new Carro();
         carro.aumentarMarcha();
      
         assertEquals(1, carro.getMarcha(),0);
         
     }  
     
     @Test
     public void testarDiminuirMarcha() {
         Carro carro = new Carro();
         carro.aumentarMarcha();
         carro.diminuirMarcha();
      
         assertEquals(0, carro.getMarcha(),0);
         
     } 
     
     @Test
     public void testarPontoMorto() {
         Carro carro = new Carro();
         carro.diminuirMarcha();
         carro.diminuirMarcha();
      
         assertEquals(0, carro.getMarcha(),0);
         
     } 
     @Test
     public void testarCarroAndando() {
         Carro carro = new Carro(50,3);
      
         assertEquals(50, carro.getVelocidade(),0);
         assertEquals(3, carro.getMarcha(),3);
     } 
     
     @Test
     public void testarCarroAndandoVelocidadeNegativa() {
         try{
            Carro carro = new Carro(-50,3);
            fail("Deveria ter levantado a exceção!!!");
         }
         catch(Exception ex){
             assertEquals("Velocidade negativa não permitida.",ex.getMessage());
         }
         
     }

}
