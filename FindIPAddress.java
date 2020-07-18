package com.test.com;

import java.net.*; 
import java.io.*; 
import java.util.*; 
import java.net.InetAddress; 

public class FindIPAddress
{ 
	public static void main(String args[]) throws UnknownHostException
	{ 
		InetAddress localhost = InetAddress.getLocalHost(); 
		System.out.println("System IP Address : " + (localhost.getHostAddress()).trim()); 
	} 
} 
