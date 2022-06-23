package poo.io.ecriture;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoWrite {

    public static void main(String[] args) {

        // FILEWRITER

        try ( FileWriter fw = new FileWriter("./ressources/writ.txt", false) ) {

            fw.append("salut")
                    .append('c')
                    .append("omment")
                    .append("va?")
                    .append('\n');

            fw.write("salut");
            fw.write('c');
            fw.write("omment");
            fw.write("va?");

        }
        catch ( IOException ex ){
            System.out.println("probleme : " + ex.getMessage());
        }

        //

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("./ressources/write.txt", true))){

            bw.append("salut ")
                    .append('c')
                    .append("omment ")
                    .append("va?");

            bw.newLine();

            bw.write("salut ");
            bw.write('c');
            bw.write("omment ");
            bw.write("va?");

        }
        catch (IOException ex){
            System.out.println("probleme : " + ex.getMessage());
        }

//          ajout au fichier possible:
//            try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("./ressources/write.txt", true)))  ){
//          pas d'ajout au fichier possible:
        try( PrintWriter pw = new PrintWriter( "./ressources/wr.txt" )  ){
            System.out.println("fichier ouvert");

            pw.print(new Object()); // converti les objet en String en utilisant toString();
            pw.println(" avec retour à la ligne");
            pw.printf("un nombre entier : %d | un character : %c | un float : %f", 12, 'c', 18.97) // chainable
                .println();

            pw.format("un nombre entier : %d | un character : %c | un float : %f %n", 12, 'c', 18.97); // meme chose

        }
        catch (IOException ex){
            System.out.println("probleme - " + ex.getMessage());
        }

    }

}
