package com.discord.chat.bridge.reaction

import com.discord.reactions.BurstReactionView.BurstColorPalette
import dn.f
import dn.n
import en.a
import gn.b2
import gn.f0
import gn.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class BurstReactionColorPalette(backgroundColor: String?, accentColor: String?, highlightColor: String?, opacity: Float) : BurstColorPalette {
   public open val accentColor: String?
   public open val backgroundColor: String?
   public open val highlightColor: String?
   public open val opacity: Float

   init {
      super();
      this.backgroundColor = var1;
      this.accentColor = var2;
      this.highlightColor = var3;
      this.opacity = var4;
   }

   public operator fun component1(): String? {
      return this.backgroundColor;
   }

   public operator fun component2(): String? {
      return this.accentColor;
   }

   public operator fun component3(): String? {
      return this.highlightColor;
   }

   public operator fun component4(): Float {
      return this.opacity;
   }

   public fun copy(
      backgroundColor: String? = var0.backgroundColor,
      accentColor: String? = var0.accentColor,
      highlightColor: String? = var0.highlightColor,
      opacity: Float = var0.opacity
   ): BurstReactionColorPalette {
      return new BurstReactionColorPalette(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BurstReactionColorPalette) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.backgroundColor, var1.backgroundColor)) {
            return false;
         } else if (!q.c(this.accentColor, var1.accentColor)) {
            return false;
         } else if (!q.c(this.highlightColor, var1.highlightColor)) {
            return false;
         } else {
            return java.lang.Float.compare(this.opacity, var1.opacity) == 0;
         }
      }
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
      val var1: Int;
      if (this.backgroundColor == null) {
         var1 = 0;
      } else {
         var1 = this.backgroundColor.hashCode();
      }

      val var2: Int;
      if (this.accentColor == null) {
         var2 = 0;
      } else {
         var2 = this.accentColor.hashCode();
      }

      if (this.highlightColor != null) {
         var3 = this.highlightColor.hashCode();
      }

      return ((var1 * 31 + var2) * 31 + var3) * 31 + java.lang.Float.hashCode(this.opacity);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.backgroundColor;
      val var5: java.lang.String = this.accentColor;
      val var4: java.lang.String = this.highlightColor;
      val var1: Float = this.opacity;
      val var3: StringBuilder = new StringBuilder();
      var3.append("BurstReactionColorPalette(backgroundColor=");
      var3.append(var2);
      var3.append(", accentColor=");
      var3.append(var5);
      var3.append(", highlightColor=");
      var3.append(var4);
      var3.append(", opacity=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: BurstReactionColorPalette.$serializer = new BurstReactionColorPalette.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.reaction.BurstReactionColorPalette", var0, 4);
         var1.l("backgroundColor", false);
         var1.l("accentColor", false);
         var1.l("highlightColor", false);
         var1.l("opacity", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: b2 = b2.a;
         return new KSerializer[]{a.u(b2.a), a.u(var1), a.u(var1), f0.a};
      }

      public open fun deserialize(decoder: Decoder): BurstReactionColorPalette {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var2: Float;
         var var3: Int;
         var var6: java.lang.String;
         var var7: java.lang.String;
         var var11: java.lang.String;
         if (var9.p()) {
            val var10: b2 = b2.a;
            var7 = var9.n(var8, 0, b2.a, null) as java.lang.String;
            var6 = var9.n(var8, 1, var10, null) as java.lang.String;
            var11 = var9.n(var8, 2, var10, null) as java.lang.String;
            var2 = var9.u(var8, 3);
            var3 = 15;
         } else {
            var2 = 0.0F;
            var var4: Boolean = true;
            var7 = null;
            var6 = null;
            var11 = null;
            var3 = 0;

            while (var4) {
               val var5: Int = var9.o(var8);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           if (var5 != 3) {
                              throw new n(var5);
                           }

                           var2 = var9.u(var8, 3);
                           var3 |= 8;
                        } else {
                           var11 = var9.n(var8, 2, b2.a, var11) as java.lang.String;
                           var3 |= 4;
                        }
                     } else {
                        var6 = var9.n(var8, 1, b2.a, var6) as java.lang.String;
                        var3 |= 2;
                     }
                  } else {
                     var7 = var9.n(var8, 0, b2.a, var7) as java.lang.String;
                     var3 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }
         }

         var9.c(var8);
         return new BurstReactionColorPalette(var3, var7, var6, var11, var2, null);
      }

      public open fun serialize(encoder: Encoder, value: BurstReactionColorPalette) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         BurstReactionColorPalette.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BurstReactionColorPalette> {
         return BurstReactionColorPalette.$serializer.INSTANCE;
      }
   }
}
