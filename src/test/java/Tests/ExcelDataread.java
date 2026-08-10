package Tests;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;

    public class ExcelDataread {

        public static void main(String[] args) throws Exception {

            FileInputStream fis = new FileInputStream("src/test/Resources/TestData/Book1.xlsx");

            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheetAt(0);

            int lastRow = sheet.getLastRowNum();          // Last row index
            int lastCell = sheet.getRow(0).getLastCellNum(); // Total columns

            for (int i = 0; i <= lastRow; i++) {

                Row row = sheet.getRow(i);

                for (int j = 0; j < lastCell; j++) {

                    Cell cell = row.getCell(j);

                    System.out.print(cell + "\t");
                }

                System.out.println();
            }

            workbook.close();
            fis.close();

            Row row1=sheet.getRow(4);
            Cell cell1=row1.getCell(2);
            System.out.println(cell1.getNumericCellValue());




        }
    }

