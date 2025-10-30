package com.discord.chat.presentation.message.view.polls.a11y

import android.view.View
import android.view.accessibility.AccessibilityEvent
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import com.discord.chat.bridge.polls.PollChatAnswerInteractionType
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessory
import fm.p

public class PollsAnswerAccessibilityDelegate(accessory: PollAnswerAccessory) : androidx.core.view.a {
   private final val accessory: PollAnswerAccessory

   init {
      this.accessory = var1;
   }

   public override fun onInitializeAccessibilityEvent(host: View, event: AccessibilityEvent) {
      super.onInitializeAccessibilityEvent(var1, var2);
      val var4: Boolean = this.accessory.getAnswer().isSelected() == java.lang.Boolean.TRUE;
      val var3: Int = PollsAnswerAccessibilityDelegate.WhenMappings.$EnumSwitchMapping$0[this.accessory.getInteractionType().ordinal()];
      if (var3 != 1 && var3 != 2) {
         if (var3 == 3) {
            var2.setChecked(var4);
         } else {
            throw new p();
         }
      }
   }

   public override fun onInitializeAccessibilityNodeInfo(host: View, info: AccessibilityNodeInfoCompat) {
      super.onInitializeAccessibilityNodeInfo(var1, var2);
      var var4: Boolean;
      if (this.accessory.getInteractionType() === PollChatAnswerInteractionType.CHECKBOXES) {
         var4 = true;
      } else {
         var4 = false;
      }

      var2.q0(var4);
      var4 = this.accessory.getAnswer().isSelected() == java.lang.Boolean.TRUE;
      val var5: PollChatAnswerInteractionType = this.accessory.getInteractionType();
      val var6: IntArray = PollsAnswerAccessibilityDelegate.WhenMappings.$EnumSwitchMapping$0;
      var var3: Int = PollsAnswerAccessibilityDelegate.WhenMappings.$EnumSwitchMapping$0[var5.ordinal()];
      if (var3 != 1) {
         if (var3 != 2) {
            if (var3 != 3) {
               throw new p();
            }

            var2.r0(var4);
         } else {
            var2.V0(var4);
         }
      }

      var3 = var6[this.accessory.getInteractionType().ordinal()];
      val var7: java.lang.String;
      if (var3 != 1) {
         if (var3 != 2) {
            if (var3 != 3) {
               throw new p();
            }

            var7 = "android.widget.CheckBox";
         } else {
            var7 = "android.widget.RadioButton";
         }
      } else {
         var7 = "android.view.ViewGroup";
      }

      var2.s0(var7);
      if (this.accessory.getTapAccessibilityLabel() != null) {
         var2.b(new AccessibilityNodeInfoCompat.a(16, this.accessory.getTapAccessibilityLabel()));
      }
   }
}
