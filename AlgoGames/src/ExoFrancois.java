import java.util.Scanner;  // Import the Scanner class

public class ExoFrancois {
        public static void main(String[] args) {

        /*

        // Exercice 1
            Scanner name = new Scanner(System.in);  // Crée une demande scanner
            System.out.println("Saisissez votre nom :");

            String userName = name.nextLine();  // Lit l'input de l'utilisateur

        // Exercice 2
            Scanner num1 = new Scanner(System.in);
            System.out.println("Saisissez un nombre :");
            int sum = num1.nextInt();

            Scanner num2 = new Scanner(System.in);
            System.out.println("Saisissez un second nombre :");
            int sum2 = num2.nextInt();

            System.out.println(sum+" + "+sum2+" = "+(sum+sum2));

        */

        /*

        // Exercice 3
            Scanner fabrication = new Scanner(System.in);
            System.out.println("Saissisez le prix de fabrication");
            int prixfab = fabrication.nextInt();

            Scanner vente = new Scanner(System.in);
            System.out.println("Saissisez le prix de vente");
            int prixvente = vente.nextInt();

            if (prixfab > prixvente){
                System.out.println("Perte de "+ (prixfab-prixvente)+"€");
            } else if (prixfab<prixvente) {
                System.out.println("Profit de "+ (prixvente-prixfab)+"€");
            }

        */

        /*

        // Exo 4
            Scanner sc = new Scanner(System.in);

            // Demander à l'utilisateur de saisir les 3 nombres
            System.out.println("Entrez le premier nombre:");
            int nombre1 = sc.nextInt();

            System.out.println("Entrez le deuxième nombre:");
            int nombre2 = sc.nextInt();

            System.out.println("Entrez le troisième nombre:");
            int nombre3 = sc.nextInt();

            // Trouver le plus grand nombre parmi les 3
            int plusGrandNombre = nombre1;
            if (nombre2 > plusGrandNombre) {
                plusGrandNombre = nombre2;
            }
            if (nombre3 > plusGrandNombre) {
                plusGrandNombre = nombre3;
            }

            // Afficher le résultat
            System.out.println("Le plus grand nombre est: " + plusGrandNombre);

         */

         /*

         // Exo 5
            Scanner flemme = new Scanner(System.in);
            System.out.println("Entrez une note");
            int note = flemme.nextInt();

            if (note<=20 && note>=18){
                System.out.println(note+" --> \"Excellent, bon travail\"");
            } else if (note<18 && note>=15) {
                System.out.println(note+" --> \"Bien\"");
            } else if (note<15 && note>=11) {
                System.out.println(note+" --> \"Peut mieux faire\"");
            } else if (note<11 && note>=5) {
                System.out.println(note+"  --> \"Insuffisant\"");
            } else if (note<5 && note>=0) {
                System.out.println(note+" --> \"Catastrophique, il faut tout revoir\"");
            }

            */

            /*

        // Exo 6
            Scanner calculette = new Scanner(System.in);

            // Demander à l'utilisateur de saisir le premier opérande
            System.out.println("Entrez le premier opérande:");
            double operande1 = calculette.nextDouble();

            // Demander à l'utilisateur de saisir l'opérateur
            System.out.println("Entrez l'opérateur (+, -, *, /):");
            char operateur = calculette.next().charAt(0);

            // Demander à l'utilisateur de saisir le second opérande
            System.out.println("Entrez le second opérande:");
            double operande2 = calculette.nextDouble();

            // Exécuter l'opération arithmétique correspondante à l'opérateur saisi
            double resultat = 0;
            if (operateur == '+') {
                resultat = operande1 + operande2;
            } else if (operateur == '-') {
                resultat = operande1 - operande2;
            } else if (operateur == '*') {
                resultat = operande1 * operande2;
            } else if (operateur == '/') {
                if (operande2 != 0) {
                    resultat = operande1 / operande2;
                } else {
                    System.out.println("Erreur: division par zéro");
                    return;
                }
            } else {
                System.out.println("Opérateur invalide");
                return;
            }

            // Afficher le résultat dans le format demandé
            System.out.println("[" + operande1 + ", \"" + operateur + "\", " + operande2 + "] = " + resultat);

            */


            /*

        // Exo 7
            Scanner somme = new Scanner(System.in);
            System.out.println("Entrez un nombre");
            int number = somme.nextInt();

            // Calculer la somme de tous les nombres entre 1 et number
            int result = 0;
            for (int i = 1; i<=number; i++){
                result+=i;
            }
            System.out.println(result);

            */

            /*
        // Exo 8
            Scanner escalier = new Scanner(System.in);
            System.out.println("Entrez un nombre");
            int number = escalier.nextInt();

            for (int i = 1; i<=number; i++){
                for (int j = 1; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            */

            /*
        // Exo 9
            Scanner escalier = new Scanner(System.in);
            System.out.println("Entrez un nombre");
            int number = escalier.nextInt();

            for (int i = 1; i<=number; i++){
                for (int j = 1; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = number-1; i>=1; i--){
                for (int j = 1; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            */


        // Exo 10
            Scanner sc = new Scanner(System.in);

            // Demander à l'utilisateur de saisir un nombre
            System.out.println("Entrez un nombre:");
            int n = sc.nextInt();

            // Générer une pyramide d'étoiles
            for (int i = 1; i <= n; i++) {
                // Afficher les espaces avant les étoiles pour centrer la ligne
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                // Afficher les étoiles sur la ligne
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            
        }
    }


