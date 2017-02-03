public class Alamprogramm1{
	public static double sentimeetriteks(double tollid){
		return tollid*2.54;
	}
	public static double tollideks(double sentimeetrid){
		return  sentimeetrid/2.54;
		//arvutage sentimeetritest tollid
	}
	
	public static double hypotenuus(double k1, double k2){
		return  Math.sqrt(Math.pow(k1, 2)+Math.pow(k2, 2));

	}
	//Looge alamprogramm kolmnurga hüpotenuusi leidmiseks kaatetite järgi
	//Ruutjuure funktsioon Math.sqrt
	
	public static void main(String[]args){   
		double tollidearv=3;
		double sentimeetritearv=sentimeetriteks(tollidearv);
		
		System.out.println(tollidearv+" tolli on "+sentimeetritearv+" sentimeetrid");
		System.out.println(String.format("Sentimeetreid: %.2f", tollideks(10)));
		
		double hypo=hypotenuus(3,4);
		System.out.println("Hypotenuus on "+hypo);
		
	}
}
