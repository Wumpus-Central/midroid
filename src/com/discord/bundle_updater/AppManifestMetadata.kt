package com.discord.bundle_updater

import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.WritableNativeMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import z9.s

@sb.f
public data class AppManifestMetadata(build: String, releaseName: String? = null, commit: String, confirmUpdate: Boolean = false) {
   public final val build: String
   public final val releaseName: String?
   public final val commit: String
   public final val confirmUpdate: Boolean

   init {
      q.h(var1, "build");
      q.h(var3, "commit");
      super();
      this.build = var1;
      this.releaseName = var2;
      this.commit = var3;
      this.confirmUpdate = var4;
   }

   public operator fun component1(): String {
      return this.build;
   }

   public operator fun component2(): String? {
      return this.releaseName;
   }

   public operator fun component3(): String {
      return this.commit;
   }

   public operator fun component4(): Boolean {
      return this.confirmUpdate;
   }

   public fun copy(
      build: String = var0.build,
      releaseName: String? = var0.releaseName,
      commit: String = var0.commit,
      confirmUpdate: Boolean = var0.confirmUpdate
   ): AppManifestMetadata {
      q.h(var1, "build");
      q.h(var3, "commit");
      return new AppManifestMetadata(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AppManifestMetadata) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.build, var1.build)) {
            return false;
         } else if (!q.c(this.releaseName, var1.releaseName)) {
            return false;
         } else if (!q.c(this.commit, var1.commit)) {
            return false;
         } else {
            return this.confirmUpdate == var1.confirmUpdate;
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.build.hashCode();
      val var1: Int;
      if (this.releaseName == null) {
         var1 = 0;
      } else {
         var1 = this.releaseName.hashCode();
      }

      return ((var2 * 31 + var1) * 31 + this.commit.hashCode()) * 31 + java.lang.Boolean.hashCode(this.confirmUpdate);
   }

   public fun toNativeMap(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(
         s.a("build", this.build), s.a("release_name", this.releaseName), s.a("commit", this.commit), s.a("confirm_update", this.confirmUpdate)
      );
   }

   public override fun toString(): String {
      val var5: java.lang.String = this.build;
      val var2: java.lang.String = this.releaseName;
      val var3: java.lang.String = this.commit;
      val var1: Boolean = this.confirmUpdate;
      val var4: StringBuilder = new StringBuilder();
      var4.append("AppManifestMetadata(build=");
      var4.append(var5);
      var4.append(", releaseName=");
      var4.append(var2);
      var4.append(", commit=");
      var4.append(var3);
      var4.append(", confirmUpdate=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<AppManifestMetadata> {
         return AppManifestMetadata.$serializer.INSTANCE;
      }
   }
}
