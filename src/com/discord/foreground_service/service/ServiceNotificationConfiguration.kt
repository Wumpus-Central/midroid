package com.discord.foreground_service.service

import kotlin.jvm.internal.r

internal data class ServiceNotificationConfiguration(title: String,
   content: String?,
   priority: com.discord.foreground_service.service.ServiceNotificationConfiguration.Priority,
   contentAction: com.discord.foreground_service.service.ServiceNotificationConfiguration.Action?,
   auxiliaryActions: List<com.discord.foreground_service.service.ServiceNotificationConfiguration.Action>
) {
   public final val auxiliaryActions: List<com.discord.foreground_service.service.ServiceNotificationConfiguration.Action>
   public final val content: String?
   public final val contentAction: com.discord.foreground_service.service.ServiceNotificationConfiguration.Action?
   public final val priority: com.discord.foreground_service.service.ServiceNotificationConfiguration.Priority
   public final val title: String

   init {
      r.h(var1, "title");
      r.h(var3, "priority");
      r.h(var5, "auxiliaryActions");
      super();
      this.title = var1;
      this.content = var2;
      this.priority = var3;
      this.contentAction = var4;
      this.auxiliaryActions = var5;
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

   public fun copy(
      title: String = var0.title,
      content: String? = var0.content,
      priority: com.discord.foreground_service.service.ServiceNotificationConfiguration.Priority = var0.priority,
      contentAction: com.discord.foreground_service.service.ServiceNotificationConfiguration.Action? = var0.contentAction,
      auxiliaryActions: List<com.discord.foreground_service.service.ServiceNotificationConfiguration.Action> = var0.auxiliaryActions
   ): ServiceNotificationConfiguration {
      r.h(var1, "title");
      r.h(var3, "priority");
      r.h(var5, "auxiliaryActions");
      return new ServiceNotificationConfiguration(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ServiceNotificationConfiguration) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.title, var1.title)) {
            return false;
         } else if (!r.c(this.content, var1.content)) {
            return false;
         } else if (this.priority != var1.priority) {
            return false;
         } else if (!r.c(this.contentAction, var1.contentAction)) {
            return false;
         } else {
            return r.c(this.auxiliaryActions, var1.auxiliaryActions);
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

      return (((var3 * 31 + var1) * 31 + var4) * 31 + var2) * 31 + this.auxiliaryActions.hashCode();
   }

   public override fun toString(): String {
      val var6: java.lang.String = this.title;
      val var1: java.lang.String = this.content;
      val var2: ServiceNotificationConfiguration.Priority = this.priority;
      val var3: ServiceNotificationConfiguration.Action = this.contentAction;
      val var4: java.util.List = this.auxiliaryActions;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ServiceNotificationConfiguration(title=");
      var5.append(var6);
      var5.append(", content=");
      var5.append(var1);
      var5.append(", priority=");
      var5.append(var2);
      var5.append(", contentAction=");
      var5.append(var3);
      var5.append(", auxiliaryActions=");
      var5.append(var4);
      var5.append(")");
      return var5.toString();
   }

   public data class Action(tag: String, taskName: String, title: String?, data: Map<String, String>) {
      public final val data: Map<String, String>
      public final val tag: String
      public final val taskName: String
      public final val title: String?

      init {
         r.h(var1, "tag");
         r.h(var2, "taskName");
         r.h(var4, "data");
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
         r.h(var1, "tag");
         r.h(var2, "taskName");
         r.h(var4, "data");
         return new ServiceNotificationConfiguration.Action(var1, var2, var3, var4);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is ServiceNotificationConfiguration.Action) {
            return false;
         } else {
            var1 = var1;
            if (!r.c(this.tag, var1.tag)) {
               return false;
            } else if (!r.c(this.taskName, var1.taskName)) {
               return false;
            } else if (!r.c(this.title, var1.title)) {
               return false;
            } else {
               return r.c(this.data, var1.data);
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
         val var2: java.lang.String = this.tag;
         val var1: java.lang.String = this.taskName;
         val var5: java.lang.String = this.title;
         val var4: java.util.Map = this.data;
         val var3: StringBuilder = new StringBuilder();
         var3.append("Action(tag=");
         var3.append(var2);
         var3.append(", taskName=");
         var3.append(var1);
         var3.append(", title=");
         var3.append(var5);
         var3.append(", data=");
         var3.append(var4);
         var3.append(")");
         return var3.toString();
      }
   }

   public companion object

   public enum class Priority {
      HIGH,
      LOW,
      MEDIUM      @JvmStatic
      private ServiceNotificationConfiguration.Priority[] $VALUES = $values();
   }
}
