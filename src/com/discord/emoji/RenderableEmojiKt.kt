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
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r
import l4.c

public fun renderEmoji(
   emoji: RenderableEmoji,
   context: Context,
   sizePx: Int,
   allowAnimation: Boolean,
   verticalAlignment: Int = 2,
   additionalBuilderActions: (GenericDraweeHierarchyBuilder) -> Unit = <unrepresentable>.INSTANCE
): DraweeSpanStringBuilder {
   r.h(var0, "emoji");
   r.h(var1, "context");
   r.h(var5, "additionalBuilderActions");
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

   return renderEmoji(var0, var1, var2, var3, var4, (Function1<? super GenericDraweeHierarchyBuilder, Unit>)var5);
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
   r.h(var0, "builder");
   r.h(var1, "emoji");
   r.h(var2, "context");
   r.h(var6, "additionalBuilderActions");
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
   val var11: a = (((c.g().z(var5) as PipelineDraweeControllerBuilder)
            .D(ImageRequestBuilder.s(Uri.parse(var1)).E(new ResizeOptions(var4, var4)).z(RequestLevel.k).a()) as PipelineDraweeControllerBuilder)
         .B(var2) as PipelineDraweeControllerBuilder)
      .c();
   val var10: GenericDraweeHierarchyBuilder = GenericDraweeHierarchyBuilder.u(var3.getResources()).w(ScaleType.e);
   var7.invoke(var10);
   var0.j(var3, var10.a(), var11, var8, var4, var4, false, var6);
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

   renderEmojiInto(var0, var1, var2, var3, var4, var5, (Function1<? super GenericDraweeHierarchyBuilder, Unit>)var6);
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

   renderEmojiInto(var0, var1, var2, var3, var4, var5, var6, (Function1<? super GenericDraweeHierarchyBuilder, Unit>)var7);
}
