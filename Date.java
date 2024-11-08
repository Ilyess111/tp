package tp3;

public class Date {
	
	private int jour , mois , année; 
	
	public Date (int jour , int mois , int année) {
		if (dateValide(jour, mois , année)) {
			this.jour=jour;
			this.mois=mois; 
			this.année=année;
		} else 
			System.out.println("date invalide");
	}
	
	private boolean dateValide(int jour , int mois , int année) {
		if (mois<1 || mois>12) return false; 
		if (jour<1 || jour>nombreJours(mois,année)) return false; 
		return true;
		
	}
	
	private boolean bissex(int année) {
		if (année%4==0) {
			if (année%100!=0 || année%400==0) 
				return true; 
			else return false; 
		}
		else return false; 
	}
	
	private int nombreJours( int mois , int année) {
		switch (mois) {
		case 4: case 6: case 9: case 11: return 30;
		case 2: return (bissex(année)) ? 29 : 28;
		default: return 31;
		}
	}
	
	
	
	public void incrementerDate () {
		if (dateValide(jour+1, mois, année))
			jour++;
		else {
			if (mois==12) {
				année++;
				mois=1;
				jour=1;
			}
			else {
				mois++;
				jour=1;
			}
		}
	}
	
	public void constEtAffDate() {
		System.out.println("la date courrante est "+jour+"/"+mois+"/"+année);
	}
	
	public void constEtAffDateDemain() {
		System.out.println("la date de demain est "+jour+"/"+mois+"/"+année);
	}
	
	//setters
	public void setJour(int j) {
		if (dateValide(j,this.mois,this.année))
			jour=j;
		else System.out.println("set jour refusé : date sera invalide");
	}
	public void setMois(int m) {
		if (dateValide(this.jour,m,this.année))
			mois=m;
		else System.out.println("set mois refusé : date sera invalide");
	}
	public void setAnnée(int a) {
		année=a;
	}
	
	//getters
	public int getJour() {
		return jour;
	}
	public int getMois() {
		return mois;
	}
	public int getAnnée() {
		return année;
	}
}