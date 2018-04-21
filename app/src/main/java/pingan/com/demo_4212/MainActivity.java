package pingan.com.demo_4212;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {


    private MSeekBar mSeekBar1, mSeekBar2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSeekBar1 = (MSeekBar) findViewById(R.id.sb_main1);
        mSeekBar1.setProgress(50);
        mSeekBar1.setText("我叫啊啊啊");


    }


}
