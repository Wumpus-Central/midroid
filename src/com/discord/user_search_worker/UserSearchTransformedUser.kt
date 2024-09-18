package com.discord.user_search_worker

import dh.r
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.Map.Entry
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import uk.f
import wk.g
import wk.e.i
import yk.e

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
      q.h(var1, "id");
      q.h(var2, "username");
      q.h(var7, "nicknames");
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
      q.h(var1, "id");
      q.h(var2, "username");
      q.h(var7, "nicknames");
      return new UserSearchTransformedUser(var1, var2, var3, var4, var5, var6, var7);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UserSearchTransformedUser) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.id, var1.id)) {
            return false;
         } else if (!q.c(this.username, var1.username)) {
            return false;
         } else if (!q.c(this.isBot, var1.isBot)) {
            return false;
         } else if (!q.c(this.isFriend, var1.isFriend)) {
            return false;
         } else if (!q.c(this.friendNickname, var1.friendNickname)) {
            return false;
         } else if (!q.c(this.globalName, var1.globalName)) {
            return false;
         } else {
            return q.c(this.nicknames, var1.nicknames);
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
      val var1: java.lang.String = this.id;
      val var4: java.lang.String = this.username;
      val var3: java.lang.Boolean = this.isBot;
      val var5: java.lang.Boolean = this.isFriend;
      val var7: java.lang.String = this.friendNickname;
      val var8: java.lang.String = this.globalName;
      val var6: java.util.Map = this.nicknames;
      val var2: StringBuilder = new StringBuilder();
      var2.append("UserSearchTransformedUser(id=");
      var2.append(var1);
      var2.append(", username=");
      var2.append(var4);
      var2.append(", isBot=");
      var2.append(var3);
      var2.append(", isFriend=");
      var2.append(var5);
      var2.append(", friendNickname=");
      var2.append(var7);
      var2.append(", globalName=");
      var2.append(var8);
      var2.append(", nicknames=");
      var2.append(var6);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<UserSearchTransformedUser> {
         return UserSearchTransformedUser.Serializer.INSTANCE;
      }
   }

   internal object Serializer : KSerializer {
      private final val TRANSFORMED_USER_KEYS: Set<String> = w.i(new java.lang.String[]{"id", "username", "isBot", "isFriend", "friendNickname", "globalName"})

      public open val descriptor: SerialDescriptor
         public open get() {
            return g.a("UserSearchTransformedUser", i.a);
         }


      public open fun deserialize(decoder: Decoder): UserSearchTransformedUser {
         q.h(var1, "decoder");
         val var11: JsonElement = (var1 as e).i();
         q.f(var11, "null cannot be cast to non-null type kotlinx.serialization.json.JsonObject");
         val var5: JsonObject = var11 as JsonObject;
         val var12: LinkedHashMap = new LinkedHashMap();

         for (Entry var7 : var5.entrySet()) {
            val var3: java.lang.String = var7.getKey() as java.lang.String;
            val var4: JsonElement = var7.getValue() as JsonElement;
            if (!TRANSFORMED_USER_KEYS.contains(var3) && (yk.g.p(var4).n() || yk.g.p(var4) is JsonNull)) {
               var12.put(var7.getKey(), var7.getValue());
            }
         }

         val var23: ArrayList = new ArrayList(var12.size());
         val var25: java.util.Iterator = var12.entrySet().iterator();

         while (true) {
            val var2: Boolean = var25.hasNext();
            var var13: java.lang.String = null;
            if (!var2) {
               var var8: java.lang.String;
               var var9: java.lang.String;
               var var32: java.util.Map;
               label55: {
                  var32 = r.t(var23);
                  var var14: Any = var5.get("id");
                  q.e(var14);
                  var8 = yk.g.p(var14 as JsonElement).a();
                  var14 = var5.get("username");
                  q.e(var14);
                  var9 = yk.g.p(var14 as JsonElement).a();
                  var14 = var5.get("isBot") as JsonElement;
                  if (var14 != null) {
                     var14 = yk.g.p((JsonElement)var14);
                     if (var14 != null) {
                        var24 = yk.g.f((JsonPrimitive)var14);
                        break label55;
                     }
                  }

                  var24 = null;
               }

               label50: {
                  val var18: JsonElement = var5.get("isFriend") as JsonElement;
                  if (var18 != null) {
                     val var19: JsonPrimitive = yk.g.p(var18);
                     if (var19 != null) {
                        var26 = yk.g.f(var19);
                        break label50;
                     }
                  }

                  var26 = null;
               }

               label45: {
                  val var20: JsonElement = var5.get("friendNickname") as JsonElement;
                  if (var20 != null) {
                     val var21: JsonPrimitive = yk.g.p(var20);
                     if (var21 != null) {
                        if (var21.n()) {
                           var22 = var21.a();
                        } else {
                           var22 = null;
                        }
                        break label45;
                     }
                  }

                  var22 = null;
               }

               val var10: JsonElement = var5.get("globalName") as JsonElement;
               var var27: java.lang.String = null;
               if (var10 != null) {
                  val var33: JsonPrimitive = yk.g.p(var10);
                  var27 = null;
                  if (var33 != null) {
                     var27 = null;
                     if (var33.n()) {
                        var27 = var33.a();
                     }
                  }
               }

               return new UserSearchTransformedUser(var8, var9, var24, var26, var22, var27, var32);
            }

            val var30: Entry = var25.next() as Entry;
            val var29: java.lang.String = var30.getKey() as java.lang.String;
            val var31: JsonElement = var30.getValue() as JsonElement;
            if (yk.g.p(var31).n()) {
               var13 = yk.g.p(var31).a();
            }

            var23.add(ch.w.a(var29, var13));
         }
      }

      public open fun serialize(encoder: Encoder, value: UserSearchTransformedUser) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         throw new UnsupportedOperationException();
      }
   }
}
