/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DESKTOP
 */
public class ClienteEntregador extends Cliente {
    
    private boolean disponibilidade;
    
    public ClienteEntregador(String nome, int idade, Endereco endereco, String telefone, String email, boolean disponibilidade) {
        super(nome, idade, endereco, telefone, email);
        this.disponibilidade = disponibilidade;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
    
}
