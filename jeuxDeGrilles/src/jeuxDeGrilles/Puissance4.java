package jeuxDeGrilles;

import joueurs.Symbole;

public class Puissance4 extends JeuxDeGrilles {
	

	public Puissance4() {
		super(7, 6);
	}


	

	

	
	@Override
	public boolean estGagn�(int numCol, int numLig) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void JouerCoup(int...numCol) {
		int numLig=super.getNbLig();
		while(super.EstOccup�(numCol[0], numLig)) {
			--numLig;
		}//mettre la m�thode en boolean et utiliser est autoris� ?
		super.PlacerPion(numCol[0], numLig, super.getJoueurActuel().getSymbole());
	}

}
