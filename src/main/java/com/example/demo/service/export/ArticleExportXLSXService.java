package com.example.demo.service.export;

import com.example.demo.entity.Article;
import com.example.demo.repository.ArticleRepository;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

@Service
public class ArticleExportXLSXService {

    @Autowired
    private ArticleRepository articleRepository;

    public void export(OutputStream _outputStream) {

        String sheetName = "Articles";

        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet(sheetName);

        XSSFRow rowHeader = sheet.createRow(0);
        rowHeader.createCell(0).setCellValue("ID");
        rowHeader.createCell(1).setCellValue("Libellé");
        rowHeader.createCell(2).setCellValue("Prix");
        rowHeader.createCell(3).setCellValue("Stock");

        List<Article> articles = articleRepository.findAll();
        int i = 1;
        for( Article article : articles ) {
            XSSFRow row = sheet.createRow(i);
            row.createCell(0).setCellValue(article.getId().toString());
            row.createCell(1).setCellValue(article.getLibelle());
            row.createCell(2).setCellValue(article.getPrix());
            row.createCell(3).setCellValue(article.getStock());
            i++;
        }

        try {
            wb.write(_outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
