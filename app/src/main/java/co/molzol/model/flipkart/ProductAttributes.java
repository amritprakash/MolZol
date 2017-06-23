package co.molzol.model.flipkart;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductAttributes {

	private String title;
	private String productDescription;
	private Map<String, String> imageUrls;
	private MaximumRetailPrice maximumRetailPrice;
	private SellingPrice sellingPrice;
	private String productUrl;
	private Object productBrand;
	private Boolean inStock;
	private Boolean codAvailable;
	private Object emiAvailable;
	private Double discountPercentage;
	private Object cashBack;
	private List<Object> offers = new ArrayList<Object>();
	private Object size;
	private String color;
	private String sizeUnit;
	private String sizeVariants;
	private Object colorVariants;
	private Object styleCode;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Map<String,String> getImageUrls() {
		return imageUrls;
	}
	public void setImageUrls(Map imageUrls) {
		this.imageUrls = imageUrls;
	}
	public MaximumRetailPrice getMaximumRetailPrice() {
		return maximumRetailPrice;
	}
	public void setMaximumRetailPrice(MaximumRetailPrice maximumRetailPrice) {
		this.maximumRetailPrice = maximumRetailPrice;
	}
	public SellingPrice getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(SellingPrice sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public String getProductUrl() {
		return productUrl;
	}
	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}
	public Object getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(Object productBrand) {
		this.productBrand = productBrand;
	}
	public Boolean getInStock() {
		return inStock;
	}
	public void setInStock(Boolean inStock) {
		this.inStock = inStock;
	}
	public Boolean getCodAvailable() {
		return codAvailable;
	}
	public void setCodAvailable(Boolean codAvailable) {
		this.codAvailable = codAvailable;
	}
	public Object getEmiAvailable() {
		return emiAvailable;
	}
	public void setEmiAvailable(Object emiAvailable) {
		this.emiAvailable = emiAvailable;
	}
	public Double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(Double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public Object getCashBack() {
		return cashBack;
	}
	public void setCashBack(Object cashBack) {
		this.cashBack = cashBack;
	}
	public List<Object> getOffers() {
		return offers;
	}
	public void setOffers(List<Object> offers) {
		this.offers = offers;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSizeUnit() {
		return sizeUnit;
	}
	public void setSizeUnit(String sizeUnit) {
		this.sizeUnit = sizeUnit;
	}
	public String getSizeVariants() {
		return sizeVariants;
	}
	public void setSizeVariants(String sizeVariants) {
		this.sizeVariants = sizeVariants;
	}
	public Object getColorVariants() {
		return colorVariants;
	}
	public void setColorVariants(Object colorVariants) {
		this.colorVariants = colorVariants;
	}
	public Object getStyleCode() {
		return styleCode;
	}
	public void setStyleCode(Object styleCode) {
		this.styleCode = styleCode;
	}
	@Override
	public String toString() {
		return "ProductAttributes [cashBack=" + cashBack + ", codAvailable="
				+ codAvailable + ", color=" + color + ", colorVariants="
				+ colorVariants + ", discountPercentage=" + discountPercentage
				+ ", emiAvailable=" + emiAvailable + ", imageUrls=" + imageUrls
				+ ", inStock=" + inStock + ", maximumRetailPrice="
				+ maximumRetailPrice + ", offers=" + offers + ", productBrand="
				+ productBrand + ", productDescription=" + productDescription
				+ ", productUrl=" + productUrl + ", sellingPrice="
				+ sellingPrice + ", size=" + size + ", sizeUnit=" + sizeUnit
				+ ", sizeVariants=" + sizeVariants + ", styleCode=" + styleCode
				+ ", title=" + title + "]";
	}
}