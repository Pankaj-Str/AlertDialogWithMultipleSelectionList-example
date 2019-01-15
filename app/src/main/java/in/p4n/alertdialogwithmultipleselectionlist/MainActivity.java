package in.p4n.alertdialogwithmultipleselectionlist;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @SuppressLint("NewApi")
    public void withItems(View view) {

        final String[] items = {"Apple", "Banana", "Orange", "Grapes"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("List of Items")

                .setItems(items, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), items[which] + " is clicked", Toast.LENGTH_SHORT).show();
                    }
                });

        builder.setPositiveButton("OK", null);
        builder.setNegativeButton("CANCEL", null);
        builder.setNeutralButton("NEUTRAL", null);
        builder.setPositiveButtonIcon(getResources().getDrawable(android.R.drawable.ic_menu_call, getTheme()));
        builder.setIcon(getResources().getDrawable(R.drawable.ic_launcher_background, getTheme()));

        AlertDialog alertDialog = builder.create();

        alertDialog.show();

        Button button = alertDialog.getButton(DialogInterface.BUTTON_POSITIVE);
        button.setBackgroundColor(Color.BLACK);
        button.setPadding(0, 0, 20, 0);
        button.setTextColor(Color.WHITE);
    }

}
