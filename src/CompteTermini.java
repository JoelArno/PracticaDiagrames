/**
 * Compte d'estalvi a termini fix.
 * @author Joel
 */
public class CompteTermini extends Compte {
    private int numMesos;

    public CompteTermini(String num, java.util.Date data, double saldo, double intres, int mesos) {
        super(num, data, saldo, intres);
        this.numMesos = mesos;
    }
}