package com.discord.chat.presentation.list

import com.discord.chat.listmanager.ChatListAction
import com.discord.chat.listmanager.ListOperation
import eh.p

@JvmSynthetic
fun `access$label`(var0: ChatListAction): java.lang.String {
   return label(var0);
}

@JvmSynthetic
fun `access$label`(var0: ListOperation): java.lang.String {
   return label(var0);
}

private fun ChatListAction.label(): String {
   val var1: java.lang.String;
   if (var0 is ChatListAction.Clear) {
      var1 = "Clear";
   } else if (var0 is ChatListAction.Noop) {
      var1 = "Noop";
   } else if (var0 is ChatListAction.ScrollTo) {
      var1 = "ScrollTo";
   } else {
      if (var0 !is ChatListAction.StickToBottomIfAtBottom) {
         throw new p();
      }

      var1 = "StickToBottomIfAtBottom";
   }

   return var1;
}

private fun ListOperation.label(): String {
   val var4: java.lang.String;
   if (var0 is ListOperation.Insert) {
      val var1: Int = (var0 as ListOperation.Insert).getIndex();
      val var3: StringBuilder = new StringBuilder();
      var3.append("INS(");
      var3.append(var1);
      var3.append(")");
      var4 = var3.toString();
   } else if (var0 is ListOperation.InsertRange) {
      val var2: Int = (var0 as ListOperation.InsertRange).getFirst();
      val var13: Int = (var0 as ListOperation.InsertRange).getLast();
      val var6: StringBuilder = new StringBuilder();
      var6.append("IRNG(");
      var6.append(var2);
      var6.append("-");
      var6.append(var13);
      var6.append(")");
      var4 = var6.toString();
   } else if (var0 is ListOperation.Remove) {
      val var14: Int = (var0 as ListOperation.Remove).getIndex();
      val var7: StringBuilder = new StringBuilder();
      var7.append("REM(");
      var7.append(var14);
      var7.append(")");
      var4 = var7.toString();
   } else if (var0 is ListOperation.RemoveRange) {
      val var18: Int = (var0 as ListOperation.RemoveRange).getFirst();
      val var15: Int = (var0 as ListOperation.RemoveRange).getLast();
      val var9: StringBuilder = new StringBuilder();
      var9.append("RRNG(");
      var9.append(var18);
      var9.append("-");
      var9.append(var15);
      var9.append(")");
      var4 = var9.toString();
   } else if (var0 is ListOperation.Change) {
      val var16: Int = (var0 as ListOperation.Change).getIndex();
      val var10: StringBuilder = new StringBuilder();
      var10.append("CHA(");
      var10.append(var16);
      var10.append(")");
      var4 = var10.toString();
   } else {
      if (var0 !is ListOperation.ChangeRange) {
         throw new p();
      }

      val var17: Int = (var0 as ListOperation.ChangeRange).getFirst();
      val var19: Int = (var0 as ListOperation.ChangeRange).getLast();
      val var12: StringBuilder = new StringBuilder();
      var12.append("CRNG(");
      var12.append(var17);
      var12.append("-");
      var12.append(var19);
      var12.append(")");
      var4 = var12.toString();
   }

   return var4;
}
