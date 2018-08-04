package hritika.com.homeswitchboard;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import android.support.v7.app.AppCompatActivity;

public class SwitchMenu extends AppCompatActivity{
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.admin:
                startActivity(new Intent(this, AdminActivity.class));
                return true;
            case R.id.board1:
                startActivity(new Intent(this, MainActivity.class));
                return true;
            case R.id.board2:
                startActivity(new Intent(this, Board2Activity.class));
                return true;
            default:
                return false;
        }
    }
}
