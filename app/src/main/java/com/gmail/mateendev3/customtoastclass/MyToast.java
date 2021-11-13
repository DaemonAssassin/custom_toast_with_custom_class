package com.gmail.mateendev3.customtoastclass;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyToast extends Toast {

    public MyToast(Context context) {
        super(context);
    }

    @Override
    public void show() {
        super.show();
    }

    public static MyToast makeMyToast (Context context, String message, int imageResID, int duration) {

        MyToast toast = new MyToast(context);

        View toastInstance = LayoutInflater.from(context).inflate(R.layout.styled_toast_design_1, null);

        toast.setView(toastInstance);
        toast.setDuration(duration);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);

        TextView tvToastText = toastInstance.findViewById(R.id.tv_toast);
        ImageView ivToastIcon1 = toastInstance.findViewById(R.id.iv_toast_icon);
        ImageView ivToastIcon2 = toastInstance.findViewById(R.id.iv_toast_icon1);

        tvToastText.setText(message);
        ivToastIcon1.setImageResource(imageResID);
        ivToastIcon2.setImageResource(imageResID);

        return toast;
    }
}
