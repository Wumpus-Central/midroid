package com.discord.thumbhash

import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.util.AttributeSet
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder
import com.facebook.drawee.controller.a
import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.imagepipeline.request.ImageRequestBuilder
import kotlin.jvm.internal.r
import l4.c

public class ImageWithThumbhashPlaceholderView  public constructor(context: Context, attrs: AttributeSet? = null) : SimpleDraweeView {
   private final var placeholder: String?
   private final var placeholderVersion: Int?
   private final var uri: String?

   fun ImageWithThumbhashPlaceholderView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2);
   }

   public fun setAlt(alt: String?) {
      this.setContentDescription(var1);
   }

   public fun setPlaceholder(placeholder: String?) {
      this.placeholder = var1;
      this.update();
   }

   public fun setPlaceholderVersion(placeholderVersion: Int?) {
      this.placeholderVersion = var1;
      this.update();
   }

   public fun setUri(uri: String?) {
      this.uri = var1;
      this.update();
   }

   public fun update() {
      if (this.uri != null) {
         val var3: a = ((c.g().D(ImageRequestBuilder.s(Uri.parse(this.uri)).a()) as PipelineDraweeControllerBuilder)
               .C(
                  new ThumbhashPlaceholderControllerListener(
                     this, new ColorDrawable(ThemeManagerKt.getTheme().getBackgroundSecondary()), this.placeholder, this.placeholderVersion
                  )
               ) as PipelineDraweeControllerBuilder)
            .c();
         r.g(var3, "newDraweeControllerBuild…   )\n            .build()");
         this.setController(var3);
      }
   }
}
