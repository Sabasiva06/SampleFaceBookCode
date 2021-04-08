package org.sample;

import org.base.LibGlobal;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class Sample extends LibGlobal{

	@Test
private void tc1() {
	assertEquals("", "");
	assertTrue(false);

	}

}
