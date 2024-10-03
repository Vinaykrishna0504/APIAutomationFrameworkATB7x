package org.example.tests.crud;

import io.qameta.allure.*;
import io.restassured.RestAssured;
import org.example.base.BaseTest;
import org.example.endpoints.APIConstants;
import org.example.pojos.BookingResponse;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class testCreateBookingTCPOST extends BaseTest {

    @Link(name = "Link to TC", url = "https://bugz.atlassian.net/browse/RBT-4")
    @Issue("Auth-123")
    @TmsLink("RBT-4")
    @Owner("Vinay Krishna")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify that post request is working fine.")
    @Test
    public void testVerifyCreateBookingGET01(){
        requestSpecification
                .basePath(APIConstants.CREATE_UPDATE_BOOKING_URL);

        response = RestAssured.given(requestSpecification)
                .when().body(payloadManager.createPayloadBookingAsString()).post();
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);


        // Default RestAssured
        validatableResponse.body("booking.firstname", Matchers.equalTo("James"));

        BookingResponse bookingResponse = payloadManager.bookingResponseJava(response.asString());

        //AssertJ
        assertThat(bookingResponse.getBooking()).isNotNull();
        assertThat(bookingResponse.getBooking().getFirstname()).isNotNull().isNotBlank();
        assertThat(bookingResponse.getBooking().getFirstname()).isEqualTo("James");

        //TestNG Assertions
        assertActions.verifyStatusCode(response, 200);
    }
}
