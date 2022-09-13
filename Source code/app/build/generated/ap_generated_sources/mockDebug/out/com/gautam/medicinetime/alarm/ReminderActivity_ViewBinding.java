// Generated code from Butter Knife. Do not modify!
package com.gautam.medicinetime.alarm;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.gautam.medicinetime.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ReminderActivity_ViewBinding implements Unbinder {
  private ReminderActivity target;

  @UiThread
  public ReminderActivity_ViewBinding(ReminderActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ReminderActivity_ViewBinding(ReminderActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ReminderActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
  }
}
