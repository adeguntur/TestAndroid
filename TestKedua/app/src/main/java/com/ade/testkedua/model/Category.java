package com.ade.testkedua.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;
public class Category{

	@SerializedName("URLSegment")
	private String uRLSegment;

	@SerializedName("Title")
	private String title;

	@SerializedName("Photo")
	private Photo photo;

	@SerializedName("ID")
	private int iD;

	@SerializedName("Child")
	private List<Object> child;

	public void setURLSegment(String uRLSegment){
		this.uRLSegment = uRLSegment;
	}

	public String getURLSegment(){
		return uRLSegment;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setPhoto(Photo photo){
		this.photo = photo;
	}

	public Photo getPhoto(){
		return photo;
	}

	public void setID(int iD){
		this.iD = iD;
	}

	public int getID(){
		return iD;
	}

	public void setChild(List<Object> child){
		this.child = child;
	}

	public List<Object> getChild(){
		return child;
	}

	@Override
 	public String toString(){
		return 
			"Category{" + 
			"uRLSegment = '" + uRLSegment + '\'' + 
			",title = '" + title + '\'' + 
			",photo = '" + photo + '\'' + 
			",iD = '" + iD + '\'' + 
			",child = '" + child + '\'' + 
			"}";
		}
}