package com.discord.chat.bridge.botuikit

import kotlinx.serialization.KSerializer
import mb.g

@g
public data class ActionRowComponent(type: Int, id: String, errorText: String? = null, components: List<Component>) : BaseLayoutComponent() {
   public open val type: Int
   public open val id: String
   public open val errorText: String?
   public final val components: List<Component>

   init {
      this.type = var1;
      this.id = var2;
      this.errorText = var3;
      this.components = var4;
   }

   public operator fun component1(): Int {
      return this.type;
   }

   public operator fun component2(): String {
      return this.id;
   }

   public operator fun component3(): String? {
      return this.errorText;
   }

   public operator fun component4(): List<Component> {
      return this.components;
   }

   public fun copy(type: Int = var0.type, id: String = var0.id, errorText: String? = var0.errorText, components: List<Component> = var0.components): ActionRowComponent {
      return new ActionRowComponent(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ActionRowComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (!(this.id == var1.id)) {
            return false;
         } else if (!(this.errorText == var1.errorText)) {
            return false;
         } else {
            return this.components == var1.components;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = Integer.hashCode(this.type);
      val var2: Int = this.id.hashCode();
      val var1: Int;
      if (this.errorText == null) {
         var1 = 0;
      } else {
         var1 = this.errorText.hashCode();
      }

      return ((var3 * 31 + var2) * 31 + var1) * 31 + this.components.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var3: java.lang.String = this.id;
      val var2: java.lang.String = this.errorText;
      val var4: java.util.List = this.components;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ActionRowComponent(type=");
      var5.append(var1);
      var5.append(", id=");
      var5.append(var3);
      var5.append(", errorText=");
      var5.append(var2);
      var5.append(", components=");
      var5.append(var4);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ActionRowComponent> {
         return ActionRowComponent.$serializer.INSTANCE;
      }
   }
}
