package com.netenrich;

public class DatabaseDetails {
	private String database_url = "jdbc:mysql://r";
	private String database_username = "";
	private String database_password = "";
	public String Databaseurl(){
		return database_url;
		
	}
	public String Databaseusername(){
		return database_username;
	}
	public String Databasepassword(){
		return database_password;
	}
}
