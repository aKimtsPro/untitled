package exo.course;

import java.time.Duration;
import java.util.List;

public class Performance {

    private final Voiture auteur;
    private final List<Duration> temps;

    public Performance(Voiture auteur, List<Duration> temps) {
        this.auteur = auteur;
        this.temps = temps;
    }

    public Voiture getAuteur() {
        return auteur;
    }

    public List<Duration> getTemps() {
        return temps;
    }

    public Duration getTotalTime() {
        Duration d = Duration.ZERO;

        for (Duration temp : temps) {
            d = d.plus(temp);
        }

        return d;
    }

    @Override
    public String toString() {

        StringBuilder lb = new StringBuilder();
        lb.append("- Performance").append('\n');
        lb.append("auteur : ").append(getAuteur().getNomPilote()).append('\n');
        for (int i = 0; i < getTemps().size(); i++) {
            lb.append("temps ").append(i+1).append(" : ").append(getTemps().get(i).getSeconds()).append("sec").append('\n');
        }
        lb.append("temps total : ").append(getTotalTime().getSeconds()).append("sec\n");

        return lb.toString();
    }


}
