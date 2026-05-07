import java.util.ArrayList;
import java.util.List;

/**
 * Compte corrent que pot tenir targetes i altres productes d'inversió vinculats.
 * @author Joel
 */
public class CompteCorrent extends Compte {
    private List<TargetaCredit> targetes;
    private List<Producte> productesAssociats;

    public CompteCorrent(String numCompte, java.util.Date data, double saldo, double interes) {
        super(numCompte, data, saldo, interes);
        this.targetes = new ArrayList<>();
        this.productesAssociats = new ArrayList<>();
    }

    /**
     * Afegeix una targeta de crèdit al compte.
     * @param targeta La targeta a associar.
     */
    public void afegirTargeta(TargetaCredit targeta) {
        this.targetes.add(targeta);
    }
}