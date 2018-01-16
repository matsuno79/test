package jp.co.internous.action;

public class HumanName {
	
	public String lastName;
	public String firstName;
	
	public String getName(){
		
		firstName="和合";
		lastName="真一";
		
		String myName=firstName+lastName;
		return myName;
	}

}
