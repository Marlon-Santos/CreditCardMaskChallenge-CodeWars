package com.challenges.codeWars;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CodeWarsApplicationTests {

	@Test
	void contextLoads() {
		assertEquals("############5616", CodeWarsApplication.maskify("4556364607935616"));
		assertEquals("#######5616",      CodeWarsApplication.maskify(     "64607935616"));
		assertEquals("1",                CodeWarsApplication.maskify(               "1"));
		assertEquals("",                 CodeWarsApplication.maskify(                ""));

		// "What was the name of your first pet?"
		assertEquals("##ippy",                                    CodeWarsApplication.maskify("Skippy")                                  );
		assertEquals("####################################man!",  CodeWarsApplication.maskify("Nananananananananananananananana Batman!"));

	}

}
