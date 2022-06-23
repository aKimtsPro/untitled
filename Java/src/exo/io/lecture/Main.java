package exo.io.lecture;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String filename = "./ressources/parlote.txt";
        Map<String, List<String>> mapReplique = new HashMap<>();

        try ( BufferedReader br = new BufferedReader( new FileReader(filename) )) {

            String line = null;
            while( ( line = br.readLine() ) != null ){

                if( !line.startsWith("*") ){

                    String[] values = line.split(" - ");
                    String personnage = values[0];
                    String replique = values[1];

                    // si la clef liée au personnage existe, pas besoin de remplacer la valeur
                    // associé (la liste), on souhaite juste y ajouter la réplique nouvellement trouvée
                    if( mapReplique.containsKey( personnage ) ){
                        List<String> listReplique = mapReplique.get( personnage );
                        listReplique.add( replique );
                    }
                    // si la clef lié au personnage n'existe pas, je la crée en lui associant
                    // une liste ne comprenant que la réplique nouvellement trouvée
                    else {
                        List<String> nouvelleListReplique = new ArrayList<>();
                        nouvelleListReplique.add(replique);
                        mapReplique.put( personnage, nouvelleListReplique );
                    }

                }
                else { // BONUS 1

                    if( mapReplique.containsKey( "commentaire") ){
                        List<String> listComment = mapReplique.get( "commentaire" );
                        listComment.add( line );
                    }
                    else {
                        List<String> newListComment = new ArrayList<>();
                        newListComment.add( line );
                        mapReplique.put( "commentaire", newListComment );
                    }

                }

            }

        }
        catch( IOException exception ){
            System.out.println("probleme : " + exception.getMessage());
        }

        for (String s : mapReplique.keySet()) {
            System.out.println( s + " - " + mapReplique.get(s) );
        }

        // BONUS 2
        List<String> lines = new ArrayList<>();

        for (String personnage : mapReplique.keySet()) {
            for (String replique : mapReplique.get( personnage )) {
                lines.add(personnage + " - " + replique);
            }
        }

        lines.stream()
                .sorted( (e1, e2) ->  new Random().nextInt(2)-1 )// -1 ... 1 - tri random
                .forEach(System.out::println);


    }

}
