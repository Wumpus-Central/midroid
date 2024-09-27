package com.discord.shortcuts

import android.content.Context
import android.content.Intent
import java.util.Map.Entry
import kotlin.jvm.internal.q
import oh.r
import sk.j

public data class ShortcutData(tag: String, data: Map<String, String>) {
   public final val data: Map<String, String>
   public final val tag: String

   init {
      q.h(var1, "tag");
      q.h(var2, "data");
      super();
      this.tag = var1;
      this.data = var2;
   }

   public operator fun component1(): String {
      return this.tag;
   }

   public operator fun component2(): Map<String, String> {
      return this.data;
   }

   public fun copy(tag: String = var0.tag, data: Map<String, String> = var0.data): ShortcutData {
      q.h(var1, "tag");
      q.h(var2, "data");
      return new ShortcutData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ShortcutData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.tag, var1.tag)) {
            return false;
         } else {
            return q.c(this.data, var1.data);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.tag.hashCode() * 31 + this.data.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.tag;
      val var1: java.util.Map = this.data;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ShortcutData(tag=");
      var3.append(var2);
      var3.append(", data=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      private const val KEY_DATA: String
      private const val KEY_SHORTCUT: String
      private const val KEY_TAG: String

      public fun createShortcutIntent(context: Context, action: String, clazz: Class<*>, tag: String, data: Map<String, String?>): Intent {
         q.h(var1, "context");
         q.h(var2, "action");
         q.h(var3, "clazz");
         q.h(var4, "tag");
         q.h(var5, "data");
         val var6: Intent = new Intent(var2, null, var1, var3).putExtra("discord_shortcut", true).putExtra("discord_shortcut_tag", var4);
         val var8: java.util.List = i.c();

         for (Entry var12 : var5.entrySet()) {
            val var9: java.lang.String = var12.getKey() as java.lang.String;
            val var13: java.lang.String = var12.getValue() as java.lang.String;
            if (var13 != null) {
               var8.add(var9);
               var8.add(var13);
            }
         }

         val var7: Intent = var6.putExtra("discord_shortcut_data", i.a(var8).toArray(new java.lang.String[0]));
         q.g(var7, "putExtra(...)");
         return var7;
      }

      public fun Intent.getShortcutIntentData(): ShortcutData? {
         q.h(var1, "<this>");
         val var10: ShortcutData;
         if (var1.hasExtra("discord_shortcut")) {
            val var3: java.lang.String = var1.getStringExtra("discord_shortcut_tag");
            var var2: java.lang.String = var3;
            if (var3 == null) {
               var2 = "";
            }

            val var11: java.util.Map = r.c();
            val var6: Array<java.lang.String> = var1.getStringArrayExtra("discord_shortcut_data");
            if (var6 != null) {
               val var7: Sequence = c.u(var6);
               if (var7 != null) {
                  val var8: Sequence = j.m(var7, 2);
                  if (var8 != null) {
                     for (java.util.List var5 : var8) {
                        val var4: java.lang.String = var5.get(0) as java.lang.String;
                        val var12: java.lang.String = var5.get(1) as java.lang.String;
                        q.e(var4);
                        q.e(var12);
                        var11.put(var4, var12);
                     }
                  }
               }
            }

            var10 = new ShortcutData(var2, r.b(var11));
         } else {
            var10 = null;
         }

         return var10;
      }
   }
}
