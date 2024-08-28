package com.discord.chat.bridge.automod

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0

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
      r.h(var1, "headerText");
      r.h(var2, "headerBadgeText");
      r.h(var6, "actionsText");
      r.h(var7, "feedbackText");
      r.h(var8, "message");
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

   @JvmStatic
   public fun `write$Self`(self: AutoModerationContext, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.headerText);
      var1.z(var2, 1, var0.headerBadgeText);
      var var3: Boolean;
      if (!var1.A(var2, 2) && var0.ruleDisplayText == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, a2.a, var0.ruleDisplayText);
      }

      if (!var1.A(var2, 3) && var0.keywordDisplayText == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, a2.a, var0.keywordDisplayText);
      }

      if (!var1.A(var2, 4) && var0.actionsIconURL == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, a2.a, var0.actionsIconURL);
      }

      label40: {
         var1.z(var2, 5, var0.actionsText);
         var1.z(var2, 6, var0.feedbackText);
         var1.y(var2, 7, FlaggedMessageEmbed.$serializer.INSTANCE, var0.message);
         if (!var1.A(var2, 8)) {
            var3 = false;
            if (var0.notification == null) {
               break label40;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 8, AutoModerationNotification.$serializer.INSTANCE, var0.notification);
      }
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
      r.h(var1, "headerText");
      r.h(var2, "headerBadgeText");
      r.h(var6, "actionsText");
      r.h(var7, "feedbackText");
      r.h(var8, "message");
      return new AutoModerationContext(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AutoModerationContext) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.headerText, var1.headerText)) {
            return false;
         } else if (!r.c(this.headerBadgeText, var1.headerBadgeText)) {
            return false;
         } else if (!r.c(this.ruleDisplayText, var1.ruleDisplayText)) {
            return false;
         } else if (!r.c(this.keywordDisplayText, var1.keywordDisplayText)) {
            return false;
         } else if (!r.c(this.actionsIconURL, var1.actionsIconURL)) {
            return false;
         } else if (!r.c(this.actionsText, var1.actionsText)) {
            return false;
         } else if (!r.c(this.feedbackText, var1.feedbackText)) {
            return false;
         } else if (!r.c(this.message, var1.message)) {
            return false;
         } else {
            return r.c(this.notification, var1.notification);
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

      val var9: Int = this.actionsText.hashCode();
      val var8: Int = this.feedbackText.hashCode();
      val var7: Int = this.message.hashCode();
      if (this.notification != null) {
         var4 = this.notification.hashCode();
      }

      return (((((((var5 * 31 + var6) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var9) * 31 + var8) * 31 + var7) * 31 + var4;
   }

   public override fun toString(): String {
      val var6: java.lang.String = this.headerText;
      val var3: java.lang.String = this.headerBadgeText;
      val var10: java.lang.String = this.ruleDisplayText;
      val var1: java.lang.String = this.keywordDisplayText;
      val var4: java.lang.String = this.actionsIconURL;
      val var8: java.lang.String = this.actionsText;
      val var7: java.lang.String = this.feedbackText;
      val var2: FlaggedMessageEmbed = this.message;
      val var5: AutoModerationNotification = this.notification;
      val var9: StringBuilder = new StringBuilder();
      var9.append("AutoModerationContext(headerText=");
      var9.append(var6);
      var9.append(", headerBadgeText=");
      var9.append(var3);
      var9.append(", ruleDisplayText=");
      var9.append(var10);
      var9.append(", keywordDisplayText=");
      var9.append(var1);
      var9.append(", actionsIconURL=");
      var9.append(var4);
      var9.append(", actionsText=");
      var9.append(var8);
      var9.append(", feedbackText=");
      var9.append(var7);
      var9.append(", message=");
      var9.append(var2);
      var9.append(", notification=");
      var9.append(var5);
      var9.append(")");
      return var9.toString();
   }

   public object `$serializer` : f0<AutoModerationContext> {
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
         val var1: a2 = a2.a;
         return new KSerializer[]{
            a2.a,
            a2.a,
            a.u(a2.a),
            a.u(var1),
            a.u(var1),
            var1,
            var1,
            FlaggedMessageEmbed.$serializer.INSTANCE,
            a.u(AutoModerationNotification.$serializer.INSTANCE)
         };
      }

      public open fun deserialize(decoder: Decoder): AutoModerationContext {
         r.h(var1, "decoder");
         val var16: SerialDescriptor = this.getDescriptor();
         val var17: c = var1.b(var16);
         val var6: Boolean = var17.p();
         var var3: Byte = 7;
         var var8: java.lang.String = null;
         var var2: Int;
         var var7: Any;
         var var9: Any;
         var var10: Any;
         var var11: Any;
         var var12: Any;
         var var13: Any;
         var var14: Any;
         val var15: java.lang.String;
         if (var6) {
            var15 = var17.m(var16, 0);
            var8 = var17.m(var16, 1);
            val var18: a2 = a2.a;
            var9 = var17.n(var16, 2, a2.a, null);
            var12 = var17.n(var16, 3, var18, null);
            var11 = var17.n(var16, 4, var18, null);
            val var19: java.lang.String = var17.m(var16, 5);
            var7 = var17.m(var16, 6);
            var13 = var17.y(var16, 7, FlaggedMessageEmbed.$serializer.INSTANCE, null);
            var14 = var17.n(var16, 8, AutoModerationNotification.$serializer.INSTANCE, null);
            var2 = 511;
            var10 = var19;
         } else {
            var var4: Boolean = true;
            var2 = 0;
            var14 = null;
            var13 = null;
            var11 = null;
            var7 = null;
            var var20: Any = null;
            var12 = null;
            var9 = null;
            var10 = null;

            while (var4) {
               val var5: Int = var17.o(var16);
               switch (var5) {
                  case -1:
                     var4 = false;
                     continue;
                  case 0:
                     var8 = var17.m(var16, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var7 = var17.m(var16, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var20 = var17.n(var16, 2, a2.a, var20);
                     var2 |= 4;
                     break;
                  case 3:
                     var12 = var17.n(var16, 3, a2.a, var12);
                     var2 |= 8;
                     var3 = 7;
                     continue;
                  case 4:
                     var11 = var17.n(var16, 4, a2.a, var11);
                     var2 |= 16;
                     continue;
                  case 5:
                     var9 = var17.m(var16, 5);
                     var2 |= 32;
                     continue;
                  case 6:
                     var10 = var17.m(var16, 6);
                     var2 |= 64;
                     continue;
                  case 7:
                     var13 = var17.y(var16, var3, FlaggedMessageEmbed.$serializer.INSTANCE, var13);
                     var2 |= 128;
                     continue;
                  case 8:
                     var14 = var17.n(var16, 8, AutoModerationNotification.$serializer.INSTANCE, var14);
                     var2 |= 256;
                     continue;
                  default:
                     throw new n(var5);
               }

               var3 = 7;
            }

            var15 = var8;
            var8 = (java.lang.String)var7;
            var7 = var10;
            var10 = var9;
            var9 = var20;
         }

         var17.c(var16);
         return new AutoModerationContext(
            var2,
            var15,
            var8,
            var9 as java.lang.String,
            var12 as java.lang.String,
            var11 as java.lang.String,
            (java.lang.String)var10,
            (java.lang.String)var7,
            var13 as FlaggedMessageEmbed,
            var14 as AutoModerationNotification,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: AutoModerationContext) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         AutoModerationContext.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<AutoModerationContext> {
         return AutoModerationContext.$serializer.INSTANCE;
      }
   }
}
