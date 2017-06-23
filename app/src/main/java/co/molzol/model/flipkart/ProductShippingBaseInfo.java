package co.molzol.model.flipkart;

public class ProductShippingBaseInfo {

	private Object shippingOptions;

	public Object getShippingOptions() {
		return shippingOptions;
	}

	public void setShippingOptions(Object shippingOptions) {
		this.shippingOptions = shippingOptions;
	}

	@Override
	public String toString() {
		return "ProductShippingBaseInfo [shippingOptions=" + shippingOptions
				+ "]";
	}
}
