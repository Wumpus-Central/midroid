package com.discord.chat.bridge.channelprompt

import cl.f
import cl.n
import dl.a
import fl.b2
import fl.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class ChannelPromptData(cameraButtonIcon: String? = null,
   gifButtonIcon: String? = null,
   emojiButtonIcon: String? = null,
   gamingStatsButtonText: String? = null,
   cameraButtonText: String? = null,
   gifButtonText: String? = null,
   emojiButtonText: String? = null
) {
   public final val cameraButtonIcon: String?
   public final val cameraButtonText: String?
   public final val emojiButtonIcon: String?
   public final val emojiButtonText: String?
   public final val gamingStatsButtonText: String?
   public final val gifButtonIcon: String?
   public final val gifButtonText: String?

   fun ChannelPromptData() {
      this(null, null, null, null, null, null, null, 127, null);
   }

   init {
      this.cameraButtonIcon = var1;
      this.gifButtonIcon = var2;
      this.emojiButtonIcon = var3;
      this.gamingStatsButtonText = var4;
      this.cameraButtonText = var5;
      this.gifButtonText = var6;
      this.emojiButtonText = var7;
   }

   public operator fun component1(): String? {
      return this.cameraButtonIcon;
   }

   public operator fun component2(): String? {
      return this.gifButtonIcon;
   }

   public operator fun component3(): String? {
      return this.emojiButtonIcon;
   }

   public operator fun component4(): String? {
      return this.gamingStatsButtonText;
   }

   public operator fun component5(): String? {
      return this.cameraButtonText;
   }

   public operator fun component6(): String? {
      return this.gifButtonText;
   }

   public operator fun component7(): String? {
      return this.emojiButtonText;
   }

   public fun copy(
      cameraButtonIcon: String? = var0.cameraButtonIcon,
      gifButtonIcon: String? = var0.gifButtonIcon,
      emojiButtonIcon: String? = var0.emojiButtonIcon,
      gamingStatsButtonText: String? = var0.gamingStatsButtonText,
      cameraButtonText: String? = var0.cameraButtonText,
      gifButtonText: String? = var0.gifButtonText,
      emojiButtonText: String? = var0.emojiButtonText
   ): ChannelPromptData {
      return new ChannelPromptData(var1, var2, var3, var4, var5, var6, var7);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChannelPromptData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.cameraButtonIcon, var1.cameraButtonIcon)) {
            return false;
         } else if (!q.c(this.gifButtonIcon, var1.gifButtonIcon)) {
            return false;
         } else if (!q.c(this.emojiButtonIcon, var1.emojiButtonIcon)) {
            return false;
         } else if (!q.c(this.gamingStatsButtonText, var1.gamingStatsButtonText)) {
            return false;
         } else if (!q.c(this.cameraButtonText, var1.cameraButtonText)) {
            return false;
         } else if (!q.c(this.gifButtonText, var1.gifButtonText)) {
            return false;
         } else {
            return q.c(this.emojiButtonText, var1.emojiButtonText);
         }
      }
   }

   public override fun hashCode(): Int {
      var var7: Int = 0;
      val var1: Int;
      if (this.cameraButtonIcon == null) {
         var1 = 0;
      } else {
         var1 = this.cameraButtonIcon.hashCode();
      }

      val var2: Int;
      if (this.gifButtonIcon == null) {
         var2 = 0;
      } else {
         var2 = this.gifButtonIcon.hashCode();
      }

      val var3: Int;
      if (this.emojiButtonIcon == null) {
         var3 = 0;
      } else {
         var3 = this.emojiButtonIcon.hashCode();
      }

      val var4: Int;
      if (this.gamingStatsButtonText == null) {
         var4 = 0;
      } else {
         var4 = this.gamingStatsButtonText.hashCode();
      }

      val var5: Int;
      if (this.cameraButtonText == null) {
         var5 = 0;
      } else {
         var5 = this.cameraButtonText.hashCode();
      }

      val var6: Int;
      if (this.gifButtonText == null) {
         var6 = 0;
      } else {
         var6 = this.gifButtonText.hashCode();
      }

      if (this.emojiButtonText != null) {
         var7 = this.emojiButtonText.hashCode();
      }

      return (((((var1 * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6) * 31 + var7;
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.cameraButtonIcon;
      val var5: java.lang.String = this.gifButtonIcon;
      val var6: java.lang.String = this.emojiButtonIcon;
      val var8: java.lang.String = this.gamingStatsButtonText;
      val var2: java.lang.String = this.cameraButtonText;
      val var4: java.lang.String = this.gifButtonText;
      val var3: java.lang.String = this.emojiButtonText;
      val var7: StringBuilder = new StringBuilder();
      var7.append("ChannelPromptData(cameraButtonIcon=");
      var7.append(var1);
      var7.append(", gifButtonIcon=");
      var7.append(var5);
      var7.append(", emojiButtonIcon=");
      var7.append(var6);
      var7.append(", gamingStatsButtonText=");
      var7.append(var8);
      var7.append(", cameraButtonText=");
      var7.append(var2);
      var7.append(", gifButtonText=");
      var7.append(var4);
      var7.append(", emojiButtonText=");
      var7.append(var3);
      var7.append(")");
      return var7.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ChannelPromptData.$serializer = new ChannelPromptData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.channelprompt.ChannelPromptData", var0, 7);
         var1.l("cameraButtonIcon", true);
         var1.l("gifButtonIcon", true);
         var1.l("emojiButtonIcon", true);
         var1.l("gamingStatsButtonText", true);
         var1.l("cameraButtonText", true);
         var1.l("gifButtonText", true);
         var1.l("emojiButtonText", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: b2 = b2.a;
         return new KSerializer[]{a.u(b2.a), a.u(var1), a.u(var1), a.u(var1), a.u(var1), a.u(var1), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): ChannelPromptData {
         q.h(var1, "decoder");
         val var15: SerialDescriptor = this.getDescriptor();
         val var16: c = var1.c(var15);
         val var6: Boolean = var16.y();
         var var4: Byte = 6;
         var var17: java.lang.String = null;
         var var2: Int;
         var var7: java.lang.String;
         var var10: java.lang.String;
         var var11: java.lang.String;
         var var12: java.lang.String;
         val var13: java.lang.String;
         var var20: java.lang.String;
         var var22: java.lang.String;
         if (var6) {
            val var9: b2 = b2.a;
            var11 = var16.v(var15, 0, b2.a, null) as java.lang.String;
            var13 = var16.v(var15, 1, var9, null) as java.lang.String;
            var10 = var16.v(var15, 2, var9, null) as java.lang.String;
            var7 = var16.v(var15, 3, var9, null) as java.lang.String;
            var20 = var16.v(var15, 4, var9, null) as java.lang.String;
            val var18: java.lang.String = var16.v(var15, 5, var9, null) as java.lang.String;
            val var14: java.lang.String = var16.v(var15, 6, var9, null) as java.lang.String;
            var2 = 127;
            var12 = var20;
            var22 = var18;
            var20 = var14;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var12 = null;
            var11 = null;
            var10 = null;
            var22 = null;
            var20 = null;
            var7 = null;

            while (var3) {
               val var5: Int = var16.x(var15);
               switch (var5) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var17 = var16.v(var15, 0, b2.a, var17) as java.lang.String;
                     var2 |= 1;
                     break;
                  case 1:
                     var11 = var16.v(var15, 1, b2.a, var11) as java.lang.String;
                     var2 |= 2;
                     var4 = 6;
                     continue;
                  case 2:
                     var10 = var16.v(var15, 2, b2.a, var10) as java.lang.String;
                     var2 |= 4;
                     continue;
                  case 3:
                     var22 = var16.v(var15, 3, b2.a, var22) as java.lang.String;
                     var2 |= 8;
                     continue;
                  case 4:
                     var20 = var16.v(var15, 4, b2.a, var20) as java.lang.String;
                     var2 |= 16;
                     continue;
                  case 5:
                     var7 = var16.v(var15, 5, b2.a, var7) as java.lang.String;
                     var2 |= 32;
                     continue;
                  case 6:
                     var12 = var16.v(var15, var4, b2.a, var12) as java.lang.String;
                     var2 |= 64;
                     continue;
                  default:
                     throw new n(var5);
               }

               var4 = 6;
            }

            var20 = var12;
            var22 = var7;
            var12 = var20;
            var7 = var22;
            var13 = var11;
            var11 = var17;
         }

         var16.b(var15);
         return new ChannelPromptData(var2, var11, var13, var10, var7, var12, var22, var20, null);
      }

      public open fun serialize(encoder: Encoder, value: ChannelPromptData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ChannelPromptData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ChannelPromptData> {
         return ChannelPromptData.$serializer.INSTANCE;
      }
   }
}
