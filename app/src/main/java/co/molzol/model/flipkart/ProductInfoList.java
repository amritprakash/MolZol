package co.molzol.model.flipkart;

public class ProductInfoList {

	private ProductBaseInfo productBaseInfo;
	private ProductShippingBaseInfo productShippingBaseInfo;
	private Object offset;
	public ProductBaseInfo getProductBaseInfo() {
		return productBaseInfo;
	}
	public void setProductBaseInfo(ProductBaseInfo productBaseInfo) {
		this.productBaseInfo = productBaseInfo;
	}
	public ProductShippingBaseInfo getProductShippingBaseInfo() {
		return productShippingBaseInfo;
	}
	public void setProductShippingBaseInfo(
			ProductShippingBaseInfo productShippingBaseInfo) {
		this.productShippingBaseInfo = productShippingBaseInfo;
	}
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object offset) {
		this.offset = offset;
	}
	@Override
	public String toString() {
		return "ProductInfoList [offset=" + offset + ", productBaseInfo="
				+ productBaseInfo + ", productShippingBaseInfo="
				+ productShippingBaseInfo + "]";
	}
}