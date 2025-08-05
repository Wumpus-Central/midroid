package com.discord.chat.bridge.row

import com.discord.chat.bridge.ChangeType
import com.discord.chat.bridge.summaries.Summary
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
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
      r.h(var1, "changeType");
      r.h(var3, "text");
      r.h(var4, "id");
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
      r.h(var1, "changeType");
      r.h(var3, "text");
      r.h(var4, "id");
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
         } else if (!r.c(this.text, var1.text)) {
            return false;
         } else if (!r.c(this.id, var1.id)) {
            return false;
         } else if (this.color != var1.color) {
            return false;
         } else if (!r.c(this.scrollTo, var1.scrollTo)) {
            return false;
         } else if (!r.c(this.isBeforeContent, var1.isBeforeContent)) {
            return false;
         } else {
            return r.c(this.summary, var1.summary);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.changeType.hashCode();
      val var6: Int = Integer.hashCode(this.index);
      val var5: Int = this.text.hashCode();
      val var7: Int = this.id.hashCode();
      val var8: Int = Integer.hashCode(this.color);
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

      return ((((((var4 * 31 + var6) * 31 + var5) * 31 + var7) * 31 + var8) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var3: ChangeType = this.changeType;
      val var1: Int = this.index;
      val var6: java.lang.String = this.text;
      val var4: java.lang.String = this.id;
      val var2: Int = this.color;
      val var5: java.lang.Boolean = this.scrollTo;
      val var8: java.lang.Boolean = this.isBeforeContent;
      val var7: Summary = this.summary;
      val var9: StringBuilder = new StringBuilder();
      var9.append("SeparatorRow(changeType=");
      var9.append(var3);
      var9.append(", index=");
      var9.append(var1);
      var9.append(", text=");
      var9.append(var6);
      var9.append(", id=");
      var9.append(var4);
      var9.append(", color=");
      var9.append(var2);
      var9.append(", scrollTo=");
      var9.append(var5);
      var9.append(", isBeforeContent=");
      var9.append(var8);
      var9.append(", summary=");
      var9.append(var7);
      var9.append(")");
      return var9.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<SeparatorRow> {
         return SeparatorRow.$serializer.INSTANCE;
      }
   }
}
