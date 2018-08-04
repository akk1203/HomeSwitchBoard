package hritika.com.homeswitchboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;

public class Board2Activity extends SwitchMenu implements View.OnClickListener{
    ImageButton switch1 = null;
    ImageButton switch2 = null;
    ImageButton switch3 = null;
    ImageButton switch4 = null;
    ImageButton switch5 = null;
    ImageButton switch6 = null;
    ImageButton switch7 = null;
    ImageButton switch8 = null;

    String switchID = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board2);
        switch1 =(ImageButton)findViewById(R.id.imageButton201);
        switch2 =(ImageButton)findViewById(R.id.imageButton202);
        switch3 =(ImageButton)findViewById(R.id.imageButton203);
        switch4 =(ImageButton)findViewById(R.id.imageButton204);
        switch5 =(ImageButton)findViewById(R.id.imageButton205);
        switch6 =(ImageButton)findViewById(R.id.imageButton206);
        switch7 =(ImageButton)findViewById(R.id.imageButton207);
        switch8 =(ImageButton)findViewById(R.id.imageButton208);
        if(Resources.switch201){
            switch1.setImageResource(R.drawable.on_switch);
        }
        if(Resources.switch202){
            switch2.setImageResource(R.drawable.on_switch);
        }
        if(Resources.switch203){
            switch3.setImageResource(R.drawable.on_switch);
        }
        if(Resources.switch204){
            switch4.setImageResource(R.drawable.on_switch);
        }
        if(Resources.switch205){
            switch5.setImageResource(R.drawable.on_switch);
        }
        if(Resources.switch206){
            switch6.setImageResource(R.drawable.on_switch);
        }
        if(Resources.switch207){
            switch7.setImageResource(R.drawable.on_switch);
        }
        if(Resources.switch208){
            switch8.setImageResource(R.drawable.on_switch);
        }
        switch1.setOnClickListener(this);
        switch2.setOnClickListener(this);
        switch3.setOnClickListener(this);
        switch4.setOnClickListener(this);
        switch5.setOnClickListener(this);
        switch6.setOnClickListener(this);
        switch7.setOnClickListener(this);
        switch8.setOnClickListener(this);
    }

    public void onClick(View v) {

        boolean isChecked;
        if(v.getId() == R.id.imageButton201){
            switchID = "1";
            if(!Resources.switch201){
                switch1.setImageResource(R.drawable.on_switch);
                isChecked = true;
            } else {
                switch1.setImageResource(R.drawable.off_switch);
                isChecked = false;
            }
            Resources.switch201 = isChecked;
        } else if(v.getId() == R.id.imageButton202){
            switchID = "2";
            if(!Resources.switch202){
                switch2.setImageResource(R.drawable.on_switch);
                isChecked = true;
            } else {
                switch2.setImageResource(R.drawable.off_switch);
                isChecked = false;
            }
            Resources.switch202 = isChecked;
        } else if(v.getId() == R.id.imageButton203){
            switchID = "3";
            if(!Resources.switch203){
                switch3.setImageResource(R.drawable.on_switch);
                isChecked = true;
            } else {
                switch3.setImageResource(R.drawable.off_switch);
                isChecked = false;
            }
            Resources.switch203 = isChecked;
        } else if(v.getId() == R.id.imageButton204){
            switchID = "4";
            if(!Resources.switch204){
                switch4.setImageResource(R.drawable.on_switch);
                isChecked = true;
            } else {
                switch4.setImageResource(R.drawable.off_switch);
                isChecked = false;
            }
            Resources.switch204 = isChecked;
        } else if(v.getId() == R.id.imageButton205){
            switchID = "5";
            if(!Resources.switch205){
                switch5.setImageResource(R.drawable.on_switch);
                isChecked = true;
            } else {
                switch5.setImageResource(R.drawable.off_switch);
                isChecked = false;
            }
            Resources.switch205 = isChecked;
        } else if(v.getId() == R.id.imageButton206){
            switchID = "6";
            if(!Resources.switch206){
                switch6.setImageResource(R.drawable.on_switch);
                isChecked = true;
            } else {
                switch6.setImageResource(R.drawable.off_switch);
                isChecked = false;
            }
            Resources.switch206 = isChecked;
        } else if(v.getId() == R.id.imageButton207){
            switchID = "7";
            if(!Resources.switch207){
                switch7.setImageResource(R.drawable.on_switch);
                isChecked = true;
            } else {
                switch7.setImageResource(R.drawable.off_switch);
                isChecked = false;
            }
            Resources.switch207 = isChecked;
        } else if(v.getId() == R.id.imageButton208){
            switchID = "8";
            if(!Resources.switch208){
                switch8.setImageResource(R.drawable.on_switch);
                isChecked = true;
            } else {
                switch8.setImageResource(R.drawable.off_switch);
                isChecked = false;
            }
            Resources.switch208 = isChecked;
        }

    }
}
