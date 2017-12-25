package com.example.alejandro.prueba;

import android.widget.CheckBox;

/**
 * Created by Alejandro on 18/12/2017.
 */

public class fila implements java.io.Serializable{
    boolean cb;
    String s;

    public fila(boolean cb, String s){
        this.cb=cb;
        this.s=s;
    }

    public boolean getCb() {
        return cb;
    }

    public void setCb(boolean cb) {
        this.cb = cb;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
