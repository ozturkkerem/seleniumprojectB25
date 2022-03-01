package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {





















    //1- Create the object of Properties
    private static Properties properties = new Properties();

    static {
        try {
        //2- We need to open the file in java memory: FileInput Stream
        FileInputStream file = new FileInputStream("configuration.properties");

        //3- Load the properties object using FileInputStream
            properties.load(file);

        //close the file
        file.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found in the ConfigurationReader class. ");
        }
    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }


}
