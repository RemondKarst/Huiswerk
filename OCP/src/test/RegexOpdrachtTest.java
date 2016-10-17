package test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RegexOpdrachtTest {
	
	String content = "";
	
	@Before
	public void beforeTest() throws IOException {
		content = readFile("c://Repo//OCP//src//test//regex.txt", Charset.defaultCharset());
	}
	
	
//	@Test
//	public void test_datum() throws IOException {
//	//	Pattern pattern = Pattern.compile("[0-9]{1,2}-[0-9]{1,2}-[0-9]{4}");
//		Pattern pattern = Pattern.compile("[0-9]{1,2} [a-z]{3,9} [0-9]{4}|[0-9]{1,2}-[0-9]{1,2}-[0-9]{4}");
//		Matcher matcher = pattern.matcher(content);
//		
//		int numberOfOccurrence = 0;
//		while( matcher.find()) {
//			numberOfOccurrence++;
//			System.out.format("Gevonden snippet [%s] %n", matcher.group());
//		}	
//	
//		Assert.assertEquals(5, numberOfOccurrence);	
//	}
//	@Test
//	public void test_punt() throws IOException {
//	//	Pattern pattern = Pattern.compile("[0-9]{1,2}-[0-9]{1,2}-[0-9]{4}");
//		Pattern pattern = Pattern.compile("\\.");
//		Matcher matcher = pattern.matcher(content);
//		
//		int numberOfOccurrence = 0;
//		while( matcher.find()) {
//			numberOfOccurrence++;
//			System.out.format("Gevonden snippet [%s] %s %n", matcher.group(),numberOfOccurrence);
//		}	
//	
//		Assert.assertEquals(5, numberOfOccurrence);	
//	}
	
	@Test
	public void test_word() throws IOException {
	//	Pattern pattern = Pattern.compile("[0-9]{1,2}-[0-9]{1,2}-[0-9]{4}");
		Pattern pattern = Pattern.compile("\\b[a-zA-Z]+\\b");
		Matcher matcher = pattern.matcher(content);
		
		int numberOfOccurrence = 0;
		while( matcher.find()) {
			numberOfOccurrence++;
			System.out.format("Gevonden snippet [%s] %s %n", matcher.group(),numberOfOccurrence);
		}	
	
		Assert.assertEquals(5, numberOfOccurrence);	
	}
//	@Test
//	public void test_ij() throws IOException {
//		Pattern pattern = Pattern.compile("ij");
//		Matcher matcher = pattern.matcher(content);
//		
//		int numberOfOccurrence = 0;
//		while( matcher.find()) {
//			numberOfOccurrence++;
//			System.out.format("Gevonden snippet [%s] %n", matcher.group());
//		}	
//	
//		Assert.assertEquals(4, numberOfOccurrence);	
//	}
//	
//	@Test
//	public void test_kenn() throws IOException {
//		Pattern pattern = Pattern.compile("k\\b");
//		Pattern pattern2 = Pattern.compile("n\\b");
//		Pattern pattern3 = Pattern.compile("[nk]\\b");
//		Matcher matcher = pattern.matcher(content);
//		Matcher matcher2 = pattern2.matcher(content);
//		Matcher matcher3 = pattern3.matcher(content);
//		
//		int numberOfOccurrence = 0;
////		while( matcher.find()) {
////			numberOfOccurrence++;
////			System.out.format("Gevonden snippet [%s] %s %n", matcher.group(), numberOfOccurrence);
////		}	
////	
////		Assert.assertEquals(3, numberOfOccurrence);	
////		 numberOfOccurrence = 0;
////		while( matcher2.find()) {
////			numberOfOccurrence++;
////			System.out.format("Gevonden snippet [%s] %s %n", matcher2.group(), numberOfOccurrence);
////		}	
////	
////		Assert.assertEquals(13, numberOfOccurrence);	
////		numberOfOccurrence = 0;
////		while( matcher3.find()) {
////			numberOfOccurrence++;
////			System.out.format("Gevonden snippet [%s] %s %n", matcher2.group(), numberOfOccurrence);
////		}	
////	
//////		Assert.assertEquals(13, numberOfOccurrence);	
//		numberOfOccurrence = 0;
//		while( matcher3.find()) {
//			numberOfOccurrence++;
//			System.out.format("Gevonden snippet [%s] %s %n", matcher3.group(), numberOfOccurrence);
//		}	
//	
//		Assert.assertEquals(16, numberOfOccurrence);
//	}


	private String readFile(String file, Charset encoding) throws IOException {
		  byte[] encoded = Files.readAllBytes(Paths.get(file));
		  return new String(encoded, encoding);
	}

}
