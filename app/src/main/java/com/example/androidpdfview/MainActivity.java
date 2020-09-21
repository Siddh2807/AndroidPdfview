package com.example.androidpdfview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView pdfListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        pdfListView = findViewById (R.id.pdf_list);

        String[] Pdf_Files = {"Sample","Api Integration","Analytics 1","Analytics 2"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, Pdf_Files) {

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView (position, convertView, parent);
                TextView textView = (TextView) view.findViewById (android.R.id.text1);
             return view;
            }
        };

        pdfListView.setAdapter (adapter);

        pdfListView.setOnItemClickListener (new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = pdfListView.getItemAtPosition (i).toString ();

                Intent intent = new Intent (getApplicationContext (), PDF_Open.class);
                intent.putExtra ("pdfFileName", item);
                startActivity (intent);
            }
        });
    }
}