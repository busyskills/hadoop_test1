package busyskills.hadooptutorialcertification.withads;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

/**
 * Created by email on 1/13/2018.
 */

public class AppUtilities {

    public static void showFragment(Fragment fragment, FragmentManager fragmentManager) {
        if(fragment != null && fragmentManager != null) {
            //FragmentManager fragmentManager = drawerActivity.getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.screen_area, fragment);
            fragmentTransaction.commit();
        }
    }

    public static void showBannerAd(FragmentActivity fragmentActivity) {
        AdView mAdView;

        MobileAds.initialize(fragmentActivity, fragmentActivity.getString(R.string.app_id));

        mAdView = (AdView) fragmentActivity.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

}
