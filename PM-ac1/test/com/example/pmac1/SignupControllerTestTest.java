package com.example.pmac1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SignupControllerTestTest {

    @Test
    void testIsFormValid_SuccessfulSignup() {
        HelloController signupController = new HelloController();
        boolean isValid = signupController.isFormValid("John Doe", "john.doe@example.com", "password123", "password123");
        assertTrue(isValid, "Expected the form to be valid for correct inputs.");
    }
}