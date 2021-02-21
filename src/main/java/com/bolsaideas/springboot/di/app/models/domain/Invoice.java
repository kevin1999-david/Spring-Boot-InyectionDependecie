package com.bolsaideas.springboot.di.app.models.domain;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;


@Component
//@RequestScope //Dura lo mismo que una peticion HTTP
//@SessionScope // Objeto de session: autenticacion, carro de compras-> se crea y se finaliza al
				// cerrar el navegador, la clase debe ser serializable


//@ApplicationScope //Similar al singleton, pero se guarda en el servelet
//@Prototype: Mas de una instancia de un mismo bean
@RequestScope
public class Invoice implements Serializable {

	private static final long serialVersionUID = 7216045859636067862L;

	@Value("${invoice.description}")
	private String description;
	@Autowired
	private Client client;
	@Autowired()
	@Qualifier("itemsInvoiceOffice")
	private List<ItemInvoice> items;

	@PostConstruct
	public void init() {
		client.setName(client.getName().concat(" David"));
		description = description.concat(" from client ").concat(client.getName());
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Invoice destroyed ".concat(description));
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<ItemInvoice> getItems() {
		return items;
	}

	public void setItems(List<ItemInvoice> items) {
		this.items = items;
	}

}
