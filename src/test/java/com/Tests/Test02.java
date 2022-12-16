package com.Tests;

import com.Pages.Page01;
import com.Pages.Page02;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test02 {
    private static Page02 page2;

    @BeforeEach
    public void setUp() {
        page2 = new Page02();
        page2.openApp();
    }

    @Test
    public void searchIphoneTestAndAddToCart() throws InterruptedException {
        page2.SearchTextAndPress();
        page2.addToCart();
        Thread.sleep(2000);
        assertTrue(page2.verifyIfTextSucessed().contains("Success: You have added iPhone to your shopping cart!"));
    }

}
