package hero;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HeroGenerator {

	public static void main(String[] args) {
	}
	
	private static String getRandomName() {
		return "";
	}
	
	private static String getRandomClass() {
		return "";
	}
	
	private static String getRandomWeapon() {
		String[] weapons = {"spear", "sword", "bow", "dagger", "axe"};
		// wybierz losowo z tablicy broñ i j¹ zwróc
		return "";
	}
	
	private static int getStartingHealPonts(String className) {
		//Metoda powinna zwrocic losowo zycie z przedzialu startowego dla klasy postaci;
		//np. warrior 10-15HP
		// rogue 6-10hp
		return 0;
	}
	
	private static Date getBirthDate(String dateString) {
		String dateFormat = "yyyy-MM-dd"; //Format daty: "2000-02-02"
		DateFormat formatter = new SimpleDateFormat(dateFormat); // Definiujemy jaki format daty moze byæ odczytany
		
		int minAge = 17;
		int maxAge = 60;
		//Wprowadziæ losowoœæ roku urodzenia
		
		Date date = new Date();
		try {
			date = formatter.parse(dateString);// Zamienia zmienn¹ typu String na datê
		} catch (ParseException e) {
			System.out.println("Cannot parse dateString: " + dateString + "to given format: " + dateFormat);
		}
		return date;
	}
	
	private static String getZodiacSign(Date birthDate) {
		//Zwrocic na podstawie daty urodzenia poprawny znak zodiaku postaci
		return "zodiac";
	}

	
}

