package com.ade.testkedua.model;

import com.google.gson.annotations.SerializedName;
public class Meta{

	@SerializedName("Message")
	private String message;

	@SerializedName("Code")
	private int code;

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setCode(int code){
		this.code = code;
	}

	public int getCode(){
		return code;
	}

	@Override
 	public String toString(){
		return 
			"Meta{" + 
			"message = '" + message + '\'' + 
			",code = '" + code + '\'' + 
			"}";
		}
}