package com.dap.practice;

public class Order {
	
//	Item item = new Item();
	
	private Item item;
	private String title;

	
	public Order() {
		super();
		System.out.println("Inside Order");
	}

	public Order(Item item, String title) {
		super();
		this.item = item;
		this.title = title;
		
	}
	
	public void initMyMethod() {
		System.out.println("Inside mY Init Method");
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Order [item=" + item + ", title=" + title + "]";
	}
	
	
}
