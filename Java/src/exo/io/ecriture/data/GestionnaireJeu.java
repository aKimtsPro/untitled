package exo.io.ecriture.data;

import exo.io.ecriture.exception.FileCorruptedExpection;
import exo.io.ecriture.exception.InvalidFormatException;
import exo.io.ecriture.model.JeuDeSociete;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestionnaireJeu {

    private final List<JeuDeSociete> list = new ArrayList<>();
    private final String PATHNAME = "./ressources/jeuxSocTest.csv";
    private final String HEADER = "id,nom,editeur,ageMin,nbrJoueurMax,nbrJoueurMin";

    // charge depuis un fichier
    // lance FileCorruptedException si une ligne est mal formaté -> le fichier est corrompu
    // lance IOException si un probleme a été rencontré dans l'acces au fichier
    public void loadFromFile() throws FileCorruptedExpection, IOException {

        File file = new File(PATHNAME);
        if( !file.exists() )
            file.createNewFile();

        try(BufferedReader br = new BufferedReader( new FileReader(file))) {

            List<JeuDeSociete> temp = new ArrayList<>();

            // skip la première ligne
            br.readLine();

            String line = null;
            while( (line = br.readLine()) != null ){
                JeuDeSociete toAdd = JeuDeSociete.generateFromCSVLine( line );
                temp.add(toAdd);
            }

            list.clear();
            list.addAll(temp);

        }
        catch (InvalidFormatException ex) {
            throw new FileCorruptedExpection(PATHNAME);
        }
    }

    // retrouner la liste des jeu societe
    public List<JeuDeSociete> getList() {
        return new ArrayList<>(list); // clonage de la liste
    }

    // ajouter un jeu à la collection
    public void add( JeuDeSociete toAdd ) {
        if( toAdd != null ){
            int nextId = list.stream()
                    .mapToInt(JeuDeSociete::getId)
                    .max()
                    .orElse(0) + 1;
            toAdd.setId( nextId );
            list.add(toAdd);
        }
    }

    // sauvegarder
    // lance une IOException si un probleme a été rencontré dans la creation/l'accès du/au fichier
    public void save() throws IOException {

        try( PrintWriter pw = new PrintWriter( PATHNAME ) ){
            pw.println( HEADER );
            list.forEach( jeu -> pw.println(jeu.generateCSVLine()) );
        }
    }




}
