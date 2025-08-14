package com.discord.reactions

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.reactions.ReactionView.Reaction
import com.discord.reactions.ReactionView.ReactionsTheme
import kotlin.jvm.functions.Function1

internal class ReactionViewHolder(reactionView: ReactionView) : RecyclerView.ViewHolder(var1) {
   private final val reactionView: ReactionView

   init {
      this.reactionView = var1;
   }

   @JvmStatic
   fun `bind$lambda$2$lambda$0`(var0: Function1, var1: ReactionView.Reaction, var2: View) {
      var0.invoke(var1);
   }

   @JvmStatic
   fun `bind$lambda$2$lambda$1`(var0: Function1, var1: ReactionView.Reaction, var2: View): Boolean {
      var0.invoke(var1);
      return true;
   }

   public fun bind(reaction: Reaction, onReactionClick: (Reaction) -> Unit, onReactionLongPress: (Reaction) -> Unit, reactionsTheme: ReactionsTheme?) {
      val var5: ReactionView = this.reactionView;
      this.reactionView.setReaction(var1, var4);
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var5, false, new b(var2, var1), 1, null);
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var5, false, new c(var3, var1), 1, null);
   }
}
