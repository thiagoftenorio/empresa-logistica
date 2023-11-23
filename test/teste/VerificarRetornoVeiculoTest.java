/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package teste;

import model.Veiculo;
import org.junit.Test;
import service.VerificarRetornoVeiculo;
import static org.junit.Assert.*;

/**
 *
 * @author DESKTOP
 */
public class VerificarRetornoVeiculoTest {
    
    public VerificarRetornoVeiculoTest() {
    }

    /**
     * Test of retornarTipo method, of class VerificarRetornoVeiculo.
     */
    @Test
    public void testRetornarTipo001() {
        System.out.println("retornarTipo");
        Veiculo veiculo = new Veiculo();
        veiculo.setTipo("van");
        String expResult = "van";
        String result = VerificarRetornoVeiculo.retornarTipo(veiculo);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRetornarTipo002() {
        System.out.println("retornarTipo");
        Veiculo veiculo = new Veiculo();
        veiculo.setTipo("van");
        String expResult = veiculo.getTipo();
        String result = VerificarRetornoVeiculo.retornarTipo(veiculo);
        assertEquals(expResult, result);
    }

    /**
     * Test of retornarCapacidadeCarga method, of class VerificarRetornoVeiculo.
     */
    @Test
    public void testRetornarCapacidadeCarga001() {
        System.out.println("retornarCapacidadeCarga");
        Veiculo veiculo = new Veiculo();
        veiculo.setCapacidadeCarga(10);
        int expResult = 10;
        int result = VerificarRetornoVeiculo.retornarCapacidadeCarga(veiculo);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRetornarCapacidadeCarga002() {
        System.out.println("retornarCapacidadeCarga");
        Veiculo veiculo = new Veiculo();
        veiculo.setCapacidadeCarga(10);
        int expResult = veiculo.getCapacidadeCarga();
        int result = VerificarRetornoVeiculo.retornarCapacidadeCarga(veiculo);
        assertEquals(expResult, result);
    }

    /**
     * Test of retornarDisponibilidade method, of class VerificarRetornoVeiculo.
     */
    @Test
    public void testRetornarDisponibilidade001() {
        System.out.println("retornarDisponibilidade");
        Veiculo veiculo = new Veiculo();
        boolean expResult = true;
        boolean result = VerificarRetornoVeiculo.retornarDisponibilidade(veiculo);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRetornarDisponibilidade002() {
        System.out.println("retornarDisponibilidade");
        Veiculo veiculo = new Veiculo();
        boolean expResult = veiculo.getDisponibilidade();
        boolean result = VerificarRetornoVeiculo.retornarDisponibilidade(veiculo);
        assertEquals(expResult, result);
    }
    
}
