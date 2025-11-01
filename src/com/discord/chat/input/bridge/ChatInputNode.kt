package com.discord.chat.input.bridge

import kotlinx.serialization.KSerializer
import xu.m

@m
public data class ChatInputNode(type: Int,
   location: Int,
   length: Int,
   style: ChatInputNodeStyle? = null,
   deleteNodeOnBackspace: Boolean = false,
   tapAction: TapAction? = null,
   editDisabled: Boolean = false
) {
   public final val type: Int
   public final val location: Int
   public final val length: Int
   public final val style: ChatInputNodeStyle?
   public final val deleteNodeOnBackspace: Boolean
   public final val tapAction: TapAction?
   public final val editDisabled: Boolean

   init {
      super();
      this.type = var1;
      this.location = var2;
      this.length = var3;
      this.style = var4;
      this.deleteNodeOnBackspace = var5;
      this.tapAction = var6;
      this.editDisabled = var7;
   }

   public operator fun component1(): Int {
      return this.type;
   }

   public operator fun component2(): Int {
      return this.location;
   }

   public operator fun component3(): Int {
      return this.length;
   }

   public operator fun component4(): ChatInputNodeStyle? {
      return this.style;
   }

   public operator fun component5(): Boolean {
      return this.deleteNodeOnBackspace;
   }

   public operator fun component6(): TapAction? {
      return this.tapAction;
   }

   public operator fun component7(): Boolean {
      return this.editDisabled;
   }

   public fun copy(
      type: Int = var0.type,
      location: Int = var0.location,
      length: Int = var0.length,
      style: ChatInputNodeStyle? = var0.style,
      deleteNodeOnBackspace: Boolean = var0.deleteNodeOnBackspace,
      tapAction: TapAction? = var0.tapAction,
      editDisabled: Boolean = var0.editDisabled
   ): ChatInputNode {
      return new ChatInputNode(var1, var2, var3, var4, var5, var6, var7);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChatInputNode) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (this.location != var1.location) {
            return false;
         } else if (this.length != var1.length) {
            return false;
         } else if (!(this.style == var1.style)) {
            return false;
         } else if (this.deleteNodeOnBackspace != var1.deleteNodeOnBackspace) {
            return false;
         } else if (!(this.tapAction == var1.tapAction)) {
            return false;
         } else {
            return this.editDisabled == var1.editDisabled;
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = Integer.hashCode(this.type);
      val var3: Int = Integer.hashCode(this.location);
      val var4: Int = Integer.hashCode(this.length);
      var var2: Int = 0;
      val var1: Int;
      if (this.style == null) {
         var1 = 0;
      } else {
         var1 = this.style.hashCode();
      }

      val var6: Int = java.lang.Boolean.hashCode(this.deleteNodeOnBackspace);
      if (this.tapAction != null) {
         var2 = this.tapAction.hashCode();
      }

      return (((((var5 * 31 + var3) * 31 + var4) * 31 + var1) * 31 + var6) * 31 + var2) * 31 + java.lang.Boolean.hashCode(this.editDisabled);
   }

   public override fun toString(): String {
      val var2: Int = this.type;
      val var1: Int = this.location;
      val var3: Int = this.length;
      val var8: ChatInputNodeStyle = this.style;
      val var5: Boolean = this.deleteNodeOnBackspace;
      val var6: TapAction = this.tapAction;
      val var4: Boolean = this.editDisabled;
      val var7: StringBuilder = new StringBuilder();
      var7.append("ChatInputNode(type=");
      var7.append(var2);
      var7.append(", location=");
      var7.append(var1);
      var7.append(", length=");
      var7.append(var3);
      var7.append(", style=");
      var7.append(var8);
      var7.append(", deleteNodeOnBackspace=");
      var7.append(var5);
      var7.append(", tapAction=");
      var7.append(var6);
      var7.append(", editDisabled=");
      var7.append(var4);
      var7.append(")");
      return var7.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ChatInputNode> {
         return ChatInputNode.$serializer.INSTANCE;
      }
   }
}
