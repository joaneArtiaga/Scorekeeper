package tech.hyperdev.scorekeeper.activities;

import android.os.PersistableBundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import tech.hyperdev.scorekeeper.R;
import tech.hyperdev.scorekeeper.fragments.ScoreFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            ScoreFragment firstTeam = new ScoreFragment("Team 1", 0);
            ScoreFragment secondTeam = new ScoreFragment("Team 2", 0);
            fragmentTransaction.add(R.id.fragment_container, firstTeam, "First Team");
            fragmentTransaction.add(R.id.fragment2_container, secondTeam, "Second Team");
            fragmentTransaction.commit();
        }

    }
}
