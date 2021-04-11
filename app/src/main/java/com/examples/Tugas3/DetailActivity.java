package com.examples.Tugas3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ImageView img      = findViewById(R.id.image);
        TextView nameTv    = findViewById(R.id.name);
        TextView takeTv    = findViewById(R.id.take);
        TextView detailTv  = findViewById(R.id.detail);

        Bundle extras = getIntent().getExtras();

        String images  = extras.getString("IMAGE");
        String name    = extras.getString("NAME");
        String take    = extras.getString("TAKE");
        String detail = extras.getString("DETAIL");

        setTitle("Detail "+ name);

        img.setImageURI(Uri.parse(images));
        Glide.with(this)
            .load(images)
            .into(img);

        nameTv.setText(name);
        takeTv.setText(take);
        detailTv.setText(detail);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
