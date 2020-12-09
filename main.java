package exercice3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Personne[] personnes = new Personne[2];	
			personnes[0] = new Medecin("mustapha",30);
			personnes[1] = new Opticienne("aymen",35);
			for (int i = 0; i < personnes.length; i++)
		    personnes[i].afficher();
	}

}
