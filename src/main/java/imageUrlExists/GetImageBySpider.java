package imageUrlExists;

import java.io.File;
import java.net.URL;
import java.util.Scanner;

public class GetImageBySpider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ImageSpider spider = new ImageSpider();
		Scanner input = new Scanner(System.in);
		System.out.println("input the url:");
		String url = input.next();
		System.out.println("input the file path:");
		String file = input.next();
		URL src = new URL(url);
		File image = new File(file);
		spider.setUrl(src);
		spider.setImageFile(image);
		spider.getImage();
		input.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
