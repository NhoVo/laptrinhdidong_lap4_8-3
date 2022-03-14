package com.example.myapplication.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.model.Language2;

import java.util.ArrayList;
import java.util.List;

public class ItemListViewExample extends AppCompatActivity {
    private List<Language2> languageList;
    private ListView listView;
    @Override
    protected  void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = (ListView) findViewById(R.id.idListView2);
        languageList = new ArrayList<>();
        languageList.add(new Language2(1, "Ca nấu lẩu, nấu mì mini...","Devang"));
        languageList.add(new Language2(2, "1KG khô gà bơi tỏ...","LTD Food"));
        languageList.add(new Language2(3, "xe cần cẩu đa năng","Thế giới đồ chơi"));
        languageList.add(new Language2(4, "Đồ chơi dạng mô hình","Thế giới đồ chơi"));
        languageList.add(new Language2(5, "Lãnh đạo đơn giản","Minh Long book"));
        languageList.add(new Language2(6, "Hiểu lòng con trẻ","Minh Long book"));
    }
}
