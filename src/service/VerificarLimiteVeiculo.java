/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Veiculo;
import model.Viagem;

/**
 *
 * @author DESKTOP
 */
public class VerificarLimiteVeiculo {
    
    public static boolean retornarLimite(Veiculo veiculo, Viagem viagem) {
        return viagem.getListaEntrega().size() <= veiculo.getCapacidadeCarga();
    }
    
}
