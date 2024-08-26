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
      lastVisibleMessageIndex: Int,
      changesetUpdateId: Int
   ) :
   ReactEvent {
   public final val changesetUpdateId: Int
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
      this.changesetUpdateId = var10;
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
      var1.w(var2, 9, var0.changesetUpdateId);
   }

   public operator fun component1(): Boolean {
      return this.isAtBottom;
   }

   public operator fun component10(): Int {
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
      lastVisibleMessageIndex: Int = var0.lastVisibleMessageIndex,
      changesetUpdateId: Int = var0.changesetUpdateId
   ): ChatScrollPositionEvent {
      return new ChatScrollPositionEvent(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
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
         } else if (this.lastVisibleMessageIndex != var1.lastVisibleMessageIndex) {
            return false;
         } else {
            return this.changesetUpdateId == var1.changesetUpdateId;
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
               (
                        ((((((var1 * 31 + var9) * 31 + var10) * 31 + var11) * 31 + var12) * 31 + var13) * 31 + var7) * 31
                           + Integer.hashCode(this.firstVisibleMessageIndex)
                     )
                     * 31
                  + Integer.hashCode(this.lastVisibleMessageIndex)
            )
            * 31
         + Integer.hashCode(this.changesetUpdateId);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var4: Boolean = this.isAtBottom;
      val var10: Boolean = this.isNearBottom;
      val var9: Boolean = this.isNearTop;
      val var5: Boolean = this.dragging;
      val var6: Boolean = this.decelerating;
      val var8: Boolean = this.shouldShowJumpToPresent;
      val var7: Boolean = this.isFirstMessageVisible;
      val var1: Int = this.firstVisibleMessageIndex;
      val var3: Int = this.lastVisibleMessageIndex;
      val var2: Int = this.changesetUpdateId;
      val var11: StringBuilder = new StringBuilder();
      var11.append("ChatScrollPositionEvent(isAtBottom=");
      var11.append(var4);
      var11.append(", isNearBottom=");
      var11.append(var10);
      var11.append(", isNearTop=");
      var11.append(var9);
      var11.append(", dragging=");
      var11.append(var5);
      var11.append(", decelerating=");
      var11.append(var6);
      var11.append(", shouldShowJumpToPresent=");
      var11.append(var8);
      var11.append(", isFirstMessageVisible=");
      var11.append(var7);
      var11.append(", firstVisibleMessageIndex=");
      var11.append(var1);
      var11.append(", lastVisibleMessageIndex=");
      var11.append(var3);
      var11.append(", changesetUpdateId=");
      var11.append(var2);
      var11.append(")");
      return var11.toString();
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
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.ChatScrollPositionEvent", var0, 10);
         var1.l("isAtBottom", false);
         var1.l("isNearBottom", false);
         var1.l("isNearTop", false);
         var1.l("dragging", false);
         var1.l("decelerating", false);
         var1.l("shouldShowJumpToPresent", false);
         var1.l("isFirstMessageVisible", false);
         var1.l("firstVisibleMessageIndex", false);
         var1.l("lastVisibleMessageIndex", false);
         var1.l("changesetUpdateId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{h.a, h.a, h.a, h.a, h.a, h.a, h.a, m0.a, m0.a, m0.a};
      }

      public open fun deserialize(decoder: Decoder): ChatScrollPositionEvent {
         r.h(var1, "decoder");
         val var16: SerialDescriptor = this.getDescriptor();
         val var17: c = var1.b(var16);
         var var15: Boolean = var17.p();
         var var2: Int = 0;
         var var7: Int;
         var var8: Int;
         var var9: Int;
         var var10: Int;
         var var11: Int;
         val var12: Int;
         var var13: Int;
         val var14: Int;
         var var20: Int;
         var var23: Int;
         if (var15) {
            var15 = var17.C(var16, 0);
            var8 = var17.C(var16, 1);
            var7 = var17.C(var16, 2);
            var13 = var17.C(var16, 3);
            var14 = var17.C(var16, 4);
            val var6: Byte = var17.C(var16, 5);
            val var4: Byte = var17.C(var16, 6);
            val var3: Int = var17.i(var16, 7);
            val var5: Int = var17.i(var16, 8);
            var2 = var17.i(var16, 9);
            var12 = 1023;
            var11 = var6;
            var23 = var4;
            var9 = var3;
            var20 = var5;
            var10 = var2;
         } else {
            var var30: Boolean = true;
            var15 = false;
            var11 = 0;
            var23 = 0;
            var7 = 0;
            var9 = 0;
            var var19: Int = 0;
            var10 = 0;
            var8 = 0;
            var var22: Int = 0;
            var20 = 0;

            while (var30) {
               var13 = var17.o(var16);
               switch (var13) {
                  case -1:
                     var30 = false;
                     break;
                  case 0:
                     var15 = var17.C(var16, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var20 = var17.C(var16, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var22 = var17.C(var16, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var19 = var17.C(var16, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var8 = var17.C(var16, 4);
                     var2 |= 16;
                     break;
                  case 5:
                     var9 = var17.C(var16, 5);
                     var2 |= 32;
                     break;
                  case 6:
                     var7 = var17.C(var16, 6);
                     var2 |= 64;
                     break;
                  case 7:
                     var23 = var17.i(var16, 7);
                     var2 |= 128;
                     break;
                  case 8:
                     var10 = var17.i(var16, 8);
                     var2 |= 256;
                     break;
                  case 9:
                     var11 = var17.i(var16, 9);
                     var2 |= 512;
                     break;
                  default:
                     throw new n(var13);
               }
            }

            var10 = var11;
            var20 = var10;
            var9 = var23;
            var23 = var7;
            var11 = var9;
            var14 = var8;
            var13 = var19;
            var7 = var22;
            var8 = var20;
            var12 = var2;
         }

         var17.c(var16);
         return new ChatScrollPositionEvent(
            var12, var15, (boolean)var8, (boolean)var7, (boolean)var13, (boolean)var14, (boolean)var11, (boolean)var23, var9, var20, var10, null
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
