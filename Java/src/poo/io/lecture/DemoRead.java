package poo.io.lecture;

import poo.io.Personne;

import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoRead {

    public static void main(String[] args) {

//        StringBuilder sb = new StringBuilder();
//        Reader r1 = null;
//        try {
//            r1 = new FileReader("ressources/test.csv");
//
//            // debut
//            int current;
//            while( (current = r1.read()) != -1 ){
//                sb.append((char)current);
//            }
//            // fin
//
//        }
//        catch (FileNotFoundException ex){
//            System.out.println("fichier pas trouvé");
//        }
//        catch (IOException ex){
//            ex.printStackTrace();
//        }
//        finally {
//            if( r1 != null ) {
//                try {
//                    r1.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        System.out.println( sb );


        // try-with-ressource(s) - ferme automatiquement les ressources
//        List<Character> characterList = new ArrayList<>();
//        try ( Reader r = new FileReader("ressources/test.csv" ) ) {
//            System.out.println("fichier ouvert");
//
//            int current;
//            while( (current = r.read()) != -1 ){
//                characterList.add( (char)current );
//            }
//
//        } catch (IOException e) {
//            System.out.println("une erreur s'est produite");
//            e.printStackTrace();
//        }
//        System.out.println("fichier fermé");
//        characterList
//                .forEach(System.out::print);

        // BufferedReader
        List<Personne> pers = new ArrayList<>();
        try ( BufferedReader br = new BufferedReader( new FileReader("ressources/test.csv") ) ){

            br.lines()
                    .skip(1)
                    .map( Personne::createFromCSVLine )
                    .forEach( pers::add );

//            br.readLine(); // skip the title line
//
//            String line;
//            while( (line = br.readLine()) != null ){
//                pers.add( Personne.createFromCSVLine(line) );
//            }

        }
        catch (IOException ignored){}
        catch (IndexOutOfBoundsException | NumberFormatException ex ){
            System.out.println("Le fichier est corrompu");
            pers = new ArrayList<>();
        }

        pers.forEach( p -> System.out.println( p.getNom() ));

    }

}
