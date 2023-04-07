package ro.pub.cs.systems.eim.lab04.practicaltest01var07;

import android.os.Bundle;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PracticalTest01Var07SecondaryActivity extends AppCompatActivity {


    private EditText leftEditTopText;
    private EditText rightEditTopText;
    private EditText leftEditBottomText;
    private EditText rightEditBottomText;
    private Button Sum, Product;

    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            int first = Integer.valueOf(leftEditTopText.getText().toString());
            int second = Integer.valueOf(leftEditTopText.getText().toString());
            int third = Integer.valueOf(leftEditBottomText.getText().toString());
            int forth = Integer.valueOf(leftEditBottomText.getText().toString());

            switch(view.getId()) {
                case R.id.sum:
                    int s = first + second + third + forth;
                    leftEditBottomText.setText(String.valueOf(s));
                    break;
                case R.id.product:
                    int p = first * second * third * forth;
                    rightEditBottomText.setText(String.valueOf(p));
                    break;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var07_secondary);

        leftEditTopText = (EditText)findViewById(R.id.left_top_edit_text);
        rightEditTopText = (EditText)findViewById(R.id.right_top_edit_text);
        leftEditBottomText = (EditText)findViewById(R.id.left_bottom_edit_text);
        rightEditBottomText = (EditText)findViewById(R.id.right_bottom_edit_text);
        Sum = (Button)findViewById(R.id.sum);
        Sum.setOnClickListener(buttonClickListener);
        Product = (Button)findViewById(R.id.product);
        Product.setOnClickListener(buttonClickListener);

    }
}
