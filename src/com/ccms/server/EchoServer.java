package com.ccms.server;

import java.io.*;
import java.net.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

import com.ccms.UI.CCManage;

public class EchoServer  {

	/**
	 * @throws RemoteException
	 */
	protected EchoServer() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ServerSocket s = new ServerSocket(8189);

			Socket incoming = s.accept();
			try {
				InputStream inStream = incoming.getInputStream();
				OutputStream outStream = incoming.getOutputStream();

				Scanner in = new Scanner(inStream);
				PrintWriter out = new PrintWriter(outStream, true /* autoFlush */);

				System.out.println("A remote client connected! ");

				boolean done = false;
				while (!done && in.hasNextLine()) {
					String line = in.nextLine();
					out.println("OK");
					if (line.trim().equals("magic282")) {
						done = true;
					}
				}
			} finally {
				incoming.close();
				System.out.println("Connection closed! ");
			}

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
