package gioco_8;

public class GiocoDello8 {
	private int[][] matrice;
	//costruttore
	public GiocoDello8(){
		matrice = new int[3][3];
		this.matrice[0][0] = 2;
		this.matrice[1][0] = 3;
		this.matrice[2][0] = 6;
		this.matrice[0][1] = 1;
		this.matrice[1][1] = 5;
		this.matrice[2][1] = 0;
		this.matrice[0][2] = 4;
		this.matrice[1][2] = 7;
		this.matrice[2][2] = 8;
	}
	
	public void printMatrice(){
		System.out.println(matrice[0][0] + " " + matrice[1][0] + " " + matrice[2][0]);
		System.out.println(matrice[0][1] + " " + matrice[1][1] + " " + matrice[2][1]);
		System.out.println(matrice[0][2] + " " + matrice[1][2] + " " + matrice[2][2]);
	}
	
	public void move(int i, int j, int h, int k){
		//ij va spostata in hk
		//controllo se h,k è 0
		if(matrice[h][k] == 0){
			//controllo se i,j e h,k sono adiacenti
			if((i == h && (j - k == 1 || j - k == -1)) || (j == k && (i - h == 1 || i - h == -1))){
				matrice[h][k] = matrice[i][j];
				matrice[i][j] = 0;
			}
			else{
				System.out.println("Errore! Le 2 caselle non sono adiacenti");
			}
		}
		else{
			System.out.println("Errore! puoi spostare solo nella casella contenente 0");
		}
		System.out.println("Ora la matrice è così composta:");
		printMatrice();
	}
	
	public boolean isSolved(){
		if(matrice[0][0] == 1 && matrice[1][0] == 2 && matrice[2][0] == 3){
			if(matrice[0][1] == 4 && matrice[1][1] == 5 && matrice[2][1] == 6){
				if(matrice[0][2] == 7 && matrice[1][2] == 8 && matrice[2][2] == 0){
					System.out.println("Complimenti! Hai finito il gioco dell' 8!");
					return true;
				}
			}
		}
			return false;
	}
	
}
