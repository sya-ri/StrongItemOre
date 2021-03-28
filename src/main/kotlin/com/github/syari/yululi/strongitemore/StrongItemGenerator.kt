package com.github.syari.yululi.strongitemore

import com.github.syari.spigot.api.item.itemStack
import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.inventory.ItemStack

object StrongItemGenerator {
    private val swordEnchantments = setOf(
        Enchantment.DAMAGE_ALL,
        Enchantment.DAMAGE_UNDEAD,
        Enchantment.DAMAGE_ARTHROPODS,
        Enchantment.KNOCKBACK,
        Enchantment.FIRE_ASPECT,
        Enchantment.LOOT_BONUS_MOBS,
        Enchantment.SWEEPING_EDGE,
        Enchantment.DURABILITY,
        Enchantment.MENDING
    )

    private val armorEnchantments = setOf(
        Enchantment.PROTECTION_ENVIRONMENTAL,
        Enchantment.PROTECTION_FIRE,
        Enchantment.PROTECTION_FALL,
        Enchantment.PROTECTION_EXPLOSIONS,
        Enchantment.PROTECTION_PROJECTILE,
        Enchantment.OXYGEN,
        Enchantment.WATER_WORKER,
        Enchantment.THORNS,
        Enchantment.DEPTH_STRIDER,
        Enchantment.DURABILITY,
        Enchantment.MENDING
    )

    val armorEnchantments32767 = armorEnchantments.associateWith { 32767 }

    private val itemList = setOf(
        100 to itemStack(Material.GOLDEN_APPLE),
        50 to itemStack(Material.TOTEM_OF_UNDYING),
        50 to itemStack(Material.ENCHANTED_GOLDEN_APPLE),
        10 to itemStack(Material.WOODEN_SWORD, swordEnchantments.associateWith { 5 }),
        10 to itemStack(Material.LEATHER_HELMET, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.LEATHER_CHESTPLATE, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.LEATHER_LEGGINGS, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.LEATHER_BOOTS, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.STONE_SWORD, swordEnchantments.associateWith { 5 }),
        10 to itemStack(Material.CHAINMAIL_HELMET, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.CHAINMAIL_CHESTPLATE, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.CHAINMAIL_LEGGINGS, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.CHAINMAIL_BOOTS, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.IRON_SWORD, swordEnchantments.associateWith { 5 }),
        10 to itemStack(Material.IRON_HELMET, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.IRON_CHESTPLATE, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.IRON_LEGGINGS, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.IRON_BOOTS, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.GOLDEN_SWORD, swordEnchantments.associateWith { 5 }),
        10 to itemStack(Material.GOLDEN_HELMET, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.GOLDEN_CHESTPLATE, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.GOLDEN_LEGGINGS, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.GOLDEN_BOOTS, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.DIAMOND_SWORD, swordEnchantments.associateWith { 5 }),
        10 to itemStack(Material.DIAMOND_HELMET, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.DIAMOND_CHESTPLATE, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.DIAMOND_LEGGINGS, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.DIAMOND_BOOTS, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.NETHERITE_SWORD, swordEnchantments.associateWith { 5 }),
        10 to itemStack(Material.NETHERITE_HELMET, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.NETHERITE_CHESTPLATE, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.NETHERITE_LEGGINGS, armorEnchantments.associateWith { 5 }),
        10 to itemStack(Material.NETHERITE_BOOTS, armorEnchantments.associateWith { 5 }),
        5 to itemStack(Material.WOODEN_SWORD, swordEnchantments.associateWith { 10 }),
        5 to itemStack(Material.LEATHER_HELMET, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.LEATHER_CHESTPLATE, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.LEATHER_LEGGINGS, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.LEATHER_BOOTS, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.STONE_SWORD, swordEnchantments.associateWith { 10 }),
        5 to itemStack(Material.CHAINMAIL_HELMET, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.CHAINMAIL_CHESTPLATE, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.CHAINMAIL_LEGGINGS, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.CHAINMAIL_BOOTS, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.IRON_SWORD, swordEnchantments.associateWith { 10 }),
        5 to itemStack(Material.IRON_HELMET, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.IRON_CHESTPLATE, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.IRON_LEGGINGS, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.IRON_BOOTS, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.GOLDEN_SWORD, swordEnchantments.associateWith { 10 }),
        5 to itemStack(Material.GOLDEN_HELMET, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.GOLDEN_CHESTPLATE, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.GOLDEN_LEGGINGS, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.GOLDEN_BOOTS, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.DIAMOND_SWORD, swordEnchantments.associateWith { 10 }),
        5 to itemStack(Material.DIAMOND_HELMET, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.DIAMOND_CHESTPLATE, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.DIAMOND_LEGGINGS, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.DIAMOND_BOOTS, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.NETHERITE_SWORD, swordEnchantments.associateWith { 10 }),
        5 to itemStack(Material.NETHERITE_HELMET, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.NETHERITE_CHESTPLATE, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.NETHERITE_LEGGINGS, armorEnchantments.associateWith { 10 }),
        5 to itemStack(Material.NETHERITE_BOOTS, armorEnchantments.associateWith { 10 }),
        1 to itemStack(Material.LEATHER_HELMET, armorEnchantments32767),
        1 to itemStack(Material.LEATHER_CHESTPLATE, armorEnchantments32767),
        1 to itemStack(Material.LEATHER_LEGGINGS, armorEnchantments32767),
        1 to itemStack(Material.LEATHER_BOOTS, armorEnchantments32767)
    )

    private val cumulativeSum = itemList.sumBy { it.first }

    fun min(type: Material) = when (type) {
        Material.COAL_ORE -> 0
        Material.NETHER_GOLD_ORE -> 50
        Material.NETHER_QUARTZ_ORE -> 50
        Material.IRON_ORE -> 100
        Material.GOLD_ORE -> 150
        Material.REDSTONE_ORE -> 50
        Material.LAPIS_ORE -> 101
        Material.DIAMOND_ORE -> 200
        Material.EMERALD_ORE -> cumulativeSum - 33
        Material.ANCIENT_DEBRIS -> cumulativeSum - 3
        else -> null
    }

    fun random(min: Int) = getItem((min..cumulativeSum).random())

    private fun getItem(value: Int): ItemStack {
        var sum = 0
        return itemList.first {
            sum += it.first
            value <= sum
        }.second
    }
}
