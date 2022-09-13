// Generated code from Butter Knife. Do not modify!
package com.gautam.medicinetime.medicine;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.gautam.medicinetime.R;
import com.gautam.medicinetime.views.RobotoLightTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MedicineFragment_ViewBinding implements Unbinder {
  private MedicineFragment target;

  private View view7f090045;

  @UiThread
  public MedicineFragment_ViewBinding(final MedicineFragment target, View source) {
    this.target = target;

    View view;
    target.rvMedList = Utils.findRequiredViewAsType(source, R.id.medicine_list, "field 'rvMedList'", RecyclerView.class);
    target.noMedIcon = Utils.findRequiredViewAsType(source, R.id.noMedIcon, "field 'noMedIcon'", ImageView.class);
    target.noMedText = Utils.findRequiredViewAsType(source, R.id.noMedText, "field 'noMedText'", RobotoLightTextView.class);
    view = Utils.findRequiredView(source, R.id.add_med_now, "field 'addMedNow' and method 'addMedicine'");
    target.addMedNow = Utils.castView(view, R.id.add_med_now, "field 'addMedNow'", TextView.class);
    view7f090045 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.addMedicine();
      }
    });
    target.noMedView = Utils.findRequiredView(source, R.id.no_med_view, "field 'noMedView'");
    target.progressLoader = Utils.findRequiredViewAsType(source, R.id.progressLoader, "field 'progressLoader'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MedicineFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvMedList = null;
    target.noMedIcon = null;
    target.noMedText = null;
    target.addMedNow = null;
    target.noMedView = null;
    target.progressLoader = null;

    view7f090045.setOnClickListener(null);
    view7f090045 = null;
  }
}
