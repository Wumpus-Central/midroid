package com.discord.chat.presentation.message.view

import android.animation.LayoutTransition
import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.GradientDrawable.Orientation
import android.text.TextUtils.TruncateAt
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.Group
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.gift.GiftEmbed
import com.discord.chat.bridge.gift.GiftEmbed.Resolved.Valid
import com.discord.chat.databinding.GiftViewBinding
import com.discord.chat.presentation.message.messagepart.GiftMessageAccessory
import com.discord.core.DCDButton
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.image.fresco.postprocessors.PostProcessor
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.imagepipeline.request.ImageRequest
import com.facebook.imagepipeline.request.ImageRequestBuilder
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nGiftView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftView.kt\ncom/discord/chat/presentation/message/view/GiftView\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,229:1\n13430#2,2:230\n257#3,2:232\n257#3,2:235\n257#3,2:237\n257#3,2:239\n257#3,2:241\n257#3,2:243\n257#3,2:245\n1#4:234\n*S KotlinDebug\n*F\n+ 1 GiftView.kt\ncom/discord/chat/presentation/message/view/GiftView\n*L\n105#1:230,2\n110#1:232,2\n122#1:235,2\n139#1:237,2\n145#1:239,2\n151#1:241,2\n152#1:243,2\n165#1:245,2\n*E\n"])
public class GiftView  public constructor(context: Context, attrs: AttributeSet? = null) : CardView(var1, var2) {
   public final val binding: GiftViewBinding
   private final var lastState: com.discord.chat.presentation.message.view.GiftView.Companion.State?
   private final val resolvedTransition: LayoutTransition

   fun GiftView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      val var3: GiftViewBinding = GiftViewBinding.inflate(LayoutInflater.from(var1), this, true);
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
   fun `bind$lambda$14`(var0: Function1, var1: GiftEmbed, var2: View) {
      var0.invoke((var1 as GiftEmbed.Resolved.Valid).getGiftCode());
   }

   @JvmStatic
   fun `bind$lambda$17$lambda$16`(var0: Function1, var1: GiftEmbed, var2: View) {
      var0.invoke((var1 as GiftEmbed.Resolved.Valid).getGiftCode());
   }

   private fun bindSplash(gift: Valid, didResolve: Boolean) {
      var var3: Short;
      if (var2) {
         var3 = 300;
      } else {
         var3 = 0;
      }

      (this.binding.splash.getHierarchy() as GenericDraweeHierarchy).x(var3);
      var3 = y.c.k(var1.getBackgroundColor(), O9.a.c(var1.getSplashOpacity() * (float)255));
      val var4: SimpleDraweeView = this.binding.splash;
      val var6: ImageRequest = ImageRequest.fromUri(var1.getSplashUrl());
      val var9: com.facebook.drawee.controller.a;
      if (var6 != null) {
         val var12: PipelineDraweeControllerBuilder = H2.d.g()
            .F(
               ImageRequestBuilder.b(var6)
                  .J(
                     new PostProcessor.Composite(
                           PostProcessor.Grayscale.INSTANCE,
                           new PostProcessor.Gradient(PostProcessor.Gradient.Direction.TopToBottom, var3, var1.getBackgroundColor(), 0.0F, 0.5F, 8, null)
                        )
                        .create()
                  )
                  .a()
            ) as PipelineDraweeControllerBuilder;
         val var14: java.lang.String = var1.getGiftCode();
         val var8: java.lang.String = var1.getSplashUrl();
         val var15: StringBuilder = new StringBuilder();
         var15.append("splash-");
         var15.append(var14);
         var15.append("-");
         var15.append(var8);
         var9 = ((var12.C(var15.toString()) as PipelineDraweeControllerBuilder).H(this.binding.splash.getController()) as PipelineDraweeControllerBuilder).d();
      } else {
         var9 = null;
      }

      var4.setController(var9);
   }

   private fun didResolve(accessoryId: Long): Boolean {
      val var6: GiftView.Companion.State.Resolving;
      if (this.lastState is GiftView.Companion.State.Resolving) {
         var6 = this.lastState as GiftView.Companion.State.Resolving;
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
      val var1: TextView = this.binding.header;
      SetTextSizeSpKt.setTextSizeSp(var1, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var1, DiscordFont.PrimaryBold);
      val var2: TextView = this.binding.title;
      SetTextSizeSpKt.setTextSizeSp(var2, 16.0F);
      val var4: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var2, DiscordFont.PrimarySemibold);
      var2.setEllipsize(TruncateAt.MARQUEE);
      var2.setMarqueeRepeatLimit(-1);
      var var3: TextView = this.binding.subtitle;
      SetTextSizeSpKt.setTextSizeSp(var3, 12.0F);
      val var5: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimaryMedium);
      var3 = this.binding.body;
      SetTextSizeSpKt.setTextSizeSp(var3, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var3, var5);
      val var6: DCDButton = this.binding.acceptButton;
      this.binding.acceptButton.setTextSizeSp(14.0F);
      var6.setDiscordFont(var4);
   }

   public fun bind(accessory: GiftMessageAccessory, onTapEmbed: (String) -> Unit, onTapAccept: (String) -> Unit) {
      this.setCardBackgroundColor(var1.getGift().getBackgroundColor());
      var var8: ConstraintLayout = this.binding.content;
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var8, false, null, 1, null);
      val var9: GiftEmbed = var1.getGift();
      if (var9 is GiftEmbed.Resolving) {
         val var12: Orientation;
         if (ViewUtilsKt.isLtr(this)) {
            var12 = Orientation.LEFT_RIGHT;
         } else {
            var12 = Orientation.RIGHT_LEFT;
         }

         val var13: GradientDrawable = new GradientDrawable(
            var12, new int[]{(var9 as GiftEmbed.Resolving).getResolvingGradientStart(), (var9 as GiftEmbed.Resolving).getResolvingGradientEnd()}
         );
         var13.setCornerRadius((float)SizeUtilsKt.getDpToPx(4));
         val var19: IntArray = this.binding.gradients.getReferencedIds();
         val var23: Int = var19.length;

         for (int var4 = 0; var4 < var23; var4++) {
            this.binding.getRoot().findViewById(var19[var4]).setBackground(var13);
         }

         val var14: Group = this.binding.gradients;
         var14.setVisibility(0);
         var14.setAlpha(0.5F);
         this.lastState = new GiftView.Companion.State.Resolving(var1.getItemId());
      } else {
         if (var9 !is GiftEmbed.Resolved) {
            throw new B9.n();
         }

         val var7: Boolean = this.didResolve(var1.getItemId());
         var var24: LayoutTransition = this.resolvedTransition;
         if (!var7) {
            var24 = null;
         }

         this.binding.content.setLayoutTransition(var24);
         val var25: Group = this.binding.gradients;
         var25.setVisibility(8);
         val var26: TextView = this.binding.header;
         this.binding.header.setText(var9.getHeaderText());
         var26.setTextColor(var9.getHeaderColor());
         val var31: SimpleDraweeView = this.binding.thumbnail;
         val var27: GiftEmbed.Resolved = var9 as GiftEmbed.Resolved;
         ReactAssetUtilsKt.setOptionalReactImageUrl(var31, (var9 as GiftEmbed.Resolved).getThumbnailUrl());
         (var31.getHierarchy() as GenericDraweeHierarchy).E(com.facebook.drawee.generic.a.b((float)SizeUtilsKt.getDpToPx(var9.getThumbnailCornerRadius())));
         var var11: TextView = this.binding.title;
         this.binding.title.setText(var27.getTitleText());
         var11.setTextColor(var27.getTitleColor());
         val var32: java.lang.CharSequence = var11.getText();
         var var20: Byte;
         if (!StringsKt.c0(var32)) {
            var20 = 0;
         } else {
            var20 = 8;
         }

         var11.setVisibility(var20);
         var11 = this.binding.subtitle;
         this.binding.subtitle.setText(var27.getSubtitle());
         var11.setTextColor(var27.getSubtitleColor());
         val var33: java.lang.CharSequence = var11.getText();
         if (!StringsKt.c0(var33)) {
            var20 = 0;
         } else {
            var20 = 8;
         }

         var11.setVisibility(var20);
         if (var27 is GiftEmbed.Resolved.Invalid) {
            (this.binding.thumbnail.getHierarchy() as GenericDraweeHierarchy)
               .v(new ColorDrawable((var9 as GiftEmbed.Resolved.Invalid).getThumbnailBackgroundColor()));
            val var15: TextView = this.binding.body;
            var15.setVisibility(8);
            val var16: DCDButton = this.binding.acceptButton;
            var16.setVisibility(8);
         } else {
            if (var27 !is GiftEmbed.Resolved.Valid) {
               throw new B9.n();
            }

            var8 = this.binding.content;
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var8, false, new i0(var2, var9), 1, null);
            val var17: GiftEmbed.Resolved.Valid = var9 as GiftEmbed.Resolved.Valid;
            this.bindSplash(var9 as GiftEmbed.Resolved.Valid, var7);
            (this.binding.thumbnail.getHierarchy() as GenericDraweeHierarchy).v(null);
            val var29: TextView = this.binding.body;
            this.binding.body.setText(var17.getBodyText());
            var29.setTextColor(var17.getBodyTextColor());
            val var34: java.lang.CharSequence = var29.getText();
            if (!StringsKt.c0(var34)) {
               var20 = 0;
            } else {
               var20 = 8;
            }

            var29.setVisibility(var20);
            val var30: DCDButton = this.binding.acceptButton;
            this.binding.acceptButton.setText(var17.getAcceptLabelText());
            var30.setTextColor(var17.getAcceptLabelColor());
            var30.setBackgroundColor(var17.getAcceptLabelBackgroundColor());
            var30.setOnClickButtonListener(new j0(var3, var9));
            var30.setEnabled(var17.getCanBeAccepted());
         }

         this.lastState = new GiftView.Companion.State.Resolved(var1.getItemId());
      }
   }

   public companion object {
      private sealed interface State {
         public val accessoryId: Long

         public data class Resolved(accessoryId: Long) : GiftView.Companion.State {
            public open val accessoryId: Long

            init {
               this.accessoryId = var1;
            }

            public operator fun component1(): Long {
               return this.accessoryId;
            }

            public fun copy(accessoryId: Long = var0.accessoryId): com.discord.chat.presentation.message.view.GiftView.Companion.State.Resolved {
               return new GiftView.Companion.State.Resolved(var1);
            }

            public override operator fun equals(other: Any?): Boolean {
               if (this === var1) {
                  return true;
               } else if (var1 !is GiftView.Companion.State.Resolved) {
                  return false;
               } else {
                  return this.accessoryId == (var1 as GiftView.Companion.State.Resolved).accessoryId;
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

         public data class Resolving(accessoryId: Long) : GiftView.Companion.State {
            public open val accessoryId: Long

            init {
               this.accessoryId = var1;
            }

            public operator fun component1(): Long {
               return this.accessoryId;
            }

            public fun copy(accessoryId: Long = var0.accessoryId): com.discord.chat.presentation.message.view.GiftView.Companion.State.Resolving {
               return new GiftView.Companion.State.Resolving(var1);
            }

            public override operator fun equals(other: Any?): Boolean {
               if (this === var1) {
                  return true;
               } else if (var1 !is GiftView.Companion.State.Resolving) {
                  return false;
               } else {
                  return this.accessoryId == (var1 as GiftView.Companion.State.Resolving).accessoryId;
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
