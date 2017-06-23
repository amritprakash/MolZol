package co.molzol.model.flipkart;

import java.util.ArrayList;
import java.util.List;

public class CategoryPaths {
	private List<List<CategoryPath>> categoryPath = new ArrayList<List<CategoryPath>>();

	public List<List<CategoryPath>> getCategoryPath() {
		return categoryPath;
	}

	public void setCategoryPath(List<List<CategoryPath>> categoryPath) {
		this.categoryPath = categoryPath;
	}

	@Override
	public String toString() {
		return "CategoryPaths [categoryPath=" + categoryPath + "]";
	}
}