package com.example.sbs.demo1.dto;

public class Article {

	private int id;
	private String name;
	private String body;
	private int price;
	private String date;
	
	public Article(int id, String name, String body, int price, String date) {
		this.id  = id;
		this.name = name;
		this.body = body;
		this.price = price;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + ", body=" + body + ", price=" + price + ", date=" + date + "]";
	}

}
