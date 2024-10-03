package org.example.asserts;

import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;

public class AssertActions {
    // Common Assertions which can be reused.

    public void VerifyResponseBody(String actual, String expected, String description){
        assertEquals(actual, expected,description);
    }

    public void VerifyResponseBody(int actual, int expected, String description){
        assertEquals(actual, expected,description);
    }

    public void verifyStatusCode(Response response, int i) {
    }
}
