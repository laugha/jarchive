package com.github.jamescarter.jarchive;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import com.github.jamescarter.jarchive.TestUnarchive;

public class Test7z extends TestUnarchive {
	@Test
	public void testUnzip() throws FileNotFoundException, IOException {
		testUnarchive("test.7z");
	}
}
