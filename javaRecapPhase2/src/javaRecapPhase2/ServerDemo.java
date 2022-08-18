package javaRecapPhase2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerDemo {

	public static void main(String[] args) {
		
		ServerSocket = null;
		Socket socket = null;
		Scanner
		
		
		
		ServerSocket serverSocket = new ServerSocket(8080);
		
		Socket socket = serverSocket.accept();
		
		InputStream serverInput = socket.getInputStream();
		OutputStream serverOutput = socket.getOutputStream();
		
		Scanner scanner = new Scanner(serverInput);
		PrintWriter printOnServer = new PrintWriter(new OutputStreamWriter(serverOutput), true);
		
		printOnServer.println("Hello World, Welcome to Web Application Development");
		
		boolean finished = false;
		while(!finished && scanner.hashnextLine()) {
			String InputLine = scanner.nextLine();
		//	printOnServer.println(Input:: "+ inputLine");
			System.out.println(inputLine);
			if(inputLine.equals("STOP")) {
				finished = true;
				
			}
			
		}
		
	}catch (I0Exeption e) {
		e.printStackTrace();
	}finally {
		if (serverSocket != null) {
			serverSocket.close();
		}
		if (socket != null) {
			socket.close();
		}
		if (scanner != null) {
			scanner.close();
		
	}
	

}
