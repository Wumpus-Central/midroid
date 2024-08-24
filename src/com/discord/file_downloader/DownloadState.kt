package com.discord.file_downloader

import java.io.File
import kotlin.jvm.internal.r

public sealed class DownloadState protected constructor() {
   public data class Completed(file: File) : DownloadState {
      public final val file: File

      init {
         r.h(var1, "file");
         super(null);
         this.file = var1;
      }

      public operator fun component1(): File {
         return this.file;
      }

      public fun copy(file: File = var0.file): com.discord.file_downloader.DownloadState.Completed {
         r.h(var1, "file");
         return new DownloadState.Completed(var1);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is DownloadState.Completed) {
            return false;
         } else {
            return r.c(this.file, (var1 as DownloadState.Completed).file);
         }
      }

      public override fun hashCode(): Int {
         return this.file.hashCode();
      }

      public override fun toString(): String {
         val var2: File = this.file;
         val var1: StringBuilder = new StringBuilder();
         var1.append("Completed(file=");
         var1.append(var2);
         var1.append(")");
         return var1.toString();
      }
   }

   public data class Failure(exception: Exception) : DownloadState {
      public final val exception: Exception

      init {
         r.h(var1, "exception");
         super(null);
         this.exception = var1;
      }

      public operator fun component1(): Exception {
         return this.exception;
      }

      public fun copy(exception: Exception = var0.exception): com.discord.file_downloader.DownloadState.Failure {
         r.h(var1, "exception");
         return new DownloadState.Failure(var1);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is DownloadState.Failure) {
            return false;
         } else {
            return r.c(this.exception, (var1 as DownloadState.Failure).exception);
         }
      }

      public override fun hashCode(): Int {
         return this.exception.hashCode();
      }

      public override fun toString(): String {
         val var1: Exception = this.exception;
         val var2: StringBuilder = new StringBuilder();
         var2.append("Failure(exception=");
         var2.append(var1);
         var2.append(")");
         return var2.toString();
      }
   }

   public object InProgress : DownloadState()
}
