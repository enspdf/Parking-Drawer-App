package com.shackox.me.restauranterico.Modelo;

import com.shackox.me.restauranterico.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SHACKOX on 25/09/16.
 */

public class Comida {
    private float precio;
    private String nombre;
    private int idDrawable;

    public Comida(float precio, String nombre, int idDrawable) {
        this.precio = precio;
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public static final List<Comida> COMIDAS_POPULARES = new ArrayList<Comida>();
    public static final List<Comida> BEBIDAS = new ArrayList<>();
    public static final List<Comida> POSTRES = new ArrayList<>();
    public static final List<Comida> PLATILLOS = new ArrayList<>();

    static {
        COMIDAS_POPULARES.add(new Comida(5000f, "Parqueadero UPB", R.drawable.parqueo_1));
        COMIDAS_POPULARES.add(new Comida(3200f, "Parqueadero Cañola", R.drawable.parqueo_2));
        COMIDAS_POPULARES.add(new Comida(8600f, "Parqueadero Tequendama", R.drawable.parqueo_3));
        COMIDAS_POPULARES.add(new Comida(3800f, "Parqueadero Revolution", R.drawable.parqueo_4));
        COMIDAS_POPULARES.add(new Comida(2400f, "Parqueadero Conven", R.drawable.parqueo_5));

        PLATILLOS.add(new Comida(5000f, "Parqueadero UPB", R.drawable.parqueo_1));
        PLATILLOS.add(new Comida(3200f, "Parqueadero Cañola", R.drawable.parqueo_2));
        PLATILLOS.add(new Comida(8600f, "Parqueadero Tequendama", R.drawable.parqueo_3));
        PLATILLOS.add(new Comida(3800f, "Parqueadero Revolution", R.drawable.parqueo_4));
        PLATILLOS.add(new Comida(2400f, "Parqueadero Conven", R.drawable.parqueo_5));

        BEBIDAS.add(new Comida(5000f, "Parqueadero UPB", R.drawable.parqueo_1));
        BEBIDAS.add(new Comida(3200f, "Parqueadero Cañola", R.drawable.parqueo_2));
        BEBIDAS.add(new Comida(8600f, "Parqueadero Tequendama", R.drawable.parqueo_3));
        BEBIDAS.add(new Comida(3800f, "Parqueadero Revolution", R.drawable.parqueo_4));
        BEBIDAS.add(new Comida(2400f, "Parqueadero Conven", R.drawable.parqueo_5));
        BEBIDAS.add(new Comida(5000f, "Parqueadero UPB", R.drawable.parqueo_1));

        POSTRES.add(new Comida(5000f, "Parqueadero UPB", R.drawable.parqueo_1));
        POSTRES.add(new Comida(3200f, "Parqueadero Cañola", R.drawable.parqueo_2));
        POSTRES.add(new Comida(8600f, "Parqueadero Tequendama", R.drawable.parqueo_3));
        POSTRES.add(new Comida(3800f, "Parqueadero Revolution", R.drawable.parqueo_4));
        POSTRES.add(new Comida(2400f, "Parqueadero Conven", R.drawable.parqueo_5));
    }

    public float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }
}
