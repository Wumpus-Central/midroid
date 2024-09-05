package com.discord.emoji

import android.content.Context
import android.net.Uri
import android.text.SpannableStringBuilder
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder
import com.facebook.drawee.controller.a
import com.facebook.drawee.drawable.ScalingUtils.ScaleType
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder
import com.facebook.drawee.span.DraweeSpanStringBuilder
import com.facebook.imagepipeline.common.ResizeOptions
import com.facebook.imagepipeline.request.ImageRequestBuilder
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel
import g6.c
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

public fun renderEmoji(
   emoji: RenderableEmoji,
   context: Context,
   sizePx: Int,
   allowAnimation: Boolean,
   verticalAlignment: Int = 2,
   additionalBuilderActions: (GenericDraweeHierarchyBuilder) -> Unit = <unrepresentable>.INSTANCE
): DraweeSpanStringBuilder {
   q.h(var0, "emoji");
   q.h(var1, "context");
   q.h(var5, "additionalBuilderActions");
   val var6: DraweeSpanStringBuilder = new DraweeSpanStringBuilder();
   renderEmojiInto(var6, var0, var1, var2, var3, var4, var5);
   return var6;
}

@JvmSynthetic
fun `renderEmoji$default`(var0: RenderableEmoji, var1: Context, var2: Int, var3: Boolean, var4: Int, var5: Function1, var6: Int, var7: Any): DraweeSpanStringBuilder {
   if ((var6 and 16) != 0) {
      var4 = 2;
   }

   if ((var6 and 32) != 0) {
      var5 = <unrepresentable>.INSTANCE;
   }

   return renderEmoji(var0, var1, var2, var3, var4, (Function1)var5);
}

public fun renderEmojiInto(
   builder: DraweeSpanStringBuilder,
   emoji: RenderableEmoji,
   context: Context,
   sizePx: Int,
   allowAnimation: Boolean,
   verticalAlignment: Int = 2,
   additionalBuilderActions: (GenericDraweeHierarchyBuilder) -> Unit = <unrepresentable>.INSTANCE
) {
   q.h(var0, "builder");
   q.h(var1, "emoji");
   q.h(var2, "context");
   q.h(var6, "additionalBuilderActions");
   val var9: RenderableEmoji.Unicode;
   if (var1 is RenderableEmoji.Unicode) {
      var9 = var1 as RenderableEmoji.Unicode;
   } else {
      var9 = null;
   }

   var var8: SpannableStringBuilder = null;
   if (var9 != null) {
      val var11: java.lang.String = var9.getException();
      var8 = null;
      if (var11 != null) {
         var8 = var0.append(var11);
      }
   }

   if (var8 == null) {
      renderEmojiInto(var0, var1.getUrl(var4, var3), var1.getContentDescription(), var2, var3, var4, var5, var6);
   }
}

private fun renderEmojiInto(
   builder: DraweeSpanStringBuilder,
   src: String,
   contentDescription: String,
   context: Context,
   sizePx: Int,
   allowAnimation: Boolean,
   verticalAlignment: Int = 2,
   additionalBuilderActions: (GenericDraweeHierarchyBuilder) -> Unit = <unrepresentable>.INSTANCE
) {
   val var8: Int = var0.length();
   var0.append('\u200b');
   val var10: a = (((c.g().B(var5) as PipelineDraweeControllerBuilder)
            .F(ImageRequestBuilder.w(Uri.parse(var1)).L(new ResizeOptions(var4, var4, 0.0F, 0.0F, 12, null)).G(RequestLevel.k).a()) as PipelineDraweeControllerBuilder)
         .D(var2) as PipelineDraweeControllerBuilder)
      .d();
   val var11: GenericDraweeHierarchyBuilder = GenericDraweeHierarchyBuilder.u(var3.getResources()).w(ScaleType.e);
   var7.invoke(var11);
   var0.j(var3, var11.a(), var10, var8, var4, var4, false, var6);
}

@JvmSynthetic
fun `renderEmojiInto$default`(
   var0: DraweeSpanStringBuilder, var1: RenderableEmoji, var2: Context, var3: Int, var4: Boolean, var5: Int, var6: Function1, var7: Int, var8: Any
) {
   if ((var7 and 32) != 0) {
      var5 = 2;
   }

   if ((var7 and 64) != 0) {
      var6 = <unrepresentable>.INSTANCE;
   }

   renderEmojiInto(var0, var1, var2, var3, var4, var5, (Function1)var6);
}

@JvmSynthetic
fun `renderEmojiInto$default`(
   var0: DraweeSpanStringBuilder,
   var1: java.lang.String,
   var2: java.lang.String,
   var3: Context,
   var4: Int,
   var5: Boolean,
   var6: Int,
   var7: Function1,
   var8: Int,
   var9: Any
) {
   if ((var8 and 64) != 0) {
      var6 = 2;
   }

   if ((var8 and 128) != 0) {
      var7 = <unrepresentable>.INSTANCE;
   }

   renderEmojiInto(var0, var1, var2, var3, var4, var5, var6, (Function1)var7);
}
