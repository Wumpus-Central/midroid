package com.discord.chat.bridge.botuikit

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
import xk.h
import xk.m0

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
      r.h(var2, "id");
      r.h(var3, "state");
      r.h(var6, "style");
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

   @JvmStatic
   public fun `write$Self`(self: ButtonComponent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.getType());
      var1.z(var2, 1, var0.getId());
      var1.y(var2, 2, ActionComponentState.Serializer.INSTANCE, var0.getState());
      var var5: Boolean;
      if (!var1.A(var2, 3) && var0.getCustomId() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 3, a2.a, var0.getCustomId());
      }

      if (!var1.A(var2, 4) && var0.label == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 4, a2.a, var0.label);
      }

      var1.y(var2, 5, ButtonStyle.Serializer.INSTANCE, var0.style);
      if (!var1.A(var2, 6) && !var0.disabled) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.x(var2, 6, var0.disabled);
      }

      if (!var1.A(var2, 7) && var0.emoji == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 7, ComponentEmoji.$serializer.INSTANCE, var0.emoji);
      }

      if (!var1.A(var2, 8) && var0.url == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 8, a2.a, var0.url);
      }

      label56: {
         if (!var1.A(var2, 9)) {
            var5 = false;
            if (var0.skuId == null) {
               break label56;
            }
         }

         var5 = true;
      }

      if (var5) {
         var1.m(var2, 9, a2.a, var0.skuId);
      }
   }

   public operator fun component1(): Int {
      return this.getType();
   }

   public operator fun component10(): String? {
      return this.skuId;
   }

   public operator fun component2(): String {
      return this.getId();
   }

   public operator fun component3(): ActionComponentState {
      return this.getState();
   }

   public operator fun component4(): String? {
      return this.getCustomId();
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
      type: Int = var0.getType(),
      id: String = var0.getId(),
      state: ActionComponentState = var0.getState(),
      customId: String? = var0.getCustomId(),
      label: String? = var0.label,
      style: ButtonStyle = var0.style,
      disabled: Boolean = var0.disabled,
      emoji: ComponentEmoji? = var0.emoji,
      url: String? = var0.url,
      skuId: String? = var0.skuId
   ): ButtonComponent {
      r.h(var2, "id");
      r.h(var3, "state");
      r.h(var6, "style");
      return new ButtonComponent(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ButtonComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.getType() != var1.getType()) {
            return false;
         } else if (!r.c(this.getId(), var1.getId())) {
            return false;
         } else if (this.getState() != var1.getState()) {
            return false;
         } else if (!r.c(this.getCustomId(), var1.getCustomId())) {
            return false;
         } else if (!r.c(this.label, var1.label)) {
            return false;
         } else if (this.style != var1.style) {
            return false;
         } else if (this.disabled != var1.disabled) {
            return false;
         } else if (!r.c(this.emoji, var1.emoji)) {
            return false;
         } else if (!r.c(this.url, var1.url)) {
            return false;
         } else {
            return r.c(this.skuId, var1.skuId);
         }
      }
   }

   public override fun hashCode(): Int {
      val var9: Int = Integer.hashCode(this.getType());
      val var7: Int = this.getId().hashCode();
      val var8: Int = this.getState().hashCode();
      val var11: java.lang.String = this.getCustomId();
      var var6: Int = 0;
      val var1: Int;
      if (var11 == null) {
         var1 = 0;
      } else {
         var1 = this.getCustomId().hashCode();
      }

      val var2: Int;
      if (this.label == null) {
         var2 = 0;
      } else {
         var2 = this.label.hashCode();
      }

      val var10: Int = this.style.hashCode();
      var var3: Byte = this.disabled;
      if (this.disabled != 0) {
         var3 = 1;
      }

      val var12: Int;
      if (this.emoji == null) {
         var12 = 0;
      } else {
         var12 = this.emoji.hashCode();
      }

      val var5: Int;
      if (this.url == null) {
         var5 = 0;
      } else {
         var5 = this.url.hashCode();
      }

      if (this.skuId != null) {
         var6 = this.skuId.hashCode();
      }

      return ((((((((var9 * 31 + var7) * 31 + var8) * 31 + var1) * 31 + var2) * 31 + var10) * 31 + var3) * 31 + var12) * 31 + var5) * 31 + var6;
   }

   public override fun toString(): String {
      val var1: Int = this.getType();
      val var9: java.lang.String = this.getId();
      val var4: ActionComponentState = this.getState();
      val var8: java.lang.String = this.getCustomId();
      val var5: java.lang.String = this.label;
      val var3: ButtonStyle = this.style;
      val var2: Boolean = this.disabled;
      val var10: ComponentEmoji = this.emoji;
      val var7: java.lang.String = this.url;
      val var11: java.lang.String = this.skuId;
      val var6: StringBuilder = new StringBuilder();
      var6.append("ButtonComponent(type=");
      var6.append(var1);
      var6.append(", id=");
      var6.append(var9);
      var6.append(", state=");
      var6.append(var4);
      var6.append(", customId=");
      var6.append(var8);
      var6.append(", label=");
      var6.append(var5);
      var6.append(", style=");
      var6.append(var3);
      var6.append(", disabled=");
      var6.append(var2);
      var6.append(", emoji=");
      var6.append(var10);
      var6.append(", url=");
      var6.append(var7);
      var6.append(", skuId=");
      var6.append(var11);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : f0<ButtonComponent> {
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
         val var1: a2 = a2.a;
         return new KSerializer[]{
            m0.a,
            a2.a,
            ActionComponentState.Serializer.INSTANCE,
            a.u(a2.a),
            a.u(var1),
            ButtonStyle.Serializer.INSTANCE,
            h.a,
            a.u(ComponentEmoji.$serializer.INSTANCE),
            a.u(var1),
            a.u(var1)
         };
      }

      public open fun deserialize(decoder: Decoder): ButtonComponent {
         r.h(var1, "decoder");
         val var18: SerialDescriptor = this.getDescriptor();
         val var19: c = var1.b(var18);
         val var8: Boolean = var19.p();
         var var3: Int = 9;
         var var4: Int;
         var var5: Int;
         var var9: Any;
         var var10: Any;
         var var11: Any;
         var var12: Any;
         var var13: Any;
         var var14: Any;
         var var20: Any;
         var var30: Any;
         if (var8) {
            var4 = var19.i(var18, 0);
            var9 = var19.m(var18, 1);
            var12 = var19.y(var18, 2, ActionComponentState.Serializer.INSTANCE, null);
            var30 = a2.a;
            var20 = var19.n(var18, 3, a2.a, null);
            var10 = var19.n(var18, 4, (DeserializationStrategy)var30, null);
            var11 = var19.y(var18, 5, ButtonStyle.Serializer.INSTANCE, null);
            val var2: Byte = var19.C(var18, 6);
            var13 = var19.n(var18, 7, ComponentEmoji.$serializer.INSTANCE, null);
            var14 = var19.n(var18, 8, (DeserializationStrategy)var30, null);
            var30 = var19.n(var18, 9, (DeserializationStrategy)var30, null);
            var3 = 1023;
            var5 = var2;
         } else {
            var var6: Boolean = true;
            var5 = 0;
            var var22: Int = 0;
            var30 = null;
            var14 = null;
            var11 = null;
            var13 = null;
            var12 = null;
            var9 = null;
            var20 = null;
            var10 = null;
            var4 = 0;

            while (var6) {
               label35: {
                  val var7: Int = var19.o(var18);
                  switch (var7) {
                     case -1:
                        var6 = false;
                        var3 = 9;
                        continue;
                     case 0:
                        var5 = var19.i(var18, 0);
                        var22 |= 1;
                        break;
                     case 1:
                        var20 = var19.m(var18, 1);
                        var22 |= 2;
                        break;
                     case 2:
                        var10 = var19.y(var18, 2, ActionComponentState.Serializer.INSTANCE, var10);
                        var22 |= 4;
                        break;
                     case 3:
                        var9 = var19.n(var18, 3, a2.a, var9);
                        var22 |= 8;
                        break;
                     case 4:
                        var12 = var19.n(var18, 4, a2.a, var12);
                        var22 |= 16;
                        break;
                     case 5:
                        var11 = var19.y(var18, 5, ButtonStyle.Serializer.INSTANCE, var11);
                        var22 |= 32;
                        break;
                     case 6:
                        var4 = var19.C(var18, 6);
                        var22 |= 64;
                        break label35;
                     case 7:
                        var13 = var19.n(var18, 7, ComponentEmoji.$serializer.INSTANCE, var13);
                        var22 |= 128;
                        break label35;
                     case 8:
                        var14 = var19.n(var18, 8, a2.a, var14);
                        var22 |= 256;
                        continue;
                     case 9:
                        var30 = var19.n(var18, var3, a2.a, var30);
                        var22 |= 512;
                        continue;
                     default:
                        throw new n(var7);
                  }

                  var3 = 9;
                  continue;
               }

               var3 = 9;
            }

            var5 = var4;
            var20 = var9;
            var12 = var10;
            var10 = var12;
            var9 = var20;
            var4 = var5;
            var3 = var22;
         }

         var19.c(var18);
         return new ButtonComponent(
            var3,
            var4,
            (java.lang.String)var9,
            var12 as ActionComponentState,
            var20 as java.lang.String,
            var10 as java.lang.String,
            var11 as ButtonStyle,
            (boolean)var5,
            var13 as ComponentEmoji,
            var14 as java.lang.String,
            var30 as java.lang.String,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: ButtonComponent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ButtonComponent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ButtonComponent> {
         return ButtonComponent.$serializer.INSTANCE;
      }
   }
}
