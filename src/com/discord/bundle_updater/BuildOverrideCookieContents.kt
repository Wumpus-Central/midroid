package com.discord.bundle_updater

import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.WritableNativeMap
import hh.r
import java.util.LinkedHashMap
import java.util.Map.Entry
import kotlin.jvm.internal.q

public data class BuildOverrideCookieContents(meta: BuildOverrideCookieMeta, builds: Map<String, BuildOverrideCookieBuild>) {
   public final val builds: Map<String, BuildOverrideCookieBuild>
   public final val meta: BuildOverrideCookieMeta

   init {
      q.h(var1, "meta");
      q.h(var2, "builds");
      super();
      this.meta = var1;
      this.builds = var2;
   }

   public operator fun component1(): BuildOverrideCookieMeta {
      return this.meta;
   }

   public operator fun component2(): Map<String, BuildOverrideCookieBuild> {
      return this.builds;
   }

   public fun copy(meta: BuildOverrideCookieMeta = var0.meta, builds: Map<String, BuildOverrideCookieBuild> = var0.builds): BuildOverrideCookieContents {
      q.h(var1, "meta");
      q.h(var2, "builds");
      return new BuildOverrideCookieContents(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BuildOverrideCookieContents) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.meta, var1.meta)) {
            return false;
         } else {
            return q.c(this.builds, var1.builds);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.meta.hashCode() * 31 + this.builds.hashCode();
   }

   public fun toNativeMap(): WritableNativeMap {
      val var2: java.util.Map = this.builds;
      val var1: LinkedHashMap = new LinkedHashMap(r.d(this.builds.size()));

      for (Entry var5 : var2.entrySet()) {
         var1.put(var5.getKey(), (var5.getValue() as BuildOverrideCookieBuild).toNativeMap());
      }

      val var4: WritableNativeMap = NativeMapExtensionsKt.toNativeMap(var1);
      NativeMapExtensionsKt.put(var4, "$meta", this.meta.toNativeMap());
      return var4;
   }

   public override fun toString(): String {
      val var2: BuildOverrideCookieMeta = this.meta;
      val var3: java.util.Map = this.builds;
      val var1: StringBuilder = new StringBuilder();
      var1.append("BuildOverrideCookieContents(meta=");
      var1.append(var2);
      var1.append(", builds=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }
}
