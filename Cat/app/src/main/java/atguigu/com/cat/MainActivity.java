package atguigu.com.cat;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import fragment.CinemaFragment;
import fragment.FindFragment;
import fragment.MineFragment;
import fragment.VedioHomeFragment;

public class MainActivity extends AppCompatActivity {

    public final static int num = 4;

    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup1);
        ((RadioButton)radioGroup.findViewById(R.id.vedio)).setChecked(true);

        transaction = fragmentManager.beginTransaction();
        Fragment fragment = new VedioHomeFragment();
        transaction.replace(R.id.content, fragment);
        transaction.commit();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.vedio:
                        transaction = fragmentManager.beginTransaction();
                        Fragment vedioHomeFragment = new VedioHomeFragment();
                        transaction.replace(R.id.content, vedioHomeFragment);
                        transaction.commit();
                        break;
                    case R.id.cinema:
                        transaction = fragmentManager.beginTransaction();
                        Fragment cinemaFragment = new CinemaFragment();
                        transaction.replace(R.id.content, cinemaFragment);
                        transaction.commit();
                        break;
                    case R.id.find:
                        transaction = fragmentManager.beginTransaction();
                        Fragment findFragment = new FindFragment();
                        transaction.replace(R.id.content, findFragment);
                        transaction.commit();
                        break;
                    case R.id.mine:
                        transaction = fragmentManager.beginTransaction();
                        Fragment mineFragment = new MineFragment();
                        transaction.replace(R.id.content, mineFragment);
                        transaction.commit();
                        break;
                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }



}
