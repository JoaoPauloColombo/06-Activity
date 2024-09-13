package br.com.fecap.ccp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private Button btnFechaTela2;
    private Button btnChamaTela3;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i("Ciclo de Vida", "Tela 2 - onCreate");

        textResultado = findViewById(R.id.textResultado);
        btnFechaTela2 = findViewById(R.id.btnFechaTela2);
        btnChamaTela3 = findViewById(R.id.btnChamaTela3);

        Bundle bundle = getIntent().getExtras();


            // Decompor os valores enviados
            String nome = bundle.getString("nome");
            String nacionalidade = bundle.getString("nacionalidade");
            int idade = bundle.getInt("idade");
            double altura = bundle.getDouble("altura");

            // Montar o conteúdo resultado:
            String resultado =
                    "Nome: " + nome + "\n" +
                            "Nacionalidade: " + nacionalidade + "\n" +
                            "Idade: " + idade + "\n" +
                            "Altura: " + altura + "\n";

            // Exibir o resultado
            textResultado.setText(resultado);

        btnChamaTela3.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
        });

        btnFechaTela2.setOnClickListener(view -> {
            finish();
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Ciclo de Vida", "Tela 2 - onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Ciclo de Vida", "Tela 2 - onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Ciclo de Vida", "Tela 2 - onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Ciclo de Vida", "Tela 2 - onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Ciclo de Vida", "Tela 2 - onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Ciclo de Vida", "Tela 2 - onDestroy");
    }
}
