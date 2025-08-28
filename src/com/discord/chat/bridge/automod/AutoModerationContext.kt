package com.discord.chat.bridge.automod

import kotlinx.serialization.KSerializer
import nb.g

@g
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
   public final val headerText: String
   public final val headerBadgeText: String
   public final val ruleDisplayText: String?
   public final val keywordDisplayText: String?
   public final val actionsIconURL: String?
   public final val actionsText: String
   public final val feedbackText: String
   public final val message: FlaggedMessageEmbed
   public final val notification: AutoModerationNotification?

   init {
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
      return new AutoModerationContext(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AutoModerationContext) {
         return false;
      } else {
         var1 = var1;
         if (!(this.headerText == var1.headerText)) {
            return false;
         } else if (!(this.headerBadgeText == var1.headerBadgeText)) {
            return false;
         } else if (!(this.ruleDisplayText == var1.ruleDisplayText)) {
            return false;
         } else if (!(this.keywordDisplayText == var1.keywordDisplayText)) {
            return false;
         } else if (!(this.actionsIconURL == var1.actionsIconURL)) {
            return false;
         } else if (!(this.actionsText == var1.actionsText)) {
            return false;
         } else if (!(this.feedbackText == var1.feedbackText)) {
            return false;
         } else if (!(this.message == var1.message)) {
            return false;
         } else {
            return this.notification == var1.notification;
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

      val var7: Int = this.actionsText.hashCode();
      val var9: Int = this.feedbackText.hashCode();
      val var8: Int = this.message.hashCode();
      if (this.notification != null) {
         var4 = this.notification.hashCode();
      }

      return (((((((var5 * 31 + var6) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var7) * 31 + var9) * 31 + var8) * 31 + var4;
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.headerText;
      val var2: java.lang.String = this.headerBadgeText;
      val var3: java.lang.String = this.ruleDisplayText;
      val var8: java.lang.String = this.keywordDisplayText;
      val var4: java.lang.String = this.actionsIconURL;
      val var7: java.lang.String = this.actionsText;
      val var5: java.lang.String = this.feedbackText;
      val var6: FlaggedMessageEmbed = this.message;
      val var10: AutoModerationNotification = this.notification;
      val var9: StringBuilder = new StringBuilder();
      var9.append("AutoModerationContext(headerText=");
      var9.append(var1);
      var9.append(", headerBadgeText=");
      var9.append(var2);
      var9.append(", ruleDisplayText=");
      var9.append(var3);
      var9.append(", keywordDisplayText=");
      var9.append(var8);
      var9.append(", actionsIconURL=");
      var9.append(var4);
      var9.append(", actionsText=");
      var9.append(var7);
      var9.append(", feedbackText=");
      var9.append(var5);
      var9.append(", message=");
      var9.append(var6);
      var9.append(", notification=");
      var9.append(var10);
      var9.append(")");
      return var9.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<AutoModerationContext> {
         return AutoModerationContext.$serializer.INSTANCE;
      }
   }
}
