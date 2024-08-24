package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.databinding.ActivityInstanceEmbedViewBinding
import com.discord.core.DCDButton
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.overlapping_circles.OverlappingCirclesView
import com.discord.overlapping_circles.OverlappingItem
import com.discord.theme.ThemeManagerKt
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt
import java.util.ArrayList

public class ActivityInstanceEmbedView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final val binding: ActivityInstanceEmbedViewBinding

   fun ActivityInstanceEmbedView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun ActivityInstanceEmbedView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2, var3);
      val var4: ActivityInstanceEmbedViewBinding = ActivityInstanceEmbedViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var4, "inflate(LayoutInflater.from(context), this)");
      this.binding = var4;
      var3 = SizeUtilsKt.getDpToPx(16);
      this.setPadding(var3, var3, var3, var3);
      val var5: TextView = var4.statusText;
      var4.statusText.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      kotlin.jvm.internal.r.g(var5, "lambda$1$lambda$0");
      SetTextSizeSpKt.setTextSizeSp(var5, 16.0F);
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryMedium);
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(
         this,
         ColorUtilsKt.getColorCompat(var1, ThemeManagerKt.getTheme().getColorRes(color.primary_130, color.primary_630)),
         SizeUtilsKt.getDpToPx(8),
         null,
         0,
         12,
         null
      );
   }

   public fun setLaunchButton(text: String?, backgroundColor: Int?, enabled: Boolean = true, submitting: Boolean = false) {
      val var8: DCDButton = this.binding.launchButton;
      kotlin.jvm.internal.r.g(this.binding.launchButton, "setLaunchButton$lambda$3");
      var var6: Boolean;
      if (var1 != null && var1.length() != 0) {
         var6 = 0;
      } else {
         var6 = 1;
      }

      if (var6 xor true) {
         var6 = 0;
      } else {
         var6 = 8;
      }

      var8.setVisibility(var6);
      var8.setText(var1);
      var8.setBackgroundColor(var2);
      var8.setClickable(var3);
      val var5: Float;
      if (var3) {
         var5 = 1.0F;
      } else {
         var5 = 0.5F;
      }

      var8.setAlpha(var5);
      var8.setLoading(var4, true);
   }

   public fun setOnLaunchButtonClickListener(onLaunchButtonClickListener: OnClickListener) {
      kotlin.jvm.internal.r.h(var1, "onLaunchButtonClickListener");
      this.binding.launchButton.setOnClickButtonListener(var1);
   }

   public fun setParticipantAvatarUris(avatarUris: List<String>) {
      kotlin.jvm.internal.r.h(var1, "avatarUris");
      val var3: Boolean = var1.isEmpty();
      var var4: OverlappingCirclesView = this.binding.participants;
      kotlin.jvm.internal.r.g(this.binding.participants, "binding.participants");
      val var2: Byte;
      if (var3 xor true) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var4.setVisibility(var2);
      var4 = this.binding.participants;
      val var5: ArrayList = new ArrayList(kotlin.collections.h.t(var1, 10));
      val var6: java.util.Iterator = var1.iterator();

      while (var6.hasNext()) {
         var5.add(new OverlappingItem(var6.next() as java.lang.String));
      }

      var4.setItems(var5);
   }

   public fun setStatusText(text: String?) {
      this.binding.statusText.setText(var1);
   }
}
