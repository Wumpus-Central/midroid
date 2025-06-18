package com.discord.chat.bridge.polls

import kb.f
import kotlinx.serialization.KSerializer
import s9.q

@f
public data class PollResources(selectedIcon: String, checkmarkIcon: String, styles: Map<String, PollStyleSet> = q.h()) {
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
      kotlin.jvm.internal.q.h(var1, "selectedIcon");
      kotlin.jvm.internal.q.h(var2, "checkmarkIcon");
      kotlin.jvm.internal.q.h(var3, "styles");
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
      kotlin.jvm.internal.q.h(var1, "selectedIcon");
      kotlin.jvm.internal.q.h(var2, "checkmarkIcon");
      kotlin.jvm.internal.q.h(var3, "styles");
      return new PollResources(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollResources) {
         return false;
      } else {
         var1 = var1;
         if (!kotlin.jvm.internal.q.c(this.selectedIcon, var1.selectedIcon)) {
            return false;
         } else if (!kotlin.jvm.internal.q.c(this.checkmarkIcon, var1.checkmarkIcon)) {
            return false;
         } else {
            return kotlin.jvm.internal.q.c(this.styles, var1.styles);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.selectedIcon.hashCode() * 31 + this.checkmarkIcon.hashCode()) * 31 + this.styles.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.selectedIcon;
      val var4: java.lang.String = this.checkmarkIcon;
      val var3: java.util.Map = this.styles;
      val var2: StringBuilder = new StringBuilder();
      var2.append("PollResources(selectedIcon=");
      var2.append(var1);
      var2.append(", checkmarkIcon=");
      var2.append(var4);
      var2.append(", styles=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<PollResources> {
         return PollResources.$serializer.INSTANCE;
      }
   }
}
