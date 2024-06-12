package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	int codice;
	String nome;
	String descrizione;
	static float prezzo;
	float iva;
	
	String dettagliProdotto() {
		return codice + ","  + nome + "," + descrizione + ","  + prezzo + "€" + "," + "prezzo con iva del 22%" + iva;
	}
	
	public static void main(String[] args) {
		
	}
}