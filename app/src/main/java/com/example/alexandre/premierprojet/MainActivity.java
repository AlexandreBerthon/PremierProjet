package com.example.alexandre.premierprojet;        //On déclare que le programme est dans le package

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;     //On importe des classes qui sont dans des autres packages
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override       //On redéfinit une méthode qui existait auparavant
    protected void onCreate(Bundle savedInstanceState) {//Ici le bundle sert si on retroune a l'appli de sauvegarder les données
        super.onCreate(savedInstanceState);     //Super veut dire que on fait appel a la superclasse cad la classe juste au dessus
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView text = new TextView(this);
        text.setText("Bonjour, vous me devez 1 000 000 000");
        setContentView(text);
    }
}
