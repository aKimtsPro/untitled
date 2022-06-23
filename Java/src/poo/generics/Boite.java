package poo.generics;

import exo.polymorphisme.Personne;

import java.util.ArrayList;
import java.util.Arrays;

public class Boite<C extends Lancable> {

    private final ArrayList<C> contenuList;
    private final Object[] contenu;
    private final int capacite;
    private int nbrContenu = 0;

    public Boite(int capacite) {
        this.capacite = capacite;
        contenu = new Object[capacite];
        contenuList = new ArrayList<>();
    }

    public int ajouter(C toAdd){
        if( nbrContenu < capacite ){
            contenu[nbrContenu] = toAdd;
            nbrContenu++;
            return nbrContenu - 1;
        }
        return -1;
    }

    public C retirer(int index){

        if(index >= capacite || index < 0)
            throw new IllegalArgumentException();

        C o = (C)contenu[index];
        contenu[index] = null;

        for (int i = index+1; i < contenu.length && contenu[i] != null; i++) {
            contenu[i-1] = contenu [i];
            contenu[i] = null;
        }

        nbrContenu--;

        return o;
    }

    public int indexOf( C o){
        for (int i = 0; i < nbrContenu; i++) {
            if( contenu[i] == o ){
                return i;
            }
        }
        return -1;
    }

    public int lancerTout(){
        int sum = 0;

        for (int i = 0; i < nbrContenu; i++) {
            sum += retirer(i).lancer();
        }

        return sum;
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
