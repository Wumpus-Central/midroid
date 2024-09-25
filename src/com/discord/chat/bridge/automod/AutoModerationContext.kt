package com.discord.chat.bridge.automod

import cl.f
import cl.n
import dl.a
import fl.b2
import fl.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class AutoModerationContext(headerText: String,
   headerBadgeText: String,
   ruleDisplayText: String? = null,
   keywordDisplayText: String? = null,
   actionsIconURL: String? = null,
   actionsText: String,
   feedbackText: String,
   message: FlaggedMessageEmbed,
   notification: AutoModerationNotification? = null
) {
   public final val actionsIconURL: String?
   public final val actionsText: String
   public final val feedbackText: String
   public final val headerBadgeText: String
   public final val headerText: String
   public final val keywordDisplayText: String?
   public final val message: FlaggedMessageEmbed
   public final val notification: AutoModerationNotification?
   public final val ruleDisplayText: String?

   init {
      q.h(var1, "headerText");
      q.h(var2, "headerBadgeText");
      q.h(var6, "actionsText");
      q.h(var7, "feedbackText");
      q.h(var8, "message");
      super();
      this.headerText = var1;
      this.headerBadgeText = var2;
      this.ruleDisplayText = var3;
      this.keywordDisplayText = var4;
      this.actionsIconURL = var5;
      this.actionsText = var6;
      this.feedbackText = var7;
      this.message = var8;
      this.notification = var9;
   }

   public operator fun component1(): String {
      return this.headerText;
   }

   public operator fun component2(): String {
      return this.headerBadgeText;
   }

   public operator fun component3(): String? {
      return this.ruleDisplayText;
   }

   public operator fun component4(): String? {
      return this.keywordDisplayText;
   }

   public operator fun component5(): String? {
      return this.actionsIconURL;
   }

   public operator fun component6(): String {
      return this.actionsText;
   }

   public operator fun component7(): String {
      return this.feedbackText;
   }

   public operator fun component8(): FlaggedMessageEmbed {
      return this.message;
   }

   public operator fun component9(): AutoModerationNotification? {
      return this.notification;
   }

   public fun copy(
      headerText: String = var0.headerText,
      headerBadgeText: String = var0.headerBadgeText,
      ruleDisplayText: String? = var0.ruleDisplayText,
      keywordDisplayText: String? = var0.keywordDisplayText,
      actionsIconURL: String? = var0.actionsIconURL,
      actionsText: String = var0.actionsText,
      feedbackText: String = var0.feedbackText,
      message: FlaggedMessageEmbed = var0.message,
      notification: AutoModerationNotification? = var0.notification
   ): AutoModerationContext {
      q.h(var1, "headerText");
      q.h(var2, "headerBadgeText");
      q.h(var6, "actionsText");
      q.h(var7, "feedbackText");
      q.h(var8, "message");
      return new AutoModerationContext(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AutoModerationContext) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.headerText, var1.headerText)) {
            return false;
         } else if (!q.c(this.headerBadgeText, var1.headerBadgeText)) {
            return false;
         } else if (!q.c(this.ruleDisplayText, var1.ruleDisplayText)) {
            return false;
         } else if (!q.c(this.keywordDisplayText, var1.keywordDisplayText)) {
            return false;
         } else if (!q.c(this.actionsIconURL, var1.actionsIconURL)) {
            return false;
         } else if (!q.c(this.actionsText, var1.actionsText)) {
            return false;
         } else if (!q.c(this.feedbackText, var1.feedbackText)) {
            return false;
         } else if (!q.c(this.message, var1.message)) {
            return false;
         } else {
            return q.c(this.notification, var1.notification);
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = this.headerText.hashCode();
      val var6: Int = this.headerBadgeText.hashCode();
      var var4: Int = 0;
      val var1: Int;
      if (this.ruleDisplayText == null) {
         var1 = 0;
      } else {
         var1 = this.ruleDisplayText.hashCode();
      }

      val var2: Int;
      if (this.keywordDisplayText == null) {
         var2 = 0;
      } else {
         var2 = this.keywordDisplayText.hashCode();
      }

      val var3: Int;
      if (this.actionsIconURL == null) {
         var3 = 0;
      } else {
         var3 = this.actionsIconURL.hashCode();
      }

      val var8: Int = this.actionsText.hashCode();
      val var7: Int = this.feedbackText.hashCode();
      val var9: Int = this.message.hashCode();
      if (this.notification != null) {
         var4 = this.notification.hashCode();
      }

      return (((((((var5 * 31 + var6) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var8) * 31 + var7) * 31 + var9) * 31 + var4;
   }

   public override fun toString(): String {
      val var10: java.lang.String = this.headerText;
      val var3: java.lang.String = this.headerBadgeText;
      val var2: java.lang.String = this.ruleDisplayText;
      val var8: java.lang.String = this.keywordDisplayText;
      val var5: java.lang.String = this.actionsIconURL;
      val var9: java.lang.String = this.actionsText;
      val var1: java.lang.String = this.feedbackText;
      val var7: FlaggedMessageEmbed = this.message;
      val var4: AutoModerationNotification = this.notification;
      val var6: StringBuilder = new StringBuilder();
      var6.append("AutoModerationContext(headerText=");
      var6.append(var10);
      var6.append(", headerBadgeText=");
      var6.append(var3);
      var6.append(", ruleDisplayText=");
      var6.append(var2);
      var6.append(", keywordDisplayText=");
      var6.append(var8);
      var6.append(", actionsIconURL=");
      var6.append(var5);
      var6.append(", actionsText=");
      var6.append(var9);
      var6.append(", feedbackText=");
      var6.append(var1);
      var6.append(", message=");
      var6.append(var7);
      var6.append(", notification=");
      var6.append(var4);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: AutoModerationContext.$serializer = new AutoModerationContext.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.automod.AutoModerationContext", var0, 9);
         var1.l("headerText", false);
         var1.l("headerBadgeText", false);
         var1.l("ruleDisplayText", true);
         var1.l("keywordDisplayText", true);
         var1.l("actionsIconURL", true);
         var1.l("actionsText", false);
         var1.l("feedbackText", false);
         var1.l("message", false);
         var1.l("notification", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: b2 = b2.a;
         return new KSerializer[]{
            b2.a,
            b2.a,
            a.u(b2.a),
            a.u(var1),
            a.u(var1),
            var1,
            var1,
            FlaggedMessageEmbed.$serializer.INSTANCE,
            a.u(AutoModerationNotification.$serializer.INSTANCE)
         };
      }

      public open fun deserialize(decoder: Decoder): AutoModerationContext {
         q.h(var1, "decoder");
         val var18: SerialDescriptor = this.getDescriptor();
         val var19: c = var1.c(var18);
         val var6: Boolean = var19.y();
         var var3: Byte = 7;
         var var8: java.lang.String = null;
         var var2: Int;
         var var12: Any;
         var var13: FlaggedMessageEmbed;
         var var14: Any;
         val var15: java.lang.String;
         val var16: Any;
         val var17: Any;
         var var25: AutoModerationNotification;
         var var27: Any;
         var var29: Any;
         if (var6) {
            var27 = var19.t(var18, 0);
            var17 = var19.t(var18, 1);
            val var20: b2 = b2.a;
            var16 = var19.v(var18, 2, b2.a, null) as java.lang.String;
            var29 = var19.v(var18, 3, var20, null) as java.lang.String;
            var12 = var19.v(var18, 4, var20, null) as java.lang.String;
            val var9: java.lang.String = var19.t(var18, 5);
            val var7: java.lang.String = var19.t(var18, 6);
            val var21: FlaggedMessageEmbed = var19.m(var18, 7, FlaggedMessageEmbed.$serializer.INSTANCE, null) as FlaggedMessageEmbed;
            val var24: AutoModerationNotification = var19.v(var18, 8, AutoModerationNotification.$serializer.INSTANCE, null) as AutoModerationNotification;
            var2 = 511;
            var15 = (java.lang.String)var27;
            var27 = var29;
            var29 = var9;
            var14 = var7;
            var13 = var21;
            var25 = var24;
         } else {
            var var4: Boolean = true;
            var2 = 0;
            var14 = null;
            var13 = null;
            var12 = null;
            var var23: Any = null;
            var var22: Any = null;
            var29 = null;
            var27 = null;
            var25 = null;

            while (var4) {
               val var5: Int = var19.x(var18);
               switch (var5) {
                  case -1:
                     var4 = false;
                     continue;
                  case 0:
                     var8 = var19.t(var18, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var23 = var19.t(var18, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var22 = var19.v(var18, 2, b2.a, var22) as java.lang.String;
                     var2 |= 4;
                     break;
                  case 3:
                     var29 = var19.v(var18, 3, b2.a, var29) as java.lang.String;
                     var2 |= 8;
                     var3 = 7;
                     continue;
                  case 4:
                     var12 = var19.v(var18, 4, b2.a, var12) as java.lang.String;
                     var2 |= 16;
                     continue;
                  case 5:
                     var27 = var19.t(var18, 5);
                     var2 |= 32;
                     continue;
                  case 6:
                     var25 = var19.t(var18, 6);
                     var2 |= 64;
                     continue;
                  case 7:
                     var13 = var19.m(var18, var3, FlaggedMessageEmbed.$serializer.INSTANCE, var13) as FlaggedMessageEmbed;
                     var2 |= 128;
                     continue;
                  case 8:
                     var14 = var19.v(var18, 8, AutoModerationNotification.$serializer.INSTANCE, var14) as AutoModerationNotification;
                     var2 |= 256;
                     continue;
                  default:
                     throw new n(var5);
               }

               var3 = 7;
            }

            var25 = (AutoModerationNotification)var14;
            var14 = var25;
            var29 = var27;
            var27 = var29;
            var16 = var22;
            var17 = var23;
            var15 = var8;
         }

         var19.b(var18);
         return new AutoModerationContext(
            var2,
            var15,
            (java.lang.String)var17,
            (java.lang.String)var16,
            (java.lang.String)var27,
            (java.lang.String)var12,
            (java.lang.String)var29,
            (java.lang.String)var14,
            var13,
            var25,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: AutoModerationContext) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         AutoModerationContext.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<AutoModerationContext> {
         return AutoModerationContext.$serializer.INSTANCE;
      }
   }
}
