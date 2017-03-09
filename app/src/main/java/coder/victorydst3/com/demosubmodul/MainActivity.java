package coder.victorydst3.com.demosubmodul;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import coder.victorydst3.com.library.DemoFun;

public class MainActivity extends AppCompatActivity {
    private TextView mTvTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvTest = (TextView) findViewById(R.id.tvTest);
        mTvTest.setText(DemoFun.getString());
    }
}
