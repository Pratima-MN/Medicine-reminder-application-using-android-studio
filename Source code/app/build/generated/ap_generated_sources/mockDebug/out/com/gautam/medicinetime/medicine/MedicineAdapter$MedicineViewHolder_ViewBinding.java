// Generated code from Butter Knife. Do not modify!
package com.gautam.medicinetime.medicine;

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

public class MedicineAdapter$MedicineViewHolder_ViewBinding implements Unbinder {
  private MedicineAdapter.MedicineViewHolder target;

  @UiThread
  public MedicineAdapter$MedicineViewHolder_ViewBinding(MedicineAdapter.MedicineViewHolder target,
      View source) {
    this.target = target;

    target.tvMedTime = Utils.findRequiredViewAsType(source, R.id.tv_med_time, "field 'tvMedTime'", RobotoBoldTextView.class);
    target.tvMedicineName = Utils.findRequiredViewAsType(source, R.id.tv_medicine_name, "field 'tvMedicineName'", RobotoBoldTextView.class);
    target.tvDoseDetails = Utils.findRequiredViewAsType(source, R.id.tv_dose_details, "field 'tvDoseDetails'", RobotoRegularTextView.class);
    target.ivMedicineAction = Utils.findRequiredViewAsType(source, R.id.iv_medicine_action, "field 'ivMedicineAction'", ImageView.class);
    target.ivAlarmDelete = Utils.findRequiredViewAsType(source, R.id.iv_alarm_delete, "field 'ivAlarmDelete'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MedicineAdapter.MedicineViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvMedTime = null;
    target.tvMedicineName = null;
    target.tvDoseDetails = null;
    target.ivMedicineAction = null;
    target.ivAlarmDelete = null;
  }
}
