package com.discord.chat.input.bridge

import al.g0
import al.n0
import com.discord.span.utilities.common.BackgroundStyle
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import xk.f
import xk.n
import yk.a

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
         val var1: Array<KSerializer> = ChatInputNodeStyle.access$get$childSerializers$cp();
         val var2: n0 = n0.a;
         return new KSerializer[]{a.u(n0.a), var2, a.u(BackgroundStyle.$serializer.INSTANCE), a.u(var1[3])};
      }

      public open fun deserialize(decoder: Decoder): ChatInputNodeStyle {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         val var10: Array<KSerializer> = ChatInputNodeStyle.access$get$childSerializers$cp();
         var var3: Int;
         val var4: Int;
         var var6: BackgroundStyle;
         var var7: Int;
         var var11: Any;
         if (var9.y()) {
            var7 = var9.v(var8, 0, n0.a, null) as Int;
            val var2: Int = var9.k(var8, 1);
            var6 = var9.v(var8, 2, BackgroundStyle.$serializer.INSTANCE, null) as BackgroundStyle;
            var11 = var9.v(var8, 3, var10[3], null) as ChatInputNodeFontWeight;
            var3 = 15;
            var4 = var2;
         } else {
            var var14: Boolean = true;
            var var12: Int = 0;
            var7 = null;
            var6 = null;
            var11 = null;
            var3 = 0;

            while (var14) {
               val var5: Int = var9.x(var8);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           if (var5 != 3) {
                              throw new n(var5);
                           }

                           var11 = var9.v(var8, 3, var10[3], var11) as ChatInputNodeFontWeight;
                           var12 |= 8;
                        } else {
                           var6 = var9.v(var8, 2, BackgroundStyle.$serializer.INSTANCE, var6) as BackgroundStyle;
                           var12 |= 4;
                        }
                     } else {
                        var3 = var9.k(var8, 1);
                        var12 |= 2;
                     }
                  } else {
                     var7 = var9.v(var8, 0, n0.a, var7) as Int;
                     var12 |= 1;
                  }
               } else {
                  var14 = false;
               }
            }

            var4 = var3;
            var3 = var12;
         }

         var9.b(var8);
         return new ChatInputNodeStyle(var3, var7, var4, var6, (ChatInputNodeFontWeight)var11, null);
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
         return al.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ChatInputNodeStyle> {
         return ChatInputNodeStyle.$serializer.INSTANCE;
      }
   }
}
