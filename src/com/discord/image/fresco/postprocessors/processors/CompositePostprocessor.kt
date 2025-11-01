package com.discord.image.fresco.postprocessors.processors

import android.graphics.Bitmap
import com.facebook.imagepipeline.request.BasePostprocessor
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nCompositePostprocessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositePostprocessor.kt\ncom/discord/image/fresco/postprocessors/processors/CompositePostprocessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,17:1\n1863#2,2:18\n*S KotlinDebug\n*F\n+ 1 CompositePostprocessor.kt\ncom/discord/image/fresco/postprocessors/processors/CompositePostprocessor\n*L\n14#1:18,2\n*E\n"])
internal class CompositePostprocessor(postprocessors: List<BasePostprocessor>) : BasePostprocessor {
   private final val postprocessors: List<BasePostprocessor>

   init {
      this.postprocessors = var1;
   }

   public override fun process(destBitmap: Bitmap, sourceBitmap: Bitmap) {
      val var3: java.util.Iterator = this.postprocessors.iterator();

      while (var3.hasNext()) {
         (var3.next() as BasePostprocessor).process(var1, var2);
      }
   }
}
