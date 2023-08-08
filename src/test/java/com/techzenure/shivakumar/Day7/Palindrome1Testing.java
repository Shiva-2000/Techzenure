package com.techzenure.shivakumar.Day7;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.techzenure.shivakumar.day7.Palindrome1;

@RunWith(Parameterized.class)
public class Palindrome1Testing {
	private String input;
	private boolean expectedResult;
	
	public Palindrome1Testing(String input, boolean expectedResult) {
		super();
		this.input = input;
		this.expectedResult = expectedResult;
	}

	@Parameters
	public static Collection<Object[]> generateData(){
		return Arrays.asList(new Object[][] {
			{"eye", true},
			{"java", false},
			{"malayalam", true},
			{"techzenure", false},
			{"madam", true}
		});
	}

	@Test
	public void testCheckPalindrome() {
		Palindrome1 palObj = new Palindrome1();
		boolean actual = palObj.Palindrome(input);
		assertEquals(expectedResult, actual);
	}

}