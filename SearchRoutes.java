package com.Path;

public class SearchRoutes {

    public Boolean findRoutes(String file,String src, String des) throws Exception {
        if(!SearchDatabase.isCityPresentInDB(file,src))
            throw new Exception("No city Named : "+ src +" in database.");
        if(!SearchDatabase.isCityPresentInDB(file,des))
            throw new Exception("No city Named : "+des +" in database.");
        return null;
    }
}
