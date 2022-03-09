package com.example.currencyexchangeapp.rest.fields;

import com.google.gson.annotations.SerializedName;

public class Meta{

	@SerializedName("last_updated_at")
	private String lastUpdatedAt;

	public void setLastUpdatedAt(String lastUpdatedAt){
		this.lastUpdatedAt = lastUpdatedAt;
	}

	public String getLastUpdatedAt(){
		return lastUpdatedAt;
	}

	@Override
 	public String toString(){
		return 
			"Meta{" + 
			"last_updated_at = '" + lastUpdatedAt + '\'' + 
			"}";
		}
}