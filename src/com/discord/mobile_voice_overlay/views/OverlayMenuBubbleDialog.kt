package com.discord.mobile_voice_overlay.views

import android.animation.Animator
import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.discord.SetTextSizeSpKt
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.mobile_voice_overlay.MobileVoiceOverlay
import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData
import com.discord.mobile_voice_overlay.R
import com.discord.mobile_voice_overlay.databinding.OverlayMenuBubbleBinding
import com.discord.react_activities.ReactActivity
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q
import nh.w

public class OverlayMenuBubbleDialog : OverlayDialog {
   private final val adapter: VoiceUserAdapter
   private final val binding: OverlayMenuBubbleBinding

   public final val linkedAnchorView: View
      public final get() {
         val var1: View = this.binding.overlayLinkedAnchorView;
         q.g(this.binding.overlayLinkedAnchorView, "overlayLinkedAnchorView");
         return var1;
      }


   private final var onDisconnectPressed: () -> Unit
   private final var onGetInvitePressed: () -> Unit
   private final var onMutePressed: () -> Unit
   private final var onOpenDiscordPressed: () -> Unit

   public final var onShowSelectorDialog: () -> Unit
      internal set

   private final var onSwitchChannelsPressed: () -> Unit

   public constructor(context: Context) : q.h(var1, "context") {
      super(var1);
      val var3: OverlayMenuBubbleBinding = OverlayMenuBubbleBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      q.g(var3, "inflate(...)");
      this.binding = var3;
      this.adapter = new VoiceUserAdapter();
      this.onGetInvitePressed = <unrepresentable>.INSTANCE;
      this.onSwitchChannelsPressed = <unrepresentable>.INSTANCE;
      this.onOpenDiscordPressed = <unrepresentable>.INSTANCE;
      this.onMutePressed = <unrepresentable>.INSTANCE;
      this.onDisconnectPressed = <unrepresentable>.INSTANCE;
      this.onShowSelectorDialog = <unrepresentable>.INSTANCE;
      var3.overlayMenu.getBinding().overlayInviteLink.setOnClickListener(new b(this));
      var3.overlayMenu.getBinding().overlaySwitchChannels.setOnClickListener(new c(this));
      var3.overlayMenu.getBinding().overlayOpenApp.setOnClickListener(new d(this));
      var3.overlayMenu.getBinding().muteToggle.setOnClickListener(new e(this));
      var3.overlayMenu.getBinding().disconnectBtn.setOnClickListener(new f(this));
      this.setClipChildren(false);
      val var2: TextView = var3.overlayMembersOverflowText;
      q.e(var3.overlayMembersOverflowText);
      DiscordFontUtilsKt.setDiscordFont(var2, DiscordFont.PrimaryExtraBold);
      SetTextSizeSpKt.setTextSizeSp(var2, 20.0F);
      val var4: TextView = var3.overlayMembersOverflowText;
      var3.overlayMembersOverflowText.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      q.e(var4);
      ViewBackgroundUtilsKt.setBackgroundOval$default(var4, ThemeManagerKt.getTheme().getBackgroundTertiary(), 0, 2, null);
   }

   public constructor(context: Context, attrs: AttributeSet?) : q.h(var1, "context") {
      super(var1, var2);
      val var3: OverlayMenuBubbleBinding = OverlayMenuBubbleBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      q.g(var3, "inflate(...)");
      this.binding = var3;
      this.adapter = new VoiceUserAdapter();
      this.onGetInvitePressed = <unrepresentable>.INSTANCE;
      this.onSwitchChannelsPressed = <unrepresentable>.INSTANCE;
      this.onOpenDiscordPressed = <unrepresentable>.INSTANCE;
      this.onMutePressed = <unrepresentable>.INSTANCE;
      this.onDisconnectPressed = <unrepresentable>.INSTANCE;
      this.onShowSelectorDialog = <unrepresentable>.INSTANCE;
      var3.overlayMenu.getBinding().overlayInviteLink.setOnClickListener(new b(this));
      var3.overlayMenu.getBinding().overlaySwitchChannels.setOnClickListener(new c(this));
      var3.overlayMenu.getBinding().overlayOpenApp.setOnClickListener(new d(this));
      var3.overlayMenu.getBinding().muteToggle.setOnClickListener(new e(this));
      var3.overlayMenu.getBinding().disconnectBtn.setOnClickListener(new f(this));
      this.setClipChildren(false);
      val var5: TextView = var3.overlayMembersOverflowText;
      q.e(var3.overlayMembersOverflowText);
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryExtraBold);
      SetTextSizeSpKt.setTextSizeSp(var5, 20.0F);
      val var4: TextView = var3.overlayMembersOverflowText;
      var3.overlayMembersOverflowText.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      q.e(var4);
      ViewBackgroundUtilsKt.setBackgroundOval$default(var4, ThemeManagerKt.getTheme().getBackgroundTertiary(), 0, 2, null);
   }

   public constructor(context: Context, attrs: AttributeSet?, attributeSetId: Int) : q.h(var1, "context") {
      super(var1, var2, var3);
      val var6: OverlayMenuBubbleBinding = OverlayMenuBubbleBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      q.g(var6, "inflate(...)");
      this.binding = var6;
      this.adapter = new VoiceUserAdapter();
      this.onGetInvitePressed = <unrepresentable>.INSTANCE;
      this.onSwitchChannelsPressed = <unrepresentable>.INSTANCE;
      this.onOpenDiscordPressed = <unrepresentable>.INSTANCE;
      this.onMutePressed = <unrepresentable>.INSTANCE;
      this.onDisconnectPressed = <unrepresentable>.INSTANCE;
      this.onShowSelectorDialog = <unrepresentable>.INSTANCE;
      var6.overlayMenu.getBinding().overlayInviteLink.setOnClickListener(new b(this));
      var6.overlayMenu.getBinding().overlaySwitchChannels.setOnClickListener(new c(this));
      var6.overlayMenu.getBinding().overlayOpenApp.setOnClickListener(new d(this));
      var6.overlayMenu.getBinding().muteToggle.setOnClickListener(new e(this));
      var6.overlayMenu.getBinding().disconnectBtn.setOnClickListener(new f(this));
      this.setClipChildren(false);
      val var4: TextView = var6.overlayMembersOverflowText;
      q.e(var6.overlayMembersOverflowText);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryExtraBold);
      SetTextSizeSpKt.setTextSizeSp(var4, 20.0F);
      val var5: TextView = var6.overlayMembersOverflowText;
      var6.overlayMembersOverflowText.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      q.e(var5);
      ViewBackgroundUtilsKt.setBackgroundOval$default(var5, ThemeManagerKt.getTheme().getBackgroundTertiary(), 0, 2, null);
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: OverlayMenuBubbleDialog, var1: View) {
      q.h(var0, "this$0");
      var0.onGetInvitePressed.invoke();
   }

   @JvmStatic
   fun `_init_$lambda$1`(var0: OverlayMenuBubbleDialog, var1: View) {
      q.h(var0, "this$0");
      var0.onSwitchChannelsPressed.invoke();
   }

   @JvmStatic
   fun `_init_$lambda$2`(var0: OverlayMenuBubbleDialog, var1: View) {
      q.h(var0, "this$0");
      var0.onOpenDiscordPressed.invoke();
   }

   @JvmStatic
   fun `_init_$lambda$3`(var0: OverlayMenuBubbleDialog, var1: View) {
      q.h(var0, "this$0");
      var0.onMutePressed.invoke();
   }

   @JvmStatic
   fun `_init_$lambda$4`(var0: OverlayMenuBubbleDialog, var1: View) {
      q.h(var0, "this$0");
      var0.onDisconnectPressed.invoke();
      var0.closeDialog();
   }

   public override fun getClosingAnimator(): Animator {
      val var1: AnimatorSet = new AnimatorSet();
      var1.setStartDelay((long)this.getResources().getInteger(17694720));
      val var2: Animator = AnimatorInflater.loadAnimator(this.binding.overlayMenu.getContext(), R.animator.overlay_slide_down_fade_out);
      var2.setTarget(this.binding.overlayMenu);
      val var4: Animator = AnimatorInflater.loadAnimator(this.getContext(), R.animator.overlay_slide_up_fade_out);
      var4.setTarget(this.binding.overlayHeader);
      var1.playTogether(new Animator[]{var2, var4});
      return var1;
   }

   protected open fun onAttachedToWindow() {
      super.onAttachedToWindow();
      this.binding.overlayMenu.setAlpha(0.0F);
      this.binding.overlayHeader.setAlpha(0.0F);
      val var2: AnimatorSet = new AnimatorSet();
      val var1: Animator = AnimatorInflater.loadAnimator(this.binding.overlayMenu.getContext(), R.animator.overlay_slide_up_fade_in);
      var1.setTarget(this.binding.overlayMenu);
      val var4: Animator = AnimatorInflater.loadAnimator(this.getContext(), R.animator.overlay_slide_down_fade_in);
      var4.setTarget(this.binding.overlayHeader);
      var2.playTogether(new Animator[]{var1, var4});
      var2.setStartDelay((long)this.getResources().getInteger(17694720));
      var2.start();
      this.binding.overlayMembersRecycler.setAdapter(this.adapter);
   }

   protected override fun onConfigurationChanged(newConfig: Configuration?) {
      super.onConfigurationChanged(var1);
      this.getOnDialogClosed().invoke(this);
   }

   public override fun setAssets(assets: MobileVoiceOverlayAssets) {
      q.h(var1, "assets");
      super.setAssets(var1);
      this.binding.overlayMenu.setAssets(var1);
   }

   public override fun setData(data: MobileVoiceOverlayData) {
      q.h(var1, "data");
      var var3: java.util.List = var1.getUsers();
      if (var3.size() < 2) {
         var3 = i.k();
      } else {
         var3 = i.G0(var3, kotlin.ranges.f.r(1, var3.size()));
      }

      this.adapter.setData(var3);
      val var4: TextView = this.binding.overlayMembersOverflowText;
      var var2: Byte;
      if (var1.getExtraUsers() == 0) {
         var2 = 8;
      } else {
         var2 = 0;
      }

      var4.setVisibility(var2);
      val var7: java.lang.String;
      if (var1.getExtraUsers() == 0) {
         var7 = null;
      } else {
         var2 = var1.getExtraUsers();
         val var8: StringBuilder = new StringBuilder();
         var8.append("+");
         var8.append(var2);
         var7 = var8.toString();
      }

      var4.setText(var7);
      this.binding.overlayMenu.setData(var1);
      this.onGetInvitePressed = new Function0(this, var1) {
         final MobileVoiceOverlayData $data;
         final OverlayMenuBubbleDialog this$0;

         {
            super(0);
            this.this$0 = var1;
            this.$data = var2;
         }

         public final void invoke() {
            val var1: MobileVoiceOverlay.Companion = MobileVoiceOverlay.Companion;
            val var2: Context = this.this$0.getContext();
            q.g(var2, "getContext(...)");
            var1.startHeadlessTask(var2, "GenerateInvite", androidx.core.os.e.a(w.a("channelId", java.lang.String.valueOf(this.$data.getChannelId-o4g7jtM()))));
            val var3: MobileVoiceOverlayAssets = this.this$0.getOverlayAssets();
            if (var3 != null) {
               Toast.makeText(this.this$0.getContext(), var3.getInviteLinkCopied(), 0).show();
            }
         }
      };
      this.onSwitchChannelsPressed = new Function0(this) {
         final OverlayMenuBubbleDialog this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final void invoke() {
            this.this$0.getOnDialogClosed().invoke(this.this$0);
            this.this$0.getOnShowSelectorDialog().invoke();
         }
      };
      this.onOpenDiscordPressed = new Function0(this, var1) {
         final MobileVoiceOverlayData $data;
         final OverlayMenuBubbleDialog this$0;

         {
            super(0);
            this.this$0 = var1;
            this.$data = var2;
         }

         public final void invoke() {
            val var2: Context = this.this$0.getContext();
            val var1: Intent = new Intent("android.intent.action.VIEW", null, this.this$0.getContext(), ReactActivity.Registry.getMainActivity());
            var1.addCategory("android.intent.category.HOME");
            var1.addFlags(268435456);
            var2.startActivity(var1);
            val var4: MobileVoiceOverlay.Companion = MobileVoiceOverlay.Companion;
            val var3: Context = this.this$0.getContext();
            q.g(var3, "getContext(...)");
            var4.startHeadlessTask(var3, "SelectChannel", androidx.core.os.e.a(w.a("channelId", java.lang.String.valueOf(this.$data.getChannelId-o4g7jtM()))));
         }
      };
      this.onMutePressed = new Function0(this) {
         final OverlayMenuBubbleDialog this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final void invoke() {
            val var2: MobileVoiceOverlay.Companion = MobileVoiceOverlay.Companion;
            val var1: Context = this.this$0.getContext();
            q.g(var1, "getContext(...)");
            MobileVoiceOverlay.Companion.startHeadlessTask$default(var2, var1, "ToggleSelfMute", null, 4, null);
         }
      };
      this.onDisconnectPressed = new Function0(this, var1) {
         final MobileVoiceOverlayData $data;
         final OverlayMenuBubbleDialog this$0;

         {
            super(0);
            this.this$0 = var1;
            this.$data = var2;
         }

         public final void invoke() {
            val var1: MobileVoiceOverlay.Companion = MobileVoiceOverlay.Companion;
            val var2: Context = this.this$0.getContext();
            q.g(var2, "getContext(...)");
            var1.startHeadlessTask(var2, "Disconnect", androidx.core.os.e.a(w.a("channelId", java.lang.String.valueOf(this.$data.getChannelId-o4g7jtM()))));
         }
      };
   }
}
