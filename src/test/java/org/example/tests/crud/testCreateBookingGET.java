package org.example.tests.crud;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCreateBookingGET {

    @Link(name = "Link to TC", url = "https://bugz.atlassian.net/browse/RBT-4")
    @Issue("Auth-123")
    @TmsLink("RBT-4")
    @Owner("Vinay Krishna")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify that post request is working fine.")
    @Test
    public void testVerifyCreateBookingGET01(){
        Assert.assertEquals(true,true);
    }
}
