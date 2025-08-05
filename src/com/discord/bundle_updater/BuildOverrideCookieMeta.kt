package com.discord.bundle_updater

import A9.s
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableNativeArray
import com.facebook.react.bridge.WritableNativeMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import wb.E0
import wb.O
import wb.U

@tb.g
public data class BuildOverrideCookieMeta(expiresAt: String? = null,
   releaseChannel: String? = null,
   validForUserIds: List<String>? = null,
   allowedVersions: List<String>? = null,
   allowLoggedOut: Boolean? = null,
   experiments: Map<String, Int>? = null
) {
   public final val expiresAt: String?
   public final val releaseChannel: String?
   public final val validForUserIds: List<String>?
   public final val allowedVersions: List<String>?
   public final val allowLoggedOut: Boolean?
   public final val experiments: Map<String, Int>?

   @JvmStatic
   fun {
      val var0: E0 = E0.a;
      $childSerializers = new KSerializer[]{null, null, new wb.f(E0.a), new wb.f(var0), null, new U(var0, O.a)};
   }

   fun BuildOverrideCookieMeta() {
      this(null, null, null, null, null, null, 63, null);
   }

   init {
      this.expiresAt = var1;
      this.releaseChannel = var2;
      this.validForUserIds = var3;
      this.allowedVersions = var4;
      this.allowLoggedOut = var5;
      this.experiments = var6;
   }

   public operator fun component1(): String? {
      return this.expiresAt;
   }

   public operator fun component2(): String? {
      return this.releaseChannel;
   }

   public operator fun component3(): List<String>? {
      return this.validForUserIds;
   }

   public operator fun component4(): List<String>? {
      return this.allowedVersions;
   }

   public operator fun component5(): Boolean? {
      return this.allowLoggedOut;
   }

   public operator fun component6(): Map<String, Int>? {
      return this.experiments;
   }

   public fun copy(
      expiresAt: String? = var0.expiresAt,
      releaseChannel: String? = var0.releaseChannel,
      validForUserIds: List<String>? = var0.validForUserIds,
      allowedVersions: List<String>? = var0.allowedVersions,
      allowLoggedOut: Boolean? = var0.allowLoggedOut,
      experiments: Map<String, Int>? = var0.experiments
   ): BuildOverrideCookieMeta {
      return new BuildOverrideCookieMeta(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BuildOverrideCookieMeta) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.expiresAt, var1.expiresAt)) {
            return false;
         } else if (!r.c(this.releaseChannel, var1.releaseChannel)) {
            return false;
         } else if (!r.c(this.validForUserIds, var1.validForUserIds)) {
            return false;
         } else if (!r.c(this.allowedVersions, var1.allowedVersions)) {
            return false;
         } else if (!r.c(this.allowLoggedOut, var1.allowLoggedOut)) {
            return false;
         } else {
            return r.c(this.experiments, var1.experiments);
         }
      }
   }

   public override fun hashCode(): Int {
      var var6: Int = 0;
      val var1: Int;
      if (this.expiresAt == null) {
         var1 = 0;
      } else {
         var1 = this.expiresAt.hashCode();
      }

      val var2: Int;
      if (this.releaseChannel == null) {
         var2 = 0;
      } else {
         var2 = this.releaseChannel.hashCode();
      }

      val var3: Int;
      if (this.validForUserIds == null) {
         var3 = 0;
      } else {
         var3 = this.validForUserIds.hashCode();
      }

      val var4: Int;
      if (this.allowedVersions == null) {
         var4 = 0;
      } else {
         var4 = this.allowedVersions.hashCode();
      }

      val var5: Int;
      if (this.allowLoggedOut == null) {
         var5 = 0;
      } else {
         var5 = this.allowLoggedOut.hashCode();
      }

      if (this.experiments != null) {
         var6 = this.experiments.hashCode();
      }

      return ((((var1 * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6;
   }

   public fun toNativeMap(): WritableNativeMap {
      val var3: Pair = s.a("expiresAt", this.expiresAt);
      val var4: Pair = s.a("releaseChannel", this.releaseChannel);
      var var9: ReadableNativeArray;
      if (this.validForUserIds != null) {
         var9 = NativeArrayExtensionsKt.toNativeArray$default(this.validForUserIds, null, 1, null);
      } else {
         var9 = null;
      }

      val var5: Pair = s.a("validForUserIds", var9);
      if (this.allowedVersions != null) {
         var9 = NativeArrayExtensionsKt.toNativeArray$default(this.allowedVersions, null, 1, null);
      } else {
         var9 = null;
      }

      val var6: Pair = s.a("allowedVersions", var9);
      val var7: Pair = s.a("allowLoggedOut", this.allowLoggedOut);
      var var12: WritableNativeMap = null;
      if (this.experiments != null) {
         var12 = NativeMapExtensionsKt.toNativeMap(this.experiments);
      }

      return NativeMapExtensionsKt.nativeMapOf(var3, var4, var5, var6, var7, s.a("experiments", var12));
   }

   public override fun toString(): String {
      val var6: java.lang.String = this.expiresAt;
      val var7: java.lang.String = this.releaseChannel;
      val var4: java.util.List = this.validForUserIds;
      val var5: java.util.List = this.allowedVersions;
      val var1: java.lang.Boolean = this.allowLoggedOut;
      val var2: java.util.Map = this.experiments;
      val var3: StringBuilder = new StringBuilder();
      var3.append("BuildOverrideCookieMeta(expiresAt=");
      var3.append(var6);
      var3.append(", releaseChannel=");
      var3.append(var7);
      var3.append(", validForUserIds=");
      var3.append(var4);
      var3.append(", allowedVersions=");
      var3.append(var5);
      var3.append(", allowLoggedOut=");
      var3.append(var1);
      var3.append(", experiments=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<BuildOverrideCookieMeta> {
         return BuildOverrideCookieMeta.$serializer.INSTANCE;
      }
   }
}
