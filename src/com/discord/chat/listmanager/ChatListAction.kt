package com.discord.chat.listmanager

public sealed class ChatListAction protected constructor() {
   public object Clear : ChatListAction()

   public object Noop : ChatListAction()

   public data class ScrollTo(position: Int, animated: Boolean = false, jumped: Boolean = false, isHighlight: Boolean = false) : ChatListAction() {
      public final val animated: Boolean
      public final val isHighlight: Boolean
      public final val jumped: Boolean
      public final val position: Int

      init {
         this.position = var1;
         this.animated = var2;
         this.jumped = var3;
         this.isHighlight = var4;
      }

      public operator fun component1(): Int {
         return this.position;
      }

      public operator fun component2(): Boolean {
         return this.animated;
      }

      public operator fun component3(): Boolean {
         return this.jumped;
      }

      public operator fun component4(): Boolean {
         return this.isHighlight;
      }

      public fun copy(position: Int = var0.position, animated: Boolean = var0.animated, jumped: Boolean = var0.jumped, isHighlight: Boolean = var0.isHighlight): com.discord.chat.listmanager.ChatListAction.ScrollTo {
         return new ChatListAction.ScrollTo(var1, var2, var3, var4);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is ChatListAction.ScrollTo) {
            return false;
         } else {
            var1 = var1;
            if (this.position != var1.position) {
               return false;
            } else if (this.animated != var1.animated) {
               return false;
            } else if (this.jumped != var1.jumped) {
               return false;
            } else {
               return this.isHighlight == var1.isHighlight;
            }
         }
      }

      public override fun hashCode(): Int {
         return ((Integer.hashCode(this.position) * 31 + java.lang.Boolean.hashCode(this.animated)) * 31 + java.lang.Boolean.hashCode(this.jumped)) * 31
            + java.lang.Boolean.hashCode(this.isHighlight);
      }

      public override fun toString(): String {
         val var1: Int = this.position;
         val var2: Boolean = this.animated;
         val var3: Boolean = this.jumped;
         val var4: Boolean = this.isHighlight;
         val var5: StringBuilder = new StringBuilder();
         var5.append("ScrollTo(position=");
         var5.append(var1);
         var5.append(", animated=");
         var5.append(var2);
         var5.append(", jumped=");
         var5.append(var3);
         var5.append(", isHighlight=");
         var5.append(var4);
         var5.append(")");
         return var5.toString();
      }
   }

   public object StickToBottomIfAtBottom : ChatListAction()
}
