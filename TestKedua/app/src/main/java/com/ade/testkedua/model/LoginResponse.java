package com.ade.testkedua.model;

import com.google.gson.annotations.SerializedName;

public class LoginResponse{

	@SerializedName("Meta")
	private Meta meta;

	@SerializedName("AccessToken")
	private String accessToken;

	@SerializedName("Data")
	private Data data;

	public void setMeta(Meta meta){
		this.meta = meta;
	}

	public Meta getMeta(){
		return meta;
	}

	public void setAccessToken(String accessToken){
		this.accessToken = accessToken;
	}

	public String getAccessToken(){
		return accessToken;
	}

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	@Override
 	public String toString(){
		return 
			"LoginResponse{" + 
			"meta = '" + meta + '\'' + 
			",accessToken = '" + accessToken + '\'' + 
			",data = '" + data + '\'' + 
			"}";
		}
}