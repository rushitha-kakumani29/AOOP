package Java;

import java.util.ArrayList;
import java.util.List;
class Subscriber { 
	 private String name; 
	 private Channel channel=new Channel(); 
	 
	 
	 public void update() 
	 { 
	  System.out.println("hey"+"\t"+name +"\t" +"video uploaded"); 
	   
	 } 
	  
	 public void subscribeChannel(Channel ch) 
	 { 
	  channel=ch; 
	 } 
	 public Subscriber(String name) 
	 { 
	  super(); 
	  this.name=name; 
	   
	 } 
}
 class Channel {  
		  List<Subscriber> subs=new ArrayList<>(); 
		  String title; 
		   
		  public void subscribe(Subscriber sub) 
		  { 
		   subs.add(sub); 
		  } 
		  public void unSubscribe(Subscriber sub) 
		  { 
		   subs.remove(sub); 
		  } 
		  public void notifySubscriber() 
		  { 
		   for(Subscriber sub :subs) { 
		    sub.update(); 
		   } 
		  } 
		  public void upload(String title) 
		  { 
		   this.title=title; 
		   notifySubscriber(); 
		  } 
		}
public class ObserverDesugnPatternDemo {

	public static void main(String[] args) {
		Channel c=new Channel(); 
		   Subscriber s1=new Subscriber("one"); 
		   Subscriber s2=new Subscriber("two"); 
		   Subscriber s3=new Subscriber("three"); 
		   Subscriber s4=new Subscriber("four"); 
		    
		   c.subscribe(s1); 
		   c.subscribe(s2); 
		   c.subscribe(s3); 
		   c.subscribe(s4); 
		    
		   s1.subscribeChannel(c); 
		   s2.subscribeChannel(c); 
		   s3.subscribeChannel(c); 
		   s4.subscribeChannel(c); 
		    
		    
		   c.upload("programming"); 
		   c.unSubscribe(s4); 
		   c.upload("programmingin java"); 
	}
}
