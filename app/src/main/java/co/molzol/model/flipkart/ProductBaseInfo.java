package co.molzol.model.flipkart;

public class ProductBaseInfo {

	private ProductIdentifier productIdentifier;
	private ProductAttributes productAttributes;
	public ProductIdentifier getProductIdentifier() {
		return productIdentifier;
	}
	public void setProductIdentifier(ProductIdentifier productIdentifier) {
		this.productIdentifier = productIdentifier;
	}
	public ProductAttributes getProductAttributes() {
		return productAttributes;
	}
	public void setProductAttributes(ProductAttributes productAttributes) {
		this.productAttributes = productAttributes;
	}
	@Override
	public String toString() {
		return "ProductBaseInfo [productAttributes=" + productAttributes
				+ ", productIdentifier=" + productIdentifier + "]";
	}
}