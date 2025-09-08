package com.discord.media.react

import A9.s
import com.discord.media.utils.ContentResolverMedia
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.WritableNativeMap
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nGetPhotosData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetPhotosData.kt\ncom/discord/media/react/GetPhotosData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n1557#2:38\n1628#2,3:39\n*S KotlinDebug\n*F\n+ 1 GetPhotosData.kt\ncom/discord/media/react/GetPhotosData\n*L\n13#1:38\n13#1:39,3\n*E\n"])
internal class GetPhotosData(edges: List<ContentResolverMedia>) {
   private final val edges: List<ContentResolverMedia>

   init {
      this.edges = var1;
   }

   private fun ContentResolverMedia.toNativeMap(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(
         s.a("type", java.lang.String.valueOf(var1.getMediaType())),
         s.a(
            "image",
            NativeMapExtensionsKt.nativeMapOf(
               s.a("uri", java.lang.String.valueOf(var1.getUri())),
               s.a("mimeType", var1.getMimeType()),
               s.a("filename", var1.getName()),
               s.a("width", var1.getWidth()),
               s.a("height", var1.getHeight()),
               s.a("playableDuration", var1.getDuration())
            )
         )
      );
   }

   public fun toNativeMap(): WritableNativeMap {
      val var2: java.util.List = this.edges;
      val var1: ArrayList = new ArrayList(CollectionsKt.v(this.edges, 10));
      val var3: java.util.Iterator = var2.iterator();

      while (var3.hasNext()) {
         var1.add(NativeMapExtensionsKt.nativeMapOf(s.a("node", this.toNativeMap(var3.next() as ContentResolverMedia))));
      }

      return NativeMapExtensionsKt.nativeMapOf(s.a("edges", NativeArrayExtensionsKt.toNativeArray$default(var1, null, 1, null)));
   }

   public companion object {
      public const val FAILED_TO_LOAD: String
   }
}
