package com.kalasoft.halchal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button profileButton , chatButton;
    ConstraintLayout contView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        profileButton = findViewById(R.id.homeButton);
        chatButton = findViewById(R.id.chatButton);
        contView = findViewById(R.id.contView);

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProfileFragment profileFragment = new ProfileFragment();
                FragmentTransaction fragTrans = getSupportFragmentManager().beginTransaction();
                fragTrans.replace(R.id.fragview,profileFragment);
                fragTrans.commit();

            }
        });
        chatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    ChatFragment chatFrag = new ChatFragment();
                    FragmentTransaction fragTrans = getSupportFragmentManager().beginTransaction();
                    fragTrans.replace(R.id.fragview,chatFrag);
                    fragTrans.commit();
            }
        });


    }
}