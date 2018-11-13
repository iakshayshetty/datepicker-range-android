package com.example.user.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class TwoFragment extends Fragment{
    CalendarView todatepicker;
    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_two,
                container, false);
        todatepicker = (CalendarView) view.findViewById(R.id.todatepicker);
        // get the reference of CalendarView
        todatepicker.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String msg =i2 + "/" + (i1 + 1) + "/" + i;
                MainActivity.tovalue= String.valueOf(msg);
                MainActivity.textTwo.setText(String.valueOf(msg));

            }
        });
        return view;

    }

}