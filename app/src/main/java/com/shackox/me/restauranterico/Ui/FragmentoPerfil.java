package com.shackox.me.restauranterico.Ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.shackox.me.restauranterico.R;

public class FragmentoPerfil extends Fragment {

    public FragmentoPerfil() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmento_perfil, container, false);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Context context = new FragmentoPerfil().getContext();
        int id = item.getItemId();
        switch (id) {
            /*case R.id.action_refresh:
                Toast.makeText(context, "REFRESH", Toast.LENGTH_LONG).show();
                break;
            case R.id.action_search:
                Toast.makeText(context, "SEARCH", Toast.LENGTH_LONG).show();
                break;
            case R.id.action_settings:
                Toast.makeText(context, "SETTINGS", Toast.LENGTH_LONG).show();
                break;*/
        }
        return super.onOptionsItemSelected(item);
    }
}
