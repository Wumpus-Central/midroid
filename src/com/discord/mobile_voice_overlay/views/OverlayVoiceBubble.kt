package com.discord.mobile_voice_overlay.views

import android.content.Context
import android.content.res.Configuration
import android.util.AttributeSet
import android.view.LayoutInflater
import com.discord.icons.IconUrlUtils
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData
import com.discord.mobile_voice_overlay.MobileVoiceOverlayDataUser
import com.discord.mobile_voice_overlay.databinding.OverlayVoiceBubbleBinding
import com.discord.primitives.UserId
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nOverlayVoiceBubble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlayVoiceBubble.kt\ncom/discord/mobile_voice_overlay/views/OverlayVoiceBubble\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"])
public class OverlayVoiceBubble : OverlayBubbleWrap {
   private final val binding: OverlayVoiceBubbleBinding

   internal final val imageView: SimpleDraweeView
      internal final get() {
         val var1: SimpleDraweeView = this.binding.overlayBubbleIv;
         return var1;
      }


   public constructor(context: Context) : super(var1) {
      val var2: OverlayVoiceBubbleBinding = OverlayVoiceBubbleBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      this.binding = var2;
   }

   public constructor(context: Context, attrs: AttributeSet?) : super(var1, var2) {
      val var3: OverlayVoiceBubbleBinding = OverlayVoiceBubbleBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      this.binding = var3;
   }

   public constructor(context: Context, attrs: AttributeSet?, attributeSetId: Int) : super(var1, var2, var3) {
      val var4: OverlayVoiceBubbleBinding = OverlayVoiceBubbleBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      this.binding = var4;
   }

   private fun fadeActive() {
      this.getImageView$mobile_voice_overlay_release().animate().setDuration(100L).alpha(1.0F).start();
   }

   private fun fadeDormant() {
      this.getImageView$mobile_voice_overlay_release().animate().setDuration(200L).alpha(0.5F).start();
   }

   public fun configureUI(user: MobileVoiceOverlayDataUser) {
      val var4: SimpleDraweeView = this.binding.overlayBubbleIv;
      val var3: IconUrlUtils = IconUrlUtils.INSTANCE;
      val var2: Context = this.getContext();
      var4.setImageURI(
         IconUrlUtils.getForUser-_fRzTXg$default(
            var3, var2, UserId.box-impl(var1.getUserId-re6GcUE()), var1.getAvatar(), var1.getDiscriminator(), false, null, 48, null
         )
      );
      if (var1.getSpeaking()) {
         this.fadeActive();
      } else {
         this.fadeDormant();
      }
   }

   protected override fun onConfigurationChanged(newConfig: Configuration?) {
      var var2: Int = this.getWindowLayoutParams().x;
      val var3: Context = this.getContext();
      if (var2 > this.getAllowedAreaBounds(var3).centerX()) {
         var2 = Integer.MAX_VALUE;
      } else {
         var2 = Integer.MIN_VALUE;
      }

      super.onConfigurationChanged(var1);
      OverlayBubbleWrap.animateToCoordinate$default(this, var2, this.getWindowLayoutParams().y, null, 4, null);
      this.getSpringAnimationX().z();
      this.getSpringAnimationY().z();
   }

   public override fun setData(data: MobileVoiceOverlayData) {
      val var2: MobileVoiceOverlayDataUser = CollectionsKt.firstOrNull(var1.getUsers()) as MobileVoiceOverlayDataUser;
      if (var2 != null) {
         this.configureUI(var2);
      }
   }

   public companion object {
      private const val SETTLING_ALPHA: Float
      private const val SETTLING_DURATION_MS: Long
      private const val ACTIVE_DURATION_MS: Long
   }
}
