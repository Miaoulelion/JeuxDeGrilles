package jeuxDeGrilles;

public class Morpion extends GrillesAbstraites {

	
	public Morpion() {
		super(3, 3);
	}


	public boolean estAlign�(int numCol, int numLig) {
		return false;
	}
	

	public boolean estGagn�(int numCol, int numLig) {
		return false;
	}
	

}
