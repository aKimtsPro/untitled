package exo.abstrakt;

public abstract class Vehicule {

    private String marque;
    private String modele;

    public Vehicule(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
    }

    public abstract void seDeplacer();

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }
}
