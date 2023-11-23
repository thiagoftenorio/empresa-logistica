/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Veiculo;
/**
 *
 * @author DESKTOP
 */
public class VerificarRetornoVeiculo {
    
    public static String retornarTipo(Veiculo veiculo) {
        return veiculo.getTipo();
    }
    
    public static int retornarCapacidadeCarga(Veiculo veiculo) {
            return veiculo.getCapacidadeCarga();
    }
    
    public static boolean retornarDisponibilidade(Veiculo veiculo) {
        return veiculo.getDisponibilidade();
    }
    
}
