package com.Path;

import java.util.List;
import java.util.Map;

/**
 * Created by tprashan on 3/20/2015.
 */
public class SearchDatabase {
    public static Boolean isCityPresentInDatabase(String src){
        Database database = new Database();
        Map<String,List<String>> db =  database.createDataBase();
        for(String city: db.keySet())
            if(city.equals(src) || db.get(city).contains(src)) return true;
        return false;
    }
}
