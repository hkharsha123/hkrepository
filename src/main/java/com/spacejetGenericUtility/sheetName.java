package com.spacejetGenericUtility;

public enum sheetName {

	       HOMEPAGE("homepage");
	private String keys;
	private sheetName(String keys)
	{
		this.keys=keys;
		
	}
	
	public String converTostring()
	{
		return keys.toString();
	}
	
}
