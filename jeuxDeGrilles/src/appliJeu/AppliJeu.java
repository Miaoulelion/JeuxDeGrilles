package appliJeu;

import java.util.Scanner;

import fabriqueJeux.FabriqueJeux;
import jeuxDeGrilles.Jeux;

public class AppliJeu {

	public static void main(String[] args) {

		Jeux Jeu=FabriqueJeux.FabriqueJeu(args);
		
		System.out.println(Jeu.toString());
		
		while(!Jeu.getFinDePartie()) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Indiquez la colonne jou�e : ");
			int [] Coup= {sc.nextInt()};
			Jeu.JouerCoup(Coup);
			System.out.println(Jeu.toString());
		}
		//Utiliser instanceof pour v�rifier type d'objet
		//faire une fonction pour saisie � partir de �a
	}

}
