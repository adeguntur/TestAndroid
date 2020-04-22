package com.ade.testkedua.model;

import com.google.gson.annotations.SerializedName;

public class WholesalePriceItem{

	@SerializedName("Price")
	private int price;

	@SerializedName("QtyMax")
	private int qtyMax;

	@SerializedName("QtyMin")
	private int qtyMin;

	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return price;
	}

	public void setQtyMax(int qtyMax){
		this.qtyMax = qtyMax;
	}

	public int getQtyMax(){
		return qtyMax;
	}

	public void setQtyMin(int qtyMin){
		this.qtyMin = qtyMin;
	}

	public int getQtyMin(){
		return qtyMin;
	}

	@Override
 	public String toString(){
		return 
			"WholesalePriceItem{" + 
			"price = '" + price + '\'' + 
			",qtyMax = '" + qtyMax + '\'' + 
			",qtyMin = '" + qtyMin + '\'' + 
			"}";
		}
}