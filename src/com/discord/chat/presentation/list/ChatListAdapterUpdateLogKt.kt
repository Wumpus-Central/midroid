package com.discord.chat.presentation.list

import com.discord.chat.listmanager.ChatListAction
import com.discord.chat.listmanager.ListOperation

@JvmSynthetic
fun `access$label`(var0: ChatListAction): java.lang.String {
   return label(var0);
}

@JvmSynthetic
fun `access$label`(var0: ListOperation): java.lang.String {
   return label(var0);
}

private fun ChatListAction.label(): String {
   if (var0 is ChatListAction.Clear) {
      return "Clear";
   } else if (var0 is ChatListAction.Noop) {
      return "Noop";
   } else if (var0 is ChatListAction.ScrollTo) {
      return "ScrollTo";
   } else if (var0 is ChatListAction.StickToBottomIfAtBottom) {
      return "StickToBottomIfAtBottom";
   } else {
      throw new fm.p();
   }
}

private fun ListOperation.label(): String {
   if (var0 is ListOperation.Insert) {
      val var16: Int = (var0 as ListOperation.Insert).getIndex();
      val var11: StringBuilder = new StringBuilder();
      var11.append("INS(");
      var11.append(var16);
      var11.append(")");
      return var11.toString();
   } else if (var0 is ListOperation.InsertRange) {
      val var15: Int = (var0 as ListOperation.InsertRange).getFirst();
      val var18: Int = (var0 as ListOperation.InsertRange).getLast();
      val var10: StringBuilder = new StringBuilder();
      var10.append("IRNG(");
      var10.append(var15);
      var10.append("-");
      var10.append(var18);
      var10.append(")");
      return var10.toString();
   } else if (var0 is ListOperation.Remove) {
      val var14: Int = (var0 as ListOperation.Remove).getIndex();
      val var8: StringBuilder = new StringBuilder();
      var8.append("REM(");
      var8.append(var14);
      var8.append(")");
      return var8.toString();
   } else if (var0 is ListOperation.RemoveRange) {
      val var17: Int = (var0 as ListOperation.RemoveRange).getFirst();
      val var13: Int = (var0 as ListOperation.RemoveRange).getLast();
      val var7: StringBuilder = new StringBuilder();
      var7.append("RRNG(");
      var7.append(var17);
      var7.append("-");
      var7.append(var13);
      var7.append(")");
      return var7.toString();
   } else if (var0 is ListOperation.Change) {
      val var12: Int = (var0 as ListOperation.Change).getIndex();
      val var5: StringBuilder = new StringBuilder();
      var5.append("CHA(");
      var5.append(var12);
      var5.append(")");
      return var5.toString();
   } else if (var0 is ListOperation.ChangeRange) {
      val var2: Int = (var0 as ListOperation.ChangeRange).getFirst();
      val var1: Int = (var0 as ListOperation.ChangeRange).getLast();
      val var4: StringBuilder = new StringBuilder();
      var4.append("CRNG(");
      var4.append(var2);
      var4.append("-");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   } else {
      throw new fm.p();
   }
}
