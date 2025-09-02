package com.discord.chat.bridge.automod

import kotlinx.serialization.KSerializer
import nb.g

@g
public data class AutoModerationNotification(header: String,
   headerColor: Int,
   headerIconURL: String,
   headerIconColor: Int,
   subtitleLeft: String? = null,
   subtitleRight: String? = null,
   body: String? = null,
   shouldShowActions: Boolean,
   enabledByUsername: String? = null,
   enabledByAvatarURL: String? = null,
   enabledByColor: Int? = null,
   severity: String? = null,
   startTime: String? = null
) {
   public final val header: String
   public final val headerColor: Int
   public final val headerIconURL: String
   public final val headerIconColor: Int
   public final val subtitleLeft: String?
   public final val subtitleRight: String?
   public final val body: String?
   public final val shouldShowActions: Boolean
   public final val enabledByUsername: String?
   public final val enabledByAvatarURL: String?
   public final val enabledByColor: Int?
   public final val severity: String?
   public final val startTime: String?

   init {
      super();
      this.header = var1;
      this.headerColor = var2;
      this.headerIconURL = var3;
      this.headerIconColor = var4;
      this.subtitleLeft = var5;
      this.subtitleRight = var6;
      this.body = var7;
      this.shouldShowActions = var8;
      this.enabledByUsername = var9;
      this.enabledByAvatarURL = var10;
      this.enabledByColor = var11;
      this.severity = var12;
      this.startTime = var13;
   }

   public operator fun component1(): String {
      return this.header;
   }

   public operator fun component10(): String? {
      return this.enabledByAvatarURL;
   }

   public operator fun component11(): Int? {
      return this.enabledByColor;
   }

   public operator fun component12(): String? {
      return this.severity;
   }

   public operator fun component13(): String? {
      return this.startTime;
   }

   public operator fun component2(): Int {
      return this.headerColor;
   }

   public operator fun component3(): String {
      return this.headerIconURL;
   }

   public operator fun component4(): Int {
      return this.headerIconColor;
   }

   public operator fun component5(): String? {
      return this.subtitleLeft;
   }

   public operator fun component6(): String? {
      return this.subtitleRight;
   }

   public operator fun component7(): String? {
      return this.body;
   }

   public operator fun component8(): Boolean {
      return this.shouldShowActions;
   }

   public operator fun component9(): String? {
      return this.enabledByUsername;
   }

   public fun copy(
      header: String = var0.header,
      headerColor: Int = var0.headerColor,
      headerIconURL: String = var0.headerIconURL,
      headerIconColor: Int = var0.headerIconColor,
      subtitleLeft: String? = var0.subtitleLeft,
      subtitleRight: String? = var0.subtitleRight,
      body: String? = var0.body,
      shouldShowActions: Boolean = var0.shouldShowActions,
      enabledByUsername: String? = var0.enabledByUsername,
      enabledByAvatarURL: String? = var0.enabledByAvatarURL,
      enabledByColor: Int? = var0.enabledByColor,
      severity: String? = var0.severity,
      startTime: String? = var0.startTime
   ): AutoModerationNotification {
      return new AutoModerationNotification(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AutoModerationNotification) {
         return false;
      } else {
         var1 = var1;
         if (!(this.header == var1.header)) {
            return false;
         } else if (this.headerColor != var1.headerColor) {
            return false;
         } else if (!(this.headerIconURL == var1.headerIconURL)) {
            return false;
         } else if (this.headerIconColor != var1.headerIconColor) {
            return false;
         } else if (!(this.subtitleLeft == var1.subtitleLeft)) {
            return false;
         } else if (!(this.subtitleRight == var1.subtitleRight)) {
            return false;
         } else if (!(this.body == var1.body)) {
            return false;
         } else if (this.shouldShowActions != var1.shouldShowActions) {
            return false;
         } else if (!(this.enabledByUsername == var1.enabledByUsername)) {
            return false;
         } else if (!(this.enabledByAvatarURL == var1.enabledByAvatarURL)) {
            return false;
         } else if (!(this.enabledByColor == var1.enabledByColor)) {
            return false;
         } else if (!(this.severity == var1.severity)) {
            return false;
         } else {
            return this.startTime == var1.startTime;
         }
      }
   }

   public override fun hashCode(): Int {
      val var10: Int = this.header.hashCode();
      val var11: Int = Integer.hashCode(this.headerColor);
      val var9: Int = this.headerIconURL.hashCode();
      val var12: Int = Integer.hashCode(this.headerIconColor);
      var var8: Int = 0;
      val var1: Int;
      if (this.subtitleLeft == null) {
         var1 = 0;
      } else {
         var1 = this.subtitleLeft.hashCode();
      }

      val var2: Int;
      if (this.subtitleRight == null) {
         var2 = 0;
      } else {
         var2 = this.subtitleRight.hashCode();
      }

      val var3: Int;
      if (this.body == null) {
         var3 = 0;
      } else {
         var3 = this.body.hashCode();
      }

      val var13: Int = java.lang.Boolean.hashCode(this.shouldShowActions);
      val var4: Int;
      if (this.enabledByUsername == null) {
         var4 = 0;
      } else {
         var4 = this.enabledByUsername.hashCode();
      }

      val var5: Int;
      if (this.enabledByAvatarURL == null) {
         var5 = 0;
      } else {
         var5 = this.enabledByAvatarURL.hashCode();
      }

      val var6: Int;
      if (this.enabledByColor == null) {
         var6 = 0;
      } else {
         var6 = this.enabledByColor.hashCode();
      }

      val var7: Int;
      if (this.severity == null) {
         var7 = 0;
      } else {
         var7 = this.severity.hashCode();
      }

      if (this.startTime != null) {
         var8 = this.startTime.hashCode();
      }

      return (
               (
                        (((((((((var10 * 31 + var11) * 31 + var9) * 31 + var12) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var13) * 31 + var4) * 31 + var5)
                              * 31
                           + var6
                     )
                     * 31
                  + var7
            )
            * 31
         + var8;
   }

   public override fun toString(): String {
      val var12: java.lang.String = this.header;
      val var1: Int = this.headerColor;
      val var14: java.lang.String = this.headerIconURL;
      val var2: Int = this.headerIconColor;
      val var5: java.lang.String = this.subtitleLeft;
      val var10: java.lang.String = this.subtitleRight;
      val var8: java.lang.String = this.body;
      val var3: Boolean = this.shouldShowActions;
      val var13: java.lang.String = this.enabledByUsername;
      val var6: java.lang.String = this.enabledByAvatarURL;
      val var7: Int = this.enabledByColor;
      val var4: java.lang.String = this.severity;
      val var11: java.lang.String = this.startTime;
      val var9: StringBuilder = new StringBuilder();
      var9.append("AutoModerationNotification(header=");
      var9.append(var12);
      var9.append(", headerColor=");
      var9.append(var1);
      var9.append(", headerIconURL=");
      var9.append(var14);
      var9.append(", headerIconColor=");
      var9.append(var2);
      var9.append(", subtitleLeft=");
      var9.append(var5);
      var9.append(", subtitleRight=");
      var9.append(var10);
      var9.append(", body=");
      var9.append(var8);
      var9.append(", shouldShowActions=");
      var9.append(var3);
      var9.append(", enabledByUsername=");
      var9.append(var13);
      var9.append(", enabledByAvatarURL=");
      var9.append(var6);
      var9.append(", enabledByColor=");
      var9.append(var7);
      var9.append(", severity=");
      var9.append(var4);
      var9.append(", startTime=");
      var9.append(var11);
      var9.append(")");
      return var9.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<AutoModerationNotification> {
         return AutoModerationNotification.$serializer.INSTANCE;
      }
   }
}
