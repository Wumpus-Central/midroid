package com.discord.foreground_service.service

import H9.a
import kotlin.enums.EnumEntries

internal data class ServiceNotificationConfiguration(title: String,
   content: String?,
   priority: com.discord.foreground_service.service.ServiceNotificationConfiguration.Priority,
   contentAction: com.discord.foreground_service.service.ServiceNotificationConfiguration.Action?,
   auxiliaryActions: List<com.discord.foreground_service.service.ServiceNotificationConfiguration.Action>,
   type: com.discord.foreground_service.service.ServiceNotificationConfiguration.Type
) {
   public final val title: String
   public final val content: String?
   public final val priority: com.discord.foreground_service.service.ServiceNotificationConfiguration.Priority
   public final val contentAction: com.discord.foreground_service.service.ServiceNotificationConfiguration.Action?
   public final val auxiliaryActions: List<com.discord.foreground_service.service.ServiceNotificationConfiguration.Action>
   public final val type: com.discord.foreground_service.service.ServiceNotificationConfiguration.Type

   init {
      this.title = var1;
      this.content = var2;
      this.priority = var3;
      this.contentAction = var4;
      this.auxiliaryActions = var5;
      this.type = var6;
   }

   public operator fun component1(): String {
      return this.title;
   }

   public operator fun component2(): String? {
      return this.content;
   }

   public operator fun component3(): com.discord.foreground_service.service.ServiceNotificationConfiguration.Priority {
      return this.priority;
   }

   public operator fun component4(): com.discord.foreground_service.service.ServiceNotificationConfiguration.Action? {
      return this.contentAction;
   }

   public operator fun component5(): List<com.discord.foreground_service.service.ServiceNotificationConfiguration.Action> {
      return this.auxiliaryActions;
   }

   public operator fun component6(): com.discord.foreground_service.service.ServiceNotificationConfiguration.Type {
      return this.type;
   }

   public fun copy(
      title: String = var0.title,
      content: String? = var0.content,
      priority: com.discord.foreground_service.service.ServiceNotificationConfiguration.Priority = var0.priority,
      contentAction: com.discord.foreground_service.service.ServiceNotificationConfiguration.Action? = var0.contentAction,
      auxiliaryActions: List<com.discord.foreground_service.service.ServiceNotificationConfiguration.Action> = var0.auxiliaryActions,
      type: com.discord.foreground_service.service.ServiceNotificationConfiguration.Type = var0.type
   ): ServiceNotificationConfiguration {
      return new ServiceNotificationConfiguration(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ServiceNotificationConfiguration) {
         return false;
      } else {
         var1 = var1;
         if (!(this.title == var1.title)) {
            return false;
         } else if (!(this.content == var1.content)) {
            return false;
         } else if (this.priority != var1.priority) {
            return false;
         } else if (!(this.contentAction == var1.contentAction)) {
            return false;
         } else if (!(this.auxiliaryActions == var1.auxiliaryActions)) {
            return false;
         } else {
            return this.type === var1.type;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.title.hashCode();
      var var2: Int = 0;
      val var1: Int;
      if (this.content == null) {
         var1 = 0;
      } else {
         var1 = this.content.hashCode();
      }

      val var4: Int = this.priority.hashCode();
      if (this.contentAction != null) {
         var2 = this.contentAction.hashCode();
      }

      return ((((var3 * 31 + var1) * 31 + var4) * 31 + var2) * 31 + this.auxiliaryActions.hashCode()) * 31 + this.type.hashCode();
   }

   public override fun toString(): String {
      val var5: java.lang.String = this.title;
      val var7: java.lang.String = this.content;
      val var3: ServiceNotificationConfiguration.Priority = this.priority;
      val var4: ServiceNotificationConfiguration.Action = this.contentAction;
      val var6: java.util.List = this.auxiliaryActions;
      val var1: ServiceNotificationConfiguration.Type = this.type;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ServiceNotificationConfiguration(title=");
      var2.append(var5);
      var2.append(", content=");
      var2.append(var7);
      var2.append(", priority=");
      var2.append(var3);
      var2.append(", contentAction=");
      var2.append(var4);
      var2.append(", auxiliaryActions=");
      var2.append(var6);
      var2.append(", type=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public data class Action(tag: String, taskName: String, title: String?, data: Map<String, String>) {
      public final val tag: String
      public final val taskName: String
      public final val title: String?
      public final val data: Map<String, String>

      init {
         this.tag = var1;
         this.taskName = var2;
         this.title = var3;
         this.data = var4;
      }

      public operator fun component1(): String {
         return this.tag;
      }

      public operator fun component2(): String {
         return this.taskName;
      }

      public operator fun component3(): String? {
         return this.title;
      }

      public operator fun component4(): Map<String, String> {
         return this.data;
      }

      public fun copy(tag: String = var0.tag, taskName: String = var0.taskName, title: String? = var0.title, data: Map<String, String> = var0.data): com.discord.foreground_service.service.ServiceNotificationConfiguration.Action {
         return new ServiceNotificationConfiguration.Action(var1, var2, var3, var4);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is ServiceNotificationConfiguration.Action) {
            return false;
         } else {
            var1 = var1;
            if (!(this.tag == var1.tag)) {
               return false;
            } else if (!(this.taskName == var1.taskName)) {
               return false;
            } else if (!(this.title == var1.title)) {
               return false;
            } else {
               return this.data == var1.data;
            }
         }
      }

      public override fun hashCode(): Int {
         val var3: Int = this.tag.hashCode();
         val var2: Int = this.taskName.hashCode();
         val var1: Int;
         if (this.title == null) {
            var1 = 0;
         } else {
            var1 = this.title.hashCode();
         }

         return ((var3 * 31 + var2) * 31 + var1) * 31 + this.data.hashCode();
      }

      public override fun toString(): String {
         val var2: java.lang.String = this.tag;
         val var1: java.lang.String = this.taskName;
         val var4: java.lang.String = this.title;
         val var3: java.util.Map = this.data;
         val var5: StringBuilder = new StringBuilder();
         var5.append("Action(tag=");
         var5.append(var2);
         var5.append(", taskName=");
         var5.append(var1);
         var5.append(", title=");
         var5.append(var4);
         var5.append(", data=");
         var5.append(var3);
         var5.append(")");
         return var5.toString();
      }
   }

   public companion object

   public enum class Priority {
      HIGH,
      LOW,
      MEDIUM      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private ServiceNotificationConfiguration.Priority[] $VALUES;

      @JvmStatic
      fun {
         val var0: Array<ServiceNotificationConfiguration.Priority> = $values();
         $VALUES = var0;
         $ENTRIES = a.a(var0);
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }
   }

   public enum class Type {
      FILE_UPLOAD,
      SCREEN_SHARE,
      VOICE_CALL      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private ServiceNotificationConfiguration.Type[] $VALUES;

      @JvmStatic
      fun {
         val var0: Array<ServiceNotificationConfiguration.Type> = $values();
         $VALUES = var0;
         $ENTRIES = a.a(var0);
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }
   }
}
