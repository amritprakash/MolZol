package co.molzol.model.flipkart;

public class ProductIdentifier {

	private String productId;
	private CategoryPaths categoryPaths;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public CategoryPaths getCategoryPaths() {
		return categoryPaths;
	}
	public void setCategoryPaths(CategoryPaths categoryPaths) {
		this.categoryPaths = categoryPaths;
	}
	@Override
	public String toString() {
		return "ProductIdentifier [categoryPaths=" + categoryPaths
				+ ", productId=" + productId + "]";
	}
}