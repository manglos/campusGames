abstract class Player{

	String name, username; 
	int phonenumber=0;
	int xp=0;
	
	Player(String n, String un, int pn, int x){
		name=n; username=un; int phoneNumber = pn; int xp=x;
	}
	
	void setName(String n){
		name=n;
	}
	void setUsername(String un){
		username=un;
	}
	void setPhonenumber(int pn){
		phonenumber=pn;
	}
	void setExperience(int x){
		xp=x;
	}
	String getName(){
		return name;
	}
	String getUsername(){
		return username;
	}
	int getPhonenumber(){
		return phonenumber;
	}
	int getExperience(){
		return xp;
	}
	
	public String toString(){
		return username + "'s info:\nName: " +name+"\nPhone: "+phonenumber+"\nExperience: "+xp;
	}
	
}
