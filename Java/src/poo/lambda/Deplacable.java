package poo.lambda;

public interface Deplacable {

    void porter();
    default void deposer(){
        System.out.println("je depose");
    };

}
