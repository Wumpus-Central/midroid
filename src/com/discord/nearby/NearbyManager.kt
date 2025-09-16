package com.discord.nearby

import android.content.Context
import com.google.android.gms.nearby.messages.Message
import com.google.android.gms.nearby.messages.SubscribeOptions
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.Intrinsics
import m6.d
import m6.h
import m6.i

internal class NearbyManager(onFoundUser: (String) -> Unit, onLostUser: (String) -> Unit, onError: (String) -> Unit) : m6.b {
   private final val onFoundUser: (String) -> Unit
   private final val onLostUser: (String) -> Unit
   private final val onError: (String) -> Unit
   private final val subscribeOptions: SubscribeOptions
   private final val statusCallback: <unrepresentable>
   private final lateinit var outboundMessage: Message

   init {
      this.onFoundUser = var1;
      this.onLostUser = var2;
      this.onError = var3;
      val var4: SubscribeOptions = new com.google.android.gms.nearby.messages.SubscribeOptions.a().b(i.r).a();
      this.subscribeOptions = var4;
      this.statusCallback = new h(this) {
         final NearbyManager this$0;

         {
            this.this$0 = var1;
         }

         public void onPermissionChanged(boolean var1) {
            super.onPermissionChanged(var1);
            if (!var1) {
               NearbyManager.access$getOnError$p(this.this$0).invoke("1");
            }
         }
      };
   }

   public fun disableNearby(context: Context) {
      val var3: d = j6.a.a(var1);
      var3.i(this.statusCallback);
      var var4: Message = this.outboundMessage;
      if (this.outboundMessage == null) {
         Intrinsics.throwUninitializedPropertyAccessException("outboundMessage");
         var4 = null;
      }

      var3.j(var4);
      var3.l(this);
   }

   public fun enableNearby(context: Context) {
      var var2: Message = this.outboundMessage;
      if (this.outboundMessage == null) {
         Intrinsics.throwUninitializedPropertyAccessException("outboundMessage");
         var2 = null;
      }

      val var4: d = j6.a.a(var1);
      var4.k(this.statusCallback);
      var4.d(var2);
      var4.c(this, this.subscribeOptions);
   }

   public open fun onFound(message: Message) {
      super.onFound(var1);
      val var2: Function1 = this.onFoundUser;
      val var3: ByteArray = var1.o();
      var2.invoke(new java.lang.String(var3, Charsets.UTF_8));
   }

   public open fun onLost(message: Message) {
      super.onLost(var1);
      val var2: Function1 = this.onLostUser;
      val var3: ByteArray = var1.o();
      var2.invoke(new java.lang.String(var3, Charsets.UTF_8));
   }

   public fun setOutboundMessage(message: String) {
      val var2: ByteArray = var1.getBytes(Charsets.UTF_8);
      this.outboundMessage = new Message(var2);
   }

   public companion object {
      public const val PERMISSION_DENIED: String
   }
}
