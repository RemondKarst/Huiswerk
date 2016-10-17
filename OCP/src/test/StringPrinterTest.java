package test;

import java.util.MissingFormatArgumentException;

import org.junit.Assert;
import org.junit.Test;

public class StringPrinterTest {
	
	@Test
	public void test_boolean() {
		Assert.assertEquals(String.format("%b", true), "true");
		Assert.assertEquals(String.format("%b", false), "false");
	}
	
	@Test
	public void test_boolean_no_boolean() {
		Assert.assertEquals(String.format("%b", new Integer(20)), "true");
	}
	
	@Test(expected = MissingFormatArgumentException.class)
	public void test_boolean_no_too_little() {
		Assert.assertEquals(String.format("%b"), "true");
	}
	
	@Test
	public void test_string() {
		Assert.assertEquals(String.format("%s", "tekst"), "tekst");
		Assert.assertEquals(String.format("%.1s", "tekst"), "t");
		Assert.assertEquals(String.format("%.3s", "tekst"), "tek");
		Assert.assertEquals(String.format("%10s", "tekst"), "     tekst");
		Assert.assertEquals(String.format("%-9s", "tekst"), "tekst    ");
	}
		
	@Test
	public void test_format_float() {
		Assert.assertEquals(String.format("%2.1f", 10.00), "10,0");
		Assert.assertEquals(String.format("+%2.1f", 10.00), "+10,0");
		Assert.assertEquals(String.format("%2.8f", 10.777777888888), "10,77777789");
		Assert.assertEquals(String.format("(%2.3f)", 10.0), "(10,000)");
		Assert.assertEquals(String.format("      %2.1f", 10.0), "      10,0");
		Assert.assertEquals(String.format("+%2.1f     ", 10.0), "+10,0     ");
		Assert.assertEquals(String.format("%010.1f", 10.0), "00000010,0");
	}

	@Test
	public void test_format_decimal() {
		Assert.assertEquals(String.format("%d", 10), "10");
		Assert.assertEquals(String.format("000%d", 10), "00010");
		Assert.assertEquals(String.format("    %d", 123456), "    123456");
		Assert.assertEquals(String.format("%d", -143), "-143");
		Assert.assertEquals(String.format("+%d", 32), "+32");
		Assert.assertEquals(String.format("%(d", -10), "(10)");
		Assert.assertEquals(String.format("%,d", 123456789), "123.456.789");
	}
}
