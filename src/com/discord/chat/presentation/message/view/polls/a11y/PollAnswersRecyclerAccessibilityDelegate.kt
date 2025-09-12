package com.discord.chat.presentation.message.view.polls.a11y

import android.content.Context
import android.view.View
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import com.discord.chat.presentation.message.messagepart.PollMessageAccessory
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.facebook.react.R.string

public class PollAnswersRecyclerAccessibilityDelegate(accessory: PollMessageAccessory) : androidx.core.view.a {
   private final val accessory: PollMessageAccessory

   init {
      this.accessory = var1;
   }

   public override fun onInitializeAccessibilityNodeInfo(host: View, info: AccessibilityNodeInfoCompat) {
      super.onInitializeAccessibilityNodeInfo(var1, var2);
      var2.s0("android.view.ViewGroup");
      val var5: java.lang.String;
      if (PollAnswersRecyclerAccessibilityDelegate.WhenMappings.$EnumSwitchMapping$0[this.accessory.getData().getAnswersInteraction().ordinal()] == 1) {
         var5 = var1.getContext().getString(string.radiogroup_description);
      } else {
         var5 = null;
      }

      var2.S0(var5);
      val var4: Context = var1.getContext();
      var2.a1(I18nUtilsKt.i18nFormat$default(var4, I18nMessage.POLL_OPTIONS_ARIA, null, 2, null));
   }
}
