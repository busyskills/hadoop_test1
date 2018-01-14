package busyskills.hadooptutorialcertification.withads;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by email on 1/13/2018.
 */

public class AppUtilities extends AppCompatActivity {
    public static void showFragment(Fragment fragment, FragmentManager fragmentManager) {
        if(fragment != null && fragmentManager != null) {
            //FragmentManager fragmentManager = drawerActivity.getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.screen_area, fragment);
            fragmentTransaction.commit();
        }
    }

}
