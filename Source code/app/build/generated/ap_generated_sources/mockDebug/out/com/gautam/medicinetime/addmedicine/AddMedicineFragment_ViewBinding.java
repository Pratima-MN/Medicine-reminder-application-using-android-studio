// Generated code from Butter Knife. Do not modify!
package com.gautam.medicinetime.addmedicine;

import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatSpinner;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.gautam.medicinetime.R;
import com.gautam.medicinetime.views.DayViewCheckBox;
import com.gautam.medicinetime.views.RobotoBoldTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddMedicineFragment_ViewBinding implements Unbinder {
  private AddMedicineFragment target;

  private View view7f0900b1;

  private View view7f0900a2;

  private View view7f0900a0;

  private View view7f0900a4;

  private View view7f0900a5;

  private View view7f0900a3;

  private View view7f09009f;

  private View view7f0900a1;

  private View view7f0901cb;

  private View view7f09017c;

  @UiThread
  public AddMedicineFragment_ViewBinding(final AddMedicineFragment target, View source) {
    this.target = target;

    View view;
    target.editMedName = Utils.findRequiredViewAsType(source, R.id.edit_med_name, "field 'editMedName'", EditText.class);
    view = Utils.findRequiredView(source, R.id.every_day, "field 'everyDay' and method 'onCheckboxClicked'");
    target.everyDay = Utils.castView(view, R.id.every_day, "field 'everyDay'", AppCompatCheckBox.class);
    view7f0900b1 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCheckboxClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.dv_sunday, "field 'dvSunday' and method 'onCheckboxClicked'");
    target.dvSunday = Utils.castView(view, R.id.dv_sunday, "field 'dvSunday'", DayViewCheckBox.class);
    view7f0900a2 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCheckboxClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.dv_monday, "field 'dvMonday' and method 'onCheckboxClicked'");
    target.dvMonday = Utils.castView(view, R.id.dv_monday, "field 'dvMonday'", DayViewCheckBox.class);
    view7f0900a0 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCheckboxClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.dv_tuesday, "field 'dvTuesday' and method 'onCheckboxClicked'");
    target.dvTuesday = Utils.castView(view, R.id.dv_tuesday, "field 'dvTuesday'", DayViewCheckBox.class);
    view7f0900a4 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCheckboxClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.dv_wednesday, "field 'dvWednesday' and method 'onCheckboxClicked'");
    target.dvWednesday = Utils.castView(view, R.id.dv_wednesday, "field 'dvWednesday'", DayViewCheckBox.class);
    view7f0900a5 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCheckboxClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.dv_thursday, "field 'dvThursday' and method 'onCheckboxClicked'");
    target.dvThursday = Utils.castView(view, R.id.dv_thursday, "field 'dvThursday'", DayViewCheckBox.class);
    view7f0900a3 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCheckboxClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.dv_friday, "field 'dvFriday' and method 'onCheckboxClicked'");
    target.dvFriday = Utils.castView(view, R.id.dv_friday, "field 'dvFriday'", DayViewCheckBox.class);
    view7f09009f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCheckboxClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.dv_saturday, "field 'dvSaturday' and method 'onCheckboxClicked'");
    target.dvSaturday = Utils.castView(view, R.id.dv_saturday, "field 'dvSaturday'", DayViewCheckBox.class);
    view7f0900a1 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCheckboxClicked(p0);
      }
    });
    target.checkboxLayout = Utils.findRequiredViewAsType(source, R.id.checkbox_layout, "field 'checkboxLayout'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.tv_medicine_time, "field 'tvMedicineTime' and method 'onMedicineTimeClick'");
    target.tvMedicineTime = Utils.castView(view, R.id.tv_medicine_time, "field 'tvMedicineTime'", RobotoBoldTextView.class);
    view7f0901cb = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onMedicineTimeClick();
      }
    });
    target.tvDoseQuantity = Utils.findRequiredViewAsType(source, R.id.tv_dose_quantity, "field 'tvDoseQuantity'", EditText.class);
    view = Utils.findRequiredView(source, R.id.spinner_dose_units, "field 'spinnerDoseUnits' and method 'onSpinnerItemSelected'");
    target.spinnerDoseUnits = Utils.castView(view, R.id.spinner_dose_units, "field 'spinnerDoseUnits'", AppCompatSpinner.class);
    view7f09017c = view;
    ((AdapterView<?>) view).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
      @Override
      public void onItemSelected(AdapterView<?> p0, View p1, int p2, long p3) {
        target.onSpinnerItemSelected(p2);
      }

      @Override
      public void onNothingSelected(AdapterView<?> p0) {
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    AddMedicineFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.editMedName = null;
    target.everyDay = null;
    target.dvSunday = null;
    target.dvMonday = null;
    target.dvTuesday = null;
    target.dvWednesday = null;
    target.dvThursday = null;
    target.dvFriday = null;
    target.dvSaturday = null;
    target.checkboxLayout = null;
    target.tvMedicineTime = null;
    target.tvDoseQuantity = null;
    target.spinnerDoseUnits = null;

    view7f0900b1.setOnClickListener(null);
    view7f0900b1 = null;
    view7f0900a2.setOnClickListener(null);
    view7f0900a2 = null;
    view7f0900a0.setOnClickListener(null);
    view7f0900a0 = null;
    view7f0900a4.setOnClickListener(null);
    view7f0900a4 = null;
    view7f0900a5.setOnClickListener(null);
    view7f0900a5 = null;
    view7f0900a3.setOnClickListener(null);
    view7f0900a3 = null;
    view7f09009f.setOnClickListener(null);
    view7f09009f = null;
    view7f0900a1.setOnClickListener(null);
    view7f0900a1 = null;
    view7f0901cb.setOnClickListener(null);
    view7f0901cb = null;
    ((AdapterView<?>) view7f09017c).setOnItemSelectedListener(null);
    view7f09017c = null;
  }
}
