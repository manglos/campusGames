
import java.awt.Color;

public class Player{

    private String firstName, lastName, username, password, phoneNumber;
    private int xp=0;
    private boolean online=false;
    private Color myColor, onlineColor, offlineColor;
    private int loginCount, numTagged, numBeenTagged;
    private Role myRole=null;

    public Player(String fn, String ln, String un, String pw, String pn, int x, boolean on){
        firstName=fn; lastName=ln; username=un; password=pw; phoneNumber = pn; xp=x;
        offlineColor = new Color(0xFF0000);
        onlineColor = new Color(0x23D400);
        myColor=offlineColor;
        setOnline(on);
        loginCount=0;
        numTagged=0;
        numBeenTagged=0;
    }
    public Player(String fn, String ln, String un, String pw, String pn, int x, boolean on, Role r){
        firstName=fn; lastName=ln; username=un; password=pw; phoneNumber = pn; xp=x;
        offlineColor = new Color(0xFF0000);
        onlineColor = new Color(0x23D400);
        myColor=offlineColor;
        setOnline(on);
        myRole=r;
        loginCount=0;
        numTagged=0;
        numBeenTagged=0;
    }
    public Player(String fn, String ln, String un, String pw, String pn, int x, boolean on, String r){
        firstName=fn; lastName=ln; username=un; password=pw; phoneNumber = pn; xp=x;
        offlineColor = new Color(0xFF0000);
        onlineColor = new Color(0x23D400);
        myColor=offlineColor;
        setOnline(on);
        loginCount=0;
        numTagged=0;
        numBeenTagged=0;
        setRole(r);
        
    }
    
    Player(){}

    public void setName(String fn, String ln){
        firstName=fn; lastName=ln;
    }
    public void setUsername(String un){
        username=un;
    }
    public void setPhonenumber(String pn){
        phoneNumber=pn;
    }
    public void setExperience(int x){
        xp=x;
    }
<<<<<<< HEAD
    
    abstract void tagHandler(){}
    
    String getName(){
=======
    public void setRole(Role r){
		myRole=r;
	}
	public void setRole(String r){
		if(r==null)
			return;
		
		if(r.equalsIgnoreCase("IT"))
			myRole=new It();
		else if(r.equalsIgnoreCase("Runner"))
			myRole=new Runner();
		else if(r.equalsIgnoreCase("Spectator"))
			myRole=new Spectator();
			
	}
	public Role getRole(){	
		return myRole;
	}
    public String getName(){
>>>>>>> 47914cde7f2018b680213dc55c81845cbcc84e4e
        return firstName + " " + lastName;
    }
    public String getUsername(){
        return username;
    }
    public String getPhonenumber(){
        return phoneNumber;
    }
    public int getExperience(){
        return xp;
    }
    public String getPassword(){
        return password;
    }
    public void addXP(int x){
		xp+=x;
	}
	
	//This is very VERY temporary
	public void addXP(String action){
		if(action.equals("tag")){
			addXP(100);
			return;
		}
		if(action.equals("tagged")){
			addXP(-50);
			return;
		}
		if(action.equals("win")){
			addXP(300);
			return;
		}
		if(action.equals("loss")){
			addXP(100);
			return;
		}
	}
	
    public boolean isOnline(){
        return online;
    }
    public void setOnline(boolean o){
        if(o==true){
            myColor=onlineColor;
        }
        else{
            myColor=offlineColor;
        }
        
        online=o;
    }

    @Override
    public String toString(){
        return username + "'s info:\nName: " +getName() + "\nPhone: " + getPhonenumber() + "\nExperience: " + getExperience() + " --" + getRole();
    }
	
}

