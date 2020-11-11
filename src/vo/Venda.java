/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

import atores.Comprador;
import atores.Vendedor;
import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 *
 * @author Cliente
 */
public class Venda implements Serializable{
    private GregorianCalendar data;
    private String produto;
    private double valorBase;
    private int quantidade;
    private Vendedor vendedor;
    private Comprador comprador;

    /**
     * @return the data
     */
    public GregorianCalendar getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(GregorianCalendar data) {
        this.data = data;
    }

    /**
     * @return the produto
     */
    public String getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(String produto) {
        this.produto = produto;
    }

    /**
     * @return the valorBase
     */
    public double getValorBase() {
        return valorBase;
    }

    /**
     * @param valorBase the valorBase to set
     */
    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the vendedor
     */
    public Vendedor getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the comprador
     */
    public Comprador getComprador() {
        return comprador;
    }

    /**
     * @param comprador the comprador to set
     */
    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }
    
    public double calcularVenda(){
        return this.valorBase * this.quantidade;
    }
}
