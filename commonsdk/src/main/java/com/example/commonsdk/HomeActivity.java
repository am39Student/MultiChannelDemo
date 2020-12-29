package com.example.commonsdk;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private TextView textMessage1, textMessage2, textName, textFrom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        textMessage1 = findViewById(R.id.text_message1);
        textMessage2 = findViewById(R.id.text_message2);
        textName = findViewById(R.id.text_name);
        textFrom = findViewById(R.id.text_from);
        if(CommonConfigManager.commonConfig.isShowMessage1()){
            textMessage1.setVisibility(View.VISIBLE);
        } else {
            textMessage1.setVisibility(View.GONE);
        }
        if(CommonConfigManager.commonConfig.isShowMessage2()){
            textMessage2.setVisibility(View.VISIBLE);
        } else {
            textMessage2.setVisibility(View.GONE);
        }
        textName.setText(CommonConfigManager.commonConfig.getDemoName());
        if(CommonConfigManager.commonConfig.getProductType() == CommonConfigManager.Product.Demo1){
            textFrom.setText("来自于Demo1");
        } else {
            textFrom.setText("来自于Demo2");
        }
    }
}