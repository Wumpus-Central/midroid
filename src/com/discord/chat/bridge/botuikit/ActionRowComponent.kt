package com.discord.chat.bridge.botuikit

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.m0

@f
public data class ActionRowComponent(type: Int, id: String, errorText: String? = null, components: List<Component>) : BaseLayoutComponent {
   public final val components: List<Component>
   public open val errorText: String?
   public open val id: String
   public open val type: Int

   init {
      r.h(var2, "id");
      r.h(var4, "components");
      super(null);
      this.type = var1;
      this.id = var2;
      this.errorText = var3;
      this.components = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: ActionRowComponent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      val var4: Int = var0.getType();
      var var3: Boolean = false;
      var1.w(var2, 0, var4);
      var1.z(var2, 1, var0.getId());
      if (var1.A(var2, 2) || var0.getErrorText() != null) {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, a2.a, var0.getErrorText());
      }

      var1.y(var2, 3, new xk.f(ComponentSerializer.INSTANCE), var0.components);
   }

   public operator fun component1(): Int {
      return this.getType();
   }

   public operator fun component2(): String {
      return this.getId();
   }

   public operator fun component3(): String? {
      return this.getErrorText();
   }

   public operator fun component4(): List<Component> {
      return this.components;
   }

   public fun copy(
      type: Int = var0.getType(),
      id: String = var0.getId(),
      errorText: String? = var0.getErrorText(),
      components: List<Component> = var0.components
   ): ActionRowComponent {
      r.h(var2, "id");
      r.h(var4, "components");
      return new ActionRowComponent(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ActionRowComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.getType() != var1.getType()) {
            return false;
         } else if (!r.c(this.getId(), var1.getId())) {
            return false;
         } else if (!r.c(this.getErrorText(), var1.getErrorText())) {
            return false;
         } else {
            return r.c(this.components, var1.components);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = Integer.hashCode(this.getType());
      val var2: Int = this.getId().hashCode();
      val var1: Int;
      if (this.getErrorText() == null) {
         var1 = 0;
      } else {
         var1 = this.getErrorText().hashCode();
      }

      return ((var3 * 31 + var2) * 31 + var1) * 31 + this.components.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.getType();
      val var5: java.lang.String = this.getId();
      val var4: java.lang.String = this.getErrorText();
      val var3: java.util.List = this.components;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ActionRowComponent(type=");
      var2.append(var1);
      var2.append(", id=");
      var2.append(var5);
      var2.append(", errorText=");
      var2.append(var4);
      var2.append(", components=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<ActionRowComponent> {
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
         return new KSerializer[]{m0.a, a2.a, a.u(a2.a), new xk.f(ComponentSerializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): ActionRowComponent {
         r.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         var var2: Int;
         var var3: Int;
         var var7: Any;
         val var8: java.lang.String;
         var var12: Any;
         if (var11.p()) {
            var3 = var11.i(var10, 0);
            val var6: java.lang.String = var11.m(var10, 1);
            var12 = var11.n(var10, 2, a2.a, null);
            var7 = var11.y(var10, 3, new xk.f(ComponentSerializer.INSTANCE), null);
            var2 = 15;
            var8 = var6;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var7 = null;
            var var14: Any = null;
            var12 = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var11.o(var10);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           if (var5 != 3) {
                              throw new n(var5);
                           }

                           var12 = var11.y(var10, 3, new xk.f(ComponentSerializer.INSTANCE), var12);
                           var2 |= 8;
                        } else {
                           var14 = var11.n(var10, 2, a2.a, var14);
                           var2 |= 4;
                        }
                     } else {
                        var7 = var11.m(var10, 1);
                        var2 |= 2;
                     }
                  } else {
                     var3 = var11.i(var10, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }

            var8 = (java.lang.String)var7;
            var12 = var14;
            var7 = var12;
         }

         var11.c(var10);
         return new ActionRowComponent(var2, var3, var8, var12 as java.lang.String, var7 as java.util.List, null);
      }

      public open fun serialize(encoder: Encoder, value: ActionRowComponent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ActionRowComponent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ActionRowComponent> {
         return ActionRowComponent.$serializer.INSTANCE;
      }
   }
}
