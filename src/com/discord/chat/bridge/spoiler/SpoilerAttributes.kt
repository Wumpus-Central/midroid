package com.discord.chat.bridge.spoiler

import android.content.Context
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.embed.Embed
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed
import com.discord.primitives.MessageId
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import java.util.Locale
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nSpoilerManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpoilerManager.kt\ncom/discord/chat/bridge/spoiler/SpoilerAttributes\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n1#2:163\n*E\n"])
public data class SpoilerAttributes(identifier: SpoilerIdentifier,
   label: (Context) -> String,
   description: (Context) -> String,
   type: SpoilerType,
   verifyAge: Boolean?
) : SpoilerAttributes(var1, var2, var3, var4, var5) {
   public final val identifier: SpoilerIdentifier
   public final val label: (Context) -> String
   public final val description: (Context) -> String
   public final val type: SpoilerType
   public final val verifyAge: Boolean?

   fun SpoilerAttributes(
      var1: java.lang.String, var2: (Context?) -> java.lang.String, var3: (Context?) -> java.lang.String, var4: SpoilerType, var5: java.lang.Boolean
   ) {
      this.identifier = var1;
      this.label = var2;
      this.description = var3;
      this.type = var4;
      this.verifyAge = var5;
   }

   @JvmStatic
   fun `configure$lambda$0`(): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `configure$lambda$1`(var0: Boolean): Unit {
      return Unit.a;
   }

   private fun hasSpoilerConfig(): Boolean {
      val var1: Boolean;
      if (!SpoilerManager.INSTANCE.isNotRevealed-V2PEE7g(this.identifier) && this.type != SpoilerType.OBSCURE) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public operator fun component1(): SpoilerIdentifier {
      return this.identifier;
   }

   public operator fun component2(): (Context) -> String {
      return this.label;
   }

   public operator fun component3(): (Context) -> String {
      return this.description;
   }

   public operator fun component4(): SpoilerType {
      return this.type;
   }

   public operator fun component5(): Boolean? {
      return this.verifyAge;
   }

   public fun configure(onTapSpoiler: () -> Unit = new a(), onTapObscureToggle: (Boolean) -> Unit = new b()): SpoilerConfig? {
      val var3: Boolean = this.hasSpoilerConfig();
      var var5: SpoilerConfig = null;
      val var4: SpoilerAttributes;
      if (var3) {
         var4 = this;
      } else {
         var4 = null;
      }

      if (var4 != null) {
         var5 = new SpoilerConfig(var4, var2, new Function1<SpoilerIdentifier, Unit>(var1) {
            final Function0<Unit> $onTapSpoiler;

            {
               this.$onTapSpoiler = var1;
            }

            public final void invoke_V2PEE7g/* $VF was: invoke-V2PEE7g*/(java.lang.String var1) {
               SpoilerManager.INSTANCE.markRevealed-V2PEE7g(var1);
               this.$onTapSpoiler.invoke();
            }
         }, new Function1<SpoilerIdentifier, Unit>(var1) {
            final Function0<Unit> $onTapSpoiler;

            {
               this.$onTapSpoiler = var1;
            }

            public final void invoke_V2PEE7g/* $VF was: invoke-V2PEE7g*/(java.lang.String var1) {
               SpoilerManager.INSTANCE.markHidden-V2PEE7g(var1);
               this.$onTapSpoiler.invoke();
            }
         });
      }

      return var5;
   }

   public fun copy(
      identifier: SpoilerIdentifier = ...,
      label: (Context) -> String = ...,
      description: (Context) -> String = ...,
      type: SpoilerType = ...,
      verifyAge: Boolean? = ...
   ): SpoilerAttributes {
      return new SpoilerAttributes(var1, var2, var3, var4, var5, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SpoilerAttributes) {
         return false;
      } else {
         var1 = var1;
         if (!SpoilerIdentifier.equals-impl0(this.identifier, var1.identifier)) {
            return false;
         } else if (!(this.label == var1.label)) {
            return false;
         } else if (!(this.description == var1.description)) {
            return false;
         } else if (this.type != var1.type) {
            return false;
         } else {
            return this.verifyAge == var1.verifyAge;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = SpoilerIdentifier.hashCode-impl(this.identifier);
      val var4: Int = this.label.hashCode();
      val var5: Int = this.description.hashCode();
      val var2: Int = this.type.hashCode();
      val var1: Int;
      if (this.verifyAge == null) {
         var1 = 0;
      } else {
         var1 = this.verifyAge.hashCode();
      }

      return (((var3 * 31 + var4) * 31 + var5) * 31 + var2) * 31 + var1;
   }

   public override fun toString(): String {
      val var4: java.lang.String = SpoilerIdentifier.toString-impl(this.identifier);
      val var3: Function1 = this.label;
      val var5: Function1 = this.description;
      val var2: SpoilerType = this.type;
      val var1: java.lang.Boolean = this.verifyAge;
      val var6: StringBuilder = new StringBuilder();
      var6.append("SpoilerAttributes(identifier=");
      var6.append(var4);
      var6.append(", label=");
      var6.append(var3);
      var6.append(", description=");
      var6.append(var5);
      var6.append(", type=");
      var6.append(var2);
      var6.append(", verifyAge=");
      var6.append(var1);
      var6.append(")");
      return var6.toString();
   }

   public companion object {
      private fun forItem(spoilerableData: SpoilerableData, containerId: String, key: String, verifyAge: Boolean?): SpoilerAttributes? {
         var var5: java.lang.String = var1.getObscureOrNull();
         val var7: SpoilerAttributes;
         if (var5 != null) {
            val var6: StringBuilder = new StringBuilder();
            var6.append("obscure:containerId(");
            var6.append(var2);
            var6.append("):");
            var6.append(var3);
            var7 = new SpoilerAttributes(SpoilerIdentifier.constructor-impl(var6.toString()), new c(var5), new d(var5), SpoilerType.OBSCURE, var4, null);
         } else {
            var5 = var1.getSpoilerOrNull();
            if (var5 != null) {
               val var8: StringBuilder = new StringBuilder();
               var8.append("spoiler:containerId(");
               var8.append(var2);
               var8.append("):");
               var8.append(var3);
               var7 = new SpoilerAttributes(SpoilerIdentifier.constructor-impl(var8.toString()), new e(), new f(var5), SpoilerType.SPOILER, var4, null);
            } else {
               var7 = null;
            }
         }

         return var7;
      }

      @JvmStatic
      fun `forItem$lambda$2$lambda$0`(var0: java.lang.String, var1: Context): java.lang.String {
         return var0;
      }

      @JvmStatic
      fun `forItem$lambda$2$lambda$1`(var0: java.lang.String, var1: Context): java.lang.String {
         return var0;
      }

      @JvmStatic
      fun `forItem$lambda$5$lambda$3`(var0: Context): java.lang.String {
         val var1: java.lang.String = I18nUtilsKt.i18nFormat$default(var0, I18nMessage.SPOILER, null, 2, null).toString().toUpperCase(Locale.ROOT);
         return var1;
      }

      @JvmStatic
      fun `forItem$lambda$5$lambda$4`(var0: java.lang.String, var1: Context): java.lang.String {
         return var0;
      }

      public fun forAttachment(attachment: Attachment, message: Message, index: Int, verifyAge: Boolean?): SpoilerAttributes? {
         val var5: java.lang.String = MessageId.toString-impl(var2.getId-3Eiw7ao());
         val var7: StringBuilder = new StringBuilder();
         var7.append("messageId(");
         var7.append(var5);
         var7.append(")");
         val var8: java.lang.String = var7.toString();
         val var6: java.lang.String = var1.type().getIndexLabel();
         val var9: StringBuilder = new StringBuilder();
         var9.append(var6);
         var9.append("(");
         var9.append(var3);
         var9.append(")");
         return this.forItem(var1, var8, var9.toString(), var4);
      }

      public fun forEmbed(embed: Embed, message: Message, index: Int, verifyAge: Boolean?): SpoilerAttributes? {
         val var6: java.lang.String = MessageId.toString-impl(var2.getId-3Eiw7ao());
         val var5: StringBuilder = new StringBuilder();
         var5.append("messageId(");
         var5.append(var6);
         var5.append(")");
         val var8: java.lang.String = var5.toString();
         val var7: StringBuilder = new StringBuilder();
         var7.append("embedIndex(");
         var7.append(var3);
         var7.append(")");
         return this.forItem(var1, var8, var7.toString(), var4);
      }

      public fun forGenericMedia(spoilerableData: SpoilerableData, containerId: String, itemType: String, itemKey: String, verifyAge: Boolean?): SpoilerAttributes? {
         val var6: StringBuilder = new StringBuilder();
         var6.append(var3);
         var6.append("(");
         var6.append(var4);
         var6.append(")");
         return this.forItem(var1, var2, var6.toString(), var5);
      }

      public fun forMediaPostPreviewEmbed(embed: PostPreviewEmbed, message: Message, index: Int, verifyAge: Boolean?): SpoilerAttributes? {
         var var5: java.lang.String = MessageId.toString-impl(var2.getId-3Eiw7ao());
         val var6: StringBuilder = new StringBuilder();
         var6.append("messageId(");
         var6.append(var5);
         var6.append(")");
         var5 = var6.toString();
         val var7: StringBuilder = new StringBuilder();
         var7.append("mediaPostPreviewEmbed(");
         var7.append(var3);
         var7.append(")");
         return this.forItem(var1, var5, var7.toString(), var4);
      }
   }
}
