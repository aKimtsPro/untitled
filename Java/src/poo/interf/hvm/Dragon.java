package poo.interf.hvm;

public class Dragon extends Monstre implements Cuir, Or  {

    private final int or = 4;
    private final int cuir = 2;

    public Dragon(String nom) {
        super(nom);
    }

    public int getOr() {
        return or;
    }

    public int getCuir() {
        return cuir;
    }

    @Override
    public int recupererOr() {
        return getOr();
    }

    @Override
    public int recupererCuir() {
        return getCuir();
    }
}
