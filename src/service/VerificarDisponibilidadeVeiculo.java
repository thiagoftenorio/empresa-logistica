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
public class VerificarDisponibilidadeVeiculo {
    
    public static boolean retornarDisponibilidade(Veiculo veiculo) {
        return veiculo.getDisponibilidade();
    }
}
