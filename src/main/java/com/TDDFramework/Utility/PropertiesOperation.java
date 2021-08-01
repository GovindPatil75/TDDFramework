package com.TDDFramework.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

public class PropertiesOperation {
	
	//we load the Properties file
	static Properties pro=new Properties();
			
 public static String getvalusebasedonKey(String key) throws Exception {
		String filepath=System.getProperty("user.dir")+"\\PropertiesFile\\config.Properties";
			
		File file=new File(filepath);
		FileInputStream fis=new FileInputStream(file);
	    pro.load(fis);
		String value=pro.get(key).toString();
		if(StringUtils.isEmpty(value)) {
			throw new Exception("Value is not Specified for Key:" +key+" ");
		}
		return value;
	}
}
