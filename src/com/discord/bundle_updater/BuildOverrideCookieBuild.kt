package com.discord.bundle_updater

import A9.s
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.WritableNativeMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer

@tb.g
public data class BuildOverrideCookieBuild(type: String, id: String) {
   public final val type: String
   public final val id: String

   init {
      r.h(var1, "type");
      r.h(var2, "id");
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
      r.h(var1, "type");
      r.h(var2, "id");
      return new BuildOverrideCookieBuild(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BuildOverrideCookieBuild) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.type, var1.type)) {
            return false;
         } else {
            return r.c(this.id, var1.id);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.type.hashCode() * 31 + this.id.hashCode();
   }

   public fun toNativeMap(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(s.a("type", this.type), s.a("id", this.id));
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.type;
      val var2: java.lang.String = this.id;
      val var3: StringBuilder = new StringBuilder();
      var3.append("BuildOverrideCookieBuild(type=");
      var3.append(var1);
      var3.append(", id=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<BuildOverrideCookieBuild> {
         return BuildOverrideCookieBuild.$serializer.INSTANCE;
      }
   }
}
