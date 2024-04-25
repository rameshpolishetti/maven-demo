package com.tibco.mvndemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Module2 {
    public String getVersion() {
        Properties props = new Properties();
        try {
            InputStream inputStream = getClass().getResourceAsStream("/module2.properties");
            if (inputStream != null) {
                props.load(inputStream);
            }
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }
        return "[Module2] " + props.getProperty("module.version");
    }
}