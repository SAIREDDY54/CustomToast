package com.example.customtoast;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

public class Toaster {
    public static void CustomToast(Context c, String message){
        Toast.makeText(c, message, Toast.LENGTH_LONG).show();
    }
}
