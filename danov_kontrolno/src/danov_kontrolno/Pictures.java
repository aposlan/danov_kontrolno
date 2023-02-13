package danov_kontrolno;
import java.util.*;

public class Pictures {

	private static ArrayList<Picture> pictures = new ArrayList<>();
	
	public Pictures(ArrayList<Picture> pictures) {
		Pictures.pictures = pictures;
	}

	public ArrayList<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(ArrayList<Picture> pictures) {
		Pictures.pictures = pictures;
	}
	
	public static void addPicture(Picture p) {
		
		boolean exists = false;
		for(Picture check : Pictures.pictures) {
			if(p.equals(check)) {
				exists= true;
			}
		}
		if(exists = true) {
			System.out.println("That picture already exists!");
		} else {
			Pictures.pictures.add(p);
		}
		
	}
	
	public void picturesInfoByAuthor(String author) {
		
		for(Picture check : Pictures.pictures) {
			if(check.getAuthor().equals(author)) {
				System.out.println(check.toString());
				System.out.println("\n-------------------------------");
			} else if (author.equals(null) || author.equals("")){
				System.out.println(check.toString());
				System.out.println("\n-------------------------------");
			} else {
				System.out.println("Incorrect author name.");
			}
		}
		
	}
	
	public void mostExpensivePictures() {
		
		Picture mostExpensiveOne = new Picture(null, null, 0, 0, null);
		
		for(Picture check : Pictures.pictures) {
			if(check.getPrice() > mostExpensiveOne.getPrice()) {
				mostExpensiveOne = check;
			}
		}
		
		System.out.println("The most expensive picture is : \n" + mostExpensiveOne.toString());
		
	}
	
	public void averagePicturePriceByAuthor(String author) {
		
		int count = 0;
		float priceAverage = 0;;
		for(Picture check : Pictures.pictures) {
			if(check.getAuthor().equals(author)) {
				count++;
				priceAverage += check.getPrice() / count;
			} else if(author.equals(null) || author.equals("")) {
				count++;
				priceAverage += check.getPrice() / count;
			}
		}
		if(author.isEmpty()) {
			System.out.println("All pictures average price is : " + priceAverage);
		} else {
			System.out.println("The average picture price of the author " + author + " is : " + priceAverage);
		}
		
	}
	
}
