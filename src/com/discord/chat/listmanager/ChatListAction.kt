package com.discord.chat.listmanager

public sealed class ChatListAction protected constructor() {
   public object Clear : ChatListAction()

   public object Noop : ChatListAction()

   public data class ScrollTo(position: Int, animate: Boolean, highlight: Boolean) : ChatListAction() {
      public final val position: Int
      public final val animate: Boolean
      public final val highlight: Boolean

      init {
         this.position = var1;
         this.animate = var2;
         this.highlight = var3;
      }

      public operator fun component1(): Int {
         return this.position;
      }

      public operator fun component2(): Boolean {
         return this.animate;
      }

      public operator fun component3(): Boolean {
         return this.highlight;
      }

      public fun copy(position: Int = var0.position, animate: Boolean = var0.animate, highlight: Boolean = var0.highlight): com.discord.chat.listmanager.ChatListAction.ScrollTo {
         return new ChatListAction.ScrollTo(var1, var2, var3);
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
            } else if (this.animate != var1.animate) {
               return false;
            } else {
               return this.highlight == var1.highlight;
            }
         }
      }

      public override fun hashCode(): Int {
         return (Integer.hashCode(this.position) * 31 + java.lang.Boolean.hashCode(this.animate)) * 31 + java.lang.Boolean.hashCode(this.highlight);
      }

      public override fun toString(): String {
         val var1: Int = this.position;
         val var3: Boolean = this.animate;
         val var2: Boolean = this.highlight;
         val var4: StringBuilder = new StringBuilder();
         var4.append("ScrollTo(position=");
         var4.append(var1);
         var4.append(", animate=");
         var4.append(var3);
         var4.append(", highlight=");
         var4.append(var2);
         var4.append(")");
         return var4.toString();
      }
   }

   public object StickToBottomIfAtBottom : ChatListAction()
}
