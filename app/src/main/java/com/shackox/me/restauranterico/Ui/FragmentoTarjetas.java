package com.shackox.me.restauranterico.Ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shackox.me.restauranterico.R;

public class FragmentoTarjetas extends Fragment {

    public FragmentoTarjetas() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmento_tarjetas, container, false);
    }
}
