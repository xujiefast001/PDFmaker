package com.example.pdfmaker;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class Pdfbackground  {
    private Rectangle rectangle;
    private Document document;
    private PdfWriter writer;
    public Pdfbackground(FileOutputStream out) throws DocumentException {
        rectangle=new Rectangle(PageSize.A4.rotate());
        rectangle.setBackgroundColor(BaseColor.WHITE);
        document=new Document(rectangle);
        writer=PdfWriter.getInstance(document,out);
        writer.setPdfVersion(PdfWriter.VERSION_1_7);
        document.addTitle("Title@xianchangzp");
        document.addAuthor("Author@xj");
        document.addSubject("Subject@iTextpdf");
        document.addKeywords("Keywords@iText");
        document.addCreator("Creator@iText");
        document.setMargins(10,10,15,15);

    }

    public Document getDocument() {
        return document;
    }
}
