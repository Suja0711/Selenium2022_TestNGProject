package org.dataprovider;

import org.testng.annotations.DataProvider;

public class DataSet {

	
	@DataProvider(name="login")
	private Object[][] loginData(){
		
		Object[][] obj = new Object[][] {
			{"varshini", "varsh1234"},
			{"oliver", "oliv5600"},
			{"Kannan", "ka3456an"},
			{"prasanna","000uiy78"}
		};
		return obj;
	}
}
