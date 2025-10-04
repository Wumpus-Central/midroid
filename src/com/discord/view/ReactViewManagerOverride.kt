package com.discord.view

import android.view.View
import android.view.View.OnAttachStateChangeListener
import com.discord.R
import com.facebook.react.R.id
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.views.view.ReactViewGroup
import com.facebook.react.views.view.ReactViewManager
import io.sentry.e
import io.sentry.p1
import kotlin.jvm.internal.SourceDebugExtension

@ReactModule(canOverrideExistingModule = true, name = "RCTView")
@SourceDebugExtension(["SMAP\nReactViewManagerOverride.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactViewManagerOverride.kt\ncom/discord/view/ReactViewManagerOverride\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,68:1\n119#2,15:69\n*S KotlinDebug\n*F\n+ 1 ReactViewManagerOverride.kt\ncom/discord/view/ReactViewManagerOverride\n*L\n58#1:69,15\n*E\n"])
public class ReactViewManagerOverride : ReactViewManager {
   public open fun addView(parent: ReactViewGroup, child: View, index: Int) {
      if (var2.getParent() == null) {
         super.addView(var1, var2, var3);
      } else {
         var var8: java.lang.Boolean = (java.lang.Boolean)var2.getTag(R.id.view_is_transitioning);
         if (var8 is java.lang.Boolean) {
            var8 = var8;
         } else {
            var8 = null;
         }

         var var5: Boolean = false;
         val var11: Boolean;
         if (var8 != null) {
            var11 = var8;
         } else {
            var11 = false;
         }

         val var6: Boolean = var2.getParent() == var1;
         val var7: Boolean = var1.getRemoveClippedSubviews();
         val var10: Any = var2.getTag(id.view_clipped);
         var8 = null;
         if (var10 is java.lang.Boolean) {
            var8 = var10 as java.lang.Boolean;
         }

         if (var8 != null) {
            var5 = var8;
         }

         val var15: java.lang.String = var2.getClass().getName();
         val var14: e = e.n("ReactViewManagerOverride: Child view already has a parent!");
         var14.o("react.viewmanager");
         var14.p("isTransitioning", var11);
         var14.p("wantsToAddToSameParent", var6);
         var14.p("isParentClipping", var7);
         var14.p("isChildClipped", var5);
         var14.p("childClassType", var15);
         p1.e(var14);
         if (!var2.isAttachedToWindow()) {
            var2.post(new Runnable(this, var1, var2, var3) {
               final View $child;
               final int $index;
               final ReactViewGroup $parent;
               final ReactViewManagerOverride this$0;

               {
                  this.this$0 = var1;
                  this.$parent = var2;
                  this.$child = var3;
                  this.$index = var4;
               }

               @Override
               public final void run() {
                  ReactViewManagerOverride.access$addView$s-1759603095(this.this$0, this.$parent, this.$child, this.$index);
               }
            });
         } else {
            var2.addOnAttachStateChangeListener(new OnAttachStateChangeListener(var2, var2, this, var1, var3) {
               final View $child$inlined;
               final int $index$inlined;
               final ReactViewGroup $parent$inlined;
               final View $this_doOnDetach;
               final ReactViewManagerOverride this$0;

               {
                  this.$this_doOnDetach = var1;
                  this.$child$inlined = var2;
                  this.this$0 = var3;
                  this.$parent$inlined = var4;
                  this.$index$inlined = var5;
               }

               public void onViewAttachedToWindow(View var1) {
               }

               public void onViewDetachedFromWindow(View var1) {
                  this.$this_doOnDetach.removeOnAttachStateChangeListener(this);
                  this.$child$inlined.post(new Runnable(this.this$0, this.$parent$inlined, this.$child$inlined, this.$index$inlined) {
                     final View $child;
                     final int $index;
                     final ReactViewGroup $parent;
                     final ReactViewManagerOverride this$0;

                     {
                        this.this$0 = var1;
                        this.$parent = var2;
                        this.$child = var3;
                        this.$index = var4;
                     }

                     @Override
                     public final void run() {
                        ReactViewManagerOverride.access$addView$s-1759603095(this.this$0, this.$parent, this.$child, this.$index);
                     }
                  });
               }
            });
         }
      }
   }

   public open fun createViewInstance(context: ThemedReactContext): ReactViewGroupOverride {
      return new ReactViewGroupOverride(var1);
   }
}
