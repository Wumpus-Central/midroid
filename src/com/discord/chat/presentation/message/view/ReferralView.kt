package com.discord.chat.presentation.message.view

import android.animation.LayoutTransition
import android.content.Context
import android.graphics.Paint.FontMetrics
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.text.TextPaint
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.R
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.referral.ReferralEmbed
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText
import com.discord.chat.databinding.ReferralViewBinding
import com.discord.chat.presentation.message.messagepart.ReferralMessageAccessory
import com.discord.chat.presentation.textutils.TextUtilsKt
import com.discord.core.DCDButton
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.drawable.GetDrawableCompatKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.primitives.MessageId
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.facebook.drawee.span.SimpleDraweeSpanTextView
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2

public class ReferralView  public constructor(context: Context, attrs: AttributeSet? = null) : CardView {
   public final val binding: ReferralViewBinding
   private final var lastState: com.discord.chat.presentation.message.view.ReferralView.Companion.State?
   private final val resolvedTransition: LayoutTransition

   fun ReferralView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2);
      val var3: ReferralViewBinding = ReferralViewBinding.inflate(LayoutInflater.from(var1), this, true);
      kotlin.jvm.internal.q.g(var3, "inflate(...)");
      this.binding = var3;
      val var4: LayoutTransition = new LayoutTransition();
      var4.disableTransitionType(0);
      var4.disableTransitionType(1);
      this.resolvedTransition = var4;
      this.setUseCompatPadding(true);
      this.setClickable(true);
      this.setRadius((float)SizeUtilsKt.getDpToPx(4));
      this.setCardElevation((float)SizeUtilsKt.getDpToPx(1));
      this.initTextStyling();
   }

   @JvmStatic
   fun `bind$lambda$13$lambda$11`(var0: Function2, var1: ReferralMessageAccessory, var2: LinkContentNode): Unit {
      kotlin.jvm.internal.q.h(var2, "node");
      var0.invoke(MessageId.box-impl(var1.getMessageId-3Eiw7ao()), var2);
      return Unit.a;
   }

   @JvmStatic
   fun `bind$lambda$19$lambda$17`(var0: Function1, var1: View) {
      var0.invoke(null);
   }

   private fun didResolve(accessoryId: Long): Boolean {
      val var6: ReferralView.Companion.State.Resolving;
      if (this.lastState is ReferralView.Companion.State.Resolving) {
         var6 = this.lastState as ReferralView.Companion.State.Resolving;
      } else {
         var6 = null;
      }

      var var3: Boolean = false;
      if (var6 != null) {
         var3 = false;
         if (var6.getAccessoryId() == var1) {
            var3 = true;
         }
      }

      return var3;
   }

   private fun initTextStyling() {
      val var1: TextView = this.binding.imageCopy;
      kotlin.jvm.internal.q.e(this.binding.imageCopy);
      SetTextSizeSpKt.setTextSizeSp(var1, 14.0F);
      val var2: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var1, DiscordFont.PrimarySemibold);
      var var3: TextView = this.binding.title;
      kotlin.jvm.internal.q.e(this.binding.title);
      SetTextSizeSpKt.setTextSizeSp(var3, 16.0F);
      val var4: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimaryMedium);
      val var6: SimpleDraweeSpanTextView = this.binding.subtitle;
      kotlin.jvm.internal.q.e(this.binding.subtitle);
      SetTextSizeSpKt.setTextSizeSp(var6, 12.0F);
      var3 = this.binding.trialInfo;
      kotlin.jvm.internal.q.e(this.binding.trialInfo);
      SetTextSizeSpKt.setTextSizeSp(var3, 12.0F);
      val var8: DCDButton = this.binding.acceptButton;
      this.binding.acceptButton.setTextSizeSp(14.0F);
      var8.setDiscordFont(var2);
      val var5: TextView = this.binding.footer;
      kotlin.jvm.internal.q.e(this.binding.footer);
      SetTextSizeSpKt.setTextSizeSp(var5, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var5, var4);
   }

   public fun bind(accessory: ReferralMessageAccessory, onTapAccept: (String?) -> Unit, onTapLink: (MessageId, LinkContentNode) -> Unit) {
      kotlin.jvm.internal.q.h(var1, "accessory");
      kotlin.jvm.internal.q.h(var2, "onTapAccept");
      kotlin.jvm.internal.q.h(var3, "onTapLink");
      this.setCardBackgroundColor(var1.getReferral().getBackgroundColor());
      val var8: ConstraintLayout = this.binding.content;
      kotlin.jvm.internal.q.g(this.binding.content, "content");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var8, false, null, 1, null);
      val var9: ReferralEmbed = var1.getReferral();
      if (var9 is ReferralEmbed.Resolving) {
         this.lastState = new ReferralView.Companion.State.Resolving(var1.getItemId());
      } else {
         if (var9 !is ReferralEmbed.Resolved) {
            throw new t9.n();
         }

         var var7: Boolean = this.didResolve(var1.getItemId());
         var var33: LayoutTransition = this.resolvedTransition;
         if (!var7) {
            var33 = null;
         }

         this.binding.content.setLayoutTransition(var33);
         val var42: SimpleDraweeView = this.binding.nitroLogoBanner;
         kotlin.jvm.internal.q.g(this.binding.nitroLogoBanner, "nitroLogoBanner");
         val var34: ReferralEmbed.Resolved = var9 as ReferralEmbed.Resolved;
         ReactAssetUtilsKt.setOptionalReactImageUrl(var42, (var9 as ReferralEmbed.Resolved).getHeaderLogoUrl());
         val var43: TextView = this.binding.imageCopy;
         this.binding.imageCopy.setText(var34.getHeaderText());
         var43.setTextColor(var34.getHeaderColor());
         kotlin.jvm.internal.q.e(var43);
         val var35: java.lang.CharSequence = var43.getText();
         kotlin.jvm.internal.q.g(var35, "getText(...)");
         var var5: Byte;
         if (!kotlin.text.h.c0(var35)) {
            var5 = 0;
         } else {
            var5 = 8;
         }

         var43.setVisibility(var5);
         val var36: SimpleDraweeView = this.binding.nitroTicket;
         kotlin.jvm.internal.q.g(this.binding.nitroTicket, "nitroTicket");
         ReactAssetUtilsKt.setOptionalReactImageUrl(var36, var34.getThumbnailUrl());
         val var37: TextView = this.binding.title;
         this.binding.title.setText(var34.getTitleText());
         val var44: Int = var34.getTitleColor();
         if (var44 != null) {
            var37.setTextColor(var44.intValue());
         }

         kotlin.jvm.internal.q.e(var37);
         val var45: java.lang.CharSequence = var37.getText();
         kotlin.jvm.internal.q.g(var45, "getText(...)");
         if (!kotlin.text.h.c0(var45)) {
            var5 = 0;
         } else {
            var5 = 8;
         }

         var37.setVisibility(var5);
         val var38: SimpleDraweeSpanTextView = this.binding.subtitle;
         val var46: java.lang.String = var34.getBodyText();
         if (var46 != null && !kotlin.text.h.c0(var46)) {
            var38.setText(var34.getBodyText());
         } else if (var34.getStructuredBodyText() != null) {
            val var47: AnnotatedStructurableText = var34.getStructuredBodyText();
            val var12: Context = var38.getContext();
            kotlin.jvm.internal.q.g(var12, "getContext(...)");
            val var11: java.lang.String = var1.getMessageId-3Eiw7ao();
            val var13: FontMetrics = var38.getPaint().getFontMetrics();
            kotlin.jvm.internal.q.g(var13, "getFontMetrics(...)");
            val var4: Float = TextUtilsKt.getBaselineHeightPx(var13);
            val var48: TextPaint = var38.getPaint();
            kotlin.jvm.internal.q.g(var48, "getPaint(...)");
            var38.setDraweeSpanStringBuilder(
               TextUtilsKt.toSpannable$default(
                  var47,
                  var12,
                  var11,
                  false,
                  true,
                  false,
                  false,
                  var48,
                  new J0(var3, var1),
                  null,
                  null,
                  null,
                  null,
                  null,
                  null,
                  null,
                  null,
                  null,
                  null,
                  null,
                  null,
                  null,
                  null,
                  false,
                  null,
                  var4,
                  null,
                  50331392,
                  null
               )
            );
            kotlin.jvm.internal.q.e(var38);
            NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener(var38, true);
         }

         val var22: Int = var34.getBodyTextColor();
         if (var22 != null) {
            var38.setTextColor(var22.intValue());
         }

         label104: {
            kotlin.jvm.internal.q.e(var38);
            val var23: java.lang.String = var34.getBodyText();
            if (var23 != null) {
               var29 = true;
               if (!kotlin.text.h.c0(var23)) {
                  break label104;
               }
            }

            if (var34.getStructuredBodyText() != null) {
               var29 = true;
            } else {
               var29 = false;
            }
         }

         if (var29) {
            var5 = 0;
         } else {
            var5 = 8;
         }

         var38.setVisibility(var5);
         val var24: TextView = this.binding.trialInfo;
         this.binding.trialInfo.setText(var34.getSubText());
         kotlin.jvm.internal.q.e(var24);
         SetTextSizeSpKt.setTextSizeSp(var24, 12.0F);
         val var39: Int = var34.getSubTextColor();
         if (var39 != null) {
            var24.setTextColor(var39.intValue());
         }

         val var40: java.lang.CharSequence = var24.getText();
         kotlin.jvm.internal.q.g(var40, "getText(...)");
         if (!kotlin.text.h.c0(var40)) {
            var5 = 0;
         } else {
            var5 = 8;
         }

         var24.setVisibility(var5);
         val var25: java.lang.String = var34.getAcceptLabelText();
         if (var25 != null && !kotlin.text.h.c0(var25)) {
            val var26: DCDButton = this.binding.acceptButton;
            val var41: java.lang.String = var34.getAcceptLabelIconUrl();
            if (var41 != null) {
               var26.setIcon(var41, SizeUtilsKt.getDpToPx(20));
            }

            var26.setText(var34.getAcceptLabelText());
            var26.setTextColor(var34.getAcceptLabelColor());
            var26.setOnClickButtonListener(new K0(var2));
            val var15: Context = var26.getContext();
            kotlin.jvm.internal.q.g(var15, "getContext(...)");
            val var16: Drawable = GetDrawableCompatKt.getDrawableCompat(var15, R.drawable.premium_tier2_gradient);
            val var17: GradientDrawable;
            if (var16 is GradientDrawable) {
               var17 = var16 as GradientDrawable;
            } else {
               var17 = null;
            }

            if (var17 != null) {
               var17.mutate();
               var17.setCornerRadius((float)SizeUtilsKt.getDpToPx(20));
               var26.setDrawableBackground(var17);
            }

            val var18: java.lang.Boolean = var34.getCanBeAccepted();
            if (var18 != null) {
               var7 = var18;
            } else {
               var7 = false;
            }

            var26.setEnabled(var7);
            val var27: Float;
            if (var7) {
               var27 = 1.0F;
            } else {
               var27 = 0.5F;
            }

            var26.setAlpha(var27);
            kotlin.jvm.internal.q.e(var26);
            var26.setVisibility(0);
            kotlin.jvm.internal.q.e(var26);
         } else {
            val var14: DCDButton = this.binding.acceptButton;
            kotlin.jvm.internal.q.g(this.binding.acceptButton, "acceptButton");
            var14.setVisibility(8);
         }

         val var19: java.lang.String = var34.getFooterText();
         if (var19 != null && !kotlin.text.h.c0(var19)) {
            val var21: TextView = this.binding.footer;
            this.binding.footer.setText(var34.getFooterText());
            if (var34.getFooterTextColor() != null) {
               var21.setTextColor(var34.getFooterTextColor());
            }

            kotlin.jvm.internal.q.e(var21);
            var21.setVisibility(0);
            kotlin.jvm.internal.q.e(var21);
         } else {
            val var20: TextView = this.binding.footer;
            kotlin.jvm.internal.q.g(this.binding.footer, "footer");
            var20.setVisibility(8);
         }

         this.lastState = new ReferralView.Companion.State.Resolved(var1.getItemId());
      }
   }

   public companion object {
      private sealed interface State {
         public val accessoryId: Long

         public data class Resolved(accessoryId: Long) : ReferralView.Companion.State {
            public open val accessoryId: Long

            init {
               this.accessoryId = var1;
            }

            public operator fun component1(): Long {
               return this.accessoryId;
            }

            public fun copy(accessoryId: Long = var0.accessoryId): com.discord.chat.presentation.message.view.ReferralView.Companion.State.Resolved {
               return new ReferralView.Companion.State.Resolved(var1);
            }

            public override operator fun equals(other: Any?): Boolean {
               if (this === var1) {
                  return true;
               } else if (var1 !is ReferralView.Companion.State.Resolved) {
                  return false;
               } else {
                  return this.accessoryId == (var1 as ReferralView.Companion.State.Resolved).accessoryId;
               }
            }

            public override fun hashCode(): Int {
               return java.lang.Long.hashCode(this.accessoryId);
            }

            public override fun toString(): String {
               val var1: Long = this.accessoryId;
               val var3: StringBuilder = new StringBuilder();
               var3.append("Resolved(accessoryId=");
               var3.append(var1);
               var3.append(")");
               return var3.toString();
            }
         }

         public data class Resolving(accessoryId: Long) : ReferralView.Companion.State {
            public open val accessoryId: Long

            init {
               this.accessoryId = var1;
            }

            public operator fun component1(): Long {
               return this.accessoryId;
            }

            public fun copy(accessoryId: Long = var0.accessoryId): com.discord.chat.presentation.message.view.ReferralView.Companion.State.Resolving {
               return new ReferralView.Companion.State.Resolving(var1);
            }

            public override operator fun equals(other: Any?): Boolean {
               if (this === var1) {
                  return true;
               } else if (var1 !is ReferralView.Companion.State.Resolving) {
                  return false;
               } else {
                  return this.accessoryId == (var1 as ReferralView.Companion.State.Resolving).accessoryId;
               }
            }

            public override fun hashCode(): Int {
               return java.lang.Long.hashCode(this.accessoryId);
            }

            public override fun toString(): String {
               val var1: Long = this.accessoryId;
               val var3: StringBuilder = new StringBuilder();
               var3.append("Resolving(accessoryId=");
               var3.append(var1);
               var3.append(")");
               return var3.toString();
            }
         }
      }
   }
}
