import java.util.ArrayList;
import java.util.List;

/**
 * Representa una cartera que agrupa diferents títols o valors.
 * @author Joel
 */
public class CarteraValors extends Producte {
    private List<Valor> valors;

    public CarteraValors() {
        this.valors = new ArrayList<>();
    }

    /**
     * Afegeix un títol o valor a la cartera.
     * @param valor L'objecte Valor a incloure.
     */
    public void afegirValor(Valor valor) {
        this.valors.add(valor);
    }
}