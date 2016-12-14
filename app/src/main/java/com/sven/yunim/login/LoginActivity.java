package com.sven.yunim.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;

import com.sven.yunim.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.sven.yunim.R.layout.activity_login;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {

    @Bind(R.id.progressbar)
    ProgressBar progressbar;
    @Bind(R.id.tv_phone)
    AutoCompleteTextView tvPhone;
    @Bind(R.id.tv_password)
    EditText tvPassword;
    @Bind(R.id.btn_login)
    Button btnLogin;
    @Bind(R.id.email_login_form)
    LinearLayout emailLoginForm;
    @Bind(R.id.login_form)
    ScrollView loginForm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_login)
    public void onClick() {

    }
}

