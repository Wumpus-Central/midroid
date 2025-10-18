@file:SourceDebugExtension(["SMAP\nRenderableEmoji.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderableEmoji.kt\ncom/discord/emoji/RenderableEmojiKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"])

package com.discord.emoji

import android.content.Context
import android.net.Uri
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder
import com.facebook.drawee.drawable.ScalingUtils.ScaleType
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder
import com.facebook.drawee.span.DraweeSpanStringBuilder
import com.facebook.imagepipeline.common.ResizeOptions
import com.facebook.imagepipeline.request.ImageRequestBuilder
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.SourceDebugExtension

@JvmSynthetic
fun a(var0: GenericDraweeHierarchyBuilder): Unit {
   return renderEmoji$lambda$2(var0);
}

@JvmSynthetic
fun b(var0: GenericDraweeHierarchyBuilder): Unit {
   return renderEmojiInto$lambda$0(var0);
}

@JvmSynthetic
fun c(var0: GenericDraweeHierarchyBuilder): Unit {
   return renderEmojiInto$lambda$4(var0);
}

public fun renderEmoji(
   emoji: RenderableEmoji,
   context: Context,
   sizePx: Int,
   allowAnimation: Boolean,
   verticalAlignment: Int = 2,
   additionalBuilderActions: (GenericDraweeHierarchyBuilder) -> Unit = new a()
): DraweeSpanStringBuilder {
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
      var5 = new a();
   }

   return renderEmoji(var0, var1, var2, var3, var4, (Function1<? super GenericDraweeHierarchyBuilder, Unit>)var5);
}

fun `renderEmoji$lambda$2`(var0: GenericDraweeHierarchyBuilder): Unit {
   return Unit.a;
}

public fun renderEmojiInto(
   builder: DraweeSpanStringBuilder,
   emoji: RenderableEmoji,
   context: Context,
   sizePx: Int,
   allowAnimation: Boolean,
   verticalAlignment: Int = 2,
   additionalBuilderActions: (GenericDraweeHierarchyBuilder) -> Unit = new b()
) {
   val var7: RenderableEmoji.Unicode;
   if (var1 is RenderableEmoji.Unicode) {
      var7 = var1 as RenderableEmoji.Unicode;
   } else {
      var7 = null;
   }

   if (var7 != null) {
      val var9: java.lang.String = var7.getException();
      if (var9 != null && var0.append(var9) != null) {
         return;
      }
   }

   renderEmojiInto(var0, var1.getUrl(var4, var3), var1.getContentDescription(), var2, var3, var4, var5, var6);
}

private fun renderEmojiInto(
   builder: DraweeSpanStringBuilder,
   src: String,
   contentDescription: String,
   context: Context,
   sizePx: Int,
   allowAnimation: Boolean,
   verticalAlignment: Int = 2,
   additionalBuilderActions: (GenericDraweeHierarchyBuilder) -> Unit = new c()
) {
   val var8: Int = var0.length();
   var0.append('\u200b');
   val var10: com.facebook.drawee.controller.a = (((G3.d.g().B(var5) as PipelineDraweeControllerBuilder)
            .F(ImageRequestBuilder.x(Uri.parse(var1)).N(new ResizeOptions(var4, var4, 0.0F, 0.0F, 12, null)).I(RequestLevel.e).a()) as PipelineDraweeControllerBuilder)
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
      var6 = new b();
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
      var7 = new c();
   }

   renderEmojiInto(var0, var1, var2, var3, var4, var5, var6, (Function1<? super GenericDraweeHierarchyBuilder, Unit>)var7);
}

fun `renderEmojiInto$lambda$0`(var0: GenericDraweeHierarchyBuilder): Unit {
   return Unit.a;
}

fun `renderEmojiInto$lambda$4`(var0: GenericDraweeHierarchyBuilder): Unit {
   return Unit.a;
}
