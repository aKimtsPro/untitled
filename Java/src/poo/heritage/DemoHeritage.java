package poo.heritage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DemoHeritage {

    public static void main(String[] args) {

//        Personne p = new Personne("salut" , "salut", null);

//        Employe emp = new Employe("luc", "manant", LocalDate.now(), 0);
//        Cadre cadre = new Cadre("luc", "manant", LocalDate.now(), 0);
//        cadre.manger();
//
//        Personne p; // = emp;
//        p = cadre;
//
//        // p = new Personne();
//        Cadre c1 = null;
//        if( p instanceof Cadre )
//            c1 = (Cadre)p;
//
//        Employe e1 = null;
//        if( p instanceof Employe )
//            e1 = (Employe)p;


        // Abstract

        List<Personne> personneList = new ArrayList<>();
        personneList.add( new CDI("alex", "kil", null, 0) );
        personneList.add( new CDD("alexa", "kol", null, 0) );
        personneList.add( new Cadre("Lexa", "Lok", null, 0) );

        for (Personne personne : personneList) {
            personne.travailler();
        }

    }

}
