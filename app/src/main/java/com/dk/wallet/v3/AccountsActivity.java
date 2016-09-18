package com.dk.wallet.v3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class AccountsActivity extends AppCompatActivity {

    private RecyclerView rv;
    private List<Person> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounts);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_add_account);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Add account", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                Intent intent = new Intent(AccountsActivity.this, AddAccountActivity.class);
                startActivity(intent);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Recycler View
        rv = (RecyclerView) findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }

    private void initializeData() {
        persons = new ArrayList<>();
        persons.add(new Person("Emma Wilson", "23 years old", 0 /*R.drawable.emma*/));
        persons.add(new Person("Lavery Maiss", "25 years old", 0 /*R.drawable.lavery*/));
        persons.add(new Person("Lillie Watts", "35 years old", 0 /*R.drawable.lillie*/));
//        persons.add(new Person("Emma Wilson 2", "23 years old", R.drawable.emma));
//        persons.add(new Person("Lavery Maiss 2", "25 years old", R.drawable.lavery));
//        persons.add(new Person("Lillie Watts 2", "35 years old", R.drawable.lillie));
//        persons.add(new Person("Emma Wilson 3", "23 years old", R.drawable.emma));
//        persons.add(new Person("Lavery Maiss 3", "25 years old", R.drawable.lavery));
//        persons.add(new Person("Lillie Watts 3", "35 years old", R.drawable.lillie));
    }

    private void initializeAdapter() {
        RVAdapter adapter = new RVAdapter(persons);
        rv.setAdapter(adapter);
    }


}
