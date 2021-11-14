package chap15.sec04.exam03;

import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) {
        Properties properties = new Properties();
        String path = PropertiesExample.class.getResource("database.properties").getPath();
        try {
            path = URLDecoder.decode(path, "utf-8");
        } catch(UnsupportedEncodingException e) {
        }
        try {
            properties.load(new FileReader(path));
        } catch(IOException e) {
        }
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("driver = " + driver);
        System.out.println("url = " + url);
        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }
}
