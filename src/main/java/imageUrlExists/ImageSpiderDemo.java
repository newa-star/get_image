package imageUrlExists;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.MalformedURLException;

public class ImageSpiderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:/spider/image.jpg");
		InputStream stm;
		OutputStream otm;
		try{
			if(!file.exists())
				file.createNewFile();
			file.setReadable(true);
			URL imageUrl = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQaClhmhi9vvcfZqM7tg3oyrdGrvfSFPRxv9ZnZUZodIYJ6WFwH7jTLGmEJ5I4&s");
			stm = imageUrl.openStream();
			otm = new FileOutputStream(file);
			stm.transferTo(otm);
			stm.close();
			otm.close();
		}
		catch(MalformedURLException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
		
		}
	}

}
