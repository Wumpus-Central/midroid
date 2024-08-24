package com.discord.react_gesture_handler.nested_touch

import android.view.View
import android.widget.TextView

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
      private NestedClickableSpan.TouchPriority[] $VALUES = $values();
   }
}
