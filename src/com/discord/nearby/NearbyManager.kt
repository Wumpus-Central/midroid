package com.discord.nearby

import android.content.Context
import cb.b
import cb.d
import cb.h
import cb.i
import com.google.android.gms.nearby.messages.Message
import com.google.android.gms.nearby.messages.SubscribeOptions
import com.google.android.gms.nearby.messages.SubscribeOptions.a
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r

internal class NearbyManager(onFoundUser: (String) -> Unit, onLostUser: (String) -> Unit, onError: (String) -> Unit) : b {
   private final val onFoundUser: (String) -> Unit
   private final val onLostUser: (String) -> Unit
   private final val onError: (String) -> Unit
   private final val subscribeOptions: SubscribeOptions
   private final val statusCallback: <unrepresentable>
   private final lateinit var outboundMessage: Message

   init {
      r.h(var1, "onFoundUser");
      r.h(var2, "onLostUser");
      r.h(var3, "onError");
      super();
      this.onFoundUser = var1;
      this.onLostUser = var2;
      this.onError = var3;
      val var4: SubscribeOptions = new a().b(i.r).a();
      r.g(var4, "Builder()\n        .setSt…DEFAULT)\n        .build()");
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
      r.h(var1, "context");
      val var3: d = za.a.a(var1);
      var3.j(this.statusCallback);
      var var4: Message = this.outboundMessage;
      if (this.outboundMessage == null) {
         r.y("outboundMessage");
         var4 = null;
      }

      var3.h(var4);
      var3.i(this);
   }

   public fun enableNearby(context: Context) {
      r.h(var1, "context");
      var var2: Message = this.outboundMessage;
      if (this.outboundMessage == null) {
         r.y("outboundMessage");
         var2 = null;
      }

      val var4: d = za.a.a(var1);
      var4.f(this.statusCallback);
      var4.e(var2);
      var4.m(this, this.subscribeOptions);
   }

   public open fun onFound(message: Message) {
      r.h(var1, "message");
      super.onFound(var1);
      val var2: Function1 = this.onFoundUser;
      val var3: ByteArray = var1.r();
      r.g(var3, "message.content");
      var2.invoke(new java.lang.String(var3, ik.a.b));
   }

   public open fun onLost(message: Message) {
      r.h(var1, "message");
      super.onLost(var1);
      val var2: Function1 = this.onLostUser;
      val var3: ByteArray = var1.r();
      r.g(var3, "message.content");
      var2.invoke(new java.lang.String(var3, ik.a.b));
   }

   public fun setOutboundMessage(message: String) {
      r.h(var1, "message");
      val var2: ByteArray = var1.getBytes(ik.a.b);
      r.g(var2, "this as java.lang.String).getBytes(charset)");
      this.outboundMessage = new Message(var2);
   }

   public companion object {
      public const val PERMISSION_DENIED: String
   }
}
