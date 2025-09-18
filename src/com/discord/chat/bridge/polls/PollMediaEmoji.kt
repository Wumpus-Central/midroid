package com.discord.chat.bridge.polls

import com.discord.emoji.RenderableEmoji
import kotlinx.serialization.KSerializer
import mb.g

@g
public data class PollMediaEmoji(id: String?, name: String, displayName: String? = null, animated: Boolean = false) {
   public final val id: String?
   public final val name: String
   public final val displayName: String?
   public final val animated: Boolean

   init {
      super();
      this.id = var1;
      this.name = var2;
      this.displayName = var3;
      this.animated = var4;
   }

   public operator fun component1(): String? {
      return this.id;
   }

   public operator fun component2(): String {
      return this.name;
   }

   public operator fun component3(): String? {
      return this.displayName;
   }

   public operator fun component4(): Boolean {
      return this.animated;
   }

   public fun copy(id: String? = var0.id, name: String = var0.name, displayName: String? = var0.displayName, animated: Boolean = var0.animated): PollMediaEmoji {
      return new PollMediaEmoji(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollMediaEmoji) {
         return false;
      } else {
         var1 = var1;
         if (!(this.id == var1.id)) {
            return false;
         } else if (!(this.name == var1.name)) {
            return false;
         } else if (!(this.displayName == var1.displayName)) {
            return false;
         } else {
            return this.animated == var1.animated;
         }
      }
   }

   public override fun hashCode(): Int {
      var var2: Int = 0;
      val var1: Int;
      if (this.id == null) {
         var1 = 0;
      } else {
         var1 = this.id.hashCode();
      }

      val var3: Int = this.name.hashCode();
      if (this.displayName != null) {
         var2 = this.displayName.hashCode();
      }

      return ((var1 * 31 + var3) * 31 + var2) * 31 + java.lang.Boolean.hashCode(this.animated);
   }

   public fun renderable(): RenderableEmoji {
      if (this.id != null) {
         val var7: java.lang.Long = StringsKt.o(this.id);
         if (var7 != null) {
            val var2: Long = var7.longValue();
            var var8: java.lang.String = this.displayName;
            if (this.displayName == null) {
               var8 = this.name;
            }

            val var9: RenderableEmoji.CustomWithEmojiId = RenderableEmoji.Companion.customWithEmojiId(var2, this.animated, var8);
            if (var9 != null) {
               return var9;
            }
         }
      }

      return RenderableEmoji.Companion.unicode(this.name);
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.id;
      val var5: java.lang.String = this.name;
      val var3: java.lang.String = this.displayName;
      val var1: Boolean = this.animated;
      val var2: StringBuilder = new StringBuilder();
      var2.append("PollMediaEmoji(id=");
      var2.append(var4);
      var2.append(", name=");
      var2.append(var5);
      var2.append(", displayName=");
      var2.append(var3);
      var2.append(", animated=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<PollMediaEmoji> {
         return PollMediaEmoji.$serializer.INSTANCE;
      }
   }
}
