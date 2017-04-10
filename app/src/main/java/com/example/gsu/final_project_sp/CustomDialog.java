package com.example.gsu.final_project_sp;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class CustomDialog extends Dialog {

    @OnClick(R.id.dialog_ok)
    public void okClick(){
        dismiss();
        listener.onClickListener();
    }

    private ICustomDialogEventListener listener;


    public interface ICustomDialogEventListener{
        public void onClickListener();
    }

    public CustomDialog(Context context, ICustomDialogEventListener listener) {
        super(context,R.style.dialog);
        this.listener = listener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_dialog);
        ButterKnife.bind(this);
    }
}
