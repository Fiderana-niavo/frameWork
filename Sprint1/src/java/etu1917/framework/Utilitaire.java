package etu1917.framework;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fiderana
 */
import java.net.*;

public class Utilitaire {

    public int getIndiceSlash(String url) {
        char[] urlToArray = url.toCharArray();
        for (int i = 0; i < urlToArray.length; i++) {
            if (String.valueOf(urlToArray[i]).equals("/")) {
                return i;
            }
        }
        return -1;
    }

    public String getPostUrl(String urlFile)throws Exception {
        URL url = new URL(urlFile);
        String directory = String.valueOf(url.getFile());
        System.out.print(directory);
        String[] urlTable = directory.trim().split("/");
        String valiny = "";
        if (urlTable.length > 1) {
            valiny = urlTable[2];

        }
        for (int i = 3; i < urlTable.length; i++) {
            valiny=valiny+"/"+urlTable[i];
        }
        return valiny;
    }
}
