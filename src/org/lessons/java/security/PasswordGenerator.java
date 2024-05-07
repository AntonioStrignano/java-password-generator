/*Create un nuovo progetto java chiamato java-password-generator
Aggiungete un package org.lessons.java.security
Aggiungete una classe PasswordGenerator che contiene un metodo main
Il programma deve fare quanto segue: salvare in opportune variabili il nome,
  cognome, colore preferito e data di nascita di un utente suddivisa in giorno, 
  mese e anno in numero generare (e stampare a video) una password concatenando nome, 
  cognome, colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere -
Esempio: ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore 
preferito è il magenta La sua password sarà Pinco-Pallo-magenta-2011*/


package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		
		//salvare variabvili nome, cognome, colore prefe, data di nascita (giorno, mese, anno)
		
		//definiamo lo scanner
		Scanner input = new Scanner(System.in);
		
		//chiediamo variabile nome
		System.out.println("Inserisci il tuo nome: ");
		String nome = input.nextLine();
		
		//chiediamo variabile cognome
		System.out.println("Inserisci il tuo cognome: ");
		String cognome = input.nextLine();
		
		//chiediamo colore prefe
		System.out.println("Inserisci il tuio colore preferito: ");
		String colorePrefe = input.nextLine();
		
		//chiediamo data di nascita
		System.out.println("Giorno di nascita: ");
		int giorno = input.nextInt();
		
		System.out.println("Mese di nascita: ");
		int mese = input.nextInt();
		
		System.out.println("Anno di nascita: ");
		int anno = input.nextInt();
				
		
		// generare password: nome + cognome + colore + somma giorni
		System.out.println("Stiamo elaborando la tua password");
		System.out.println("La tua password e': " + nome + '-' + cognome + '-' + colorePrefe + '-' + (giorno + mese + anno));
		
		
		//GGWPEZ
	}

}
