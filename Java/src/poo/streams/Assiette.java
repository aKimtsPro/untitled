package poo.streams;

public class Assiette implements Comparable<Assiette> {

    private final String marque;
    private final int diametre;
    private final String couleur;

    public Assiette(String marque, int diametre, String couleur) {
        this.marque = marque;
        this.diametre = diametre;
        this.couleur = couleur;
    }

    public String getMarque() {
        return marque;
    }

    public int getDiametre() {
        return diametre;
    }

    public String getCouleur() {
        return couleur;
    }

    @Override
    public String toString() {
        return "Assiette{" +
                "marque='" + marque + '\'' +
                ", diametre=" + diametre +
                ", couleur='" + couleur + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        System.out.println("passage par equals");

        if( !(obj instanceof Assiette) )
            return false;

        return this.getDiametre() == ((Assiette)obj).getDiametre();
    }

    @Override
    public int compareTo(Assiette o) {
        return this.getDiametre() - o.getDiametre();
    }
}
