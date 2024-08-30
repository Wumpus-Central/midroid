package com.discord.chat.input.bridge

import dn.f
import dn.n
import en.a
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
         } else if (!q.c(this.style, var1.style)) {
            return false;
         } else if (this.deleteNodeOnBackspace != var1.deleteNodeOnBackspace) {
            return false;
         } else if (!q.c(this.tapAction, var1.tapAction)) {
            return false;
         } else {
            return this.editDisabled == var1.editDisabled;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = Integer.hashCode(this.type);
      val var5: Int = Integer.hashCode(this.location);
      val var3: Int = Integer.hashCode(this.length);
      var var2: Int = 0;
      val var1: Int;
      if (this.style == null) {
         var1 = 0;
      } else {
         var1 = this.style.hashCode();
      }

      val var6: Int = java.lang.Boolean.hashCode(this.deleteNodeOnBackspace);
      if (this.tapAction != null) {
         var2 = this.tapAction.hashCode();
      }

      return (((((var4 * 31 + var5) * 31 + var3) * 31 + var1) * 31 + var6) * 31 + var2) * 31 + java.lang.Boolean.hashCode(this.editDisabled);
   }

   public override fun toString(): String {
      val var2: Int = this.type;
      val var1: Int = this.location;
      val var3: Int = this.length;
      val var8: ChatInputNodeStyle = this.style;
      val var5: Boolean = this.deleteNodeOnBackspace;
      val var6: TapAction = this.tapAction;
      val var4: Boolean = this.editDisabled;
      val var7: StringBuilder = new StringBuilder();
      var7.append("ChatInputNode(type=");
      var7.append(var2);
      var7.append(", location=");
      var7.append(var1);
      var7.append(", length=");
      var7.append(var3);
      var7.append(", style=");
      var7.append(var8);
      var7.append(", deleteNodeOnBackspace=");
      var7.append(var5);
      var7.append(", tapAction=");
      var7.append(var6);
      var7.append(", editDisabled=");
      var7.append(var4);
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
         val var2: n0 = n0.a;
         val var1: KSerializer = a.u(ChatInputNodeStyle.$serializer.INSTANCE);
         val var3: h = h.a;
         return new KSerializer[]{var2, var2, var2, var1, h.a, a.u(TapAction.$serializer.INSTANCE), var3};
      }

      public open fun deserialize(decoder: Decoder): ChatInputNode {
         q.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.b(var12);
         var var2: Byte;
         var var3: Byte;
         var var4: Int;
         val var5: Int;
         val var6: Int;
         var var7: Int;
         val var10: ChatInputNodeStyle;
         val var11: TapAction;
         if (var13.p()) {
            var7 = var13.i(var12, 0);
            var6 = var13.i(var12, 1);
            var4 = var13.i(var12, 2);
            var10 = var13.n(var12, 3, ChatInputNodeStyle.$serializer.INSTANCE, null) as ChatInputNodeStyle;
            var3 = var13.C(var12, 4);
            val var14: TapAction = var13.n(var12, 5, TapAction.$serializer.INSTANCE, null) as TapAction;
            var2 = var13.C(var12, 6);
            var5 = 127;
            var11 = var14;
         } else {
            var var8: Boolean = true;
            var7 = 0;
            var var18: Byte = 0;
            var4 = 0;
            var3 = 0;
            var2 = 0;
            var var15: ChatInputNodeStyle = null;
            var var22: TapAction = null;
            var var19: Byte = 0;

            while (var8) {
               val var9: Int = var13.o(var12);
               switch (var9) {
                  case -1:
                     var8 = false;
                     break;
                  case 0:
                     var7 = var13.i(var12, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var3 = var13.i(var12, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var4 = var13.i(var12, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var15 = var13.n(var12, 3, ChatInputNodeStyle.$serializer.INSTANCE, var15) as ChatInputNodeStyle;
                     var2 |= 8;
                     break;
                  case 4:
                     var18 = var13.C(var12, 4);
                     var2 |= 16;
                     break;
                  case 5:
                     var22 = var13.n(var12, 5, TapAction.$serializer.INSTANCE, var22) as TapAction;
                     var2 |= 32;
                     break;
                  case 6:
                     var19 = var13.C(var12, 6);
                     var2 |= 64;
                     break;
                  default:
                     throw new n(var9);
               }
            }

            var5 = var2;
            var2 = var19;
            var11 = var22;
            var3 = var18;
            var10 = var15;
            var6 = var3;
         }

         var13.c(var12);
         return new ChatInputNode(var5, var7, var6, var4, var10, (boolean)var3, var11, (boolean)var2, null);
      }

      public open fun serialize(encoder: Encoder, value: ChatInputNode) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ChatInputNode.write$Self$chat_input_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ChatInputNode> {
         return ChatInputNode.$serializer.INSTANCE;
      }
   }
}
