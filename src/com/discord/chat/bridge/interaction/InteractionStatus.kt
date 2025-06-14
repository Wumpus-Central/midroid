package com.discord.chat.bridge.interaction

import com.discord.chat.bridge.structurabletext.StructurableText
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import mb.f

@f
public data class InteractionStatus(state: InteractionStatusViewState, text: StructurableText) {
   public final val state: InteractionStatusViewState
   public final val text: StructurableText

   init {
      q.h(var1, "state");
      q.h(var2, "text");
      super();
      this.state = var1;
      this.text = var2;
   }

   public operator fun component1(): InteractionStatusViewState {
      return this.state;
   }

   public operator fun component2(): StructurableText {
      return this.text;
   }

   public fun copy(state: InteractionStatusViewState = var0.state, text: StructurableText = var0.text): InteractionStatus {
      q.h(var1, "state");
      q.h(var2, "text");
      return new InteractionStatus(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is InteractionStatus) {
         return false;
      } else {
         var1 = var1;
         if (this.state != var1.state) {
            return false;
         } else {
            return q.c(this.text, var1.text);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.state.hashCode() * 31 + this.text.hashCode();
   }

   public fun isFailed(): Boolean {
      val var1: Boolean;
      if (this.state === InteractionStatusViewState.FAILED) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public fun isLoading(): Boolean {
      val var1: Boolean;
      if (this.state === InteractionStatusViewState.LOADING) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public override fun toString(): String {
      val var3: InteractionStatusViewState = this.state;
      val var2: StructurableText = this.text;
      val var1: StringBuilder = new StringBuilder();
      var1.append("InteractionStatus(state=");
      var1.append(var3);
      var1.append(", text=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<InteractionStatus> {
         return InteractionStatus.$serializer.INSTANCE;
      }
   }
}
