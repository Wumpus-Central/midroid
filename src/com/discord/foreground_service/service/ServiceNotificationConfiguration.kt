package com.discord.foreground_service.service

import kotlin.enums.EnumEntries
import kotlin.jvm.internal.q
import rh.a

internal data class ServiceNotificationConfiguration(title: String,
   content: String?,
   priority: com.discord.foreground_service.service.ServiceNotificationConfiguration.Priority,
   contentAction: com.discord.foreground_service.service.ServiceNotificationConfiguration.Action?,
   auxiliaryActions: List<com.discord.foreground_service.service.ServiceNotificationConfiguration.Action>,
   type: com.discord.foreground_service.service.ServiceNotificationConfiguration.Type
) {
   public final val auxiliaryActions: List<com.discord.foreground_service.service.ServiceNotificationConfiguration.Action>
   public final val content: String?
   public final val contentAction: com.discord.foreground_service.service.ServiceNotificationConfiguration.Action?
   public final val priority: com.discord.foreground_service.service.ServiceNotificationConfiguration.Priority
   public final val title: String
   public final val type: com.discord.foreground_service.service.ServiceNotificationConfiguration.Type

   init {
      q.h(var1, "title");
      q.h(var3, "priority");
      q.h(var5, "auxiliaryActions");
      q.h(var6, "type");
      super();
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
      q.h(var1, "title");
      q.h(var3, "priority");
      q.h(var5, "auxiliaryActions");
      q.h(var6, "type");
      return new ServiceNotificationConfiguration(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ServiceNotificationConfiguration) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.title, var1.title)) {
            return false;
         } else if (!q.c(this.content, var1.content)) {
            return false;
         } else if (this.priority != var1.priority) {
            return false;
         } else if (!q.c(this.contentAction, var1.contentAction)) {
            return false;
         } else if (!q.c(this.auxiliaryActions, var1.auxiliaryActions)) {
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
      val var1: java.lang.String = this.title;
      val var5: java.lang.String = this.content;
      val var3: ServiceNotificationConfiguration.Priority = this.priority;
      val var4: ServiceNotificationConfiguration.Action = this.contentAction;
      val var2: java.util.List = this.auxiliaryActions;
      val var6: ServiceNotificationConfiguration.Type = this.type;
      val var7: StringBuilder = new StringBuilder();
      var7.append("ServiceNotificationConfiguration(title=");
      var7.append(var1);
      var7.append(", content=");
      var7.append(var5);
      var7.append(", priority=");
      var7.append(var3);
      var7.append(", contentAction=");
      var7.append(var4);
      var7.append(", auxiliaryActions=");
      var7.append(var2);
      var7.append(", type=");
      var7.append(var6);
      var7.append(")");
      return var7.toString();
   }

   public data class Action(tag: String, taskName: String, title: String?, data: Map<String, String>) {
      public final val data: Map<String, String>
      public final val tag: String
      public final val taskName: String
      public final val title: String?

      init {
         q.h(var1, "tag");
         q.h(var2, "taskName");
         q.h(var4, "data");
         super();
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
         q.h(var1, "tag");
         q.h(var2, "taskName");
         q.h(var4, "data");
         return new ServiceNotificationConfiguration.Action(var1, var2, var3, var4);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is ServiceNotificationConfiguration.Action) {
            return false;
         } else {
            var1 = var1;
            if (!q.c(this.tag, var1.tag)) {
               return false;
            } else if (!q.c(this.taskName, var1.taskName)) {
               return false;
            } else if (!q.c(this.title, var1.title)) {
               return false;
            } else {
               return q.c(this.data, var1.data);
            }
         }
      }

      public override fun hashCode(): Int {
         val var2: Int = this.tag.hashCode();
         val var3: Int = this.taskName.hashCode();
         val var1: Int;
         if (this.title == null) {
            var1 = 0;
         } else {
            var1 = this.title.hashCode();
         }

         return ((var2 * 31 + var3) * 31 + var1) * 31 + this.data.hashCode();
      }

      public override fun toString(): String {
         val var4: java.lang.String = this.tag;
         val var1: java.lang.String = this.taskName;
         val var5: java.lang.String = this.title;
         val var2: java.util.Map = this.data;
         val var3: StringBuilder = new StringBuilder();
         var3.append("Action(tag=");
         var3.append(var4);
         var3.append(", taskName=");
         var3.append(var1);
         var3.append(", title=");
         var3.append(var5);
         var3.append(", data=");
         var3.append(var2);
         var3.append(")");
         return var3.toString();
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
