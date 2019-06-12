package com.enstudio.halodoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.enstudio.halodoc.Config.BaseAPIService;
import com.enstudio.halodoc.model.user;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText search;
    private RecyclerView recycler_view;
    BaseAPIService mApiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search = (EditText) findViewById(R.id.search);
        recycler_view = (RecyclerView) findViewById(R.id.recycler_view);



    }

    private void LoadData() {
        mApiService.getUser(search.getText().toString()).enqueue(new Callback<user>() {
            @Override
            public void onResponse(Call<user> call, Response<user> response) {
                Log.d("data", response.toString());
            }

            @Override
            public void onFailure(Call<user> call, Throwable t) {

            }
        });
    }
}
