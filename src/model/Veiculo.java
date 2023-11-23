/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DESKTOP
 */
public class Veiculo {
    private String tipo;
    private int capacidadeCarga;
    private boolean disponibilidade;

    public Veiculo(String tipo, int capacidadeCarga, boolean disponibilidade) {
        this.tipo = tipo;
        this.capacidadeCarga = capacidadeCarga;
        this.disponibilidade = disponibilidade;
    }
    
    public Veiculo() {
        disponibilidade = true;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
    
}
