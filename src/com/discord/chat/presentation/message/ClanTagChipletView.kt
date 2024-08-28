package com.discord.chat.presentation.message

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import com.discord.SetTextSizeSpKt
import com.discord.chat.databinding.ClanTagChipletViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.image.fresco.SetOptionalImageUrlKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.primitives.GuildId
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.view.SimpleDraweeView

public class ClanTagChipletView(context: Context, attrs: AttributeSet) : FrameLayout {
   private final val binding: ClanTagChipletViewBinding

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      kotlin.jvm.internal.q.h(var2, "attrs");
      super(var1, var2);
      val var3: ClanTagChipletViewBinding = ClanTagChipletViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var3, "inflate(...)");
      this.binding = var3;
      var3.container.setBackgroundColor(ThemeManagerKt.getTheme().getBgModStrong());
      val var5: LinearLayout = var3.container;
      kotlin.jvm.internal.q.g(var3.container, "container");
      ViewClippingUtilsKt.clipToRoundedRectangle(var5, SizeUtilsKt.getDpToPx(4));
      val var6: TextView = var3.tag;
      kotlin.jvm.internal.q.g(var3.tag, "tag");
      SetTextSizeSpKt.setTextSizeSp(var6, 12.0F);
      var3.tag.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      val var4: TextView = var3.tag;
      kotlin.jvm.internal.q.g(var3.tag, "tag");
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
   }

   @JvmStatic
   fun `configure_D0ylKIU$lambda$3$lambda$2`(var0: ChatEventHandler, var1: Long, var3: View) {
      var0.onTapClanTagChiplet-g3bFfsM(var1);
   }

   public fun configure(tagContent: String, badgeUrl: String?, guildId: GuildId, eventHandler: ChatEventHandler?, scale: Float = ...) {
      kotlin.jvm.internal.q.h(var1, "tagContent");
      this.binding.container.getLayoutParams().height = SizeUtilsKt.getDpToPx(18.0F * var6);
      val var8: Int = SizeUtilsKt.getDpToPx(4.0F * var6);
      this.binding.container.setPadding(var8, 0, var8, 0);
      if (var2 != null) {
         val var9: SimpleDraweeView = this.binding.badge;
         kotlin.jvm.internal.q.g(this.binding.badge, "badge");
         SetOptionalImageUrlKt.setOptionalImageUrl$default(var9, var2, null, null, 6, null);
         val var12: LayoutParams = this.binding.badge.getLayoutParams();
         var12.width = SizeUtilsKt.getDpToPx(var6 * 12.0F);
         var12.height = SizeUtilsKt.getDpToPx(var6 * 12.0F);
         val var13: SimpleDraweeView = this.binding.badge;
         kotlin.jvm.internal.q.g(this.binding.badge, "badge");
         var13.setVisibility(0);
      } else {
         val var14: SimpleDraweeView = this.binding.badge;
         kotlin.jvm.internal.q.g(this.binding.badge, "badge");
         var14.setVisibility(8);
      }

      this.binding.tag.setText(var1);
      val var10: TextView = this.binding.tag;
      kotlin.jvm.internal.q.g(this.binding.tag, "tag");
      SetTextSizeSpKt.setTextSizeSp(var10, 12.0F * var6);
      if (var5 != null) {
         val var11: LinearLayout = this.binding.container;
         kotlin.jvm.internal.q.e(this.binding.container);
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var11, false, new a(var5, var3), 1, null);
      }
   }

   public companion object {
      private const val BASE_BADGE_SIZE: Float
      private const val BASE_HEIGHT: Float
      private const val BASE_PADDING_HORIZONTAL: Float
   }
}
