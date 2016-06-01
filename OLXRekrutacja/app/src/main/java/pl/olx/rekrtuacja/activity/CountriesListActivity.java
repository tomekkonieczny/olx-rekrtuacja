package pl.olx.rekrtuacja.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.olx.rekrtuacja.R;
import pl.olx.rekrtuacja.adapter.CountriesListAdapter;

/**
 * Created by Tomasz Konieczny on 2015-02-03.
 */
public class CountriesListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries_list);

        CountriesListAdapter adapter = new CountriesListAdapter(this, -1, new String[]{});
        ListView list = (ListView) findViewById(android.R.id.list);
        list.setAdapter(adapter);

        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
