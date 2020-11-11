/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

/**
 *
 * @author Cliente
 */
public class Varejo extends Venda{
    private static double taxaAumento = 10;

    /**
     * @return the taxaAumento
     */
    public static double getTaxaAumento() {
        return taxaAumento;
    }

    /**
     * @param aTaxaAumento the taxaAumento to set
     */
    public static void setTaxaAumento(double aTaxaAumento) {
        taxaAumento = aTaxaAumento;
    }
    
    @Override
    public double calcularVenda(){
        if(getQuantidade() > 10){
        return (getValorBase() + (Varejo.taxaAumento/100) * getValorBase()) * getQuantidade();
        }
        
        return 0;
        
        }
}
