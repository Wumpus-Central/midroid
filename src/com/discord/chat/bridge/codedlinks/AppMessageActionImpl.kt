package com.discord.chat.bridge.codedlinks

import ea.f
import ea.n
import fa.a
import ha.C0
import ha.G
import ha.h
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class AppMessageActionImpl(id: String, label: String, disabled: Boolean? = null) : AppMessageEmbedAction {
   public open val disabled: Boolean?
   public open val id: String
   public open val label: String

   init {
      q.h(var1, "id");
      q.h(var2, "label");
      super();
      this.id = var1;
      this.label = var2;
      this.disabled = var3;
   }

   public operator fun component1(): String {
      return this.id;
   }

   public operator fun component2(): String {
      return this.label;
   }

   public operator fun component3(): Boolean? {
      return this.disabled;
   }

   public fun copy(id: String = var0.id, label: String = var0.label, disabled: Boolean? = var0.disabled): AppMessageActionImpl {
      q.h(var1, "id");
      q.h(var2, "label");
      return new AppMessageActionImpl(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AppMessageActionImpl) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.id, var1.id)) {
            return false;
         } else if (!q.c(this.label, var1.label)) {
            return false;
         } else {
            return q.c(this.disabled, var1.disabled);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.id.hashCode();
      val var2: Int = this.label.hashCode();
      val var1: Int;
      if (this.disabled == null) {
         var1 = 0;
      } else {
         var1 = this.disabled.hashCode();
      }

      return (var3 * 31 + var2) * 31 + var1;
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.id;
      val var1: java.lang.String = this.label;
      val var4: java.lang.Boolean = this.disabled;
      val var3: StringBuilder = new StringBuilder();
      var3.append("AppMessageActionImpl(id=");
      var3.append(var2);
      var3.append(", label=");
      var3.append(var1);
      var3.append(", disabled=");
      var3.append(var4);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: AppMessageActionImpl.$serializer = new AppMessageActionImpl.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.codedlinks.AppMessageActionImpl", var0, 3);
         var1.l("id", false);
         var1.l("label", false);
         var1.l("disabled", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{C0.a, C0.a, a.u(h.a)};
      }

      public open fun deserialize(decoder: Decoder): AppMessageActionImpl {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         val var5: Boolean = var9.y();
         var var7: java.lang.String = null;
         var var2: Int;
         var var6: java.lang.String;
         var var10: java.lang.Boolean;
         if (var5) {
            var7 = var9.t(var8, 0);
            var6 = var9.t(var8, 1);
            var10 = var9.v(var8, 2, h.a, null) as java.lang.Boolean;
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var6 = null;
            var10 = null;

            while (var3) {
               val var4: Int = var9.x(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var10 = var9.v(var8, 2, h.a, var10) as java.lang.Boolean;
                        var2 |= 4;
                     } else {
                        var6 = var9.t(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var9.t(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var9.b(var8);
         return new AppMessageActionImpl(var2, var7, var6, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: AppMessageActionImpl) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         AppMessageActionImpl.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return ha.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<AppMessageActionImpl> {
         return AppMessageActionImpl.$serializer.INSTANCE;
      }
   }
}
