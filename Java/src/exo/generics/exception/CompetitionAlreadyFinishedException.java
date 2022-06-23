package exo.generics.exception;

public class CompetitionAlreadyFinishedException extends RuntimeException {

    public CompetitionAlreadyFinishedException(String message) {
        super(message);
    }
}
