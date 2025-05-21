package com.discord.chat.bridge.botuikit

import Ja.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class ActionRowComponent(type: Int, id: String, errorText: String? = null, components: List<Component>) : BaseLayoutComponent {
   public open val type: Int
   public open val id: String
   public open val errorText: String?
   public final val components: List<Component>

   init {
      q.h(var2, "id");
      q.h(var4, "components");
      super(null);
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
      q.h(var2, "id");
      q.h(var4, "components");
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
         } else if (!q.c(this.id, var1.id)) {
            return false;
         } else if (!q.c(this.errorText, var1.errorText)) {
            return false;
         } else {
            return q.c(this.components, var1.components);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = Integer.hashCode(this.type);
      val var3: Int = this.id.hashCode();
      val var1: Int;
      if (this.errorText == null) {
         var1 = 0;
      } else {
         var1 = this.errorText.hashCode();
      }

      return ((var2 * 31 + var3) * 31 + var1) * 31 + this.components.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var3: java.lang.String = this.id;
      val var5: java.lang.String = this.errorText;
      val var4: java.util.List = this.components;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ActionRowComponent(type=");
      var2.append(var1);
      var2.append(", id=");
      var2.append(var3);
      var2.append(", errorText=");
      var2.append(var5);
      var2.append(", components=");
      var2.append(var4);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ActionRowComponent> {
         return ActionRowComponent.$serializer.INSTANCE;
      }
   }
}
