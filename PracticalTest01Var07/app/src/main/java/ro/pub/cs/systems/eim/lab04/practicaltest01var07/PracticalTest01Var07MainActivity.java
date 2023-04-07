package ro.pub.cs.systems.eim.lab04.practicaltest01var07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import android.os.Bundle;

public class PracticalTest01Var07MainActivity extends AppCompatActivity {

    private EditText leftEditTopText;
    private EditText rightEditTopText;
    private EditText leftEditBottomText;
    private EditText rightEditBottomText;
    private Button Set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var07_main);

        leftEditTopText = (EditText)findViewById(R.id.left_top_edit_text);
        rightEditTopText = (EditText)findViewById(R.id.right_top_edit_text);
        leftEditBottomText = (EditText)findViewById(R.id.left_bottom_edit_text);
        rightEditBottomText = (EditText)findViewById(R.id.right_bottom_edit_text);
        Set = (Button)findViewById(R.id.button);
    }
}