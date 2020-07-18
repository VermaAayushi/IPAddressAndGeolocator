package com.test.com;

import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;
public class ReadingJSONFile {
   public static void main(String[] args) throws IOException {
      JSONParser parser = new JSONParser();
      	try{
      		//parsing json file
		//to handle JsonParseException
      		Object obj = parser.parse(new FileReader("/E:/output.json"));
		//FileNotFoundException may occur
            JSONObject jsonObject = (JSONObject)obj;
            //getting the information from the json file
            String countryCode = (String)jsonObject.get("countryCode");
            String countryName = (String)jsonObject.get("countryName");
            String regionName = (String)jsonObject.get("regionName");
            String cityName = (String)jsonObject.get("cityName");
            String zipCode = (String)jsonObject.get("zipCode");
            String latitude = (String)jsonObject.get("latitude");
            String longitude = (String)jsonObject.get("longitude");
            String timeZone = (String)jsonObject.get("timeZone");
            //printing the information
            System.out.println("Country Code: " + countryCode);
            System.out.println("Country Name: " + countryName);
            System.out.println("Region Name: " + regionName);
            System.out.println("Zip Code: " + zipCode);
            System.out.println("latitude: " + latitude);
            System.out.println("longitude: " + longitude);
            System.out.println("timeZone: " + timeZone);
            
            
      	}
         catch(Exception e){
        	 e.printStackTrace();
         }
   }
}
