package com.discord.bundle_updater

import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.WritableNativeMap
import eh.w
import kotlin.jvm.internal.r
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

@f
public data class AppManifestMetadata(build: String, releaseName: String? = null, commit: String, confirmUpdate: Boolean = false) {
   public final val build: String
   public final val commit: String
   public final val confirmUpdate: Boolean
   public final val releaseName: String?

   init {
      r.h(var1, "build");
      r.h(var3, "commit");
      super();
      this.build = var1;
      this.releaseName = var2;
      this.commit = var3;
      this.confirmUpdate = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: AppManifestMetadata, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.build);
      var var3: Boolean;
      if (!var1.A(var2, 1) && var0.releaseName == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, a2.a, var0.releaseName);
      }

      label24: {
         var1.z(var2, 2, var0.commit);
         if (!var1.A(var2, 3)) {
            var3 = false;
            if (!var0.confirmUpdate) {
               break label24;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.x(var2, 3, var0.confirmUpdate);
      }
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
      r.h(var1, "build");
      r.h(var3, "commit");
      return new AppManifestMetadata(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AppManifestMetadata) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.build, var1.build)) {
            return false;
         } else if (!r.c(this.releaseName, var1.releaseName)) {
            return false;
         } else if (!r.c(this.commit, var1.commit)) {
            return false;
         } else {
            return this.confirmUpdate == var1.confirmUpdate;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.build.hashCode();
      val var1: Int;
      if (this.releaseName == null) {
         var1 = 0;
      } else {
         var1 = this.releaseName.hashCode();
      }

      val var5: Int = this.commit.hashCode();
      var var2: Byte = this.confirmUpdate;
      if (this.confirmUpdate != 0) {
         var2 = 1;
      }

      return ((var4 * 31 + var1) * 31 + var5) * 31 + var2;
   }

   public fun toNativeMap(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(
         new Pair[]{w.a("build", this.build), w.a("release_name", this.releaseName), w.a("commit", this.commit), w.a("confirm_update", this.confirmUpdate)}
      );
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.build;
      val var4: java.lang.String = this.releaseName;
      val var2: java.lang.String = this.commit;
      val var1: Boolean = this.confirmUpdate;
      val var5: StringBuilder = new StringBuilder();
      var5.append("AppManifestMetadata(build=");
      var5.append(var3);
      var5.append(", releaseName=");
      var5.append(var4);
      var5.append(", commit=");
      var5.append(var2);
      var5.append(", confirmUpdate=");
      var5.append(var1);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : f0<AppManifestMetadata> {
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
         val var1: a2 = a2.a;
         return new KSerializer[]{a2.a, vk.a.u(a2.a), var1, h.a};
      }

      public open fun deserialize(decoder: Decoder): AppManifestMetadata {
         r.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: kotlinx.serialization.encoding.c = var1.b(var9);
         var var2: Int;
         var var5: Boolean;
         var var7: Any;
         val var8: Any;
         val var11: java.lang.String;
         if (var10.p()) {
            var11 = var10.m(var9, 0);
            var7 = var10.n(var9, 1, a2.a, null);
            val var6: java.lang.String = var10.m(var9, 2);
            var5 = var10.C(var9, 3);
            var2 = 15;
            var8 = var6;
         } else {
            var var3: Boolean = true;
            var5 = false;
            var7 = null;
            var var13: Any = null;
            var var12: Any = null;
            var2 = 0;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var5 = var10.C(var9, 3);
                           var2 |= 8;
                        } else {
                           var12 = var10.m(var9, 2);
                           var2 |= 4;
                        }
                     } else {
                        var13 = var10.n(var9, 1, a2.a, var13);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var10.m(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var8 = var12;
            var11 = (java.lang.String)var7;
            var7 = var13;
         }

         var10.c(var9);
         return new AppManifestMetadata(var2, var11, var7 as java.lang.String, (java.lang.String)var8, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: AppManifestMetadata) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         AppManifestMetadata.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<AppManifestMetadata> {
         return AppManifestMetadata.$serializer.INSTANCE;
      }
   }
}
