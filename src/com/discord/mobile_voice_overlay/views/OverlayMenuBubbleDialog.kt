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
import eh.w
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.r

public class OverlayMenuBubbleDialog : OverlayDialog {
   private final val adapter: VoiceUserAdapter
   private final val binding: OverlayMenuBubbleBinding

   public final val linkedAnchorView: View
      public final get() {
         val var1: View = this.binding.overlayLinkedAnchorView;
         r.g(this.binding.overlayLinkedAnchorView, "binding.overlayLinkedAnchorView");
         return var1;
      }


   private final var onDisconnectPressed: () -> Unit
   private final var onGetInvitePressed: () -> Unit
   private final var onMutePressed: () -> Unit
   private final var onOpenDiscordPressed: () -> Unit

   public final var onShowSelectorDialog: () -> Unit
      internal set

   private final var onSwitchChannelsPressed: () -> Unit

   public constructor(context: Context) : r.h(var1, "context") {
      super(var1);
      val var2: OverlayMenuBubbleBinding = OverlayMenuBubbleBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      r.g(var2, "inflate(LayoutInflater.from(context), this, true)");
      this.binding = var2;
      this.adapter = new VoiceUserAdapter();
      this.onGetInvitePressed = <unrepresentable>.INSTANCE;
      this.onSwitchChannelsPressed = <unrepresentable>.INSTANCE;
      this.onOpenDiscordPressed = <unrepresentable>.INSTANCE;
      this.onMutePressed = <unrepresentable>.INSTANCE;
      this.onDisconnectPressed = <unrepresentable>.INSTANCE;
      this.onShowSelectorDialog = <unrepresentable>.INSTANCE;
      var2.overlayMenu.getBinding().overlayInviteLink.setOnClickListener(new b(this));
      var2.overlayMenu.getBinding().overlaySwitchChannels.setOnClickListener(new c(this));
      var2.overlayMenu.getBinding().overlayOpenApp.setOnClickListener(new d(this));
      var2.overlayMenu.getBinding().muteToggle.setOnClickListener(new e(this));
      var2.overlayMenu.getBinding().disconnectBtn.setOnClickListener(new f(this));
      this.setClipChildren(false);
      val var3: TextView = var2.overlayMembersOverflowText;
      r.g(var2.overlayMembersOverflowText, "_init_$lambda$5");
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimaryExtraBold);
      SetTextSizeSpKt.setTextSizeSp(var3, 20.0F);
      val var4: TextView = var2.overlayMembersOverflowText;
      var2.overlayMembersOverflowText.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      r.g(var4, "_init_$lambda$6");
      ViewBackgroundUtilsKt.setBackgroundOval$default(var4, ThemeManagerKt.getTheme().getBackgroundTertiary(), 0, 2, null);
   }

   public constructor(context: Context, attrs: AttributeSet?) : r.h(var1, "context") {
      super(var1, var2);
      val var5: OverlayMenuBubbleBinding = OverlayMenuBubbleBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      r.g(var5, "inflate(LayoutInflater.from(context), this, true)");
      this.binding = var5;
      this.adapter = new VoiceUserAdapter();
      this.onGetInvitePressed = <unrepresentable>.INSTANCE;
      this.onSwitchChannelsPressed = <unrepresentable>.INSTANCE;
      this.onOpenDiscordPressed = <unrepresentable>.INSTANCE;
      this.onMutePressed = <unrepresentable>.INSTANCE;
      this.onDisconnectPressed = <unrepresentable>.INSTANCE;
      this.onShowSelectorDialog = <unrepresentable>.INSTANCE;
      var5.overlayMenu.getBinding().overlayInviteLink.setOnClickListener(new b(this));
      var5.overlayMenu.getBinding().overlaySwitchChannels.setOnClickListener(new c(this));
      var5.overlayMenu.getBinding().overlayOpenApp.setOnClickListener(new d(this));
      var5.overlayMenu.getBinding().muteToggle.setOnClickListener(new e(this));
      var5.overlayMenu.getBinding().disconnectBtn.setOnClickListener(new f(this));
      this.setClipChildren(false);
      val var3: TextView = var5.overlayMembersOverflowText;
      r.g(var5.overlayMembersOverflowText, "_init_$lambda$5");
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimaryExtraBold);
      SetTextSizeSpKt.setTextSizeSp(var3, 20.0F);
      val var4: TextView = var5.overlayMembersOverflowText;
      var5.overlayMembersOverflowText.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      r.g(var4, "_init_$lambda$6");
      ViewBackgroundUtilsKt.setBackgroundOval$default(var4, ThemeManagerKt.getTheme().getBackgroundTertiary(), 0, 2, null);
   }

   public constructor(context: Context, attrs: AttributeSet?, attributeSetId: Int) : r.h(var1, "context") {
      super(var1, var2, var3);
      val var6: OverlayMenuBubbleBinding = OverlayMenuBubbleBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      r.g(var6, "inflate(LayoutInflater.from(context), this, true)");
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
      r.g(var6.overlayMembersOverflowText, "_init_$lambda$5");
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryExtraBold);
      SetTextSizeSpKt.setTextSizeSp(var4, 20.0F);
      val var5: TextView = var6.overlayMembersOverflowText;
      var6.overlayMembersOverflowText.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      r.g(var5, "_init_$lambda$6");
      ViewBackgroundUtilsKt.setBackgroundOval$default(var5, ThemeManagerKt.getTheme().getBackgroundTertiary(), 0, 2, null);
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: OverlayMenuBubbleDialog, var1: View) {
      r.h(var0, "this$0");
      var0.onGetInvitePressed.invoke();
   }

   @JvmStatic
   fun `_init_$lambda$1`(var0: OverlayMenuBubbleDialog, var1: View) {
      r.h(var0, "this$0");
      var0.onSwitchChannelsPressed.invoke();
   }

   @JvmStatic
   fun `_init_$lambda$2`(var0: OverlayMenuBubbleDialog, var1: View) {
      r.h(var0, "this$0");
      var0.onOpenDiscordPressed.invoke();
   }

   @JvmStatic
   fun `_init_$lambda$3`(var0: OverlayMenuBubbleDialog, var1: View) {
      r.h(var0, "this$0");
      var0.onMutePressed.invoke();
   }

   @JvmStatic
   fun `_init_$lambda$4`(var0: OverlayMenuBubbleDialog, var1: View) {
      r.h(var0, "this$0");
      var0.onDisconnectPressed.invoke();
      var0.closeDialog();
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
      r.h(var1, "assets");
      super.setAssets(var1);
      this.binding.overlayMenu.setAssets(var1);
   }

   public override fun setData(data: MobileVoiceOverlayData) {
      r.h(var1, "data");
      var var3: java.util.List = var1.getUsers();
      if (var3.size() < 2) {
         var3 = kotlin.collections.h.i();
      } else {
         var3 = kotlin.collections.h.C0(var3, vh.h.r(1, var3.size()));
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
      this.onGetInvitePressed = new Function0<Unit>(this, var1) {
         final MobileVoiceOverlayData $data;
         final OverlayMenuBubbleDialog this$0;

         {
            super(0);
            this.this$0 = var1;
            this.$data = var2;
         }

         public final void invoke() {
            val var2: MobileVoiceOverlay.Companion = MobileVoiceOverlay.Companion;
            val var1: Context = this.this$0.getContext();
            r.g(var1, "context");
            var2.startHeadlessTask(
               var1, "GenerateInvite", androidx.core.os.e.a(new Pair[]{w.a("channelId", java.lang.String.valueOf(this.$data.getChannelId-o4g7jtM()))})
            );
            val var3: MobileVoiceOverlayAssets = this.this$0.getOverlayAssets();
            if (var3 != null) {
               Toast.makeText(this.this$0.getContext(), var3.getInviteLinkCopied(), 0).show();
            }
         }
      };
      this.onSwitchChannelsPressed = new Function0<Unit>(this) {
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
      this.onOpenDiscordPressed = new Function0<Unit>(this, var1) {
         final MobileVoiceOverlayData $data;
         final OverlayMenuBubbleDialog this$0;

         {
            super(0);
            this.this$0 = var1;
            this.$data = var2;
         }

         public final void invoke() {
            var var1: Context = this.this$0.getContext();
            val var2: Intent = new Intent("android.intent.action.VIEW", null, this.this$0.getContext(), ReactActivity.Registry.getMainActivity());
            var2.addCategory("android.intent.category.HOME");
            var2.addFlags(268435456);
            var1.startActivity(var2);
            val var4: MobileVoiceOverlay.Companion = MobileVoiceOverlay.Companion;
            var1 = this.this$0.getContext();
            r.g(var1, "context");
            var4.startHeadlessTask(
               var1, "SelectChannel", androidx.core.os.e.a(new Pair[]{w.a("channelId", java.lang.String.valueOf(this.$data.getChannelId-o4g7jtM()))})
            );
         }
      };
      this.onMutePressed = new Function0<Unit>(this) {
         final OverlayMenuBubbleDialog this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final void invoke() {
            val var1: MobileVoiceOverlay.Companion = MobileVoiceOverlay.Companion;
            val var2: Context = this.this$0.getContext();
            r.g(var2, "context");
            MobileVoiceOverlay.Companion.startHeadlessTask$default(var1, var2, "ToggleSelfMute", null, 4, null);
         }
      };
      this.onDisconnectPressed = new Function0<Unit>(this, var1) {
         final MobileVoiceOverlayData $data;
         final OverlayMenuBubbleDialog this$0;

         {
            super(0);
            this.this$0 = var1;
            this.$data = var2;
         }

         public final void invoke() {
            val var2: MobileVoiceOverlay.Companion = MobileVoiceOverlay.Companion;
            val var1: Context = this.this$0.getContext();
            r.g(var1, "context");
            var2.startHeadlessTask(
               var1, "Disconnect", androidx.core.os.e.a(new Pair[]{w.a("channelId", java.lang.String.valueOf(this.$data.getChannelId-o4g7jtM()))})
            );
         }
      };
   }
}
