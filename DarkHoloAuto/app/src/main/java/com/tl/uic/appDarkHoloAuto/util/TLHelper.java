/********************************************************************************************
 * Copyright (C) 2017 Acoustic, L.P. All rights reserved.
 *
 * NOTICE: This file contains material that is confidential and proprietary to
 * Acoustic, L.P. and/or other developers. No license is granted under any intellectual or
 * industrial property rights of Acoustic, L.P. except as may be provided in an agreement with
 * Acoustic, L.P. Any unauthorized copying or distribution of content from this file is
 * prohibited.
 ********************************************************************************************/
package com.tl.uic.appDarkHoloAuto.util;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.tl.uic.Tealeaf;

public class TLHelper {
	
	public static OnClickListener getOnClickListener() {
		OnClickListener onClickListener = new OnClickListener() {

			@Override
			public void onClick(View view) {
				// TeaCuts (AspectJ) needs to have override methods to add hooks to it.
				// No need to add Tealeaf.logEvent
			}
		};

		return onClickListener;
	}

	public static OnItemClickListener getOnItemClickListener() {

		OnItemClickListener onItemClickListener = new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
			}
		};

		return onItemClickListener;
	}
	
	public static OnItemSelectedListener onItemSelected() {
		
		OnItemSelectedListener onItemSelectedListener = new OnItemSelectedListener() {
			public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
			}

		    public void onNothingSelected(@SuppressWarnings("rawtypes") AdapterView parent) {
		      // Do nothing.
		    }
		};
		
		return onItemSelectedListener;
    }
	
	public static OnSeekBarChangeListener getOnSeekBarChangeListener() {
		
		OnSeekBarChangeListener onClickListener = new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
			}
		};
		
		return onClickListener;
	}
	
	public static OnCheckedChangeListener getOnCheckedChangeListener() {
		
		OnCheckedChangeListener onCheckedChangeListener = new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
			}
		};
		
		return onCheckedChangeListener;
	}

	public static CompoundButton.OnCheckedChangeListener getCompoundButtonOnCheckedChangeListener() {

		CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			}
		};

		return onCheckedChangeListener;
	}

	public static OnRatingBarChangeListener getOnRatingBarChangeListener() {
		
		OnRatingBarChangeListener onRatingBarChangeListener = new OnRatingBarChangeListener() {
			
			@Override
			public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

			}
		};
		
		return onRatingBarChangeListener;
	}
	
	public static OnDateChangedListener getOnDateChangedListener() {
		
		OnDateChangedListener onDateChangedListener = new OnDateChangedListener() {
			
			@Override
			public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

			}
		};
		
		return onDateChangedListener;
	}
	
	public static void addFocusAndRegister(TextView textView, Activity activity) {
		
		textView.setOnFocusChangeListener(new OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {

			}
		});
		
		Tealeaf.registerFormField(textView, activity);
	}
	
	public static String getLogicalPageName(String logicalPageName, Fragment fragment) {
		 if ((logicalPageName == null) || (logicalPageName.equals(""))) {
	         logicalPageName = fragment.getClass().getName().substring(fragment.getClass().getName().lastIndexOf('.') + 1);
	     }
		 return logicalPageName;
	}
}
