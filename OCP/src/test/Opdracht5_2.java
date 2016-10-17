package test;

import java.io.IOException;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;

public class Opdracht5_2 {

	public static void main(String[] args) {
		//Deze tekst bevat een aantal alinea's. Deze zijn gescheiden door het | teken.
		String input = "Dit is de eerste alinea. Hij is twee regels lang.|De tweede alinea bevat drie zinnen. "
					 + "Kijk maar. Echt hoor!|De derde alninea verteld over het gebruik van operatoren in java. "
					 + "Je hebt er verschillende zoals & en | maar ook ^. Dit laatste wordt eigenlijk bijna nooit gebruikt. "
					 + "Ook is er een groot verschil tussen && en ||. Het is goed om dat te weten.|De laatste alinea is slechts 1 zin. "
					 + "Of toch niet? Soms is de waarheid ver te zoeken.";

		//Opdracht 1: Op welke positie komt het woord "drie" voor het eerst voor. Gebruik indexOf
		drie(input);
		woordMetW(input);
		alineaSplits(input);
	}

		public static void drie(String content) {
			System.out.println("de positie van het eerste woord drie is :"+ content.indexOf("drie"));
		}
		//Opdracht 2: Hoe lang is het laatste woord dat begint met een w?
		public static void woordMetW(String content) {
			int posistie =  content.lastIndexOf('w');
			String woord = content.substring(posistie);
			String[] parts = woord.split(" ");
			int lengte = parts[0].length();
			System.out.println("en het woord is:" + parts[0] + " en de lengte is :" + lengte);
		//	System.out.println("de lengte van het laatste woord is :"+ content.lastIndexOf('w'));
		}
	
		
		//Opdracht 3: Schrijf code om de verschillende alinea's te splitsen. Gebruik een StringTokenizer.
		public static void alineaSplits(String content) {
			 StringTokenizer st = new StringTokenizer(content);
			 while (st.hasMoreTokens()) {
		     if (st.equals('|')) {
		    	 
		    	 System.out.println("hiero \n");
		     }
		    	 else{
		         System.out.print(st.nextToken()+ " ");
		     }
			 }
			
		}
		
		//Opdracht 4: Schijf code om de verschillende alinea's te splitsen. Gebruik een Scanner.
		
		//Opdracht 5: Vervang het woord alinea voor paragraaf.
		
		
		
	}


