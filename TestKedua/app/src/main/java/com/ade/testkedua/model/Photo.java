package com.ade.testkedua.model;

import com.google.gson.annotations.SerializedName;

public class Photo{

	@SerializedName("Small")
	private String small;

	@SerializedName("Medium")
	private String medium;

	@SerializedName("ID")
	private int iD;

	@SerializedName("Original")
	private String original;

	public void setSmall(String small){
		this.small = small;
	}

	public String getSmall(){
		return small;
	}

	public void setMedium(String medium){
		this.medium = medium;
	}

	public String getMedium(){
		return medium;
	}

	public void setID(int iD){
		this.iD = iD;
	}

	public int getID(){
		return iD;
	}

	public void setOriginal(String original){
		this.original = original;
	}

	public String getOriginal(){
		return original;
	}

	@Override
 	public String toString(){
		return 
			"Photo{" + 
			"small = '" + small + '\'' + 
			",medium = '" + medium + '\'' + 
			",iD = '" + iD + '\'' + 
			",original = '" + original + '\'' + 
			"}";
		}
}