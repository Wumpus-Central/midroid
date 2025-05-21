package com.discord.chat.bridge.feedback

import Za.f
import com.discord.chat.bridge.structurabletext.StructurableText
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class SurveyIndication(content: StructurableText, feedbackIconUrl: String) {
   public final val content: StructurableText
   public final val feedbackIconUrl: String

   init {
      q.h(var1, "content");
      q.h(var2, "feedbackIconUrl");
      super();
      this.content = var1;
      this.feedbackIconUrl = var2;
   }

   public operator fun component1(): StructurableText {
      return this.content;
   }

   public operator fun component2(): String {
      return this.feedbackIconUrl;
   }

   public fun copy(content: StructurableText = var0.content, feedbackIconUrl: String = var0.feedbackIconUrl): SurveyIndication {
      q.h(var1, "content");
      q.h(var2, "feedbackIconUrl");
      return new SurveyIndication(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SurveyIndication) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.content, var1.content)) {
            return false;
         } else {
            return q.c(this.feedbackIconUrl, var1.feedbackIconUrl);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.content.hashCode() * 31 + this.feedbackIconUrl.hashCode();
   }

   public override fun toString(): String {
      val var3: StructurableText = this.content;
      val var2: java.lang.String = this.feedbackIconUrl;
      val var1: StringBuilder = new StringBuilder();
      var1.append("SurveyIndication(content=");
      var1.append(var3);
      var1.append(", feedbackIconUrl=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<SurveyIndication> {
         return SurveyIndication.$serializer.INSTANCE;
      }
   }
}
