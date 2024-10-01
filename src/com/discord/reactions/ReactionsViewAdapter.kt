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
import kotlin.jvm.internal.q

internal class ReactionsViewAdapter(reactionHeight: Int) : RecyclerView.Adapter {
   private final lateinit var addNewBurstReactionAccessibilityLabel: String
   private final lateinit var addNewReactionAccessibilityLabel: String
   private final lateinit var addReactionLabel: String
   private final var canAddNewBurstReactions: Boolean
   private final var canAddNewReactions: Boolean
   private final lateinit var messageId: String
   private final lateinit var onAddBurstReactionClick: OnClickListener
   private final lateinit var onAddReactionClick: OnClickListener
   private final lateinit var onReactionClick: (Reaction) -> Unit
   private final lateinit var onReactionLongPress: (Reaction) -> Unit
   private final val reactionHeight: Int
   private final var reactions: List<Reaction>
   private final var reactionsTheme: ReactionsTheme?
   private final var theme: DiscordTheme?

   init {
      this.reactionHeight = var1;
      this.reactions = i.k();
      this.setHasStableIds(true);
   }

   private fun getAddBurstReactionIndex(): Int {
      val var1: Int;
      if (this.canAddNewBurstReactions) {
         var1 = this.reactions.size();
      } else {
         var1 = this.reactions.size() + 1;
      }

      return var1;
   }

   private fun getAddReactionIndex(): Int {
      val var1: Int;
      if (this.canAddNewBurstReactions) {
         var1 = this.reactions.size() + 1;
      } else {
         var1 = this.reactions.size();
      }

      return var1;
   }

   public override fun getItemCount(): Int {
      val var2: Int = this.reactions.size();
      var var1: Int = var2;
      if (this.canAddNewReactions) {
         if (this.canAddNewBurstReactions) {
            var1 = var2 + 2;
         } else {
            var1 = var2 + 1;
         }
      }

      return var1;
   }

   public override fun getItemId(position: Int): Long {
      val var2: Int = this.getAddBurstReactionIndex();
      var var6: java.lang.String = null;
      var var7: java.lang.String = null;
      val var3: Long;
      if (var1 == var2) {
         var6 = this.messageId;
         if (this.messageId == null) {
            q.y("messageId");
            var6 = null;
         }

         if (this.addReactionLabel == null) {
            q.y("addReactionLabel");
         } else {
            var7 = this.addReactionLabel;
         }

         val var17: StringBuilder = new StringBuilder();
         var17.append(var6);
         var17.append("_add_burst_reactions_");
         var17.append(var7);
         var3 = IdUtilsKt.convertToId(var17.toString());
      } else if (var1 == this.getAddReactionIndex()) {
         var6 = this.messageId;
         if (this.messageId == null) {
            q.y("messageId");
            var6 = null;
         }

         var7 = this.addReactionLabel;
         if (this.addReactionLabel == null) {
            q.y("addReactionLabel");
            var7 = null;
         }

         val var18: StringBuilder = new StringBuilder();
         var18.append(var6);
         var18.append("_add_reactions_");
         var18.append(var7);
         var3 = IdUtilsKt.convertToId(var18.toString());
      } else {
         val var19: ReactionView.Reaction = this.reactions.get(var1);
         if (this.messageId == null) {
            q.y("messageId");
         } else {
            var6 = this.messageId;
         }

         var7 = var19.getEmoji().getEmojiId();
         val var5: Boolean = var19.isBurstReaction();
         val var20: StringBuilder = new StringBuilder();
         var20.append(var6);
         var20.append("_");
         var20.append(var7);
         var20.append(var5);
         var3 = IdUtilsKt.convertToId(var20.toString());
      }

      return var3;
   }

   public override fun getItemViewType(position: Int): Int {
      val var2: Byte;
      if (var1 == this.getAddBurstReactionIndex()) {
         var2 = 48;
      } else if (var1 == this.getAddReactionIndex()) {
         var2 = 47;
      } else if (this.reactions.get(var1).isBurstReaction()) {
         var2 = 45;
      } else {
         var2 = 46;
      }

      return var2;
   }

   public override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      q.h(var1, "holder");
      val var8: ThemeManager = ThemeManager.INSTANCE;
      val var7: DiscordTheme = ThemeManager.INSTANCE.getThemeOverride();
      var8.setThemeOverride(this.theme);
      val var3: Boolean = var1 is ReactionViewHolder;
      var var5: OnClickListener = null;
      var var4: Function1 = null;
      if (var3) {
         val var23: ReactionView.Reaction = this.reactions.get(var2);
         val var9: ReactionViewHolder = var1 as ReactionViewHolder;
         var var10: Function1 = this.onReactionClick;
         if (this.onReactionClick == null) {
            q.y("onReactionClick");
            var10 = null;
         }

         if (this.onReactionLongPress == null) {
            q.y("onReactionLongPress");
         } else {
            var4 = this.onReactionLongPress;
         }

         var9.bind(var23, var10, var4, this.reactionsTheme);
      } else if (var1 is AddReactionViewHolder) {
         val var26: AddReactionViewHolder = var1 as AddReactionViewHolder;
         var var11: java.lang.String = this.addReactionLabel;
         if (this.addReactionLabel == null) {
            q.y("addReactionLabel");
            var11 = null;
         }

         var var15: java.lang.String = this.addNewReactionAccessibilityLabel;
         if (this.addNewReactionAccessibilityLabel == null) {
            q.y("addNewReactionAccessibilityLabel");
            var15 = null;
         }

         if (this.onAddReactionClick == null) {
            q.y("onAddReactionClick");
         } else {
            var5 = this.onAddReactionClick;
         }

         var26.bind(var11, var15, var5, this.reactionsTheme);
      } else {
         if (var1 !is AddBurstReactionViewHolder) {
            val var18: Class = var1.getClass();
            val var13: StringBuilder = new StringBuilder();
            var13.append("Invalid view holder type ");
            var13.append(var18);
            throw new IllegalStateException(var13.toString().toString());
         }

         val var27: AddBurstReactionViewHolder = var1 as AddBurstReactionViewHolder;
         var var12: java.lang.String = this.addReactionLabel;
         if (this.addReactionLabel == null) {
            q.y("addReactionLabel");
            var12 = null;
         }

         var var17: java.lang.String = this.addNewBurstReactionAccessibilityLabel;
         if (this.addNewBurstReactionAccessibilityLabel == null) {
            q.y("addNewBurstReactionAccessibilityLabel");
            var17 = null;
         }

         var5 = this.onAddBurstReactionClick;
         if (this.onAddBurstReactionClick == null) {
            q.y("onAddBurstReactionClick");
            var5 = null;
         }

         var27.bind(var12, var17, var5, this.reactionsTheme);
      }

      var8.setThemeOverride(var7);
   }

   public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      q.h(var1, "parent");
      val var5: com.google.android.flexbox.FlexboxLayoutManager.c = new com.google.android.flexbox.FlexboxLayoutManager.c(-2, this.reactionHeight);
      val var4: ThemeManager = ThemeManager.INSTANCE;
      val var3: DiscordTheme = ThemeManager.INSTANCE.getThemeOverride();
      var4.setThemeOverride(this.theme);
      var var9: Any;
      switch (var2) {
         case 46:
            val var12: Context = var1.getContext();
            q.g(var12, "getContext(...)");
            val var13: ReactionView = new ReactionView(var12, null, 2, null);
            var13.setLayoutParams(var5);
            var9 = new ReactionViewHolder(var13);
            break;
         case 47:
            val var10: Context = var1.getContext();
            q.g(var10, "getContext(...)");
            val var11: AddReactionView = new AddReactionView(var10, null, 2, null);
            var11.setLayoutParams(var5);
            var9 = new AddReactionViewHolder(var11);
            break;
         case 48:
            val var7: Context = var1.getContext();
            q.g(var7, "getContext(...)");
            val var8: AddReactionView = new AddReactionView(var7, null, 2, null);
            var8.setLayoutParams(var5);
            var9 = new AddBurstReactionViewHolder(var8);
            break;
         default:
            val var6: StringBuilder = new StringBuilder();
            var6.append("Invalid view type ");
            var6.append(var2);
            throw new IllegalStateException(var6.toString().toString());
      }

      var4.setThemeOverride(var3);
      return (RecyclerView.ViewHolder)var9;
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setReactions(
      messageId: String,
      reactions: List<Reaction>,
      canAddNewReactions: Boolean,
      canAddNewBurstReactions: Boolean = false,
      addReactionLabel: String,
      addNewReactionAccessibilityLabel: String,
      addNewBurstReactionAccessibilityLabel: String,
      reactionsTheme: ReactionsTheme?,
      onAddReactionClick: OnClickListener,
      onAddBurstReactionClick: OnClickListener,
      onReactionClick: (Reaction) -> Unit,
      onReactionLongPress: (Reaction) -> Unit,
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
      this.messageId = var1;
      this.canAddNewReactions = var3;
      this.canAddNewBurstReactions = var4;
      this.addReactionLabel = var5;
      this.addNewReactionAccessibilityLabel = var6;
      this.addNewBurstReactionAccessibilityLabel = var7;
      this.reactionsTheme = var8;
      this.onAddReactionClick = var9;
      this.onAddBurstReactionClick = var10;
      this.onReactionClick = var11;
      this.onReactionLongPress = var12;
      this.theme = var13;
      if (var14) {
         val var15: java.util.List = this.reactions;
         this.reactions = var2;
         val var16: androidx.recyclerview.widget.c.e = androidx.recyclerview.widget.c.b(new ItemDiffer(var15, var2), true);
         q.g(var16, "calculateDiff(...)");
         var16.c(this);
      } else {
         this.reactions = var2;
         this.notifyDataSetChanged();
      }
   }
}
