package data;

import utilities.Xls_Reader;

public class DataFile {
	
	
	Xls_Reader d = new Xls_Reader("D:\\testing\\testing\\NikulTest.xlsx");

	//loginpage
	public String correctEmail = d.getCellData("Data1", "Username", 2);
	public String wrongPassword = d.getCellData("Data1", "Password", 2);
	public String wrongEmail = d.getCellData("Data1", "Username", 3);
	public String passwordErrMsg = d.getCellData("Data1", "Password Error", 2);
	public String emailErrMsg = d.getCellData("Data1", "Email Error", 2);
	
	
	//footer Page
	
	//add to cart
	
	
	//checkout
	
	//Search

}
