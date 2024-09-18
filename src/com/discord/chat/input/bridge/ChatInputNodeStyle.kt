package com.discord.chat.input.bridge

import com.discord.span.utilities.common.BackgroundStyle
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import vk.f
import vk.n
import wk.a
import yk.g0
import yk.n0

@f
public data class ChatInputNodeStyle(fontSize: Int? = null, color: Int, backgroundStyle: BackgroundStyle?, fontWeight: ChatInputNodeFontWeight? = null) {
   public final val backgroundStyle: BackgroundStyle?
   public final val color: Int
   public final val fontSize: Int?
   public final val fontWeight: ChatInputNodeFontWeight?

   init {
      super();
      this.fontSize = var1;
      this.color = var2;
      this.backgroundStyle = var3;
      this.fontWeight = var4;
   }

   public operator fun component1(): Int? {
      return this.fontSize;
   }

   public operator fun component2(): Int {
      return this.color;
   }

   public operator fun component3(): BackgroundStyle? {
      return this.backgroundStyle;
   }

   public operator fun component4(): ChatInputNodeFontWeight? {
      return this.fontWeight;
   }

   public fun copy(
      fontSize: Int? = var0.fontSize,
      color: Int = var0.color,
      backgroundStyle: BackgroundStyle? = var0.backgroundStyle,
      fontWeight: ChatInputNodeFontWeight? = var0.fontWeight
   ): ChatInputNodeStyle {
      return new ChatInputNodeStyle(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChatInputNodeStyle) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.fontSize, var1.fontSize)) {
            return false;
         } else if (this.color != var1.color) {
            return false;
         } else if (!q.c(this.backgroundStyle, var1.backgroundStyle)) {
            return false;
         } else {
            return this.fontWeight === var1.fontWeight;
         }
      }
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
      val var1: Int;
      if (this.fontSize == null) {
         var1 = 0;
      } else {
         var1 = this.fontSize.hashCode();
      }

      val var4: Int = Integer.hashCode(this.color);
      val var2: Int;
      if (this.backgroundStyle == null) {
         var2 = 0;
      } else {
         var2 = this.backgroundStyle.hashCode();
      }

      if (this.fontWeight != null) {
         var3 = this.fontWeight.hashCode();
      }

      return ((var1 * 31 + var4) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var4: Int = this.fontSize;
      val var1: Int = this.color;
      val var2: BackgroundStyle = this.backgroundStyle;
      val var3: ChatInputNodeFontWeight = this.fontWeight;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ChatInputNodeStyle(fontSize=");
      var5.append(var4);
      var5.append(", color=");
      var5.append(var1);
      var5.append(", backgroundStyle=");
      var5.append(var2);
      var5.append(", fontWeight=");
      var5.append(var3);
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
         val var0: ChatInputNodeStyle.$serializer = new ChatInputNodeStyle.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.input.bridge.ChatInputNodeStyle", var0, 4);
         var1.l("fontSize", true);
         var1.l("color", false);
         var1.l("backgroundStyle", false);
         var1.l("fontWeight", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: Array<KSerializer> = ChatInputNodeStyle.access$get$childSerializers$cp();
         val var1: n0 = n0.a;
         return new KSerializer[]{a.u(n0.a), var1, a.u(BackgroundStyle.$serializer.INSTANCE), a.u(var2[3])};
      }

      public open fun deserialize(decoder: Decoder): ChatInputNodeStyle {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.c(var9);
         var var8: Array<KSerializer> = ChatInputNodeStyle.access$get$childSerializers$cp();
         var var2: Int;
         var var3: Int;
         var var7: Int;
         val var11: BackgroundStyle;
         if (var10.y()) {
            var7 = var10.v(var9, 0, n0.a, null) as Int;
            var3 = var10.k(var9, 1);
            var11 = var10.v(var9, 2, BackgroundStyle.$serializer.INSTANCE, null) as BackgroundStyle;
            var8 = var10.v(var9, 3, var8[3], null) as ChatInputNodeFontWeight;
            var2 = 15;
         } else {
            var var4: Boolean = true;
            var2 = 0;
            var7 = null;
            var var6: BackgroundStyle = null;
            var var12: Any = null;
            var3 = 0;

            while (var4) {
               val var5: Int = var10.x(var9);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           if (var5 != 3) {
                              throw new n(var5);
                           }

                           var12 = var10.v(var9, 3, var8[3], var12) as ChatInputNodeFontWeight;
                           var2 |= 8;
                        } else {
                           var6 = var10.v(var9, 2, BackgroundStyle.$serializer.INSTANCE, var6) as BackgroundStyle;
                           var2 |= 4;
                        }
                     } else {
                        var3 = var10.k(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var10.v(var9, 0, n0.a, var7) as Int;
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }

            var8 = (KSerializer[])var12;
            var11 = var6;
         }

         var10.b(var9);
         return new ChatInputNodeStyle(var2, var7, var3, var11, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: ChatInputNodeStyle) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ChatInputNodeStyle.write$Self$chat_input_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return yk.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ChatInputNodeStyle> {
         return ChatInputNodeStyle.$serializer.INSTANCE;
      }
   }
}
