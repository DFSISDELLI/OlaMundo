package br.edu.ifsp.scl.sdm.olamundo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText textoEt;
    private Button cliqueAquiBt;
    private Spinner opcoesSp;
    private CheckBox selecionadoCb;
    private RadioButton radio1Rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoEt = findViewById(R.id.textoEt);
        cliqueAquiBt = findViewById(R.id.cliqueAquiBt);
        cliqueAquiBt.setOnClickListener(this);
        opcoesSp = findViewById(R.id.opcoesSp);
        selecionadoCb = findViewById(R.id.selecionadoCb);
        radio1Rb = findViewById(R.id.radio1Rb);

    }


    @Override
    public void onClick(View view) {
        StringBuilder sb = new StringBuilder();

        // EditText
        sb.append(textoEt.getText().toString());
        sb.append('\n');

        // Spinner
        sb.append(((TextView) opcoesSp.getSelectedView()).getText());
        sb.append('\n');

        // CheckBox
        sb.append(selecionadoCb.isChecked() ? "selecionado" : "não selecionado");
        sb.append('\n');

        // RadioButton
        sb.append(radio1Rb.isChecked() ? "Radio 1" : "Radio 2");
        sb.append('\n');

        Toast.makeText(this, sb.toString(), Toast.LENGTH_SHORT).show();



    }
}


