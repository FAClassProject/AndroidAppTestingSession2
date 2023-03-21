package com.aptech.test;

import android.text.Editable;
import android.text.TextWatcher;

import java.util.regex.Pattern;


/**
 * An Email format validator for {@link android.widget.EditText}.
 */
public class EmailValidator implements TextWatcher {
    private boolean mIsValid = false;

    /**
     * Email validation pattern.
     */
    public static final Pattern EMAIL_PATTERN = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
    );


    public boolean isValid() {
        return mIsValid;
    }

    /**
     * Validates if the given input is a valid email address.
     *
     * @param email The email to validate.
     * @return {@code true} if the input is a valid email. {@code false} otherwise.
     */
    public static boolean isValidEmail(CharSequence email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }


    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        /*No-op*/

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        /*No-op*/

    }

    @Override
    public void afterTextChanged(Editable editable) {
        mIsValid = isValidEmail(editable);

    }
}
