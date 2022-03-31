package gioco_8;

public class ForzaQuattro {
	private int matrice[][];
	private int freeRow[];
	
	public ForzaQuattro(){
		matrice = new int[4][4];
		freeRow = new int[4]; 
		this.matrice[0][0] = 0;
		this.matrice[1][0] = 0;
		this.matrice[2][0] = 0;
		this.matrice[3][0] = 0;
		this.matrice[0][1] = 0;
		this.matrice[1][1] = 0;
		this.matrice[2][1] = 0;
		this.matrice[3][1] = 0;
		this.matrice[0][2] = 0;
		this.matrice[1][2] = 0;
		this.matrice[2][2] = 0;
		this.matrice[3][2] = 0;
		this.matrice[0][3] = 0;
		this.matrice[1][3] = 0;
		this.matrice[2][3] = 0;
		this.matrice[3][3] = 0;
		this.freeRow[0] = 0;
		this.freeRow[1] = 0;
		this.freeRow[2] = 0;
		this.freeRow[3] = 0;
		}
	
	public boolean addPedina(int color, int column){
		if(color > 0 && color < 3 && column >= 0 && column < 4){
			if(freeRow[column] < 4){
				matrice[freeRow[column]][column] = color;
				freeRow[column]++;
				return true;
			}
		}
		else{
			System.out.println("Errore nell' inserimento");
		}
		return false;
	}
	
	public boolean won(int color){
		for(int i = 0; i < 4; i++) {
			if(matrice[i][0]==color && matrice[i][1]==color && matrice[i][2]==color && matrice[i][3]==color) {
				return true;
			}
		}
		for(int j = 0; j < 4; j++) {
			if(matrice[0][j]==color && matrice[1][j]==color && matrice[2][j]==color && matrice[3][j]==color) {
				return true;
			}
		}
		return false;
	}
	
	public void printScacchiera(){
		System.out.println(matrice[0][0] + " " + matrice[1][0] + " " + matrice[2][0] + " " + matrice[3][0]);
		System.out.println(matrice[0][1] + " " + matrice[1][1] + " " + matrice[2][1] + " " + matrice[3][1]);
		System.out.println(matrice[0][2] + " " + matrice[1][2] + " " + matrice[2][2] + " " + matrice[3][2]);
		System.out.println(matrice[0][3] + " " + matrice[1][3] + " " + matrice[2][3] + " " + matrice[3][3]);
	}
	
}
