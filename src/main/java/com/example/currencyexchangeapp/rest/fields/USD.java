package com.example.currencyexchangeapp.rest.fields;

import com.google.gson.annotations.SerializedName;

public class USD{

	@SerializedName("code")
	private String code;

	@SerializedName("value")
	private int value;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setValue(int value){
		this.value = value;
	}

	public int getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"USD{" + 
			"code = '" + code + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}