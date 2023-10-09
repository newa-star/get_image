package get_image_on_website;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import imageUrlExists.ImageSpider;
public class GetImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageSpider spider = new ImageSpider();
		System.out.println("please input the website:");
		Scanner input = new Scanner(System.in);
		String websiteUrl = input.next();
		ArrayList<String> imageUrl = GetImageUrl.getImageUrl(websiteUrl);
		int count = 0;
		for(String src : imageUrl) {
			String imageFile = "D:\\spider\\image"+(++count)+".png";
			File image = new File(imageFile);
			spider.setUrl(src);
			spider.setImageFile(image);
			spider.getImage();
		}
		input.close();
		}

}
