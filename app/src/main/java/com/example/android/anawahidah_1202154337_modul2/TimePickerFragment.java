package com.example.android.anawahidah_1202154337_modul2;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;
import android.widget.TimePicker;

import java.util.Calendar;
/**
 * Created by AnaWahidahRizky on 17/02/2018.
 */

@SuppressLint("ValidFragment")
class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener{

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //mengeset waktu sekarang ke datepicker
        final Calendar c = Calendar.getInstance();

        //membuat object baru untuk timepickerdialog dan mengembalikannya
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        return new TimePickerDialog(getActivity(), this, hour, minute, DateFormat.is24HourFormat(getActivity()));
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        //mengeset activity ke takeAway activity
        TakeAwayActivity TakeAwayActivity = (TakeAwayActivity) getActivity();
        //memerintahkan takeAway Activity untuk memproses TimePickerDialog() method
        TakeAwayActivity.processTimePickerResult(hourOfDay, minute);
    }
}