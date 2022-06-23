package poo.polymorphisme;

public class Plante extends Vivant {

    private String couleur;

    public Plante(String couleur) {
        this.couleur = couleur;
    }

    // Plante - grandir - int // Polymosphisme d'héritage - spécialisation, redefinition
    @Override
    public void grandir(int cm){
        System.out.println("La plante grandit de "+ cm + " cm");
    }


    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
