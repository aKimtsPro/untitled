package poo.interf.hvm;

public class Loup extends Monstre implements Cuir {

    private final int cuir = 2;

    public Loup(String nom) {
        super( nom );
    }

    public int getCuir() {
        return cuir;
    }

    @Override
    public int recupererCuir() {
        return getCuir();
    }
}
