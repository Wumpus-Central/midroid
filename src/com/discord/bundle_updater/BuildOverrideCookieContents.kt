package com.discord.bundle_updater

import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.WritableNativeMap
import fh.s
import java.util.LinkedHashMap
import java.util.Map.Entry
import kotlin.jvm.internal.r

public data class BuildOverrideCookieContents(meta: BuildOverrideCookieMeta, builds: Map<String, BuildOverrideCookieBuild>) {
   public final val builds: Map<String, BuildOverrideCookieBuild>
   public final val meta: BuildOverrideCookieMeta

   init {
      r.h(var1, "meta");
      r.h(var2, "builds");
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
      r.h(var1, "meta");
      r.h(var2, "builds");
      return new BuildOverrideCookieContents(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BuildOverrideCookieContents) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.meta, var1.meta)) {
            return false;
         } else {
            return r.c(this.builds, var1.builds);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.meta.hashCode() * 31 + this.builds.hashCode();
   }

   public fun toNativeMap(): WritableNativeMap {
      val var2: java.util.Map = this.builds;
      val var1: LinkedHashMap = new LinkedHashMap(s.d(this.builds.size()));

      for (Entry var3 : var2.entrySet()) {
         var1.put(var3.getKey(), (var3.getValue() as BuildOverrideCookieBuild).toNativeMap());
      }

      val var4: WritableNativeMap = NativeMapExtensionsKt.toNativeMap(var1);
      NativeMapExtensionsKt.put(var4, "$meta", this.meta.toNativeMap());
      return var4;
   }

   public override fun toString(): String {
      val var1: BuildOverrideCookieMeta = this.meta;
      val var2: java.util.Map = this.builds;
      val var3: StringBuilder = new StringBuilder();
      var3.append("BuildOverrideCookieContents(meta=");
      var3.append(var1);
      var3.append(", builds=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }
}
