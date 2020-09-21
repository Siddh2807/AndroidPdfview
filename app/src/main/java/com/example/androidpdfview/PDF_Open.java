package com.example.androidpdfview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDF_Open extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_pdf__open);

        pdfView = findViewById (R.id.pdf_view);
        String getItem = getIntent ().getStringExtra("pdfFileName");

        if (getItem.equals ("Sample")) {
            pdfView.fromAsset ("sample.pdf").load ();
        }

        if (getItem.equals ("Api Integration")) {
            pdfView.fromAsset ("API Integration.pdf").load ();
        }

        if (getItem.equals ("Analytics 1")) {
            pdfView.fromAsset ("Analytics All Web Site Data Audience 1.pdf").load ();
        }

        if (getItem.equals ("Analytics 2")) {
            pdfView.fromAsset ("Analytics All Web Site Data Audience 1.pdf").load ();
        }
    }
}