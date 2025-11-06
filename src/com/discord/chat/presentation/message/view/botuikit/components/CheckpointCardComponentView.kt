package com.discord.chat.presentation.message.view.botuikit.components

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
import com.discord.chat.R.drawable
import com.discord.chat.bridge.botuikit.CheckpointApplication
import com.discord.chat.bridge.botuikit.CheckpointCardComponent
import com.discord.chat.bridge.botuikit.CheckpointDataV2025
import com.discord.chat.bridge.botuikit.CheckpointEmoji
import com.discord.chat.bridge.botuikit.CheckpointGuild
import com.discord.chat.databinding.MessageComponentCheckpointCardViewBinding
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.view.botuikit.ComponentView
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.icons.IconUrlUtils
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.primitives.ApplicationId
import com.discord.primitives.GuildId
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import ht.o
import ht.v
import java.util.Locale
import kotlin.jvm.internal.SourceDebugExtension
import kotlin.reflect.KClass

@SourceDebugExtension(["SMAP\nCheckpointCardComponentView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckpointCardComponentView.kt\ncom/discord/chat/presentation/message/view/botuikit/components/CheckpointCardComponentView\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,320:1\n404#2:321\n404#2:322\n404#2:323\n404#2:324\n404#2:325\n404#2:326\n404#2:327\n404#2:328\n404#2:329\n404#2:330\n404#2:331\n404#2:332\n404#2:333\n404#2:334\n13409#3,2:335\n*S KotlinDebug\n*F\n+ 1 CheckpointCardComponentView.kt\ncom/discord/chat/presentation/message/view/botuikit/components/CheckpointCardComponentView\n*L\n47#1:321\n48#1:322\n49#1:323\n50#1:324\n51#1:325\n52#1:326\n53#1:327\n54#1:328\n55#1:329\n56#1:330\n59#1:331\n60#1:332\n61#1:333\n62#1:334\n70#1:335,2\n*E\n"])
public class CheckpointCardComponentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout(
         var1, var2, var3
      ),
   ComponentView<CheckpointCardComponent> {
   private final val cardColorMap: Map<String, Int> =
      s0.m(
         new Pair[]{
            v.a("0", Color.parseColor("#EEE31B")),
            v.a("1", Color.parseColor("#EEE31B")),
            v.a("2", Color.parseColor("#EEE31B")),
            v.a("3", Color.parseColor("#EEE31B")),
            v.a("4", Color.parseColor("#EEE31B")),
            v.a("5", Color.parseColor("#EEE31B")),
            v.a("6", Color.parseColor("#EEE31B")),
            v.a("7", Color.parseColor("#EEE31B")),
            v.a("8", Color.parseColor("#EEE31B")),
            v.a("9", Color.parseColor("#EEE31B"))
         }
      )
      private final val cardDefaultColor: Int = ThemeManagerKt.getTheme().getTextBrand()
   public final val secondaryColor: Int = Color.parseColor("#10000000")
   public final val black: Int
   public final val transparent: Int
   public final val barUnfilledColor: Int
   private final val barIds: Array<Int?>

   private final val binding: MessageComponentCheckpointCardViewBinding
      private final get() {
         return this.binding$delegate.getValue() as MessageComponentCheckpointCardViewBinding;
      }


   fun CheckpointCardComponentView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   fun CheckpointCardComponentView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   init {
      this.black = Color.parseColor("#000000");
      this.transparent = Color.parseColor("#00000000");
      this.barUnfilledColor = Color.parseColor("#60000000");
      this.barIds = new Integer[10];
      this.binding$delegate = ht.l.a(o.i, new com.discord.chat.presentation.message.view.botuikit.components.d(this, var1));
   }

   private fun adjustImageLayout(isImageVisible: Boolean, view: SimpleDraweeView) {
      if (var1) {
         ViewBackgroundUtilsKt.setBackgroundRectangle(var2, this.black, 0, this.black, SizeUtilsKt.getDpToPx(2));
      } else {
         ViewBackgroundUtilsKt.setBackgroundRectangle(var2, this.transparent, 0, this.transparent, 0);
      }
   }

   @JvmStatic
   fun `binding_delegate$lambda$6`(var0: CheckpointCardComponentView, var1: Context): MessageComponentCheckpointCardViewBinding {
      val var3: MessageComponentCheckpointCardViewBinding = MessageComponentCheckpointCardViewBinding.bind(var0);
      val var9: TextView = var3.messageCount;
      val var8: TextView = var3.voiceMinutes;
      val var5: TextView = var3.emojiCount;
      val var6: TextView = var3.emojiName;
      val var10: TextView = var3.applicationName;
      val var7: TextView = var3.guildName;

      for (int var2 = 0; var2 < 6; var2++) {
         val var4: TextView = new TextView[]{var9, var8, var5, var6, var10, var7}[var2];
         DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryMedium);
      }

      var var12: TextView = var3.title;
      DiscordFontUtilsKt.setDiscordFont(var12, DiscordFont.DisplayExtraBold);
      var12 = var3.cta;
      DiscordFontUtilsKt.setDiscordFont(var12, DiscordFont.PrimaryBold);
      var12 = var3.powerLevelNumber;
      DiscordFontUtilsKt.setDiscordFont(var12, DiscordFont.CodeBold);
      val var17: ImageView = new ImageView(var1);
      var17.setId(View.generateViewId());
      var0.barIds[0] = var17.getId();
      var17.setImageResource(drawable.checkpoint_power_start);
      val var15: LayoutParams = new LayoutParams(SizeUtilsKt.getDpToPx(4), SizeUtilsKt.getDpToPx(6));
      var15.setMarginStart(SizeUtilsKt.getDpToPx(2));
      var17.setLayoutParams(var15);
      val var16: ImageView = new ImageView(var1);
      var16.setId(View.generateViewId());
      var0.barIds[9] = var16.getId();
      var16.setImageResource(drawable.checkpoint_power_end);
      val var19: LayoutParams = new LayoutParams(SizeUtilsKt.getDpToPx(4), SizeUtilsKt.getDpToPx(6));
      var19.setMarginStart(SizeUtilsKt.getDpToPx(2));
      var16.setLayoutParams(var19);
      val var20: LinearLayout = var3.powerBar;
      var3.powerBar.addView(var17);

      for (int var11 = 1; var11 < 9; var11++) {
         val var21: ImageView = new ImageView(var1);
         var21.setId(View.generateViewId());
         var0.barIds[var11] = var21.getId();
         var21.setImageResource(drawable.checkpoint_power_mid);
         val var18: LayoutParams = new LayoutParams(SizeUtilsKt.getDpToPx(4), SizeUtilsKt.getDpToPx(6));
         var18.setMarginStart(SizeUtilsKt.getDpToPx(2));
         var21.setLayoutParams(var18);
         var20.addView(var21);
      }

      var20.addView(var16);
      return var3;
   }

   private fun configureApplication(topGame: CheckpointApplication?) {
      var var3: Any;
      var var4: TextView;
      label33: {
         var4 = this.getBinding().applicationName;
         if (var1 != null) {
            var3 = var1.getApplicationName();
            if (var3 != null) {
               break label33;
            }
         }

         var3 = this.getContext();
         var3 = I18nUtilsKt.i18nFormat$default((Context)var3, I18nMessage.NO_GAMES, null, 2, null);
      }

      var4.setText((java.lang.CharSequence)var3);
      val var6: SimpleDraweeView = this.getBinding().applicationImage;
      if (var1 != null) {
         var3 = ApplicationId.box-impl(var1.getApplicationId-VavddsQ());
      } else {
         var3 = null;
      }

      var var9: java.lang.String = null;
      if (var3 != null) {
         var9 = null;
         if (var1.getApplicationImageId() != null) {
            var9 = IconUrlUtils.getApplicationIcon-weIltyw$default(
               IconUrlUtils.INSTANCE, ApplicationId.box-impl(var1.getApplicationId-VavddsQ()), var1.getApplicationImageId(), 0, 4, null
            );
         }
      }

      val var2: Boolean;
      if (var9 != null) {
         var2 = true;
      } else {
         var2 = false;
      }

      if (var2) {
         var6.setImageURI(var9);
         var6.clearColorFilter();
      } else {
         var6.setImageResource(drawable.ic_unknown_game_icon_16dp);
         ColorUtilsKt.setTintColor(var6, this.black);
      }

      this.adjustImageLayout(var2, var6);
   }

   private fun configureEmoji(topEmoji: CheckpointEmoji?) {
      var var7: TextView = this.getBinding().emojiName;
      var var6: java.lang.String;
      if (var1 != null) {
         var6 = var1.getEmojiSurrogateName();
      } else {
         var6 = null;
      }

      if (var6 != null) {
         var6 = var1.getEmojiSurrogateName();
      } else {
         if (var1 != null) {
            var6 = var1.getEmojiName();
         } else {
            var6 = null;
         }

         if (var6 != null) {
            var6 = var1.getEmojiName();
            val var9: StringBuilder = new StringBuilder();
            var9.append(":");
            var9.append(var6);
            var9.append(":");
            var6 = var9.toString();
         } else {
            val var15: Context = this.getContext();
            var6 = I18nUtilsKt.i18nFormat$default(var15, I18nMessage.NO_REACTIONS_HEADER, null, 2, null);
         }
      }

      var7.setText(var6);
      val var16: java.lang.Long;
      if (var1 != null) {
         var16 = var1.getEmojiId();
      } else {
         var16 = null;
      }

      if (var16 != null) {
         var6 = IconUrlUtils.getCustomEmojiUrl$default(IconUrlUtils.INSTANCE, var1.getEmojiId(), false, null, 4, null);
      } else {
         var6 = null;
      }

      val var19: java.lang.String;
      if (var1 != null) {
         var19 = var1.getEmojiSurrogateName();
      } else {
         var19 = null;
      }

      var var5: Boolean = true;
      val var2: Boolean;
      if (var19 != null) {
         var2 = true;
      } else {
         var2 = false;
      }

      val var20: SimpleDraweeView = this.getBinding().emojiImage;
      var var3: Byte;
      if (var2) {
         var3 = 8;
      } else {
         var3 = 0;
      }

      var20.setVisibility(var3);
      if (var6 != null) {
         var20.setImageURI(var6);
         var20.clearColorFilter();
      } else if (!var2) {
         var20.setImageResource(drawable.ic_unknown_game_icon_16dp);
         ColorUtilsKt.setTintColor(var20, this.black);
      }

      if (var6 == null) {
         var5 = false;
      }

      this.adjustImageLayout(var5, var20);
      var7 = this.getBinding().unicodeEmojiImage;
      var3 = 8;
      if (var2) {
         var3 = 0;
      }

      var7.setVisibility(var3);
      var6 = null;
      if (var1 != null) {
         var6 = var1.getEmojiName();
      }

      var7.setText(var6);
      ViewBackgroundUtilsKt.setBackgroundRectangle(var7, this.black, 0, this.black, SizeUtilsKt.getDpToPx(2));
   }

   @SuppressLint(["SetTextI18n"])
   private fun configureFooter(componentContext: ComponentContext, checkpointData: CheckpointDataV2025) {
      val var4: ConstraintLayout = this.getBinding().footer;
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(var4, this.secondaryColor, 0.0F, 0.0F, 0.0F, 0.0F, null, 0, 126, null);
      CheckpointCardComponentViewKt.access$applyClickable(var4, var1, var2, var2.getClickable());
      val var5: TextView = this.getBinding().cta;
      val var3: Byte;
      if (var2.getClickable() != null) {
         var3 = 0;
      } else {
         var3 = 4;
      }

      var5.setVisibility(var3);
      val var6: Context = var5.getContext();
      val var7: java.lang.String = I18nUtilsKt.i18nFormat$default(var6, I18nMessage.START, null, 2, null).toString().toUpperCase(Locale.ROOT);
      var5.setText(var7);
      this.getBinding().title.setText("CHECKPOINT");
   }

   private fun configureGuild(topGuild: CheckpointGuild?) {
      var var3: Any;
      var var5: TextView;
      label43: {
         var5 = this.getBinding().guildName;
         if (var1 != null) {
            var3 = var1.getGuildName();
            if (var3 != null) {
               break label43;
            }
         }

         var3 = this.getContext();
         var3 = I18nUtilsKt.i18nFormat$default((Context)var3, I18nMessage.NO_GUILDS, null, 2, null);
      }

      var5.setText((java.lang.CharSequence)var3);
      val var10: SimpleDraweeView = this.getBinding().guildImage;
      if (var1 != null) {
         var3 = GuildId.box-impl(var1.getGuildId-fYKD8eg());
      } else {
         var3 = null;
      }

      if (var3 != null && var1.getGuildIcon() != null) {
         var3 = IconUrlUtils.getForGuild-14CJxO4$default(
            IconUrlUtils.INSTANCE, GuildId.box-impl(var1.getGuildId-fYKD8eg()), var1.getGuildIcon(), null, false, null, 28, null
         );
      } else {
         var3 = null;
      }

      val var2: Boolean;
      if (var3 != null) {
         var2 = true;
      } else {
         var2 = false;
      }

      if (var2) {
         var10.setImageURI((java.lang.String)var3);
         var10.clearColorFilter();
      } else {
         var3 = null;
         if (var1 != null) {
            var3 = GuildId.box-impl(var1.getGuildId-fYKD8eg());
         }

         if (var3 != null) {
            var10.setImageResource(drawable.ic_guild_icon_16dp);
            ColorUtilsKt.setTintColor(var10, this.black);
         } else {
            var10.setImageResource(drawable.ic_unknown_game_icon_16dp);
            ColorUtilsKt.setTintColor(var10, this.black);
         }
      }

      this.adjustImageLayout(var2, var10);
   }

   @SuppressLint(["SetTextI18n"])
   private fun configurePowerBar(checkpointData: CheckpointDataV2025, cardColor: Int) {
      this.getBinding().powerContainer.setBackgroundTintList(ColorStateList.valueOf(var2));
      this.getBinding().powerLevelLvl.setText("LVL ");
      this.getBinding().powerLevelNumber.setText(var1.getPowerLevel());

      for (int var5 = 0; var5 < 10; var5++) {
         val var4: Int = this.barIds[var5];
         if (this.barIds[var5] != null) {
            val var6: ImageView = this.findViewById(var4) as ImageView;
            if (var6 != null) {
               val var3: Int;
               if (var5 > var1.getPowerLevelUnits()) {
                  var3 = this.barUnfilledColor;
               } else {
                  var3 = this.black;
               }

               ColorUtilsKt.setTintColor(var6, var3);
            }
         }
      }
   }

   public open fun configure(component: CheckpointCardComponent, componentProvider: ComponentProvider, componentContext: ComponentContext) {
      val var8: CheckpointDataV2025 = var1.getCheckpointData();
      val var9: Int = this.cardColorMap.get(var8.getCardId());
      val var4: Int;
      if (var9 != null) {
         var4 = var9;
      } else {
         var4 = this.cardDefaultColor;
      }

      val var5: CheckpointEmoji = var8.getTopEmoji();
      val var10: CheckpointApplication = var8.getTopGame();
      val var6: CheckpointGuild = var8.getTopGuild();
      val var7: CheckpointCardComponentView = this.getBinding().getRoot();
      var7.setVisibility(0);
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(var7, var4, 0.0F, 0.0F, 0.0F, 0.0F, null, 0, 126, null);
      this.configurePowerBar(var8, var4);
      this.configureFooter(var3, var8);
      val var11: LinearLayout = this.getBinding().image;
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(var11, this.secondaryColor, 0.0F, 0.0F, 0.0F, 0.0F, null, 0, 126, null);
      this.getBinding().imageResource.setImageURI(var8.getCardAssetUrl());
      this.getBinding().messageCount.setText(var8.getMessagesString());
      this.getBinding().voiceMinutes.setText(var8.getVoiceString());
      this.getBinding().emojiCount.setText(var8.getReactionString());
      this.configureEmoji(var5);
      this.configureGuild(var6);
      this.configureApplication(var10);
   }

   public override fun getComponentType(): KClass<CheckpointCardComponent> {
      return CheckpointCardComponent::class;
   }

   override fun onRecycle(var1: ComponentProvider) {
      ComponentView.DefaultImpls.onRecycle(this, var1);
   }

   public companion object {
      public fun inflateComponent(context: Context, root: ViewGroup): CheckpointCardComponentView {
         val var3: CheckpointCardComponentView = MessageComponentCheckpointCardViewBinding.inflate(LayoutInflater.from(var1), var2, false).getRoot();
         return var3;
      }
   }
}
