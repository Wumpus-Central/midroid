package com.discord.chat.bridge.codedlinks

import Xa.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class AppMessageActionImpl(id: String, label: String, disabled: Boolean? = null) : AppMessageEmbedAction {
   public open val id: String
   public open val label: String
   public open val disabled: Boolean?

   init {
      q.h(var1, "id");
      q.h(var2, "label");
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
      q.h(var1, "id");
      q.h(var2, "label");
      return new AppMessageActionImpl(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AppMessageActionImpl) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.id, var1.id)) {
            return false;
         } else if (!q.c(this.label, var1.label)) {
            return false;
         } else {
            return q.c(this.disabled, var1.disabled);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.id.hashCode();
      val var3: Int = this.label.hashCode();
      val var1: Int;
      if (this.disabled == null) {
         var1 = 0;
      } else {
         var1 = this.disabled.hashCode();
      }

      return (var2 * 31 + var3) * 31 + var1;
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.id;
      val var1: java.lang.String = this.label;
      val var3: java.lang.Boolean = this.disabled;
      val var2: StringBuilder = new StringBuilder();
      var2.append("AppMessageActionImpl(id=");
      var2.append(var4);
      var2.append(", label=");
      var2.append(var1);
      var2.append(", disabled=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<AppMessageActionImpl> {
         return AppMessageActionImpl.$serializer.INSTANCE;
      }
   }
}
