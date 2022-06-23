package exo.generics;

public class Podium<S extends Sportif> {

    private final S or;
    private final S argent;
    private final S bronze;

    public Podium(S or, S argent, S bronze) {
        this.or = or;
        this.argent = argent;
        this.bronze = bronze;
    }

    @Override
    public String toString() {
        return "Podium{" +
                "or=" + or +
                ", argent=" + argent +
                ", bronze=" + bronze +
                '}';
    }

    public S getOr() {
        return or;
    }

    public S getArgent() {
        return argent;
    }

    public S getBronze() {
        return bronze;
    }
}
