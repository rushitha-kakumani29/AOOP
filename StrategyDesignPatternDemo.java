package Java;

import java.util.Scanner;

interface TravelStrategy 
{ 
 public void gotoAirport(); 
} 
class AutoStrategy implements TravelStrategy {  
	public void gotoAirport() { 
		System.out.println("Travel is going to Airport by auto and will be charged 600rs");   
	} 
}
class BusStrategy implements TravelStrategy { 
	public void gotoAirport() { 
		System.out.println("Travel is going to Airport by bus and will be charged 200rs"); 
	}  
} 
class TaxiStrategy implements TravelStrategy { 
	public void gotoAirport() { 
		System.out.println("Travel is going to Airport by taxi and will be charged 1000rs"); 
	}  
}  
class TrainStrategy implements TravelStrategy { 
	public void gotoAirport() { 
		System.out.println("Travel is going to Airport by train and will be charged 300rs"); 
    }  
} 
class TravelContext { 
	private TravelStrategy travelStrategy; 
	public void setTravelStrategy(TravelStrategy strategy) { 
		this.travelStrategy=strategy; 
	} 
	public TravelStrategy getTravelStrategy() { 
		return travelStrategy; 
	} 
	public void gotoAirport() { 
		travelStrategy.gotoAirport(); 
     } 
} 
public class StrategyDesignPatternDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the type of transport: ");
		  String travelType=sc.next(); 
		  System.out.println("Travel type is "+travelType);  // to print type of transport
		   
		   
		  TravelContext ctx=new TravelContext();  
		  if("bus".equalsIgnoreCase(travelType)) 
		  { 
		   ctx.setTravelStrategy(new BusStrategy()); // creating bus object
		  } 
		  else if ("train".equalsIgnoreCase(travelType)) 
		  { 
		   ctx.setTravelStrategy(new  TrainStrategy()); 	// creating train object
		  } 
		  else if("taxi".equalsIgnoreCase(travelType)) 
		  { 
		   ctx.setTravelStrategy(new TaxiStrategy()); 		//creating taxi object 
		  } 
		  else if ("auto".equalsIgnoreCase(travelType)) 
		  { 
		   ctx.setTravelStrategy(new AutoStrategy()); 	// creating auto object
		  } 
//		  System.out.println("travel context has:"+ctx.getTravelStrategy());  // inorder to get the object 
		  ctx.gotoAirport(); // to call the travel strategy of particular transport

	}

}
