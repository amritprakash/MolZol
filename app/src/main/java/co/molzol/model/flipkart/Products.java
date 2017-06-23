package co.molzol.model.flipkart;

import java.util.ArrayList;
import java.util.List;

public class Products {

	//private String nextUrl;
	//private Integer validTill;
	//private String lastProductId;

	private List<ProductInfoList> productInfoList = new ArrayList<ProductInfoList>();

	public List<ProductInfoList> getProductInfoList() {
		return productInfoList;
	}

	public void setProductInfoList(List<ProductInfoList> productInfoList) {
		this.productInfoList = productInfoList;
	}




}