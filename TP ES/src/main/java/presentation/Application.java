package presentation;
import TP.*;

import java.io.*;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException, Exception {
        MetierproduitImpl metier = new MetierproduitImpl();
        metier.add(new produit(06l, "PR1", "marq1", 2635f, "desc1", 10));
        metier.add(new produit(05l, "PR2", "marq2", 3000f, "desc2", 2));
        metier.add(new produit(07l, "PR3", "marq3", 4000f, "desc3", 4));
       produit p3 = new produit();
        produit p1 = new produit(1l, "produit1", "marque1", 1000.00f, "disc1", 142);
       metier.add(p1);




        Scanner input = new Scanner(System.in);
        int choix;
        do {
            System.out.println("Application\n");
            System.out.print("1.) Afficher la liste des produits\n");
            System.out.print("2.) Rechercher produit par ID.\n");
            System.out.print("3.) Ajouter new produit.\n");
            System.out.print("4.) Supprimer prouit.\n");
            System.out.print("5.) Sauvegarder produit.\n");
            System.out.print("6.) Exit\n");
            System.out.print("\nEnter votre choix: ");

            choix = input.nextInt();
        }
        while (choix > 7);
        switch (choix) {

            case 1:
                //afficher liste

                System.out.println( metier.getAll());
                break;

            case 2:
                //rechercher produit par id

                System.out.println("Entrer un ID\n");
                p3.id= input.nextInt();

                System.out.println(metier.FindBYID(p3.getId()).getNom());
                System.out.println(metier.FindBYID(p3.getId()).getDescription());

                break;

            case 3: //Ajouter produit

long id=0l;String nom="",descript="",marque="";double prix=0f;int nbstk=0,qte=0;
                System.out.println("Entrer l'ID\n");
                id=input.nextLong();
                p3.setId(id);
                        System.out.println("Entrer le nom\n");
                        nom=input.next();
                p3.setNom(nom);
                System.out.println("Entrer la maqrue\n");
                marque=input.next();
                p3.setMarque(marque);

                System.out.println("Entrer le prix\n");
                prix=input.nextFloat();
                p3.setPrix(prix);

                System.out.println("Entrer la description\n");
                descript=input.next();
                p3.setDescription(descript);

                System.out.println("Entrer la quantité\n");
                nbstk=input.nextInt();
                p3.setNbstock(nbstk);
                metier.add(new produit(id, nom, marque, prix, descript, nbstk));
                for (produit p : metier.listP) {
                    System.out.println(p);
                }
                System.out.println("produit ajouté\n");

break;
            case 4:
                System.out.println("Entrer l'ID\n");

                p3.id= input.nextLong();
                metier.delete(p3.getId());
                System.out.println("produit supprimé\n");
                System.out.println(metier.listP);
                break;
            case 5:
                metier.saveAll();

                break;
case 6:
            System.out.println("Exiting Application...");
            System.exit(0);
             break;

            }
        if (choix > 6 || choix < 1){
            System.out.println("This is not a valid Menu Option! Please Select Another.");
            do{
                choix = input.nextInt();
            }
            while(choix < 7 );

        }


        }

    }

