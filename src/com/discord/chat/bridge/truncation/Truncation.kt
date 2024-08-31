package com.discord.chat.bridge.truncation

import dn.f
import dn.n
import en.a
import gn.b2
import gn.g0
import gn.h
import gn.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
      val var5: Int = Integer.hashCode(this.numberOfLines);
      val var4: Int = java.lang.Boolean.hashCode(this.expandable);
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

      return (((var5 * 31 + var4) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var1: Int = this.numberOfLines;
      val var2: Boolean = this.expandable;
      val var3: java.lang.String = this.seeMoreLabel;
      val var4: Int = this.seeMoreLabelColor;
      val var6: java.lang.Boolean = this.forceShow;
      val var5: StringBuilder = new StringBuilder();
      var5.append("Truncation(numberOfLines=");
      var5.append(var1);
      var5.append(", expandable=");
      var5.append(var2);
      var5.append(", seeMoreLabel=");
      var5.append(var3);
      var5.append(", seeMoreLabelColor=");
      var5.append(var4);
      var5.append(", forceShow=");
      var5.append(var6);
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
         val var2: n0 = n0.a;
         val var1: h = h.a;
         return new KSerializer[]{n0.a, h.a, a.u(b2.a), a.u(var2), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): Truncation {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         var var2: Int;
         var var3: Int;
         var var4: Int;
         var var8: java.lang.String;
         val var9: Any;
         val var12: Int;
         if (var11.p()) {
            var4 = var11.i(var10, 0);
            var3 = var11.C(var10, 1);
            var8 = var11.n(var10, 2, b2.a, null) as java.lang.String;
            var12 = var11.n(var10, 3, n0.a, null) as Int;
            val var7: java.lang.Boolean = var11.n(var10, 4, h.a, null) as java.lang.Boolean;
            var2 = 31;
            var9 = var7;
         } else {
            var var5: Boolean = true;
            var4 = 0;
            var2 = 0;
            var8 = null;
            var var14: Int = null;
            var var13: Any = null;
            var3 = 0;

            while (var5) {
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
                              var2 |= 16;
                           } else {
                              var14 = var11.n(var10, 3, n0.a, var14) as Int;
                              var2 |= 8;
                           }
                        } else {
                           var8 = var11.n(var10, 2, b2.a, var8) as java.lang.String;
                           var2 |= 4;
                        }
                     } else {
                        var3 = var11.C(var10, 1);
                        var2 |= 2;
                     }
                  } else {
                     var4 = var11.i(var10, 0);
                     var2 |= 1;
                  }
               } else {
                  var5 = false;
               }
            }

            var9 = var13;
            var12 = var14;
         }

         var11.c(var10);
         return new Truncation(var2, var4, (boolean)var3, var8, var12, (java.lang.Boolean)var9, null);
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
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Truncation> {
         return Truncation.$serializer.INSTANCE;
      }
   }
}
