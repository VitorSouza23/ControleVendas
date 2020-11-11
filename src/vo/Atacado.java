/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

/**
 *
 * @author Cliente
 */
public class Atacado extends Venda{
    private static double taxadesconto = 15;

    /**
     * @return the taxadesconto
     */
    public static double getTaxadesconto() {
        return taxadesconto;
    }

    /**
     * @param aTaxadesconto the taxadesconto to set
     */
    public static void setTaxadesconto(double aTaxadesconto) {
        taxadesconto = aTaxadesconto;
    }
    
    @Override
    public double calcularVenda(){
        if(getQuantidade() > 10){
        return (getValorBase() - (getValorBase() * (Atacado.taxadesconto/100))) * getQuantidade();
        }
        return 0;
    }
}
