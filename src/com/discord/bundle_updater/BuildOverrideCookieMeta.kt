package com.discord.bundle_updater

import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableNativeArray
import com.facebook.react.bridge.WritableNativeMap
import dn.f
import dn.n
import gn.b2
import gn.g0
import gn.h
import gn.n0
import gn.s0
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import lj.w

@f
public data class BuildOverrideCookieMeta(expiresAt: String? = null,
   releaseChannel: String? = null,
   validForUserIds: List<String>? = null,
   allowedVersions: List<String>? = null,
   allowLoggedOut: Boolean? = null,
   experiments: Map<String, Int>? = null
) {
   public final val allowLoggedOut: Boolean?
   public final val allowedVersions: List<String>?
   public final val experiments: Map<String, Int>?
   public final val expiresAt: String?
   public final val releaseChannel: String?
   public final val validForUserIds: List<String>?

   @JvmStatic
   fun {
      val var0: b2 = b2.a;
      $childSerializers = new KSerializer[]{null, null, new gn.f(b2.a), new gn.f(var0), null, new s0(var0, n0.a)};
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
         if (!q.c(this.expiresAt, var1.expiresAt)) {
            return false;
         } else if (!q.c(this.releaseChannel, var1.releaseChannel)) {
            return false;
         } else if (!q.c(this.validForUserIds, var1.validForUserIds)) {
            return false;
         } else if (!q.c(this.allowedVersions, var1.allowedVersions)) {
            return false;
         } else if (!q.c(this.allowLoggedOut, var1.allowLoggedOut)) {
            return false;
         } else {
            return q.c(this.experiments, var1.experiments);
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
      val var3: Pair = w.a("expiresAt", this.expiresAt);
      val var4: Pair = w.a("releaseChannel", this.releaseChannel);
      var var9: ReadableNativeArray;
      if (this.validForUserIds != null) {
         var9 = NativeArrayExtensionsKt.toNativeArray(this.validForUserIds);
      } else {
         var9 = null;
      }

      val var5: Pair = w.a("validForUserIds", var9);
      if (this.allowedVersions != null) {
         var9 = NativeArrayExtensionsKt.toNativeArray(this.allowedVersions);
      } else {
         var9 = null;
      }

      val var7: Pair = w.a("allowedVersions", var9);
      val var6: Pair = w.a("allowLoggedOut", this.allowLoggedOut);
      var var12: WritableNativeMap = null;
      if (this.experiments != null) {
         var12 = NativeMapExtensionsKt.toNativeMap(this.experiments);
      }

      return NativeMapExtensionsKt.nativeMapOf(new Pair[]{var3, var4, var5, var7, var6, w.a("experiments", var12)});
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.expiresAt;
      val var3: java.lang.String = this.releaseChannel;
      val var4: java.util.List = this.validForUserIds;
      val var6: java.util.List = this.allowedVersions;
      val var7: java.lang.Boolean = this.allowLoggedOut;
      val var5: java.util.Map = this.experiments;
      val var2: StringBuilder = new StringBuilder();
      var2.append("BuildOverrideCookieMeta(expiresAt=");
      var2.append(var1);
      var2.append(", releaseChannel=");
      var2.append(var3);
      var2.append(", validForUserIds=");
      var2.append(var4);
      var2.append(", allowedVersions=");
      var2.append(var6);
      var2.append(", allowLoggedOut=");
      var2.append(var7);
      var2.append(", experiments=");
      var2.append(var5);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: BuildOverrideCookieMeta.$serializer = new BuildOverrideCookieMeta.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.bundle_updater.BuildOverrideCookieMeta", var0, 6);
         var1.l("expiresAt", true);
         var1.l("releaseChannel", true);
         var1.l("validForUserIds", true);
         var1.l("allowedVersions", true);
         var1.l("allowLoggedOut", true);
         var1.l("experiments", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: Array<KSerializer> = BuildOverrideCookieMeta.access$get$childSerializers$cp();
         val var1: b2 = b2.a;
         return new KSerializer[]{en.a.u(b2.a), en.a.u(var1), en.a.u(var2[2]), en.a.u(var2[3]), en.a.u(h.a), en.a.u(var2[5])};
      }

      public open fun deserialize(decoder: Decoder): BuildOverrideCookieMeta {
         q.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: kotlinx.serialization.encoding.c = var1.b(var12);
         val var11: Array<KSerializer> = BuildOverrideCookieMeta.access$get$childSerializers$cp();
         val var5: Boolean = var13.p();
         var var10: java.lang.String = null;
         var var2: Int;
         var var6: java.util.List;
         var var7: Any;
         var var8: java.util.List;
         var var9: java.lang.String;
         var var16: Any;
         if (var5) {
            var16 = b2.a;
            var10 = var13.n(var12, 0, b2.a, null) as java.lang.String;
            var9 = var13.n(var12, 1, (DeserializationStrategy)var16, null) as java.lang.String;
            var8 = var13.n(var12, 2, var11[2], null) as java.util.List;
            var6 = var13.n(var12, 3, var11[3], null) as java.util.List;
            var16 = var13.n(var12, 4, h.a, null) as java.lang.Boolean;
            val var19: java.util.Map = var13.n(var12, 5, var11[5], null) as java.util.Map;
            var2 = 63;
            var7 = var16;
            var16 = var19;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var9 = null;
            var8 = null;
            var7 = null;
            var6 = null;
            var16 = null;

            while (var3) {
               val var4: Int = var13.o(var12);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var10 = var13.n(var12, 0, b2.a, var10) as java.lang.String;
                     var2 |= 1;
                     break;
                  case 1:
                     var9 = var13.n(var12, 1, b2.a, var9) as java.lang.String;
                     var2 |= 2;
                     break;
                  case 2:
                     var8 = var13.n(var12, 2, var11[2], var8) as java.util.List;
                     var2 |= 4;
                     break;
                  case 3:
                     var7 = var13.n(var12, 3, var11[3], var7) as java.util.List;
                     var2 |= 8;
                     break;
                  case 4:
                     var6 = var13.n(var12, 4, h.a, var6) as java.lang.Boolean;
                     var2 |= 16;
                     break;
                  case 5:
                     var16 = var13.n(var12, 5, var11[5], var16) as java.util.Map;
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var7 = var6;
            var6 = (java.util.List)var7;
         }

         var13.c(var12);
         return new BuildOverrideCookieMeta(var2, var10, var9, var8, var6, (java.lang.Boolean)var7, (java.util.Map)var16, null);
      }

      public open fun serialize(encoder: Encoder, value: BuildOverrideCookieMeta) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         BuildOverrideCookieMeta.write$Self$bundle_updater_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BuildOverrideCookieMeta> {
         return BuildOverrideCookieMeta.$serializer.INSTANCE;
      }
   }
}
