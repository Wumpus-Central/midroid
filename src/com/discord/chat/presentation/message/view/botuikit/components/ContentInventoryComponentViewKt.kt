package com.discord.chat.presentation.message.view.botuikit.components

import android.graphics.drawable.Animatable
import android.view.View
import androidx.core.view.r0
import com.discord.chat.bridge.botuikit.ContentInventoryEntry
import com.discord.chat.bridge.botuikit.ContentInventoryEntryClickable
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.misc.utilities.size.SizeUtilsKt
import com.facebook.drawee.controller.ControllerListener
import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.imagepipeline.image.ImageInfo
import kotlin.jvm.internal.q

@JvmSynthetic
fun a(var0: ContentInventoryEntry, var1: ComponentContext, var2: java.lang.String, var3: View) {
   applyClickable$lambda$0(var0, var1, var2, var3);
}

@JvmSynthetic
fun `access$applyClickable`(var0: View, var1: ComponentContext, var2: ContentInventoryEntry, var3: ContentInventoryEntryClickable, var4: java.lang.String) {
   applyClickable(var0, var1, var2, var3, var4);
}

private fun View.applyClickable(
   componentContext: ComponentContext,
   entry: ContentInventoryEntry,
   clickable: ContentInventoryEntryClickable?,
   tappedElement: String
) {
   if (var3 == null) {
      var0.setOnClickListener(null);
   } else {
      var0.setContentDescription(var3.getAriaDescription());
      var0.setOnClickListener(new c(var2, var1, var4));
   }

   val var5: Boolean;
   if (var3 != null) {
      var5 = true;
   } else {
      var5 = false;
   }

   r0.I0(var0, var5);
   var0.setClickable(var5);
}

fun `applyClickable$lambda$0`(var0: ContentInventoryEntry, var1: ComponentContext, var2: java.lang.String, var3: View) {
   q.h(var0, "$entry");
   q.h(var1, "$componentContext");
   q.h(var2, "$tappedElement");
   var0.onTap(var1.getContentInventoryEventHandlers(), var2);
}

public fun getContentControllerListener(imageView: SimpleDraweeView): ControllerListener<ImageInfo> {
   q.h(var0, "imageView");
   return new ControllerListener(var0) {
      final SimpleDraweeView $imageView;

      {
         this.$imageView = var1;
      }

      public void onFailure(java.lang.String var1, java.lang.Throwable var2) {
      }

      public void onFinalImageSet(java.lang.String var1, ImageInfo var2, Animatable var3) {
         if (var2 != null) {
            this.$imageView.getLayoutParams().width = -2;
            this.$imageView.getLayoutParams().height = SizeUtilsKt.getDpToPx(64);
            this.$imageView.setAspectRatio((float)var2.getWidth() / (float)var2.getHeight());
         }
      }

      public void onIntermediateImageFailed(java.lang.String var1, java.lang.Throwable var2) {
      }

      public void onIntermediateImageSet(java.lang.String var1, ImageInfo var2) {
      }

      public void onRelease(java.lang.String var1) {
      }

      public void onSubmit(java.lang.String var1, Object var2) {
      }
   };
}
