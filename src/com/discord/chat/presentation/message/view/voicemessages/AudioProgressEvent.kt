package com.discord.chat.presentation.message.view.voicemessages

public data class AudioProgressEvent(progress: Float, eventAction: Int) {
   public final val eventAction: Int
   public final val progress: Float

   init {
      this.progress = var1;
      this.eventAction = var2;
   }

   public operator fun component1(): Float {
      return this.progress;
   }

   public operator fun component2(): Int {
      return this.eventAction;
   }

   public fun copy(progress: Float = var0.progress, eventAction: Int = var0.eventAction): AudioProgressEvent {
      return new AudioProgressEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AudioProgressEvent) {
         return false;
      } else {
         var1 = var1;
         if (java.lang.Float.compare(this.progress, var1.progress) != 0) {
            return false;
         } else {
            return this.eventAction == var1.eventAction;
         }
      }
   }

   public override fun hashCode(): Int {
      return java.lang.Float.hashCode(this.progress) * 31 + Integer.hashCode(this.eventAction);
   }

   public override fun toString(): String {
      val var1: Float = this.progress;
      val var2: Int = this.eventAction;
      val var3: StringBuilder = new StringBuilder();
      var3.append("AudioProgressEvent(progress=");
      var3.append(var1);
      var3.append(", eventAction=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }
}
