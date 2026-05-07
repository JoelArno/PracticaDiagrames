/**
 * Representa un títol o acció individual dins d'una cartera.
 * @author Joel
 */
public class Valor {
    private String nom;
    private int numTitols;
    private double preuCotitzacio;

    public Valor(String nom, int numTitols, double preuCotitzacio) {
        this.nom = nom;
        this.numTitols = numTitols;
        this.preuCotitzacio = preuCotitzacio;
    }
}