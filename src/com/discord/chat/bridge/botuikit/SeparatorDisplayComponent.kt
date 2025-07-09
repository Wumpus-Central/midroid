package com.discord.chat.bridge.botuikit

import kb.f
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer

@f
public data class SeparatorDisplayComponent(type: Int, id: String, divider: Boolean, spacing: SeparatorSpacingSize) : Component {
   public open val type: Int
   public open val id: String
   public final val divider: Boolean
   public final val spacing: SeparatorSpacingSize

   init {
      r.h(var2, "id");
      r.h(var4, "spacing");
      super(null);
      this.type = var1;
      this.id = var2;
      this.divider = var3;
      this.spacing = var4;
   }

   public operator fun component1(): Int {
      return this.type;
   }

   public operator fun component2(): String {
      return this.id;
   }

   public operator fun component3(): Boolean {
      return this.divider;
   }

   public operator fun component4(): SeparatorSpacingSize {
      return this.spacing;
   }

   public fun copy(type: Int = var0.type, id: String = var0.id, divider: Boolean = var0.divider, spacing: SeparatorSpacingSize = var0.spacing): SeparatorDisplayComponent {
      r.h(var2, "id");
      r.h(var4, "spacing");
      return new SeparatorDisplayComponent(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SeparatorDisplayComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (!r.c(this.id, var1.id)) {
            return false;
         } else if (this.divider != var1.divider) {
            return false;
         } else {
            return this.spacing === var1.spacing;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((Integer.hashCode(this.type) * 31 + this.id.hashCode()) * 31 + java.lang.Boolean.hashCode(this.divider)) * 31 + this.spacing.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var4: java.lang.String = this.id;
      val var2: Boolean = this.divider;
      val var5: SeparatorSpacingSize = this.spacing;
      val var3: StringBuilder = new StringBuilder();
      var3.append("SeparatorDisplayComponent(type=");
      var3.append(var1);
      var3.append(", id=");
      var3.append(var4);
      var3.append(", divider=");
      var3.append(var2);
      var3.append(", spacing=");
      var3.append(var5);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<SeparatorDisplayComponent> {
         return SeparatorDisplayComponent.$serializer.INSTANCE;
      }
   }
}
