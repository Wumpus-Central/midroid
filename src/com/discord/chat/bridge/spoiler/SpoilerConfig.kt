package com.discord.chat.bridge.spoiler

import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

public data class SpoilerConfig(attributes: SpoilerAttributes, onReveal: (SpoilerIdentifier) -> Unit, onHide: (SpoilerIdentifier) -> Unit) {
   public final val attributes: SpoilerAttributes
   private final val onHide: (SpoilerIdentifier) -> Unit
   private final val onReveal: (SpoilerIdentifier) -> Unit

   init {
      q.h(var1, "attributes");
      q.h(var2, "onReveal");
      q.h(var3, "onHide");
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
      q.h(var1, "attributes");
      q.h(var2, "onReveal");
      q.h(var3, "onHide");
      return new SpoilerConfig(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SpoilerConfig) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.attributes, var1.attributes)) {
            return false;
         } else if (!q.c(this.onReveal, var1.onReveal)) {
            return false;
         } else {
            return q.c(this.onHide, var1.onHide);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.attributes.hashCode() * 31 + this.onReveal.hashCode()) * 31 + this.onHide.hashCode();
   }

   public fun onHide() {
      this.onHide.invoke(SpoilerIdentifier.box-impl(this.attributes.getIdentifier-Bq9X6Gg()));
   }

   public fun onReveal() {
      this.onReveal.invoke(SpoilerIdentifier.box-impl(this.attributes.getIdentifier-Bq9X6Gg()));
   }

   public override fun toString(): String {
      val var4: SpoilerAttributes = this.attributes;
      val var1: Function1 = this.onReveal;
      val var3: Function1 = this.onHide;
      val var2: StringBuilder = new StringBuilder();
      var2.append("SpoilerConfig(attributes=");
      var2.append(var4);
      var2.append(", onReveal=");
      var2.append(var1);
      var2.append(", onHide=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }
}
