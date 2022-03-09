package com.example.currencyexchangeapp.rest.fields;

import com.google.gson.annotations.SerializedName;

public class BSD{

	@SerializedName("code")
	private String code;

	@SerializedName("value")
	private double value;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setValue(double value){
		this.value = value;
	}

	public double getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"BSD{" + 
			"code = '" + code + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}