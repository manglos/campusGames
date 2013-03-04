
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montynewman
 */
public abstract class Player{

    String firstName, lastName, username, password, phoneNumber;
    int xp=0;
    boolean online=false;
    Color myColor, onlineColor, offlineColor;
    int loginCount;
    int numTagged, numBeenTagged; 

    Player(String fn, String ln, String un, String pw, String pn, int x, boolean on){
        firstName=fn; lastName=ln; username=un; password=pw; phoneNumber = pn; xp=x;
        offlineColor = new Color(0xFF0000);
        onlineColor = new Color(0x23D400);
        myColor=offlineColor;
        setOnline(on);
        loginCount=0;
    }
    Player(){}

    void setName(String fn, String ln){
        firstName=fn; lastName=ln;
    }
    void setUsername(String un){
        username=un;
    }
    void setPhonenumber(String pn){
        phoneNumber=pn;
    }
    void setExperience(int x){
        xp=x;
    }
    String getName(){
        return firstName + " " + lastName;
    }
    String getUsername(){
        return username;
    }
    String getPhonenumber(){
        return phoneNumber;
    }
    int getExperience(){
        return xp;
    }
    String getPassword(){
        return password;
    }
    void addXP(int x){
		xp+=x;
	}
	void addXP(String action){
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
    boolean isOnline(){
        return online;
    }
    void setOnline(boolean o){
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
        return username + "'s info:\nName: " +getName() +"\nPhone: "+getPhonenumber()+"\nExperience: "+getExperience();
    }
	
}

