package exo.io.ecriture.model;

import exo.io.ecriture.exception.InvalidFormatException;

public class JeuDeSociete {

    private int id;
    private String nom;
    private String editeur;
    private int ageMin;
    private int nbrJoueurMin;
    private int nbrJoueurMax;

    public JeuDeSociete() {
    }

    public JeuDeSociete(int id, String nom, String editeur, int ageMin, int nbrJoueurMin, int nbrJoueurMax) {
        this.id = id;
        this.nom = nom;
        this.editeur = editeur;
        this.ageMin = ageMin;
        this.nbrJoueurMin = nbrJoueurMin;
        this.nbrJoueurMax = nbrJoueurMax;
    }

    public String generateCSVLine(){
        return String.join(",",
                Integer.toString(id),
                nom,
                editeur,
                Integer.toString(ageMin),
                Integer.toString(nbrJoueurMax),
                Integer.toString(nbrJoueurMin)
        );
    }

    public static JeuDeSociete generateFromCSVLine(String line){
        if( line == null )
            throw new IllegalArgumentException("line doit être non-null");

        String[] values = line.split(",");
        if( values.length != 6 )
            throw new InvalidFormatException();

        try {
            JeuDeSociete jds = new JeuDeSociete();

            jds.setId( Integer.parseInt(values[0]) );
            jds.setNom( values[1] );
            jds.setEditeur( values[2] );
            jds.setAgeMin( Integer.parseInt(values[3]) );
            jds.setNbrJoueurMax( Integer.parseInt(values[4]) );
            jds.setNbrJoueurMin( Integer.parseInt(values[5]) );

            return jds;
        }
        catch(NumberFormatException ex){
            throw new InvalidFormatException();
        }

    }

    @Override
    public String toString() {
        return "JeuDeSociete{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", editeur='" + editeur + '\'' +
                ", ageMin=" + ageMin +
                ", nbrJoueurMin=" + nbrJoueurMin +
                ", nbrJoueurMax=" + nbrJoueurMax +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public int getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(int ageMin) {
        this.ageMin = ageMin;
    }

    public int getNbrJoueurMin() {
        return nbrJoueurMin;
    }

    public void setNbrJoueurMin(int nbrJoueurMin) {
        this.nbrJoueurMin = nbrJoueurMin;
    }

    public int getNbrJoueurMax() {
        return nbrJoueurMax;
    }

    public void setNbrJoueurMax(int nbrJoueurMax) {
        this.nbrJoueurMax = nbrJoueurMax;
    }
}
