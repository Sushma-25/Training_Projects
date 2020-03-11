package com.sushma.app;

import org.junit.Assert;
import org.junit.Test;

public class PasswordTest {
	@Test
public void checkNumberInPAssword() {
	Password pass=new Password();
	Assert.assertTrue(pass.checkNumberExists("sushma34gh"));
}
}
