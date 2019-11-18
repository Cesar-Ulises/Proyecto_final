package com.example.proyecto_final.CorosAdoracion;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.example.proyecto_final.R;
import com.loopj.android.http.AsyncHttpClient;

import org.json.JSONException;
import org.json.JSONObject;

public class RegistrarCorosAdoracion extends AppCompatActivity {

    private EditText ettituloca, etautorca, etletraca;
    private Button btnRegistrarca;
    private ListView lvdatosca;
    private AsyncHttpClient clienteca = new AsyncHttpClient();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_coros_adoracion);

        ettituloca = findViewById(R.id.ettituloca);
        etautorca = findViewById(R.id.etautorca);
        etletraca = findViewById(R.id.etletraca);

        btnRegistrarca = findViewById(R.id.btnRegistrarca);

        clienteca = new AsyncHttpClient();
    }

}
