package com.discord.bundle_updater

import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.WritableNativeMap
import java.util.LinkedHashMap
import java.util.Map.Entry
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nCookieValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieValidator.kt\ncom/discord/bundle_updater/BuildOverrideCookieContents\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n462#2:107\n412#2:108\n1246#3,4:109\n*S KotlinDebug\n*F\n+ 1 CookieValidator.kt\ncom/discord/bundle_updater/BuildOverrideCookieContents\n*L\n55#1:107\n55#1:108\n55#1:109,4\n*E\n"])
public data class BuildOverrideCookieContents(meta: BuildOverrideCookieMeta, builds: Map<String, BuildOverrideCookieBuild>) {
   public final val meta: BuildOverrideCookieMeta
   public final val builds: Map<String, BuildOverrideCookieBuild>

   init {
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
      return new BuildOverrideCookieContents(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BuildOverrideCookieContents) {
         return false;
      } else {
         var1 = var1;
         if (!(this.meta == var1.meta)) {
            return false;
         } else {
            return this.builds == var1.builds;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.meta.hashCode() * 31 + this.builds.hashCode();
   }

   public fun toNativeMap(): WritableNativeMap {
      val var2: java.util.Map = this.builds;
      val var1: LinkedHashMap = new LinkedHashMap(L.d(this.builds.size()));

      for (Entry var3 : var2.entrySet()) {
         var1.put(var3.getKey(), (var3.getValue() as BuildOverrideCookieBuild).toNativeMap());
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
