package com.discord.chat.bridge.feedback

import Ka.f
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
      val var1: StructurableText = this.content;
      val var3: java.lang.String = this.feedbackIconUrl;
      val var2: StringBuilder = new StringBuilder();
      var2.append("SurveyIndication(content=");
      var2.append(var1);
      var2.append(", feedbackIconUrl=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<SurveyIndication> {
         return SurveyIndication.$serializer.INSTANCE;
      }
   }
}
