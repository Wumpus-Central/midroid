package com.discord.emoji

import kotlin.jvm.internal.r

public inline class Surrogates {
   public final val value: String

   @JvmStatic
   fun `constructor-impl`(var0: java.lang.String): java.lang.String {
      r.h(var0, "value");
      return var0;
   }

   @JvmStatic
   public open operator fun equals(other: Any?): Boolean {
      if (var1 !is Surrogates) {
         return false;
      } else {
         return r.c(var0, (var1 as Surrogates).unbox-impl());
      }
   }

   @JvmStatic
   fun `equals-impl0`(var0: java.lang.String, var1: java.lang.String): Boolean {
      return r.c(var0, var1);
   }

   @JvmStatic
   public open fun hashCode(): Int {
      return var0.hashCode();
   }

   @JvmStatic
   public fun toAssetUrl(): String {
      val var1: java.lang.String = toCodePoints-impl(var0);
      val var2: StringBuilder = new StringBuilder();
      var2.append("asset:///emoji-");
      var2.append(var1);
      var2.append(".png");
      return var2.toString();
   }

   @JvmStatic
   private fun toCodePoints(): String {
      val var4: StringBuilder = new StringBuilder();
      var var1: Int = 0;

      while (var1 < var0.length()) {
         val var3: Int = var0.codePointAt(var1);
         val var2: Boolean;
         if (var4.length() > 0) {
            var2 = true;
         } else {
            var2 = false;
         }

         if (var2) {
            var4.append("-");
         }

         var4.append(Integer.toHexString(var3));
         var1 += Character.charCount(var3);
      }

      var0 = var4.toString();
      r.g(var0, "StringBuilder().apply(builderAction).toString()");
      return var0;
   }

   @JvmStatic
   public open fun toString(): String {
      val var1: StringBuilder = new StringBuilder();
      var1.append("Surrogates(value=");
      var1.append(var0);
      var1.append(")");
      return var1.toString();
   }

   @JvmStatic
   public fun withoutDiversity(): String {
      val var1: CharArray = Character.toChars(var0.codePointAt(0));
      r.g(var1, "toChars(value.codePointAt(0))");
      return b.a0(var1, "", null, null, 0, null, null, 62, null);
   }

   override fun equals(var1: Any): Boolean {
      return equals-impl(this.value, var1);
   }

   override fun hashCode(): Int {
      return hashCode-impl(this.value);
   }

   override fun toString(): java.lang.String {
      return toString-impl(this.value);
   }
}
