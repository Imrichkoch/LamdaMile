package lambdamile;

public class LambdaMileDemo {

	public static void main(String[] args) {
		double miles = 700;
		
		
		
		MilesToKmInterface iMiles = (double a) ->  a*1.609344 ;
		System.out.println(miles + " international miles is: "+iMiles.milesToKm(miles)+" km");
		
		MilesToKmInterface nMiles = (double a) ->  a*1.852 ;
		System.out.println(miles + " navy miles is: "+nMiles.milesToKm(miles)+" km");
		
		MilesToKmInterface rMiles = (double a) ->  a*1.481 ;
		System.out.println(miles + " rime miles is: "+rMiles.milesToKm(miles)+" km");
		
		MilesToKmInterface aMiles = (double a) ->  a*1.609344 ;
		System.out.println(miles + " arab miles is: "+aMiles.milesToKm(miles)+" km");
		
		System.out.println();
		
		DoStuffInterface dS = () -> System.out.println("Do stuff!!!");
		dS.doStuff();

	}
	
	
	interface MilesToKmInterface{
		double milesToKm(double miles);
	}
	
	
	interface DoStuffInterface{
		void doStuff();
	}

}
