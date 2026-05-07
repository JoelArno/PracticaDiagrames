import java.util.Date;

/**
 * Representa una targeta de crèdit vinculada a un compte corrent.
 * @author Joel
 */
public class TargetaCredit {
    private String tipus; // Visa, MasterCard, etc.
    private String numero;
    private String titular;
    private Date dataCaducitat;

    public TargetaCredit(String tipus, String numero, String titular, Date dataCaducitat) {
        this.tipus = tipus;
        this.numero = numero;
        this.titular = titular;
        this.dataCaducitat = dataCaducitat;
    }
}