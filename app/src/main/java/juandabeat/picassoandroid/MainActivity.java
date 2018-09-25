package juandabeat.picassoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=(ImageView)findViewById(R.id.imagen);

        /* ******Cargar foto desde la aplicacion******** */
       // Picasso.with(this).load("file:///android_asset/ic_launcher.png").into(imageView);
        /* **********Cargar de Interner************* */
       Picasso.with(this).load("https://www.android.com/static/2016/img/share/andy-lg.png").
               placeholder(R.drawable.icono_).
               error(R.drawable.icono_informatica).
               resize(50,50).
               into(imageView);
    }
}
