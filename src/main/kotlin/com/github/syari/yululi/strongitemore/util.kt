package com.github.syari.yululi.strongitemore

import com.github.syari.spigot.api.item.itemStack
import org.bukkit.Material
import org.bukkit.enchantments.Enchantment

fun itemStack(material: Material, enchants: Map<Enchantment, Int>) = itemStack(material) {
    addUnsafeEnchantments(enchants)
}
