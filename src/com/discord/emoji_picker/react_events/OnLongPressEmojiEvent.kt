package com.discord.emoji_picker.react_events

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.a2
import xk.f0

@f
internal data class OnLongPressEmojiEvent(emojiName: String, emojiId: String? = null) : ReactEvent {
   public final val emojiId: String?
   public final val emojiName: String

   init {
      r.h(var1, "emojiName");
      super();
      this.emojiName = var1;
      this.emojiId = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: OnLongPressEmojiEvent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean = false;
      var1.z(var2, 0, var0.emojiName);
      if (var1.A(var2, 1) || var0.emojiId != null) {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, a2.a, var0.emojiId);
      }
   }

   public operator fun component1(): String {
      return this.emojiName;
   }

   public operator fun component2(): String? {
      return this.emojiId;
   }

   public fun copy(emojiName: String = var0.emojiName, emojiId: String? = var0.emojiId): OnLongPressEmojiEvent {
      r.h(var1, "emojiName");
      return new OnLongPressEmojiEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnLongPressEmojiEvent) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.emojiName, var1.emojiName)) {
            return false;
         } else {
            return r.c(this.emojiId, var1.emojiId);
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

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.emojiName;
      val var1: java.lang.String = this.emojiId;
      val var2: StringBuilder = new StringBuilder();
      var2.append("OnLongPressEmojiEvent(emojiName=");
      var2.append(var3);
      var2.append(", emojiId=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<OnLongPressEmojiEvent> {
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

      public override fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, vk.a.u(a2.a)};
      }

      public open fun deserialize(decoder: Decoder): OnLongPressEmojiEvent {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: Any;
         var var8: java.lang.String;
         if (var7.p()) {
            var8 = var7.m(var6, 0);
            var5 = var7.n(var6, 1, a2.a, null);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.n(var6, 1, a2.a, (java.lang.String)var5);
                     var2 |= 2;
                  } else {
                     var8 = var7.m(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new OnLongPressEmojiEvent(var2, var8, var5 as java.lang.String, null);
      }

      public open fun serialize(encoder: Encoder, value: OnLongPressEmojiEvent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         OnLongPressEmojiEvent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      override fun typeParametersSerializers(): Array<KSerializer<?>> {
         return f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnLongPressEmojiEvent> {
         return OnLongPressEmojiEvent.$serializer.INSTANCE;
      }
   }
}
