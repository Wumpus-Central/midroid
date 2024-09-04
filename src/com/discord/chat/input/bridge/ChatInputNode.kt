package com.discord.chat.input.bridge

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
import xk.f0
import xk.h
import xk.m0

@f
public data class ChatInputNode(type: Int,
   location: Int,
   length: Int,
   style: ChatInputNodeStyle? = null,
   deleteNodeOnBackspace: Boolean = false,
   tapAction: TapAction? = null,
   editDisabled: Boolean = false
) {
   public final val deleteNodeOnBackspace: Boolean
   public final val editDisabled: Boolean
   public final val length: Int
   public final val location: Int
   public final val style: ChatInputNodeStyle?
   public final val tapAction: TapAction?
   public final val type: Int

   init {
      super();
      this.type = var1;
      this.location = var2;
      this.length = var3;
      this.style = var4;
      this.deleteNodeOnBackspace = var5;
      this.tapAction = var6;
      this.editDisabled = var7;
   }

   @JvmStatic
   public fun `write$Self`(self: ChatInputNode, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.type);
      var1.w(var2, 1, var0.location);
      var1.w(var2, 2, var0.length);
      var var5: Boolean;
      if (!var1.A(var2, 3) && var0.style == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 3, ChatInputNodeStyle.$serializer.INSTANCE, var0.style);
      }

      if (!var1.A(var2, 4) && !var0.deleteNodeOnBackspace) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.x(var2, 4, var0.deleteNodeOnBackspace);
      }

      if (!var1.A(var2, 5) && var0.tapAction == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 5, TapAction.$serializer.INSTANCE, var0.tapAction);
      }

      label40: {
         if (!var1.A(var2, 6)) {
            var5 = false;
            if (!var0.editDisabled) {
               break label40;
            }
         }

         var5 = true;
      }

      if (var5) {
         var1.x(var2, 6, var0.editDisabled);
      }
   }

   public operator fun component1(): Int {
      return this.type;
   }

   public operator fun component2(): Int {
      return this.location;
   }

   public operator fun component3(): Int {
      return this.length;
   }

   public operator fun component4(): ChatInputNodeStyle? {
      return this.style;
   }

   public operator fun component5(): Boolean {
      return this.deleteNodeOnBackspace;
   }

   public operator fun component6(): TapAction? {
      return this.tapAction;
   }

   public operator fun component7(): Boolean {
      return this.editDisabled;
   }

   public fun copy(
      type: Int = var0.type,
      location: Int = var0.location,
      length: Int = var0.length,
      style: ChatInputNodeStyle? = var0.style,
      deleteNodeOnBackspace: Boolean = var0.deleteNodeOnBackspace,
      tapAction: TapAction? = var0.tapAction,
      editDisabled: Boolean = var0.editDisabled
   ): ChatInputNode {
      return new ChatInputNode(var1, var2, var3, var4, var5, var6, var7);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChatInputNode) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (this.location != var1.location) {
            return false;
         } else if (this.length != var1.length) {
            return false;
         } else if (!r.c(this.style, var1.style)) {
            return false;
         } else if (this.deleteNodeOnBackspace != var1.deleteNodeOnBackspace) {
            return false;
         } else if (!r.c(this.tapAction, var1.tapAction)) {
            return false;
         } else {
            return this.editDisabled == var1.editDisabled;
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = Integer.hashCode(this.type);
      val var8: Int = Integer.hashCode(this.location);
      val var7: Int = Integer.hashCode(this.length);
      var var3: Int = 0;
      val var1: Int;
      if (this.style == null) {
         var1 = 0;
      } else {
         var1 = this.style.hashCode();
      }

      var var4: Byte = 1;
      var var2: Byte = this.deleteNodeOnBackspace;
      if (this.deleteNodeOnBackspace != 0) {
         var2 = 1;
      }

      if (this.tapAction != null) {
         var3 = this.tapAction.hashCode();
      }

      if (this.editDisabled == 0) {
         var4 = this.editDisabled;
      }

      return (((((var6 * 31 + var8) * 31 + var7) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4;
   }

   public override fun toString(): String {
      val var3: Int = this.type;
      val var1: Int = this.location;
      val var2: Int = this.length;
      val var8: ChatInputNodeStyle = this.style;
      val var5: Boolean = this.deleteNodeOnBackspace;
      val var7: TapAction = this.tapAction;
      val var4: Boolean = this.editDisabled;
      val var6: StringBuilder = new StringBuilder();
      var6.append("ChatInputNode(type=");
      var6.append(var3);
      var6.append(", location=");
      var6.append(var1);
      var6.append(", length=");
      var6.append(var2);
      var6.append(", style=");
      var6.append(var8);
      var6.append(", deleteNodeOnBackspace=");
      var6.append(var5);
      var6.append(", tapAction=");
      var6.append(var7);
      var6.append(", editDisabled=");
      var6.append(var4);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : f0<ChatInputNode> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ChatInputNode.$serializer = new ChatInputNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.input.bridge.ChatInputNode", var0, 7);
         var1.l("type", false);
         var1.l("location", false);
         var1.l("length", false);
         var1.l("style", true);
         var1.l("deleteNodeOnBackspace", true);
         var1.l("tapAction", true);
         var1.l("editDisabled", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: m0 = m0.a;
         val var2: KSerializer = a.u(ChatInputNodeStyle.$serializer.INSTANCE);
         val var3: h = h.a;
         return new KSerializer[]{var1, var1, var1, var2, h.a, a.u(TapAction.$serializer.INSTANCE), var3};
      }

      public open fun deserialize(decoder: Decoder): ChatInputNode {
         r.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         var var3: Byte;
         val var5: Int;
         var var6: Int;
         val var8: Int;
         var var10: Any;
         var var13: Any;
         var var16: Int;
         var var19: Byte;
         if (var12.p()) {
            var16 = var12.i(var11, 0);
            var19 = var12.i(var11, 1);
            var8 = var12.i(var11, 2);
            var13 = var12.n(var11, 3, ChatInputNodeStyle.$serializer.INSTANCE, null);
            var3 = var12.C(var11, 4);
            var10 = var12.n(var11, 5, TapAction.$serializer.INSTANCE, null);
            val var2: Byte = var12.C(var11, 6);
            var5 = 127;
            var6 = var16;
            var16 = var19;
            var19 = var2;
         } else {
            var var20: Boolean = true;
            var6 = 0;
            var var18: Byte = 0;
            var16 = 0;
            var3 = 0;
            var var14: Int = 0;
            var13 = null;
            var10 = null;
            var19 = 0;

            while (var20) {
               val var9: Int = var12.o(var11);
               switch (var9) {
                  case -1:
                     var20 = false;
                     break;
                  case 0:
                     var6 = var12.i(var11, 0);
                     var14 |= 1;
                     break;
                  case 1:
                     var3 = var12.i(var11, 1);
                     var14 |= 2;
                     break;
                  case 2:
                     var16 = var12.i(var11, 2);
                     var14 |= 4;
                     break;
                  case 3:
                     var13 = var12.n(var11, 3, ChatInputNodeStyle.$serializer.INSTANCE, var13);
                     var14 |= 8;
                     break;
                  case 4:
                     var18 = var12.C(var11, 4);
                     var14 |= 16;
                     break;
                  case 5:
                     var10 = var12.n(var11, 5, TapAction.$serializer.INSTANCE, var10);
                     var14 |= 32;
                     break;
                  case 6:
                     var19 = var12.C(var11, 6);
                     var14 |= 64;
                     break;
                  default:
                     throw new n(var9);
               }
            }

            var8 = var16;
            var16 = var3;
            var3 = var18;
            var5 = var14;
         }

         var12.c(var11);
         return new ChatInputNode(var5, var6, var16, var8, var13 as ChatInputNodeStyle, (boolean)var3, var10 as TapAction, (boolean)var19, null);
      }

      public open fun serialize(encoder: Encoder, value: ChatInputNode) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ChatInputNode.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ChatInputNode> {
         return ChatInputNode.$serializer.INSTANCE;
      }
   }
}
