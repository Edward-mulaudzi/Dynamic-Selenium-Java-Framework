package project.utils;

import org.apache.commons.lang3.StringUtils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileOperations {
    static Properties properties = new Properties();
    public static String getPropertyValueByKey(String key) {

        String propFilePath = System.getProperty("user.dir")+"/src/test/resources/propertyFile.properties";
        FileInputStream file;
        try {
            file = new FileInputStream(propFilePath);
            properties.load(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String value = properties.get(key).toString();

        if(StringUtils.isEmpty(value)) {
            try {
                throw new Exception("Value is not specified for key: "+key + " in properties file.");
            }catch(Exception e) {}
        }
        return value;
    }

}
