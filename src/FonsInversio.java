import java.util.Date;

/**
 * Representa un producte de tipus fons d'inversió.
 * @author Joel
 */
public class FonsInversio extends Producte {
    private String nom;
    private double importFons;
    private double rendibilitat;
    private Date dataObertura;
    private Date dataVenciment;

    public FonsInversio(String nom, double importFons, double rendibilitat, Date obertura, Date venciment) {
        this.nom = nom;
        this.importFons = importFons;
        this.rendibilitat = rendibilitat;
        this.dataObertura = obertura;
        this.dataVenciment = venciment;
    }
}