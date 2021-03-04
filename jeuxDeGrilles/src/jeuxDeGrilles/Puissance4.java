package jeuxDeGrilles;

import joueurs.Symbole;

public class Puissance4 extends JeuxDeGrilles {
	

	public Puissance4() {
		super(7, 6);
	}


	public boolean estAlignement(int numCol, int numLig) {
		return super.estAlignement(numLig, numCol, this.getTailleAlign(), getSymboleJoueurActuel());
	}
	
	@Override
	public boolean estGagn�(int numCol, int numLig) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean JouerCoup(int...numCol) {
		int numLig=super.getNbLig();
		while(super.EstDansGrille(numCol[0], numLig) 
				&& super.EstOccup�(numCol[0], numLig)) {
			--numLig;
		}//Si le coup n'est pas autoris�, on renvoie false
		if(!this.EstAutoris�(numCol[0], numLig)) {
			return false;
		}//Si le coup est autoris� on place le pion.
		else {
			super.PlacerPion(numCol[0], numLig, super.getSymboleJoueurActuel());
			super.EstFinDePartie(numLig,numCol[0],this.getTailleAlign(), super.getJoueurActuel().getSymbole());
			return true;
		}
	}


	@Override
	public int getTailleAlign() {
		// TODO Auto-generated method stub
		return 4;
	}

}
