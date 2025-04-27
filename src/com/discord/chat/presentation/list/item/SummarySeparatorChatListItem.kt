package com.discord.chat.presentation.list.item

import com.discord.chat.bridge.summaries.Summary
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class SummarySeparatorChatListItem(color: Int, summary: Summary, isBeforeContent: Boolean) : ChatListItem {
   public final val color: Int

   public final val currentMsgId: MessageId
      public final get() {
         val var1: java.lang.String;
         if (this.isBeforeContent) {
            var1 = this.summary.getStartId-3Eiw7ao();
         } else {
            var1 = this.summary.getEndId-3Eiw7ao();
         }

         return var1;
      }


   public final val isBeforeContent: Boolean

   public final val jumpToMsgId: MessageId
      public final get() {
         val var1: java.lang.String;
         if (this.isBeforeContent) {
            var1 = this.summary.getEndId-3Eiw7ao();
         } else {
            var1 = this.summary.getStartId-3Eiw7ao();
         }

         return var1;
      }


   public final val summary: Summary

   public final val text: String
      public final get() {
         return this.summary.getTopic();
      }


   init {
      q.h(var2, "summary");
      val var5: java.lang.String = var2.getId();
      val var4: java.lang.String;
      if (var3) {
         var4 = "start";
      } else {
         var4 = "end";
      }

      val var6: StringBuilder = new StringBuilder();
      var6.append("separator: ");
      var6.append(var5);
      var6.append("-");
      var6.append(var4);
      super(var6.toString(), null);
      this.color = var1;
      this.summary = var2;
      this.isBeforeContent = var3;
   }

   public operator fun component1(): Int {
      return this.color;
   }

   public operator fun component2(): Summary {
      return this.summary;
   }

   public operator fun component3(): Boolean {
      return this.isBeforeContent;
   }

   public fun copy(color: Int = var0.color, summary: Summary = var0.summary, isBeforeContent: Boolean = var0.isBeforeContent): SummarySeparatorChatListItem {
      q.h(var2, "summary");
      return new SummarySeparatorChatListItem(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SummarySeparatorChatListItem) {
         return false;
      } else {
         var1 = var1;
         if (this.color != var1.color) {
            return false;
         } else if (!q.c(this.summary, var1.summary)) {
            return false;
         } else {
            return this.isBeforeContent == var1.isBeforeContent;
         }
      }
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.color) * 31 + this.summary.hashCode()) * 31 + java.lang.Boolean.hashCode(this.isBeforeContent);
   }

   public override fun toString(): String {
      val var1: Int = this.color;
      val var3: Summary = this.summary;
      val var2: Boolean = this.isBeforeContent;
      val var4: StringBuilder = new StringBuilder();
      var4.append("SummarySeparatorChatListItem(color=");
      var4.append(var1);
      var4.append(", summary=");
      var4.append(var3);
      var4.append(", isBeforeContent=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }
}
