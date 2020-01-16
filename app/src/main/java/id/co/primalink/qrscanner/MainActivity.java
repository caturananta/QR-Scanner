package id.co.primalink.qrscanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openQr(View view) {
        Intent scannerIntent = new Intent(this, ScannerActivity.class);
        startActivity(scannerIntent);
    }
}
