package allure.examples;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

@Epic("Just an epic")
@Feature("Pass feature")
public class EpicFeatureStoryTest {
	
	@Story("I am just a test which will always pass")
	@Test
	public void tc1() {
		
		//assertTrue(true);
		
		CalculatorSteps steps = new CalculatorSteps();
		steps.writeText("This is important information");
	}
	
	
	@Story("This is an image attachment example")
	@Test
	public void tc2() throws IOException {
		
		CalculatorSteps steps = new CalculatorSteps();
		
		BufferedImage bufferImage = ImageIO.read(
				new File( System.getProperty("user.dir") +File.separator + "dancing_banana.png" ));
		
		ByteArrayOutputStream byteArrOS =  new ByteArrayOutputStream();
		ImageIO.write(bufferImage , "png" , byteArrOS);
		
		byte[] imageData =  byteArrOS.toByteArray();
		
		steps.attachImage(imageData);
	}

}
