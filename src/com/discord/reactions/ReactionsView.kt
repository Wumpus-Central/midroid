package com.discord.reactions

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.View.OnClickListener
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.reactions.ReactionView.Reaction
import com.discord.reactions.ReactionView.ReactionsTheme
import com.discord.recycler_view.decorations.HorizontalSpacingItemDecoration
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration
import com.discord.theme.DiscordTheme
import kotlin.jvm.internal.q

public class ReactionsView  public constructor(context: Context, attrs: AttributeSet? = null) : RecyclerView {
   private final val adapter: ReactionsViewAdapter

   fun ReactionsView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2);
      this.setLayoutManager(new ReactionsFlexboxLayoutManager(var1));
      val var4: ReactionsViewAdapter = new ReactionsViewAdapter(REACTION_HEIGHT);
      this.adapter = var4;
      this.setAdapter(var4);
      val var3: Int = SizeUtilsKt.getDpToPx(4);
      this.addItemDecoration(new HorizontalSpacingItemDecoration(var3));
      this.addItemDecoration(new VerticalSpacingItemDecoration(var3, 0, var3, false, 10, null));
      val var7: RecyclerView.ItemAnimator = this.getItemAnimator();
      var var5: DefaultItemAnimator = null;
      if (var7 != null) {
         var var6: RecyclerView.ItemAnimator = var7;
         if (var7 !is DefaultItemAnimator) {
            var6 = null;
         }

         var5 = var6 as DefaultItemAnimator;
      }

      q.e(var5);
      var5.setSupportsChangeAnimations(false);
   }

   @JvmStatic
   fun `setReactions$lambda$0`(var0: View) {
   }

   @JvmStatic
   fun `setReactions$lambda$1`(var0: View) {
   }

   public fun setReactions(
      messageId: String,
      reactions: List<Reaction>,
      canAddNewReactions: Boolean,
      canAddNewBurstReactions: Boolean,
      addReactionLabel: String,
      addNewReactionAccessibilityLabel: String,
      addNewBurstReactionAccessibilityLabel: String,
      reactionsTheme: ReactionsTheme?,
      onAddReactionClick: OnClickListener = new e(),
      onAddBurstReactionClick: OnClickListener = new f(),
      onReactionClick: (Reaction) -> Unit,
      onReactionLongPress: (Reaction) -> Unit = <unrepresentable>.INSTANCE,
      theme: DiscordTheme? = null,
      areChatAnimationsEnabled: Boolean = false
   ) {
      q.h(var1, "messageId");
      q.h(var2, "reactions");
      q.h(var5, "addReactionLabel");
      q.h(var6, "addNewReactionAccessibilityLabel");
      q.h(var7, "addNewBurstReactionAccessibilityLabel");
      q.h(var9, "onAddReactionClick");
      q.h(var10, "onAddBurstReactionClick");
      q.h(var11, "onReactionClick");
      q.h(var12, "onReactionLongPress");
      this.adapter
         .setReactions(
            var1, ReactionsViewKt.separateAndSortDuplicateReactions(var2), var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14
         );
   }

   public fun setViewPool(viewPool: RecycledViewPool) {
      q.h(var1, "viewPool");
      this.setRecycledViewPool(var1);
   }

   public companion object {
      private final val REACTION_HEIGHT: Int
   }
}
