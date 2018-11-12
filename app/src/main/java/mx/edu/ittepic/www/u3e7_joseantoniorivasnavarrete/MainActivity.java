package mx.edu.ittepic.www.u3e7_joseantoniorivasnavarrete;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MediaPlayer audio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Lienzo(this));
        audio = MediaPlayer.create(this, R.raw.spaceinvaders1);
    }
    public  void ventana2(){
        audio.pause();
        Intent ventana2 = new Intent( MainActivity.this, Main2Activity.class );
        startActivity( ventana2 );
    }
    public void musicaf(){
        audio.start();
    }
    public void onBackPressed() {
        audio.stop();
        super.onBackPressed();
    }
}
