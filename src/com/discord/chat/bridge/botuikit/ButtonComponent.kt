package com.discord.chat.bridge.botuikit

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
public data class ButtonComponent(type: Int,
      id: String,
      state: ActionComponentState,
      customId: String? = null,
      label: String? = null,
      style: ButtonStyle,
      disabled: Boolean = false,
      emoji: ComponentEmoji? = null,
      url: String? = null,
      skuId: String? = null
   )
   : BaseActionComponent {
   public open val customId: String?
   public final val disabled: Boolean
   public final val emoji: ComponentEmoji?
   public open val id: String
   public final val label: String?
   public final val skuId: String?
   public open val state: ActionComponentState
   public final val style: ButtonStyle
   public open val type: Int
   public final val url: String?

   init {
      q.h(var2, "id");
      q.h(var3, "state");
      q.h(var6, "style");
      super(null);
      this.type = var1;
      this.id = var2;
      this.state = var3;
      this.customId = var4;
      this.label = var5;
      this.style = var6;
      this.disabled = var7;
      this.emoji = var8;
      this.url = var9;
      this.skuId = var10;
   }

   public operator fun component1(): Int {
      return this.type;
   }

   public operator fun component10(): String? {
      return this.skuId;
   }

   public operator fun component2(): String {
      return this.id;
   }

   public operator fun component3(): ActionComponentState {
      return this.state;
   }

   public operator fun component4(): String? {
      return this.customId;
   }

   public operator fun component5(): String? {
      return this.label;
   }

   public operator fun component6(): ButtonStyle {
      return this.style;
   }

   public operator fun component7(): Boolean {
      return this.disabled;
   }

   public operator fun component8(): ComponentEmoji? {
      return this.emoji;
   }

   public operator fun component9(): String? {
      return this.url;
   }

   public fun copy(
      type: Int = var0.type,
      id: String = var0.id,
      state: ActionComponentState = var0.state,
      customId: String? = var0.customId,
      label: String? = var0.label,
      style: ButtonStyle = var0.style,
      disabled: Boolean = var0.disabled,
      emoji: ComponentEmoji? = var0.emoji,
      url: String? = var0.url,
      skuId: String? = var0.skuId
   ): ButtonComponent {
      q.h(var2, "id");
      q.h(var3, "state");
      q.h(var6, "style");
      return new ButtonComponent(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ButtonComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (!q.c(this.id, var1.id)) {
            return false;
         } else if (this.state != var1.state) {
            return false;
         } else if (!q.c(this.customId, var1.customId)) {
            return false;
         } else if (!q.c(this.label, var1.label)) {
            return false;
         } else if (this.style != var1.style) {
            return false;
         } else if (this.disabled != var1.disabled) {
            return false;
         } else if (!q.c(this.emoji, var1.emoji)) {
            return false;
         } else if (!q.c(this.url, var1.url)) {
            return false;
         } else {
            return q.c(this.skuId, var1.skuId);
         }
      }
   }

   public override fun hashCode(): Int {
      val var7: Int = Integer.hashCode(this.type);
      val var6: Int = this.id.hashCode();
      val var8: Int = this.state.hashCode();
      var var5: Int = 0;
      val var1: Int;
      if (this.customId == null) {
         var1 = 0;
      } else {
         var1 = this.customId.hashCode();
      }

      val var2: Int;
      if (this.label == null) {
         var2 = 0;
      } else {
         var2 = this.label.hashCode();
      }

      val var10: Int = this.style.hashCode();
      val var9: Int = java.lang.Boolean.hashCode(this.disabled);
      val var3: Int;
      if (this.emoji == null) {
         var3 = 0;
      } else {
         var3 = this.emoji.hashCode();
      }

      val var4: Int;
      if (this.url == null) {
         var4 = 0;
      } else {
         var4 = this.url.hashCode();
      }

      if (this.skuId != null) {
         var5 = this.skuId.hashCode();
      }

      return ((((((((var7 * 31 + var6) * 31 + var8) * 31 + var1) * 31 + var2) * 31 + var10) * 31 + var9) * 31 + var3) * 31 + var4) * 31 + var5;
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var9: java.lang.String = this.id;
      val var3: ActionComponentState = this.state;
      val var4: java.lang.String = this.customId;
      val var10: java.lang.String = this.label;
      val var8: ButtonStyle = this.style;
      val var2: Boolean = this.disabled;
      val var5: ComponentEmoji = this.emoji;
      val var11: java.lang.String = this.url;
      val var6: java.lang.String = this.skuId;
      val var7: StringBuilder = new StringBuilder();
      var7.append("ButtonComponent(type=");
      var7.append(var1);
      var7.append(", id=");
      var7.append(var9);
      var7.append(", state=");
      var7.append(var3);
      var7.append(", customId=");
      var7.append(var4);
      var7.append(", label=");
      var7.append(var10);
      var7.append(", style=");
      var7.append(var8);
      var7.append(", disabled=");
      var7.append(var2);
      var7.append(", emoji=");
      var7.append(var5);
      var7.append(", url=");
      var7.append(var11);
      var7.append(", skuId=");
      var7.append(var6);
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
         val var0: ButtonComponent.$serializer = new ButtonComponent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("2", var0, 10);
         var1.c("type", false);
         var1.c("id", false);
         var1.c("state", false);
         var1.c("customId", true);
         var1.c("label", true);
         var1.c("style", false);
         var1.c("disabled", true);
         var1.c("emoji", true);
         var1.c("url", true);
         var1.c("skuId", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: b2 = b2.a;
         return new KSerializer[]{
            n0.a,
            b2.a,
            ActionComponentState.Serializer.INSTANCE,
            a.u(b2.a),
            a.u(var2),
            ButtonStyle.Serializer.INSTANCE,
            h.a,
            a.u(ComponentEmoji.$serializer.INSTANCE),
            a.u(var2),
            a.u(var2)
         };
      }

      public open fun deserialize(decoder: Decoder): ButtonComponent {
         q.h(var1, "decoder");
         val var20: SerialDescriptor = this.getDescriptor();
         val var21: c = var1.b(var20);
         val var8: Boolean = var21.p();
         var var6: Byte = 9;
         var var3: Int;
         var var5: Int;
         var var12: Any;
         var var13: Any;
         var var14: Any;
         var var15: java.lang.String;
         val var16: java.lang.String;
         val var17: java.lang.String;
         val var18: java.lang.String;
         val var19: java.lang.String;
         var var25: Int;
         if (var8) {
            var25 = var21.i(var20, 0);
            var16 = var21.m(var20, 1);
            var12 = var21.y(var20, 2, ActionComponentState.Serializer.INSTANCE, null) as ActionComponentState;
            val var22: b2 = b2.a;
            var18 = var21.n(var20, 3, b2.a, null) as java.lang.String;
            var17 = var21.n(var20, 4, var22, null) as java.lang.String;
            val var10: ButtonStyle = var21.y(var20, 5, ButtonStyle.Serializer.INSTANCE, null) as ButtonStyle;
            val var4: Byte = var21.C(var20, 6);
            val var9: ComponentEmoji = var21.n(var20, 7, ComponentEmoji.$serializer.INSTANCE, null) as ComponentEmoji;
            val var11: java.lang.String = var21.n(var20, 8, var22, null) as java.lang.String;
            val var23: java.lang.String = var21.n(var20, 9, var22, null) as java.lang.String;
            var3 = 1023;
            var5 = var25;
            var13 = var10;
            var25 = var4;
            var14 = var9;
            var19 = var11;
            var15 = var23;
         } else {
            var var28: Boolean = true;
            var3 = 0;
            var25 = 0;
            var15 = null;
            var14 = null;
            var12 = null;
            var13 = null;
            var var33: java.lang.String = null;
            var var32: java.lang.String = null;
            var var24: java.lang.String = null;
            var var31: Any = null;
            var5 = 0;

            while (var28) {
               label35: {
                  val var7: Int = var21.o(var20);
                  switch (var7) {
                     case -1:
                        var28 = false;
                        break;
                     case 0:
                        var3 = var21.i(var20, 0);
                        var25 |= 1;
                        break;
                     case 1:
                        var24 = var21.m(var20, 1);
                        var25 |= 2;
                        break;
                     case 2:
                        var31 = var21.y(var20, 2, ActionComponentState.Serializer.INSTANCE, var31) as ActionComponentState;
                        var25 |= 4;
                        break;
                     case 3:
                        var32 = var21.n(var20, 3, b2.a, var32) as java.lang.String;
                        var25 |= 8;
                        break;
                     case 4:
                        var33 = var21.n(var20, 4, b2.a, var33) as java.lang.String;
                        var25 |= 16;
                        break;
                     case 5:
                        var12 = var21.y(var20, 5, ButtonStyle.Serializer.INSTANCE, var12) as ButtonStyle;
                        var25 |= 32;
                        break;
                     case 6:
                        var5 = var21.C(var20, 6);
                        var25 |= 64;
                        break label35;
                     case 7:
                        var13 = var21.n(var20, 7, ComponentEmoji.$serializer.INSTANCE, var13) as ComponentEmoji;
                        var25 |= 128;
                        break label35;
                     case 8:
                        var14 = var21.n(var20, 8, b2.a, var14) as java.lang.String;
                        var25 |= 256;
                        continue;
                     case 9:
                        var15 = var21.n(var20, var6, b2.a, var15) as java.lang.String;
                        var25 |= 512;
                        continue;
                     default:
                        throw new n(var7);
                  }

                  var6 = 9;
                  continue;
               }

               var6 = 9;
            }

            var19 = (java.lang.String)var14;
            var14 = var13;
            var25 = var5;
            var13 = var12;
            var17 = var33;
            var18 = var32;
            var12 = var31;
            var16 = var24;
            var5 = var3;
            var3 = var25;
         }

         var21.c(var20);
         return new ButtonComponent(
            var3, var5, var16, (ActionComponentState)var12, var18, var17, (ButtonStyle)var13, (boolean)var25, (ComponentEmoji)var14, var19, var15, null
         );
      }

      public open fun serialize(encoder: Encoder, value: ButtonComponent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ButtonComponent.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ButtonComponent> {
         return ButtonComponent.$serializer.INSTANCE;
      }
   }
}
