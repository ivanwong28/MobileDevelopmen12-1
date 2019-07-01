package e.windows10.belajarsound;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MediaPlayer audioBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audioBackground = MediaPlayer.create(this, R.raw.lagu);
        audioBackground.setLooping(true);
        audioBackground.setVolume(1,1);
        audioBackground.start();
    }
}
