package com.discord.bundle_updater

import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableNativeArray
import com.facebook.react.bridge.WritableNativeMap
import eh.w
import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.a2
import xk.f0
import xk.h
import xk.m0
import xk.r0

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

   fun BuildOverrideCookieMeta() {
      this(null, null, null, null, null, null, 63, null);
   }

   init {
      super();
      this.expiresAt = var1;
      this.releaseChannel = var2;
      this.validForUserIds = var3;
      this.allowedVersions = var4;
      this.allowLoggedOut = var5;
      this.experiments = var6;
   }

   @JvmStatic
   public fun `write$Self`(self: BuildOverrideCookieMeta, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.expiresAt == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 0, a2.a, var0.expiresAt);
      }

      if (!var1.A(var2, 1) && var0.releaseChannel == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, a2.a, var0.releaseChannel);
      }

      if (!var1.A(var2, 2) && var0.validForUserIds == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, new xk.f(a2.a), var0.validForUserIds);
      }

      if (!var1.A(var2, 3) && var0.allowedVersions == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, new xk.f(a2.a), var0.allowedVersions);
      }

      if (!var1.A(var2, 4) && var0.allowLoggedOut == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, h.a, var0.allowLoggedOut);
      }

      label56: {
         if (!var1.A(var2, 5)) {
            var3 = false;
            if (var0.experiments == null) {
               break label56;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 5, new r0(a2.a, m0.a), var0.experiments);
      }
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
      val var4: Pair = w.a("expiresAt", this.expiresAt);
      val var3: Pair = w.a("releaseChannel", this.releaseChannel);
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

      return NativeMapExtensionsKt.nativeMapOf(new Pair[]{var4, var3, var5, var7, var6, w.a("experiments", var12)});
   }

   public override fun toString(): String {
      val var6: java.lang.String = this.expiresAt;
      val var7: java.lang.String = this.releaseChannel;
      val var5: java.util.List = this.validForUserIds;
      val var4: java.util.List = this.allowedVersions;
      val var3: java.lang.Boolean = this.allowLoggedOut;
      val var1: java.util.Map = this.experiments;
      val var2: StringBuilder = new StringBuilder();
      var2.append("BuildOverrideCookieMeta(expiresAt=");
      var2.append(var6);
      var2.append(", releaseChannel=");
      var2.append(var7);
      var2.append(", validForUserIds=");
      var2.append(var5);
      var2.append(", allowedVersions=");
      var2.append(var4);
      var2.append(", allowLoggedOut=");
      var2.append(var3);
      var2.append(", experiments=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<BuildOverrideCookieMeta> {
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
         val var1: a2 = a2.a;
         return new KSerializer[]{vk.a.u(a2.a), vk.a.u(var1), vk.a.u(new xk.f(var1)), vk.a.u(new xk.f(var1)), vk.a.u(h.a), vk.a.u(new r0(var1, m0.a))};
      }

      public open fun deserialize(decoder: Decoder): BuildOverrideCookieMeta {
         r.h(var1, "decoder");
         val var14: SerialDescriptor = this.getDescriptor();
         val var15: kotlinx.serialization.encoding.c = var1.b(var14);
         val var7: Boolean = var15.p();
         var var12: Any = null;
         var var9: Any;
         var var11: Any;
         val var13: Any;
         var var16: Any;
         var var18: Int;
         var var22: Any;
         if (var7) {
            var22 = a2.a;
            var12 = var15.n(var14, 0, a2.a, null);
            var16 = var15.n(var14, 1, (DeserializationStrategy)var22, null);
            var11 = var15.n(var14, 2, new xk.f((KSerializer)var22), null);
            val var10: Any = var15.n(var14, 3, new xk.f((KSerializer)var22), null);
            var9 = var15.n(var14, 4, h.a, null);
            var22 = var15.n(var14, 5, new r0((KSerializer)var22, m0.a), null);
            var18 = 63;
            var13 = var10;
         } else {
            var var4: Boolean = true;
            var var3: Int = 0;
            var11 = null;
            var var23: Any = null;
            var16 = null;
            var9 = null;
            var22 = null;

            while (var4) {
               val var5: Int = var15.o(var14);
               switch (var5) {
                  case -1:
                     var4 = false;
                     continue;
                  case 0:
                     var12 = var15.n(var14, 0, a2.a, var12);
                     var3 |= 1;
                     continue;
                  case 1:
                     var11 = var15.n(var14, 1, a2.a, var11);
                     var3 |= 2;
                     continue;
                  case 2:
                     var23 = var15.n(var14, 2, new xk.f(a2.a), var23);
                     var18 = var3 or 4;
                     break;
                  case 3:
                     var16 = var15.n(var14, 3, new xk.f(a2.a), var16);
                     var18 = var3 or 8;
                     break;
                  case 4:
                     var9 = var15.n(var14, 4, h.a, var9);
                     var18 = var3 or 16;
                     break;
                  case 5:
                     var22 = var15.n(var14, 5, new r0(a2.a, m0.a), var22);
                     var18 = var3 or 32;
                     break;
                  default:
                     throw new n(var5);
               }

               var3 = var18;
            }

            var18 = var3;
            var13 = var16;
            var16 = var11;
            var11 = var23;
         }

         var15.c(var14);
         return new BuildOverrideCookieMeta(
            var18,
            var12 as java.lang.String,
            var16 as java.lang.String,
            var11 as java.util.List,
            var13 as java.util.List,
            var9 as java.lang.Boolean,
            var22 as java.util.Map,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: BuildOverrideCookieMeta) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         BuildOverrideCookieMeta.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BuildOverrideCookieMeta> {
         return BuildOverrideCookieMeta.$serializer.INSTANCE;
      }
   }
}
