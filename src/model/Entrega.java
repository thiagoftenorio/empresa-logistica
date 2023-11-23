/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DESKTOP
 */
public class Entrega {
    
    private ClienteEntregador clienteEntregador;
    private Endereco endereco;
    private String mercadoria;
    
    public Entrega(ClienteEntregador clienteEntregador, Endereco endereco, String mercadoria) {
        this.clienteEntregador = clienteEntregador;
        this.endereco = endereco;
        this.mercadoria = mercadoria;
    }
    
    public Entrega() {
        
    }

    public ClienteEntregador getClienteEntregador() {
        return clienteEntregador;
    }

    public void setClienteEntregador(ClienteEntregador clienteEntregador) {
        this.clienteEntregador = clienteEntregador;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getMercadoria() {
        return mercadoria;
    }

    public void setMercadoria(String mercadoria) {
        this.mercadoria = mercadoria;
    }
    
    
}
