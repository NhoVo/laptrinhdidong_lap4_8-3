package com.example.myapplication.activity;


import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.model.Language;
import com.example.myapplication.R;
import com.example.myapplication.adapter.LanguageAdapter;

import java.util.ArrayList;
import java.util.List;
public class CustomListViewExampleActivity extends AppCompatActivity {
    private List<Language> listLanguage;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.idListView);
        listLanguage = new ArrayList<>();
        listLanguage.add(new Language(1, "Lập Trình Java"));
        listLanguage.add(new Language(2, "Lập Trình Android"));
        listLanguage.add(new Language(3, "Lập Trình JavaFX"));
        listLanguage.add(new Language(4, "Lập Trình Web"));
        listLanguage.add(new Language(5, "Lập Trình Ruby"));
        listLanguage.add(new Language(6, "Lập Trình C++"));
        listLanguage.add(new Language(7, "Lập Trình PHP"));
        listLanguage.add(new Language(8, "Lập Trình WordPress"));

        LanguageAdapter adapter = new LanguageAdapter(this, R.layout.custom_list_view_activity, listLanguage);
        listView.setAdapter(adapter);
    }
}

