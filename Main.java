package com.Path;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)throws Exception{
        int fileIndex = Arrays.asList(args).indexOf("-f");
        int countryFileIndex = Arrays.asList(args).indexOf("-c");
        int allRoutesIndex = Arrays.asList(args).indexOf("-a");
        int length = args.length;
        try{
            SearchRoutes searchRoutes = new SearchRoutes();
            Boolean path = searchRoutes.findRoutes(args[0], args[1],args[2]);
            System.out.println(path);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
