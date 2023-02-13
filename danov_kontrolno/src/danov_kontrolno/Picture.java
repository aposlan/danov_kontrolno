package danov_kontrolno;

public class Picture {

	private String name;
	private String author;
	private double price;
	private int creationYear;
	private String unicode;
	
	public Picture() {
		
	}
	
	public Picture(String name, String author, double price, int creationYear, String unicode) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.creationYear = creationYear;
		this.unicode = unicode;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCreationYear() {
		return creationYear;
	}

	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}

	public String getUnicode() {
		return unicode;
	}

	public void setUnicode(String unicode) {
		this.unicode = unicode;
	}

	@Override
	public String toString() {
		return " Name : " + getName() + "\n Author : " + getAuthor() + "\n Price : " + getPrice() + "\n Year of creation : " + getCreationYear() + "\n Unicode : " + getUnicode();
	}
	
}
