package imageUrlExists;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
public class ImageSpider {
	private URL url;
	private File imageFile;
	
	// constructor
	public ImageSpider() {
		
	}
	
	
	public ImageSpider(URL url, File image) {
		this.url = url;
		this.imageFile = image;
	}
	
	//setter
	public void setUrl(URL url) {
		this.url = url;
	}
	
	public void setUrl(String url) {
		try {
			this.url = new URL(url);
		}
		catch(MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public void setImageFile(File image) {
		this.imageFile = image;
	}
	
	public void getImage() {
		InputStream stm;
		OutputStream otm;
		
		try{
			
			if(!imageFile.exists())
				imageFile.createNewFile();
			imageFile.setReadable(true);
			stm = this.url.openStream();
			otm = new FileOutputStream(imageFile);
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
	}
	


}
