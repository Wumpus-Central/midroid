package com.discord.chat.bridge.botuikit

import kotlinx.serialization.KSerializer
import mb.g

@g
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
) : BaseActionComponent() {
   public open val type: Int
   public open val id: String
   public open val state: ActionComponentState
   public open val customId: String?
   public final val label: String?
   public final val style: ButtonStyle
   public final val disabled: Boolean
   public final val emoji: ComponentEmoji?
   public final val url: String?
   public final val skuId: String?

   init {
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
         } else if (!(this.id == var1.id)) {
            return false;
         } else if (this.state != var1.state) {
            return false;
         } else if (!(this.customId == var1.customId)) {
            return false;
         } else if (!(this.label == var1.label)) {
            return false;
         } else if (this.style != var1.style) {
            return false;
         } else if (this.disabled != var1.disabled) {
            return false;
         } else if (!(this.emoji == var1.emoji)) {
            return false;
         } else if (!(this.url == var1.url)) {
            return false;
         } else {
            return this.skuId == var1.skuId;
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = Integer.hashCode(this.type);
      val var8: Int = this.id.hashCode();
      val var7: Int = this.state.hashCode();
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

      return ((((((((var6 * 31 + var8) * 31 + var7) * 31 + var1) * 31 + var2) * 31 + var10) * 31 + var9) * 31 + var3) * 31 + var4) * 31 + var5;
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var9: java.lang.String = this.id;
      val var5: ActionComponentState = this.state;
      val var6: java.lang.String = this.customId;
      val var3: java.lang.String = this.label;
      val var11: ButtonStyle = this.style;
      val var2: Boolean = this.disabled;
      val var8: ComponentEmoji = this.emoji;
      val var4: java.lang.String = this.url;
      val var10: java.lang.String = this.skuId;
      val var7: StringBuilder = new StringBuilder();
      var7.append("ButtonComponent(type=");
      var7.append(var1);
      var7.append(", id=");
      var7.append(var9);
      var7.append(", state=");
      var7.append(var5);
      var7.append(", customId=");
      var7.append(var6);
      var7.append(", label=");
      var7.append(var3);
      var7.append(", style=");
      var7.append(var11);
      var7.append(", disabled=");
      var7.append(var2);
      var7.append(", emoji=");
      var7.append(var8);
      var7.append(", url=");
      var7.append(var4);
      var7.append(", skuId=");
      var7.append(var10);
      var7.append(")");
      return var7.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ButtonComponent> {
         return ButtonComponent.$serializer.INSTANCE;
      }
   }
}
