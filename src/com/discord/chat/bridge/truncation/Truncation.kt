package com.discord.chat.bridge.truncation

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
import xk.h
import xk.m0

@f
public data class Truncation(numberOfLines: Int, expandable: Boolean, seeMoreLabel: String? = null, seeMoreLabelColor: Int? = null, forceShow: Boolean? = null) {
   public final val expandable: Boolean
   public final val forceShow: Boolean?
   public final val numberOfLines: Int
   public final val seeMoreLabel: String?
   public final val seeMoreLabelColor: Int?

   init {
      super();
      this.numberOfLines = var1;
      this.expandable = var2;
      this.seeMoreLabel = var3;
      this.seeMoreLabelColor = var4;
      this.forceShow = var5;
   }

   @JvmStatic
   public fun `write$Self`(self: Truncation, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.numberOfLines);
      var1.x(var2, 1, var0.expandable);
      var var5: Boolean;
      if (!var1.A(var2, 2) && var0.seeMoreLabel == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 2, a2.a, var0.seeMoreLabel);
      }

      if (!var1.A(var2, 3) && var0.seeMoreLabelColor == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 3, m0.a, var0.seeMoreLabelColor);
      }

      label32: {
         if (!var1.A(var2, 4)) {
            var5 = false;
            if (var0.forceShow == null) {
               break label32;
            }
         }

         var5 = true;
      }

      if (var5) {
         var1.m(var2, 4, h.a, var0.forceShow);
      }
   }

   public operator fun component1(): Int {
      return this.numberOfLines;
   }

   public operator fun component2(): Boolean {
      return this.expandable;
   }

   public operator fun component3(): String? {
      return this.seeMoreLabel;
   }

   public operator fun component4(): Int? {
      return this.seeMoreLabelColor;
   }

   public operator fun component5(): Boolean? {
      return this.forceShow;
   }

   public fun copy(
      numberOfLines: Int = var0.numberOfLines,
      expandable: Boolean = var0.expandable,
      seeMoreLabel: String? = var0.seeMoreLabel,
      seeMoreLabelColor: Int? = var0.seeMoreLabelColor,
      forceShow: Boolean? = var0.forceShow
   ): Truncation {
      return new Truncation(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is Truncation) {
         return false;
      } else {
         var1 = var1;
         if (this.numberOfLines != var1.numberOfLines) {
            return false;
         } else if (this.expandable != var1.expandable) {
            return false;
         } else if (!r.c(this.seeMoreLabel, var1.seeMoreLabel)) {
            return false;
         } else if (!r.c(this.seeMoreLabelColor, var1.seeMoreLabelColor)) {
            return false;
         } else {
            return r.c(this.forceShow, var1.forceShow);
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = Integer.hashCode(this.numberOfLines);
      var var1: Byte = this.expandable;
      if (this.expandable != 0) {
         var1 = 1;
      }

      var var4: Int = 0;
      val var7: Int;
      if (this.seeMoreLabel == null) {
         var7 = 0;
      } else {
         var7 = this.seeMoreLabel.hashCode();
      }

      val var3: Int;
      if (this.seeMoreLabelColor == null) {
         var3 = 0;
      } else {
         var3 = this.seeMoreLabelColor.hashCode();
      }

      if (this.forceShow != null) {
         var4 = this.forceShow.hashCode();
      }

      return (((var5 * 31 + var1) * 31 + var7) * 31 + var3) * 31 + var4;
   }

   public override fun toString(): String {
      val var1: Int = this.numberOfLines;
      val var2: Boolean = this.expandable;
      val var3: java.lang.String = this.seeMoreLabel;
      val var4: Int = this.seeMoreLabelColor;
      val var5: java.lang.Boolean = this.forceShow;
      val var6: StringBuilder = new StringBuilder();
      var6.append("Truncation(numberOfLines=");
      var6.append(var1);
      var6.append(", expandable=");
      var6.append(var2);
      var6.append(", seeMoreLabel=");
      var6.append(var3);
      var6.append(", seeMoreLabelColor=");
      var6.append(var4);
      var6.append(", forceShow=");
      var6.append(var5);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : f0<Truncation> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: Truncation.$serializer = new Truncation.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.truncation.Truncation", var0, 5);
         var1.l("numberOfLines", false);
         var1.l("expandable", false);
         var1.l("seeMoreLabel", true);
         var1.l("seeMoreLabelColor", true);
         var1.l("forceShow", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: m0 = m0.a;
         val var1: h = h.a;
         return new KSerializer[]{m0.a, h.a, a.u(a2.a), a.u(var2), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): Truncation {
         r.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         var var2: Int;
         var var4: Int;
         var var7: Any;
         var var8: Any;
         var var11: Any;
         var var12: Int;
         if (var10.p()) {
            var12 = var10.i(var9, 0);
            val var5: Byte = var10.C(var9, 1);
            var8 = var10.n(var9, 2, a2.a, null);
            var7 = var10.n(var9, 3, m0.a, null);
            var11 = var10.n(var9, 4, h.a, null);
            var2 = 31;
            var4 = var12;
            var12 = var5;
         } else {
            var var13: Boolean = true;
            var4 = 0;
            var2 = 0;
            var8 = null;
            var7 = null;
            var11 = null;
            var12 = 0;

            while (var13) {
               val var6: Int = var10.o(var9);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           if (var6 != 3) {
                              if (var6 != 4) {
                                 throw new n(var6);
                              }

                              var11 = var10.n(var9, 4, h.a, var11);
                              var2 |= 16;
                           } else {
                              var7 = var10.n(var9, 3, m0.a, var7);
                              var2 |= 8;
                           }
                        } else {
                           var8 = var10.n(var9, 2, a2.a, var8);
                           var2 |= 4;
                        }
                     } else {
                        var12 = var10.C(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var4 = var10.i(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var13 = false;
               }
            }
         }

         var10.c(var9);
         return new Truncation(var2, var4, (boolean)var12, var8 as java.lang.String, var7 as Integer, var11 as java.lang.Boolean, null);
      }

      public open fun serialize(encoder: Encoder, value: Truncation) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         Truncation.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Truncation> {
         return Truncation.$serializer.INSTANCE;
      }
   }
}
