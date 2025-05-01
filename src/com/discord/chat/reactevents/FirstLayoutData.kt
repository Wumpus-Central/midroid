package com.discord.chat.reactevents

import aa.f
import aa.n
import ba.a
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import da.G
import da.N
import da.y
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
internal data class FirstLayoutData(firstVisibleMessageIndex: Int,
      firstVisibleMessagePercentVisible: Double?,
      lastVisibleMessageIndex: Int,
      lastVisibleMessagePercentVisible: Double?
   ) :
   ReactEvent {
   public final val firstVisibleMessageIndex: Int
   public final val firstVisibleMessagePercentVisible: Double?
   public final val lastVisibleMessageIndex: Int
   public final val lastVisibleMessagePercentVisible: Double?

   init {
      super();
      this.firstVisibleMessageIndex = var1;
      this.firstVisibleMessagePercentVisible = var2;
      this.lastVisibleMessageIndex = var3;
      this.lastVisibleMessagePercentVisible = var4;
   }

   public operator fun component1(): Int {
      return this.firstVisibleMessageIndex;
   }

   public operator fun component2(): Double? {
      return this.firstVisibleMessagePercentVisible;
   }

   public operator fun component3(): Int {
      return this.lastVisibleMessageIndex;
   }

   public operator fun component4(): Double? {
      return this.lastVisibleMessagePercentVisible;
   }

   public fun copy(
      firstVisibleMessageIndex: Int = var0.firstVisibleMessageIndex,
      firstVisibleMessagePercentVisible: Double? = var0.firstVisibleMessagePercentVisible,
      lastVisibleMessageIndex: Int = var0.lastVisibleMessageIndex,
      lastVisibleMessagePercentVisible: Double? = var0.lastVisibleMessagePercentVisible
   ): FirstLayoutData {
      return new FirstLayoutData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is FirstLayoutData) {
         return false;
      } else {
         var1 = var1;
         if (this.firstVisibleMessageIndex != var1.firstVisibleMessageIndex) {
            return false;
         } else if (!q.c(this.firstVisibleMessagePercentVisible, var1.firstVisibleMessagePercentVisible)) {
            return false;
         } else if (this.lastVisibleMessageIndex != var1.lastVisibleMessageIndex) {
            return false;
         } else {
            return q.c(this.lastVisibleMessagePercentVisible, var1.lastVisibleMessagePercentVisible);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = Integer.hashCode(this.firstVisibleMessageIndex);
      var var2: Int = 0;
      val var1: Int;
      if (this.firstVisibleMessagePercentVisible == null) {
         var1 = 0;
      } else {
         var1 = this.firstVisibleMessagePercentVisible.hashCode();
      }

      val var4: Int = Integer.hashCode(this.lastVisibleMessageIndex);
      if (this.lastVisibleMessagePercentVisible != null) {
         var2 = this.lastVisibleMessagePercentVisible.hashCode();
      }

      return ((var3 * 31 + var1) * 31 + var4) * 31 + var2;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: Int = this.firstVisibleMessageIndex;
      val var3: java.lang.Double = this.firstVisibleMessagePercentVisible;
      val var1: Int = this.lastVisibleMessageIndex;
      val var4: java.lang.Double = this.lastVisibleMessagePercentVisible;
      val var5: StringBuilder = new StringBuilder();
      var5.append("FirstLayoutData(firstVisibleMessageIndex=");
      var5.append(var2);
      var5.append(", firstVisibleMessagePercentVisible=");
      var5.append(var3);
      var5.append(", lastVisibleMessageIndex=");
      var5.append(var1);
      var5.append(", lastVisibleMessagePercentVisible=");
      var5.append(var4);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: FirstLayoutData.$serializer = new FirstLayoutData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.FirstLayoutData", var0, 4);
         var1.l("firstVisibleMessageIndex", false);
         var1.l("firstVisibleMessagePercentVisible", false);
         var1.l("lastVisibleMessageIndex", false);
         var1.l("lastVisibleMessagePercentVisible", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: y = y.a;
         return new KSerializer[]{N.a, a.u(y.a), N.a, a.u(var2)};
      }

      public open fun deserialize(decoder: Decoder): FirstLayoutData {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         var var3: Int;
         val var5: Int;
         var var7: java.lang.Double;
         var var11: java.lang.Double;
         var var12: Int;
         if (var9.y()) {
            var12 = var9.k(var8, 0);
            val var10: y = y.a;
            var7 = var9.v(var8, 1, y.a, null) as java.lang.Double;
            val var4: Int = var9.k(var8, 2);
            var11 = var9.v(var8, 3, var10, null) as java.lang.Double;
            var3 = 15;
            var5 = var12;
            var12 = var4;
         } else {
            var var16: Boolean = true;
            var var15: Int = 0;
            var12 = 0;
            var7 = null;
            var11 = null;
            var3 = 0;

            while (var16) {
               val var6: Int = var9.x(var8);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           if (var6 != 3) {
                              throw new n(var6);
                           }

                           var11 = var9.v(var8, 3, y.a, var11) as java.lang.Double;
                           var12 |= 8;
                        } else {
                           var3 = var9.k(var8, 2);
                           var12 |= 4;
                        }
                     } else {
                        var7 = var9.v(var8, 1, y.a, var7) as java.lang.Double;
                        var12 |= 2;
                     }
                  } else {
                     var15 = var9.k(var8, 0);
                     var12 |= 1;
                  }
               } else {
                  var16 = false;
               }
            }

            var3 = var12;
            var12 = var3;
            var5 = var15;
         }

         var9.b(var8);
         return new FirstLayoutData(var3, var5, var7, var12, var11, null);
      }

      public open fun serialize(encoder: Encoder, value: FirstLayoutData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         FirstLayoutData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return da.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<FirstLayoutData> {
         return FirstLayoutData.$serializer.INSTANCE;
      }
   }
}
