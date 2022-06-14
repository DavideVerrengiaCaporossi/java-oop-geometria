package jana60.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//creazione scanner
		Scanner scan = new Scanner(System.in);
		
		//creazione contenitore della classe per altezza
		Rettangolo r = new Rettangolo();
		
	
		
		
		//richiesta altezza da utente
		System.out.println("Inserisci l'altezza del rettangolo");
		
		//mandiamo l'altezza data dal utente nel contenitore r che abbiamo creato in precedenza
		r.altezza = scan.nextInt();
		
		System.out.println("Inserisci la base del rettangolo");
		//mandiamo la base data dal utente nel contenitore r che abbiamo creato in precedenza
		r.base = scan.nextInt();
		//chiamiamo il metodo per stampare base e altezza
		r.restituisciStampa();
		
		scan.close();
	}

}
