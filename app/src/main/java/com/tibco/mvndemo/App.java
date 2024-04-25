package com.tibco.mvndemo;

import com.tibco.mvndemo.Module1;
import com.tibco.mvndemo.Module2;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Maven Demo Application" );
        System.out.println(getVersion());
        Module1 m1 = new Module1();
        System.out.println(m1.getVersion());
        Module2 m2 = new Module2();
        System.out.println(m2.getVersion());
    }

    public static String getVersion() {
        Properties props = new Properties();
        try {
            InputStream inputStream = App.class.getResourceAsStream("/app.properties");
            if (inputStream != null) {
                props.load(inputStream);
            }
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }
        return "[App    ] " + props.getProperty("module.version");
    }
}
