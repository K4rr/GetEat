package com.unist.db.geteat;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Dimitry Ivanov (mail@dimitryivanov.ru) on 29.03.2015.
 */
public abstract class BaseActivity_myPage extends AppCompatActivity {

    protected <V> V findView(int id) {
        //noinspection unchecked
        return (V) findViewById(id);
    }
}
