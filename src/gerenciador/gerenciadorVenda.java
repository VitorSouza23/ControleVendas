/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import vo.Venda;

/**
 *
 * @author Cliente
 */
public class gerenciadorVenda {
    private static List<Venda> listaVenda = new ArrayList<>();
    private static DefaultListModel<String> listamostrar = new DefaultListModel<>();

    /**
     * @return the listaVenda
     */
    public static List<Venda> getListaVenda() {
        return listaVenda;
    }

    /**
     * @param aListaVenda the listaVenda to set
     */
    public static void setListaVenda(List<Venda> aListaVenda) {
        listaVenda = aListaVenda;
    }

    /**
     * @return the listamostrar
     */
    public static DefaultListModel<String> getListamostrar() {
        return listamostrar;
    }

    /**
     * @param aListamostrar the listamostrar to set
     */
    public static void setListamostrar(DefaultListModel<String> aListamostrar) {
        listamostrar = aListamostrar;
    }
    
    public static void inserir(String venda){
        listamostrar.addElement(venda);
    }
    public static void removeAll(){
        listamostrar.removeAllElements();
    }
    
    public static void inserir(Venda v){
        listaVenda.add(v);
    }
    
    
}
