package com.Path;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;


public class FileReader {
    public static Map<String,List<String>> createDataBaseFromFileInput(String fileName){
        Map<String,List<String>> cityDB = new HashMap<String,List<String>>();
        File inFile = new File(fileName);
        try{
            FileInputStream fileStream = new FileInputStream(inFile);
            BufferedReader br = new BufferedReader(new InputStreamReader(fileStream));
            String strLine=br.readLine();
            while ( strLine != null)   {
                String[] cities = strLine.split(",");
                if(cityDB.containsKey(cities[0])){
                    List destination =  cityDB.get(cities[0]);
                    destination.add(cities[1]);
                }else{
                    cityDB.put(cities[0], new ArrayList<String>(Arrays.asList(cities[1])));
                }
                strLine = br.readLine();
            }

        }catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }
        return cityDB;
    }
}
