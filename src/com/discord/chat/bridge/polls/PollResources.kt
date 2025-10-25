package com.discord.chat.bridge.polls

import kc.m
import kotlinx.serialization.KSerializer

@m
public data class PollResources(selectedIcon: String, checkmarkIcon: String, styles: Map<String, PollStyleSet> = O.i()) {
   public final val selectedIcon: String
   public final val checkmarkIcon: String
   public final val styles: Map<String, PollStyleSet>

   public final val defaultStyle: PollStyleSet
      public final get() {
         val var2: PollStyleSet = this.styles.get("normal");
         var var1: PollStyleSet = var2;
         if (var2 == null) {
            var1 = PollStyleSet.Companion.getDEFAULT();
         }

         return var1;
      }


   init {
      super();
      this.selectedIcon = var1;
      this.checkmarkIcon = var2;
      this.styles = var3;
   }

   public operator fun component1(): String {
      return this.selectedIcon;
   }

   public operator fun component2(): String {
      return this.checkmarkIcon;
   }

   public operator fun component3(): Map<String, PollStyleSet> {
      return this.styles;
   }

   public fun copy(selectedIcon: String = var0.selectedIcon, checkmarkIcon: String = var0.checkmarkIcon, styles: Map<String, PollStyleSet> = var0.styles): PollResources {
      return new PollResources(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollResources) {
         return false;
      } else {
         var1 = var1;
         if (!(this.selectedIcon == var1.selectedIcon)) {
            return false;
         } else if (!(this.checkmarkIcon == var1.checkmarkIcon)) {
            return false;
         } else {
            return this.styles == var1.styles;
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.selectedIcon.hashCode() * 31 + this.checkmarkIcon.hashCode()) * 31 + this.styles.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.selectedIcon;
      val var3: java.lang.String = this.checkmarkIcon;
      val var2: java.util.Map = this.styles;
      val var4: StringBuilder = new StringBuilder();
      var4.append("PollResources(selectedIcon=");
      var4.append(var1);
      var4.append(", checkmarkIcon=");
      var4.append(var3);
      var4.append(", styles=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<PollResources> {
         return PollResources.$serializer.INSTANCE;
      }
   }
}
