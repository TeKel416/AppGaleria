package barros.maria.galeria;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class PhotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        // Setando a Toolbar tbPhoto como ActionBar padrão da PhotoActivity
        Toolbar toolbar = findViewById(R.id.tbPhoto);
        setSupportActionBar(toolbar);

        // Adicionando o botão voltar
        // Get ActionBar padrão
        ActionBar actionBar = getSupportActionBar();
        // Habilitar o botão de voltar na ActionBar
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}