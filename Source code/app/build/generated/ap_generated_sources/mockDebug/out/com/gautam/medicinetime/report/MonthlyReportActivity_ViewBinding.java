// Generated code from Butter Knife. Do not modify!
package com.gautam.medicinetime.report;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.gautam.medicinetime.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MonthlyReportActivity_ViewBinding implements Unbinder {
  private MonthlyReportActivity target;

  @UiThread
  public MonthlyReportActivity_ViewBinding(MonthlyReportActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MonthlyReportActivity_ViewBinding(MonthlyReportActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MonthlyReportActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
  }
}
