package com.discord.chat.bridge.codedlinks

import kotlinx.serialization.KSerializer
import nb.g

@g
public data class AppMessageActionImpl(id: String, label: String, disabled: Boolean? = null) : AppMessageEmbedAction {
   public open val id: String
   public open val label: String
   public open val disabled: Boolean?

   init {
      super();
      this.id = var1;
      this.label = var2;
      this.disabled = var3;
   }

   public operator fun component1(): String {
      return this.id;
   }

   public operator fun component2(): String {
      return this.label;
   }

   public operator fun component3(): Boolean? {
      return this.disabled;
   }

   public fun copy(id: String = var0.id, label: String = var0.label, disabled: Boolean? = var0.disabled): AppMessageActionImpl {
      return new AppMessageActionImpl(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AppMessageActionImpl) {
         return false;
      } else {
         var1 = var1;
         if (!(this.id == var1.id)) {
            return false;
         } else if (!(this.label == var1.label)) {
            return false;
         } else {
            return this.disabled == var1.disabled;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.id.hashCode();
      val var2: Int = this.label.hashCode();
      val var1: Int;
      if (this.disabled == null) {
         var1 = 0;
      } else {
         var1 = this.disabled.hashCode();
      }

      return (var3 * 31 + var2) * 31 + var1;
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.id;
      val var1: java.lang.String = this.label;
      val var2: java.lang.Boolean = this.disabled;
      val var4: StringBuilder = new StringBuilder();
      var4.append("AppMessageActionImpl(id=");
      var4.append(var3);
      var4.append(", label=");
      var4.append(var1);
      var4.append(", disabled=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<AppMessageActionImpl> {
         return AppMessageActionImpl.$serializer.INSTANCE;
      }
   }
}
