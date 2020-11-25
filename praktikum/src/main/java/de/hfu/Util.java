package de.hfu;

public class Util { //Tests unter src/test/java Ordner

	public static boolean istErstesHalbjahr(int monat){
		if ((monat < 1) || (monat > 12)) throw new IllegalArgumentException();
		if(monat <= 7) return true;
		return false;
	}

}