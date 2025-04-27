package com.discord.chat.bridge.botuikit

import Y9.f
import Y9.n
import Z9.a
import ba.C0
import ba.G
import ba.N
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class SectionComponent(type: Int, id: String, errorText: String? = null, components: List<SectionChildComponent<*>>, accessory: SectionAccessory<*>)
   : BaseLayoutComponent {
   public final val accessory: SectionAccessory<*>
   public final val components: List<SectionChildComponent<*>>
   public open val errorText: String?
   public open val id: String
   public open val type: Int

   init {
      q.h(var2, "id");
      q.h(var4, "components");
      q.h(var5, "accessory");
      super(null);
      this.type = var1;
      this.id = var2;
      this.errorText = var3;
      this.components = var4;
      this.accessory = var5;
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

   public operator fun component4(): List<SectionChildComponent<*>> {
      return this.components;
   }

   public operator fun component5(): SectionAccessory<*> {
      return this.accessory;
   }

   public fun copy(
      type: Int = var0.type,
      id: String = var0.id,
      errorText: String? = var0.errorText,
      components: List<SectionChildComponent<*>> = var0.components,
      accessory: SectionAccessory<*> = var0.accessory
   ): SectionComponent {
      q.h(var2, "id");
      q.h(var4, "components");
      q.h(var5, "accessory");
      return new SectionComponent(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SectionComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (!q.c(this.id, var1.id)) {
            return false;
         } else if (!q.c(this.errorText, var1.errorText)) {
            return false;
         } else if (!q.c(this.components, var1.components)) {
            return false;
         } else {
            return q.c(this.accessory, var1.accessory);
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

      return (((var2 * 31 + var3) * 31 + var1) * 31 + this.components.hashCode()) * 31 + this.accessory.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var4: java.lang.String = this.id;
      val var6: java.lang.String = this.errorText;
      val var2: java.util.List = this.components;
      val var5: SectionAccessory = this.accessory;
      val var3: StringBuilder = new StringBuilder();
      var3.append("SectionComponent(type=");
      var3.append(var1);
      var3.append(", id=");
      var3.append(var4);
      var3.append(", errorText=");
      var3.append(var6);
      var3.append(", components=");
      var3.append(var2);
      var3.append(", accessory=");
      var3.append(var5);
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
         val var0: SectionComponent.$serializer = new SectionComponent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("9", var0, 5);
         var1.l("type", false);
         var1.l("id", false);
         var1.l("errorText", true);
         var1.l("components", false);
         var1.l("accessory", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{N.a, C0.a, a.u(C0.a), SectionComponent.access$get$childSerializers$cp()[3], SectionAccessory.Serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): SectionComponent {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.c(var9);
         val var11: Array<KSerializer> = SectionComponent.access$get$childSerializers$cp();
         var var2: Int;
         var var3: Int;
         var var6: Any;
         var var7: java.lang.String;
         var var8: java.lang.String;
         var var12: Any;
         if (var10.y()) {
            var2 = var10.k(var9, 0);
            var8 = var10.t(var9, 1);
            var7 = var10.v(var9, 2, C0.a, null) as java.lang.String;
            var6 = var10.m(var9, 3, var11[3], null) as java.util.List;
            var12 = var10.m(var9, 4, SectionAccessory.Serializer.INSTANCE, null) as SectionAccessory;
            var3 = 31;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var8 = null;
            var7 = null;
            var6 = null;
            var12 = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var10.x(var9);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           if (var5 != 3) {
                              if (var5 != 4) {
                                 throw new n(var5);
                              }

                              var12 = var10.m(var9, 4, SectionAccessory.Serializer.INSTANCE, var12) as SectionAccessory;
                              var2 |= 16;
                           } else {
                              var6 = var10.m(var9, 3, var11[3], var6) as java.util.List;
                              var2 |= 8;
                           }
                        } else {
                           var7 = var10.v(var9, 2, C0.a, var7) as java.lang.String;
                           var2 |= 4;
                        }
                     } else {
                        var8 = var10.t(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var3 = var10.k(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }

            var3 = var2;
            var2 = var3;
         }

         var10.b(var9);
         return new SectionComponent(var3, var2, var8, var7, (java.util.List)var6, (SectionAccessory)var12, null);
      }

      public open fun serialize(encoder: Encoder, value: SectionComponent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         SectionComponent.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return ba.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<SectionComponent> {
         return SectionComponent.$serializer.INSTANCE;
      }
   }
}
