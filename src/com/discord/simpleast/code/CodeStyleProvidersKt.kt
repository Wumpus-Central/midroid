package com.discord.simpleast.code

import com.discord.simpleast.core.node.StyleNode
import com.discord.simpleast.core.node.StyleNode.SpanProvider

@JvmSynthetic
fun `access$emptyProvider`(): StyleNode.SpanProvider {
   return emptyProvider();
}

private fun <R> emptyProvider(): SpanProvider<R> {
   return <unrepresentable>.INSTANCE;
}
