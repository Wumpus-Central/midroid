package com.discord.reactions

import android.view.View.OnClickListener
import androidx.recyclerview.widget.RecyclerView
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.reactions.ReactionView.ReactionsTheme

internal class AddReactionViewHolder(addReactionView: AddReactionView) : RecyclerView.ViewHolder(var1) {
   private final val addReactionView: AddReactionView

   init {
      this.addReactionView = var1;
   }

   public fun bind(addReactionLabel: String, addNewReactionAccessibilityLabel: String, onAddReactionClick: OnClickListener, reactionsTheme: ReactionsTheme?) {
      val var5: AddReactionView = this.addReactionView;
      AddReactionView.configure$default(this.addReactionView, var1, var4, false, null, 8, null);
      var5.setContentDescription(var2);
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var5, false, var3, 1, null);
   }
}
