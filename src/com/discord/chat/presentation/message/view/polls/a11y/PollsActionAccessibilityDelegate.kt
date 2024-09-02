package com.discord.chat.presentation.message.view.polls.a11y

import android.view.View
import android.view.View.AccessibilityDelegate
import android.view.accessibility.AccessibilityNodeInfo
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction
import android.widget.Button
import com.discord.chat.bridge.polls.PollAction
import kotlin.jvm.internal.q

public class PollsActionAccessibilityDelegate(action: PollAction) : AccessibilityDelegate {
   private final val action: PollAction

   init {
      q.h(var1, "action");
      super();
      this.action = var1;
   }

   public open fun onInitializeAccessibilityNodeInfo(host: View, info: AccessibilityNodeInfo) {
      q.h(var1, "host");
      q.h(var2, "info");
      super.onInitializeAccessibilityNodeInfo(var1, var2);
      var2.setClassName(Button.class.getName());
      if (this.action.getAccessibilityHint() != null) {
         var2.addAction(new AccessibilityAction(16, this.action.getAccessibilityHint()));
      }
   }
}
