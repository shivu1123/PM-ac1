package com.example.pmac1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void isValidEmail() {
        HelloController x = new HelloController();

        // Test invalid email, expecting false
        assertFalse(x.isValidEmail("sdsdds"), "Expected invalid email to return false.");
    }

    @Test
    void emailValidate2() {
        HelloController x = new HelloController();

        // Test valid email, expecting true
        assertTrue(x.isValidEmail("a@gmail.com"), "Expected valid email to return true.");
    }

    @Test
    void validatePasswordTest_ValidPassword() {
        HelloController x = new HelloController();

        // Test valid password
        assertTrue(x.validatePassword("password123"), "Password should be valid if length >= 8.");
    }

    @Test
    void validatePasswordTest_ShortPassword() {
        HelloController x = new HelloController();

        // Test invalid password
        assertFalse(x.validatePassword("short"), "Password should be invalid if length < 8.");
    }
}
