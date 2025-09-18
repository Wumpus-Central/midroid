package com.discord.chat.bridge.spoiler

import kotlin.jvm.functions.Function1

public data class SpoilerConfig(attributes: SpoilerAttributes,
   onTapObscureToggle: (Boolean) -> Unit,
   onReveal: (SpoilerIdentifier) -> Unit,
   onHide: (SpoilerIdentifier) -> Unit
) {
   public final val attributes: SpoilerAttributes
   public final val onTapObscureToggle: (Boolean) -> Unit
   private final val onReveal: (SpoilerIdentifier) -> Unit
   private final val onHide: (SpoilerIdentifier) -> Unit

   init {
      this.attributes = var1;
      this.onTapObscureToggle = var2;
      this.onReveal = var3;
      this.onHide = var4;
   }

   private operator fun component3(): (SpoilerIdentifier) -> Unit {
      return this.onReveal;
   }

   private operator fun component4(): (SpoilerIdentifier) -> Unit {
      return this.onHide;
   }

   public operator fun component1(): SpoilerAttributes {
      return this.attributes;
   }

   public operator fun component2(): (Boolean) -> Unit {
      return this.onTapObscureToggle;
   }

   public fun copy(
      attributes: SpoilerAttributes = var0.attributes,
      onTapObscureToggle: (Boolean) -> Unit = var0.onTapObscureToggle,
      onReveal: (SpoilerIdentifier) -> Unit = var0.onReveal,
      onHide: (SpoilerIdentifier) -> Unit = var0.onHide
   ): SpoilerConfig {
      return new SpoilerConfig(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SpoilerConfig) {
         return false;
      } else {
         var1 = var1;
         if (!(this.attributes == var1.attributes)) {
            return false;
         } else if (!(this.onTapObscureToggle == var1.onTapObscureToggle)) {
            return false;
         } else if (!(this.onReveal == var1.onReveal)) {
            return false;
         } else {
            return this.onHide == var1.onHide;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.attributes.hashCode() * 31 + this.onTapObscureToggle.hashCode()) * 31 + this.onReveal.hashCode()) * 31 + this.onHide.hashCode();
   }

   public fun onHide() {
      this.onHide.invoke(SpoilerIdentifier.box-impl(this.attributes.getIdentifier-Bq9X6Gg()));
   }

   public fun onReveal() {
      this.onReveal.invoke(SpoilerIdentifier.box-impl(this.attributes.getIdentifier-Bq9X6Gg()));
   }

   public override fun toString(): String {
      val var1: SpoilerAttributes = this.attributes;
      val var4: Function1 = this.onTapObscureToggle;
      val var5: Function1 = this.onReveal;
      val var3: Function1 = this.onHide;
      val var2: StringBuilder = new StringBuilder();
      var2.append("SpoilerConfig(attributes=");
      var2.append(var1);
      var2.append(", onTapObscureToggle=");
      var2.append(var4);
      var2.append(", onReveal=");
      var2.append(var5);
      var2.append(", onHide=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }
}
