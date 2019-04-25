package khoapham.ptp.phamtanphat.drawableresource;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imglevelist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imglevelist = findViewById(R.id.imageviewLevellist);

        final Drawable drawable = imglevelist.getDrawable();

        imglevelist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                imglevelist.setImageLevel(drawable.getLevel() + 10);

                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (drawable.getLevel() >= 100){
                            drawable.setLevel(0);
                        }
                        imglevelist.setImageLevel(drawable.getLevel() + 10);
                        handler.postDelayed(this,100);


                    }
                },1000);
            }
        });
    }
}
