// Generated code from Butter Knife. Do not modify!
package com.gautam.medicinetime.report;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.gautam.medicinetime.R;
import com.gautam.medicinetime.views.RobotoBoldTextView;
import com.gautam.medicinetime.views.RobotoRegularTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HistoryAdapter$HistoryViewHolder_ViewBinding implements Unbinder {
  private HistoryAdapter.HistoryViewHolder target;

  @UiThread
  public HistoryAdapter$HistoryViewHolder_ViewBinding(HistoryAdapter.HistoryViewHolder target,
      View source) {
    this.target = target;

    target.tvMedDate = Utils.findRequiredViewAsType(source, R.id.tv_med_date, "field 'tvMedDate'", RobotoBoldTextView.class);
    target.tvMedicineName = Utils.findRequiredViewAsType(source, R.id.tv_medicine_name, "field 'tvMedicineName'", RobotoBoldTextView.class);
    target.tvDoseDetails = Utils.findRequiredViewAsType(source, R.id.tv_dose_details, "field 'tvDoseDetails'", RobotoRegularTextView.class);
    target.ivMedicineAction = Utils.findRequiredViewAsType(source, R.id.iv_medicine_action, "field 'ivMedicineAction'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HistoryAdapter.HistoryViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvMedDate = null;
    target.tvMedicineName = null;
    target.tvDoseDetails = null;
    target.ivMedicineAction = null;
  }
}
