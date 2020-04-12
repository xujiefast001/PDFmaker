package com.example.pdfmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;

import java.io.File;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {
    Pdfbackground pdfbackground;
    Document document;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        editText = findViewById(R.id.editText3);
//        button = findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                File file = new File(getFilesDir(), String.valueOf(editText.getText()));
//                try {
//                    FileOutputStream out = new FileOutputStream(file);
//                    pdfbackground = new Pdfbackground(out);
//                    document = pdfbackground.getDocument();
//                } catch (Exception e) {
//                    editText.setText("Error");
//                }
//                document.open();
//                try {
//                    document.add(new Paragraph(String.valueOf(editText.getText())));
//                } catch (DocumentException e) {
//                    editText.setText("Error");
//                }
//
//                document.close();
//
//            }
//        });

    }
}
