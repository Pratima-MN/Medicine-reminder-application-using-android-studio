// Generated code from Butter Knife. Do not modify!
package com.gautam.medicinetime.medicine;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.gautam.medicinetime.R;
import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MedicineActivity_ViewBinding implements Unbinder {
  private MedicineActivity target;

  private View view7f090084;

  @UiThread
  public MedicineActivity_ViewBinding(MedicineActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MedicineActivity_ViewBinding(final MedicineActivity target, View source) {
    this.target = target;

    View view;
    target.mCompactCalendarView = Utils.findRequiredViewAsType(source, R.id.compactcalendar_view, "field 'mCompactCalendarView'", CompactCalendarView.class);
    target.datePickerTextView = Utils.findRequiredViewAsType(source, R.id.date_picker_text_view, "field 'datePickerTextView'", TextView.class);
    view = Utils.findRequiredView(source, R.id.date_picker_button, "field 'datePickerButton' and method 'onDatePickerButtonClicked'");
    target.datePickerButton = Utils.castView(view, R.id.date_picker_button, "field 'datePickerButton'", RelativeLayout.class);
    view7f090084 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onDatePickerButtonClicked();
      }
    });
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.collapsingToolbarLayout = Utils.findRequiredViewAsType(source, R.id.collapsingToolbarLayout, "field 'collapsingToolbarLayout'", CollapsingToolbarLayout.class);
    target.appBarLayout = Utils.findRequiredViewAsType(source, R.id.app_bar_layout, "field 'appBarLayout'", AppBarLayout.class);
    target.contentFrame = Utils.findRequiredViewAsType(source, R.id.contentFrame, "field 'contentFrame'", FrameLayout.class);
    target.fabAddTask = Utils.findRequiredViewAsType(source, R.id.fab_add_task, "field 'fabAddTask'", FloatingActionButton.class);
    target.coordinatorLayout = Utils.findRequiredViewAsType(source, R.id.coordinatorLayout, "field 'coordinatorLayout'", CoordinatorLayout.class);
    target.arrow = Utils.findRequiredViewAsType(source, R.id.date_picker_arrow, "field 'arrow'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MedicineActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mCompactCalendarView = null;
    target.datePickerTextView = null;
    target.datePickerButton = null;
    target.toolbar = null;
    target.collapsingToolbarLayout = null;
    target.appBarLayout = null;
    target.contentFrame = null;
    target.fabAddTask = null;
    target.coordinatorLayout = null;
    target.arrow = null;

    view7f090084.setOnClickListener(null);
    view7f090084 = null;
  }
}
