package com.discord.chat.reactevents

import aa.f
import aa.n
import ba.a
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import da.G
import da.N
import da.h
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
internal data class ChatScrollPositionEvent(isAtBottom: Boolean,
      isNearBottom: Boolean,
      isNearTop: Boolean,
      dragging: Boolean,
      decelerating: Boolean,
      shouldShowJumpToPresent: Boolean,
      isFirstMessageVisible: Boolean,
      firstVisibleMessageIndex: Int,
      firstVisibleMessagePercentVisible: Double?,
      lastVisibleMessageIndex: Int,
      lastVisibleMessagePercentVisible: Double?,
      changesetUpdateId: Int
   ) :
   ReactEvent {
   public final val changesetUpdateId: Int
   public final val decelerating: Boolean
   public final val dragging: Boolean
   public final val firstVisibleMessageIndex: Int
   public final val firstVisibleMessagePercentVisible: Double?
   public final val isAtBottom: Boolean
   public final val isFirstMessageVisible: Boolean
   public final val isNearBottom: Boolean
   public final val isNearTop: Boolean
   public final val lastVisibleMessageIndex: Int
   public final val lastVisibleMessagePercentVisible: Double?
   public final val shouldShowJumpToPresent: Boolean

   init {
      super();
      this.isAtBottom = var1;
      this.isNearBottom = var2;
      this.isNearTop = var3;
      this.dragging = var4;
      this.decelerating = var5;
      this.shouldShowJumpToPresent = var6;
      this.isFirstMessageVisible = var7;
      this.firstVisibleMessageIndex = var8;
      this.firstVisibleMessagePercentVisible = var9;
      this.lastVisibleMessageIndex = var10;
      this.lastVisibleMessagePercentVisible = var11;
      this.changesetUpdateId = var12;
   }

   public operator fun component1(): Boolean {
      return this.isAtBottom;
   }

   public operator fun component10(): Int {
      return this.lastVisibleMessageIndex;
   }

   public operator fun component11(): Double? {
      return this.lastVisibleMessagePercentVisible;
   }

   public operator fun component12(): Int {
      return this.changesetUpdateId;
   }

   public operator fun component2(): Boolean {
      return this.isNearBottom;
   }

   public operator fun component3(): Boolean {
      return this.isNearTop;
   }

   public operator fun component4(): Boolean {
      return this.dragging;
   }

   public operator fun component5(): Boolean {
      return this.decelerating;
   }

   public operator fun component6(): Boolean {
      return this.shouldShowJumpToPresent;
   }

   public operator fun component7(): Boolean {
      return this.isFirstMessageVisible;
   }

   public operator fun component8(): Int {
      return this.firstVisibleMessageIndex;
   }

   public operator fun component9(): Double? {
      return this.firstVisibleMessagePercentVisible;
   }

   public fun copy(
      isAtBottom: Boolean = var0.isAtBottom,
      isNearBottom: Boolean = var0.isNearBottom,
      isNearTop: Boolean = var0.isNearTop,
      dragging: Boolean = var0.dragging,
      decelerating: Boolean = var0.decelerating,
      shouldShowJumpToPresent: Boolean = var0.shouldShowJumpToPresent,
      isFirstMessageVisible: Boolean = var0.isFirstMessageVisible,
      firstVisibleMessageIndex: Int = var0.firstVisibleMessageIndex,
      firstVisibleMessagePercentVisible: Double? = var0.firstVisibleMessagePercentVisible,
      lastVisibleMessageIndex: Int = var0.lastVisibleMessageIndex,
      lastVisibleMessagePercentVisible: Double? = var0.lastVisibleMessagePercentVisible,
      changesetUpdateId: Int = var0.changesetUpdateId
   ): ChatScrollPositionEvent {
      return new ChatScrollPositionEvent(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChatScrollPositionEvent) {
         return false;
      } else {
         var1 = var1;
         if (this.isAtBottom != var1.isAtBottom) {
            return false;
         } else if (this.isNearBottom != var1.isNearBottom) {
            return false;
         } else if (this.isNearTop != var1.isNearTop) {
            return false;
         } else if (this.dragging != var1.dragging) {
            return false;
         } else if (this.decelerating != var1.decelerating) {
            return false;
         } else if (this.shouldShowJumpToPresent != var1.shouldShowJumpToPresent) {
            return false;
         } else if (this.isFirstMessageVisible != var1.isFirstMessageVisible) {
            return false;
         } else if (this.firstVisibleMessageIndex != var1.firstVisibleMessageIndex) {
            return false;
         } else if (!q.c(this.firstVisibleMessagePercentVisible, var1.firstVisibleMessagePercentVisible)) {
            return false;
         } else if (this.lastVisibleMessageIndex != var1.lastVisibleMessageIndex) {
            return false;
         } else if (!q.c(this.lastVisibleMessagePercentVisible, var1.lastVisibleMessagePercentVisible)) {
            return false;
         } else {
            return this.changesetUpdateId == var1.changesetUpdateId;
         }
      }
   }

   public override fun hashCode(): Int {
      val var9: Int = java.lang.Boolean.hashCode(this.isAtBottom);
      val var10: Int = java.lang.Boolean.hashCode(this.isNearBottom);
      val var5: Int = java.lang.Boolean.hashCode(this.isNearTop);
      val var8: Int = java.lang.Boolean.hashCode(this.dragging);
      val var6: Int = java.lang.Boolean.hashCode(this.decelerating);
      val var7: Int = java.lang.Boolean.hashCode(this.shouldShowJumpToPresent);
      val var4: Int = java.lang.Boolean.hashCode(this.isFirstMessageVisible);
      val var3: Int = Integer.hashCode(this.firstVisibleMessageIndex);
      var var2: Int = 0;
      val var1: Int;
      if (this.firstVisibleMessagePercentVisible == null) {
         var1 = 0;
      } else {
         var1 = this.firstVisibleMessagePercentVisible.hashCode();
      }

      val var11: Int = Integer.hashCode(this.lastVisibleMessageIndex);
      if (this.lastVisibleMessagePercentVisible != null) {
         var2 = this.lastVisibleMessagePercentVisible.hashCode();
      }

      return ((((((((((var9 * 31 + var10) * 31 + var5) * 31 + var8) * 31 + var6) * 31 + var7) * 31 + var4) * 31 + var3) * 31 + var1) * 31 + var11) * 31 + var2)
            * 31
         + Integer.hashCode(this.changesetUpdateId);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var8: Boolean = this.isAtBottom;
      val var5: Boolean = this.isNearBottom;
      val var4: Boolean = this.isNearTop;
      val var7: Boolean = this.dragging;
      val var9: Boolean = this.decelerating;
      val var10: Boolean = this.shouldShowJumpToPresent;
      val var6: Boolean = this.isFirstMessageVisible;
      val var3: Int = this.firstVisibleMessageIndex;
      val var13: java.lang.Double = this.firstVisibleMessagePercentVisible;
      val var2: Int = this.lastVisibleMessageIndex;
      val var11: java.lang.Double = this.lastVisibleMessagePercentVisible;
      val var1: Int = this.changesetUpdateId;
      val var12: StringBuilder = new StringBuilder();
      var12.append("ChatScrollPositionEvent(isAtBottom=");
      var12.append(var8);
      var12.append(", isNearBottom=");
      var12.append(var5);
      var12.append(", isNearTop=");
      var12.append(var4);
      var12.append(", dragging=");
      var12.append(var7);
      var12.append(", decelerating=");
      var12.append(var9);
      var12.append(", shouldShowJumpToPresent=");
      var12.append(var10);
      var12.append(", isFirstMessageVisible=");
      var12.append(var6);
      var12.append(", firstVisibleMessageIndex=");
      var12.append(var3);
      var12.append(", firstVisibleMessagePercentVisible=");
      var12.append(var13);
      var12.append(", lastVisibleMessageIndex=");
      var12.append(var2);
      var12.append(", lastVisibleMessagePercentVisible=");
      var12.append(var11);
      var12.append(", changesetUpdateId=");
      var12.append(var1);
      var12.append(")");
      return var12.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ChatScrollPositionEvent.$serializer = new ChatScrollPositionEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.ChatScrollPositionEvent", var0, 12);
         var1.l("isAtBottom", false);
         var1.l("isNearBottom", false);
         var1.l("isNearTop", false);
         var1.l("dragging", false);
         var1.l("decelerating", false);
         var1.l("shouldShowJumpToPresent", false);
         var1.l("isFirstMessageVisible", false);
         var1.l("firstVisibleMessageIndex", false);
         var1.l("firstVisibleMessagePercentVisible", false);
         var1.l("lastVisibleMessageIndex", false);
         var1.l("lastVisibleMessagePercentVisible", false);
         var1.l("changesetUpdateId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: y = y.a;
         return new KSerializer[]{h.a, h.a, h.a, h.a, h.a, h.a, h.a, N.a, a.u(y.a), N.a, a.u(var2), N.a};
      }

      public open fun deserialize(decoder: Decoder): ChatScrollPositionEvent {
         q.h(var1, "decoder");
         val var20: SerialDescriptor = this.getDescriptor();
         val var21: c = var1.c(var20);
         var var17: Boolean = var21.y();
         var var2: Int = 0;
         var var3: Int;
         var var4: Int;
         var var5: Int;
         var var6: Int;
         var var7: Int;
         var var8: Int;
         var var9: Int;
         var var10: Int;
         var var11: Int;
         val var12: Int;
         var var18: java.lang.Double;
         val var23: java.lang.Double;
         if (var17) {
            var17 = var21.s(var20, 0);
            var12 = var21.s(var20, 1);
            var9 = var21.s(var20, 2);
            var8 = var21.s(var20, 3);
            var7 = var21.s(var20, 4);
            var6 = var21.s(var20, 5);
            var5 = var21.s(var20, 6);
            var4 = var21.k(var20, 7);
            val var22: y = y.a;
            var18 = var21.v(var20, 8, y.a, null) as java.lang.Double;
            var3 = var21.k(var20, 9);
            var23 = var21.v(var20, 10, var22, null) as java.lang.Double;
            var2 = var21.k(var20, 11);
            var11 = 4095;
            var10 = var2;
         } else {
            var var36: Boolean = true;
            var17 = false;
            var10 = 0;
            var9 = 0;
            var8 = 0;
            var7 = 0;
            var6 = 0;
            var5 = 0;
            var4 = 0;
            var3 = 0;
            var18 = null;
            var var24: java.lang.Double = null;
            var11 = 0;

            while (var36) {
               val var13: Int = var21.x(var20);
               switch (var13) {
                  case -1:
                     var36 = false;
                     break;
                  case 0:
                     var17 = var21.s(var20, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var3 = var21.s(var20, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var4 = var21.s(var20, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var6 = var21.s(var20, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var5 = var21.s(var20, 4);
                     var2 |= 16;
                     break;
                  case 5:
                     var7 = var21.s(var20, 5);
                     var2 |= 32;
                     break;
                  case 6:
                     var8 = var21.s(var20, 6);
                     var2 |= 64;
                     break;
                  case 7:
                     var9 = var21.k(var20, 7);
                     var2 |= 128;
                     break;
                  case 8:
                     var24 = var21.v(var20, 8, y.a, var24) as java.lang.Double;
                     var2 |= 256;
                     break;
                  case 9:
                     var10 = var21.k(var20, 9);
                     var2 |= 512;
                     break;
                  case 10:
                     var18 = var21.v(var20, 10, y.a, var18) as java.lang.Double;
                     var2 |= 1024;
                     break;
                  case 11:
                     var11 = var21.k(var20, 11);
                     var2 |= 2048;
                     break;
                  default:
                     throw new n(var13);
               }
            }

            var8 = var6;
            var12 = var3;
            var10 = var11;
            var23 = var18;
            var3 = var10;
            var18 = var24;
            var4 = var9;
            var5 = var8;
            var6 = var7;
            var7 = var5;
            var9 = var4;
            var11 = var2;
         }

         var21.b(var20);
         return new ChatScrollPositionEvent(
            var11, var17, (boolean)var12, (boolean)var9, (boolean)var8, (boolean)var7, (boolean)var6, (boolean)var5, var4, var18, var3, var23, var10, null
         );
      }

      public open fun serialize(encoder: Encoder, value: ChatScrollPositionEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ChatScrollPositionEvent.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return da.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ChatScrollPositionEvent> {
         return ChatScrollPositionEvent.$serializer.INSTANCE;
      }
   }
}
