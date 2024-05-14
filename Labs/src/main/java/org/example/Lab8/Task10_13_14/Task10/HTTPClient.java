package org.example.Lab8.Task10_13_14.Task10;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HTTPClient {
    private String URLAddress;

    public String getURLAddress() {
        return URLAddress;
    }

    public void setURLAddress(String URLAddress) {
        this.URLAddress = URLAddress;
    }

    public HTTPClient(String URLAddress) {
        this.URLAddress = URLAddress;
    }

    public String GetResponse() throws Exception{
        if(URLAddress.isEmpty())
            throw new Exception("ERROR: No URL");

        String result = "";
        try {
            URL url = new URL(URLAddress);
            URLConnection urlConnection = url.openConnection();

            Map<String, List<String>> headers = urlConnection.getHeaderFields();
            PrintHeaders(headers);

            urlConnection.connect();

            result = GetPageContent(urlConnection);
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }

    public void PrintHeaders(Map<String, List<String>> headers){
        for(Map.Entry<String, List<String>> entry : headers.entrySet()){
            String key = entry.getKey();
            for(String value : entry.getValue())
                System.out.println(key + ": " + value);
        }
    }

    public String GetPageContent(URLConnection urlConnection){
        String encoding = urlConnection.getContentEncoding();
        if(encoding == null)
            encoding = "UTF-8";

        StringBuilder pageContent = new StringBuilder("");
        try (Scanner in = new Scanner(urlConnection.getInputStream(), encoding)){
            while (in.hasNextLine()){
                pageContent.append(in.nextLine() + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return pageContent.toString();
    }
}
