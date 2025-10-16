package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.Transition
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.bridge.spoiler.SpoilerManager
import com.discord.chat.databinding.SpoilerViewBinding
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nSpoilerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpoilerView.kt\ncom/discord/chat/presentation/message/view/SpoilerView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,182:1\n257#2,2:183\n257#2,2:185\n257#2,2:187\n257#2,2:189\n257#2,2:191\n257#2,2:193\n257#2,2:195\n*S KotlinDebug\n*F\n+ 1 SpoilerView.kt\ncom/discord/chat/presentation/message/view/SpoilerView\n*L\n60#1:183,2\n78#1:185,2\n79#1:187,2\n84#1:189,2\n106#1:191,2\n152#1:193,2\n155#1:195,2\n*E\n"])
public class SpoilerView  public constructor(context: Context, attributeSet: AttributeSet? = null) : FrameLayout(var1, var2) {
   private final val binding: SpoilerViewBinding
   private final var isOverlayVisible: Boolean
   private final var onReveal: () -> Unit
   private final var onHide: () -> Unit

   fun SpoilerView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      val var3: SpoilerViewBinding = SpoilerViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var3;
      this.onReveal = new U0();
      this.onHide = new V0();
   }

   private fun configureObscureOverlay(config: SpoilerConfig, parent: ViewGroup) {
      val var3: SpoilerAttributes = var1.getAttributes();
      val var4: View = this.binding.obscure.getOverlayView();
      val var7: Function1;
      if (var3.getVerifyAge() == java.lang.Boolean.TRUE) {
         var7 = this.onObscureVerifyAgeClick(var1.getOnTapObscureToggle());
      } else {
         var7 = this.onObscureToggleVisibilityClick(var4, var1.getOnTapObscureToggle());
      }

      val var9: ObscureOverlayView = this.binding.obscure;
      var9.setVisibility(0);
      val var10: ObscureOverlayView = this.binding.obscure;
      val var5: Function1 = var3.getLabel();
      var var6: Context = this.getContext();
      val var11: java.lang.String = var5.invoke(var6) as java.lang.String;
      val var8: Function1 = var3.getDescription();
      var6 = this.getContext();
      var10.configure(var11, var8.invoke(var6) as java.lang.String, var2, this.isOverlayVisible, new Q0(var7), new R0(var7));
   }

   @JvmStatic
   fun `configureObscureOverlay$lambda$6`(var0: Function1): Unit {
      var0.invoke(java.lang.Boolean.TRUE);
      return Unit.a;
   }

   @JvmStatic
   fun `configureObscureOverlay$lambda$7`(var0: Function1): Unit {
      var0.invoke(java.lang.Boolean.FALSE);
      return Unit.a;
   }

   private fun configureSpoilerOverlay(config: SpoilerConfig) {
      val var2: View = this.binding.spoiler.getOverlayView();
      var var3: SpoilerOverlayView = this.binding.spoiler;
      var3.setVisibility(0);
      var3 = this.binding.spoiler;
      val var4: Function1 = var1.getAttributes().getLabel();
      val var5: Context = this.getContext();
      val var8: java.lang.String = var4.invoke(var5) as java.lang.String;
      val var9: Function1 = var1.getAttributes().getDescription();
      val var6: Context = this.getContext();
      var3.configure(var8, var9.invoke(var6) as java.lang.String, new P0(this, var2));
   }

   @JvmStatic
   fun `configureSpoilerOverlay$lambda$5`(var0: SpoilerView, var1: View): Unit {
      var0.toggleContentVisibility(true, var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onHide$lambda$1`(): Unit {
      return Unit.a;
   }

   private fun onObscureToggleVisibilityClick(overlayView: View, onTapObscureToggle: (Boolean) -> Unit): (Boolean) -> Unit {
      return new T0(this, var1, var2);
   }

   @JvmStatic
   fun `onObscureToggleVisibilityClick$lambda$3`(var0: SpoilerView, var1: View, var2: Function1, var3: Boolean): Unit {
      var0.toggleContentVisibility(var3, var1);
      var2.invoke(var3);
      return Unit.a;
   }

   private fun onObscureVerifyAgeClick(onTapObscureToggle: (Boolean) -> Unit): (Boolean) -> Unit {
      return new S0(var1);
   }

   @JvmStatic
   fun `onObscureVerifyAgeClick$lambda$4`(var0: Function1, var1: Boolean): Unit {
      var0.invoke(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onReveal$lambda$0`(): Unit {
      return Unit.a;
   }

   private fun resetOverlays() {
      val var1: SpoilerOverlayView = this.binding.spoiler;
      var1.setVisibility(8);
      val var2: ObscureOverlayView = this.binding.obscure;
      var2.setVisibility(8);
   }

   private fun toggleContentVisibility(showImage: Boolean, overlayView: View) {
      var var4: Any;
      if (this.getParent().getParent() is ViewGroup) {
         var4 = this.getParent().getParent();
      } else if (this.getParent() is ViewGroup) {
         var4 = this.getParent();
      } else {
         var4 = this;
      }

      val var5: ViewGroup = var4 as ViewGroup;
      var var3: Byte;
      if (var1) {
         var3 = 2;
      } else {
         var3 = 1;
      }

      var4 = new androidx.transition.c(var3);
      var4.e0(150L);
      var4.b(new androidx.transition.p(var1, this) {
         final boolean $showImage;
         final SpoilerView this$0;

         {
            this.$showImage = var1;
            this.this$0 = var2;
         }

         @Override
         public void onTransitionEnd(Transition var1) {
            if (this.$showImage) {
               SpoilerView.access$getOnReveal$p(this.this$0).invoke();
               SpoilerView.access$setOverlayVisible$p(this.this$0, false);
            } else {
               SpoilerView.access$getOnHide$p(this.this$0).invoke();
               SpoilerView.access$setOverlayVisible$p(this.this$0, true);
            }
         }
      });
      androidx.transition.q.a(var5, var4);
      if (!var1) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      var2.setVisibility(var3);
   }

   public fun configure(config: SpoilerConfig?, viewToBlur: ViewGroup) {
      if (var1 != null) {
         this.resetOverlays();
         this.isOverlayVisible = SpoilerManager.INSTANCE.isNotRevealed-V2PEE7g(var1.getAttributes().getIdentifier-Bq9X6Gg());
         if (SpoilerView.WhenMappings.$EnumSwitchMapping$0[var1.getAttributes().getType().ordinal()] == 1) {
            this.configureObscureOverlay(var1, var2);
         } else {
            this.configureSpoilerOverlay(var1);
         }

         this.onReveal = new Function0<Unit>(var1) {
            {
               super(0, var1, SpoilerConfig::class.java, "onReveal", "onReveal()V", 0);
            }

            public final void invoke() {
               (super.receiver as SpoilerConfig).onReveal();
            }
         };
         this.onHide = new Function0<Unit>(var1) {
            {
               super(0, var1, SpoilerConfig::class.java, "onHide", "onHide()V", 0);
            }

            public final void invoke() {
               (super.receiver as SpoilerConfig).onHide();
            }
         };
         this.setVisibility(0);
      } else {
         this.isOverlayVisible = false;
         this.setVisibility(8);
      }
   }

   public fun handleObscureAwaitingScan(isAwaitingScan: Boolean) {
      this.binding.obscure.handleObscureAwaitingScan(var1);
   }

   public fun isOverlayVisible(): Boolean {
      return this.isOverlayVisible;
   }

   public fun makeObscureHideButtonHidden() {
      this.binding.obscure.makeHideButtonHidden();
   }

   public fun setObscureLabelVisible(isVisible: Boolean) {
      this.binding.obscure.setLabelVisible(var1);
   }

   public fun setOpaqueBackgroundVisible(isVisible: Boolean) {
      this.binding.obscure.setOpaqueBackgroundVisible(var1);
   }

   public fun setRevealButtonVisible(isVisible: Boolean) {
      this.binding.obscure.setRevealButtonVisible(var1);
   }

   public companion object {
      public fun ConstraintLayout.createAndAttachSpoilerView(radiusPx: Int): SpoilerView {
         val var3: Context = var1.getContext();
         val var5: SpoilerView = new SpoilerView(var3, null, 2, null);
         var5.setId(View.generateViewId());
         ViewClippingUtilsKt.clipToRoundedRectangle(var5, var2);
         var5.setLayoutParams(new ConstraintLayout.LayoutParams(0, 0));
         var1.addView(var5);
         val var4: ConstraintSet = new ConstraintSet();
         var4.f(var1);
         var4.g(var5.getId(), 6, 0, 6, 0);
         var4.g(var5.getId(), 7, 0, 7, 0);
         var4.g(var5.getId(), 3, 0, 3, 0);
         var4.g(var5.getId(), 4, 0, 4, 0);
         var4.c(var1);
         return var5;
      }
   }
}
