package com.github.syari.yululi.strongitemore

import com.github.syari.spigot.api.event.EventRegister.Companion.registerEvents
import com.github.syari.spigot.api.item.editItemMeta
import com.github.syari.spigot.api.scheduler.runTaskTimer
import org.bukkit.Color
import org.bukkit.entity.Item
import org.bukkit.inventory.meta.LeatherArmorMeta
import org.bukkit.plugin.java.JavaPlugin

@Suppress("unused")
class Main : JavaPlugin() {
    companion object {
        internal lateinit var plugin: JavaPlugin
    }

    init {
        plugin = this
    }

    override fun onEnable() {
        registerEvents(EventListener)
        runTaskTimer(3) {
            server.worlds.forEach { world ->
                world.entities.forEach {
                    if (it is Item) {
                        val itemStack = it.itemStack
                        val enchantments = itemStack.enchantments
                        if (enchantments == StrongItemGenerator.armorEnchantments32767) {
                            itemStack.editItemMeta<LeatherArmorMeta> {
                                setColor(Color.fromRGB((0..0xFFFFFF).random()))
                            }
                        }
                    }
                }
            }
            server.onlinePlayers.forEach { player ->
                player.inventory.forEach {
                    if (it != null) {
                        if (it.enchantments == StrongItemGenerator.armorEnchantments32767) {
                            it.editItemMeta<LeatherArmorMeta> {
                                setColor(Color.fromRGB((0..0xFFFFFF).random()))
                            }
                        }
                    }
                }
            }
        }
    }
}
