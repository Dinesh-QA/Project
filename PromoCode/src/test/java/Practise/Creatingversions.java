package Practise;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.annotations.Test;
public class Creatingversions {
	@Test
	public void testcase1() throws Exception {
		BufferedWriter writer = null;
		for(int i =1;i<=5;i++) {		
			File file = new File("Z:\\Private/alex/Versions File 1.txt");
			writer = new BufferedWriter(new FileWriter(file));
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			writer.write(i+"Delta Version Uploaded "+dateFormat.format(date));
			//System.out.println(dateFormat.format(date));
			System.out.println(i+" Printed from method"+dateFormat.format(date));
			writer.close();
			Thread.sleep(15500);
			
		}
		System.out.println("Task Done");
	}
}
