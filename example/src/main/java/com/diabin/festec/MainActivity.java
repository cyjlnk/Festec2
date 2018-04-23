package com.diabin.festec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.diabin.latte.app.latte;
import com.joanzapata.iconify.fonts.FontAwesomeModule;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show("传入Context啦");
   /*     latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withApiHost("http://127.0.0.1/")
                .configure();*/
    }

    public void  show(String msg){
        Toast.makeText(latte.getApplication(),msg,Toast.LENGTH_SHORT).show();
    }
}
