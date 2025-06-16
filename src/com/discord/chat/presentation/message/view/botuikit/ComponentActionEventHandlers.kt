package com.discord.chat.presentation.message.view.botuikit

import com.discord.primitives.UserId
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.q

public data class ComponentActionEventHandlers(onTapButtonActionComponent: (String) -> Unit,
   onTapButtonLinkComponent: (String) -> Unit,
   onTapSelectActionComponent: (String) -> Unit,
   onTapContentInventoryEntry: (UserId, String, String) -> Unit
) {
   public final val onTapButtonActionComponent: (String) -> Unit
   public final val onTapButtonLinkComponent: (String) -> Unit
   public final val onTapSelectActionComponent: (String) -> Unit
   public final val onTapContentInventoryEntry: (UserId, String, String) -> Unit

   init {
      q.h(var1, "onTapButtonActionComponent");
      q.h(var2, "onTapButtonLinkComponent");
      q.h(var3, "onTapSelectActionComponent");
      q.h(var4, "onTapContentInventoryEntry");
      super();
      this.onTapButtonActionComponent = var1;
      this.onTapButtonLinkComponent = var2;
      this.onTapSelectActionComponent = var3;
      this.onTapContentInventoryEntry = var4;
   }

   public operator fun component1(): (String) -> Unit {
      return this.onTapButtonActionComponent;
   }

   public operator fun component2(): (String) -> Unit {
      return this.onTapButtonLinkComponent;
   }

   public operator fun component3(): (String) -> Unit {
      return this.onTapSelectActionComponent;
   }

   public operator fun component4(): (UserId, String, String) -> Unit {
      return this.onTapContentInventoryEntry;
   }

   public fun copy(
      onTapButtonActionComponent: (String) -> Unit = var0.onTapButtonActionComponent,
      onTapButtonLinkComponent: (String) -> Unit = var0.onTapButtonLinkComponent,
      onTapSelectActionComponent: (String) -> Unit = var0.onTapSelectActionComponent,
      onTapContentInventoryEntry: (UserId, String, String) -> Unit = var0.onTapContentInventoryEntry
   ): ComponentActionEventHandlers {
      q.h(var1, "onTapButtonActionComponent");
      q.h(var2, "onTapButtonLinkComponent");
      q.h(var3, "onTapSelectActionComponent");
      q.h(var4, "onTapContentInventoryEntry");
      return new ComponentActionEventHandlers(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ComponentActionEventHandlers) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.onTapButtonActionComponent, var1.onTapButtonActionComponent)) {
            return false;
         } else if (!q.c(this.onTapButtonLinkComponent, var1.onTapButtonLinkComponent)) {
            return false;
         } else if (!q.c(this.onTapSelectActionComponent, var1.onTapSelectActionComponent)) {
            return false;
         } else {
            return q.c(this.onTapContentInventoryEntry, var1.onTapContentInventoryEntry);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.onTapButtonActionComponent.hashCode() * 31 + this.onTapButtonLinkComponent.hashCode()) * 31 + this.onTapSelectActionComponent.hashCode())
            * 31
         + this.onTapContentInventoryEntry.hashCode();
   }

   public override fun toString(): String {
      val var1: Function1 = this.onTapButtonActionComponent;
      val var3: Function1 = this.onTapButtonLinkComponent;
      val var5: Function1 = this.onTapSelectActionComponent;
      val var2: Function3 = this.onTapContentInventoryEntry;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ComponentActionEventHandlers(onTapButtonActionComponent=");
      var4.append(var1);
      var4.append(", onTapButtonLinkComponent=");
      var4.append(var3);
      var4.append(", onTapSelectActionComponent=");
      var4.append(var5);
      var4.append(", onTapContentInventoryEntry=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }
}
