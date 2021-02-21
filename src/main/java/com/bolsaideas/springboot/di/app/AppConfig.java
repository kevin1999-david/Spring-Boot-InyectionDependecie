package com.bolsaideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsaideas.springboot.di.app.models.domain.ItemInvoice;
import com.bolsaideas.springboot.di.app.models.domain.Product;
import com.bolsaideas.springboot.di.app.models.service.IService;
import com.bolsaideas.springboot.di.app.models.service.MyService;
import com.bolsaideas.springboot.di.app.models.service.MyServiceComplex;

@Configuration
public class AppConfig {

	@Bean("mySimpleService")
	public IService registerMyService() {
		return new MyService();
	}

	@Primary
	@Bean("myComplexService")
	public IService registerMyComplexService() {
		return new MyServiceComplex();
	}

	@Bean("itemsInvoice")
	public List<ItemInvoice> registerItems() {
		Product p1 = new Product("Sony Camera", 100.);
		Product p2 = new Product("Bike", 200.);
		Product p3 = new Product("CellPhone", 500.);
		ItemInvoice line1 = new ItemInvoice(p1, 2);
		ItemInvoice line2 = new ItemInvoice(p2, 4);
		ItemInvoice line3 = new ItemInvoice(p3, 1);
		return Arrays.asList(line1, line2, line3);
	}

	@Bean("itemsInvoice2")
	public List<ItemInvoice> registerItems2() {
		Product p1 = new Product("Sony Camera 2", 100.);
		Product p2 = new Product("Bike 2", 200.);
		Product p3 = new Product("CellPhone 2", 500.);
		ItemInvoice line1 = new ItemInvoice(p1, 2);
		ItemInvoice line2 = new ItemInvoice(p2, 4);
		ItemInvoice line3 = new ItemInvoice(p3, 1);
		return Arrays.asList(line1, line2, line3);
	}

	@Bean("itemsInvoiceOffice")
	public List<ItemInvoice> registerItemsOffice() {
		Product p1 = new Product("Screen LG", 250.);
		Product p2 = new Product("NoteBook Asus", 500.);
		Product p3 = new Product("Office Desk", 80.);
		Product p4 = new Product("Php Print", 300.);
		ItemInvoice line1 = new ItemInvoice(p1, 2);
		ItemInvoice line2 = new ItemInvoice(p2, 4);
		ItemInvoice line3 = new ItemInvoice(p3, 1);
		ItemInvoice line4 = new ItemInvoice(p4, 1);
		return Arrays.asList(line1, line2, line3, line4);
	}

}
