package com.discord.chat.bridge.botuikit

import bl.b2
import bl.g0
import bl.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import yk.f
import yk.n
import zk.a

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
      val var4: java.util.List = this.components;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ActionRowComponent(type=");
      var5.append(var1);
      var5.append(", id=");
      var5.append(var3);
      var5.append(", errorText=");
      var5.append(var2);
      var5.append(", components=");
      var5.append(var4);
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
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         val var10: Array<KSerializer> = ActionRowComponent.access$get$childSerializers$cp();
         var var2: Int;
         var var3: Int;
         var var6: java.lang.String;
         var var7: java.lang.String;
         var var11: Any;
         if (var9.y()) {
            var3 = var9.k(var8, 0);
            var7 = var9.t(var8, 1);
            var6 = var9.v(var8, 2, b2.a, null) as java.lang.String;
            var11 = var9.m(var8, 3, var10[3], null) as java.util.List;
            var2 = 15;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var7 = null;
            var6 = null;
            var11 = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var9.x(var8);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           if (var5 != 3) {
                              throw new n(var5);
                           }

                           var11 = var9.m(var8, 3, var10[3], var11) as java.util.List;
                           var2 |= 8;
                        } else {
                           var6 = var9.v(var8, 2, b2.a, var6) as java.lang.String;
                           var2 |= 4;
                        }
                     } else {
                        var7 = var9.t(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var3 = var9.k(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }
         }

         var9.b(var8);
         return new ActionRowComponent(var2, var3, var7, var6, (java.util.List)var11, null);
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
         return bl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ActionRowComponent> {
         return ActionRowComponent.$serializer.INSTANCE;
      }
   }
}
