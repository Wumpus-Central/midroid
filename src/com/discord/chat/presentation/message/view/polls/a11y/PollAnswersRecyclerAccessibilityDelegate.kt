package com.discord.chat.presentation.message.view.polls.a11y

import android.content.Context
import android.view.View
import androidx.core.view.a
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import com.discord.chat.bridge.polls.PollChatAnswerInteractionType
import com.discord.chat.presentation.message.messagepart.PollMessageAccessory
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.facebook.react.R.string
import kotlin.jvm.internal.r

public class PollAnswersRecyclerAccessibilityDelegate(accessory: PollMessageAccessory) : a {
   private final val accessory: PollMessageAccessory

   init {
      r.h(var1, "accessory");
      super();
      this.accessory = var1;
   }

   public open fun onInitializeAccessibilityNodeInfo(host: View, info: AccessibilityNodeInfoCompat) {
      r.h(var1, "host");
      r.h(var2, "info");
      super.onInitializeAccessibilityNodeInfo(var1, var2);
      var2.q0("android.view.ViewGroup");
      val var5: java.lang.String;
      if (PollAnswersRecyclerAccessibilityDelegate.WhenMappings.$EnumSwitchMapping$0[this.accessory.getData().getAnswersInteraction().ordinal()] == 1) {
         var5 = var1.getContext().getString(string.radiogroup_description);
      } else {
         var5 = null;
      }

      var2.L0(var5);
      val var4: Context = var1.getContext();
      r.g(var4, "host.context");
      var2.T0(I18nUtilsKt.i18nFormat$default(var4, I18nMessage.POLL_OPTIONS_ARIA, null, 2, null));
   }

   // $VF: Class flags could not be determined
   internal class WhenMappings {
      @JvmStatic
      public int[] $EnumSwitchMapping$0;

      @JvmStatic
      fun {
         val var1: IntArray = new int[PollChatAnswerInteractionType.values().length];

         try {
            var1[PollChatAnswerInteractionType.RADIO_BUTTONS.ordinal()] = 1;
         } catch (var2: NoSuchFieldError) {
         }

         $EnumSwitchMapping$0 = var1;
      }
   }
}
