package com.discord.reactions

import android.view.View.OnClickListener
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.reactions.ReactionView.ReactionsTheme
import kotlin.jvm.internal.r

internal class AddBurstReactionViewHolder(addReactionView: AddReactionView) : ViewHolder {
   private final val addReactionView: AddReactionView

   init {
      r.h(var1, "addReactionView");
      super(var1);
      this.addReactionView = var1;
   }

   public fun bind(addReactionLabel: String, addNewReactionAccessibilityLabel: String, onAddReactionClick: OnClickListener, reactionsTheme: ReactionsTheme?) {
      r.h(var1, "addReactionLabel");
      r.h(var2, "addNewReactionAccessibilityLabel");
      r.h(var3, "onAddReactionClick");
      val var5: AddReactionView = this.addReactionView;
      this.addReactionView.configure(var1, var4, true);
      var5.setContentDescription(var2);
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var5, false, var3, 1, null);
   }
}
