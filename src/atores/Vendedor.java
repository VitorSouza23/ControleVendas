/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atores;

/**
 *
 * @author Cliente
 */
public class Vendedor extends Pessoa{
    private int matricula;
    private double salalario;

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the salalario
     */
    public double getSalalario() {
        return salalario;
    }

    /**
     * @param salalario the salalario to set
     */
    public void setSalalario(double salalario) {
        this.salalario = salalario;
    }
}
