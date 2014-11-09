package com.exmple.insta2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dist_bank {
	int i = 0,ch3;
	String bname[] = { "Kumaraswamy Layout", "HSR Layout", "ISRO Layout",
			"Bellandur" };
	int dist[] = { 25, 15, 28, 10, 6 };
	int time[] = { 40, 20, 55, 15, 10 };

	public static void main(String args[]) throws IOException {
		int s = 1, ch, j = 0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Dist_bank ob = new Dist_bank();

		int ch2 = Integer.parseInt(in.readLine());

		//ob.getDistNTime();

		while (s == 1) {
			ob.token2();
			System.out
					.println("Do you want to generate new token ?\n 1. Yes 2. No");
			ch = Integer.parseInt(in.readLine());
			switch (ch) {
			case 2:
				j = 1;
				break;
			default:
				System.out.println("Generating new token\n");
			}
			if (j == 1)
				break;
		}
	}

	public synchronized int token2() {
	return i++;
	}

	public void auto() {
		System.out.println("Bank:" + bname[4]);
		System.out.println("Distance: " + dist[4]);
		System.out.println("Time to reach" + time[4]);
	}

	public String getDistNTime(String loc) throws IOException {
		int a; 
		int timer=0;
		
		if(loc =="Bellandur"){
		
			timer = time[1];
			
		}
		else 
			if(loc =="HSR Layout"){
				
				timer = time[2];
			}
			else if(loc =="Kumarswamy Layout"){
				
				timer = time[3];
			}
			else if(loc =="ISRO Layout"){
				
				timer = time[4];
			}
				
		String str = new Integer(timer).toString();
		return str;
	}
}
