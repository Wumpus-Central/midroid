package com.discord.chat.bridge.row

import Ka.f
import com.discord.chat.bridge.ChangeType
import com.discord.chat.bridge.summaries.Summary
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class SeparatorRow(changeType: ChangeType,
      index: Int,
      text: String,
      id: String,
      color: Int,
      scrollTo: Boolean? = null,
      isBeforeContent: Boolean? = null,
      summary: Summary? = null
   )
   : Row {
   public open val changeType: ChangeType
   public open val index: Int
   public final val text: String
   public final val id: String
   public final val color: Int
   public final val scrollTo: Boolean?
   public final val isBeforeContent: Boolean?
   public final val summary: Summary?

   init {
      q.h(var1, "changeType");
      q.h(var3, "text");
      q.h(var4, "id");
      super(null);
      this.changeType = var1;
      this.index = var2;
      this.text = var3;
      this.id = var4;
      this.color = var5;
      this.scrollTo = var6;
      this.isBeforeContent = var7;
      this.summary = var8;
   }

   public operator fun component1(): ChangeType {
      return this.changeType;
   }

   public operator fun component2(): Int {
      return this.index;
   }

   public operator fun component3(): String {
      return this.text;
   }

   public operator fun component4(): String {
      return this.id;
   }

   public operator fun component5(): Int {
      return this.color;
   }

   public operator fun component6(): Boolean? {
      return this.scrollTo;
   }

   public operator fun component7(): Boolean? {
      return this.isBeforeContent;
   }

   public operator fun component8(): Summary? {
      return this.summary;
   }

   public fun copy(
      changeType: ChangeType = var0.changeType,
      index: Int = var0.index,
      text: String = var0.text,
      id: String = var0.id,
      color: Int = var0.color,
      scrollTo: Boolean? = var0.scrollTo,
      isBeforeContent: Boolean? = var0.isBeforeContent,
      summary: Summary? = var0.summary
   ): SeparatorRow {
      q.h(var1, "changeType");
      q.h(var3, "text");
      q.h(var4, "id");
      return new SeparatorRow(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SeparatorRow) {
         return false;
      } else {
         var1 = var1;
         if (this.changeType != var1.changeType) {
            return false;
         } else if (this.index != var1.index) {
            return false;
         } else if (!q.c(this.text, var1.text)) {
            return false;
         } else if (!q.c(this.id, var1.id)) {
            return false;
         } else if (this.color != var1.color) {
            return false;
         } else if (!q.c(this.scrollTo, var1.scrollTo)) {
            return false;
         } else if (!q.c(this.isBeforeContent, var1.isBeforeContent)) {
            return false;
         } else {
            return q.c(this.summary, var1.summary);
         }
      }
   }

   public override fun hashCode(): Int {
      val var8: Int = this.changeType.hashCode();
      val var5: Int = Integer.hashCode(this.index);
      val var4: Int = this.text.hashCode();
      val var6: Int = this.id.hashCode();
      val var7: Int = Integer.hashCode(this.color);
      var var3: Int = 0;
      val var1: Int;
      if (this.scrollTo == null) {
         var1 = 0;
      } else {
         var1 = this.scrollTo.hashCode();
      }

      val var2: Int;
      if (this.isBeforeContent == null) {
         var2 = 0;
      } else {
         var2 = this.isBeforeContent.hashCode();
      }

      if (this.summary != null) {
         var3 = this.summary.hashCode();
      }

      return ((((((var8 * 31 + var5) * 31 + var4) * 31 + var6) * 31 + var7) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var8: ChangeType = this.changeType;
      val var1: Int = this.index;
      val var9: java.lang.String = this.text;
      val var4: java.lang.String = this.id;
      val var2: Int = this.color;
      val var5: java.lang.Boolean = this.scrollTo;
      val var7: java.lang.Boolean = this.isBeforeContent;
      val var3: Summary = this.summary;
      val var6: StringBuilder = new StringBuilder();
      var6.append("SeparatorRow(changeType=");
      var6.append(var8);
      var6.append(", index=");
      var6.append(var1);
      var6.append(", text=");
      var6.append(var9);
      var6.append(", id=");
      var6.append(var4);
      var6.append(", color=");
      var6.append(var2);
      var6.append(", scrollTo=");
      var6.append(var5);
      var6.append(", isBeforeContent=");
      var6.append(var7);
      var6.append(", summary=");
      var6.append(var3);
      var6.append(")");
      return var6.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<SeparatorRow> {
         return SeparatorRow.$serializer.INSTANCE;
      }
   }
}
