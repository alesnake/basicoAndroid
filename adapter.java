package com.example.alejandro.prueba;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Alejandro on 18/12/2017.
 */

public class adapter extends BaseAdapter{

    protected Activity activity;
    ArrayList<fila>al=new ArrayList<fila>();

    public adapter (Activity activity, ArrayList<fila> al) {
        this.activity = activity;
        this.al = al;
    }

    @Override
    public int getCount() {
        return al.size();
    }

    @Override
    public Object getItem(int i) {
        return al.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = view;

        if (view == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.lista, null);
        }

        fila f=al.get(i);

        TextView tv=(TextView)v.findViewById(R.id.txt);
        tv.setText(f.getS());

        CheckBox cb=(CheckBox)v.findViewById(R.id.tik);
        cb.setChecked(f.getCb());


        return v;
    }
}
