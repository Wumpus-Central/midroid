package com.discord.user_search_worker

import eh.w
import fh.s
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.Map.Entry
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.e
import uk.f
import wk.g
import wk.e.i

@f(with = UserSearchTransformedUser.Serializer::class)
internal data class UserSearchTransformedUser(id: String,
   username: String,
   isBot: Boolean? = null,
   isFriend: Boolean? = null,
   friendNickname: String? = null,
   globalName: String? = null,
   nicknames: Map<String, String?>
) {
   public final val friendNickname: String?
   public final val globalName: String?
   public final val id: String
   public final val isBot: Boolean?
   public final val isFriend: Boolean?
   public final val nicknames: Map<String, String?>
   public final val username: String

   init {
      r.h(var1, "id");
      r.h(var2, "username");
      r.h(var7, "nicknames");
      super();
      this.id = var1;
      this.username = var2;
      this.isBot = var3;
      this.isFriend = var4;
      this.friendNickname = var5;
      this.globalName = var6;
      this.nicknames = var7;
   }

   public operator fun component1(): String {
      return this.id;
   }

   public operator fun component2(): String {
      return this.username;
   }

   public operator fun component3(): Boolean? {
      return this.isBot;
   }

   public operator fun component4(): Boolean? {
      return this.isFriend;
   }

   public operator fun component5(): String? {
      return this.friendNickname;
   }

   public operator fun component6(): String? {
      return this.globalName;
   }

   public operator fun component7(): Map<String, String?> {
      return this.nicknames;
   }

   public fun copy(
      id: String = var0.id,
      username: String = var0.username,
      isBot: Boolean? = var0.isBot,
      isFriend: Boolean? = var0.isFriend,
      friendNickname: String? = var0.friendNickname,
      globalName: String? = var0.globalName,
      nicknames: Map<String, String?> = var0.nicknames
   ): UserSearchTransformedUser {
      r.h(var1, "id");
      r.h(var2, "username");
      r.h(var7, "nicknames");
      return new UserSearchTransformedUser(var1, var2, var3, var4, var5, var6, var7);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UserSearchTransformedUser) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.id, var1.id)) {
            return false;
         } else if (!r.c(this.username, var1.username)) {
            return false;
         } else if (!r.c(this.isBot, var1.isBot)) {
            return false;
         } else if (!r.c(this.isFriend, var1.isFriend)) {
            return false;
         } else if (!r.c(this.friendNickname, var1.friendNickname)) {
            return false;
         } else if (!r.c(this.globalName, var1.globalName)) {
            return false;
         } else {
            return r.c(this.nicknames, var1.nicknames);
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = this.id.hashCode();
      val var6: Int = this.username.hashCode();
      var var4: Int = 0;
      val var1: Int;
      if (this.isBot == null) {
         var1 = 0;
      } else {
         var1 = this.isBot.hashCode();
      }

      val var2: Int;
      if (this.isFriend == null) {
         var2 = 0;
      } else {
         var2 = this.isFriend.hashCode();
      }

      val var3: Int;
      if (this.friendNickname == null) {
         var3 = 0;
      } else {
         var3 = this.friendNickname.hashCode();
      }

      if (this.globalName != null) {
         var4 = this.globalName.hashCode();
      }

      return (((((var5 * 31 + var6) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + this.nicknames.hashCode();
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.id;
      val var6: java.lang.String = this.username;
      val var1: java.lang.Boolean = this.isBot;
      val var8: java.lang.Boolean = this.isFriend;
      val var5: java.lang.String = this.friendNickname;
      val var2: java.lang.String = this.globalName;
      val var3: java.util.Map = this.nicknames;
      val var7: StringBuilder = new StringBuilder();
      var7.append("UserSearchTransformedUser(id=");
      var7.append(var4);
      var7.append(", username=");
      var7.append(var6);
      var7.append(", isBot=");
      var7.append(var1);
      var7.append(", isFriend=");
      var7.append(var8);
      var7.append(", friendNickname=");
      var7.append(var5);
      var7.append(", globalName=");
      var7.append(var2);
      var7.append(", nicknames=");
      var7.append(var3);
      var7.append(")");
      return var7.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<UserSearchTransformedUser> {
         return UserSearchTransformedUser.Serializer.INSTANCE;
      }
   }

   internal object Serializer : KSerializer<UserSearchTransformedUser> {
      private final val TRANSFORMED_USER_KEYS: Set<String> = u.i(new java.lang.String[]{"id", "username", "isBot", "isFriend", "friendNickname", "globalName"})

      public open val descriptor: SerialDescriptor
         public open get() {
            return g.a("UserSearchTransformedUser", i.a);
         }


      public open fun deserialize(decoder: Decoder): UserSearchTransformedUser {
         r.h(var1, "decoder");
         val var12: JsonElement = (var1 as e).g();
         r.f(var12, "null cannot be cast to non-null type kotlinx.serialization.json.JsonObject");
         val var6: JsonObject = var12 as JsonObject;
         val var13: LinkedHashMap = new LinkedHashMap();

         for (Entry var7 : var6.entrySet()) {
            val var8: java.lang.String = var7.getKey() as java.lang.String;
            val var4: JsonElement = var7.getValue() as JsonElement;
            val var2: Boolean;
            if (TRANSFORMED_USER_KEYS.contains(var8) || !kotlinx.serialization.json.g.p(var4).m() && kotlinx.serialization.json.g.p(var4) !is JsonNull) {
               var2 = false;
            } else {
               var2 = true;
            }

            if (var2) {
               var13.put(var7.getKey(), var7.getValue());
            }
         }

         val var24: ArrayList = new ArrayList(var13.size());
         val var26: java.util.Iterator = var13.entrySet().iterator();

         while (true) {
            val var3: Boolean = var26.hasNext();
            var var14: java.lang.String = null;
            if (!var3) {
               var var9: java.lang.String;
               var var10: java.lang.String;
               var var33: java.util.Map;
               label59: {
                  var33 = s.t(var24);
                  var var15: Any = var6.get("id");
                  r.e(var15);
                  var9 = kotlinx.serialization.json.g.p(var15 as JsonElement).e();
                  var15 = var6.get("username");
                  r.e(var15);
                  var10 = kotlinx.serialization.json.g.p(var15 as JsonElement).e();
                  var15 = var6.get("isBot") as JsonElement;
                  if (var15 != null) {
                     var15 = kotlinx.serialization.json.g.p((JsonElement)var15);
                     if (var15 != null) {
                        var25 = kotlinx.serialization.json.g.f((JsonPrimitive)var15);
                        break label59;
                     }
                  }

                  var25 = null;
               }

               label54: {
                  val var19: JsonElement = var6.get("isFriend") as JsonElement;
                  if (var19 != null) {
                     val var20: JsonPrimitive = kotlinx.serialization.json.g.p(var19);
                     if (var20 != null) {
                        var27 = kotlinx.serialization.json.g.f(var20);
                        break label54;
                     }
                  }

                  var27 = null;
               }

               label49: {
                  val var21: JsonElement = var6.get("friendNickname") as JsonElement;
                  if (var21 != null) {
                     val var22: JsonPrimitive = kotlinx.serialization.json.g.p(var21);
                     if (var22 != null) {
                        if (var22.m()) {
                           var23 = var22.e();
                        } else {
                           var23 = null;
                        }
                        break label49;
                     }
                  }

                  var23 = null;
               }

               val var11: JsonElement = var6.get("globalName") as JsonElement;
               var var28: java.lang.String = null;
               if (var11 != null) {
                  val var34: JsonPrimitive = kotlinx.serialization.json.g.p(var11);
                  var28 = null;
                  if (var34 != null) {
                     var28 = null;
                     if (var34.m()) {
                        var28 = var34.e();
                     }
                  }
               }

               return new UserSearchTransformedUser(var9, var10, var25, var27, var23, var28, var33);
            }

            val var31: Entry = var26.next() as Entry;
            val var30: java.lang.String = var31.getKey() as java.lang.String;
            val var32: JsonElement = var31.getValue() as JsonElement;
            if (kotlinx.serialization.json.g.p(var32).m()) {
               var14 = kotlinx.serialization.json.g.p(var32).e();
            }

            var24.add(w.a(var30, var14));
         }
      }

      public open fun serialize(encoder: Encoder, value: UserSearchTransformedUser) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         throw new UnsupportedOperationException();
      }
   }
}
