package fabriqueJeux;

import jeuxDeGrilles.Jeux;
import jeuxDeGrilles.Morpion;
import jeuxDeGrilles.Puissance4;

public class FabriqueJeux {
	
	public static Jeux FabriqueJeu(String [] arg) {
		if(arg.length<1) {
			throw new IllegalArgumentException("Un argument est indispensable � l'ex�cution.");
		}
		int choix=Integer.parseInt(arg[0]);
		if(choix==1) {
			return new Morpion();
		}
		else if(choix==2) {
			return new Puissance4();
		}//Par d�faut on renvoie un Morpion();
		return new Morpion();
	}

}
