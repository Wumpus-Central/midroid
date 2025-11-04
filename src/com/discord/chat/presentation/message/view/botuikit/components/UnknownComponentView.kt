package com.discord.chat.presentation.message.view.botuikit.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import com.discord.chat.bridge.botuikit.UnknownComponent
import com.discord.chat.databinding.MessageComponentUnknownViewBinding
import com.discord.chat.presentation.list.ChatListLinearLayout
import com.discord.chat.presentation.message.ErrorMessageView
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.view.botuikit.ComponentView
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import kotlin.reflect.KClass

public class UnknownComponentView  public constructor(context: Context, attrs: AttributeSet? = null) : ChatListLinearLayout(var1, var2),
   ComponentView<UnknownComponent> {
   public final val binding: MessageComponentUnknownViewBinding

   fun UnknownComponentView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      val var3: MessageComponentUnknownViewBinding = MessageComponentUnknownViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var3;
   }

   public open fun configure(component: UnknownComponent, componentProvider: ComponentProvider, componentContext: ComponentContext) {
      val var5: ErrorMessageView = this.binding.errorMessageView;
      this.binding.errorMessageView.hideHeader();
      val var4: Context = var5.getContext();
      var5.setErrorLabel(I18nUtilsKt.i18nFormat$default(var4, I18nMessage.UNKNOWN_MESSAGE_UPDATE_DISCORD, null, 2, null));
   }

   public override fun getComponentType(): KClass<UnknownComponent> {
      return UnknownComponent::class;
   }

   override fun onRecycle(var1: ComponentProvider) {
      ComponentView.DefaultImpls.onRecycle(this, var1);
   }

   public companion object {
      public fun inflateComponent(context: Context): UnknownComponentView {
         return new UnknownComponentView(var1, null, 2, null);
      }
   }
}
