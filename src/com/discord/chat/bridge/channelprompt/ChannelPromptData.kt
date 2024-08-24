package com.discord.chat.bridge.channelprompt

import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
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
      super();
      this.cameraButtonIcon = var1;
      this.gifButtonIcon = var2;
      this.emojiButtonIcon = var3;
      this.gamingStatsButtonText = var4;
      this.cameraButtonText = var5;
      this.gifButtonText = var6;
      this.emojiButtonText = var7;
   }

   @JvmStatic
   public fun `write$Self`(self: ChannelPromptData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.cameraButtonIcon == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 0, a2.a, var0.cameraButtonIcon);
      }

      if (!var1.A(var2, 1) && var0.gifButtonIcon == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, a2.a, var0.gifButtonIcon);
      }

      if (!var1.A(var2, 2) && var0.emojiButtonIcon == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, a2.a, var0.emojiButtonIcon);
      }

      if (!var1.A(var2, 3) && var0.gamingStatsButtonText == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, a2.a, var0.gamingStatsButtonText);
      }

      if (!var1.A(var2, 4) && var0.cameraButtonText == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, a2.a, var0.cameraButtonText);
      }

      if (!var1.A(var2, 5) && var0.gifButtonText == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 5, a2.a, var0.gifButtonText);
      }

      label64: {
         if (!var1.A(var2, 6)) {
            var3 = false;
            if (var0.emojiButtonText == null) {
               break label64;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 6, a2.a, var0.emojiButtonText);
      }
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
         if (!r.c(this.cameraButtonIcon, var1.cameraButtonIcon)) {
            return false;
         } else if (!r.c(this.gifButtonIcon, var1.gifButtonIcon)) {
            return false;
         } else if (!r.c(this.emojiButtonIcon, var1.emojiButtonIcon)) {
            return false;
         } else if (!r.c(this.gamingStatsButtonText, var1.gamingStatsButtonText)) {
            return false;
         } else if (!r.c(this.cameraButtonText, var1.cameraButtonText)) {
            return false;
         } else if (!r.c(this.gifButtonText, var1.gifButtonText)) {
            return false;
         } else {
            return r.c(this.emojiButtonText, var1.emojiButtonText);
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
      val var3: java.lang.String = this.gifButtonIcon;
      val var6: java.lang.String = this.emojiButtonIcon;
      val var4: java.lang.String = this.gamingStatsButtonText;
      val var2: java.lang.String = this.cameraButtonText;
      val var8: java.lang.String = this.gifButtonText;
      val var7: java.lang.String = this.emojiButtonText;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ChannelPromptData(cameraButtonIcon=");
      var5.append(var1);
      var5.append(", gifButtonIcon=");
      var5.append(var3);
      var5.append(", emojiButtonIcon=");
      var5.append(var6);
      var5.append(", gamingStatsButtonText=");
      var5.append(var4);
      var5.append(", cameraButtonText=");
      var5.append(var2);
      var5.append(", gifButtonText=");
      var5.append(var8);
      var5.append(", emojiButtonText=");
      var5.append(var7);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : f0<ChannelPromptData> {
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
         val var1: a2 = a2.a;
         return new KSerializer[]{a.u(a2.a), a.u(var1), a.u(var1), a.u(var1), a.u(var1), a.u(var1), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): ChannelPromptData {
         r.h(var1, "decoder");
         val var16: SerialDescriptor = this.getDescriptor();
         val var17: c = var1.b(var16);
         val var6: Boolean = var17.p();
         var var4: Byte = 6;
         var var18: Any = null;
         var var2: Int;
         var var7: Any;
         var var8: Any;
         var var9: Any;
         var var10: Any;
         var var11: Any;
         var var24: Any;
         if (var6) {
            var24 = a2.a;
            var8 = var17.n(var16, 0, a2.a, null);
            var10 = var17.n(var16, 1, (DeserializationStrategy)var24, null);
            var9 = var17.n(var16, 2, (DeserializationStrategy)var24, null);
            var18 = var17.n(var16, 3, (DeserializationStrategy)var24, null);
            var11 = var17.n(var16, 4, (DeserializationStrategy)var24, null);
            var7 = var17.n(var16, 5, (DeserializationStrategy)var24, null);
            var24 = var17.n(var16, 6, (DeserializationStrategy)var24, null);
            var2 = 127;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var24 = null;
            var11 = null;
            var10 = null;
            var9 = null;
            var8 = null;
            var7 = null;

            while (var3) {
               val var5: Int = var17.o(var16);
               switch (var5) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var18 = var17.n(var16, 0, a2.a, var18);
                     var2 |= 1;
                     break;
                  case 1:
                     var11 = var17.n(var16, 1, a2.a, var11);
                     var2 |= 2;
                     var4 = 6;
                     continue;
                  case 2:
                     var10 = var17.n(var16, 2, a2.a, var10);
                     var2 |= 4;
                     continue;
                  case 3:
                     var9 = var17.n(var16, 3, a2.a, var9);
                     var2 |= 8;
                     continue;
                  case 4:
                     var8 = var17.n(var16, 4, a2.a, var8);
                     var2 |= 16;
                     continue;
                  case 5:
                     var7 = var17.n(var16, 5, a2.a, var7);
                     var2 |= 32;
                     continue;
                  case 6:
                     var24 = var17.n(var16, var4, a2.a, var24);
                     var2 |= 64;
                     continue;
                  default:
                     throw new n(var5);
               }

               var4 = 6;
            }

            var18 = var9;
            var8 = var18;
            var10 = var11;
            var9 = var10;
            var11 = var8;
         }

         var17.c(var16);
         return new ChannelPromptData(
            var2,
            var8 as java.lang.String,
            var10 as java.lang.String,
            var9 as java.lang.String,
            var18 as java.lang.String,
            var11 as java.lang.String,
            var7 as java.lang.String,
            var24 as java.lang.String,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: ChannelPromptData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ChannelPromptData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ChannelPromptData> {
         return ChannelPromptData.$serializer.INSTANCE;
      }
   }
}
