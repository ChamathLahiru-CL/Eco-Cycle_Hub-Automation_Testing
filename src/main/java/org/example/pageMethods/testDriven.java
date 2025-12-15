package org.example.pageMethods;

import java.io.IOException;
import java.util.ArrayList;

public class testDriven {

    public void dataDrivenUsingSample() throws IOException {

        datadrivenpage data = new datadrivenpage();

        ArrayList<Object[]> users = data.getAllUserDetails();

        for (Object[] user : users) {
            System.out.println("Username: " + user[0]);
            System.out.println("Password: " + user[1]);
            System.out.println("------------");
        }
    }

//    public static void main(String[] args) throws IOException, InterruptedException {
//
//
//    }
}
