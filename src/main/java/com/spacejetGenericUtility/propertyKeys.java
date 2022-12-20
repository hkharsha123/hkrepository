package com.spacejetGenericUtility;

public enum propertyKeys {

	CHROME("chrome"),URL("url"),FIREFOX("firefox");
	
	private String keys;
	private propertyKeys(String keys)
	{
		this.keys=keys;
	}
	public String converToString()
	{
		return keys.toString();
	}
}
