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

public class SpoilerView  public constructor(context: Context, attributeSet: AttributeSet? = null) : FrameLayout {
   private final val binding: SpoilerViewBinding
   private final var isOverlayVisible: Boolean
   private final var onHide: () -> Unit
   private final var onReveal: () -> Unit

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

   private fun configureObscureOverlay(label: String, parent: ViewGroup) {
      val var3: View = this.binding.obscure.getOverlayView();
      val var4: ObscureOverlayView = this.binding.obscure;
      kotlin.jvm.internal.q.g(this.binding.obscure, "obscure");
      var4.setVisibility(0);
      this.binding.obscure.configure(var1, var2, this.isOverlayVisible, this.onClick(true, var3), this.onClick(false, var3));
   }

   private fun configureSpoilerOverlay(label: String) {
      val var3: View = this.binding.spoiler.getOverlayView();
      val var2: SpoilerOverlayView = this.binding.spoiler;
      kotlin.jvm.internal.q.g(this.binding.spoiler, "spoiler");
      var2.setVisibility(0);
      this.binding.spoiler.configure(var1, this.onClick(true, var3));
   }

   private fun onClick(showImage: Boolean, overlayView: View): () -> Unit {
      return new Function0(this, var1, var2) {
         final View $overlayView;
         final boolean $showImage;
         final SpoilerView this$0;

         {
            super(0);
            this.this$0 = var1;
            this.$showImage = var2;
            this.$overlayView = var3;
         }

         public final void invoke() {
            var var3: Any;
            if (this.this$0.getParent().getParent() is ViewGroup) {
               var3 = this.this$0.getParent().getParent();
            } else if (this.this$0.getParent() is ViewGroup) {
               var3 = this.this$0.getParent();
            } else {
               var3 = this.this$0;
            }

            kotlin.jvm.internal.q.f(var3, "null cannot be cast to non-null type android.view.ViewGroup");
            var3 = var3 as ViewGroup;
            var var1: Byte;
            if (this.$showImage) {
               var1 = 2;
            } else {
               var1 = 1;
            }

            val var4: androidx.transition.c = new androidx.transition.c(var1);
            val var2: Boolean = this.$showImage;
            val var5: SpoilerView = this.this$0;
            var4.b0(150L);
            var4.b(new androidx.transition.i(var2, var5) {
               final boolean $showImage;
               final SpoilerView this$0;

               {
                  this.$showImage = var1;
                  this.this$0 = var2x;
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
            androidx.transition.j.a((ViewGroup)var3, var4);
            if (this.$showImage xor true) {
               var1 = 0;
            } else {
               var1 = 8;
            }

            this.$overlayView.setVisibility(var1);
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

   public fun configure(config: SpoilerConfig?, viewToBlur: ViewGroup) {
      kotlin.jvm.internal.q.h(var2, "viewToBlur");
      if (var1 != null) {
         this.resetOverlays();
         this.isOverlayVisible = SpoilerManager.INSTANCE.isNotRevealed-V2PEE7g(var1.getAttributes().getIdentifier-Bq9X6Gg());
         if (SpoilerView.WhenMappings.$EnumSwitchMapping$0[var1.getAttributes().getType().ordinal()] == 1) {
            this.configureObscureOverlay(var1.getAttributes().getLabel(), var2);
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

   public companion object {
      public fun ConstraintLayout.createAndAttachSpoilerView(radiusPx: Int): SpoilerView {
         kotlin.jvm.internal.q.h(var1, "<this>");
         val var3: Context = var1.getContext();
         kotlin.jvm.internal.q.g(var3, "getContext(...)");
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
