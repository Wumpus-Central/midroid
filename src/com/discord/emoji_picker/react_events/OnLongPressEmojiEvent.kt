package com.discord.emoji_picker.react_events

import cl.f
import cl.n
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import dl.a
import fl.b2
import fl.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
internal data class OnLongPressEmojiEvent(emojiName: String, emojiId: String? = null) : ReactEvent {
   public final val emojiId: String?
   public final val emojiName: String

   init {
      q.h(var1, "emojiName");
      super();
      this.emojiName = var1;
      this.emojiId = var2;
   }

   public operator fun component1(): String {
      return this.emojiName;
   }

   public operator fun component2(): String? {
      return this.emojiId;
   }

   public fun copy(emojiName: String = var0.emojiName, emojiId: String? = var0.emojiId): OnLongPressEmojiEvent {
      q.h(var1, "emojiName");
      return new OnLongPressEmojiEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnLongPressEmojiEvent) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.emojiName, var1.emojiName)) {
            return false;
         } else {
            return q.c(this.emojiId, var1.emojiId);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.emojiName.hashCode();
      val var1: Int;
      if (this.emojiId == null) {
         var1 = 0;
      } else {
         var1 = this.emojiId.hashCode();
      }

      return var2 * 31 + var1;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.emojiName;
      val var1: java.lang.String = this.emojiId;
      val var3: StringBuilder = new StringBuilder();
      var3.append("OnLongPressEmojiEvent(emojiName=");
      var3.append(var2);
      var3.append(", emojiId=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: OnLongPressEmojiEvent.$serializer = new OnLongPressEmojiEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.emoji_picker.react_events.OnLongPressEmojiEvent", var0, 2);
         var1.l("emojiName", false);
         var1.l("emojiId", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, a.u(b2.a)};
      }

      public open fun deserialize(decoder: Decoder): OnLongPressEmojiEvent {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         var var2: Int;
         var var5: java.lang.String;
         var var8: java.lang.String;
         if (var7.y()) {
            var8 = var7.t(var6, 0);
            var5 = var7.v(var6, 1, b2.a, null) as java.lang.String;
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.v(var6, 1, b2.a, var5) as java.lang.String;
                     var2 |= 2;
                  } else {
                     var8 = var7.t(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new OnLongPressEmojiEvent(var2, var8, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: OnLongPressEmojiEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         OnLongPressEmojiEvent.write$Self$emoji_picker_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnLongPressEmojiEvent> {
         return OnLongPressEmojiEvent.$serializer.INSTANCE;
      }
   }
}
