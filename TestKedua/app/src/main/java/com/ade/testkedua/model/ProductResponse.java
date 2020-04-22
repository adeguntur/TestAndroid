package com.ade.testkedua.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ProductResponse{

	@SerializedName("ProductData")
	private ArrayList<ProductDataItem> productData;

	public ArrayList<ProductDataItem> getProductData(){
		return productData;
	}

	public void setProductData(ArrayList<ProductDataItem> productData){
		this.productData = productData;
	}

//	@SerializedName("Meta")
//	private Meta meta;
//
//	@SerializedName("Count")
//	private int count;
//
//	public void setMeta(Meta meta){
//		this.meta = meta;
//	}
//
//	public Meta getMeta(){
//		return meta;
//	}
//
//	public void setCount(int count){
//		this.count = count;
//	}
//
//	public int getCount(){
//		return count;
//	}

}