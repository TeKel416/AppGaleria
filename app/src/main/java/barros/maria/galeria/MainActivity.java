package barros.maria.galeria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Setando a Toolbar tbMain como ActionBar padrão da MainActivity
        Toolbar toolbar = findViewById(R.id.tbMain);
        setSupportActionBar(toolbar);
    }


}