package com.Path;

public class SearchRoutes {

    public Boolean findRoutes(String src, String des) throws Exception {
        if(!SearchDatabase.isCityPresentInDatabase(src))
            throw new Exception("No city Named : "+ src +" in database.");
        if(!SearchDatabase.isCityPresentInDatabase(des))
            throw new Exception("No city Named : "+des +" in database.");
        return null;
    }
}
