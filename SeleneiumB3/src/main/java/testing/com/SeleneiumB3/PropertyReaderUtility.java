package testing.com.SeleneiumB3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReaderUtility {
	
	String baseurl;
	String getPwtWithid;
	String createpet;
	public String getBaseurl() {
		return baseurl;
	}
	public String getGetPwtWithid() {
		return getPwtWithid;
	}
	public String getCreatepet() {
		return createpet;
	}
	
	public PropertyReaderUtility() throws FileNotFoundException, IOException
	{
		Properties props=new Properties();
		props.load(new FileReader(new File("./data/env.properties")));
		baseurl=props.getProperty("baseurl");
		getPwtWithid=props.getProperty("getpetwithid");
		createpet=props.getProperty("createpet");
	}
	

}
