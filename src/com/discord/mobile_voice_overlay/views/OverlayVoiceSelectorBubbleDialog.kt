package com.discord.mobile_voice_overlay.views

import android.animation.Animator
import android.animation.AnimatorInflater
import android.content.Context
import android.content.res.Configuration
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData
import com.discord.mobile_voice_overlay.R
import com.discord.mobile_voice_overlay.databinding.OverlayVoiceChannelSelectorBinding
import com.discord.mobile_voice_overlay.utils.WindowUtils
import com.discord.primitives.ChannelId
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

public class OverlayVoiceSelectorBubbleDialog : OverlayDialog {
   private final var binding: OverlayVoiceChannelSelectorBinding
   private final var data: MobileVoiceOverlayData?
   private final val adapter: ResultAdapter
   public final var onTextChanged: (String) -> Unit
   public final var onChannelSelected: (ChannelId) -> Unit

   public constructor(context: Context) : q.h(var1, "context") {
      super(var1);
      val var2: OverlayVoiceChannelSelectorBinding = OverlayVoiceChannelSelectorBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      q.g(var2, "inflate(...)");
      this.binding = var2;
      this.adapter = new ResultAdapter(new Function1(this) {
         final OverlayVoiceSelectorBubbleDialog this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final void invoke_R7gqayM/* $VF was: invoke-R7gqayM*/(long var1) {
            this.this$0.getOnChannelSelected().invoke(ChannelId.box-impl(var1));
         }
      });
      WindowUtils.INSTANCE.removeFlag(this.getWindowLayoutParams(), 8);
      this.onTextChanged = <unrepresentable>.INSTANCE;
      this.onChannelSelected = <unrepresentable>.INSTANCE;
   }

   public constructor(context: Context, attrs: AttributeSet?) : q.h(var1, "context") {
      super(var1, var2);
      val var3: OverlayVoiceChannelSelectorBinding = OverlayVoiceChannelSelectorBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      q.g(var3, "inflate(...)");
      this.binding = var3;
      this.adapter = new ResultAdapter(new Function1(this) {
         final OverlayVoiceSelectorBubbleDialog this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final void invoke_R7gqayM/* $VF was: invoke-R7gqayM*/(long var1) {
            this.this$0.getOnChannelSelected().invoke(ChannelId.box-impl(var1));
         }
      });
      WindowUtils.INSTANCE.removeFlag(this.getWindowLayoutParams(), 8);
      this.onTextChanged = <unrepresentable>.INSTANCE;
      this.onChannelSelected = <unrepresentable>.INSTANCE;
   }

   public constructor(context: Context, attrs: AttributeSet?, attributeSetId: Int) : q.h(var1, "context") {
      super(var1, var2, var3);
      val var4: OverlayVoiceChannelSelectorBinding = OverlayVoiceChannelSelectorBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      q.g(var4, "inflate(...)");
      this.binding = var4;
      this.adapter = new ResultAdapter(new Function1(this) {
         final OverlayVoiceSelectorBubbleDialog this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final void invoke_R7gqayM/* $VF was: invoke-R7gqayM*/(long var1) {
            this.this$0.getOnChannelSelected().invoke(ChannelId.box-impl(var1));
         }
      });
      WindowUtils.INSTANCE.removeFlag(this.getWindowLayoutParams(), 8);
      this.onTextChanged = <unrepresentable>.INSTANCE;
      this.onChannelSelected = <unrepresentable>.INSTANCE;
   }

   private fun bindAssets() {
      val var1: MobileVoiceOverlayAssets = this.getOverlayAssets();
      if (var1 != null) {
         this.binding.channelSelect.setText(var1.getChannelSelect());
         this.binding.emptyResults.setText(var1.getNoResults());
         this.binding.overlayChannelSearch.setHint(var1.getSearchChannels());
         this.binding.close.setContentDescription(var1.getCloseWindow());
         val var2: SimpleDraweeView = this.binding.close;
         q.g(this.binding.close, "close");
         ColorUtilsKt.setTintColor(var2, ThemeManagerKt.getTheme().getInteractiveNormal());
         val var3: SimpleDraweeView = this.binding.close;
         q.g(this.binding.close, "close");
         ReactAssetUtilsKt.setReactAsset(var3, ReactAsset.Close);
      }
   }

   private fun bindData(): Unit? {
      val var4: MobileVoiceOverlayData = this.data;
      val var7: Unit;
      if (this.data != null) {
         val var3: Boolean = this.data.getChannelSelectorResults().isEmpty();
         val var5: TextView = this.binding.emptyResults;
         q.g(this.binding.emptyResults, "emptyResults");
         var var1: Byte;
         if (var3) {
            var1 = 0;
         } else {
            var1 = 8;
         }

         var5.setVisibility(var1);
         val var8: RecyclerView = this.binding.resultsRv;
         q.g(this.binding.resultsRv, "resultsRv");
         var1 = 8;
         if (var3 xor true) {
            var1 = 0;
         }

         var8.setVisibility(var1);
         if (!var3) {
            this.adapter.setResults(var4.getChannelSelectorResults());
         }

         var7 = Unit.a;
      } else {
         var7 = null;
      }

      return var7;
   }

   private fun onViewBound() {
      this.binding.close.setOnClickListener(new g(this));
      var var1: EditText = this.binding.overlayChannelSearch;
      q.g(this.binding.overlayChannelSearch, "overlayChannelSearch");
      var1.addTextChangedListener(new TextWatcher(this) {
         final OverlayVoiceSelectorBubbleDialog this$0;

         {
            this.this$0 = var1;
         }

         public void afterTextChanged(Editable var1) {
         }

         public void beforeTextChanged(java.lang.CharSequence var1, int var2, int var3, int var4) {
         }

         public void onTextChanged(java.lang.CharSequence var1, int var2, int var3, int var4) {
            var var6: Function1;
            label11: {
               var6 = this.this$0.getOnTextChanged();
               if (var1 != null) {
                  val var5: java.lang.String = var1.toString();
                  var1 = var5;
                  if (var5 != null) {
                     break label11;
                  }
               }

               var1 = "";
            }

            var6.invoke(var1);
         }
      });
      val var3: TextView = this.binding.channelSelect;
      q.g(this.binding.channelSelect, "channelSelect");
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimarySemibold);
      val var2: TextView = this.binding.emptyResults;
      q.e(this.binding.emptyResults);
      val var4: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var2, DiscordFont.PrimaryMedium);
      var2.setVisibility(8);
      val var7: EditText = this.binding.overlayChannelSearch;
      q.g(this.binding.overlayChannelSearch, "overlayChannelSearch");
      DiscordFontUtilsKt.setDiscordFont(var7, var4);
      val var5: LinearLayout = this.binding.menuContainer;
      q.g(this.binding.menuContainer, "menuContainer");
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(var5, ThemeManagerKt.getTheme().getBackgroundTertiary(), 4, null, 0, 12, null);
      this.binding.dialogCard.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundMobilePrimary());
      this.binding.channelSelect.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      this.binding.emptyResults.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      var1 = this.binding.overlayChannelSearch;
      q.e(this.binding.overlayChannelSearch);
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(var1, ThemeManagerKt.getTheme().getInteractiveMuted(), 8, null, 0, 12, null);
      var1.setHintTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
      var1.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      this.binding.resultsRv.setAdapter(this.adapter);
      this.bindAssets();
      this.bindData();
   }

   @JvmStatic
   fun `onViewBound$lambda$0`(var0: OverlayVoiceSelectorBubbleDialog, var1: View) {
      q.h(var0, "this$0");
      var0.closeDialog();
   }

   public override fun getClosingAnimator(): Animator {
      val var1: Animator = AnimatorInflater.loadAnimator(this.getContext(), R.animator.overlay_slide_down_fade_out);
      var1.setTarget(this.binding.dialogCard);
      q.g(var1, "apply(...)");
      return var1;
   }

   protected open fun onAttachedToWindow() {
      super.onAttachedToWindow();
      this.onViewBound();
      val var1: Animator = AnimatorInflater.loadAnimator(this.getContext(), R.animator.overlay_slide_up_fade_in);
      var1.setTarget(this.binding.dialogCard);
      var1.start();
   }

   protected override fun onConfigurationChanged(newConfig: Configuration?) {
      super.onConfigurationChanged(var1);
      this.removeAllViewsInLayout();
      val var2: OverlayVoiceChannelSelectorBinding = OverlayVoiceChannelSelectorBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      q.g(var2, "inflate(...)");
      this.binding = var2;
      this.onViewBound();
   }

   public override fun setAssets(assets: MobileVoiceOverlayAssets) {
      q.h(var1, "assets");
      super.setAssets(var1);
      this.bindAssets();
   }

   public override fun setData(data: MobileVoiceOverlayData) {
      q.h(var1, "data");
      this.data = var1;
      this.bindData();
   }
}
