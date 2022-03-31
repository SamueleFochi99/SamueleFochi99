package gioco_8;

public class TicTacToe {
	private int matrice[][];
	
		public TicTacToe(){
			matrice = new int[3][3];
			this.matrice[0][0] = 0;
			this.matrice[1][0] = 0;
			this.matrice[2][0] = 0;
			this.matrice[0][1] = 0;
			this.matrice[1][1] = 0;
			this.matrice[2][1] = 0;
			this.matrice[0][2] = 0;
			this.matrice[1][2] = 0;
			this.matrice[2][2] = 0;
		}
		
		public boolean set(int i, int j, int sign){
			if(i >= 0 && j >= 0 && i < 3 && j < 3){
				if(sign == 1 && matrice[i][j] == 0){
					matrice[i][j] = 1;
					return true;
				}
				else if(sign == 2 && matrice[i][j] == 0){
					matrice[i][j] = 2;
					return true;
				}
				else{
					System.out.println("Errore set!");
					return false;
				}
			}
			return false;
		}
		
		public boolean won(int sign){
			for(int i = 0; i < 3; i++) {
				if(matrice[i][0]==sign && matrice[i][1]==sign && matrice[i][2]==sign) {
					return true;
				}
			}
			for(int j = 0; j < 3; j++) {
				if(matrice[0][j]==sign && matrice[1][j]==sign && matrice[2][j]==sign) {
					return true;
				}
			}
			if(matrice[0][0]==sign && matrice[1][1]==sign && matrice[2][2]==sign) {
				return true;
			}
			if(matrice[2][0]==sign && matrice[1][1]==sign && matrice[0][2]==sign) {
				return true;
			}
			return false;
		}
		
		public void printScacchiera(){
			System.out.println(matrice[0][0] + " " + matrice[1][0] + " " + matrice[2][0]);
			System.out.println(matrice[0][1] + " " + matrice[1][1] + " " + matrice[2][1]);
			System.out.println(matrice[0][2] + " " + matrice[1][2] + " " + matrice[2][2]);
		}
}
