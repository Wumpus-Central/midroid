package com.discord.chat.bridge.botuikit

import kotlinx.serialization.KSerializer
import tp.m

@m
public data class UnknownComponent(type: Int = 0, id: String = "-1") : Component() {
   public open val type: Int
   public open val id: String

   fun UnknownComponent() {
      this(0, null, 3, null);
   }

   init {
      this.type = var1;
      this.id = var2;
   }

   public operator fun component1(): Int {
      return this.type;
   }

   public operator fun component2(): String {
      return this.id;
   }

   public fun copy(type: Int = var0.type, id: String = var0.id): UnknownComponent {
      return new UnknownComponent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UnknownComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else {
            return this.id == var1.id;
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.type) * 31 + this.id.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var3: java.lang.String = this.id;
      val var2: StringBuilder = new StringBuilder();
      var2.append("UnknownComponent(type=");
      var2.append(var1);
      var2.append(", id=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<UnknownComponent> {
         return UnknownComponent.$serializer.INSTANCE;
      }
   }
}
