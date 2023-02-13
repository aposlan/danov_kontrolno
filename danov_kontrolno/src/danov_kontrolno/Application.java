package danov_kontrolno;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		
		Picture p1 = new Picture("Mona Lisa", "Leonardo da Vinci", 50000000, 1500, "monlisvinci");
		Picture p2 = new Picture("The last supper", "Leonardo da Vinci", 30000000, 1550, "tlsv");
		Picture p3 = new Picture("The starry night", "Vincent van Gogh", 200000, 1889, "tsnvvg");
		Picture p4 = new Picture("The scream", "Edvard Munch", 20152, 1890, "tsem");
		Picture p5 = new Picture("Guernica", "Picasso", 500000, 1937, "gpgp");
		
		ArrayList<Picture> pictures = new ArrayList<>();
		pictures.add(p1);
		pictures.add(p2);
		pictures.add(p3);
		pictures.add(p4);
		pictures.add(p5);
		
		Pictures p = new Pictures(pictures);
		
		p.mostExpensivePictures();
		
	}

}
