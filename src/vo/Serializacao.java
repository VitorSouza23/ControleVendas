/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

import gerenciador.gerenciadorVenda;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/**
 *
 * @author Cliente
 */
public class Serializacao {
    public static void salvar() {
        try {
            FileOutputStream fo = new FileOutputStream("Venda.txt");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            
                oo.writeObject(gerenciadorVenda.getListaVenda());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void carregar() {
        try {
            FileInputStream fi = new FileInputStream("Venda.txt");
            ObjectInputStream oo = new ObjectInputStream(fi);
               gerenciadorVenda.setListaVenda((ArrayList<Venda>) oo.readObject());
            
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
