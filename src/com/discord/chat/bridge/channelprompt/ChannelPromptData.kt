package com.discord.chat.bridge.channelprompt

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
public data class ChannelPromptData(cameraButtonIcon: String? = null,
   gifButtonIcon: String? = null,
   emojiButtonIcon: String? = null,
   gamingStatsButtonText: String? = null,
   cameraButtonText: String? = null,
   gifButtonText: String? = null,
   emojiButtonText: String? = null
) {
   public final val cameraButtonIcon: String?
   public final val gifButtonIcon: String?
   public final val emojiButtonIcon: String?
   public final val gamingStatsButtonText: String?
   public final val cameraButtonText: String?
   public final val gifButtonText: String?
   public final val emojiButtonText: String?

   fun ChannelPromptData() {
      this(null, null, null, null, null, null, null, 127, null);
   }

   init {
      this.cameraButtonIcon = var1;
      this.gifButtonIcon = var2;
      this.emojiButtonIcon = var3;
      this.gamingStatsButtonText = var4;
      this.cameraButtonText = var5;
      this.gifButtonText = var6;
      this.emojiButtonText = var7;
   }

   public operator fun component1(): String? {
      return this.cameraButtonIcon;
   }

   public operator fun component2(): String? {
      return this.gifButtonIcon;
   }

   public operator fun component3(): String? {
      return this.emojiButtonIcon;
   }

   public operator fun component4(): String? {
      return this.gamingStatsButtonText;
   }

   public operator fun component5(): String? {
      return this.cameraButtonText;
   }

   public operator fun component6(): String? {
      return this.gifButtonText;
   }

   public operator fun component7(): String? {
      return this.emojiButtonText;
   }

   public fun copy(
      cameraButtonIcon: String? = var0.cameraButtonIcon,
      gifButtonIcon: String? = var0.gifButtonIcon,
      emojiButtonIcon: String? = var0.emojiButtonIcon,
      gamingStatsButtonText: String? = var0.gamingStatsButtonText,
      cameraButtonText: String? = var0.cameraButtonText,
      gifButtonText: String? = var0.gifButtonText,
      emojiButtonText: String? = var0.emojiButtonText
   ): ChannelPromptData {
      return new ChannelPromptData(var1, var2, var3, var4, var5, var6, var7);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChannelPromptData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.cameraButtonIcon, var1.cameraButtonIcon)) {
            return false;
         } else if (!r.c(this.gifButtonIcon, var1.gifButtonIcon)) {
            return false;
         } else if (!r.c(this.emojiButtonIcon, var1.emojiButtonIcon)) {
            return false;
         } else if (!r.c(this.gamingStatsButtonText, var1.gamingStatsButtonText)) {
            return false;
         } else if (!r.c(this.cameraButtonText, var1.cameraButtonText)) {
            return false;
         } else if (!r.c(this.gifButtonText, var1.gifButtonText)) {
            return false;
         } else {
            return r.c(this.emojiButtonText, var1.emojiButtonText);
         }
      }
   }

   public override fun hashCode(): Int {
      var var7: Int = 0;
      val var1: Int;
      if (this.cameraButtonIcon == null) {
         var1 = 0;
      } else {
         var1 = this.cameraButtonIcon.hashCode();
      }

      val var2: Int;
      if (this.gifButtonIcon == null) {
         var2 = 0;
      } else {
         var2 = this.gifButtonIcon.hashCode();
      }

      val var3: Int;
      if (this.emojiButtonIcon == null) {
         var3 = 0;
      } else {
         var3 = this.emojiButtonIcon.hashCode();
      }

      val var4: Int;
      if (this.gamingStatsButtonText == null) {
         var4 = 0;
      } else {
         var4 = this.gamingStatsButtonText.hashCode();
      }

      val var5: Int;
      if (this.cameraButtonText == null) {
         var5 = 0;
      } else {
         var5 = this.cameraButtonText.hashCode();
      }

      val var6: Int;
      if (this.gifButtonText == null) {
         var6 = 0;
      } else {
         var6 = this.gifButtonText.hashCode();
      }

      if (this.emojiButtonText != null) {
         var7 = this.emojiButtonText.hashCode();
      }

      return (((((var1 * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6) * 31 + var7;
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.cameraButtonIcon;
      val var1: java.lang.String = this.gifButtonIcon;
      val var2: java.lang.String = this.emojiButtonIcon;
      val var8: java.lang.String = this.gamingStatsButtonText;
      val var5: java.lang.String = this.cameraButtonText;
      val var7: java.lang.String = this.gifButtonText;
      val var4: java.lang.String = this.emojiButtonText;
      val var6: StringBuilder = new StringBuilder();
      var6.append("ChannelPromptData(cameraButtonIcon=");
      var6.append(var3);
      var6.append(", gifButtonIcon=");
      var6.append(var1);
      var6.append(", emojiButtonIcon=");
      var6.append(var2);
      var6.append(", gamingStatsButtonText=");
      var6.append(var8);
      var6.append(", cameraButtonText=");
      var6.append(var5);
      var6.append(", gifButtonText=");
      var6.append(var7);
      var6.append(", emojiButtonText=");
      var6.append(var4);
      var6.append(")");
      return var6.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ChannelPromptData> {
         return ChannelPromptData.$serializer.INSTANCE;
      }
   }
}
