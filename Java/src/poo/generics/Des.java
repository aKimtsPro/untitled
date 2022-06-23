package poo.generics;

import java.util.Random;

public class Des implements Lancable {

    private final int nbrFace;

    public Des(int nbrFace) {
        this.nbrFace = nbrFace;
    }

    public int lancer(){
        return new Random().nextInt(nbrFace)+1;
    }

    public int getNbrFace() {
        return nbrFace;
    }
}
