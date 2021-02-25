package com.venkat.toastmessager;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;
import android.widget.Toolbar;

public class ToastMessager {

    public static void showTopLeft(Context context,String message){
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP|Gravity.START,0,0);
        toast.show();
        //Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
    public static void showTopRight(Context context,String message){
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP|Gravity.END,0,0);
        toast.show();
        //Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
    public static void showTopCenter(Context context,String message){
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP|Gravity.CENTER,0,0);
        toast.show();
        //Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
    public static void showCenterRight(Context context,String message){
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.END,0,0);
        toast.show();
        //Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
    public static void showCenterLeft(Context context,String message){
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.START,0,0);
        toast.show();
        //Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
    public static void showCenter(Context context,String message){
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
        //Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
    public static void showBottomRight(Context context,String message){
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM|Gravity.END,0,0);
        toast.show();
        //Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
    public static void showBottomLeft(Context context,String message){
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM|Gravity.START,0,0);
        toast.show();
        //Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
    public static void showBottomCenter(Context context,String message){
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);
        toast.show();
        //Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
