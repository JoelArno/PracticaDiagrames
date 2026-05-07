/**
 * Representa un client del banc. Hereta de Persona.
 * @author Joel
 */
public class Client extends Persona {

    /**
     * Constructor per crear un client amb les dades bàsiques.
     */
    public Client(String dni, String nom, String adreca, String telefon) {
        super(dni, nom, adreca, telefon);
    }
}