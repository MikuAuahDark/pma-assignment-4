package id.co.npad93.pm.t4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    HashMap<Integer, Fragment> menuFragmentMapping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuFragmentMapping = new HashMap<Integer, Fragment>();
    }

    @Override
    protected void onStart() {
        super.onStart();

        menuFragmentMapping.put(R.id.menu_chara_category, new CharaListFragment());
        menuFragmentMapping.put(R.id.menu_element_category, new ElementListFragment());
        menuFragmentMapping.put(R.id.menu_about_category, new AboutFragment());

        BottomNavigationView navigationView = findViewById(R.id.bottomNavigationView);
        navigationView.setOnNavigationItemSelectedListener(this);
        navigationView.setSelectedItemId(R.id.menu_chara_category);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment f = menuFragmentMapping.get(item.getItemId());

        if (f != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, f).commit();
        }

        return f != null;
    }
}
