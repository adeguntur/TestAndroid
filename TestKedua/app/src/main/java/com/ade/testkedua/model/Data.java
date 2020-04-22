package com.ade.testkedua.model;

import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("DateOfBirth")
	private String dateOfBirth;

	@SerializedName("Email")
	private String email;

	@SerializedName("Telephone")
	private String telephone;

	@SerializedName("Address")
	private Object address;

	@SerializedName("ZipCode")
	private Object zipCode;

	@SerializedName("City")
	private Object city;

	@SerializedName("Gender")
	private int gender;

	@SerializedName("Province")
	private Object province;

	@SerializedName("Created")
	private String created;

	@SerializedName("Name")
	private String name;

	@SerializedName("Type")
	private String type;

	@SerializedName("ProvinceID")
	private int provinceID;

	@SerializedName("CityID")
	private int cityID;

	@SerializedName("Phone")
	private String phone;

	@SerializedName("IsReseller")
	private boolean isReseller;

	@SerializedName("ID")
	private int iD;

	public void setDateOfBirth(String dateOfBirth){
		this.dateOfBirth = dateOfBirth;
	}

	public String getDateOfBirth(){
		return dateOfBirth;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setTelephone(String telephone){
		this.telephone = telephone;
	}

	public String getTelephone(){
		return telephone;
	}

	public void setAddress(Object address){
		this.address = address;
	}

	public Object getAddress(){
		return address;
	}

	public void setZipCode(Object zipCode){
		this.zipCode = zipCode;
	}

	public Object getZipCode(){
		return zipCode;
	}

	public void setCity(Object city){
		this.city = city;
	}

	public Object getCity(){
		return city;
	}

	public void setGender(int gender){
		this.gender = gender;
	}

	public int getGender(){
		return gender;
	}

	public void setProvince(Object province){
		this.province = province;
	}

	public Object getProvince(){
		return province;
	}

	public void setCreated(String created){
		this.created = created;
	}

	public String getCreated(){
		return created;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setProvinceID(int provinceID){
		this.provinceID = provinceID;
	}

	public int getProvinceID(){
		return provinceID;
	}

	public void setCityID(int cityID){
		this.cityID = cityID;
	}

	public int getCityID(){
		return cityID;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setIsReseller(boolean isReseller){
		this.isReseller = isReseller;
	}

	public boolean isIsReseller(){
		return isReseller;
	}

	public void setID(int iD){
		this.iD = iD;
	}

	public int getID(){
		return iD;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"dateOfBirth = '" + dateOfBirth + '\'' + 
			",email = '" + email + '\'' + 
			",telephone = '" + telephone + '\'' + 
			",address = '" + address + '\'' + 
			",zipCode = '" + zipCode + '\'' + 
			",city = '" + city + '\'' + 
			",gender = '" + gender + '\'' + 
			",province = '" + province + '\'' + 
			",created = '" + created + '\'' + 
			",name = '" + name + '\'' + 
			",type = '" + type + '\'' + 
			",provinceID = '" + provinceID + '\'' + 
			",cityID = '" + cityID + '\'' + 
			",phone = '" + phone + '\'' + 
			",isReseller = '" + isReseller + '\'' + 
			",iD = '" + iD + '\'' + 
			"}";
		}
}