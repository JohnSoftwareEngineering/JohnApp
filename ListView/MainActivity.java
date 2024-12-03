package com.example.admin.listview1;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends ListActivity {

    static final String[] PROGRAMS = new String[] { "Architectural",
            "Civil", "Geomatics", "Computing Systems", "Electronics (Biomedical)",
            "Electronics (Instrumentation)", "Electrical (Power)",
            "Telecommunications", "Chemical Processing", "Industrial", "Mechanical",
            "Mechanical (Manufacturing)", "Petroleum" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main,PROGRAMS));

        ListView listView = getListView();
        listView.setTextFilterEnabled(true);

        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // When clicked, show a toast with the TextView text
                Toast.makeText(getApplicationContext(),
                        ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
