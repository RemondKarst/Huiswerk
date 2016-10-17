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
		content = readFile("c://repo//OCP//src//regex.txt", Charset.defaultCharset());
	}

	@Test
	public void test_ij() throws IOException {
		Pattern pattern = Pattern.compile("XXXX");
		Matcher matcher = pattern.matcher(content);
		
		int numberOfOccurrence = 0;
		while( matcher.find()) {
			numberOfOccurrence++;
			System.out.format("Gevonden snippet [%s] %n", matcher.group());
		}	
	
		Assert.assertEquals(4, numberOfOccurrence);	
	}


	private String readFile(String file, Charset encoding) throws IOException {
		  byte[] encoded = Files.readAllBytes(Paths.get(file));
		  return new String(encoded, encoding);
	}

}
