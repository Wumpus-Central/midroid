package com.discord.chat.reactevents

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
import xk.f0.a

@f
public data class TapContentInventoryEntryEmbedData(messageId: String, authorId: String, contentId: String, tappedElement: String) : ReactEvent {
   public final val authorId: String
   public final val contentId: String
   public final val messageId: String
   public final val tappedElement: String

   init {
      r.h(var1, "messageId");
      r.h(var2, "authorId");
      r.h(var3, "contentId");
      r.h(var4, "tappedElement");
      super();
      this.messageId = var1;
      this.authorId = var2;
      this.contentId = var3;
      this.tappedElement = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: TapContentInventoryEntryEmbedData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.messageId);
      var1.z(var2, 1, var0.authorId);
      var1.z(var2, 2, var0.contentId);
      var1.z(var2, 3, var0.tappedElement);
   }

   public operator fun component1(): String {
      return this.messageId;
   }

   public operator fun component2(): String {
      return this.authorId;
   }

   public operator fun component3(): String {
      return this.contentId;
   }

   public operator fun component4(): String {
      return this.tappedElement;
   }

   public fun copy(
      messageId: String = var0.messageId,
      authorId: String = var0.authorId,
      contentId: String = var0.contentId,
      tappedElement: String = var0.tappedElement
   ): TapContentInventoryEntryEmbedData {
      r.h(var1, "messageId");
      r.h(var2, "authorId");
      r.h(var3, "contentId");
      r.h(var4, "tappedElement");
      return new TapContentInventoryEntryEmbedData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapContentInventoryEntryEmbedData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.messageId, var1.messageId)) {
            return false;
         } else if (!r.c(this.authorId, var1.authorId)) {
            return false;
         } else if (!r.c(this.contentId, var1.contentId)) {
            return false;
         } else {
            return r.c(this.tappedElement, var1.tappedElement);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.messageId.hashCode() * 31 + this.authorId.hashCode()) * 31 + this.contentId.hashCode()) * 31 + this.tappedElement.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var5: java.lang.String = this.messageId;
      val var3: java.lang.String = this.authorId;
      val var1: java.lang.String = this.contentId;
      val var2: java.lang.String = this.tappedElement;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TapContentInventoryEntryEmbedData(messageId=");
      var4.append(var5);
      var4.append(", authorId=");
      var4.append(var3);
      var4.append(", contentId=");
      var4.append(var1);
      var4.append(", tappedElement=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<TapContentInventoryEntryEmbedData> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapContentInventoryEntryEmbedData.$serializer = new TapContentInventoryEntryEmbedData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.chat.reactevents.TapContentInventoryEntryEmbedData", var0, 4
         );
         var1.l("messageId", false);
         var1.l("authorId", false);
         var1.l("contentId", false);
         var1.l("tappedElement", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, a2.a, a2.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): TapContentInventoryEntryEmbedData {
         r.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         var var2: Int;
         var var5: java.lang.String;
         var var6: java.lang.String;
         var var7: java.lang.String;
         val var11: java.lang.String;
         if (var10.p()) {
            var7 = var10.m(var9, 0);
            var6 = var10.m(var9, 1);
            var5 = var10.m(var9, 2);
            var11 = var10.m(var9, 3);
            var2 = 15;
         } else {
            var7 = null;
            var6 = null;
            var5 = null;
            var var12: java.lang.String = null;
            var var3: Boolean = true;
            var2 = 0;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var6 = var10.m(var9, 3);
                           var2 |= 8;
                        } else {
                           var5 = var10.m(var9, 2);
                           var2 |= 4;
                        }
                     } else {
                        var12 = var10.m(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var10.m(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var6 = var12;
            var11 = var6;
         }

         var10.c(var9);
         return new TapContentInventoryEntryEmbedData(var2, var7, var6, var5, var11, null);
      }

      public open fun serialize(encoder: Encoder, value: TapContentInventoryEntryEmbedData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapContentInventoryEntryEmbedData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapContentInventoryEntryEmbedData> {
         return TapContentInventoryEntryEmbedData.$serializer.INSTANCE;
      }
   }
}
