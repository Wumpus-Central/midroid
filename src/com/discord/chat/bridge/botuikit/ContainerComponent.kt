package com.discord.chat.bridge.botuikit

import com.discord.chat.bridge.spoiler.SpoilerableData
import ea.f
import ea.n
import fa.a
import ha.C0
import ha.G
import ha.N
import ha.h0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class ContainerComponent(type: Int,
      id: String,
      errorText: String? = null,
      components: List<Component>,
      accentColor: Int? = null,
      isSpoiler: Boolean,
      spoilerDescription: String?,
      themedBackgroundColor: Int? = null
   )
   : BaseLayoutComponent,
   SpoilerableData {
   public final val accentColor: Int?
   public final val components: List<Component>
   public open val errorText: String?
   public open val id: String
   public final val isSpoiler: Boolean
   public open val obscureOrNull: Nothing?
   public final val spoilerDescription: String?
   public open val spoilerOrNull: String?
   public final val themedBackgroundColor: Int?
   public open val type: Int

   init {
      q.h(var2, "id");
      q.h(var4, "components");
      super(null);
      this.type = var1;
      this.id = var2;
      this.errorText = var3;
      this.components = var4;
      this.accentColor = var5;
      this.isSpoiler = var6;
      this.spoilerDescription = var7;
      this.themedBackgroundColor = var8;
      val var9: Boolean;
      if (var7 != null && !h.d0(var7)) {
         var9 = false;
      } else {
         var9 = true;
      }

      if (var9) {
         var7 = null;
      }

      this.spoilerOrNull = var7;
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

   public operator fun component5(): Int? {
      return this.accentColor;
   }

   public operator fun component6(): Boolean {
      return this.isSpoiler;
   }

   public operator fun component7(): String? {
      return this.spoilerDescription;
   }

   public operator fun component8(): Int? {
      return this.themedBackgroundColor;
   }

   public fun copy(
      type: Int = var0.type,
      id: String = var0.id,
      errorText: String? = var0.errorText,
      components: List<Component> = var0.components,
      accentColor: Int? = var0.accentColor,
      isSpoiler: Boolean = var0.isSpoiler,
      spoilerDescription: String? = var0.spoilerDescription,
      themedBackgroundColor: Int? = var0.themedBackgroundColor
   ): ContainerComponent {
      q.h(var2, "id");
      q.h(var4, "components");
      return new ContainerComponent(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ContainerComponent) {
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
         } else if (!q.c(this.accentColor, var1.accentColor)) {
            return false;
         } else if (this.isSpoiler != var1.isSpoiler) {
            return false;
         } else if (!q.c(this.spoilerDescription, var1.spoilerDescription)) {
            return false;
         } else {
            return q.c(this.themedBackgroundColor, var1.themedBackgroundColor);
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = Integer.hashCode(this.type);
      val var5: Int = this.id.hashCode();
      var var4: Int = 0;
      val var1: Int;
      if (this.errorText == null) {
         var1 = 0;
      } else {
         var1 = this.errorText.hashCode();
      }

      val var7: Int = this.components.hashCode();
      val var2: Int;
      if (this.accentColor == null) {
         var2 = 0;
      } else {
         var2 = this.accentColor.hashCode();
      }

      val var8: Int = java.lang.Boolean.hashCode(this.isSpoiler);
      val var3: Int;
      if (this.spoilerDescription == null) {
         var3 = 0;
      } else {
         var3 = this.spoilerDescription.hashCode();
      }

      if (this.themedBackgroundColor != null) {
         var4 = this.themedBackgroundColor.hashCode();
      }

      return ((((((var6 * 31 + var5) * 31 + var1) * 31 + var7) * 31 + var2) * 31 + var8) * 31 + var3) * 31 + var4;
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var3: java.lang.String = this.id;
      val var4: java.lang.String = this.errorText;
      val var5: java.util.List = this.components;
      val var9: Int = this.accentColor;
      val var2: Boolean = this.isSpoiler;
      val var6: java.lang.String = this.spoilerDescription;
      val var7: Int = this.themedBackgroundColor;
      val var8: StringBuilder = new StringBuilder();
      var8.append("ContainerComponent(type=");
      var8.append(var1);
      var8.append(", id=");
      var8.append(var3);
      var8.append(", errorText=");
      var8.append(var4);
      var8.append(", components=");
      var8.append(var5);
      var8.append(", accentColor=");
      var8.append(var9);
      var8.append(", isSpoiler=");
      var8.append(var2);
      var8.append(", spoilerDescription=");
      var8.append(var6);
      var8.append(", themedBackgroundColor=");
      var8.append(var7);
      var8.append(")");
      return var8.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ContainerComponent.$serializer = new ContainerComponent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("17", var0, 10);
         var1.l("type", false);
         var1.l("id", false);
         var1.l("errorText", true);
         var1.l("components", false);
         var1.l("accentColor", true);
         var1.l("isSpoiler", false);
         var1.l("spoilerDescription", false);
         var1.l("themedBackgroundColor", true);
         var1.l("spoilerOrNull", true);
         var1.l("obscureOrNull", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var4: Array<KSerializer> = ContainerComponent.access$get$childSerializers$cp();
         val var2: N = N.a;
         val var1: C0 = C0.a;
         return new KSerializer[]{N.a, C0.a, a.u(C0.a), var4[3], a.u(var2), ha.h.a, a.u(var1), a.u(var2), a.u(var1), a.u(h0.a)};
      }

      public open fun deserialize(decoder: Decoder): ContainerComponent {
         q.h(var1, "decoder");
         val var19: SerialDescriptor = this.getDescriptor();
         val var20: c = var1.c(var19);
         val var17: Array<KSerializer> = ContainerComponent.access$get$childSerializers$cp();
         val var8: Boolean = var20.y();
         var var5: Int = 9;
         var var3: Int;
         var var4: Int;
         var var11: Any;
         var var13: java.lang.String;
         var var14: Any;
         var var15: Any;
         val var16: java.lang.String;
         val var22: Void;
         var var30: java.lang.String;
         val var35: java.lang.String;
         if (var8) {
            var4 = var20.k(var19, 0);
            var13 = var20.t(var19, 1);
            val var21: C0 = C0.a;
            var16 = var20.v(var19, 2, C0.a, null) as java.lang.String;
            var11 = var20.m(var19, 3, var17[3], null) as java.util.List;
            val var9: N = N.a;
            var15 = var20.v(var19, 4, N.a, null) as Int;
            val var2: Byte = var20.s(var19, 5);
            var30 = var20.v(var19, 6, var21, null) as java.lang.String;
            val var26: Int = var20.v(var19, 7, var9, null) as Int;
            val var10: java.lang.String = var20.v(var19, 8, var21, null) as java.lang.String;
            var22 = var20.v(var19, 9, h0.a, null) as Void;
            var5 = 1023;
            var3 = var2;
            var35 = var30;
            var14 = var26;
            var30 = var10;
         } else {
            var var6: Boolean = true;
            var4 = 0;
            var var24: Int = 0;
            var15 = null;
            var14 = null;
            var13 = null;
            var11 = null;
            var30 = null;
            var var28: Any = null;
            var var23: java.lang.String = null;
            var var27: java.lang.String = null;
            var3 = 0;

            while (var6) {
               val var7: Int = var20.x(var19);
               switch (var7) {
                  case -1:
                     var6 = false;
                     continue;
                  case 0:
                     var4 = var20.k(var19, 0);
                     var24 |= 1;
                     break;
                  case 1:
                     var23 = var20.t(var19, 1);
                     var24 |= 2;
                     break;
                  case 2:
                     var27 = var20.v(var19, 2, C0.a, var27) as java.lang.String;
                     var24 |= 4;
                     break;
                  case 3:
                     var28 = var20.m(var19, 3, var17[3], var28) as java.util.List;
                     var24 |= 8;
                     break;
                  case 4:
                     var11 = var20.v(var19, 4, N.a, var11) as Int;
                     var24 |= 16;
                     break;
                  case 5:
                     var3 = var20.s(var19, 5);
                     var24 |= 32;
                     break;
                  case 6:
                     var30 = var20.v(var19, 6, C0.a, var30) as java.lang.String;
                     var24 |= 64;
                     break;
                  case 7:
                     var13 = var20.v(var19, 7, N.a, var13) as Int;
                     var24 |= 128;
                     var5 = 9;
                     continue;
                  case 8:
                     var14 = var20.v(var19, 8, C0.a, var14) as java.lang.String;
                     var24 |= 256;
                     continue;
                  case 9:
                     var15 = var20.v(var19, var5, h0.a, var15) as Void;
                     var24 |= 512;
                     continue;
                  default:
                     throw new n(var7);
               }

               var5 = 9;
            }

            var35 = var30;
            var22 = (Void)var15;
            var30 = (java.lang.String)var14;
            var14 = var13;
            var15 = var11;
            var11 = var28;
            var16 = var27;
            var13 = var23;
            var5 = var24;
         }

         var20.b(var19);
         return new ContainerComponent(
            var5, var4, var13, var16, (java.util.List)var11, (Integer)var15, (boolean)var3, var35, (Integer)var14, var30, var22, null
         );
      }

      public open fun serialize(encoder: Encoder, value: ContainerComponent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ContainerComponent.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return ha.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ContainerComponent> {
         return ContainerComponent.$serializer.INSTANCE;
      }
   }
}
