package com.discord.chat.bridge.spoiler

import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r

public data class SpoilerConfig(attributes: SpoilerAttributes, onReveal: (SpoilerIdentifier) -> Unit, onHide: (SpoilerIdentifier) -> Unit) {
   public final val attributes: SpoilerAttributes
   private final val onHide: (SpoilerIdentifier) -> Unit
   private final val onReveal: (SpoilerIdentifier) -> Unit

   init {
      r.h(var1, "attributes");
      r.h(var2, "onReveal");
      r.h(var3, "onHide");
      super();
      this.attributes = var1;
      this.onReveal = var2;
      this.onHide = var3;
   }

   private operator fun component2(): (SpoilerIdentifier) -> Unit {
      return this.onReveal;
   }

   private operator fun component3(): (SpoilerIdentifier) -> Unit {
      return this.onHide;
   }

   public operator fun component1(): SpoilerAttributes {
      return this.attributes;
   }

   public fun copy(
      attributes: SpoilerAttributes = var0.attributes,
      onReveal: (SpoilerIdentifier) -> Unit = var0.onReveal,
      onHide: (SpoilerIdentifier) -> Unit = var0.onHide
   ): SpoilerConfig {
      r.h(var1, "attributes");
      r.h(var2, "onReveal");
      r.h(var3, "onHide");
      return new SpoilerConfig(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SpoilerConfig) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.attributes, var1.attributes)) {
            return false;
         } else if (!r.c(this.onReveal, var1.onReveal)) {
            return false;
         } else {
            return r.c(this.onHide, var1.onHide);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.attributes.hashCode() * 31 + this.onReveal.hashCode()) * 31 + this.onHide.hashCode();
   }

   public fun onHide() {
      this.onHide.invoke(SpoilerIdentifier.box_impl(this.attributes.getIdentifier_Bq9X6Gg()));
   }

   public fun onReveal() {
      this.onReveal.invoke(SpoilerIdentifier.box_impl(this.attributes.getIdentifier_Bq9X6Gg()));
   }

   public override fun toString(): String {
      val var1: SpoilerAttributes = this.attributes;
      val var3: Function1 = this.onReveal;
      val var2: Function1 = this.onHide;
      val var4: StringBuilder = new StringBuilder();
      var4.append("SpoilerConfig(attributes=");
      var4.append(var1);
      var4.append(", onReveal=");
      var4.append(var3);
      var4.append(", onHide=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }
}
