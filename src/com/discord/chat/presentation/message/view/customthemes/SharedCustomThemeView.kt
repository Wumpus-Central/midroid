package com.discord.chat.presentation.message.view.customthemes

import android.content.Context
import android.graphics.PorterDuffColorFilter
import android.graphics.PorterDuff.Mode
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.g0
import com.discord.chat.bridge.customthemes.SharedCustomThemeData
import com.discord.chat.databinding.SharedCustomThemeViewBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.primitives.MessageId
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder
import com.facebook.drawee.view.SimpleDraweeView
import com.google.android.flexbox.FlexboxLayout
import com.google.android.flexbox.FlexboxLayout.LayoutParams
import java.util.ArrayList
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nSharedCustomThemeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedCustomThemeView.kt\ncom/discord/chat/presentation/message/view/customthemes/SharedCustomThemeView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n176#2,2:158\n1557#3:160\n1628#3,3:161\n1557#3:164\n1628#3,3:165\n*S KotlinDebug\n*F\n+ 1 SharedCustomThemeView.kt\ncom/discord/chat/presentation/message/view/customthemes/SharedCustomThemeView\n*L\n49#1:158,2\n73#1:160\n73#1:161,3\n115#1:164\n115#1:165,3\n*E\n"])
public class SharedCustomThemeView  public constructor(context: Context, attrs: AttributeSet? = null) : LinearLayout(var1, var2) {
   public final val binding: SharedCustomThemeViewBinding
   public final val nitroWheelIcon: SimpleDraweeView
   private final var onViewed: ((MessageId) -> Unit)?
   private final var messageId: MessageId?
   private final var hasViewed: Boolean

   fun SharedCustomThemeView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      val var5: SharedCustomThemeViewBinding = SharedCustomThemeViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var5;
      this.nitroWheelIcon = new SimpleDraweeView(var1);
      val var4: View = var5.getRoot();
      val var6: GradientDrawable = new GradientDrawable();
      var6.setShape(0);
      var6.setCornerRadius((float)SizeUtilsKt.getDpToPx(8));
      var6.setColor(ThemeManagerKt.getTheme().getBgModStrong());
      var6.setStroke(SizeUtilsKt.getDpToPx(2), ThemeManagerKt.getTheme().getBorderSubtle());
      var4.setBackground(var6);
      val var3: Int = SizeUtilsKt.getDpToPx(12);
      var4.setPadding(var3, var3, var3, var3);
   }

   @JvmStatic
   fun `bind_pPZZVto$lambda$2`(var0: Function1, var1: java.lang.String, var2: View) {
      var0.invoke(MessageId.box-impl(var1));
   }

   public fun bind(
      messageId: MessageId,
      sharedCustomThemeData: SharedCustomThemeData,
      author: String?,
      onTapPreview: (MessageId) -> Unit,
      onViewed: (MessageId) -> Unit
   ) {
      this.hasViewed = false;
      this.messageId = var1;
      this.onViewed = var5;
      this.binding.previewBtn.setText(var2.getPreviewLabel());
      this.binding.previewBtn.setCornerRadius(this.binding.previewBtn.getHeight() / 2);
      this.binding.previewBtn.setOnClickButtonListener(new a(var4, var1));
      val var8: ThemePreviewView = this.binding.themePreview;
      val var16: java.util.List = var2.getColors();
      val var12: ArrayList = new ArrayList(CollectionsKt.v(var16, 10));

      for (java.lang.String var17 : var16) {
         val var7: StringBuilder = new StringBuilder();
         var7.append("#");
         var7.append(var17);
         var12.add(var7.toString());
      }

      var8.setHexColors(var12);
      this.binding.themePreview.setGradientAngle(var2.getGradientAngle());
      this.binding.previewHeading.setText(var2.getPreviewHeading());
      this.binding.previewHeading.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      this.binding.previewHeading.setTextSize(16.0F);
      val var9: TextView = this.binding.previewHeading;
      DiscordFontUtilsKt.setDiscordFont(var9, DiscordFont.PrimarySemibold);
      this.binding.previewHeading.setPadding(0, 0, 0, SizeUtilsKt.getDpToPx(6.0F));
      val var10: FlexboxLayout = this.binding.heading;
      if (!k.n(g0.a(var10), this.nitroWheelIcon)) {
         val var11: SimpleDraweeView = this.nitroWheelIcon;
         val var13: LayoutParams = new LayoutParams(SizeUtilsKt.getDpToPx(18.0F), SizeUtilsKt.getDpToPx(13.0F));
         var13.setMarginStart(SizeUtilsKt.getDpToPx(4.0F));
         var11.setLayoutParams(var13);
         val var14: GenericDraweeHierarchy = new GenericDraweeHierarchyBuilder(var11.getResources())
            .v(new PorterDuffColorFilter(ThemeManagerKt.getTheme().getTextNormal(), Mode.SRC_IN))
            .a();
         var11.setHierarchy(var14);
         var11.setImageURI(var2.getNitroWheelIconUrl());
         this.binding.heading.addView(this.nitroWheelIcon);
      }

      this.formatUsername(var2, var3);
   }

   public fun formatUsername(sharedCustomThemeData: SharedCustomThemeData, author: String?) {
      this.binding.createdByContainer.removeAllViews();
      val var4: java.util.List = StringsKt.split$default(var1.getCreatedByLabel(), new java.lang.String[]{"__USERNAME__"}, false, 0, 6, null);
      val var3: ArrayList = new ArrayList(CollectionsKt.v(var4, 10));

      for (java.lang.String var8 : var4) {
         val var6: TextView = new TextView(this.getContext());
         var6.setText(var8);
         var6.setTextColor(ThemeManagerKt.getTheme().getTextSecondary());
         var6.setTextSize(14.0F);
         var3.add(var6);
      }

      this.binding.createdByContainer.addView(var3.get(0) as View);
      val var9: SimpleDraweeView = new SimpleDraweeView(this.getContext());
      var9.setLayoutParams(new android.view.ViewGroup.LayoutParams(SizeUtilsKt.getDpToPx(20.0F), SizeUtilsKt.getDpToPx(20.0F)));
      val var10: com.facebook.drawee.generic.a = com.facebook.drawee.generic.a.a();
      val var11: GenericDraweeHierarchy = new GenericDraweeHierarchyBuilder(var9.getResources()).K(var10).a();
      var9.setHierarchy(var11);
      var9.setImageURI(var1.getCreatedByAvatarUrl());
      val var7: TextView = new TextView(this.getContext());
      var7.setTextColor(ThemeManagerKt.getTheme().getTextPrimary());
      var7.setTextSize(14.0F);
      var7.setText(var2);
      this.binding.createdByContainer.addView(var9);
      this.binding.createdByContainer.addView(var7);
      this.binding.createdByContainer.addView(var3.get(1) as View);
   }

   protected open fun onAttachedToWindow() {
      super.onAttachedToWindow();
      if (!this.hasViewed) {
         if (this.messageId != null) {
            if (this.onViewed != null) {
               this.onViewed.invoke(MessageId.box-impl(this.messageId));
            }

            this.hasViewed = true;
         }
      }
   }
}
