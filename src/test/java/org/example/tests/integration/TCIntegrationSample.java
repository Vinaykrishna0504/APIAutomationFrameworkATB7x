package org.example.tests.integration;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TCIntegrationSample {
    // Create a Booking, Create a Token
    // Get Booking
    // Update the Booking
    // Delete the Booking

    @Test(groups = "Integration", priority = 1)
    @Owner("Vinay Krishna")
    @Description("TC#INT1 - Step 1. Verify that Booking can be Created")
    public void testCreateBooking(){
        Assert.assertTrue(true);
    }

    @Test(groups = "Integration", priority = 2)
    @Owner("Vinay Krishna")
    @Description("TC#INT1 - Step 2. Verify that Booking by ID")
    public void testVerifyBookingId(){
        Assert.assertTrue(true);
    }

    @Test(groups = "Integration", priority = 3)
    @Owner("Vinay Krishna")
    @Description("TC#INT1 - Step 3. Verify Updated booking by ID")
    public void testupdateBookingByID(){
        Assert.assertTrue(true);
    }

    @Test(groups = "Integration", priority = 4)
    @Owner("Vinay Krishna")
    @Description("TC#INT1 - Step 4. Delete the booking by ID")
    public void testdeleteBookingById(){
        Assert.assertTrue(true);
    }


}
