package get_image_on_website;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.*;
import java.util.ArrayList;
public class GetImageUrl {

	
	public  static ArrayList<String> getImageUrl(String url) {
		ArrayList<String> imageUrl = new ArrayList<String>(); 
		try {
			Document doc = Jsoup.connect(url).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64)" + 
		"AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36").post();// url of a website which contains images
			Elements images = doc.getElementsByTag("img").select("img[src*=/sites/default/files/]");
			String src;
			for(Element image : images) {
				src = "https://www.topgear.com"+ image.attr("src");
				imageUrl.add(src);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return imageUrl;
	}
}
