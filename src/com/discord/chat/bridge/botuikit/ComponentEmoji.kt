package com.discord.chat.bridge.botuikit

import kotlinx.serialization.KSerializer
import mb.g

@g
public data class ComponentEmoji(id: String? = null, name: String, src: String? = null, animated: Boolean = false, surrogates: String? = null) {
   public final val id: String?
   public final val name: String
   public final val src: String?
   public final val animated: Boolean
   public final val surrogates: String?

   init {
      super();
      this.id = var1;
      this.name = var2;
      this.src = var3;
      this.animated = var4;
      this.surrogates = var5;
   }

   public operator fun component1(): String? {
      return this.id;
   }

   public operator fun component2(): String {
      return this.name;
   }

   public operator fun component3(): String? {
      return this.src;
   }

   public operator fun component4(): Boolean {
      return this.animated;
   }

   public operator fun component5(): String? {
      return this.surrogates;
   }

   public fun copy(
      id: String? = var0.id,
      name: String = var0.name,
      src: String? = var0.src,
      animated: Boolean = var0.animated,
      surrogates: String? = var0.surrogates
   ): ComponentEmoji {
      return new ComponentEmoji(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ComponentEmoji) {
         return false;
      } else {
         var1 = var1;
         if (!(this.id == var1.id)) {
            return false;
         } else if (!(this.name == var1.name)) {
            return false;
         } else if (!(this.src == var1.src)) {
            return false;
         } else if (this.animated != var1.animated) {
            return false;
         } else {
            return this.surrogates == var1.surrogates;
         }
      }
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
      val var1: Int;
      if (this.id == null) {
         var1 = 0;
      } else {
         var1 = this.id.hashCode();
      }

      val var4: Int = this.name.hashCode();
      val var2: Int;
      if (this.src == null) {
         var2 = 0;
      } else {
         var2 = this.src.hashCode();
      }

      val var5: Int = java.lang.Boolean.hashCode(this.animated);
      if (this.surrogates != null) {
         var3 = this.surrogates.hashCode();
      }

      return (((var1 * 31 + var4) * 31 + var2) * 31 + var5) * 31 + var3;
   }

   public override fun toString(): String {
      val var6: java.lang.String = this.id;
      val var4: java.lang.String = this.name;
      val var5: java.lang.String = this.src;
      val var1: Boolean = this.animated;
      val var2: java.lang.String = this.surrogates;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ComponentEmoji(id=");
      var3.append(var6);
      var3.append(", name=");
      var3.append(var4);
      var3.append(", src=");
      var3.append(var5);
      var3.append(", animated=");
      var3.append(var1);
      var3.append(", surrogates=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ComponentEmoji> {
         return ComponentEmoji.$serializer.INSTANCE;
      }
   }
}
