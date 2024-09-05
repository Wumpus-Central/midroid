package com.discord.chat.bridge.truncation

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
import qn.h
import qn.n0

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
         } else if (!q.c(this.seeMoreLabel, var1.seeMoreLabel)) {
            return false;
         } else if (!q.c(this.seeMoreLabelColor, var1.seeMoreLabelColor)) {
            return false;
         } else {
            return q.c(this.forceShow, var1.forceShow);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = Integer.hashCode(this.numberOfLines);
      val var5: Int = java.lang.Boolean.hashCode(this.expandable);
      var var3: Int = 0;
      val var1: Int;
      if (this.seeMoreLabel == null) {
         var1 = 0;
      } else {
         var1 = this.seeMoreLabel.hashCode();
      }

      val var2: Int;
      if (this.seeMoreLabelColor == null) {
         var2 = 0;
      } else {
         var2 = this.seeMoreLabelColor.hashCode();
      }

      if (this.forceShow != null) {
         var3 = this.forceShow.hashCode();
      }

      return (((var4 * 31 + var5) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var1: Int = this.numberOfLines;
      val var2: Boolean = this.expandable;
      val var6: java.lang.String = this.seeMoreLabel;
      val var3: Int = this.seeMoreLabelColor;
      val var5: java.lang.Boolean = this.forceShow;
      val var4: StringBuilder = new StringBuilder();
      var4.append("Truncation(numberOfLines=");
      var4.append(var1);
      var4.append(", expandable=");
      var4.append(var2);
      var4.append(", seeMoreLabel=");
      var4.append(var6);
      var4.append(", seeMoreLabelColor=");
      var4.append(var3);
      var4.append(", forceShow=");
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
         val var0: Truncation.$serializer = new Truncation.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.truncation.Truncation", var0, 5);
         var1.c("numberOfLines", false);
         var1.c("expandable", false);
         var1.c("seeMoreLabel", true);
         var1.c("seeMoreLabelColor", true);
         var1.c("forceShow", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: n0 = n0.a;
         val var2: h = h.a;
         return new KSerializer[]{n0.a, h.a, a.u(b2.a), a.u(var1), a.u(var2)};
      }

      public open fun deserialize(decoder: Decoder): Truncation {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         var var3: Int;
         var var4: Int;
         val var5: Int;
         var var8: java.lang.String;
         val var9: Any;
         val var12: Int;
         if (var11.p()) {
            var4 = var11.i(var10, 0);
            val var2: Byte = var11.C(var10, 1);
            var8 = var11.n(var10, 2, b2.a, null) as java.lang.String;
            var12 = var11.n(var10, 3, n0.a, null) as Int;
            val var7: java.lang.Boolean = var11.n(var10, 4, h.a, null) as java.lang.Boolean;
            var3 = 31;
            var5 = var2;
            var9 = var7;
         } else {
            var var16: Boolean = true;
            var4 = 0;
            var var14: Int = 0;
            var8 = null;
            var var17: Int = null;
            var var13: Any = null;
            var3 = 0;

            while (var16) {
               val var6: Int = var11.o(var10);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           if (var6 != 3) {
                              if (var6 != 4) {
                                 throw new n(var6);
                              }

                              var13 = var11.n(var10, 4, h.a, var13) as java.lang.Boolean;
                              var14 |= 16;
                           } else {
                              var17 = var11.n(var10, 3, n0.a, var17) as Int;
                              var14 |= 8;
                           }
                        } else {
                           var8 = var11.n(var10, 2, b2.a, var8) as java.lang.String;
                           var14 |= 4;
                        }
                     } else {
                        var3 = var11.C(var10, 1);
                        var14 |= 2;
                     }
                  } else {
                     var4 = var11.i(var10, 0);
                     var14 |= 1;
                  }
               } else {
                  var16 = false;
               }
            }

            var9 = var13;
            var12 = var17;
            var5 = var3;
            var3 = var14;
         }

         var11.c(var10);
         return new Truncation(var3, var4, (boolean)var5, var8, var12, (java.lang.Boolean)var9, null);
      }

      public open fun serialize(encoder: Encoder, value: Truncation) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         Truncation.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Truncation> {
         return Truncation.$serializer.INSTANCE;
      }
   }
}
