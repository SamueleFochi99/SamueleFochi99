package gioco_8;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int game;
		System.out.println("Scegli a cosa vuoi giocare:\nGioco dell' 8 --> 1\nTris -->2\nForza quattro --> 3");
		game = input.nextInt();
		if(game == 1){
			System.out.println("Hai scelto il gioco dell' 8. Buona fortuna!");
			int scelta;
			boolean risolto = false;
			boolean interrotto = false;
			int interruzione;
			GiocoDello8 gioco = new GiocoDello8();
			System.out.println("Matrice iniziale: ");
			gioco.printMatrice();
			while(risolto != true && interrotto != true){
				System.out.println("Scegli cosa vuoi fare:\n 1-->move\n 2-->isSolved\n 3-->printMatrice");
				scelta = input.nextInt();
				if(scelta == 1){
					int i, j, h, k;
					System.out.println("Hai scelto move!");
					System.out.println("Che pedina vuoi muovere?");
					i = input.nextInt();
					j = input.nextInt();
					System.out.println("In che posizione?");
					h = input.nextInt();
					k = input.nextInt();
					gioco.move(i, j, h, k);
					
				}
				else if(scelta == 2){
					System.out.println("Hai scelto isSolved!");
					risolto = gioco.isSolved();
					if(risolto == false){
						System.out.println("Purtroppo non hai ancora risolto il gioco :(");
					}
				}
				else if(scelta == 3){
					System.out.println("Hai scelto printMatrice!");
					gioco.printMatrice();
				}
				System.out.println("Vuoi continuare? digita 1 per si oppure 2 per no!");
				interruzione = input.nextInt();
				if(interruzione == 2){
					interrotto = true;
				}
			}
			System.out.println("Fine programma.");
		}
		else if(game == 2){
			int i, j, sign;
			int count = 0;
			boolean setting;
			boolean fine = false;
			TicTacToe tris = new TicTacToe();
			System.out.println("Hai scelto tris. Buona fortuna!\n Sono necessari 2 giocatori!");
			while(fine == false){
				//giocatore 1
				setting = false;
				do{
				sign = 1;
				tris.printScacchiera();
				System.out.println("E il turno del giocatore 1: Che casella vuoi segnare?\nVerticale:");
				i = input.nextInt();
				System.out.println("Orizzontale:");
				j = input.nextInt();
				setting = tris.set(i, j, sign);
				}while(setting == false);
				count++;
				//System.out.println(count);
				fine = tris.won(sign);
				if(fine == true){
					System.out.println("Il giocatore 1 ha vinto!");
					break;
				}
				if(count == 9 && fine == false){
					System.out.println("PAREGGIO!");
					break;
				}
				//giocatore 2
				setting = false;
				do{
				sign = 2;
				tris.printScacchiera();
				System.out.println("E il turno del giocatore 2: Che casella vuoi segnare?\nVerticale:");
				i = input.nextInt();
				System.out.println("Orizzontale:");
				j = input.nextInt();
				setting = tris.set(i, j, sign);
				}while(setting == false);
				count++;
				//System.out.println(count);
				fine = tris.won(sign);
				if(fine == true){
					System.out.println("Il giocatore 2 ha vinto!");
					break;
				}
			}
			System.out.println("Fine programma.");
		}
		else if(game == 3){
			boolean add, finish;
			int col, count;
			count = 0;
			finish = false;
			ForzaQuattro forza = new ForzaQuattro();
			System.out.println("Hai scelto Forza quattro! Servono 2 giocatori.");
			while(finish == false && count < 16){
				//giocatore 1
				add = false;
				do{
					forza.printScacchiera();
					System.out.println("Tocca al giocatore 1! In che colonna vuoi inserire la tua pedina?");
					col = input.nextInt();
					add = forza.addPedina(1, col);
					if(add == true){
						System.out.println("Pedina inserita correttamente.");
						count++;
					}
					else
						System.out.println("Errore inserimento! si prega di inserire nuovamente la pedina.");
					finish = forza.won(1);
					if(finish == true)
						System.out.println("Il giocatore 1 ha vinto!!!");
				}while(add == false);
				if(finish == true)
					break;
				//giocatore 2
				add = false;
				do{
					forza.printScacchiera();
					System.out.println("Tocca al giocatore 2! In che colonna vuoi inserire la tua pedina?");
					col = input.nextInt();
					add = forza.addPedina(2, col);
					if(add == true){
						System.out.println("Pedina inserita correttamente.");
						count++;
					}
					else
						System.out.println("Errore inserimento! si prega di inserire nuovamente la pedina.");
					finish = forza.won(2);
					if(finish == true)
						System.out.println("Il giocatore 2 ha vinto!!!");
				}while(add == false);
				if(finish == true)
					break;
			}
			if(count == 16)
				System.out.println("Pareggio!!!");
		}
		else{
			System.out.println("Gioco non disponibile.");
		}
		input.close();
	}
	
}
