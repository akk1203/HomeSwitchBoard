package hritika.com.homeswitchboard;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.view.View;

import org.apache.http.HttpResponse;
import org.apache.http.entity.StringEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import android.os.AsyncTask;



public class MainActivity extends SwitchMenu implements View.OnClickListener{
    ImageButton switch1 = null;
    ImageButton switch2 = null;
    ImageButton switch3 = null;
    ImageButton switch4 = null;
    ImageButton switch5 = null;
    ImageButton switch6 = null;

    String switchID = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switch1 =(ImageButton)findViewById(R.id.imageButton101);
        switch2 =(ImageButton)findViewById(R.id.imageButton102);
        switch3 =(ImageButton)findViewById(R.id.imageButton103);
        switch4 =(ImageButton)findViewById(R.id.imageButton104);
        switch5 =(ImageButton)findViewById(R.id.imageButton105);
        switch6 =(ImageButton)findViewById(R.id.imageButton106);
        if(Resources.switch101){
            switch1.setImageResource(R.drawable.on_switch);
        }
        if(Resources.switch102){
            switch2.setImageResource(R.drawable.on_switch);
        }
        if(Resources.switch103){
            switch3.setImageResource(R.drawable.on_switch);
        }
        if(Resources.switch104){
            switch4.setImageResource(R.drawable.on_switch);
        }
        if(Resources.switch105){
            switch5.setImageResource(R.drawable.on_switch);
        }
        if(Resources.switch106){
            switch6.setImageResource(R.drawable.on_switch);
        }
        switch1.setOnClickListener(this);
        switch2.setOnClickListener(this);
        switch3.setOnClickListener(this);
        switch4.setOnClickListener(this);
        switch5.setOnClickListener(this);
        switch6.setOnClickListener(this);

    }

    public void onClick(View v) {

        boolean isChecked = false;
        if(v.getId() == R.id.imageButton101){
            switchID = "1";
            if(!Resources.switch101){
                switch1.setImageResource(R.drawable.on_switch);
                isChecked = true;
            } else {
                switch1.setImageResource(R.drawable.off_switch);
                isChecked = false;
            }
            Resources.switch101 = isChecked;
        } else if(v.getId() == R.id.imageButton102){
            switchID = "2";
            if(!Resources.switch102){
                switch2.setImageResource(R.drawable.on_switch);
                isChecked = true;
            } else {
                switch2.setImageResource(R.drawable.off_switch);
                isChecked = false;
            }
            Resources.switch102 = isChecked;
        } else if(v.getId() == R.id.imageButton103){
            switchID = "3";
            if(!Resources.switch103){
                switch3.setImageResource(R.drawable.on_switch);
                isChecked = true;
            } else {
                switch3.setImageResource(R.drawable.off_switch);
                isChecked = false;
            }
            Resources.switch103 = isChecked;
        } else if(v.getId() == R.id.imageButton104){
            switchID = "4";
            if(!Resources.switch104){
                switch4.setImageResource(R.drawable.on_switch);
                isChecked = true;
            } else {
                switch4.setImageResource(R.drawable.off_switch);
                isChecked = false;
            }
            Resources.switch104 = isChecked;
        } else if(v.getId() == R.id.imageButton105){
            switchID = "5";
            if(!Resources.switch105){
                switch5.setImageResource(R.drawable.on_switch);
                isChecked = true;
            } else {
                switch5.setImageResource(R.drawable.off_switch);
                isChecked = false;
            }
            Resources.switch105 = isChecked;
        } else if(v.getId() == R.id.imageButton106){
            switchID = "6";
            if(!Resources.switch106){
                switch6.setImageResource(R.drawable.on_switch);
                isChecked = true;
            } else {
                switch6.setImageResource(R.drawable.off_switch);
                isChecked = false;
            }
            Resources.switch106 = isChecked;
        }

        if(isChecked) {
            AsyncTask.execute(new Runnable() {
                @Override
                public void run() {
                    serviceCall(switchID, "OFF");
                }
            });
        }
        else {
            AsyncTask.execute(new Runnable() {
                @Override
                public void run() {
                    serviceCall(switchID, "ON");
                }
            });
        }
    }

    private void serviceCall(String switchId, String operation){
        HttpClient client = new DefaultHttpClient();
        try {
            HttpPost request = new HttpPost("http://71.235.203.60:8080/SwithControl/switchService/switchOperation");
            StringEntity params = new StringEntity("{\"switchId\":\""+switchId+"\",\"operation\":\""+operation+"\"} ");
            request.addHeader("content-type", "application/json");
            request.addHeader("Accept", "application/json");
            request.setEntity(params);
            HttpResponse response = client.execute(request);
        }catch(Exception ex){

        }
    }




}
