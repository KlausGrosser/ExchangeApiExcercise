package com.example.currencyexchangeapp.rest.fields;

import com.google.gson.annotations.SerializedName;

public class HKD{

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
			"HKD{" + 
			"code = '" + code + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}