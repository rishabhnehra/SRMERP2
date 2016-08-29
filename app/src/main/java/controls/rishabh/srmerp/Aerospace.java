package controls.rishabh.srmerp;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;


public class Aerospace extends ListActivity {
    ListView listView;
    String timetable [] = {"06.05.2015      PD1004","08.05.2015     LE1008/LE1009","11.05.2015      MA1004","13.05.2015     ME1010","15.05.2015     ME1012","18.05.2015     AS1005","20.05.2015     AS1113"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanical);
        listView = getListView();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, timetable);
        listView.setAdapter(adapter);
    }
}
