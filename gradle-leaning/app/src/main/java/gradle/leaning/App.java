package gradle.leaning;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        // ワークブックの作成
        Workbook workbook = new XSSFWorkbook();

        // シートの作成
        Sheet sheet = workbook.createSheet("サンプルシート");

        // 行とセルの作成
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("こんにちは、POI!");

        // ファイルの書き込み
        try (FileOutputStream fileOut = new FileOutputStream("sample.xlsx")) {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Excelファイルを作成しました！");
    }
}
