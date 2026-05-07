import java.util.Date;

/**
 * Representa un compte bancari genèric.
 * @author Joel
 */
public abstract class Compte extends Producte {
    protected String numCompte;
    protected Date dataObertura;
    protected double saldo;
    protected double tipusInteres;

    public Compte(String numCompte, Date dataObertura, double saldo, double tipusInteres) {
        this.numCompte = numCompte;
        this.dataObertura = dataObertura;
        this.saldo = saldo;
        this.tipusInteres = tipusInteres;
    }

    /**
     * Permet ingressar diners al saldo actual.
     * @param quantitat Import a ingressar.
     */
    public void ingressar(double quantitat) {
        // Esquelet mètode
    }
}