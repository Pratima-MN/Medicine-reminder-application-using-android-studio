// Generated code from Butter Knife. Do not modify!
package com.gautam.medicinetime.report;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.gautam.medicinetime.R;
import com.gautam.medicinetime.views.RobotoLightTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MonthlyReportFragment_ViewBinding implements Unbinder {
  private MonthlyReportFragment target;

  @UiThread
  public MonthlyReportFragment_ViewBinding(MonthlyReportFragment target, View source) {
    this.target = target;

    target.rvHistoryList = Utils.findRequiredViewAsType(source, R.id.rv_history_list, "field 'rvHistoryList'", RecyclerView.class);
    target.progressLoader = Utils.findRequiredViewAsType(source, R.id.progressLoader, "field 'progressLoader'", ProgressBar.class);
    target.noMedIcon = Utils.findRequiredViewAsType(source, R.id.noMedIcon, "field 'noMedIcon'", ImageView.class);
    target.noMedText = Utils.findRequiredViewAsType(source, R.id.noMedText, "field 'noMedText'", RobotoLightTextView.class);
    target.noMedView = Utils.findRequiredView(source, R.id.no_med_view, "field 'noMedView'");
    target.filteringLabel = Utils.findRequiredViewAsType(source, R.id.filteringLabel, "field 'filteringLabel'", TextView.class);
    target.tasksLL = Utils.findRequiredViewAsType(source, R.id.tasksLL, "field 'tasksLL'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MonthlyReportFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvHistoryList = null;
    target.progressLoader = null;
    target.noMedIcon = null;
    target.noMedText = null;
    target.noMedView = null;
    target.filteringLabel = null;
    target.tasksLL = null;
  }
}
