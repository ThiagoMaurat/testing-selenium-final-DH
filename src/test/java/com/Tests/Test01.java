package com.Tests;

import static org.junit.jupiter.api.Assertions.*;

import com.Base.BasePage;
import com.Pages.Page01;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test01 {
	private static Page01 page;
	public static final String myAccount = "//*[@id=\"top-links\"]/ul/li[2]/a/i";
	public static final String firstName = "//*[@id=\"input-firstname\"]";
	public static final String lastName = "//*[@id=\"input-lastname\"]";
	public static final String email = "//*[@id=\"input-email\"]";
	public static final String telephone = "//*[@id=\"input-telephone\"]";

	@BeforeEach
	public void setUp() {
		page = new Page01();
		page.openApp();
	}

	@Test
	public void getIntoPagAndRegister() throws InterruptedException {
		page.getInRegisterPag();
		page.insertIntoPersonalDetailsSection();
		page.insertIntoPasswordsSection();
		page.setNoForNewsLetterAgreePrivacyAndConfirm();
		assertTrue(
				page.verifyIfSucessed().contains("Congratulations! Your new account has been successfully created!")
		);
	}

}
