package com.discord.chat.bridge.botuikit

import fa.f
import fa.n
import ga.a
import ia.C0
import ia.G
import ia.N
import ia.h
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
      val var8: Int = Integer.hashCode(this.type);
      val var7: Int = this.id.hashCode();
      val var6: Int = this.state.hashCode();
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

      return ((((((((var8 * 31 + var7) * 31 + var6) * 31 + var1) * 31 + var2) * 31 + var10) * 31 + var9) * 31 + var3) * 31 + var4) * 31 + var5;
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var11: java.lang.String = this.id;
      val var10: ActionComponentState = this.state;
      val var3: java.lang.String = this.customId;
      val var6: java.lang.String = this.label;
      val var7: ButtonStyle = this.style;
      val var2: Boolean = this.disabled;
      val var8: ComponentEmoji = this.emoji;
      val var4: java.lang.String = this.url;
      val var5: java.lang.String = this.skuId;
      val var9: StringBuilder = new StringBuilder();
      var9.append("ButtonComponent(type=");
      var9.append(var1);
      var9.append(", id=");
      var9.append(var11);
      var9.append(", state=");
      var9.append(var10);
      var9.append(", customId=");
      var9.append(var3);
      var9.append(", label=");
      var9.append(var6);
      var9.append(", style=");
      var9.append(var7);
      var9.append(", disabled=");
      var9.append(var2);
      var9.append(", emoji=");
      var9.append(var8);
      var9.append(", url=");
      var9.append(var4);
      var9.append(", skuId=");
      var9.append(var5);
      var9.append(")");
      return var9.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ButtonComponent.$serializer = new ButtonComponent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("2", var0, 10);
         var1.l("type", false);
         var1.l("id", false);
         var1.l("state", false);
         var1.l("customId", true);
         var1.l("label", true);
         var1.l("style", false);
         var1.l("disabled", true);
         var1.l("emoji", true);
         var1.l("url", true);
         var1.l("skuId", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var6: C0 = C0.a;
         return new KSerializer[]{
            N.a,
            C0.a,
            ActionComponentState.Serializer.INSTANCE,
            a.u(C0.a),
            a.u(var6),
            ButtonStyle.Serializer.INSTANCE,
            h.a,
            a.u(ComponentEmoji.$serializer.INSTANCE),
            a.u(var6),
            a.u(var6)
         };
      }

      public open fun deserialize(decoder: Decoder): ButtonComponent {
         q.h(var1, "decoder");
         val var20: SerialDescriptor = this.getDescriptor();
         val var21: c = var1.c(var20);
         val var8: Boolean = var21.y();
         var var6: Byte = 9;
         val var4: Int;
         var var5: Int;
         var var9: Any;
         var var10: Any;
         var var12: Any;
         var var13: java.lang.String;
         var var14: java.lang.String;
         var var15: java.lang.String;
         val var17: java.lang.String;
         val var23: java.lang.String;
         var var25: Int;
         if (var8) {
            var25 = var21.k(var20, 0);
            var15 = var21.t(var20, 1);
            var12 = var21.m(var20, 2, ActionComponentState.Serializer.INSTANCE, null) as ActionComponentState;
            val var22: C0 = C0.a;
            var14 = var21.v(var20, 3, C0.a, null) as java.lang.String;
            var13 = var21.v(var20, 4, var22, null) as java.lang.String;
            var10 = var21.m(var20, 5, ButtonStyle.Serializer.INSTANCE, null) as ButtonStyle;
            val var3: Byte = var21.s(var20, 6);
            var9 = var21.v(var20, 7, ComponentEmoji.$serializer.INSTANCE, null) as ComponentEmoji;
            val var11: java.lang.String = var21.v(var20, 8, var22, null) as java.lang.String;
            var23 = var21.v(var20, 9, var22, null) as java.lang.String;
            var4 = 1023;
            var5 = var25;
            var25 = var3;
            var17 = var11;
         } else {
            var var28: Boolean = true;
            var var27: Int = 0;
            var25 = 0;
            var15 = null;
            var14 = null;
            var12 = null;
            var13 = null;
            var var32: java.lang.String = null;
            var10 = null;
            var var24: java.lang.String = null;
            var9 = null;
            var5 = 0;

            while (var28) {
               label35: {
                  val var7: Int = var21.x(var20);
                  switch (var7) {
                     case -1:
                        var28 = false;
                        break;
                     case 0:
                        var27 = var21.k(var20, 0);
                        var25 |= 1;
                        break;
                     case 1:
                        var24 = var21.t(var20, 1);
                        var25 |= 2;
                        break;
                     case 2:
                        var9 = var21.m(var20, 2, ActionComponentState.Serializer.INSTANCE, var9) as ActionComponentState;
                        var25 |= 4;
                        break;
                     case 3:
                        var10 = var21.v(var20, 3, C0.a, var10) as java.lang.String;
                        var25 |= 8;
                        break;
                     case 4:
                        var32 = var21.v(var20, 4, C0.a, var32) as java.lang.String;
                        var25 |= 16;
                        break;
                     case 5:
                        var12 = var21.m(var20, 5, ButtonStyle.Serializer.INSTANCE, var12) as ButtonStyle;
                        var25 |= 32;
                        break;
                     case 6:
                        var5 = var21.s(var20, 6);
                        var25 |= 64;
                        break label35;
                     case 7:
                        var13 = var21.v(var20, 7, ComponentEmoji.$serializer.INSTANCE, var13) as ComponentEmoji;
                        var25 |= 128;
                        break label35;
                     case 8:
                        var14 = var21.v(var20, 8, C0.a, var14) as java.lang.String;
                        var25 |= 256;
                        continue;
                     case 9:
                        var15 = var21.v(var20, var6, C0.a, var15) as java.lang.String;
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

            var13 = var32;
            var4 = var25;
            var23 = var15;
            var17 = var14;
            var9 = var13;
            var25 = var5;
            var10 = var12;
            var14 = (java.lang.String)var10;
            var12 = var9;
            var15 = var24;
            var5 = var27;
         }

         var21.b(var20);
         return new ButtonComponent(
            var4, var5, var15, (ActionComponentState)var12, var14, var13, (ButtonStyle)var10, (boolean)var25, (ComponentEmoji)var9, var17, var23, null
         );
      }

      public open fun serialize(encoder: Encoder, value: ButtonComponent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ButtonComponent.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return ia.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ButtonComponent> {
         return ButtonComponent.$serializer.INSTANCE;
      }
   }
}
