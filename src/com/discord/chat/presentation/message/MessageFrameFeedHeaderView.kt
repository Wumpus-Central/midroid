package com.discord.chat.presentation.message

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.databinding.MessageFrameFeedHeaderBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.overlapping_circles.OverlappingCirclesView
import com.discord.overlapping_circles.OverlappingItem
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import gn.b2
import gn.g0
import java.util.ArrayList
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

public class MessageFrameFeedHeaderView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final val binding: MessageFrameFeedHeaderBinding

   fun MessageFrameFeedHeaderView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun MessageFrameFeedHeaderView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2, var3);
      val var5: MessageFrameFeedHeaderBinding = MessageFrameFeedHeaderBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var5, "inflate(...)");
      this.binding = var5;
      var var4: TextView = var5.feedChannelText;
      var5.feedChannelText.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      kotlin.jvm.internal.q.e(var4);
      val var7: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryMedium);
      var4 = var5.feedReplyCount;
      var5.feedReplyCount.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      kotlin.jvm.internal.q.e(var4);
      DiscordFontUtilsKt.setDiscordFont(var4, var7);
      val var8: SimpleDraweeView = var5.feedChannelIcon;
      kotlin.jvm.internal.q.g(var5.feedChannelIcon, "feedChannelIcon");
      ColorUtilsKt.setTintColor(var8, ThemeManagerKt.getTheme().getInteractiveNormal());
      val var6: SimpleDraweeView = var5.feedReplyIcon;
      kotlin.jvm.internal.q.g(var5.feedReplyIcon, "feedReplyIcon");
      ColorUtilsKt.setTintColor(var6, ThemeManagerKt.getTheme().getTextNormal());
      this.setPadding(SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8), SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(12));
   }

   public fun configure(messageFrame: com.discord.chat.presentation.message.MessageFrameFeedHeaderView.MessageBundleHeader, onOverflowClick: OnClickListener?) {
      kotlin.jvm.internal.q.h(var1, "messageFrame");
      val var6: TextView = this.binding.feedChannelText;
      kotlin.jvm.internal.q.e(this.binding.feedChannelText);
      ViewUtilsKt.setOptionalText(var6, var1.getChannelName());
      var var3: Boolean;
      if (var1.getChannelIconURL() != null) {
         var3 = 1;
      } else {
         var3 = 0;
      }

      if (var3) {
         var3 = (byte)0;
      } else {
         var3 = (byte)8;
      }

      var6.setVisibility(var3);
      val var20: SimpleDraweeView = this.binding.feedChannelIcon;
      kotlin.jvm.internal.q.g(this.binding.feedChannelIcon, "feedChannelIcon");
      ReactAssetUtilsKt.setOptionalReactImageUrl(var20, var1.getChannelIconURL());
      val var23: SimpleDraweeView = this.binding.feedReplyIcon;
      kotlin.jvm.internal.q.e(this.binding.feedReplyIcon);
      ReactAssetUtilsKt.setOptionalReactImageUrl(var23, var1.getChatIconURL());
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var23, false, var2, 1, null);
      val var10: ArrayList = var1.getAvatarURLs();
      if (var10 != null) {
         var3 = var10.size();
      } else {
         var3 = 0;
      }

      val var24: TextView = this.binding.feedReplyCount;
      kotlin.jvm.internal.q.g(this.binding.feedReplyCount, "feedReplyCount");
      val var11: java.lang.String;
      if (var3 > 3) {
         var11 = "3+";
      } else if (var3 > 0) {
         var11 = java.lang.String.valueOf(var3);
      } else {
         var11 = null;
      }

      ViewUtilsKt.setOptionalText(var24, var11);
      val var25: OverlappingCirclesView = this.binding.feedReplyParticipants;
      val var12: ArrayList = var1.getAvatarURLs();
      var var8: ArrayList = null;
      if (var12 != null) {
         val var13: java.util.List = kotlin.collections.i.J0(var12, 3);
         var8 = null;
         if (var13 != null) {
            val var14: ArrayList = new ArrayList(kotlin.collections.i.u(var13, 10));
            val var22: java.util.Iterator = var13.iterator();

            while (true) {
               var8 = var14;
               if (!var22.hasNext()) {
                  break;
               }

               var14.add(new OverlappingItem(var22.next() as java.lang.String));
            }
         }
      }

      var var15: Any = var8;
      if (var8 == null) {
         var15 = kotlin.collections.i.j();
      }

      var25.setItems((java.util.List<OverlappingItem>)var15);
      kotlin.jvm.internal.q.e(var25);
      var var18: Boolean;
      if (var3 > 0) {
         var18 = 1;
      } else {
         var18 = 0;
      }

      if (var18) {
         var18 = 0;
      } else {
         var18 = 8;
      }

      var25.setVisibility(var18);
   }

   @dn.f
   public data class MessageBundleHeader(channelIconURL: String? = null,
      chatIconURL: String? = null,
      avatarURLs: ArrayList<String>? = null,
      channelName: String? = null
   ) {
      public final val avatarURLs: ArrayList<String>?
      public final val channelIconURL: String?
      public final val channelName: String?
      public final val chatIconURL: String?

      fun MessageBundleHeader() {
         this(null, null, null, null, 15, null);
      }

      init {
         this.channelIconURL = var1;
         this.chatIconURL = var2;
         this.avatarURLs = var3;
         this.channelName = var4;
      }

      public operator fun component1(): String? {
         return this.channelIconURL;
      }

      public operator fun component2(): String? {
         return this.chatIconURL;
      }

      public operator fun component3(): ArrayList<String>? {
         return this.avatarURLs;
      }

      public operator fun component4(): String? {
         return this.channelName;
      }

      public fun copy(
         channelIconURL: String? = var0.channelIconURL,
         chatIconURL: String? = var0.chatIconURL,
         avatarURLs: ArrayList<String>? = var0.avatarURLs,
         channelName: String? = var0.channelName
      ): com.discord.chat.presentation.message.MessageFrameFeedHeaderView.MessageBundleHeader {
         return new MessageFrameFeedHeaderView.MessageBundleHeader(var1, var2, var3, var4);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is MessageFrameFeedHeaderView.MessageBundleHeader) {
            return false;
         } else {
            var1 = var1;
            if (!kotlin.jvm.internal.q.c(this.channelIconURL, var1.channelIconURL)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.chatIconURL, var1.chatIconURL)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.avatarURLs, var1.avatarURLs)) {
               return false;
            } else {
               return kotlin.jvm.internal.q.c(this.channelName, var1.channelName);
            }
         }
      }

      public override fun hashCode(): Int {
         var var4: Int = 0;
         val var1: Int;
         if (this.channelIconURL == null) {
            var1 = 0;
         } else {
            var1 = this.channelIconURL.hashCode();
         }

         val var2: Int;
         if (this.chatIconURL == null) {
            var2 = 0;
         } else {
            var2 = this.chatIconURL.hashCode();
         }

         val var3: Int;
         if (this.avatarURLs == null) {
            var3 = 0;
         } else {
            var3 = this.avatarURLs.hashCode();
         }

         if (this.channelName != null) {
            var4 = this.channelName.hashCode();
         }

         return ((var1 * 31 + var2) * 31 + var3) * 31 + var4;
      }

      public override fun toString(): String {
         val var3: java.lang.String = this.channelIconURL;
         val var4: java.lang.String = this.chatIconURL;
         val var1: ArrayList = this.avatarURLs;
         val var5: java.lang.String = this.channelName;
         val var2: StringBuilder = new StringBuilder();
         var2.append("MessageBundleHeader(channelIconURL=");
         var2.append(var3);
         var2.append(", chatIconURL=");
         var2.append(var4);
         var2.append(", avatarURLs=");
         var2.append(var1);
         var2.append(", channelName=");
         var2.append(var5);
         var2.append(")");
         return var2.toString();
      }

      public object `$serializer` : g0 {
         public open val descriptor: SerialDescriptor
            public open get() {
               return descriptor;
            }


         @JvmStatic
         fun {
            val var0: MessageFrameFeedHeaderView.MessageBundleHeader.$serializer = new MessageFrameFeedHeaderView.MessageBundleHeader.$serializer();
            INSTANCE = var0;
            val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
               "com.discord.chat.presentation.message.MessageFrameFeedHeaderView.MessageBundleHeader", var0, 4
            );
            var1.l("channelIconURL", true);
            var1.l("chatIconURL", true);
            var1.l("avatarURLs", true);
            var1.l("channelName", true);
            descriptor = var1;
         }

         public open fun childSerializers(): Array<KSerializer<*>> {
            val var2: Array<KSerializer> = MessageFrameFeedHeaderView.MessageBundleHeader.access$get$childSerializers$cp();
            val var1: b2 = b2.a;
            return new KSerializer[]{en.a.u(b2.a), en.a.u(var1), en.a.u(var2[2]), en.a.u(var1)};
         }

         public open fun deserialize(decoder: Decoder): com.discord.chat.presentation.message.MessageFrameFeedHeaderView.MessageBundleHeader {
            kotlin.jvm.internal.q.h(var1, "decoder");
            val var9: SerialDescriptor = this.getDescriptor();
            val var10: kotlinx.serialization.encoding.c = var1.b(var9);
            val var11: Array<KSerializer> = MessageFrameFeedHeaderView.MessageBundleHeader.access$get$childSerializers$cp();
            val var5: Boolean = var10.p();
            var var8: java.lang.String = null;
            var var2: Int;
            var var6: ArrayList;
            var var7: java.lang.String;
            var var13: Any;
            if (var5) {
               var13 = b2.a;
               var8 = var10.n(var9, 0, b2.a, null) as java.lang.String;
               var7 = var10.n(var9, 1, (DeserializationStrategy)var13, null) as java.lang.String;
               var6 = var10.n(var9, 2, var11[2], null) as ArrayList;
               var13 = var10.n(var9, 3, (DeserializationStrategy)var13, null) as java.lang.String;
               var2 = 15;
            } else {
               var var3: Boolean = true;
               var2 = 0;
               var7 = null;
               var6 = null;
               var13 = null;

               while (var3) {
                  val var4: Int = var10.o(var9);
                  if (var4 != -1) {
                     if (var4 != 0) {
                        if (var4 != 1) {
                           if (var4 != 2) {
                              if (var4 != 3) {
                                 throw new dn.n(var4);
                              }

                              var13 = var10.n(var9, 3, b2.a, var13) as java.lang.String;
                              var2 |= 8;
                           } else {
                              var6 = var10.n(var9, 2, var11[2], var6) as ArrayList;
                              var2 |= 4;
                           }
                        } else {
                           var7 = var10.n(var9, 1, b2.a, var7) as java.lang.String;
                           var2 |= 2;
                        }
                     } else {
                        var8 = var10.n(var9, 0, b2.a, var8) as java.lang.String;
                        var2 |= 1;
                     }
                  } else {
                     var3 = false;
                  }
               }
            }

            var10.c(var9);
            return new MessageFrameFeedHeaderView.MessageBundleHeader(var2, var8, var7, var6, (java.lang.String)var13, null);
         }

         public open fun serialize(encoder: Encoder, value: com.discord.chat.presentation.message.MessageFrameFeedHeaderView.MessageBundleHeader) {
            kotlin.jvm.internal.q.h(var1, "encoder");
            kotlin.jvm.internal.q.h(var2, "value");
            val var3: SerialDescriptor = this.getDescriptor();
            val var4: CompositeEncoder = var1.b(var3);
            MessageFrameFeedHeaderView.MessageBundleHeader.write$Self$chat_release(var2, var4, var3);
            var4.c(var3);
         }

         fun typeParametersSerializers(): Array<KSerializer> {
            return gn.g0.a.a(this);
         }
      }

      public companion object {
         public fun serializer(): KSerializer<com.discord.chat.presentation.message.MessageFrameFeedHeaderView.MessageBundleHeader> {
            return MessageFrameFeedHeaderView.MessageBundleHeader.$serializer.INSTANCE;
         }
      }
   }
}
