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
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.bridge.spoiler.SpoilerManager
import com.discord.chat.databinding.SpoilerViewBinding
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1

public class SpoilerView  public constructor(context: Context, attributeSet: AttributeSet? = null) : FrameLayout {
   private final val binding: SpoilerViewBinding
   private final var isOverlayVisible: Boolean
   private final var onReveal: () -> Unit
   private final var onHide: () -> Unit

   fun SpoilerView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2);
      val var3: SpoilerViewBinding = SpoilerViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var3, "inflate(...)");
      this.binding = var3;
      this.onReveal = <unrepresentable>.INSTANCE;
      this.onHide = <unrepresentable>.INSTANCE;
   }

   private fun configureObscureOverlay(label: String, parent: ViewGroup, verifyAge: Boolean?, onTapObscureToggle: (Boolean) -> Unit) {
      val var5: View = this.binding.obscure.getOverlayView();
      val var6: Function1;
      if (kotlin.jvm.internal.q.c(var3, java.lang.Boolean.TRUE)) {
         var6 = this.onObscureVerifyAgeClick(var4);
      } else {
         var6 = this.onObscureToggleVisibilityClick(var5, var4);
      }

      val var7: ObscureOverlayView = this.binding.obscure;
      kotlin.jvm.internal.q.g(this.binding.obscure, "obscure");
      var7.setVisibility(0);
      this.binding.obscure.configure(var1, var2, this.isOverlayVisible, new Function0(var6) {
         final Function1 $obscureCallback;

         {
            super(0);
            this.$obscureCallback = var1;
         }

         public final void invoke() {
            this.$obscureCallback.invoke(java.lang.Boolean.TRUE);
         }
      }, new Function0(var6) {
         final Function1 $obscureCallback;

         {
            super(0);
            this.$obscureCallback = var1;
         }

         public final void invoke() {
            this.$obscureCallback.invoke(java.lang.Boolean.FALSE);
         }
      });
   }

   private fun configureSpoilerOverlay(label: String) {
      val var2: View = this.binding.spoiler.getOverlayView();
      val var3: SpoilerOverlayView = this.binding.spoiler;
      kotlin.jvm.internal.q.g(this.binding.spoiler, "spoiler");
      var3.setVisibility(0);
      this.binding.spoiler.configure(var1, new Function0(this, var2) {
         final View $overlayView;
         final SpoilerView this$0;

         {
            super(0);
            this.this$0 = var1;
            this.$overlayView = var2;
         }

         public final void invoke() {
            SpoilerView.access$toggleContentVisibility(this.this$0, true, this.$overlayView);
         }
      });
   }

   private fun onObscureToggleVisibilityClick(overlayView: View, onTapObscureToggle: (Boolean) -> Unit): (Boolean) -> Unit {
      return new Function1(this, var1, var2) {
         final Function1 $onTapObscureToggle;
         final View $overlayView;
         final SpoilerView this$0;

         {
            super(1);
            this.this$0 = var1;
            this.$overlayView = var2;
            this.$onTapObscureToggle = var3;
         }

         public final void invoke(boolean var1) {
            SpoilerView.access$toggleContentVisibility(this.this$0, var1, this.$overlayView);
            this.$onTapObscureToggle.invoke(var1);
         }
      };
   }

   private fun onObscureVerifyAgeClick(onTapObscureToggle: (Boolean) -> Unit): (Boolean) -> Unit {
      return new Function1(var1) {
         final Function1 $onTapObscureToggle;

         {
            super(1);
            this.$onTapObscureToggle = var1;
         }

         public final void invoke(boolean var1) {
            this.$onTapObscureToggle.invoke(var1);
         }
      };
   }

   private fun resetOverlays() {
      val var1: SpoilerOverlayView = this.binding.spoiler;
      kotlin.jvm.internal.q.g(this.binding.spoiler, "spoiler");
      var1.setVisibility(8);
      val var2: ObscureOverlayView = this.binding.obscure;
      kotlin.jvm.internal.q.g(this.binding.obscure, "obscure");
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

      kotlin.jvm.internal.q.f(var4, "null cannot be cast to non-null type android.view.ViewGroup");
      val var5: ViewGroup = var4 as ViewGroup;
      var var3: Byte;
      if (var1) {
         var3 = 2;
      } else {
         var3 = 1;
      }

      var4 = new androidx.transition.c(var3);
      var4.b0(150L);
      var4.b(new androidx.transition.i(var1, this) {
         final boolean $showImage;
         final SpoilerView this$0;

         {
            this.$showImage = var1;
            this.this$0 = var2;
         }

         @Override
         public void onTransitionEnd(Transition var1) {
            kotlin.jvm.internal.q.h(var1, "transition");
            if (this.$showImage) {
               SpoilerView.access$getOnReveal$p(this.this$0).invoke();
               SpoilerView.access$setOverlayVisible$p(this.this$0, false);
            } else {
               SpoilerView.access$getOnHide$p(this.this$0).invoke();
               SpoilerView.access$setOverlayVisible$p(this.this$0, true);
            }
         }
      });
      androidx.transition.j.a(var5, var4);
      if (!var1) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      var2.setVisibility(var3);
   }

   public fun configure(config: SpoilerConfig?, viewToBlur: ViewGroup) {
      kotlin.jvm.internal.q.h(var2, "viewToBlur");
      if (var1 != null) {
         this.resetOverlays();
         this.isOverlayVisible = SpoilerManager.INSTANCE.isNotRevealed-V2PEE7g(var1.getAttributes().getIdentifier-Bq9X6Gg());
         if (SpoilerView.WhenMappings.$EnumSwitchMapping$0[var1.getAttributes().getType().ordinal()] == 1) {
            this.configureObscureOverlay(var1.getAttributes().getLabel(), var2, var1.getAttributes().getVerifyAge(), var1.getOnTapObscureToggle());
         } else {
            this.configureSpoilerOverlay(var1.getAttributes().getLabel());
         }

         this.onReveal = new Function0(var1) {
            {
               super(0, var1, SpoilerConfig::class.java, "onReveal", "onReveal()V", 0);
            }

            public final void invoke() {
               (super.receiver as SpoilerConfig).onReveal();
            }
         };
         this.onHide = new Function0(var1) {
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
         kotlin.jvm.internal.q.h(var1, "<this>");
         val var3: Context = var1.getContext();
         kotlin.jvm.internal.q.g(var3, "getContext(...)");
         val var4: SpoilerView = new SpoilerView(var3, null, 2, null);
         var4.setId(View.generateViewId());
         ViewClippingUtilsKt.clipToRoundedRectangle(var4, var2);
         var4.setLayoutParams(new ConstraintLayout.LayoutParams(0, 0));
         var1.addView(var4);
         val var5: ConstraintSet = new ConstraintSet();
         var5.g(var1);
         var5.h(var4.getId(), 6, 0, 6, 0);
         var5.h(var4.getId(), 7, 0, 7, 0);
         var5.h(var4.getId(), 3, 0, 3, 0);
         var5.h(var4.getId(), 4, 0, 4, 0);
         var5.c(var1);
         return var4;
      }
   }
}
