package ru.myitschool.lab22toast;

import static android.content.ContentValues.TAG;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private static int count = -1;

    private static int flag = -1;
    private Toast toast;
    static final int DAY_VIEW_MODE = 0;
    static final int WEEK_VIEW_MODE = 1;

    private SharedPreferences mPrefs;
    private int mCurViewMode;


    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        mPrefs = getSharedPreferences(getLocalClassName(), MODE_PRIVATE);
//        mCurViewMode = mPrefs.getInt("view_mode",DAY_VIEW_MODE);

        setContentView(R.layout.activity_main);
//        int orientation = this.getResources().getConfiguration().orientation;
//        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
//            // code for portrait mode
//            Toast.makeText(this, "PORTRAIT", Toast.LENGTH_LONG).show();
//            count ++;
//        } else {
//            count ++;
//            Toast.makeText(this, "landscape", Toast.LENGTH_LONG).show();
//        }
//        Toast.makeText(getApplicationContext(), R.string.ncreate, Toast.LENGTH_LONG).show();
//        if(flag != getResources().getConfiguration().orientation){
//            count++;
//        }
//        flag=getResources().getConfiguration().orientation;
//        Toast.makeText(getApplicationContext(), "flag", Toast.LENGTH_LONG).show();
        showToast(30,80,R.string.ncreate);
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        if (count % 2 == 0) {
            Toast.makeText(getApplicationContext(), R.string.ndestroy2X, Toast.LENGTH_LONG).show();
            System.out.println("I am working destroy");
        }
//        showToast(30,80,R.string.ncreate);
    }

    @Override
    protected void onStart() {
        super.onStart();
//        toast.cancel();
//        toast = Toast.makeText(this, "" , Toast.LENGTH_SHORT);
//        toast.setText("Button Clicked");
//        toast.show();
        showToast(30,40,R.string.nstart);

//        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
//            getSupportActionBar().hide();
//            Toast.makeText(getApplicationContext(), "flag", Toast.LENGTH_LONG).show();
//
//        } else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
//            getSupportActionBar().show();
//            Toast.makeText(this, "PORTRAIT", Toast.LENGTH_LONG).show();
//        }
//        Toast.makeText(getApplicationContext(), R.string.nstart, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
//        Toast toast = Toast.makeText(this, R.string.nresume, Toast.LENGTH_LONG);
//        toast.setMargin(50,40);
//        toast.show();
        showToast(10,10,R.string.nresume);
//        Toast toast = Toast.makeText(this,"!!!!!!!!!!!",Toast.LENGTH_LONG);

//        int orientation = this.getResources().getConfiguration().orientation;
//        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
//            // code for portrait mode
//            Toast.makeText(this, "PORTRAIT", Toast.LENGTH_LONG).show();
//            count ++;
//        } else {
//            count ++;
//            Toast.makeText(this, "landscape", Toast.LENGTH_LONG).show();
//        }
    }

     @Override
     protected void onPause() {
         super.onPause();

//         SharedPreferences.Editor ed = mPrefs.edit();
//         ed.putInt("view_mode", mCurViewMode);
//         ed.commit();
//         Toast.makeText(this, R.string.npause, Toast.LENGTH_LONG).show();
         showToast(10,10,R.string.npause);
     }

     @Override
     protected void onStop() {
         super.onStop();
//         Toast.makeText(this, R.string.nstop, Toast.LENGTH_LONG).show();
         showToast(10,10,R.string.nstop);
     }

     @Override
     protected void onRestart(){
         super.onRestart();
         showToast(10,10,R.string.nrestart);
//         Toast.makeText(this, R.string.nrestart, Toast.LENGTH_LONG).show();
     }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast(10,10,R.string.ndestroy);
        if (count % 2 == 0) {
            Toast.makeText(getApplicationContext(), R.string.ndestroy2X, Toast.LENGTH_LONG).show();
            System.out.println("I am working destroy");
        }

    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {

            Toast.makeText(this, "LanDsacape", Toast.LENGTH_LONG).show();

//            Toast.makeText(this, "LanDsacape", Toast.LENGTH_LONG).show();
            count ++;
            Log.d(TAG,"_____________11" + count);
            System.out.println("_______________" + count);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, "PORTRAIT", Toast.LENGTH_LONG).show();
            count ++;
            Log.d(TAG,"_______________" + count);
            System.out.println("_______________" + count);
        }
    }

//    public void curOrient(){
//        int orientation = this.getResources().getConfiguration().orientation;
//        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
//            // code for portrait mode
//            Toast.makeText(this, "PORTRAIT", Toast.LENGTH_LONG).show();
//            count ++;
//        } else {
//            count ++;
//            Toast.makeText(this, "landscape", Toast.LENGTH_LONG).show();
//        }
//    }


    public  void showToast(float Hr,float Vr, int idText) {
        Context context = getApplicationContext();

//        String idText = toastString;
        int inText = idText;
        int duration = Toast.LENGTH_LONG;
//        if (toast != null) {
//            toast.cancel();
////        Toast toast;
////        toast.cancel();
//        }
        toast = Toast.makeText(context, inText, duration);
//        toast.setMargin( Hr,Vr);
//        toast.setGravity(Gravity.CENTER, toast.getXOffset() / 2, toast.getYOffset() / 2);
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,10,10);
        toast.show();
    }
}