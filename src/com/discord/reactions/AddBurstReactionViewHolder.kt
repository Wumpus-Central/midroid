package com.discord.reactions

import android.view.View.OnClickListener
import androidx.recyclerview.widget.RecyclerView
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.reactions.ReactionView.ReactionsTheme
import kotlin.jvm.internal.r

internal class AddBurstReactionViewHolder(addReactionView: AddReactionView) : RecyclerView.ViewHolder {
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
      AddReactionView.configure$default(this.addReactionView, var1, var4, true, null, 8, null);
      var5.setContentDescription(var2);
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var5, false, var3, 1, null);
   }
}
