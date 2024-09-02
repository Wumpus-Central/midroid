package com.discord.react_gesture_handler.nested_touch

import android.view.View
import android.widget.TextView
import kotlin.enums.EnumEntries

public interface NestedClickableSpan {
   public val touchPriority: com.discord.react_gesture_handler.nested_touch.NestedClickableSpan.TouchPriority

   public abstract fun enableHighlight(textView: TextView) {
   }

   public abstract fun onClick(view: View) {
   }

   public abstract fun onLongClick(view: View): Boolean {
   }

   public enum class TouchPriority {
      DEFAULT,
      HIGH      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private NestedClickableSpan.TouchPriority[] $VALUES;

      @JvmStatic
      fun {
         val var0: Array<NestedClickableSpan.TouchPriority> = $values();
         $VALUES = var0;
         $ENTRIES = sj.a.a(var0);
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }
   }
}
