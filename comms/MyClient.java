/* This is a client template for the Android side of You Cant Hide
 * The class provides methods for sending and recieving via Sockets
 */
import java.io.*;
import java.net.*;
import java.util.Scanner;
 
public class MyClient {
	static int PORT = 4890; // You will need to change this port to match your server port
	static Socket smtpSocket = null;  
	static DataOutputStream dos = null;
	static DataInputStream dis = null;
	static String hostname = "localhost";
	
	//in order to send and recieve objects over the socket
	//here we need an ObjectOutputSteam... i believe.
	static DataInputStream is;
	static PrintWriter out;
	static Socket clientSocket = null;
	static BufferedReader in=null;
	static Socket echoServer = null;
	static int numRequest=0;

    public static void main(String[] args) {
		
		smtpSocket=null;
		dos=null;
		dis=null;
		is=null;
		out=null;
		clientSocket=null;
		in=null;
		echoServer=null;
		
		openSocket();

		//method to change for your use
		queryServer();

	
    }
    
    static void openSocket(){
		
		
		if(echoServer==null){
			try {
			   echoServer = new Socket("localhost", PORT);
			   System.out.println("opened socket");
			}
			catch (IOException e) {
			   System.out.println("Hold on IO Exception creating socket \n" + e);
			} 
		}
		else{
			System.out.println("echoServer already exists...");
		}
		
		if (smtpSocket == null && dos == null && dis == null) {
			try {
				in = new BufferedReader(new InputStreamReader(echoServer.getInputStream()));
				out = new PrintWriter(echoServer.getOutputStream(), true);

			} catch (UnknownHostException e) {
				System.err.println("Don't know about host: " + hostname);
			} catch (IOException e) {
				System.err.println("Couldn't get I/O for the connection to: " + hostname);
			}
		}
	}          

	
    static void queryServer(){
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Commands:\n1)create:username-password-firstname-lastname-phonenumber to create a player\n2)search:username to check if player exists\n");
		String input=null;
			
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(in.readLine());
			}
			
			/* This while loop is taking input strings, and writing them
			 * to the serverport, then println the server response
			 */
			while(true){
				input = scan.nextLine();
				
				if(input.equals("exit"))
					break;
				
				out.println(input); //writing input string to port
				System.out.println(in.readLine()); //reading from server... NOTE: this in.readLine() waits automatically until it receives something
				
			}
			
			//once out of the loop (by typing exit) we close all of the streams
			if(input!=null && input.equalsIgnoreCase("exit")){
				dis.close();
				dos.close();
				is.close();
				out.close();
				in.close();
				smtpSocket.close();
				clientSocket.close();
				echoServer.close();
			}
			
			
							 
		} catch (UnknownHostException e) {
			System.err.println("Trying to connect to unknown host: " + e);
		} catch (IOException e) {
			System.err.println("IOException:  " + e);
		}
    }
   
}
