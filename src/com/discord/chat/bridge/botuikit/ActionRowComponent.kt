package com.discord.chat.bridge.botuikit

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import on.a
import qn.b2
import qn.g0
import qn.n0

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
      val var3: Int = Integer.hashCode(this.type);
      val var2: Int = this.id.hashCode();
      val var1: Int;
      if (this.errorText == null) {
         var1 = 0;
      } else {
         var1 = this.errorText.hashCode();
      }

      return ((var3 * 31 + var2) * 31 + var1) * 31 + this.components.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var2: java.lang.String = this.id;
      val var4: java.lang.String = this.errorText;
      val var3: java.util.List = this.components;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ActionRowComponent(type=");
      var5.append(var1);
      var5.append(", id=");
      var5.append(var2);
      var5.append(", errorText=");
      var5.append(var4);
      var5.append(", components=");
      var5.append(var3);
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
         val var0: ActionRowComponent.$serializer = new ActionRowComponent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("1", var0, 4);
         var1.c("type", false);
         var1.c("id", false);
         var1.c("errorText", true);
         var1.c("components", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, b2.a, a.u(b2.a), ActionRowComponent.access$get$childSerializers$cp()[3]};
      }

      public open fun deserialize(decoder: Decoder): ActionRowComponent {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         val var8: Array<KSerializer> = ActionRowComponent.access$get$childSerializers$cp();
         var var2: Int;
         var var3: Int;
         var var6: Any;
         var var7: java.lang.String;
         val var11: java.lang.String;
         if (var10.p()) {
            var3 = var10.i(var9, 0);
            var7 = var10.m(var9, 1);
            var11 = var10.n(var9, 2, b2.a, null) as java.lang.String;
            var6 = var10.y(var9, 3, var8[3], null) as java.util.List;
            var2 = 15;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var7 = null;
            var6 = null;
            var var12: Any = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var10.o(var9);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           if (var5 != 3) {
                              throw new n(var5);
                           }

                           var12 = var10.y(var9, 3, var8[3], var12) as java.util.List;
                           var2 |= 8;
                        } else {
                           var6 = var10.n(var9, 2, b2.a, var6) as java.lang.String;
                           var2 |= 4;
                        }
                     } else {
                        var7 = var10.m(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var3 = var10.i(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }

            var6 = var12;
            var11 = (java.lang.String)var6;
         }

         var10.c(var9);
         return new ActionRowComponent(var2, var3, var7, var11, (java.util.List)var6, null);
      }

      public open fun serialize(encoder: Encoder, value: ActionRowComponent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ActionRowComponent.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ActionRowComponent> {
         return ActionRowComponent.$serializer.INSTANCE;
      }
   }
}
