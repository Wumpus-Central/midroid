package com.discord.chat.presentation.blockedmessage

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.discord.chat.R
import com.discord.chat.databinding.BlockedMessageGroupViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.BaseChatListAdapter
import com.discord.chat.presentation.list.ChatListConstraintLayout
import com.discord.chat.presentation.list.item.BlockedGroupChatListItem
import com.discord.chat.presentation.message.decorations.BackgroundHighlightDecoration
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.primitives.MessageId
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.internal.q

public class BlockedMessageGroupView  public constructor(context: Context, attrs: AttributeSet? = null) : ChatListConstraintLayout {
   public final val binding: BlockedMessageGroupViewBinding
   private final lateinit var listAdapter: BaseChatListAdapter

   fun BlockedMessageGroupView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2);
      val var4: BlockedMessageGroupViewBinding = BlockedMessageGroupViewBinding.inflate(LayoutInflater.from(var1), this);
      q.g(var4, "inflate(...)");
      this.binding = var4;
      val var3: Int = var1.getResources().getDimensionPixelSize(R.dimen.message_horizontal_spacing);
      this.setPaddingRelative(var3, this.getPaddingTop(), var3, this.getPaddingBottom());
      val var6: TextView = var4.blockedMessageGroupButton;
      q.g(var4.blockedMessageGroupButton, "blockedMessageGroupButton");
      DiscordFontUtilsKt.setDiscordFont(var6, DiscordFont.PrimarySemibold);
      val var7: RecyclerView = var4.blockedMessages;
      var4.blockedMessages.setItemAnimator(null);
      var7.addItemDecoration(new BackgroundHighlightDecoration(var1));
      var7.addItemDecoration(new VerticalSpacingItemDecoration(SizeUtilsKt.getDpToPx(16), 0, SizeUtilsKt.getDpToPx(16), true, 2, null));
      val var5: LinearLayoutManager = new LinearLayoutManager(var1);
      var5.setReverseLayout(true);
      var7.setLayoutManager(var5);
   }

   @JvmStatic
   fun `bind$lambda$2`(var0: ChatEventHandler, var1: BlockedGroupChatListItem, var2: View) {
      q.h(var0, "$eventHandler");
      q.h(var1, "$item");
      var0.onTapToggleBlockedMessages-1xi1bu0(MessageId.constructor-impl(var1.getId()));
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun bind(item: BlockedGroupChatListItem, eventHandler: ChatEventHandler) {
      q.h(var1, "item");
      q.h(var2, "eventHandler");
      this.setOnClickListener(new l4.a(var2, var1));
      val var3: Int;
      if (var1.isRevealed()) {
         var3 = var1.getBackgroundColor();
      } else {
         var3 = 0;
      }

      ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, var3, SizeUtilsKt.getDpToPx(8), null, 0, 12, null);
      val var9: SimpleDraweeView = this.binding.closeIcon;
      q.g(this.binding.closeIcon, "closeIcon");
      ReactAssetUtilsKt.setReactAsset(var9, ReactAsset.Close);
      val var10: SimpleDraweeView = this.binding.closeIcon;
      q.g(this.binding.closeIcon, "closeIcon");
      ColorUtilsKt.setTintColor(var10, ThemeManagerKt.getTheme().getTextMuted());
      this.binding.blockedMessageGroupButton.setText(var1.getText());
      this.binding.blockedMessageGroupButton.setTextColor(var1.getTextColor());
      val var11: RecyclerView = this.binding.blockedMessages;
      q.g(this.binding.blockedMessages, "blockedMessages");
      val var13: Byte;
      if (var1.isRevealed()) {
         var13 = 0;
      } else {
         var13 = 8;
      }

      var11.setVisibility(var13);
      var var12: BaseChatListAdapter = this.listAdapter;
      if (this.listAdapter == null) {
         q.y("listAdapter");
         var12 = null;
      }

      var12.setItems(var1.getContent());
      var var8: BaseChatListAdapter = this.listAdapter;
      if (this.listAdapter == null) {
         q.y("listAdapter");
         var8 = null;
      }

      var8.notifyDataSetChanged();
   }

   public fun setupUI(eventHandler: () -> ChatEventHandler, componentProvider: () -> ComponentProvider) {
      q.h(var1, "eventHandler");
      q.h(var2, "componentProvider");
      val var3: BaseChatListAdapter = new BaseChatListAdapter(var1, var2);
      this.listAdapter = var3;
      this.binding.blockedMessages.setAdapter(var3);
   }
}
