/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DESKTOP
 */
public class ClienteReceptor extends Cliente {

    private String mercadoria;
    
    public ClienteReceptor(String nome, int idade, Endereco endereco, String telefone, String email, String mercadoria) {
        super(nome, idade, endereco, telefone, email);
    }
    
    public String getMercadoria() {
        return mercadoria;
    }
    
    public void setMercadoria(String mercadoria) {
        this.mercadoria = mercadoria;
    }
}
