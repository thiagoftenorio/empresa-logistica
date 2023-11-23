/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package teste;

import model.Veiculo;
import model.Viagem;
import model.Entrega;
import org.junit.Test;
import service.VerificarLimiteVeiculo;
import static org.junit.Assert.*;

/**
 *
 * @author DESKTOP
 */
public class VerificarLimiteVeiculoTest {
    
    public VerificarLimiteVeiculoTest() {
    }

    /**
     * Test of retornarLimite method, of class VerificarLimiteVeiculo.
     */
    @Test
    public void testRetornarLimite001() {
        System.out.println("retornarLimite");
        Veiculo veiculo = new Veiculo();
        veiculo.setCapacidadeCarga(5);
        Viagem viagem = new Viagem();
        viagem.getListaEntrega().add(new Entrega());
        viagem.getListaEntrega().add(new Entrega());
        viagem.getListaEntrega().add(new Entrega());
        viagem.getListaEntrega().add(new Entrega());
        viagem.getListaEntrega().add(new Entrega());
        boolean expResult = true;
        boolean result = VerificarLimiteVeiculo.retornarLimite(veiculo, viagem);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRetornarLimite002() {
        System.out.println("retornarLimite");
        Veiculo veiculo = new Veiculo();
        veiculo.setCapacidadeCarga(5);
        Viagem viagem = new Viagem();
        boolean expResult = true;
        boolean result = VerificarLimiteVeiculo.retornarLimite(veiculo, viagem);
        assertEquals(expResult, result);
    }
}
