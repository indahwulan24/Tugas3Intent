package com.example.tugas3indahwulandari;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import androidx.annotation.Nullable;

public class Mesjid extends ListActivity {
    @Override
    protected void onCreate(@Nullable Bundle icicle) {
        super.onCreate(icicle);
        String[] listMesjid = new String[] {"Mesjid Muthmainnah", "Mesjid Muslimin", "Mesjid Babul Khairat", "Mesjid Arafah", "Mesjid Jami'"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,listMesjid));
    }

    protected void onListItemClick (ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Mesjid Muthmainnah")) {
                a = new Intent(this,MesjidMuthmainnah.class);
                
            } else if (pilihan.equals("Mesjid Muslimin"))
                
            {
               
            } else if (pilihan.equals("Mesjid Babul Khairat"))
                
            {
                
            } else if (pilihan.equals("Mesjid Arafah"))
            {
            
            } else if (pilihan.equals("Mesjid Jami'"))
            {
            }
            startActivity(a);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

