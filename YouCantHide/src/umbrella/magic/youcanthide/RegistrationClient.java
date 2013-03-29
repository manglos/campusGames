package umbrella.magic.youcanthide;

import java.io.*;
import java.net.*;
import umbrella.magic.youcanthide.youcanthide.*;



public class RegistrationClient{
	/* This is a client template for the Android side of You Can't Hide
	 * The class provides methods for sending and receiving via Sockets
	 */
		String debug="";
	 	final int PORT = 9845;
		Socket smtpSocket = null;  
		ObjectInputStream ois = null;
		InputStream is = null;
		ObjectOutputStream oos=null;
		OutputStream os=null;
		String hostname = "moxie.oswego.edu";
	
		PrintWriter out;
		Socket clientSocket = null;
		BufferedReader in=null;
		Socket echoServer = null;
		int numRequest=0;

	    public RegistrationClient(){
			
			openSocket();
		
	    }
	    
	    public static void main(String args[]){
			RegistrationClient myRegClient = new RegistrationClient();
			if(!myRegClient.userExists("6467532976")){
				System.out.println("User: 6467532976 does not exist\nattmpting player create");
				System.out.println(myRegClient.createPlayer("aman", "zoo900", "Alicia", "Manglos", "6467532976"));
			}
		}
	    
	    public void openSocket(){
			
			
			if(echoServer==null){
				try {
				   echoServer = new Socket(hostname, PORT);
				   System.out.println("opened socket");
				}
				catch (IOException e) {
				   System.out.println("Hold on IO Exception creating socket \n" + e);
				} 
			}
			else{
				System.out.println("echoServer already exists...");
			}
				
			try {
				in = new BufferedReader(new InputStreamReader(echoServer.getInputStream()));
				os = echoServer.getOutputStream();
				oos = new ObjectOutputStream(os);
				is = echoServer.getInputStream();
				ois = new ObjectInputStream(is);
			} catch (UnknownHostException e) {
				System.err.println("Don't know about host: " + hostname);
			} catch (IOException e) {
				System.err.println("Couldn't get I/O for the connection to: " + hostname);
			}
		}
	    
	    //This method takes the players phone number and checks if they're registered
	    public boolean userExists(String phoneNumber){
	    	//String result=null;
	    	Player p = null;
	    	
	    	if(phoneNumber==null){
	    		debug="null phoneNumber";
	    		return false;
	    	}
	    	
	    	System.out.println("before try client");
	    	try{
				System.out.println("in try client");
		    	oos.writeObject(new String("search:" + phoneNumber));
		    	System.out.println("in try client");
		    	p=(Player)ois.readObject();
		    	System.out.println("in try client");
		    	if(p!=null){
					System.out.println(p);
					
		    	//if(result.equalsIgnoreCase("exists")){
					debug="User Exists";
		    		return true;
				}
		    	else
		    		debug="Player with this phone number doesn't exist";
	    	
	    	}catch(IOException ioe){
	    		System.err.println(ioe);
	    	}catch(ClassNotFoundException cnfe){
				System.err.println(cnfe);
			}
	    	return false;
	    }
	    
	    
	    public boolean createPlayer(String un, String pw, String fn, String ln, String pn){
	    	
	    		String playerString="create:" + un + " " + pw + " " + fn + " " + ln + " " + pn;
	    		//String result=null;
	    		Player p=null;
					
				try {		
					oos.writeObject((String)playerString);
					p = (Player)ois.readObject();
					
					if(p!=null)
						return true;
					else
						debug="Player could not be created";
					
					is.close();
					ois.close();
					oos.close();
					os.close();
					in.close();
					echoServer.close();
					
				} catch (UnknownHostException e) {
					System.err.println("Trying to connect to unknown host: " + e);
				} catch (IOException e) {
					System.err.println("IOException:  " + e);
				} catch (ClassNotFoundException cnfe) {
					System.err.println("CNFE : " + cnfe);
				}
				
				return false;
	    }
	   
	    public String getDebug(){
	    	return debug;
	    }

}

