package jeuxDeGrilles;

public interface JeuxDeGrilles {
	
	public void PlacerPion(int numCol, int numLig, String Joueur);
	public boolean estGagn�(int numCol, int numLig);
	public boolean getFinDePartie();

}
