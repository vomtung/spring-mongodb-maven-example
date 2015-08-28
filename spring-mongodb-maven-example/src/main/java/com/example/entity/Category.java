package com.example.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author vominhtung
 *
 */
@Document(collection = "category")
public class Category {

	@Id
	private String id;
	
	private String categoryName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	@Override
	public String toString() {
		return "[id="+this.id+",title="+this.id+",categoryName="+this.categoryName+"]";
	}
}
