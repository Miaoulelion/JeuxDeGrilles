package jeuxDeGrilles;

import joueurs.Symbole;

public interface Jeux {
	
	//public void PlacerPion(int numCol, int numLig, Symbole Joueur);
	public void JouerCoup(int... coord);
	public boolean estGagn�(int numCol, int numLig);
	public boolean getFinDePartie();
	

}
