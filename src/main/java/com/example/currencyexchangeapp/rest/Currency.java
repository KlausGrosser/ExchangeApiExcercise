package com.example.currencyexchangeapp.rest;

import com.example.currencyexchangeapp.rest.fields.Data;
import com.example.currencyexchangeapp.rest.fields.Meta;
import com.google.gson.annotations.SerializedName;

public class Currency {

	@SerializedName("data")
	private Data data;

	@SerializedName("meta")
	private Meta meta;

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setMeta(Meta meta){
		this.meta = meta;
	}

	public Meta getMeta(){
		return meta;
	}

	@Override
 	public String toString(){
		return 
			"Currency{" +
			"data = '" + data + '\'' + 
			",meta = '" + meta + '\'' + 
			"}";
		}
}