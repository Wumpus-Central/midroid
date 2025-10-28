package com.discord.thumbhash

import N3.d
import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.util.AttributeSet
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder
import com.facebook.drawee.controller.a
import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.imagepipeline.request.ImageRequestBuilder
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nImageWithThumbhashPlaceholderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageWithThumbhashPlaceholderView.kt\ncom/discord/thumbhash/ImageWithThumbhashPlaceholderView\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,68:1\n29#2:69\n27#3:70\n*S KotlinDebug\n*F\n+ 1 ImageWithThumbhashPlaceholderView.kt\ncom/discord/thumbhash/ImageWithThumbhashPlaceholderView\n*L\n52#1:69\n59#1:70\n*E\n"])
internal class ImageWithThumbhashPlaceholderView  public constructor(context: Context, attrs: AttributeSet? = null) : SimpleDraweeView(var1, var2) {
   private final var uri: String?
   private final var placeholder: String?
   private final var placeholderVersion: Int?

   fun ImageWithThumbhashPlaceholderView(var1: Context) {
      this(var1, null, 2, null);
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
         val var3: a = ((d.g().F(ImageRequestBuilder.x(Uri.parse(this.uri)).a()) as PipelineDraweeControllerBuilder)
               .E(
                  new ThumbhashPlaceholderControllerListener(
                     this, new ColorDrawable(ThemeManagerKt.getTheme().getBackgroundSecondary()), this.placeholder, this.placeholderVersion
                  )
               ) as PipelineDraweeControllerBuilder)
            .d();
         this.setController(var3);
      }
   }
}
