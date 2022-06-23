package poo.generics;

import java.util.Arrays;

public class BoiteABiscuit {

    private final Biscuit[] contenu;
    private final int capacite;
    private int nbrContenu = 0;

    public BoiteABiscuit(int capacite) {
        this.capacite = capacite;
        contenu = new Biscuit[capacite];
    }

    public int ajouter(Biscuit toAdd){
        if( nbrContenu < capacite ){
            contenu[nbrContenu] = toAdd;
            nbrContenu++;
            return nbrContenu - 1;
        }
        return -1;
    }

    public Biscuit retirer(int index){

        if(index >= capacite || index < 0)
            throw new IllegalArgumentException();

        Biscuit o = contenu[index];
        contenu[index] = null;

        for (int i = index+1; i < contenu.length && contenu[i] != null; i++) {
            contenu[i-1] = contenu [i];
            contenu[i] = null;
        }

        nbrContenu--;

        return o;
    }

    public int indexOf(Biscuit o){
        for (int i = 0; i < nbrContenu; i++) {
            if( contenu[i] == o ){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Boite{" +
                "\n\tcontenu=" + Arrays.toString(contenu) +
                "\n\t, capacite=" + capacite +
                "\n\t, nbrContenu=" + nbrContenu +
                '}';
    }

    public int getCapacite() {
        return capacite;
    }

    public int getNbrContenu() {
        return nbrContenu;
    }
}
