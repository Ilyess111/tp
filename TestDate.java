package tp3;
import java.util.Scanner;
public class TestDate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int jour,mois , année;
		
		System.out.println("entrer le jour");
		jour=input.nextInt();
		System.out.println("entrer le mois");
		mois=input.nextInt();
		System.out.println("entrer l'année");
		année=input.nextInt();
		
		Date date=new Date(jour,mois,année);
		
		date.constEtAffDate();
		date.incrementerDate();
		date.constEtAffDateDemain();
		
		date.setJour(10);
		date.setMois(10);
		date.setAnnée(1000);
		
		//we can use getters not required in the exercice
		
		date.constEtAffDate();
	}

}
