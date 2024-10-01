package com.discord.bundle_updater

import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.WritableNativeMap
import fl.f
import fl.n
import il.b2
import il.g0
import il.h
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nh.w

@f
public data class AppManifestMetadata(build: String, releaseName: String? = null, commit: String, confirmUpdate: Boolean = false) {
   public final val build: String
   public final val commit: String
   public final val confirmUpdate: Boolean
   public final val releaseName: String?

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
         w.a("build", this.build), w.a("release_name", this.releaseName), w.a("commit", this.commit), w.a("confirm_update", this.confirmUpdate)
      );
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.build;
      val var3: java.lang.String = this.releaseName;
      val var2: java.lang.String = this.commit;
      val var1: Boolean = this.confirmUpdate;
      val var5: StringBuilder = new StringBuilder();
      var5.append("AppManifestMetadata(build=");
      var5.append(var4);
      var5.append(", releaseName=");
      var5.append(var3);
      var5.append(", commit=");
      var5.append(var2);
      var5.append(", confirmUpdate=");
      var5.append(var1);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: AppManifestMetadata.$serializer = new AppManifestMetadata.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.bundle_updater.AppManifestMetadata", var0, 4);
         var1.l("build", false);
         var1.l("release_name", true);
         var1.l("commit", false);
         var1.l("confirm_update", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: b2 = b2.a;
         return new KSerializer[]{b2.a, gl.a.u(b2.a), var1, h.a};
      }

      public open fun deserialize(decoder: Decoder): AppManifestMetadata {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: kotlinx.serialization.encoding.c = var1.c(var9);
         var var2: Int;
         var var5: Boolean;
         var var7: java.lang.String;
         var var11: java.lang.String;
         var var12: java.lang.String;
         if (var10.y()) {
            var12 = var10.t(var9, 0);
            val var8: java.lang.String = var10.v(var9, 1, b2.a, null) as java.lang.String;
            var11 = var10.t(var9, 2);
            var5 = var10.s(var9, 3);
            var2 = 15;
            var7 = var12;
            var12 = var8;
         } else {
            var var3: Boolean = true;
            var5 = false;
            var7 = null;
            var12 = null;
            var11 = null;
            var2 = 0;

            while (var3) {
               val var4: Int = var10.x(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var5 = var10.s(var9, 3);
                           var2 |= 8;
                        } else {
                           var11 = var10.t(var9, 2);
                           var2 |= 4;
                        }
                     } else {
                        var12 = var10.v(var9, 1, b2.a, var12) as java.lang.String;
                        var2 |= 2;
                     }
                  } else {
                     var7 = var10.t(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var10.b(var9);
         return new AppManifestMetadata(var2, var7, var12, var11, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: AppManifestMetadata) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         AppManifestMetadata.write$Self$bundle_updater_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<AppManifestMetadata> {
         return AppManifestMetadata.$serializer.INSTANCE;
      }
   }
}
