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
import kotlin.jvm.internal.q

public class OverlayVoiceBubble : OverlayBubbleWrap {
   private final val binding: OverlayVoiceBubbleBinding

   internal final val imageView: SimpleDraweeView
      internal final get() {
         val var1: SimpleDraweeView = this.binding.overlayBubbleIv;
         q.g(this.binding.overlayBubbleIv, "overlayBubbleIv");
         return var1;
      }


   public constructor(context: Context) : q.h(var1, "context") {
      super(var1);
      val var2: OverlayVoiceBubbleBinding = OverlayVoiceBubbleBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      q.g(var2, "inflate(...)");
      this.binding = var2;
   }

   public constructor(context: Context, attrs: AttributeSet?) : q.h(var1, "context") {
      super(var1, var2);
      val var3: OverlayVoiceBubbleBinding = OverlayVoiceBubbleBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      q.g(var3, "inflate(...)");
      this.binding = var3;
   }

   public constructor(context: Context, attrs: AttributeSet?, attributeSetId: Int) : q.h(var1, "context") {
      super(var1, var2, var3);
      val var4: OverlayVoiceBubbleBinding = OverlayVoiceBubbleBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      q.g(var4, "inflate(...)");
      this.binding = var4;
   }

   private fun fadeActive() {
      this.getImageView$mobile_voice_overlay_release().animate().setDuration(100L).alpha(1.0F).start();
   }

   private fun fadeDormant() {
      this.getImageView$mobile_voice_overlay_release().animate().setDuration(200L).alpha(0.5F).start();
   }

   public fun configureUI(user: MobileVoiceOverlayDataUser) {
      q.h(var1, "user");
      val var2: SimpleDraweeView = this.binding.overlayBubbleIv;
      val var3: IconUrlUtils = IconUrlUtils.INSTANCE;
      val var4: Context = this.getContext();
      q.g(var4, "getContext(...)");
      var2.setImageURI(
         IconUrlUtils.getForUser-_fRzTXg$default(
            var3, var4, UserId.box-impl(var1.getUserId-re6GcUE()), var1.getAvatar(), var1.getDiscriminator(), false, null, 48, null
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
      q.g(var3, "getContext(...)");
      if (var2 > this.getAllowedAreaBounds(var3).centerX()) {
         var2 = Integer.MAX_VALUE;
      } else {
         var2 = Integer.MIN_VALUE;
      }

      super.onConfigurationChanged(var1);
      OverlayBubbleWrap.animateToCoordinate$default(this, var2, this.getWindowLayoutParams().y, null, 4, null);
      this.getSpringAnimationX().t();
      this.getSpringAnimationY().t();
   }

   public override fun setData(data: MobileVoiceOverlayData) {
      q.h(var1, "data");
      val var2: MobileVoiceOverlayDataUser = i.f0(var1.getUsers()) as MobileVoiceOverlayDataUser;
      if (var2 != null) {
         this.configureUI(var2);
      }
   }

   public companion object {
      private const val ACTIVE_DURATION_MS: Long
      private const val SETTLING_ALPHA: Float
      private const val SETTLING_DURATION_MS: Long
   }
}
