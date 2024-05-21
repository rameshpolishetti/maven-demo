package com.tibco.mvndemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Module2 {
    private static final Logger logger = LogManager.getLogger(Module2.class);
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
        String version = "Version = " + props.getProperty("module.version");
        logger.info(version);
        return version;
    }
}