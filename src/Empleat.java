/**
 * Representa un empleat del banc. Hereta de Persona i està vinculat a una sucursal.
 * @author Joel
 */
public class Empleat extends Persona {
    private Sucursal sucursal;

    public Empleat(String dni, String nom, String adreca, String telefon, Sucursal sucursal) {
        super(dni, nom, adreca, telefon);
        this.sucursal = sucursal;
    }

    /**
     * Retorna la sucursal on treballa l'empleat.
     * @return L'objecte Sucursal.
     */
    public Sucursal getSucursal() {
        return sucursal;
    }
}