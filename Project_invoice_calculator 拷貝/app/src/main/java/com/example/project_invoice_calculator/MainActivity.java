package com.example.project_invoice_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_check12 = (Button)findViewById(R.id.btn_1und2);
        btn_check12.setOnClickListener(btn12_check);

        Button btn_check34 = (Button)findViewById(R.id.btn_3und4);
        btn_check34.setOnClickListener(btn34_check);

        Button btn_check56 = (Button)findViewById(R.id.winning_result);
        btn_check56.setOnClickListener(btn56_check);

        Button btn_check78 = (Button)findViewById(R.id.restart_month);
        btn_check78.setOnClickListener(btn78_check);

        Button btn_check910 = (Button)findViewById(R.id.btn_re_num);
        btn_check910.setOnClickListener(btn910_check);

        Button btn_check11_12 = (Button)findViewById(R.id.btn_re_month);
        btn_check11_12.setOnClickListener(btn11_12_check);
    }
    private View.OnClickListener btn12_check = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            TextView text = (TextView)findViewById(R.id.show_choose);
            TextView set_num = (TextView)findViewById(R.id.num);
            text.setText("2018 1,2月發票");
            set_num.setText("1");//月份記述數字

        }
    };
    private View.OnClickListener btn34_check = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_2 = (TextView)findViewById(R.id.show_choose);
            TextView set_num = (TextView)findViewById(R.id.num);
            text_2.setText("2018 3,4月發票");
            set_num.setText("2");//月份記述數字
        }
    };
    private View.OnClickListener btn56_check = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_3 = (TextView)findViewById(R.id.show_choose);
            TextView set_num = (TextView)findViewById(R.id.num);
            text_3.setText("2018 5,6月發票");
            set_num.setText("3");//月份記述數字
        }
    };
    private View.OnClickListener btn78_check = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_4 = (TextView)findViewById(R.id.show_choose);
            TextView set_num = (TextView)findViewById(R.id.num);
            text_4.setText("2018 7,8月發票");
            set_num.setText("4");//月份記述數字
        }
    };
    private View.OnClickListener btn910_check = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_5 = (TextView)findViewById(R.id.show_choose);
            TextView set_num = (TextView)findViewById(R.id.num);
            text_5.setText("2018 9,10月發票");
            set_num.setText("5");//月份記述數字
        }
    };
    private View.OnClickListener btn11_12_check = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_6 = (TextView)findViewById(R.id.show_choose);
            TextView set_num = (TextView)findViewById(R.id.num);
            text_6.setText("2018 11,12月發票");
            set_num.setText("6");//月份記述數字
        }
    };

    public void click_AtoB(View v){

        TextView click_btn = (TextView)findViewById(R.id.show_choose);
        TextView set_num = (TextView)findViewById(R.id.num);

        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("mouth", click_btn.getText().toString());
        bundle.putString("numberMouth", set_num.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}