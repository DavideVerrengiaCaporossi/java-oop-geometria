package jana60.geometria;

public class Rettangolo {
	int altezza;
	int base;
	
	int areaRettangolo() {
		int area = base * altezza;
		return area;
	} 
	
   
	int perimetroRettangolo() {
		int perimetro = (base + altezza) * 2;
		return perimetro;
	}
	
	
	void restituisciStampa( ) {
		System.out.println("Questo rettangolo ha un Area di " + areaRettangolo() + " ed un Perimetro di " + perimetroRettangolo() );
		
	}
}  
