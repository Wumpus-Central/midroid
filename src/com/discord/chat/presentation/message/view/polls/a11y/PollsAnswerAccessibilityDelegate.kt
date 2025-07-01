package com.discord.chat.presentation.message.view.polls.a11y

import A9.n
import android.view.View
import android.view.accessibility.AccessibilityEvent
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import com.discord.chat.bridge.polls.PollChatAnswerInteractionType
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessory
import kotlin.jvm.internal.q

public class PollsAnswerAccessibilityDelegate(accessory: PollAnswerAccessory) : androidx.core.view.a {
   private final val accessory: PollAnswerAccessory

   init {
      q.h(var1, "accessory");
      super();
      this.accessory = var1;
   }

   public override fun onInitializeAccessibilityEvent(host: View, event: AccessibilityEvent) {
      q.h(var1, "host");
      q.h(var2, "event");
      super.onInitializeAccessibilityEvent(var1, var2);
      val var4: Boolean = q.c(this.accessory.getAnswer().isSelected(), java.lang.Boolean.TRUE);
      val var3: Int = PollsAnswerAccessibilityDelegate.WhenMappings.$EnumSwitchMapping$0[this.accessory.getInteractionType().ordinal()];
      if (var3 != 1 && var3 != 2) {
         if (var3 != 3) {
            throw new n();
         }

         var2.setChecked(var4);
      }
   }

   public override fun onInitializeAccessibilityNodeInfo(host: View, info: AccessibilityNodeInfoCompat) {
      q.h(var1, "host");
      q.h(var2, "info");
      super.onInitializeAccessibilityNodeInfo(var1, var2);
      var var4: Boolean;
      if (this.accessory.getInteractionType() === PollChatAnswerInteractionType.CHECKBOXES) {
         var4 = true;
      } else {
         var4 = false;
      }

      var2.p0(var4);
      var4 = q.c(this.accessory.getAnswer().isSelected(), java.lang.Boolean.TRUE);
      val var5: PollChatAnswerInteractionType = this.accessory.getInteractionType();
      val var6: IntArray = PollsAnswerAccessibilityDelegate.WhenMappings.$EnumSwitchMapping$0;
      var var3: Int = PollsAnswerAccessibilityDelegate.WhenMappings.$EnumSwitchMapping$0[var5.ordinal()];
      if (var3 != 1) {
         if (var3 != 2) {
            if (var3 != 3) {
               throw new n();
            }

            var2.q0(var4);
         } else {
            var2.Q0(var4);
         }
      }

      var3 = var6[this.accessory.getInteractionType().ordinal()];
      val var7: java.lang.String;
      if (var3 != 1) {
         if (var3 != 2) {
            if (var3 != 3) {
               throw new n();
            }

            var7 = "android.widget.CheckBox";
         } else {
            var7 = "android.widget.RadioButton";
         }
      } else {
         var7 = "android.view.ViewGroup";
      }

      var2.r0(var7);
      if (this.accessory.getTapAccessibilityLabel() != null) {
         var2.b(new AccessibilityNodeInfoCompat.a(16, this.accessory.getTapAccessibilityLabel()));
      }
   }
}
