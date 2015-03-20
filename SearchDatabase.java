package com.Path;

import java.util.List;
import java.util.Map;

/**
 * Created by tprashan on 3/20/2015.
 */
public class SearchDatabase {

    public static Boolean isCityPresentInDB(String file,String src){
        Map<String,List<String>> db =  FileReader.createDataBaseFromFileInput(file);
        for(String city: db.keySet())
            if(city.equals(src) || db.get(city).contains(src)) return true;
        return false;
    }
}
