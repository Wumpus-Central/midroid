package com.discord.chat.presentation.message.view.botuikit

import com.discord.primitives.UserId
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function3

public data class ComponentActionEventHandlers(onTapButtonActionComponent: (String) -> Unit,
   onTapButtonLinkComponent: (String) -> Unit,
   onTapSelectActionComponent: (String) -> Unit,
   onTapContentInventoryEntry: (UserId, String, String) -> Unit,
   onTapCheckpointCard: (UserId) -> Unit
) {
   public final val onTapButtonActionComponent: (String) -> Unit
   public final val onTapButtonLinkComponent: (String) -> Unit
   public final val onTapSelectActionComponent: (String) -> Unit
   public final val onTapContentInventoryEntry: (UserId, String, String) -> Unit
   public final val onTapCheckpointCard: (UserId) -> Unit

   init {
      this.onTapButtonActionComponent = var1;
      this.onTapButtonLinkComponent = var2;
      this.onTapSelectActionComponent = var3;
      this.onTapContentInventoryEntry = var4;
      this.onTapCheckpointCard = var5;
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

   public operator fun component5(): (UserId) -> Unit {
      return this.onTapCheckpointCard;
   }

   public fun copy(
      onTapButtonActionComponent: (String) -> Unit = var0.onTapButtonActionComponent,
      onTapButtonLinkComponent: (String) -> Unit = var0.onTapButtonLinkComponent,
      onTapSelectActionComponent: (String) -> Unit = var0.onTapSelectActionComponent,
      onTapContentInventoryEntry: (UserId, String, String) -> Unit = var0.onTapContentInventoryEntry,
      onTapCheckpointCard: (UserId) -> Unit = var0.onTapCheckpointCard
   ): ComponentActionEventHandlers {
      return new ComponentActionEventHandlers(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ComponentActionEventHandlers) {
         return false;
      } else {
         var1 = var1;
         if (!(this.onTapButtonActionComponent == var1.onTapButtonActionComponent)) {
            return false;
         } else if (!(this.onTapButtonLinkComponent == var1.onTapButtonLinkComponent)) {
            return false;
         } else if (!(this.onTapSelectActionComponent == var1.onTapSelectActionComponent)) {
            return false;
         } else if (!(this.onTapContentInventoryEntry == var1.onTapContentInventoryEntry)) {
            return false;
         } else {
            return this.onTapCheckpointCard == var1.onTapCheckpointCard;
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               ((this.onTapButtonActionComponent.hashCode() * 31 + this.onTapButtonLinkComponent.hashCode()) * 31 + this.onTapSelectActionComponent.hashCode())
                     * 31
                  + this.onTapContentInventoryEntry.hashCode()
            )
            * 31
         + this.onTapCheckpointCard.hashCode();
   }

   public override fun toString(): String {
      val var5: Function1 = this.onTapButtonActionComponent;
      val var1: Function1 = this.onTapButtonLinkComponent;
      val var3: Function1 = this.onTapSelectActionComponent;
      val var4: Function3 = this.onTapContentInventoryEntry;
      val var2: Function1 = this.onTapCheckpointCard;
      val var6: StringBuilder = new StringBuilder();
      var6.append("ComponentActionEventHandlers(onTapButtonActionComponent=");
      var6.append(var5);
      var6.append(", onTapButtonLinkComponent=");
      var6.append(var1);
      var6.append(", onTapSelectActionComponent=");
      var6.append(var3);
      var6.append(", onTapContentInventoryEntry=");
      var6.append(var4);
      var6.append(", onTapCheckpointCard=");
      var6.append(var2);
      var6.append(")");
      return var6.toString();
   }
}
