/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.edd;

/**
 *
 * @author Cabrera
 */
public class Conjunto {
    private String loQueSea;

    public Conjunto() {
    }

    public Conjunto(String loQueSea) {
        this.loQueSea = loQueSea;
    }

    public String getLoQueSea() {
        return loQueSea;
    }

    public void setLoQueSea(String loQueSea) {
        this.loQueSea = loQueSea;
    }

    @Override
    public String toString() {
        return "Conjunto{" + "loQueSea=" + loQueSea + '}';
    }
    
}
