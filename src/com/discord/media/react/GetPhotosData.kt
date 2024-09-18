package com.discord.media.react

import com.discord.media.utils.ContentResolverMedia
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.WritableNativeMap
import dh.w
import java.util.ArrayList
import kotlin.jvm.internal.q

internal class GetPhotosData(edges: List<ContentResolverMedia>) {
   private final val edges: List<ContentResolverMedia>

   init {
      q.h(var1, "edges");
      super();
      this.edges = var1;
   }

   private fun ContentResolverMedia.toNativeMap(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(
         w.a("type", java.lang.String.valueOf(var1.getMediaType())),
         w.a(
            "image",
            NativeMapExtensionsKt.nativeMapOf(
               w.a("uri", java.lang.String.valueOf(var1.getUri())),
               w.a("mimeType", var1.getMimeType()),
               w.a("filename", var1.getName()),
               w.a("width", var1.getWidth()),
               w.a("height", var1.getHeight()),
               w.a("playableDuration", var1.getDuration())
            )
         )
      );
   }

   public fun toNativeMap(): WritableNativeMap {
      val var2: java.util.List = this.edges;
      val var1: ArrayList = new ArrayList(i.u(this.edges, 10));
      val var3: java.util.Iterator = var2.iterator();

      while (var3.hasNext()) {
         var1.add(NativeMapExtensionsKt.nativeMapOf(w.a("node", this.toNativeMap(var3.next() as ContentResolverMedia))));
      }

      return NativeMapExtensionsKt.nativeMapOf(w.a("edges", NativeArrayExtensionsKt.toNativeArray(var1)));
   }

   public companion object {
      public const val FAILED_TO_LOAD: String
   }
}
