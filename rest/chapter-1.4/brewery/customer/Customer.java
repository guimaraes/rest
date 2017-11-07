package br.com.brewery.customer;

import java.io.*;
import java.net.URL;
public class Customer {
   public static void main(String[] args) throws IOException {
       String path = "file:///Users/guimaraes/Google%20Drive/Study/REST/
       rest/chapter-1.4/customers.xml";
        URL url = new URL(path);
        InputStream inputStream = url.openConnection().getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        } 
    }
}