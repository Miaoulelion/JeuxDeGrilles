package jeuxDeGrilles;

import joueurs.Symbole;

public interface JeuxDeGrilles {
	
	public void PlacerPion(int numCol, int numLig, Symbole Joueur);
	public boolean estGagn�(int numCol, int numLig);
	public boolean getFinDePartie();

}
