package org.example.pageMethods;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class datadrivenpage {

    public ArrayList<Object[]> getAllUserDetails() throws IOException {

        ArrayList<Object[]> userDetails = new ArrayList<>();

        FileInputStream fis = new FileInputStream(
                "C:/Users/ASUS/OneDrive - std.uwu.ac.lk/Documents/.selenium/username and paswords of the ecocyle hub.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("loginDetails");

        Iterator<Row> rows = sheet.iterator();

        // ---------- HEADER ROW ----------
        Row headerRow = rows.next();

        int usernameCol = -1;
        int passwordCol = -1;

        Iterator<Cell> headerCells = headerRow.cellIterator();
        int colIndex = 0;

        while (headerCells.hasNext()) {
            Cell cell = headerCells.next();

            if (cell.getStringCellValue().equalsIgnoreCase("UserName")) {
                usernameCol = colIndex;
            }
            if (cell.getStringCellValue().equalsIgnoreCase("Password")) {
                passwordCol = colIndex;
            }
            colIndex++;
        }

        // ---------- DATA ROWS ----------
        while (rows.hasNext()) {
            Row dataRow = rows.next();

            Cell userCell = dataRow.getCell(usernameCol);
            Cell passCell = dataRow.getCell(passwordCol);

            if (userCell != null && passCell != null) {
                String username = userCell.getStringCellValue();
                String password = passCell.getStringCellValue();

                userDetails.add(new Object[]{username, password});
            }
        }

        workbook.close();
        fis.close();

        return userDetails;
    }
}
