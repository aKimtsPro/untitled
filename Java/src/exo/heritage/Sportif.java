package exo.heritage;

public class Sportif {

    private String replique;
    private String nom;

    public Sportif(String replique, String nom) {
        this.replique = replique;
        this.nom = nom;
    }

    public void celebrerVictoire() {
        System.out.println( nom + " dit : '" + replique + "'" );
    }

    public String getReplique() {
        return replique;
    }
    public void setReplique(String replique) {
        this.replique = replique;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
}
