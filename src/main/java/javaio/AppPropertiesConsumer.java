package javaio;

import java.io.IOException;

public class AppPropertiesConsumer {

   static AppProperties appProperties = new AppProperties();

    public static void main(String[] args) throws IOException {
       login();

    }

    public static void login() throws IOException {
        System.out.println("Pass username : " + appProperties.loadProperties().getProperty("userName"));
        System.out.println("Pass your password: " + appProperties.loadProperties().getProperty("password"));
    }
}
