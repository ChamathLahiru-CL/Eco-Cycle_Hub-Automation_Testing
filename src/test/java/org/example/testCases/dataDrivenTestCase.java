package org.example.testCases;

import org.example.pageMethods.datadrivenpage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;

public class dataDrivenTestCase extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() throws IOException {

        datadrivenpage data = new datadrivenpage();
        ArrayList<Object[]> list = data.getAllUserDetails();

        Object[][] array = new Object[list.size()][2];

        for (int i = 0; i < list.size(); i++) {
            array[i][0] = list.get(i)[0];
            array[i][1] = list.get(i)[1];
        }
        return array;

    }
    @Test(dataProvider = "loginData")
    public void loginValidationTest(String username, String password) throws InterruptedException {

        directLoginPage.directLoginAndLogout(username, password);

//        // -------- VALIDATION --------
//        boolean isLoginSuccess = driver.getPageSource().contains("Logout");
//
//        Assert.assertTrue(isLoginSuccess, "Login failed for user: " + username);

    }

    @Test
    public void loginAndLogout() throws InterruptedException {
        directLoginPage.directLogin("test034@gmail.com","TEST123456");
        Thread.sleep(1200);
        productPage.logOut();
    }
}
