package com.discord.bundle_updater

import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.WritableNativeMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import qn.b2
import qn.g0
import vj.w

@f
public data class BuildOverrideCookieBuild(type: String, id: String) {
   public final val id: String
   public final val type: String

   init {
      q.h(var1, "type");
      q.h(var2, "id");
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
      q.h(var1, "type");
      q.h(var2, "id");
      return new BuildOverrideCookieBuild(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BuildOverrideCookieBuild) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.type, var1.type)) {
            return false;
         } else {
            return q.c(this.id, var1.id);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.type.hashCode() * 31 + this.id.hashCode();
   }

   public fun toNativeMap(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(new Pair[]{w.a("type", this.type), w.a("id", this.id)});
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.type;
      val var1: java.lang.String = this.id;
      val var2: StringBuilder = new StringBuilder();
      var2.append("BuildOverrideCookieBuild(type=");
      var2.append(var3);
      var2.append(", id=");
      var2.append(var1);
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
         val var0: BuildOverrideCookieBuild.$serializer = new BuildOverrideCookieBuild.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.bundle_updater.BuildOverrideCookieBuild", var0, 2);
         var1.c("type", false);
         var1.c("id", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): BuildOverrideCookieBuild {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: kotlinx.serialization.encoding.c = var1.b(var6);
         var var2: Int;
         var var5: java.lang.String;
         var var8: java.lang.String;
         if (var7.p()) {
            var8 = var7.m(var6, 0);
            var5 = var7.m(var6, 1);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.m(var6, 1);
                     var2 |= 2;
                  } else {
                     var8 = var7.m(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new BuildOverrideCookieBuild(var2, var8, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: BuildOverrideCookieBuild) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         BuildOverrideCookieBuild.write$Self$bundle_updater_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BuildOverrideCookieBuild> {
         return BuildOverrideCookieBuild.$serializer.INSTANCE;
      }
   }
}
