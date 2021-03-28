package com.github.syari.yululi.strongitemore

import com.github.syari.spigot.api.event.EventRegister
import com.github.syari.spigot.api.event.Events
import org.bukkit.event.block.BlockDropItemEvent

object EventListener : EventRegister {
    override fun Events.register() {
        event<BlockDropItemEvent> { e ->
            val min = StrongItemGenerator.min(e.blockState.type) ?: return@event
            e.items.forEach {
                it.itemStack = StrongItemGenerator.random(min)
            }
        }
    }
}
