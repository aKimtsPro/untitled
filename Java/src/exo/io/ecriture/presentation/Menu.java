package exo.io.ecriture.presentation;

import exo.io.ecriture.exception.FileCorruptedExpection;
import exo.io.ecriture.model.JeuDeSociete;
import exo.io.ecriture.data.GestionnaireJeu;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private final GestionnaireJeu service = new GestionnaireJeu();
    private final Scanner sc = new Scanner(System.in);

    public void start(){

        System.out.println("Chargement des données ... ");
        try {
            service.loadFromFile();
        }
        catch (FileCorruptedExpection ex) {
            System.out.println("/!\\ Le fichier est corrompu, veuillez l'arranger ou le supprimer");
            System.out.println("fin du programme ...");
            return;
        }
        catch (IOException ex) {
            System.out.println("/!\\ Problème d'accès au fichier: " + ex.getMessage() );
            System.out.println("fin du programme ... ");
            return;
        }
        System.out.println("Chargement terminé");

        int choice = -1;
        do {
            displayMenu();
            choice = getChoice(4);
            mapChoice(choice);
        } while (choice != 4);

    }

    private void displayMenu() {
        System.out.println("--- MENU ---");
        System.out.println("1 - Afficher les jeux de la collection");
        System.out.println("2 - Ajouter un jeu à la collection");
        System.out.println("3 - Sauvegarder");
        System.out.println("4 - Quitter");
    }
    private int getChoice( int nbrChoix ){

        int choice = -1;
        do {

            System.out.println("Veuillez faire votre choix : ");
            try {
                choice = sc.nextInt();
            }
            catch (InputMismatchException ex) {
                System.out.println("valeur invalide veuillez recommencer");
            }
            finally {
                sc.nextLine();
            }

        } while ( choice < 1 || choice > nbrChoix );
        return choice;
    }
    private void mapChoice(int choice) {
        switch (choice) {
            case 1 -> displayCollection();
            case 2 -> addToCollection();
            case 3 -> save();
            case 4 -> quitter();
            default -> System.out.println("Choix invalide");
        }
    }

    private void displayCollection(){
        System.out.println("\n--- AFFICHAGE DE LA COLLECTION ---");
        service.getList()
                .forEach(System.out::println);
        System.out.println("-----------------------------------\n");
    }
    private void addToCollection(){

        String nom, editeur;
        int ageMin, nbrJoueurMin, nbrJoueurMax;

        System.out.println("-> Veuillez entrer le nom du jeu :");
        nom = sc.nextLine();

        System.out.println("-> Veuillez entrer le nom de l'editeur du jeu :");
        editeur = sc.nextLine();

        try {
            System.out.println("-> Veuillez entrer l'age minimum :");
            ageMin = sc.nextInt();

            System.out.println("-> Veuillez entrer le nombre de joueur minimum :");
            nbrJoueurMin = sc.nextInt();

            System.out.println("-> Veuillez entrer le nombre de joueur maximum :");
            nbrJoueurMax = sc.nextInt();

            service.add(
                    new JeuDeSociete(
                        0,
                        nom,
                        editeur,
                        ageMin,
                        nbrJoueurMin,
                        nbrJoueurMax
                    )
            );
        }
        catch (InputMismatchException ex){
            System.out.println("/!\\ Valeur invalide, annulation de l'ajout...");
        }
    }
    private void save() {
        System.out.println("Sauvegarde en cours ... ");
        try{
            service.save();
            System.out.println("Sauvegarde terminé");
        }
        catch (IOException ex) {
            System.out.println("Problème d'accès au fichier, sauvegarde annulée ... ");
        }

    }
    private void quitter() {
        System.out.println("-> Souhaitez-vous sauvegarder ? (o/n)");
        String choice = sc.nextLine();
        boolean quit = true;

        switch (choice) {
            case "o", "O", "y", "Y" -> save();
        }

        System.out.println("Au revoir!");
    }

}
