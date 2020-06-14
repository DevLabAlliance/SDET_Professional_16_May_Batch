package data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvider {
	
	@Test(dataProvider = "positive data")
	public void myTest(String fname, String lname) {
		System.out.print(fname);
		System.out.println(lname);
	}
	
	@DataProvider(name = "positive data")
	public String[][] myData() {
		
		String[][] data = new String[3][2];
		data[0][0] = "koushik";
		data[0][1] = "chatterjee";
		
		data[1][0] = "raja";
		data[1][1] = "asjhokas";
		
		data[2][0] = "as";
		data[2][1] = "417547";
		
		return data;
		
	}

}
