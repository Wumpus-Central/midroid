package com.discord.chat.input.utils

import android.text.Editable
import android.text.TextUtils.TruncateAt
import android.widget.EditText
import com.discord.chat.input.bridge.ChatInputNode
import com.discord.chat.input.bridge.ChatInputNodeFontWeight
import com.discord.chat.input.bridge.ChatInputNodeStyle
import com.discord.chat.input.spans.DCDBackgroundSpan
import com.discord.chat.input.spans.DCDBoldSpan
import com.discord.chat.input.spans.DCDColorSpan
import com.discord.chat.input.spans.DCDDeleteOnBackspaceSpan
import com.discord.chat.input.spans.DCDInputSpan
import com.discord.chat.input.spans.DCDNoSelectionSpan
import kotlin.jvm.internal.r

internal fun EditText.addEllipsizedHint(hint: CharSequence?, hintTruncateAt: TruncateAt = TruncateAt.END) {
   r.h(var0, "<this>");
   r.h(var2, "hintTruncateAt");
   if (var0.getMaxLines() != 1) {
      var0.setMaxLines(1);
   }

   var0.setEllipsize(var2);
   var0.setHint(var1);
}

@JvmSynthetic
fun `addEllipsizedHint$default`(var0: EditText, var1: java.lang.CharSequence, var2: TruncateAt, var3: Int, var4: Any) {
   if ((var3 and 2) != 0) {
      var2 = TruncateAt.END;
   }

   addEllipsizedHint(var0, var1, var2);
}

internal fun Editable.applyDCDSpan(span: DCDInputSpan, node: ChatInputNode) {
   r.h(var0, "<this>");
   r.h(var1, "span");
   r.h(var2, "node");
   if (var2.getLocation() <= var0.length() && var2.getLocation() + var2.getLength() <= var0.length()) {
      var0.setSpan(var1, var2.getLocation(), var2.getLocation() + var2.getLength(), 33);
   }
}

internal fun EditText.removeEllipsizedHint(maxLines: Int) {
   r.h(var0, "<this>");
   if (var0.getMaxLines() != var1) {
      var0.setMaxLines(var1);
   }

   var0.setEllipsize(null);
   var0.setHint(null);
}

internal fun Editable.setChatInputNodeStyle(node: ChatInputNode) {
   r.h(var0, "<this>");
   r.h(var1, "node");
   val var3: ChatInputNodeStyle = var1.getStyle();
   if (var3 != null) {
      applyDCDSpan(var0, new DCDColorSpan(var3.getColor()), var1);
      if (var3.getBackgroundStyle() != null) {
         applyDCDSpan(var0, new DCDBackgroundSpan(var3.getBackgroundStyle()), var1);
      }

      val var4: ChatInputNodeFontWeight = var3.getFontWeight();
      val var2: Int;
      if (var4 == null) {
         var2 = -1;
      } else {
         var2 = EditTextUtilsKt.WhenMappings.$EnumSwitchMapping$0[var4.ordinal()];
      }

      if (var2 == 1) {
         applyDCDSpan(var0, new DCDBoldSpan(), var1);
      }
   }

   if (var1.getDeleteNodeOnBackspace()) {
      applyDCDSpan(var0, new DCDDeleteOnBackspaceSpan(), var1);
   }

   if (var1.getEditDisabled()) {
      applyDCDSpan(var0, new DCDNoSelectionSpan(), var1);
   }
}
// $VF: Class flags could not be determined
internal class WhenMappings {
   @JvmStatic
   public int[] $EnumSwitchMapping$0;

   @JvmStatic
   fun {
      val var1: IntArray = new int[ChatInputNodeFontWeight.values().length];

      try {
         var1[ChatInputNodeFontWeight.Bold.ordinal()] = 1;
      } catch (var2: NoSuchFieldError) {
      }

      $EnumSwitchMapping$0 = var1;
   }
}
