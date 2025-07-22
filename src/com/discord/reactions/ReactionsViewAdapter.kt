package com.discord.reactions

import android.annotation.SuppressLint
import android.content.Context
import android.view.ViewGroup
import android.view.View.OnClickListener
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.discord.misc.utilities.ids.IdUtilsKt
import com.discord.reactions.ReactionView.Reaction
import com.discord.reactions.ReactionView.ReactionsTheme
import com.discord.recycler_view.utils.ItemDiffer
import com.discord.theme.DiscordTheme
import com.discord.theme.ThemeManager
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r

internal class ReactionsViewAdapter(reactionHeight: Int) : RecyclerView.Adapter {
   private final val reactionHeight: Int
   private final var reactions: List<Reaction>
   private final var reactionsTheme: ReactionsTheme?
   private final lateinit var messageId: String
   private final lateinit var onAddReactionClick: OnClickListener
   private final lateinit var onReactionClick: (Reaction) -> Unit
   private final lateinit var onReactionLongPress: (Reaction) -> Unit
   private final lateinit var addReactionLabel: String
   private final lateinit var addNewReactionAccessibilityLabel: String
   private final var theme: DiscordTheme?
   private final var canAddNewReactions: Boolean

   init {
      this.reactionHeight = var1;
      this.reactions = i.k();
      this.setHasStableIds(true);
   }

   private fun getAddReactionIndex(): Int {
      return this.reactions.size();
   }

   public override fun getItemCount(): Int {
      val var2: Int = this.reactions.size();
      var var1: Int = var2;
      if (this.canAddNewReactions) {
         var1 = var2 + 1;
      }

      return var1;
   }

   public override fun getItemId(position: Int): Long {
      val var2: Int = this.getAddReactionIndex();
      var var6: java.lang.String = null;
      var var7: java.lang.String = null;
      val var3: Long;
      if (var1 == var2) {
         var6 = this.messageId;
         if (this.messageId == null) {
            r.y("messageId");
            var6 = null;
         }

         if (this.addReactionLabel == null) {
            r.y("addReactionLabel");
         } else {
            var7 = this.addReactionLabel;
         }

         val var13: StringBuilder = new StringBuilder();
         var13.append(var6);
         var13.append("_add_reactions_");
         var13.append(var7);
         var3 = IdUtilsKt.convertToId(var13.toString());
      } else {
         val var14: ReactionView.Reaction = this.reactions.get(var1);
         if (this.messageId == null) {
            r.y("messageId");
         } else {
            var6 = this.messageId;
         }

         var7 = var14.getEmoji().getEmojiId();
         val var5: Boolean = var14.isBurstReaction();
         val var15: StringBuilder = new StringBuilder();
         var15.append(var6);
         var15.append("_");
         var15.append(var7);
         var15.append(var5);
         var3 = IdUtilsKt.convertToId(var15.toString());
      }

      return var3;
   }

   public override fun getItemViewType(position: Int): Int {
      val var2: Byte;
      if (var1 == this.getAddReactionIndex()) {
         var2 = 47;
      } else if (this.reactions.get(var1).isBurstReaction()) {
         var2 = 45;
      } else {
         var2 = 46;
      }

      return var2;
   }

   public override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      r.h(var1, "holder");
      val var7: ThemeManager = ThemeManager.INSTANCE;
      val var8: DiscordTheme = ThemeManager.INSTANCE.getThemeOverride();
      var7.setThemeOverride(this.theme);
      val var3: Boolean = var1 is ReactionViewHolder;
      var var5: OnClickListener = null;
      var var4: Function1 = null;
      if (var3) {
         val var6: ReactionView.Reaction = this.reactions.get(var2);
         val var9: ReactionViewHolder = var1 as ReactionViewHolder;
         var var10: Function1 = this.onReactionClick;
         if (this.onReactionClick == null) {
            r.y("onReactionClick");
            var10 = null;
         }

         if (this.onReactionLongPress == null) {
            r.y("onReactionLongPress");
         } else {
            var4 = this.onReactionLongPress;
         }

         var9.bind(var6, var10, var4, this.reactionsTheme);
      } else {
         if (var1 !is AddReactionViewHolder) {
            val var15: Class = var1.getClass();
            val var12: StringBuilder = new StringBuilder();
            var12.append("Invalid view holder type ");
            var12.append(var15);
            throw new IllegalStateException(var12.toString().toString());
         }

         val var20: AddReactionViewHolder = var1 as AddReactionViewHolder;
         var var11: java.lang.String = this.addReactionLabel;
         if (this.addReactionLabel == null) {
            r.y("addReactionLabel");
            var11 = null;
         }

         var var14: java.lang.String = this.addNewReactionAccessibilityLabel;
         if (this.addNewReactionAccessibilityLabel == null) {
            r.y("addNewReactionAccessibilityLabel");
            var14 = null;
         }

         if (this.onAddReactionClick == null) {
            r.y("onAddReactionClick");
         } else {
            var5 = this.onAddReactionClick;
         }

         var20.bind(var11, var14, var5, this.reactionsTheme);
      }

      var7.setThemeOverride(var8);
   }

   public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      r.h(var1, "parent");
      val var5: com.google.android.flexbox.FlexboxLayoutManager.c = new com.google.android.flexbox.FlexboxLayoutManager.c(-2, this.reactionHeight);
      val var3: ThemeManager = ThemeManager.INSTANCE;
      val var4: DiscordTheme = ThemeManager.INSTANCE.getThemeOverride();
      var3.setThemeOverride(this.theme);
      val var8: Any;
      if (var2 != 46) {
         if (var2 != 47) {
            val var9: StringBuilder = new StringBuilder();
            var9.append("Invalid view type ");
            var9.append(var2);
            throw new IllegalStateException(var9.toString().toString());
         }

         val var6: Context = var1.getContext();
         r.g(var6, "getContext(...)");
         val var7: AddReactionView = new AddReactionView(var6, null, 2, null);
         var7.setLayoutParams(var5);
         var8 = new AddReactionViewHolder(var7);
      } else {
         val var10: Context = var1.getContext();
         r.g(var10, "getContext(...)");
         val var11: ReactionView = new ReactionView(var10, null, 2, null);
         var11.setLayoutParams(var5);
         var8 = new ReactionViewHolder(var11);
      }

      var3.setThemeOverride(var4);
      return (RecyclerView.ViewHolder)var8;
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setReactions(
      messageId: String,
      reactions: List<Reaction>,
      canAddNewReactions: Boolean,
      addReactionLabel: String,
      addNewReactionAccessibilityLabel: String,
      reactionsTheme: ReactionsTheme?,
      onAddReactionClick: OnClickListener,
      onReactionClick: (Reaction) -> Unit,
      onReactionLongPress: (Reaction) -> Unit,
      theme: DiscordTheme? = null,
      areChatAnimationsEnabled: Boolean = false
   ) {
      r.h(var1, "messageId");
      r.h(var2, "reactions");
      r.h(var4, "addReactionLabel");
      r.h(var5, "addNewReactionAccessibilityLabel");
      r.h(var7, "onAddReactionClick");
      r.h(var8, "onReactionClick");
      r.h(var9, "onReactionLongPress");
      this.messageId = var1;
      this.canAddNewReactions = var3;
      this.addReactionLabel = var4;
      this.addNewReactionAccessibilityLabel = var5;
      this.reactionsTheme = var6;
      this.onAddReactionClick = var7;
      this.onReactionClick = var8;
      this.onReactionLongPress = var9;
      this.theme = var10;
      if (var11) {
         val var12: java.util.List = this.reactions;
         this.reactions = var2;
         val var13: androidx.recyclerview.widget.c.e = androidx.recyclerview.widget.c.b(new ItemDiffer(var12, var2), true);
         r.g(var13, "calculateDiff(...)");
         var13.c(this);
      } else {
         this.reactions = var2;
         this.notifyDataSetChanged();
      }
   }
}
