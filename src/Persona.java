/**
 * Representa una persona genèrica en el sistema de gestió bancària.
 * Aquesta classe serveix com a superclasse per a Clients i Empleats.
 * @author Joel
 * @version 1.0
 */
public abstract class Persona {
    /** El DNI de la persona */
    protected String dni;
    /** El nom complet de la persona */
    protected String nom;
    /** L'adreça de residència */
    protected String adreca;
    /** El número de telèfon de contacte */
    protected String telefon;

    /**
     * Constructor per inicialitzar els atributs comuns de qualsevol persona.
     * * @param dni DNI identificatiu.
     * @param nom Nom i cognoms.
     * @param adreca Domicili actual.
     * @param telefon Telèfon de contacte.
     */
    public Persona(String dni, String nom, String adreca, String telefon) {
        this.dni = dni;
        this.nom = nom;
        this.adreca = adreca;
        this.telefon = telefon;
    }

    /**
     * Retorna el DNI de la persona.
     * @return String amb el DNI.
     */
    public String getDni() {
        return dni;
    }

    // Aquí anirien la resta de getters i setters...
}