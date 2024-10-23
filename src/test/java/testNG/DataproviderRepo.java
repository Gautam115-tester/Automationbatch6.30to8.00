package testNG;

import org.testng.annotations.DataProvider;

public class DataproviderRepo {

	@DataProvider
	public String[] getdata() {
		
		String[] data  =  new String[5];
		
		data[0] = "mobile";
		data[1] = "tv";
		data[2] = "shoes";
		data[3] = "earphones";
		data[4] = "laptop";
		
		return data;	
	}
}
