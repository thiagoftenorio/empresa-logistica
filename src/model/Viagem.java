/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DESKTOP
 */
public class Viagem {
    
    private Veiculo veiculo;
    private List<Entrega> listaEntrega;
    
    public Viagem(List<Entrega> listaEntrega) {
        this.listaEntrega = listaEntrega;
    }
    
    public Viagem(Veiculo veiculo) {
        this.veiculo = veiculo;
        listaEntrega = new ArrayList<>();
    }
    
    public Viagem() {
        listaEntrega = new ArrayList<>();
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<Entrega> getListaEntrega() {
        return listaEntrega;
    }

    public void setListaEntrega(List<Entrega> listaEntrega) {
        this.listaEntrega = listaEntrega;
    }
}
