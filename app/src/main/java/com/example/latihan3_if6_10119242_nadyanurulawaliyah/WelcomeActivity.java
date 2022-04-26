package com.example.latihan3_if6_10119242_nadyanurulawaliyah;
//Tanggal pengerjaan : 26 April
//Deskripsi pekerjaan :
//NIM   : 10119242
//Nama  : Nadya Nurul Awaliyah

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;

import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.latihan3_if6_10119242_nadyanurulawaliyah.DoneActivity.ID_EXTRA_MSG_EXIT;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        ButterKnife.bind(this);

        if (getIntent().getBooleanExtra(ID_EXTRA_MSG_EXIT, false)) {
            finish();
        }
    }
    @OnClick(R.id.btnWalkthroughStart)
    void mulai() {
        Intent intent = new Intent(this, LoginCodeActivity.class);
        startActivity(intent);
    }
    }
