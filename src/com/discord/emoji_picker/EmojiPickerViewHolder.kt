package com.discord.emoji_picker

import android.content.Context
import android.graphics.drawable.Animatable
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutParams
import com.discord.SetTextSizeSpKt
import com.discord.emoji_picker.databinding.PremiumInlineRoadblockFooterBinding
import com.discord.emoji_picker.databinding.PremiumInlineRoadblockHeaderBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.icons.IconUrlUtils
import com.discord.image.fresco.SetOptionalImageUrlKt
import com.discord.misc.utilities.drawable.GetDrawableCompatKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.portals.from_js.PortalFromJsContext
import com.discord.portals.from_js.PortalFromJsContextManager
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.ripple.RippleUtilsKt
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.drawable.ScalingUtils.ScaleType
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.interfaces.DraweeController
import com.facebook.drawee.view.SimpleDraweeView
import kh.l
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q

internal sealed class EmojiPickerViewHolder protected constructor(view: View) : RecyclerView.ViewHolder(var1) {
   public class Category(context: Context) : EmojiPickerViewHolder {
      private final val categoryTextView: TextView

      public final var isInsidePremiumRoadblock: Boolean
         internal set

      init {
         q.h(var1, "context");
         super(new TextView(var1), null);
         val var2: View = this.itemView;
         q.f(this.itemView, "null cannot be cast to non-null type android.widget.TextView");
         val var3: TextView = var2 as TextView;
         this.categoryTextView = var2 as TextView;
         DiscordFontUtilsKt.setDiscordFont(var2 as TextView, DiscordFont.PrimarySemibold);
         SetTextSizeSpKt.setTextSizeSp(var3, 16.0F);
         var3.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
         var3.setLayoutParams(layoutParams);
      }

      public fun onBindViewHolder(category: EmojiPickerItem.Category) {
         q.h(var1, "category");
         this.isInsidePremiumRoadblock = var1.isInsidePremiumRoadBlock();
         if (h.x(var1.getTitle()) xor true) {
            this.categoryTextView.setPadding(0, SizeUtilsKt.getDpToPx(8), 0, 0);
            this.categoryTextView.setLayoutParams(layoutParams);
            this.categoryTextView.setText(var1.getTitle());
         } else {
            this.categoryTextView.setPadding(0, 0, 0, 0);
            this.categoryTextView.setText(null);
            this.categoryTextView.setLayoutParams(layoutParamsEmpty);
         }
      }

      public companion object {
         private final val layoutParams: LayoutParams
         private final val layoutParamsEmpty: LayoutParams
      }
   }

   public companion object {
      public fun EmojiPickerViewHolder.isNitroLocked(): Boolean {
         q.h(var1, "<this>");
         val var2: Boolean;
         if (var1 is EmojiPickerViewHolder.Emoji) {
            var2 = (var1 as EmojiPickerViewHolder.Emoji).isInsidePremiumRoadblock();
         } else if (var1 is EmojiPickerViewHolder.Category) {
            var2 = (var1 as EmojiPickerViewHolder.Category).isInsidePremiumRoadblock();
         } else {
            var2 = false;
         }

         return var2;
      }
   }

   public class Emoji(context: Context, onPressEmoji: (Long?, String) -> Unit, onLongPressEmoji: (Long?, String) -> Unit) : EmojiPickerViewHolder {
      private final val placeholder: Drawable
         private final get() {
            return this.placeholder$delegate.getValue() as Drawable;
         }


      private final val emojiView: SimpleDraweeView
      private final var emojiItem: EmojiPickerItem.Emoji?
      private final var emojiSize: Int?
      private final var emojiMargin: Int?
      private final var emojiUrl: String?
      private final val emojiLoadListener: com.discord.emoji_picker.EmojiPickerViewHolder.Emoji.EmojiLoadListener
      private final var emojiAnimated: Boolean

      public final val isInsidePremiumRoadblock: Boolean
         public final get() {
            val var1: Boolean;
            if (this.emojiItem != null) {
               var1 = this.emojiItem.isInsidePremiumRoadBlock();
            } else {
               var1 = false;
            }

            return var1;
         }


      init {
         q.h(var1, "context");
         q.h(var2, "onPressEmoji");
         q.h(var3, "onLongPressEmoji");
         super(new SimpleDraweeView(var1), null);
         this.placeholder$delegate = l.b(<unrepresentable>.INSTANCE);
         val var4: View = this.itemView;
         q.f(this.itemView, "null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
         val var5: SimpleDraweeView = var4 as SimpleDraweeView;
         this.emojiView = var4 as SimpleDraweeView;
         this.emojiLoadListener = new EmojiPickerViewHolder.Emoji.EmojiLoadListener(false);
         RippleUtilsKt.addCircleRipple(var5, true);
         (var5.getHierarchy() as GenericDraweeHierarchy).x(var1.getResources().getInteger(com.discord.image.fresco.R.integer.image_fade_duration) / 3);
         (var5.getHierarchy() as GenericDraweeHierarchy).u(ScaleType.e);
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var5, false, new d(this, var2), 1, null);
         NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var5, false, new e(this, var3), 1, null);
      }

      @JvmStatic
      fun `_init_$lambda$1`(var0: EmojiPickerViewHolder.Emoji, var1: Function2, var2: View) {
         q.h(var0, "this$0");
         q.h(var1, "$onPressEmoji");
         val var4: EmojiPickerItem.Emoji = var0.emojiItem;
         if (var0.emojiItem != null) {
            val var3: java.lang.Long;
            if (var0.emojiItem.getUnicodeUrl() != null) {
               var3 = null;
            } else {
               var3 = var4.getId();
            }

            var1.invoke(var3, var4.getName());
         }
      }

      @JvmStatic
      fun `_init_$lambda$3`(var0: EmojiPickerViewHolder.Emoji, var1: Function2, var2: View): Boolean {
         q.h(var0, "this$0");
         q.h(var1, "$onLongPressEmoji");
         val var4: EmojiPickerItem.Emoji = var0.emojiItem;
         if (var0.emojiItem != null) {
            val var3: java.lang.Long;
            if (var0.emojiItem.getUnicodeUrl() != null) {
               var3 = null;
            } else {
               var3 = var4.getId();
            }

            var1.invoke(var3, var4.getName());
         }

         return true;
      }

      private fun EmojiPickerItem.Emoji.getEmojiUrl(): String {
         val var3: java.lang.String = var1.getUnicodeUrl();
         var var2: java.lang.String = var3;
         if (var3 == null) {
            var2 = IconUrlUtils.INSTANCE.getCustomEmojiUrl(var1.getId(), var1.getAnimated(), this.emojiSize);
         }

         return var2;
      }

      public fun getWidth(): Int {
         var var2: Int = 0;
         val var1: Int;
         if (this.emojiSize != null) {
            var1 = this.emojiSize;
         } else {
            var1 = 0;
         }

         if (this.emojiMargin != null) {
            var2 = this.emojiMargin;
         }

         return var1 + var2 * 2;
      }

      public fun onBindViewHolder(
         item: EmojiPickerItem.Emoji,
         emojiAnimated: Boolean,
         emojiSize: Int,
         emojiMargin: Int,
         scrolling: Boolean,
         scrollingFast: Boolean
      ) {
         q.h(var1, "item");
         this.emojiAnimated = var2;
         this.emojiItem = var1;
         this.emojiSize = var3;
         this.emojiMargin = var4;
         val var7: SimpleDraweeView = this.emojiView;
         val var8: RecyclerView.LayoutParams = new RecyclerView.LayoutParams(var3, var3);
         var8.setMargins(var4, var4, var4, var4);
         var7.setLayoutParams(var8);
         this.emojiView.setContentDescription(var1.getName());
         val var11: GenericDraweeHierarchy = this.emojiView.getHierarchy() as GenericDraweeHierarchy;
         val var10: Drawable;
         if (var1.getDisabled() === EmojiPickerItem.Emoji.DisabledType.ICON) {
            val var9: Context = this.itemView.getContext();
            q.g(var9, "getContext(...)");
            var10 = GetDrawableCompatKt.getDrawableCompat(var9, R.drawable.lock_overlay);
         } else {
            var10 = null;
         }

         var11.z(var10);
         this.updateImage(var5, var6);
      }

      public fun updateImage(scrolling: Boolean, scrollingFast: Boolean) {
         val var3: EmojiPickerItem.Emoji = this.emojiItem;
         if (this.emojiItem != null) {
            val var4: java.lang.String = this.getEmojiUrl(this.emojiItem);
            if (this.emojiAnimated && var3.getAnimated() && !var1) {
               var1 = true;
            } else {
               var1 = false;
            }

            var var7: Animatable = null;
            if (var2) {
               if (!q.c(this.emojiUrl, var4)) {
                  this.emojiUrl = null;
                  this.emojiView.setImageURI(null);
                  this.emojiView.setBackground(this.getPlaceholder());
               }
            } else if (!q.c(this.emojiUrl, var4)) {
               this.emojiUrl = var4;
               (this.emojiView.getHierarchy() as GenericDraweeHierarchy).A(this.getPlaceholder());
               this.emojiView.setBackground(null);
               SetOptionalImageUrlKt.setOptionalImageUrl(this.emojiView, this.emojiUrl, java.lang.Boolean.FALSE, this.emojiLoadListener);
            }

            val var8: EmojiPickerViewHolder.Emoji.EmojiLoadListener = this.emojiLoadListener;
            val var5: DraweeController = this.emojiView.getController();
            if (var5 != null) {
               var7 = var5.getAnimatable();
            }

            var8.setAnimating(var1, var7);
         }
      }

      public companion object {
         public fun createPlaceholderDrawable(): Drawable {
            val var1: GradientDrawable = new GradientDrawable();
            var1.setShape(1);
            var1.setColor(ThemeManagerKt.getTheme().getBackgroundAccent());
            return var1;
         }
      }

      private class EmojiLoadListener(animating: Boolean) : b5.a {
         private final var animating: Boolean

         init {
            this.animating = var1;
         }

         public open fun onFinalImageSet(id: String?, imageInfo: Any?, animatable: Animatable?) {
            this.setAnimating(this.animating, var3);
         }

         public fun setAnimating(animating: Boolean, animatable: Animatable?) {
            this.animating = var1;
            if (var2 != null && var1) {
               var2.start();
            } else if (var2 != null) {
               var2.stop();
            }
         }
      }
   }

   public class EmojiPlaceholder(context: Context) : EmojiPickerViewHolder {
      init {
         q.h(var1, "context");
         super(new View(var1), null);
         this.itemView.setBackground(EmojiPickerViewHolder.Emoji.Companion.createPlaceholderDrawable());
      }

      public fun onBindViewHolder(emojiSize: Int, emojiMargin: Int) {
         val var4: View = this.itemView;
         val var3: RecyclerView.LayoutParams = new RecyclerView.LayoutParams(var1, var1);
         var3.setMargins(var2, var2, var2, var2);
         var4.setLayoutParams(var3);
      }
   }

   public class FooterUpsell(context: Context) : EmojiPickerViewHolder, PortalFromJsContext {
      init {
         q.h(var1, "context");
         super(new FrameLayout(var1), null);
         this.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, SizeUtilsKt.getDpToPx(64)));
      }

      public override fun getPortalViewIndex(portalView: View): Int {
         q.h(var1, "portalView");
         val var2: View = this.itemView;
         q.f(this.itemView, "null cannot be cast to non-null type android.widget.FrameLayout");
         return (var2 as FrameLayout).indexOfChild(var1);
      }

      public fun onBindViewHolder(footerUpsell: EmojiPickerItem.FooterUpsell) {
         q.h(var1, "footerUpsell");
         PortalFromJsContextManager.INSTANCE.addContext(var1.getId(), this);
      }

      public override fun onPortalFromJsAdded(portalId: String, portalView: View) {
         q.h(var1, "portalId");
         q.h(var2, "portalView");
         val var3: View = this.itemView;
         q.f(this.itemView, "null cannot be cast to non-null type android.widget.FrameLayout");
         (var3 as FrameLayout).addView(var2);
      }

      public override fun onPortalFromJsRemoved(portalId: String, portalView: View) {
         q.h(var1, "portalId");
         q.h(var2, "portalView");
         val var3: View = this.itemView;
         q.f(this.itemView, "null cannot be cast to non-null type android.widget.FrameLayout");
         (var3 as FrameLayout).removeView(var2);
      }
   }

   public class PremiumInlineRoadblockFooter(context: Context,
         binding: PremiumInlineRoadblockFooterBinding = PremiumInlineRoadblockFooterBinding.inflate(LayoutInflater.from(var1))
      )
      : EmojiPickerViewHolder {
      private final val binding: PremiumInlineRoadblockFooterBinding

      init {
         q.h(var1, "context");
         q.h(var2, "binding");
         val var3: RelativeLayout = var2.getRoot();
         q.g(var3, "getRoot(...)");
         super(var3, null);
         this.binding = var2;
      }

      public fun onBindViewHolder(useTier0UpsellContent: Boolean) {
         var var3: View = this.binding.gradient;
         q.g(this.binding.gradient, "gradient");
         val var2: EmojiPickerViewHolder.PremiumInlineRoadblockHeader.Companion = EmojiPickerViewHolder.PremiumInlineRoadblockHeader.Companion;
         ViewBackgroundUtilsKt.setBackgroundDrawableRes(
            var3,
            EmojiPickerViewHolder.PremiumInlineRoadblockHeader.Companion.getGradient$default(
               EmojiPickerViewHolder.PremiumInlineRoadblockHeader.Companion, var1, false, 2, null
            )
         );
         var3 = this.binding.gradientDivider;
         q.g(this.binding.gradientDivider, "gradientDivider");
         ViewBackgroundUtilsKt.setBackgroundDrawableRes(
            var3, EmojiPickerViewHolder.PremiumInlineRoadblockHeader.Companion.getGradient$default(var2, var1, false, 2, null)
         );
      }
   }

   public class PremiumInlineRoadblockHeader(context: Context,
         binding: PremiumInlineRoadblockHeaderBinding = PremiumInlineRoadblockHeaderBinding.inflate(LayoutInflater.from(var1))
      )
      : EmojiPickerViewHolder {
      private final val binding: PremiumInlineRoadblockHeaderBinding

      init {
         q.h(var1, "context");
         q.h(var2, "binding");
         val var3: RelativeLayout = var2.getRoot();
         q.g(var3, "getRoot(...)");
         super(var3, null);
         this.binding = var2;
      }

      public fun onBindViewHolder(useTier0UpsellContent: Boolean) {
         var var3: View = this.binding.gradient;
         q.g(this.binding.gradient, "gradient");
         val var2: EmojiPickerViewHolder.PremiumInlineRoadblockHeader.Companion = Companion;
         ViewBackgroundUtilsKt.setBackgroundDrawableRes(
            var3, EmojiPickerViewHolder.PremiumInlineRoadblockHeader.Companion.getGradient$default(Companion, var1, false, 2, null)
         );
         var3 = this.binding.gradientDivider;
         q.g(this.binding.gradientDivider, "gradientDivider");
         ViewBackgroundUtilsKt.setBackgroundDrawableRes(
            var3, EmojiPickerViewHolder.PremiumInlineRoadblockHeader.Companion.getGradient$default(var2, var1, false, 2, null)
         );
         val var5: FrameLayout = this.binding.gradientIcon;
         q.g(this.binding.gradientIcon, "gradientIcon");
         ViewBackgroundUtilsKt.setBackgroundDrawableRes(var5, var2.getGradient(var1, true));
      }

      public companion object {
         public fun getGradient(useTier0UpsellContent: Boolean, circle: Boolean = false): Int {
            val var3: Int;
            if (var1) {
               if (var2) {
                  var3 = R.drawable.premium_tier0_gradient_circle;
               } else {
                  var3 = R.drawable.premium_tier0_gradient;
               }
            } else if (var2) {
               var3 = R.drawable.premium_tier2_gradient_circle;
            } else {
               var3 = R.drawable.premium_tier2_gradient;
            }

            return var3;
         }
      }
   }

   public class Spacer(context: Context) : EmojiPickerViewHolder {
      init {
         q.h(var1, "context");
         super(new View(var1), null);
      }

      public fun onBindViewHolder(item: EmojiPickerItem.Spacer) {
         q.h(var1, "item");
         this.itemView.setLayoutParams(new RecyclerView.LayoutParams(-2, var1.getHeight()));
      }
   }
}
