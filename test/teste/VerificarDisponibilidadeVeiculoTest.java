/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package teste;

import model.Veiculo;
import org.junit.Test;
import service.VerificarDisponibilidadeVeiculo;
import static org.junit.Assert.*;

/**
 *
 * @author DESKTOP
 */
public class VerificarDisponibilidadeVeiculoTest {

    /**
     * Teste do método retornarDisponibilidade, da classe VerificarDisponibilidadeVeiculo.
     */
    @Test
    public void testRetornarDisponibilidade001() {
        System.out.println("retornarDisponibilidade");
        Veiculo veiculo = new Veiculo();
        boolean expResult = true;
        boolean result = VerificarDisponibilidadeVeiculo.retornarDisponibilidade(veiculo);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRetornarDisponibilidade002() {
        System.out.println("retornarDisponibilidade");
        Veiculo veiculo = new Veiculo();
        veiculo.setDisponibilidade(true);
        boolean expResult = true;
        boolean result = VerificarDisponibilidadeVeiculo.retornarDisponibilidade(veiculo);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRetornarDisponibilidade003() {
        System.out.println("retornarDisponibilidade");
        Veiculo veiculo = new Veiculo();
        veiculo.setDisponibilidade(false);
        boolean expResult = false;
        boolean result = VerificarDisponibilidadeVeiculo.retornarDisponibilidade(veiculo);
        assertEquals(expResult, result);
    }
    
}
