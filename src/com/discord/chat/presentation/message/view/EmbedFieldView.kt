package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.databinding.EmbedFieldViewBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.image.fresco.SimpleDraweeSpanTextViewUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.span.utilities.BackgroundSpanDrawer
import com.discord.span.utilities.SpannableExtensionsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.span.DraweeSpanStringBuilder
import com.facebook.drawee.span.SimpleDraweeSpanTextView
import kotlin.jvm.functions.Function1

public class EmbedFieldView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : LinearLayout {
   public final val binding: EmbedFieldViewBinding

   fun EmbedFieldView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun EmbedFieldView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2, var3);
      val var6: EmbedFieldViewBinding = EmbedFieldViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var6, "inflate(LayoutInflater.from(context), this)");
      this.binding = var6;
      this.setOrientation(1);
      val var4: SimpleDraweeSpanTextView = var6.name;
      var6.name.setTextColor(ColorUtilsKt.getThemeColor(var1, color.primary_500, color.primary_100));
      kotlin.jvm.internal.r.g(var4, "_init_$lambda$0");
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
      val var5: SimpleDraweeSpanTextView = var6.value;
      kotlin.jvm.internal.r.g(var6.value, "_init_$lambda$1");
      SetTextSizeSpKt.setTextSizeSp(var5, 14.0F);
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryMedium);
      var5.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
   }

   @JvmStatic
   fun `setName$lambda$4$lambda$3$lambda$2`(var0: Function1, var1: java.lang.String, var2: View): Boolean {
      kotlin.jvm.internal.r.h(var0, "$onTapCopyText");
      kotlin.jvm.internal.r.h(var1, "$rawName");
      var0.invoke(var1);
      return true;
   }

   @JvmStatic
   fun `setValue$lambda$8$lambda$7$lambda$6`(var0: Function1, var1: java.lang.String, var2: View): Boolean {
      kotlin.jvm.internal.r.h(var0, "$onTapCopyText");
      kotlin.jvm.internal.r.h(var1, "$rawValue");
      var0.invoke(var1);
      return true;
   }

   public fun setName(rawName: String, name: DraweeSpanStringBuilder?, onTapCopyText: (CharSequence) -> Unit) {
      kotlin.jvm.internal.r.h(var1, "rawName");
      kotlin.jvm.internal.r.h(var3, "onTapCopyText");
      val var4: SimpleDraweeSpanTextView = this.binding.name;
      kotlin.jvm.internal.r.g(this.binding.name, "setName$lambda$4");
      SimpleDraweeSpanTextViewUtilsKt.setOptionalText(var4, var2);
      val var5: l;
      if (var2 != null) {
         var5 = new l(var3, var1);
      } else {
         var5 = null;
      }

      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var4, false, var5, 1, null);
   }

   public fun setValue(rawValue: String, value: DraweeSpanStringBuilder?, onTapCopyText: (CharSequence) -> Unit) {
      kotlin.jvm.internal.r.h(var1, "rawValue");
      kotlin.jvm.internal.r.h(var3, "onTapCopyText");
      val var5: SimpleDraweeSpanTextView = this.binding.value;
      kotlin.jvm.internal.r.g(this.binding.value, "setValue$lambda$8");
      val var4: DraweeSpanStringBuilder;
      if (var2 != null) {
         SpannableExtensionsKt.coverWithSpan(var2, new BackgroundSpanDrawer(var5));
         var4 = var2;
      } else {
         var4 = null;
      }

      SimpleDraweeSpanTextViewUtilsKt.setOptionalText(var5, var4);
      val var6: m;
      if (var2 != null) {
         var6 = new m(var3, var1);
      } else {
         var6 = null;
      }

      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var5, false, var6, 1, null);
   }
}
