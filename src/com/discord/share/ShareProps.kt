package com.discord.share

import B9.s
import D.d
import android.content.ContentResolver
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Parcelable
import android.os.Build.VERSION
import androidx.core.content.c
import androidx.core.content.pm.ShortcutInfoCompat
import androidx.core.content.pm.b
import com.discord.share.intent.GetFileNameKt
import com.discord.shortcuts.ShortcutData
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nShareProps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareProps.kt\ncom/discord/share/ShareProps\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,84:1\n1557#2:85\n1628#2,3:86\n37#3,2:89\n*S KotlinDebug\n*F\n+ 1 ShareProps.kt\ncom/discord/share/ShareProps\n*L\n37#1:85\n37#1:86,3\n37#1:89,2\n*E\n"])
internal data class ShareProps(text: String, attachments: List<com.discord.share.ShareProps.Attachment>, targetChannelId: String?, targetUserId: String?) {
   public final val text: String
   public final val attachments: List<com.discord.share.ShareProps.Attachment>
   public final val targetChannelId: String?
   public final val targetUserId: String?

   init {
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
      return new ShareProps(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ShareProps) {
         return false;
      } else {
         var1 = var1;
         if (!(this.text == var1.text)) {
            return false;
         } else if (!(this.attachments == var1.attachments)) {
            return false;
         } else if (!(this.targetChannelId == var1.targetChannelId)) {
            return false;
         } else {
            return this.targetUserId == var1.targetUserId;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.text.hashCode();
      val var4: Int = this.attachments.hashCode();
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

      return ((var3 * 31 + var4) * 31 + var1) * 31 + var2;
   }

   public fun toBundle(): Bundle {
      val var1: Pair = s.a("text", this.text);
      val var3: java.util.List = this.attachments;
      val var2: ArrayList = new ArrayList(CollectionsKt.v(this.attachments, 10));
      val var4: java.util.Iterator = var3.iterator();

      while (var4.hasNext()) {
         var2.add((var4.next() as ShareProps.Attachment).toBundle());
      }

      return d.a(var1, s.a("attachments", var2.toArray(new Bundle[0])), s.a("targetChannelId", this.targetChannelId), s.a("targetUserId", this.targetUserId));
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.text;
      val var2: java.util.List = this.attachments;
      val var1: java.lang.String = this.targetChannelId;
      val var5: java.lang.String = this.targetUserId;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ShareProps(text=");
      var4.append(var3);
      var4.append(", attachments=");
      var4.append(var2);
      var4.append(", targetChannelId=");
      var4.append(var1);
      var4.append(", targetUserId=");
      var4.append(var5);
      var4.append(")");
      return var4.toString();
   }

   public data class Attachment(name: String, uri: String, mimeType: String?) {
      public final val name: String
      public final val uri: String
      public final val mimeType: String?

      init {
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
         return new ShareProps.Attachment(var1, var2, var3);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is ShareProps.Attachment) {
            return false;
         } else {
            var1 = var1;
            if (!(this.name == var1.name)) {
               return false;
            } else if (!(this.uri == var1.uri)) {
               return false;
            } else {
               return this.mimeType == var1.mimeType;
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
         return d.a(s.a("name", this.name), s.a("uri", this.uri), s.a("mimeType", this.mimeType));
      }

      public override fun toString(): String {
         val var2: java.lang.String = this.name;
         val var4: java.lang.String = this.uri;
         val var3: java.lang.String = this.mimeType;
         val var1: StringBuilder = new StringBuilder();
         var1.append("Attachment(name=");
         var1.append(var2);
         var1.append(", uri=");
         var1.append(var4);
         var1.append(", mimeType=");
         var1.append(var3);
         var1.append(")");
         return var1.toString();
      }
   }

   @SourceDebugExtension(["SMAP\nShareProps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareProps.kt\ncom/discord/share/ShareProps$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IntentUtils.kt\ncom/discord/misc/utilities/intent/IntentUtilsKt\n*L\n1#1,84:1\n1#2:85\n1557#3:86\n1628#3,3:87\n17#4:90\n14#4:91\n*S KotlinDebug\n*F\n+ 1 ShareProps.kt\ncom/discord/share/ShareProps$Companion\n*L\n67#1:86\n67#1:87,3\n80#1:90\n81#1:91\n*E\n"])
   public companion object {
      private fun Intent.getUriExtras(): List<Uri> {
         val var2: ArrayList = c.a(var1, "android.intent.extra.STREAM", Uri.class);
         val var3: Any;
         if (var2 != null) {
            var3 = var2;
         } else {
            var3 = CollectionsKt.o(c.b(var1, "android.intent.extra.STREAM", Uri.class) as Parcelable);
         }

         return (java.util.List<Uri>)var3;
      }

      public fun Intent.createShareProps(context: Context): ShareProps {
         val var4: java.lang.String;
         if (VERSION.SDK_INT >= 29) {
            var4 = var1.getStringExtra("android.intent.extra.shortcut.ID");
         } else {
            var4 = null;
         }

         var var5: java.lang.String = null;
         if (var4 != null) {
            val var12: java.util.List = b.f(var2, 10);
            val var7: java.util.Iterator = var12.iterator();

            do {
               if (!var7.hasNext()) {
                  var5 = null;
                  break;
               }

               var5 = (java.lang.String)var7.next();
            } while (!(((ShortcutInfoCompat)var5).g() == var4));

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
         val var11: ArrayList = new ArrayList(CollectionsKt.v(var20, 10));

         for (Uri var8 : var20) {
            val var9: ContentResolver = var2.getContentResolver();
            val var10: java.lang.String = GetFileNameKt.getFileName(var9, var8);
            val var22: java.lang.String = var8.toString();
            var11.add(new ShareProps.Attachment(var10, var22, var2.getContentResolver().getType(var8)));
         }

         return new ShareProps(var14, var11, var4, var5);
      }
   }
}
