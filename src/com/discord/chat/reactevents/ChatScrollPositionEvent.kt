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
import xk.f0
import xk.h
import xk.m0
import xk.f0.a

@f
internal data class ChatScrollPositionEvent(isAtBottom: Boolean,
      isNearBottom: Boolean,
      isNearTop: Boolean,
      dragging: Boolean,
      decelerating: Boolean,
      shouldShowJumpToPresent: Boolean,
      isFirstMessageVisible: Boolean,
      firstVisibleMessageIndex: Int,
      lastVisibleMessageIndex: Int
   ) :
   ReactEvent {
   public final val decelerating: Boolean
   public final val dragging: Boolean
   public final val firstVisibleMessageIndex: Int
   public final val isAtBottom: Boolean
   public final val isFirstMessageVisible: Boolean
   public final val isNearBottom: Boolean
   public final val isNearTop: Boolean
   public final val lastVisibleMessageIndex: Int
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
      this.lastVisibleMessageIndex = var9;
   }

   @JvmStatic
   public fun `write$Self`(self: ChatScrollPositionEvent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.x(var2, 0, var0.isAtBottom);
      var1.x(var2, 1, var0.isNearBottom);
      var1.x(var2, 2, var0.isNearTop);
      var1.x(var2, 3, var0.dragging);
      var1.x(var2, 4, var0.decelerating);
      var1.x(var2, 5, var0.shouldShowJumpToPresent);
      var1.x(var2, 6, var0.isFirstMessageVisible);
      var1.w(var2, 7, var0.firstVisibleMessageIndex);
      var1.w(var2, 8, var0.lastVisibleMessageIndex);
   }

   public operator fun component1(): Boolean {
      return this.isAtBottom;
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

   public operator fun component9(): Int {
      return this.lastVisibleMessageIndex;
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
      lastVisibleMessageIndex: Int = var0.lastVisibleMessageIndex
   ): ChatScrollPositionEvent {
      return new ChatScrollPositionEvent(var1, var2, var3, var4, var5, var6, var7, var8, var9);
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
         } else {
            return this.lastVisibleMessageIndex == var1.lastVisibleMessageIndex;
         }
      }
   }

   public override fun hashCode(): Int {
      var var7: Byte = 1;
      var var1: Byte = this.isAtBottom;
      if (this.isAtBottom != 0) {
         var1 = 1;
      }

      var var9: Byte = this.isNearBottom;
      if (this.isNearBottom != 0) {
         var9 = 1;
      }

      var var10: Byte = this.isNearTop;
      if (this.isNearTop != 0) {
         var10 = 1;
      }

      var var11: Byte = this.dragging;
      if (this.dragging != 0) {
         var11 = 1;
      }

      var var12: Byte = this.decelerating;
      if (this.decelerating != 0) {
         var12 = 1;
      }

      var var13: Byte = this.shouldShowJumpToPresent;
      if (this.shouldShowJumpToPresent != 0) {
         var13 = 1;
      }

      if (this.isFirstMessageVisible == 0) {
         var7 = this.isFirstMessageVisible;
      }

      return (
               ((((((var1 * 31 + var9) * 31 + var10) * 31 + var11) * 31 + var12) * 31 + var13) * 31 + var7) * 31
                  + Integer.hashCode(this.firstVisibleMessageIndex)
            )
            * 31
         + Integer.hashCode(this.lastVisibleMessageIndex);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var8: Boolean = this.isAtBottom;
      val var3: Boolean = this.isNearBottom;
      val var9: Boolean = this.isNearTop;
      val var4: Boolean = this.dragging;
      val var6: Boolean = this.decelerating;
      val var7: Boolean = this.shouldShowJumpToPresent;
      val var5: Boolean = this.isFirstMessageVisible;
      val var1: Int = this.firstVisibleMessageIndex;
      val var2: Int = this.lastVisibleMessageIndex;
      val var10: StringBuilder = new StringBuilder();
      var10.append("ChatScrollPositionEvent(isAtBottom=");
      var10.append(var8);
      var10.append(", isNearBottom=");
      var10.append(var3);
      var10.append(", isNearTop=");
      var10.append(var9);
      var10.append(", dragging=");
      var10.append(var4);
      var10.append(", decelerating=");
      var10.append(var6);
      var10.append(", shouldShowJumpToPresent=");
      var10.append(var7);
      var10.append(", isFirstMessageVisible=");
      var10.append(var5);
      var10.append(", firstVisibleMessageIndex=");
      var10.append(var1);
      var10.append(", lastVisibleMessageIndex=");
      var10.append(var2);
      var10.append(")");
      return var10.toString();
   }

   public object `$serializer` : f0<ChatScrollPositionEvent> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ChatScrollPositionEvent.$serializer = new ChatScrollPositionEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.ChatScrollPositionEvent", var0, 9);
         var1.l("isAtBottom", false);
         var1.l("isNearBottom", false);
         var1.l("isNearTop", false);
         var1.l("dragging", false);
         var1.l("decelerating", false);
         var1.l("shouldShowJumpToPresent", false);
         var1.l("isFirstMessageVisible", false);
         var1.l("firstVisibleMessageIndex", false);
         var1.l("lastVisibleMessageIndex", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{h.a, h.a, h.a, h.a, h.a, h.a, h.a, m0.a, m0.a};
      }

      public open fun deserialize(decoder: Decoder): ChatScrollPositionEvent {
         r.h(var1, "decoder");
         val var15: SerialDescriptor = this.getDescriptor();
         val var16: c = var1.b(var15);
         var var14: Boolean = var16.p();
         var var2: Int = 0;
         var var4: Int;
         var var6: Int;
         var var7: Int;
         var var8: Int;
         var var9: Int;
         var var10: Int;
         val var11: Int;
         var var12: Int;
         val var13: Int;
         if (var14) {
            var14 = var16.C(var15, 0);
            var7 = var16.C(var15, 1);
            var13 = var16.C(var15, 2);
            var8 = var16.C(var15, 3);
            var9 = var16.C(var15, 4);
            val var5: Byte = var16.C(var15, 5);
            val var3: Byte = var16.C(var15, 6);
            var2 = var16.i(var15, 7);
            var4 = var16.i(var15, 8);
            var6 = 511;
            var10 = var5;
            var11 = var3;
            var12 = var2;
         } else {
            var var25: Boolean = true;
            var14 = false;
            var10 = 0;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            var9 = 0;
            var var18: Int = 0;
            var var20: Int = 0;
            var4 = 0;

            while (var25) {
               var12 = var16.o(var15);
               switch (var12) {
                  case -1:
                     var25 = false;
                     break;
                  case 0:
                     var14 = var16.C(var15, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var4 = var16.C(var15, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var20 = var16.C(var15, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var8 = var16.C(var15, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var18 = var16.C(var15, 4);
                     var2 |= 16;
                     break;
                  case 5:
                     var7 = var16.C(var15, 5);
                     var2 |= 32;
                     break;
                  case 6:
                     var6 = var16.C(var15, 6);
                     var2 |= 64;
                     break;
                  case 7:
                     var10 = var16.i(var15, 7);
                     var2 |= 128;
                     break;
                  case 8:
                     var9 = var16.i(var15, 8);
                     var2 |= 256;
                     break;
                  default:
                     throw new n(var12);
               }
            }

            var7 = var4;
            var4 = var9;
            var12 = var10;
            var11 = var6;
            var10 = var7;
            var9 = var18;
            var13 = var20;
            var6 = var2;
         }

         var16.c(var15);
         return new ChatScrollPositionEvent(
            var6, var14, (boolean)var7, (boolean)var13, (boolean)var8, (boolean)var9, (boolean)var10, (boolean)var11, var12, var4, null
         );
      }

      public open fun serialize(encoder: Encoder, value: ChatScrollPositionEvent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ChatScrollPositionEvent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ChatScrollPositionEvent> {
         return ChatScrollPositionEvent.$serializer.INSTANCE;
      }
   }
}
