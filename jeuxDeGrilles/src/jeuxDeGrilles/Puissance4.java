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
	public boolean JouerCoup(int...numCol) {
		int numLig=super.getNbLig();
		while(super.EstOccup�(numCol[0], numLig)) {
			--numLig;
		}//Si le coup n'est pas autoris�, on renvoie false
		if(!this.EstAutoris�(numCol[0], numLig)) {
			return false;
		}//Si le coup est autoris� on place le pion.
		else {
			super.PlacerPion(numCol[0], numLig, super.getJoueurActuel().getSymbole());
			return true;
		}
	}

}
