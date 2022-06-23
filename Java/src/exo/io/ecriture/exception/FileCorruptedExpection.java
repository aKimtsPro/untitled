package exo.io.ecriture.exception;

// concerne un fichier qui se trouve être corrompu
public class FileCorruptedExpection extends Exception {

    private final String filename;

    public FileCorruptedExpection(String filename) {
        super("le fichier : {" + filename + "} est corrompu");
        this.filename = filename;
    }
}
