package exo.io.ecriture.exception;

// Concerne une String dont le format est incorrect
public class InvalidFormatException extends RuntimeException {

    public InvalidFormatException() {
        super("Format non respecté dans le fichier");
    }
}
