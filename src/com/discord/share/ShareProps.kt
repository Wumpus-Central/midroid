package com.discord.share

import android.content.ContentResolver
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Parcelable
import android.os.Build.VERSION
import androidx.core.content.d
import androidx.core.content.pm.ShortcutInfoCompat
import androidx.core.content.pm.b
import androidx.core.os.e
import com.discord.share.intent.GetFileNameKt
import com.discord.shortcuts.ShortcutData
import eh.w
import java.util.ArrayList
import kotlin.jvm.internal.r

internal data class ShareProps(text: String, attachments: List<com.discord.share.ShareProps.Attachment>, targetChannelId: String?, targetUserId: String?) {
   public final val attachments: List<com.discord.share.ShareProps.Attachment>
   public final val targetChannelId: String?
   public final val targetUserId: String?
   public final val text: String

   init {
      r.h(var1, "text");
      r.h(var2, "attachments");
      super();
      this.text = var1;
      this.attachments = var2;
      this.targetChannelId = var3;
      this.targetUserId = var4;
   }

   public operator fun component1(): String {
      return this.text;
   }

   public operator fun component2(): List<com.discord.share.ShareProps.Attachment> {
      return this.attachments;
   }

   public operator fun component3(): String? {
      return this.targetChannelId;
   }

   public operator fun component4(): String? {
      return this.targetUserId;
   }

   public fun copy(
      text: String = var0.text,
      attachments: List<com.discord.share.ShareProps.Attachment> = var0.attachments,
      targetChannelId: String? = var0.targetChannelId,
      targetUserId: String? = var0.targetUserId
   ): ShareProps {
      r.h(var1, "text");
      r.h(var2, "attachments");
      return new ShareProps(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ShareProps) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.text, var1.text)) {
            return false;
         } else if (!r.c(this.attachments, var1.attachments)) {
            return false;
         } else if (!r.c(this.targetChannelId, var1.targetChannelId)) {
            return false;
         } else {
            return r.c(this.targetUserId, var1.targetUserId);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.text.hashCode();
      val var3: Int = this.attachments.hashCode();
      var var2: Int = 0;
      val var1: Int;
      if (this.targetChannelId == null) {
         var1 = 0;
      } else {
         var1 = this.targetChannelId.hashCode();
      }

      if (this.targetUserId != null) {
         var2 = this.targetUserId.hashCode();
      }

      return ((var4 * 31 + var3) * 31 + var1) * 31 + var2;
   }

   public fun toBundle(): Bundle {
      val var1: Pair = w.a("text", this.text);
      val var3: java.util.List = this.attachments;
      val var2: ArrayList = new ArrayList(h.t(this.attachments, 10));
      val var4: java.util.Iterator = var3.iterator();

      while (var4.hasNext()) {
         var2.add((var4.next() as ShareProps.Attachment).toBundle());
      }

      return e.a(
         new Pair[]{
            var1, w.a("attachments", var2.toArray(new Bundle[0])), w.a("targetChannelId", this.targetChannelId), w.a("targetUserId", this.targetUserId)
         }
      );
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.text;
      val var4: java.util.List = this.attachments;
      val var1: java.lang.String = this.targetChannelId;
      val var2: java.lang.String = this.targetUserId;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ShareProps(text=");
      var5.append(var3);
      var5.append(", attachments=");
      var5.append(var4);
      var5.append(", targetChannelId=");
      var5.append(var1);
      var5.append(", targetUserId=");
      var5.append(var2);
      var5.append(")");
      return var5.toString();
   }

   public data class Attachment(name: String, uri: String, mimeType: String?) {
      public final val mimeType: String?
      public final val name: String
      public final val uri: String

      init {
         r.h(var1, "name");
         r.h(var2, "uri");
         super();
         this.name = var1;
         this.uri = var2;
         this.mimeType = var3;
      }

      public operator fun component1(): String {
         return this.name;
      }

      public operator fun component2(): String {
         return this.uri;
      }

      public operator fun component3(): String? {
         return this.mimeType;
      }

      public fun copy(name: String = var0.name, uri: String = var0.uri, mimeType: String? = var0.mimeType): com.discord.share.ShareProps.Attachment {
         r.h(var1, "name");
         r.h(var2, "uri");
         return new ShareProps.Attachment(var1, var2, var3);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is ShareProps.Attachment) {
            return false;
         } else {
            var1 = var1;
            if (!r.c(this.name, var1.name)) {
               return false;
            } else if (!r.c(this.uri, var1.uri)) {
               return false;
            } else {
               return r.c(this.mimeType, var1.mimeType);
            }
         }
      }

      public override fun hashCode(): Int {
         val var2: Int = this.name.hashCode();
         val var3: Int = this.uri.hashCode();
         val var1: Int;
         if (this.mimeType == null) {
            var1 = 0;
         } else {
            var1 = this.mimeType.hashCode();
         }

         return (var2 * 31 + var3) * 31 + var1;
      }

      public fun toBundle(): Bundle {
         return e.a(new Pair[]{w.a("name", this.name), w.a("uri", this.uri), w.a("mimeType", this.mimeType)});
      }

      public override fun toString(): String {
         val var3: java.lang.String = this.name;
         val var2: java.lang.String = this.uri;
         val var4: java.lang.String = this.mimeType;
         val var1: StringBuilder = new StringBuilder();
         var1.append("Attachment(name=");
         var1.append(var3);
         var1.append(", uri=");
         var1.append(var2);
         var1.append(", mimeType=");
         var1.append(var4);
         var1.append(")");
         return var1.toString();
      }
   }

   public companion object {
      private fun Intent.getUriExtras(): List<Uri> {
         val var2: ArrayList = d.a(var1, "android.intent.extra.STREAM", Uri.class);
         val var3: Any;
         if (var2 != null) {
            var3 = var2;
         } else {
            var3 = h.m(d.b(var1, "android.intent.extra.STREAM", Uri.class) as Parcelable);
         }

         return (java.util.List<Uri>)var3;
      }

      public fun Intent.createShareProps(context: Context): ShareProps {
         r.h(var1, "<this>");
         r.h(var2, "context");
         val var4: java.lang.String;
         if (VERSION.SDK_INT >= 29) {
            var4 = var1.getStringExtra("android.intent.extra.shortcut.ID");
         } else {
            var4 = null;
         }

         var var5: java.lang.String = null;
         if (var4 != null) {
            val var12: java.util.List = b.f(var2, 10);
            r.g(var12, "getShortcuts(\n          …YNAMIC,\n                )");
            val var7: java.util.Iterator = var12.iterator();

            do {
               if (!var7.hasNext()) {
                  var5 = null;
                  break;
               }

               var5 = (java.lang.String)var7.next();
            } while (!r.c(((ShortcutInfoCompat)var5).g(), var4));

            val var15: ShortcutInfoCompat = var5 as ShortcutInfoCompat;
            var5 = null;
            if (var15 != null) {
               val var16: Intent = var15.h();
               var5 = null;
               if (var16 != null) {
                  val var17: ShortcutData = ShortcutData.Companion.getShortcutIntentData(var16);
                  var5 = null;
                  if (var17 != null) {
                     val var18: java.util.Map = var17.getData();
                     var5 = null;
                     if (var18 != null) {
                        var5 = var18.get("receiving_user_id") as java.lang.String;
                     }
                  }
               }
            }
         }

         val var19: java.lang.String = var1.getStringExtra("android.intent.extra.TEXT");
         var var14: java.lang.String = var19;
         if (var19 == null) {
            var14 = "";
         }

         val var20: java.util.List = this.getUriExtras(var1);
         val var11: ArrayList = new ArrayList(h.t(var20, 10));

         for (Uri var21 : var20) {
            val var9: ContentResolver = var2.getContentResolver();
            r.g(var9, "context.contentResolver");
            val var22: java.lang.String = GetFileNameKt.getFileName(var9, var21);
            val var10: java.lang.String = var21.toString();
            r.g(var10, "uri.toString()");
            var11.add(new ShareProps.Attachment(var22, var10, var2.getContentResolver().getType(var21)));
         }

         return new ShareProps(var14, var11, var4, var5);
      }
   }
}
