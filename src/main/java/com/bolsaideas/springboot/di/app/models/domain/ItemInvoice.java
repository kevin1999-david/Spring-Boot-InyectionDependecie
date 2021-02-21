package com.bolsaideas.springboot.di.app.models.domain;

public class ItemInvoice {

	private Product product;
	private Integer amount;

	public ItemInvoice(Product product, Integer amount) {
		this.product = product;
		this.amount = amount;
	}

	public ItemInvoice() {

	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Double calculateTotal() {
		return this.product.getPrice() * this.getAmount();
	}
}
