package com.discord.shortcuts

import android.content.Context
import android.content.Intent
import java.util.Map.Entry
import kotlin.jvm.internal.SourceDebugExtension

public data class ShortcutData(tag: String, data: Map<String, String>) {
   public final val tag: String
   public final val data: Map<String, String>

   init {
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
      return new ShortcutData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ShortcutData) {
         return false;
      } else {
         var1 = var1;
         if (!(this.tag == var1.tag)) {
            return false;
         } else {
            return this.data == var1.data;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.tag.hashCode() * 31 + this.data.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.tag;
      val var3: java.util.Map = this.data;
      val var1: StringBuilder = new StringBuilder();
      var1.append("ShortcutData(tag=");
      var1.append(var2);
      var1.append(", data=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   @SourceDebugExtension(["SMAP\nShortcutData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortcutData.kt\ncom/discord/shortcuts/ShortcutData$Companion\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,60:1\n216#2,2:61\n37#3,2:63\n1317#4,2:65\n*S KotlinDebug\n*F\n+ 1 ShortcutData.kt\ncom/discord/shortcuts/ShortcutData$Companion\n*L\n31#1:61,2\n37#1:63,2\n48#1:65,2\n*E\n"])
   public companion object {
      private const val KEY_SHORTCUT: String
      private const val KEY_TAG: String
      private const val KEY_DATA: String

      public fun createShortcutIntent(context: Context, action: String, clazz: Class<*>, tag: String, data: Map<String, String?>): Intent {
         val var8: Intent = new Intent(var2, null, var1, var3).putExtra("discord_shortcut", true).putExtra("discord_shortcut_tag", var4);
         val var6: java.util.List = CollectionsKt.c();

         for (Entry var12 : var5.entrySet()) {
            val var9: java.lang.String = var12.getKey() as java.lang.String;
            val var13: java.lang.String = var12.getValue() as java.lang.String;
            if (var13 != null) {
               var6.add(var9);
               var6.add(var13);
            }
         }

         val var7: Intent = var8.putExtra("discord_shortcut_data", CollectionsKt.a(var6).toArray(new java.lang.String[0]));
         return var7;
      }

      public fun Intent.getShortcutIntentData(): ShortcutData? {
         val var10: ShortcutData;
         if (var1.hasExtra("discord_shortcut")) {
            val var3: java.lang.String = var1.getStringExtra("discord_shortcut_tag");
            var var2: java.lang.String = var3;
            if (var3 == null) {
               var2 = "";
            }

            val var11: java.util.Map = L.c();
            val var6: Array<java.lang.String> = var1.getStringArrayExtra("discord_shortcut_data");
            if (var6 != null) {
               val var7: Sequence = h.A(var6);
               if (var7 != null) {
                  val var8: Sequence = k.m(var7, 2);
                  if (var8 != null) {
                     for (java.util.List var5 : var8) {
                        val var4: java.lang.String = var5.get(0) as java.lang.String;
                        val var12: java.lang.String = var5.get(1) as java.lang.String;
                        var11.put(var4, var12);
                     }
                  }
               }
            }

            var10 = new ShortcutData(var2, L.b(var11));
         } else {
            var10 = null;
         }

         return var10;
      }
   }
}
