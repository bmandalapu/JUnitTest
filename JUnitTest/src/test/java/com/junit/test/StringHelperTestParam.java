package com.junit.test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperTestParam {
	private StringHelper helprObj = new StringHelper();
	private String in,out;
	
	public StringHelperTestParam(String in, String out) {
		this.in = in;
		this.out = out;
	}
	
	@Before
	public void before() {
		helprObj = new StringHelper();
	}
	
	@Parameters
	public static Collection<String[]> testParam() {
		String[][] testList = {{"CD","AACD"},{"CD","ACD"}};
		return Arrays.asList(testList);
	}
	
	@Test
	public void test() {
		assertEquals(in, helprObj.truncateAInFirst2Positions(out));
	}
	
}
