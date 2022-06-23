package poo.interf.hvm;

import java.util.Random;

public class Orc extends Monstre implements Or {

    public Orc(String nom) {
        super(nom);
    }

    @Override
    public int recupererOr() {
        return new Random().nextInt(4)+1;
    }
}
