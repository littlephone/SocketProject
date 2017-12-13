package com.socket.linkage;

import java.util.Scanner;

public class Linkage{
	public static void main(String args[]) {
		int mode;
		System.out.println("Please Select Mode:\n1. Client\n2. Server");
		Scanner scan = new Scanner(System.in);
		mode = scan.nextInt();
		scan.close();
		switch (mode){
		case 1: 
			Client cli = new Client();
			cli.setupClient();
			break;
		case 2:
			System.out.println("Setting up to become a server! ");
		}
	}

}