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
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nOverlayMenuBubbleDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlayMenuBubbleDialog.kt\ncom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n1#2:226\n*E\n"])
public class OverlayMenuBubbleDialog : OverlayDialog {
   private final val binding: OverlayMenuBubbleBinding
   private final val adapter: VoiceUserAdapter
   private final var onGetInvitePressed: () -> Unit
   private final var onSwitchChannelsPressed: () -> Unit
   private final var onOpenDiscordPressed: () -> Unit
   private final var onMutePressed: () -> Unit
   private final var onDisconnectPressed: () -> Unit

   public final var onShowSelectorDialog: () -> Unit
      internal set

   public final val linkedAnchorView: View
      public final get() {
         val var1: View = this.binding.overlayLinkedAnchorView;
         return var1;
      }


   public constructor(context: Context) : super(var1) {
      val var2: OverlayMenuBubbleBinding = OverlayMenuBubbleBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      this.binding = var2;
      this.adapter = new VoiceUserAdapter();
      this.onGetInvitePressed = new com.discord.mobile_voice_overlay.views.d();
      this.onSwitchChannelsPressed = new l();
      this.onOpenDiscordPressed = new m();
      this.onMutePressed = new n();
      this.onDisconnectPressed = new o();
      this.onShowSelectorDialog = new p();
      var2.overlayMenu.getBinding().overlayInviteLink.setOnClickListener(new q(this));
      var2.overlayMenu.getBinding().overlaySwitchChannels.setOnClickListener(new r(this));
      var2.overlayMenu.getBinding().overlayOpenApp.setOnClickListener(new s(this));
      var2.overlayMenu.getBinding().muteToggle.setOnClickListener(new com.discord.mobile_voice_overlay.views.e(this));
      var2.overlayMenu.getBinding().disconnectBtn.setOnClickListener(new k(this));
      this.setClipChildren(false);
      val var3: TextView = var2.overlayMembersOverflowText;
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimaryExtraBold);
      SetTextSizeSpKt.setTextSizeSp(var3, 20.0F);
      val var4: TextView = var2.overlayMembersOverflowText;
      var2.overlayMembersOverflowText.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      ViewBackgroundUtilsKt.setBackgroundOval$default(var4, ThemeManagerKt.getTheme().getBackgroundTertiary(), 0, 2, null);
   }

   public constructor(context: Context, attrs: AttributeSet?) : super(var1, var2) {
      val var3: OverlayMenuBubbleBinding = OverlayMenuBubbleBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      this.binding = var3;
      this.adapter = new VoiceUserAdapter();
      this.onGetInvitePressed = new com.discord.mobile_voice_overlay.views.d();
      this.onSwitchChannelsPressed = new l();
      this.onOpenDiscordPressed = new m();
      this.onMutePressed = new n();
      this.onDisconnectPressed = new o();
      this.onShowSelectorDialog = new p();
      var3.overlayMenu.getBinding().overlayInviteLink.setOnClickListener(new q(this));
      var3.overlayMenu.getBinding().overlaySwitchChannels.setOnClickListener(new r(this));
      var3.overlayMenu.getBinding().overlayOpenApp.setOnClickListener(new s(this));
      var3.overlayMenu.getBinding().muteToggle.setOnClickListener(new com.discord.mobile_voice_overlay.views.e(this));
      var3.overlayMenu.getBinding().disconnectBtn.setOnClickListener(new k(this));
      this.setClipChildren(false);
      val var5: TextView = var3.overlayMembersOverflowText;
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryExtraBold);
      SetTextSizeSpKt.setTextSizeSp(var5, 20.0F);
      val var4: TextView = var3.overlayMembersOverflowText;
      var3.overlayMembersOverflowText.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      ViewBackgroundUtilsKt.setBackgroundOval$default(var4, ThemeManagerKt.getTheme().getBackgroundTertiary(), 0, 2, null);
   }

   public constructor(context: Context, attrs: AttributeSet?, attributeSetId: Int) : super(var1, var2, var3) {
      val var4: OverlayMenuBubbleBinding = OverlayMenuBubbleBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      this.binding = var4;
      this.adapter = new VoiceUserAdapter();
      this.onGetInvitePressed = new com.discord.mobile_voice_overlay.views.d();
      this.onSwitchChannelsPressed = new l();
      this.onOpenDiscordPressed = new m();
      this.onMutePressed = new n();
      this.onDisconnectPressed = new o();
      this.onShowSelectorDialog = new p();
      var4.overlayMenu.getBinding().overlayInviteLink.setOnClickListener(new q(this));
      var4.overlayMenu.getBinding().overlaySwitchChannels.setOnClickListener(new r(this));
      var4.overlayMenu.getBinding().overlayOpenApp.setOnClickListener(new s(this));
      var4.overlayMenu.getBinding().muteToggle.setOnClickListener(new com.discord.mobile_voice_overlay.views.e(this));
      var4.overlayMenu.getBinding().disconnectBtn.setOnClickListener(new k(this));
      this.setClipChildren(false);
      val var6: TextView = var4.overlayMembersOverflowText;
      DiscordFontUtilsKt.setDiscordFont(var6, DiscordFont.PrimaryExtraBold);
      SetTextSizeSpKt.setTextSizeSp(var6, 20.0F);
      val var5: TextView = var4.overlayMembersOverflowText;
      var4.overlayMembersOverflowText.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      ViewBackgroundUtilsKt.setBackgroundOval$default(var5, ThemeManagerKt.getTheme().getBackgroundTertiary(), 0, 2, null);
   }

   @JvmStatic
   fun `_init_$lambda$10`(var0: OverlayMenuBubbleDialog, var1: View) {
      var0.onDisconnectPressed.invoke();
      var0.closeDialog();
   }

   @JvmStatic
   fun `_init_$lambda$6`(var0: OverlayMenuBubbleDialog, var1: View) {
      var0.onGetInvitePressed.invoke();
   }

   @JvmStatic
   fun `_init_$lambda$7`(var0: OverlayMenuBubbleDialog, var1: View) {
      var0.onSwitchChannelsPressed.invoke();
   }

   @JvmStatic
   fun `_init_$lambda$8`(var0: OverlayMenuBubbleDialog, var1: View) {
      var0.onOpenDiscordPressed.invoke();
   }

   @JvmStatic
   fun `_init_$lambda$9`(var0: OverlayMenuBubbleDialog, var1: View) {
      var0.onMutePressed.invoke();
   }

   @JvmStatic
   fun `onDisconnectPressed$lambda$4`(): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `onGetInvitePressed$lambda$0`(): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `onMutePressed$lambda$3`(): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `onOpenDiscordPressed$lambda$2`(): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `onShowSelectorDialog$lambda$5`(): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `onSwitchChannelsPressed$lambda$1`(): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `setData$lambda$21`(var0: OverlayMenuBubbleDialog, var1: MobileVoiceOverlayData): Unit {
      val var2: MobileVoiceOverlay.Companion = MobileVoiceOverlay.Companion;
      val var3: Context = var0.getContext();
      var2.startHeadlessTask(var3, "GenerateInvite", c3.c.a(new Pair[]{ht.v.a("channelId", java.lang.String.valueOf(var1.getChannelId-o4g7jtM()))}));
      val var4: MobileVoiceOverlayAssets = var0.getOverlayAssets();
      if (var4 != null) {
         Toast.makeText(var0.getContext(), var4.getInviteLinkCopied(), 0).show();
      }

      return Unit.a;
   }

   @JvmStatic
   fun `setData$lambda$22`(var0: OverlayMenuBubbleDialog): Unit {
      var0.getOnDialogClosed().invoke(var0);
      var0.onShowSelectorDialog.invoke();
      return Unit.a;
   }

   @JvmStatic
   fun `setData$lambda$24`(var0: OverlayMenuBubbleDialog, var1: MobileVoiceOverlayData): Unit {
      val var2: Context = var0.getContext();
      val var3: Intent = new Intent("android.intent.action.VIEW", null, var0.getContext(), ReactActivity.Registry.getMainActivity());
      var3.addCategory("android.intent.category.HOME");
      var3.addFlags(268435456);
      var2.startActivity(var3);
      val var5: MobileVoiceOverlay.Companion = MobileVoiceOverlay.Companion;
      val var4: Context = var0.getContext();
      var5.startHeadlessTask(var4, "SelectChannel", c3.c.a(new Pair[]{ht.v.a("channelId", java.lang.String.valueOf(var1.getChannelId-o4g7jtM()))}));
      return Unit.a;
   }

   @JvmStatic
   fun `setData$lambda$25`(var0: OverlayMenuBubbleDialog): Unit {
      val var1: MobileVoiceOverlay.Companion = MobileVoiceOverlay.Companion;
      val var2: Context = var0.getContext();
      MobileVoiceOverlay.Companion.startHeadlessTask$default(var1, var2, "ToggleSelfMute", null, 4, null);
      return Unit.a;
   }

   @JvmStatic
   fun `setData$lambda$26`(var0: OverlayMenuBubbleDialog, var1: MobileVoiceOverlayData): Unit {
      val var2: MobileVoiceOverlay.Companion = MobileVoiceOverlay.Companion;
      val var3: Context = var0.getContext();
      var2.startHeadlessTask(var3, "Disconnect", c3.c.a(new Pair[]{ht.v.a("channelId", java.lang.String.valueOf(var1.getChannelId-o4g7jtM()))}));
      return Unit.a;
   }

   public override fun getClosingAnimator(): Animator {
      val var2: AnimatorSet = new AnimatorSet();
      var2.setStartDelay((long)this.getResources().getInteger(17694720));
      val var1: Animator = AnimatorInflater.loadAnimator(this.binding.overlayMenu.getContext(), R.animator.overlay_slide_down_fade_out);
      var1.setTarget(this.binding.overlayMenu);
      val var4: Animator = AnimatorInflater.loadAnimator(this.getContext(), R.animator.overlay_slide_up_fade_out);
      var4.setTarget(this.binding.overlayHeader);
      var2.playTogether(new Animator[]{var1, var4});
      return var2;
   }

   protected open fun onAttachedToWindow() {
      super.onAttachedToWindow();
      this.binding.overlayMenu.setAlpha(0.0F);
      this.binding.overlayHeader.setAlpha(0.0F);
      val var1: AnimatorSet = new AnimatorSet();
      val var2: Animator = AnimatorInflater.loadAnimator(this.binding.overlayMenu.getContext(), R.animator.overlay_slide_up_fade_in);
      var2.setTarget(this.binding.overlayMenu);
      val var4: Animator = AnimatorInflater.loadAnimator(this.getContext(), R.animator.overlay_slide_down_fade_in);
      var4.setTarget(this.binding.overlayHeader);
      var1.playTogether(new Animator[]{var2, var4});
      var1.setStartDelay((long)this.getResources().getInteger(17694720));
      var1.start();
      this.binding.overlayMembersRecycler.setAdapter(this.adapter);
   }

   protected override fun onConfigurationChanged(newConfig: Configuration?) {
      super.onConfigurationChanged(var1);
      this.getOnDialogClosed().invoke(this);
   }

   public override fun setAssets(assets: MobileVoiceOverlayAssets) {
      super.setAssets(var1);
      this.binding.overlayMenu.setAssets(var1);
   }

   public override fun setData(data: MobileVoiceOverlayData) {
      var var3: java.util.List = var1.getUsers();
      if (var3.size() < 2) {
         var3 = CollectionsKt.l();
      } else {
         var3 = CollectionsKt.T0(var3, kotlin.ranges.e.w(1, var3.size()));
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
      this.onGetInvitePressed = new com.discord.mobile_voice_overlay.views.f(this, var1);
      this.onSwitchChannelsPressed = new com.discord.mobile_voice_overlay.views.g(this);
      this.onOpenDiscordPressed = new com.discord.mobile_voice_overlay.views.h(this, var1);
      this.onMutePressed = new com.discord.mobile_voice_overlay.views.i(this);
      this.onDisconnectPressed = new com.discord.mobile_voice_overlay.views.j(this, var1);
   }
}
