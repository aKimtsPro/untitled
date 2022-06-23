package exo.course;

public class Voiture {

    private final String nomConstructeur;
    private final int vitesseMoyenne;
    private String nomPilote;

    public Voiture(String nomConstructeur, int vitesseMoyenne, String nomPilote) {
        this.nomConstructeur = nomConstructeur;
        this.vitesseMoyenne = vitesseMoyenne;
        this.nomPilote = nomPilote;
    }

    public String getNomConstructeur() {
        return nomConstructeur;
    }

    public int getVitesseMoyenne() {
        return vitesseMoyenne;
    }

    public String getNomPilote() {
        return nomPilote;
    }

    public void setNomPilote(String nomPilote) {
        this.nomPilote = nomPilote;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "nomConstructeur='" + nomConstructeur + '\'' +
                ", vitesseMoyenne=" + vitesseMoyenne +
                ", nomPilote='" + nomPilote + '\'' +
                '}';
    }
}
