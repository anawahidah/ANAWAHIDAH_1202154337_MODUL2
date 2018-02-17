package com.example.android.anawahidah_1202154337_modul2;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;

import java.util.Calendar;
/**
 * Created by AnaWahidahRizky on 17/02/2018.
 */

@SuppressLint("ValidFragment")
class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener{

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //sebagai default date
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        //menginstance datepicker dialog dan mengembalikannya
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    @Override
    //mengconvert tanggalnya ke string
    public void onDateSet(DatePicker view, int year, int month, int day) {
        //mengeset activity ke takeAwayActivity
        TakeAwayActivity TakeAwayActivity = (TakeAwayActivity) getActivity();
        //memerintahkan takeAway untuk memproses processDatePickerResult() method
        TakeAwayActivity.processDatePickerResult(year, month, day);
    }

}