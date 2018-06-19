package cl.vicentepc.pairandodd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PairOddCallBack {

    private EditText valueEt;

    private TextView tipTv;
    private Button resultBtn;

    private TextView responseTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valueEt = findViewById(R.id.valueEt);
        tipTv = findViewById(R.id.tipTv);
        resultBtn = findViewById(R.id.resultBtn);
        responseTv = findViewById(R.id.responseTv);


        resultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = valueEt.getText().toString();

                new PairOddCalculator(MainActivity.this).calculation(value);
            }
        });


    }

    @Override
    public void blankInput() {
        Toast.makeText(MainActivity.this, "INGRESE VALOR A CALCULAR", Toast.LENGTH_LONG).show();
    }

    @Override
    public void odd(String value) {
        responseTv.setText(value);
    }

    @Override
    public void pair(String value) {
        responseTv.setText(value);
    }



}
