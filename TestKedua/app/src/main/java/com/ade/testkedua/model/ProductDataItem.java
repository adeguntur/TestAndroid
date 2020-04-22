package com.ade.testkedua.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ProductDataItem{

	@SerializedName("CashbackMaximum")
	private int cashbackMaximum;

//	@SerializedName("CashbackEffectiveEndDate")
//	private Object cashbackEffectiveEndDate;

//	@SerializedName("Category")
//	private Category category;

//	@SerializedName("RedeemDayLimit")
//	private int redeemDayLimit;
//
//	@SerializedName("Rating")
//	private Object rating;
//
//	@SerializedName("MetaKeywords")
//	private Object metaKeywords;
//
//	@SerializedName("Label")
//	private List<Object> label;
//
	@SerializedName("Photo")
	private Photo photo;
//
//	@SerializedName("Unit")
//	private Object unit;

	@SerializedName("PriceReseller")
	private int priceReseller;

	@SerializedName("PriceInfo")
	private String priceInfo;

//	@SerializedName("Photos")
//	private List<Object> photos;

	@SerializedName("LastEdited")
	private String lastEdited;

//	@SerializedName("MetaDescription")
//	private Object metaDescription;

	@SerializedName("Supplier")
	private String supplier;

	@SerializedName("ID")
	private int iD;

	@SerializedName("HowToRedeem")
	private Object howToRedeem;

	@SerializedName("URLSegment")
	private String uRLSegment;

	@SerializedName("PriceSpecialMember")
	private int priceSpecialMember;

//	@SerializedName("LimitTimeEnd")
//	private Object limitTimeEnd;

	@SerializedName("ProductCode")
	private String productCode;

//	@SerializedName("VideoScript")
//	private Object videoScript;

	@SerializedName("MinOrderQty")
	private int minOrderQty;

	@SerializedName("Title")
	private String title;

	@SerializedName("Spesifikasi")
	private String spesifikasi;

	@SerializedName("Cashback")
	private int cashback;

	@SerializedName("Point")
	private int point;

//	@SerializedName("CashbackEffectiveStartDate")
//	private Object cashbackEffectiveStartDate;

	@SerializedName("IsFeatured")
	private boolean isFeatured;

	@SerializedName("PriceDiscount")
	private int priceDiscount;

	@SerializedName("Weight")
	private int weight;

	@SerializedName("PriceBase")
	private int priceBase;

	@SerializedName("ShowStock")
	private boolean showStock;

//	@SerializedName("SpecialProductCode")
//	private Object specialProductCode;

	@SerializedName("Brand")
	private String brand;

//	@SerializedName("TermsConditions")
//	private Object termsConditions;

	@SerializedName("Price")
	private int price;

	@SerializedName("Volume")
	private int volume;

//	@SerializedName("Content")
//	private Object content;

//	@SerializedName("WholesalePrice")
//	private List<WholesalePriceItem> wholesalePrice;

	@SerializedName("PriceFinal")
	private int priceFinal;

	@SerializedName("Stock")
	private int stock;

	@SerializedName("Link")
	private String link;

	public void setCashbackMaximum(int cashbackMaximum){
		this.cashbackMaximum = cashbackMaximum;
	}

	public int getCashbackMaximum(){
		return cashbackMaximum;
	}

//	public void setCashbackEffectiveEndDate(Object cashbackEffectiveEndDate){
//		this.cashbackEffectiveEndDate = cashbackEffectiveEndDate;
//	}
//
//	public Object getCashbackEffectiveEndDate(){
//		return cashbackEffectiveEndDate;
//	}
//
//	public void setCategory(Category category){
//		this.category = category;
//	}
//
//	public Category getCategory(){
//		return category;
//	}
//
//	public void setRedeemDayLimit(int redeemDayLimit){
//		this.redeemDayLimit = redeemDayLimit;
//	}
//
//	public int getRedeemDayLimit(){
//		return redeemDayLimit;
//	}
//
//	public void setRating(Object rating){
//		this.rating = rating;
//	}
//
//	public Object getRating(){
//		return rating;
//	}
//
//	public void setMetaKeywords(Object metaKeywords){
//		this.metaKeywords = metaKeywords;
//	}
//
//	public Object getMetaKeywords(){
//		return metaKeywords;
//	}
//
//	public void setLabel(List<Object> label){
//		this.label = label;
//	}
//
//	public List<Object> getLabel(){
//		return label;
//	}
//
	public void setPhoto(Photo photo){
		this.photo = photo;
	}

	public Photo getPhoto(){
		return photo;
	}
//
//	public void setUnit(Object unit){
//		this.unit = unit;
//	}
//
//	public Object getUnit(){
//		return unit;
//	}

	public void setPriceReseller(int priceReseller){
		this.priceReseller = priceReseller;
	}

	public int getPriceReseller(){
		return priceReseller;
	}

	public void setPriceInfo(String priceInfo){
		this.priceInfo = priceInfo;
	}

	public String getPriceInfo(){
		return priceInfo;
	}
//
//	public void setPhotos(List<Object> photos){
//		this.photos = photos;
//	}
//
//	public List<Object> getPhotos(){
//		return photos;
//	}

	public void setLastEdited(String lastEdited){
		this.lastEdited = lastEdited;
	}

	public String getLastEdited(){
		return lastEdited;
	}
//
//	public void setMetaDescription(Object metaDescription){
//		this.metaDescription = metaDescription;
//	}
//
//	public Object getMetaDescription(){
//		return metaDescription;
//	}

	public void setSupplier(String supplier){
		this.supplier = supplier;
	}

	public String getSupplier(){
		return supplier;
	}

	public void setID(int iD){
		this.iD = iD;
	}

	public int getID(){
		return iD;
	}

	public void setHowToRedeem(Object howToRedeem){
		this.howToRedeem = howToRedeem;
	}

	public Object getHowToRedeem(){
		return howToRedeem;
	}

	public void setURLSegment(String uRLSegment){
		this.uRLSegment = uRLSegment;
	}

	public String getURLSegment(){
		return uRLSegment;
	}

	public void setPriceSpecialMember(int priceSpecialMember){
		this.priceSpecialMember = priceSpecialMember;
	}

	public int getPriceSpecialMember(){
		return priceSpecialMember;
	}
//
//	public void setLimitTimeEnd(Object limitTimeEnd){
//		this.limitTimeEnd = limitTimeEnd;
//	}
//
//	public Object getLimitTimeEnd(){
//		return limitTimeEnd;
//	}

	public void setProductCode(String productCode){
		this.productCode = productCode;
	}

	public String getProductCode(){
		return productCode;
	}

//	public void setVideoScript(Object videoScript){
//		this.videoScript = videoScript;
//	}
//
//	public Object getVideoScript(){
//		return videoScript;
//	}

	public void setMinOrderQty(int minOrderQty){
		this.minOrderQty = minOrderQty;
	}

	public int getMinOrderQty(){
		return minOrderQty;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setSpesifikasi(String spesifikasi){
		this.spesifikasi = spesifikasi;
	}

	public String getSpesifikasi(){
		return spesifikasi;
	}

	public void setCashback(int cashback){
		this.cashback = cashback;
	}

	public int getCashback(){
		return cashback;
	}

	public void setPoint(int point){
		this.point = point;
	}

	public int getPoint(){
		return point;
	}

//	public void setCashbackEffectiveStartDate(Object cashbackEffectiveStartDate){
//		this.cashbackEffectiveStartDate = cashbackEffectiveStartDate;
//	}
//
//	public Object getCashbackEffectiveStartDate(){
//		return cashbackEffectiveStartDate;
//	}

	public void setIsFeatured(boolean isFeatured){
		this.isFeatured = isFeatured;
	}

	public boolean isIsFeatured(){
		return isFeatured;
	}

	public void setPriceDiscount(int priceDiscount){
		this.priceDiscount = priceDiscount;
	}

	public int getPriceDiscount(){
		return priceDiscount;
	}

	public void setWeight(int weight){
		this.weight = weight;
	}

	public int getWeight(){
		return weight;
	}

	public void setPriceBase(int priceBase){
		this.priceBase = priceBase;
	}

	public int getPriceBase(){
		return priceBase;
	}

	public void setShowStock(boolean showStock){
		this.showStock = showStock;
	}

	public boolean isShowStock(){
		return showStock;
	}

//	public void setSpecialProductCode(Object specialProductCode){
//		this.specialProductCode = specialProductCode;
//	}
//
//	public Object getSpecialProductCode(){
//		return specialProductCode;
//	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getBrand(){
		return brand;
	}

//	public void setTermsConditions(Object termsConditions){
//		this.termsConditions = termsConditions;
//	}
//
//	public Object getTermsConditions(){
//		return termsConditions;
//	}

	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return price;
	}

	public void setVolume(int volume){
		this.volume = volume;
	}

	public int getVolume(){
		return volume;
	}

//	public void setContent(Object content){
//		this.content = content;
//	}
//
//	public Object getContent(){
//		return content;
//	}
//
//	public void setWholesalePrice(List<WholesalePriceItem> wholesalePrice){
//		this.wholesalePrice = wholesalePrice;
//	}
//
//	public List<WholesalePriceItem> getWholesalePrice(){
//		return wholesalePrice;
//	}

	public void setPriceFinal(int priceFinal){
		this.priceFinal = priceFinal;
	}

	public int getPriceFinal(){
		return priceFinal;
	}

	public void setStock(int stock){
		this.stock = stock;
	}

	public int getStock(){
		return stock;
	}

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}
}