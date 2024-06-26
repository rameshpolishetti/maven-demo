package com.tibco.mvndemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Module1 {
    public String getVersion() {
        Properties props = new Properties();
        try {
            InputStream inputStream = getClass().getResourceAsStream("/module1.properties");
            if (inputStream != null) {
                props.load(inputStream);
            }
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }
        return "[Module1] " + props.getProperty("module.version");
    }
}