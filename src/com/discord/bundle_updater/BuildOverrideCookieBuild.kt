package com.discord.bundle_updater

import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.WritableNativeMap
import ht.v
import kotlinx.serialization.KSerializer

@xu.m
public data class BuildOverrideCookieBuild(type: String, id: String) {
   public final val type: String
   public final val id: String

   init {
      super();
      this.type = var1;
      this.id = var2;
   }

   public operator fun component1(): String {
      return this.type;
   }

   public operator fun component2(): String {
      return this.id;
   }

   public fun copy(type: String = var0.type, id: String = var0.id): BuildOverrideCookieBuild {
      return new BuildOverrideCookieBuild(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BuildOverrideCookieBuild) {
         return false;
      } else {
         var1 = var1;
         if (!(this.type == var1.type)) {
            return false;
         } else {
            return this.id == var1.id;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.type.hashCode() * 31 + this.id.hashCode();
   }

   public fun toNativeMap(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(new Pair[]{v.a("type", this.type), v.a("id", this.id)});
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.type;
      val var3: java.lang.String = this.id;
      val var1: StringBuilder = new StringBuilder();
      var1.append("BuildOverrideCookieBuild(type=");
      var1.append(var2);
      var1.append(", id=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<BuildOverrideCookieBuild> {
         return BuildOverrideCookieBuild.$serializer.INSTANCE;
      }
   }
}
