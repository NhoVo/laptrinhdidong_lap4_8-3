package com.example.myapplication.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.model.Language;
import com.example.myapplication.model.Language2;

import java.util.List;

public class LanguageAdapter2 extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Language2> listlanguage;
    private int positionSelect=-1;

    public LanguageAdapter2(Context context, int idLayout, List<Language2> listlanguage) {
        this.context = context;
        this.idLayout = idLayout;
        this.listlanguage = listlanguage;
    }

    @Override
    public int getCount() {
        if (listlanguage.size()!=0 && !listlanguage.isEmpty())
        {
            return listlanguage.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int position, View converView, ViewGroup parent) {
        if (converView==null)
        {
            converView= LayoutInflater.from(parent.getContext()).inflate(idLayout,parent,false);
        }
        TextView textView1= (TextView) converView.findViewById(R.id.textView1);
        TextView textView3 = (TextView) converView.findViewById(R.id.textView3);
        ImageView imageView2= (ImageView) converView.findViewById(R.id.imageView2);
        final LinearLayout linearLayout = converView.findViewById(R.id.idLinearLayout2);
        final Language2 language = listlanguage.get(position);
        if (listlanguage!=null && !listlanguage.isEmpty())
        {
            textView1.setText(language.getDescription());
            textView3.setText(language.getName());
            int idImg = language.getId();
            switch (idImg)
            {
                case 1: imageView2.setImageResource(R.drawable.ca_nau_lau); break;
                case 2: imageView2.setImageResource(R.drawable.ga_bo_toi); break;
                case 3: imageView2.setImageResource(R.drawable.xa_can_cau); break;
                case 4: imageView2.setImageResource(R.drawable.do_choi_dang_mo_hinh); break;
                case 5: imageView2.setImageResource(R.drawable.lanh_dao_gian_don); break;
                case 6: imageView2.setImageResource(R.drawable.hieu_long_con_tre); break;
                default: break;
            }
        }
        converView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,language.getName(), Toast.LENGTH_SHORT).show();
                positionSelect=position;
                notifyDataSetChanged();
            }
        });
        if (positionSelect ==position)
        {
            linearLayout.setBackgroundColor(Color.BLUE);
        }
        else
        {
            linearLayout.setBackgroundColor(Color.WHITE);
        }
        return converView;
    }
}
