import java.util.Scanner;

public class Main {	
	String[][] grille = { { "[ ]", "[1]", "[2]", "[3]", "[4]", "[5]", "[6]", "[7]", "[8]", "[9]", },

			{ "[1]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", },
			{ "[2]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", },
			{ "[3]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", },
			{ "[4]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", },
			{ "[5]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", },
			{ "[6]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", },
			{ "[7]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", },
			{ "[8]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", },
			{ "[9]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", } };

	String[][] rgrille = { { "[ ]", "[1]", "[2]", "[3]", "[4]", "[5]", "[6]", "[7]", "[8]", "[9]", },

			{ "[1]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", },
			{ "[2]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", },
			{ "[3]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", },
			{ "[4]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", },
			{ "[5]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", },
			{ "[6]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", },
			{ "[7]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", },
			{ "[8]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", },
			{ "[9]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", } };
	public static boolean isPlaying = true;
	public static void main(String[] args) {

		Main m = new Main();
		m.randomGrille();
		m.afficherGrille();
		while(isPlaying){
		m.jeu();
		m.afficherGrille();
	}}

	public void afficherGrille() {
		for (int i = 0; i < grille.length; i++) {
			for (int a = 0; a < 10; a++) {
				System.out.print(grille[i][a]);
			}
			System.out.println("");
		}
	}

	public void randomGrille() {
		for (int i = 1; i < grille.length; i++) {

			int random = (int) (Math.random() * 10);
			if (random == 0) {
				while (random == 0) {
					random = (int) (Math.random() * 10);
				}
			}
			rgrille[random][i] = "[O]";
		}
	}

	public void jeu(){
		Scanner sc = new Scanner(System.in);
		int x,y;
		System.out.print("Coordonnée Y (vertical) : ");
		x = sc.nextInt();
		System.out.print("Coordonnée X (horizontal) : ");
		y = sc.nextInt();
		if(rgrille[x][y] == "[O]"){
			//PERDU
			isPlaying = false;
			System.out.println("Vous avez perdu ! ");
			return;
			
		}
		else{
			int bomb = 0;			
				if(rgrille[x-1][y] == "[O]"){
					bomb ++;}
				if(rgrille[x+1][y] == "[O]"){
					bomb ++;				}
				if(rgrille[x][y+1] == "[O]"){
					bomb ++;				}
				if(rgrille[x][y-1] == "[O]"){
					bomb ++;				}
				if(rgrille[x+1][y+1] == "[O]"){
					bomb ++;				}
				if(rgrille[x-1][y+1] == "[O]"){
					bomb ++;				}
				if(rgrille[x-1][y+1] == "[O]"){
					bomb ++;				}
				if(rgrille[x+1][y-1] == "[O]"){
					bomb ++;				}
				String construct = "[" + String.valueOf(bomb) + "]";
				grille[x][y] = construct;		
				
			
		}
	}

}//AVIS à CEUX QUI LISENT CECI ... JE SAIS LE CODE N4EST PAS PROPRE MAIS ... BON 
