package vo;

import java.util.Date;

public class ProductVo {
	private int id;
	private String name;
	private int price;
	private Date regdate;
	private double rate;
	
	public ProductVo() {
	}
	
	public ProductVo(String name, int price, double rate) {
		this.name = name;
		this.price = price;
		this.rate = rate;
	}

	public ProductVo(int id, String name, int price, Date regdate, double rate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.regdate = regdate;
		this.rate = rate;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "ProductVo [id=" + id + ", name=" + name + ", price=" + price + ", regdate=" + regdate + ", rate=" + rate
				+ "]";
	}
	
	
	
}
