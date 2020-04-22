package com.ade.testkedua.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class RumahSakit{

	@SerializedName("rumahsakit")
	private ArrayList<RumahsakitItem> rumahsakit;

	public void setRumahsakit(ArrayList<RumahsakitItem> rumahsakit){
		this.rumahsakit = rumahsakit;
	}

	public ArrayList<RumahsakitItem> getRumahsakit(){
		return rumahsakit;
	}

}