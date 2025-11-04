package com.discord.reactions

import android.annotation.SuppressLint
import android.content.Context
import android.view.ViewGroup
import android.view.View.OnClickListener
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.discord.misc.utilities.ids.IdUtilsKt
import com.discord.reactions.ReactionView.Reaction
import com.discord.reactions.ReactionView.ReactionsTheme
import com.discord.recycler_view.utils.ItemDiffer
import com.discord.theme.DiscordTheme
import com.discord.theme.ThemeManager
import com.google.android.flexbox.FlexboxLayoutManager
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nReactionsViewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactionsViewAdapter.kt\ncom/discord/reactions/ReactionsViewAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"])
internal class ReactionsViewAdapter(reactionHeight: Int) : Adapter {
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
      this.reactions = CollectionsKt.l();
      this.setHasStableIds(true);
   }

   private fun getAddReactionIndex(): Int {
      return this.reactions.size();
   }

   public open fun getItemCount(): Int {
      val var2: Int = this.reactions.size();
      var var1: Int = var2;
      if (this.canAddNewReactions) {
         var1 = var2 + 1;
      }

      return var1;
   }

   public open fun getItemId(position: Int): Long {
      val var2: Int = this.getAddReactionIndex();
      var var4: java.lang.String = null;
      var var5: java.lang.String = null;
      if (var1 == var2) {
         var4 = this.messageId;
         if (this.messageId == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageId");
            var4 = null;
         }

         if (this.addReactionLabel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addReactionLabel");
         } else {
            var5 = this.addReactionLabel;
         }

         val var13: StringBuilder = new StringBuilder();
         var13.append(var4);
         var13.append("_add_reactions_");
         var13.append(var5);
         return IdUtilsKt.convertToId(var13.toString());
      } else {
         val var6: ReactionView.Reaction = this.reactions.get(var1);
         if (this.messageId == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageId");
         } else {
            var4 = this.messageId;
         }

         var5 = var6.getEmoji().getEmojiId();
         val var3: Boolean = var6.isBurstReaction();
         val var10: StringBuilder = new StringBuilder();
         var10.append(var4);
         var10.append("_");
         var10.append(var5);
         var10.append(var3);
         return IdUtilsKt.convertToId(var10.toString());
      }
   }

   public open fun getItemViewType(position: Int): Int {
      if (var1 == this.getAddReactionIndex()) {
         return 47;
      } else {
         return if (this.reactions.get(var1).isBurstReaction()) 45 else 46;
      }
   }

   public open fun onBindViewHolder(holder: ViewHolder, position: Int) {
      val var8: ThemeManager = ThemeManager.INSTANCE;
      val var7: DiscordTheme = ThemeManager.INSTANCE.getThemeOverride();
      var8.setThemeOverride(this.theme);
      val var3: Boolean = var1 is ReactionViewHolder;
      var var5: OnClickListener = null;
      var var4: Function1 = null;
      if (var3) {
         val var6: ReactionView.Reaction = this.reactions.get(var2);
         val var9: ReactionViewHolder = var1 as ReactionViewHolder;
         var var10: Function1 = this.onReactionClick;
         if (this.onReactionClick == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onReactionClick");
            var10 = null;
         }

         if (this.onReactionLongPress == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onReactionLongPress");
         } else {
            var4 = this.onReactionLongPress;
         }

         var9.bind(var6, var10, var4, this.reactionsTheme);
      } else {
         if (var1 !is AddReactionViewHolder) {
            val var12: Class = var1.getClass();
            val var15: StringBuilder = new StringBuilder();
            var15.append("Invalid view holder type ");
            var15.append(var12);
            throw new IllegalStateException(var15.toString().toString());
         }

         val var20: AddReactionViewHolder = var1 as AddReactionViewHolder;
         var var11: java.lang.String = this.addReactionLabel;
         if (this.addReactionLabel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addReactionLabel");
            var11 = null;
         }

         var var14: java.lang.String = this.addNewReactionAccessibilityLabel;
         if (this.addNewReactionAccessibilityLabel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addNewReactionAccessibilityLabel");
            var14 = null;
         }

         if (this.onAddReactionClick == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onAddReactionClick");
         } else {
            var5 = this.onAddReactionClick;
         }

         var20.bind(var11, var14, var5, this.reactionsTheme);
      }

      var8.setThemeOverride(var7);
   }

   public open fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val var5: FlexboxLayoutManager.c = new FlexboxLayoutManager.c(-2, this.reactionHeight);
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
         val var7: AddReactionView = new AddReactionView(var6, null, 2, null);
         var7.setLayoutParams(var5);
         var8 = new AddReactionViewHolder(var7);
      } else {
         val var10: Context = var1.getContext();
         val var11: ReactionView = new ReactionView(var10, null, 2, null);
         var11.setLayoutParams(var5);
         var8 = new ReactionViewHolder(var11);
      }

      var3.setThemeOverride(var4);
      return (ViewHolder)var8;
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
         val var13: androidx.recyclerview.widget.e.e = androidx.recyclerview.widget.e.c(new ItemDiffer(var12, var2), true);
         var13.c(this);
      } else {
         this.reactions = var2;
         this.notifyDataSetChanged();
      }
   }
}
