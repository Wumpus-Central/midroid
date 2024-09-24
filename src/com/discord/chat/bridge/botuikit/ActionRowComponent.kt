package com.discord.chat.bridge.botuikit

import cl.f
import cl.n
import dl.a
import fl.b2
import fl.g0
import fl.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class ActionRowComponent(type: Int, id: String, errorText: String? = null, components: List<Component>) : BaseLayoutComponent {
   public final val components: List<Component>
   public open val errorText: String?
   public open val id: String
   public open val type: Int

   init {
      q.h(var2, "id");
      q.h(var4, "components");
      super(null);
      this.type = var1;
      this.id = var2;
      this.errorText = var3;
      this.components = var4;
   }

   public operator fun component1(): Int {
      return this.type;
   }

   public operator fun component2(): String {
      return this.id;
   }

   public operator fun component3(): String? {
      return this.errorText;
   }

   public operator fun component4(): List<Component> {
      return this.components;
   }

   public fun copy(type: Int = var0.type, id: String = var0.id, errorText: String? = var0.errorText, components: List<Component> = var0.components): ActionRowComponent {
      q.h(var2, "id");
      q.h(var4, "components");
      return new ActionRowComponent(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ActionRowComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (!q.c(this.id, var1.id)) {
            return false;
         } else if (!q.c(this.errorText, var1.errorText)) {
            return false;
         } else {
            return q.c(this.components, var1.components);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = Integer.hashCode(this.type);
      val var3: Int = this.id.hashCode();
      val var1: Int;
      if (this.errorText == null) {
         var1 = 0;
      } else {
         var1 = this.errorText.hashCode();
      }

      return ((var2 * 31 + var3) * 31 + var1) * 31 + this.components.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var3: java.lang.String = this.id;
      val var2: java.lang.String = this.errorText;
      val var5: java.util.List = this.components;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ActionRowComponent(type=");
      var4.append(var1);
      var4.append(", id=");
      var4.append(var3);
      var4.append(", errorText=");
      var4.append(var2);
      var4.append(", components=");
      var4.append(var5);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ActionRowComponent.$serializer = new ActionRowComponent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("1", var0, 4);
         var1.l("type", false);
         var1.l("id", false);
         var1.l("errorText", true);
         var1.l("components", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, b2.a, a.u(b2.a), ActionRowComponent.access$get$childSerializers$cp()[3]};
      }

      public open fun deserialize(decoder: Decoder): ActionRowComponent {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.c(var9);
         var var8: Array<KSerializer> = ActionRowComponent.access$get$childSerializers$cp();
         var var3: Int;
         val var4: Int;
         var var7: java.lang.String;
         val var11: java.lang.String;
         if (var10.y()) {
            val var2: Int = var10.k(var9, 0);
            var7 = var10.t(var9, 1);
            var11 = var10.v(var9, 2, b2.a, null) as java.lang.String;
            var8 = var10.m(var9, 3, var8[3], null) as java.util.List;
            var3 = 15;
            var4 = var2;
         } else {
            var var15: Boolean = true;
            var3 = 0;
            var7 = null;
            var var6: java.lang.String = null;
            var var12: Any = null;
            var var13: Int = 0;

            while (var15) {
               val var5: Int = var10.x(var9);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           if (var5 != 3) {
                              throw new n(var5);
                           }

                           var12 = var10.m(var9, 3, var8[3], var12) as java.util.List;
                           var13 |= 8;
                        } else {
                           var6 = var10.v(var9, 2, b2.a, var6) as java.lang.String;
                           var13 |= 4;
                        }
                     } else {
                        var7 = var10.t(var9, 1);
                        var13 |= 2;
                     }
                  } else {
                     var3 = var10.k(var9, 0);
                     var13 |= 1;
                  }
               } else {
                  var15 = false;
               }
            }

            var8 = (KSerializer[])var12;
            var11 = var6;
            var4 = var3;
            var3 = var13;
         }

         var10.b(var9);
         return new ActionRowComponent(var3, var4, var7, var11, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: ActionRowComponent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ActionRowComponent.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ActionRowComponent> {
         return ActionRowComponent.$serializer.INSTANCE;
      }
   }
}
