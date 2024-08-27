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
import java.util.ArrayList
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import xk.a2
import xk.f0

public class MessageFrameFeedHeaderView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final val binding: MessageFrameFeedHeaderBinding

   fun MessageFrameFeedHeaderView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun MessageFrameFeedHeaderView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2, var3);
      val var5: MessageFrameFeedHeaderBinding = MessageFrameFeedHeaderBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var5, "inflate(LayoutInflater.from(context), this)");
      this.binding = var5;
      var var4: TextView = var5.feedChannelText;
      var5.feedChannelText.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      kotlin.jvm.internal.r.g(var4, "_init_$lambda$0");
      val var7: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryMedium);
      var4 = var5.feedReplyCount;
      var5.feedReplyCount.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      kotlin.jvm.internal.r.g(var4, "_init_$lambda$1");
      DiscordFontUtilsKt.setDiscordFont(var4, var7);
      val var8: SimpleDraweeView = var5.feedChannelIcon;
      kotlin.jvm.internal.r.g(var5.feedChannelIcon, "binding.feedChannelIcon");
      ColorUtilsKt.setTintColor(var8, ThemeManagerKt.getTheme().getInteractiveNormal());
      val var6: SimpleDraweeView = var5.feedReplyIcon;
      kotlin.jvm.internal.r.g(var5.feedReplyIcon, "binding.feedReplyIcon");
      ColorUtilsKt.setTintColor(var6, ThemeManagerKt.getTheme().getTextNormal());
      this.setPadding(SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8), SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(12));
   }

   public fun configure(messageFrame: com.discord.chat.presentation.message.MessageFrameFeedHeaderView.MessageBundleHeader, onOverflowClick: OnClickListener?) {
      kotlin.jvm.internal.r.h(var1, "messageFrame");
      val var6: TextView = this.binding.feedChannelText;
      kotlin.jvm.internal.r.g(this.binding.feedChannelText, "configure$lambda$2");
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
      val var19: SimpleDraweeView = this.binding.feedChannelIcon;
      kotlin.jvm.internal.r.g(this.binding.feedChannelIcon, "binding.feedChannelIcon");
      ReactAssetUtilsKt.setOptionalReactImageUrl(var19, var1.getChannelIconURL());
      val var22: SimpleDraweeView = this.binding.feedReplyIcon;
      kotlin.jvm.internal.r.g(this.binding.feedReplyIcon, "configure$lambda$3");
      ReactAssetUtilsKt.setOptionalReactImageUrl(var22, var1.getChatIconURL());
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var22, false, var2, 1, null);
      val var10: ArrayList = var1.getAvatarURLs();
      if (var10 != null) {
         var3 = var10.size();
      } else {
         var3 = 0;
      }

      val var23: TextView = this.binding.feedReplyCount;
      kotlin.jvm.internal.r.g(this.binding.feedReplyCount, "binding.feedReplyCount");
      val var11: java.lang.String;
      if (var3 > 3) {
         var11 = "3+";
      } else if (var3 > 0) {
         var11 = java.lang.String.valueOf(var3);
      } else {
         var11 = null;
      }

      ViewUtilsKt.setOptionalText(var23, var11);
      val var24: OverlappingCirclesView = this.binding.feedReplyParticipants;
      val var12: ArrayList = var1.getAvatarURLs();
      var var9: ArrayList = null;
      if (var12 != null) {
         val var8: java.util.List = kotlin.collections.h.G0(var12, 3);
         var9 = null;
         if (var8 != null) {
            val var13: ArrayList = new ArrayList(kotlin.collections.h.t(var8, 10));
            val var21: java.util.Iterator = var8.iterator();

            while (true) {
               var9 = var13;
               if (!var21.hasNext()) {
                  break;
               }

               var13.add(new OverlappingItem(var21.next() as java.lang.String));
            }
         }
      }

      var var14: Any = var9;
      if (var9 == null) {
         var14 = kotlin.collections.h.i();
      }

      var24.setItems((java.util.List)var14);
      kotlin.jvm.internal.r.g(var24, "configure$lambda$5");
      var var17: Boolean;
      if (var3 > 0) {
         var17 = 1;
      } else {
         var17 = 0;
      }

      if (var17) {
         var17 = 0;
      } else {
         var17 = 8;
      }

      var24.setVisibility(var17);
   }

   @uk.f
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
         super();
         this.channelIconURL = var1;
         this.chatIconURL = var2;
         this.avatarURLs = var3;
         this.channelName = var4;
      }

      @JvmStatic
      public fun `write$Self`(
         self: com.discord.chat.presentation.message.MessageFrameFeedHeaderView.MessageBundleHeader,
         output: CompositeEncoder,
         serialDesc: SerialDescriptor
      ) {
         kotlin.jvm.internal.r.h(var0, "self");
         kotlin.jvm.internal.r.h(var1, "output");
         kotlin.jvm.internal.r.h(var2, "serialDesc");
         var var3: Boolean;
         if (!var1.A(var2, 0) && var0.channelIconURL == null) {
            var3 = false;
         } else {
            var3 = true;
         }

         if (var3) {
            var1.m(var2, 0, a2.a, var0.channelIconURL);
         }

         if (!var1.A(var2, 1) && var0.chatIconURL == null) {
            var3 = false;
         } else {
            var3 = true;
         }

         if (var3) {
            var1.m(var2, 1, a2.a, var0.chatIconURL);
         }

         if (!var1.A(var2, 2) && var0.avatarURLs == null) {
            var3 = false;
         } else {
            var3 = true;
         }

         if (var3) {
            var1.m(var2, 2, new xk.f(a2.a), var0.avatarURLs);
         }

         label40: {
            if (!var1.A(var2, 3)) {
               var3 = false;
               if (var0.channelName == null) {
                  break label40;
               }
            }

            var3 = true;
         }

         if (var3) {
            var1.m(var2, 3, a2.a, var0.channelName);
         }
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
            if (!kotlin.jvm.internal.r.c(this.channelIconURL, var1.channelIconURL)) {
               return false;
            } else if (!kotlin.jvm.internal.r.c(this.chatIconURL, var1.chatIconURL)) {
               return false;
            } else if (!kotlin.jvm.internal.r.c(this.avatarURLs, var1.avatarURLs)) {
               return false;
            } else {
               return kotlin.jvm.internal.r.c(this.channelName, var1.channelName);
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
         val var4: java.lang.String = this.channelIconURL;
         val var5: java.lang.String = this.chatIconURL;
         val var3: ArrayList = this.avatarURLs;
         val var2: java.lang.String = this.channelName;
         val var1: StringBuilder = new StringBuilder();
         var1.append("MessageBundleHeader(channelIconURL=");
         var1.append(var4);
         var1.append(", chatIconURL=");
         var1.append(var5);
         var1.append(", avatarURLs=");
         var1.append(var3);
         var1.append(", channelName=");
         var1.append(var2);
         var1.append(")");
         return var1.toString();
      }

      public object `$serializer` : f0<MessageFrameFeedHeaderView.MessageBundleHeader> {
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
            val var1: a2 = a2.a;
            return new KSerializer[]{vk.a.u(a2.a), vk.a.u(var1), vk.a.u(new xk.f(var1)), vk.a.u(var1)};
         }

         public open fun deserialize(decoder: Decoder): com.discord.chat.presentation.message.MessageFrameFeedHeaderView.MessageBundleHeader {
            kotlin.jvm.internal.r.h(var1, "decoder");
            val var10: SerialDescriptor = this.getDescriptor();
            val var11: kotlinx.serialization.encoding.c = var1.b(var10);
            val var5: Boolean = var11.p();
            var var8: Any = null;
            var var2: Int;
            var var6: Any;
            var var7: Any;
            var var13: Any;
            if (var5) {
               var13 = a2.a;
               var8 = var11.n(var10, 0, a2.a, null);
               var6 = var11.n(var10, 1, (DeserializationStrategy)var13, null);
               var7 = var11.n(var10, 2, new xk.f((KSerializer)var13), null);
               var13 = var11.n(var10, 3, (DeserializationStrategy)var13, null);
               var2 = 15;
            } else {
               var var3: Boolean = true;
               var2 = 0;
               var7 = null;
               var6 = null;
               var13 = null;

               while (var3) {
                  val var4: Int = var11.o(var10);
                  if (var4 != -1) {
                     if (var4 != 0) {
                        if (var4 != 1) {
                           if (var4 != 2) {
                              if (var4 != 3) {
                                 throw new uk.n(var4);
                              }

                              var13 = var11.n(var10, 3, a2.a, var13);
                              var2 |= 8;
                           } else {
                              var6 = var11.n(var10, 2, new xk.f(a2.a), var6);
                              var2 |= 4;
                           }
                        } else {
                           var7 = var11.n(var10, 1, a2.a, var7);
                           var2 |= 2;
                        }
                     } else {
                        var8 = var11.n(var10, 0, a2.a, var8);
                        var2 |= 1;
                     }
                  } else {
                     var3 = false;
                  }
               }

               var7 = var6;
               var6 = var7;
            }

            var11.c(var10);
            return new MessageFrameFeedHeaderView.MessageBundleHeader(
               var2, var8 as java.lang.String, var6 as java.lang.String, var7 as ArrayList, var13 as java.lang.String, null
            );
         }

         public open fun serialize(encoder: Encoder, value: com.discord.chat.presentation.message.MessageFrameFeedHeaderView.MessageBundleHeader) {
            kotlin.jvm.internal.r.h(var1, "encoder");
            kotlin.jvm.internal.r.h(var2, "value");
            val var3: SerialDescriptor = this.getDescriptor();
            val var4: CompositeEncoder = var1.b(var3);
            MessageFrameFeedHeaderView.MessageBundleHeader.write$Self(var2, var4, var3);
            var4.c(var3);
         }

         fun typeParametersSerializers(): Array<KSerializer<?>> {
            return xk.f0.a.a(this);
         }
      }

      public companion object {
         public fun serializer(): KSerializer<com.discord.chat.presentation.message.MessageFrameFeedHeaderView.MessageBundleHeader> {
            return MessageFrameFeedHeaderView.MessageBundleHeader.$serializer.INSTANCE;
         }
      }
   }
}
