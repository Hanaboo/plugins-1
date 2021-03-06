/*
 * Copyright (c) 2019, Adam <Adam@sigterm.info>
 * Copyright (c) 2019, TheStonedTurtle <https://github.com/TheStonedTurtle>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.itemskeptondeath;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import javax.annotation.Nullable;
import lombok.AccessLevel;
import lombok.Getter;
import net.runelite.api.ItemID;

/**
 * Some items have a fixed price that is added to its default value when calculating death prices.
 * These are typically imbued items, such as Berserker ring (i), to help it protect over the non-imbued variants.
 */
@Getter(AccessLevel.PACKAGE)
enum FixedPriceItem
{
	IMBUED_BLACK_MASK_I(ItemID.BLACK_MASK_I, 5000),
	IMBUED_BLACK_MASK_1_I(ItemID.BLACK_MASK_1_I, 5000),
	IMBUED_BLACK_MASK_2_I(ItemID.BLACK_MASK_2_I, 5000),
	IMBUED_BLACK_MASK_3_I(ItemID.BLACK_MASK_3_I, 5000),
	IMBUED_BLACK_MASK_4_I(ItemID.BLACK_MASK_4_I, 5000),
	IMBUED_BLACK_MASK_5_I(ItemID.BLACK_MASK_5_I, 5000),
	IMBUED_BLACK_MASK_6_I(ItemID.BLACK_MASK_6_I, 5000),
	IMBUED_BLACK_MASK_7_I(ItemID.BLACK_MASK_7_I, 5000),
	IMBUED_BLACK_MASK_8_I(ItemID.BLACK_MASK_8_I, 5000),
	IMBUED_BLACK_MASK_9_I(ItemID.BLACK_MASK_9_I, 5000),
	IMBUED_BLACK_MASK_10_I(ItemID.BLACK_MASK_10_I, 5000),

	IMBUED_SLAYER_HELMET_I(ItemID.SLAYER_HELMET_I, 1000),
	IMBUED_BLACK_SLAYER_HELMET_I(ItemID.BLACK_SLAYER_HELMET_I, 1000),
	IMBUED_PURPLE_SLAYER_HELMET_I(ItemID.PURPLE_SLAYER_HELMET_I, 1000),
	IMBUED_RED_SLAYER_HELMET_I(ItemID.RED_SLAYER_HELMET_I, 1000),
	IMBUED_GREEN_SLAYER_HELMET_I(ItemID.GREEN_SLAYER_HELMET_I, 1000),
	IMBUED_TURQUOISE_SLAYER_HELMET_I(ItemID.TURQUOISE_SLAYER_HELMET_I, 1000),
	IMBUED_HYDRA_SLAYER_HELMET_I(ItemID.HYDRA_SLAYER_HELMET_I, 1000),
	IMBUED_TWISTED_SLAYER_HELMET_I(ItemID.TWISTED_SLAYER_HELMET_I, 1000),

	IMBUED_ARCHERS_RING_I(ItemID.ARCHERS_RING_I, 2000),
	IMBUED_BERSERKER_RING_I(ItemID.BERSERKER_RING_I, 2000),
	IMBUED_SEERS_RING_I(ItemID.SEERS_RING_I, 2000),

	IMBUED_RING_OF_THE_GODS_I(ItemID.RING_OF_THE_GODS_I, 2000),
	IMBUED_TREASONOUS_RING_I(ItemID.TREASONOUS_RING_I, 2000),
	IMBUED_TYRANNICAL_RING_I(ItemID.TYRANNICAL_RING_I, 2000),

	GRACEFUL_HOOD(ItemID.GRACEFUL_HOOD, 1965),
	GRACEFUL_CAPE(ItemID.GRACEFUL_CAPE, 2460),
	GRACEFUL_TOP(ItemID.GRACEFUL_TOP, 2345),
	GRACEFUL_LEGS(ItemID.GRACEFUL_LEGS, 2290),
	GRACEFUL_GLOVES(ItemID.GRACEFUL_GLOVES, 1970),
	GRACEFUL_BOOTS(ItemID.GRACEFUL_BOOTS, 2060),

	ANGLER_HAT(ItemID.ANGLER_HAT, 2600),
	ANGLER_TOP(ItemID.ANGLER_TOP, 3550),
	ANGLER_WADERS(ItemID.ANGLER_WADERS, 4400),
	ANGLER_BOOTS(ItemID.ANGLER_BOOTS, 5300),

	PROSPECTOR_HELMET(ItemID.PROSPECTOR_HELMET, 2640),
	PROSPECTOR_JACKET(ItemID.PROSPECTOR_JACKET, 3550),
	PROSPECTOR_LEGS(ItemID.PROSPECTOR_LEGS, 4460),
	PROSPECTOR_BOOTS(ItemID.PROSPECTOR_BOOTS, 5370),

	LUMBERJACK_HAT(ItemID.LUMBERJACK_HAT, 19950),
	LUMBERJACK_TOP(ItemID.LUMBERJACK_TOP, 19950),
	LUMBERJACK_LEGS(ItemID.LUMBERJACK_LEGS, 19950),
	LUMBERJACK_BOOTS(ItemID.LUMBERJACK_BOOTS, 19950),

	ROGUE_MASK(ItemID.ROGUE_MASK, 725),
	ROGUE_TOP(ItemID.ROGUE_TOP, 575),
	ROGUE_TROUSERS(ItemID.ROGUE_TROUSERS, 500),
	ROGUE_GLOVES(ItemID.ROGUE_GLOVES, 650),
	ROGUE_BOOTS(ItemID.ROGUE_BOOTS, 650),

	SALVE_AMULET_EI(ItemID.SALVE_AMULETEI, 209900),

	RING_OF_WEALTH_1(ItemID.RING_OF_WEALTH_1, 500, ItemID.RING_OF_WEALTH),
	RING_OF_WEALTH_2(ItemID.RING_OF_WEALTH_2, 1000, ItemID.RING_OF_WEALTH),
	RING_OF_WEALTH_3(ItemID.RING_OF_WEALTH_3, 1500, ItemID.RING_OF_WEALTH),
	RING_OF_WEALTH_4(ItemID.RING_OF_WEALTH_4, 2000, ItemID.RING_OF_WEALTH),

	AMULET_OF_GLORY1(ItemID.AMULET_OF_GLORY1, 500, ItemID.AMULET_OF_GLORY),
	AMULET_OF_GLORY2(ItemID.AMULET_OF_GLORY2, 1000, ItemID.AMULET_OF_GLORY),
	AMULET_OF_GLORY3(ItemID.AMULET_OF_GLORY3, 1500, ItemID.AMULET_OF_GLORY),
	AMULET_OF_GLORY5(ItemID.AMULET_OF_GLORY5, 2500, ItemID.AMULET_OF_GLORY),

	COMBAT_BRACELET1(ItemID.COMBAT_BRACELET1, 500, ItemID.COMBAT_BRACELET),
	COMBAT_BRACELET2(ItemID.COMBAT_BRACELET2, 1000, ItemID.COMBAT_BRACELET),
	COMBAT_BRACELET3(ItemID.COMBAT_BRACELET3, 1500, ItemID.COMBAT_BRACELET),
	COMBAT_BRACELET5(ItemID.COMBAT_BRACELET5, 2500, ItemID.COMBAT_BRACELET),

	SKILLS_NECKLACE1(ItemID.SKILLS_NECKLACE1, 500, ItemID.SKILLS_NECKLACE),
	SKILLS_NECKLACE2(ItemID.SKILLS_NECKLACE2, 1000, ItemID.SKILLS_NECKLACE),
	SKILLS_NECKLACE3(ItemID.SKILLS_NECKLACE3, 1500, ItemID.SKILLS_NECKLACE),
	SKILLS_NECKLACE4(ItemID.SKILLS_NECKLACE5, 2500, ItemID.SKILLS_NECKLACE),

	AHRIMS_HOOD_25(ItemID.AHRIMS_HOOD_25, 2500, ItemID.AHRIMS_HOOD_0),
	AHRIMS_HOOD_50(ItemID.AHRIMS_HOOD_50, 5000, ItemID.AHRIMS_HOOD_0),
	AHRIMS_HOOD_75(ItemID.AHRIMS_HOOD_75, 7500, ItemID.AHRIMS_HOOD_0),
	AHRIMS_HOOD_100(ItemID.AHRIMS_HOOD_100, 10000, ItemID.AHRIMS_HOOD_0),
	AHRIMS_ROBETOP_25(ItemID.AHRIMS_ROBETOP_25, 2500, ItemID.AHRIMS_ROBETOP_0),
	AHRIMS_ROBETOP_50(ItemID.AHRIMS_ROBETOP_50, 5000, ItemID.AHRIMS_ROBETOP_0),
	AHRIMS_ROBETOP_75(ItemID.AHRIMS_ROBETOP_75, 7500, ItemID.AHRIMS_ROBETOP_0),
	AHRIMS_ROBETOP_100(ItemID.AHRIMS_ROBETOP_100, 10000, ItemID.AHRIMS_ROBETOP_0),
	AHRIMS_ROBESKIRT_25(ItemID.AHRIMS_ROBESKIRT_25, 2500, ItemID.AHRIMS_ROBESKIRT_0),
	AHRIMS_ROBESKIRT_50(ItemID.AHRIMS_ROBESKIRT_50, 5000, ItemID.AHRIMS_ROBESKIRT_0),
	AHRIMS_ROBESKIRT_75(ItemID.AHRIMS_ROBESKIRT_75, 7500, ItemID.AHRIMS_ROBESKIRT_0),
	AHRIMS_ROBESKIRT_100(ItemID.AHRIMS_ROBESKIRT_100, 10000, ItemID.AHRIMS_ROBESKIRT_0),
	AHRIMS_STAFF_25(ItemID.AHRIMS_STAFF_25, 2500, ItemID.AHRIMS_STAFF_0),
	AHRIMS_STAFF_50(ItemID.AHRIMS_STAFF_50, 5000, ItemID.AHRIMS_STAFF_0),
	AHRIMS_STAFF_75(ItemID.AHRIMS_STAFF_75, 7500, ItemID.AHRIMS_STAFF_0),
	AHRIMS_STAFF_100(ItemID.AHRIMS_STAFF_100, 10000, ItemID.AHRIMS_STAFF_0),

	KARILS_COIF_25(ItemID.KARILS_COIF_25, 2500, ItemID.KARILS_COIF_0),
	KARILS_COIF_50(ItemID.KARILS_COIF_50, 5000, ItemID.KARILS_COIF_0),
	KARILS_COIF_75(ItemID.KARILS_COIF_75, 7500, ItemID.KARILS_COIF_0),
	KARILS_COIF_100(ItemID.KARILS_COIF_100, 10000, ItemID.KARILS_COIF_0),
	KARILS_LEATHERTOP_25(ItemID.KARILS_LEATHERTOP_25, 2500, ItemID.KARILS_LEATHERTOP_0),
	KARILS_LEATHERTOP_50(ItemID.KARILS_LEATHERTOP_50, 5000, ItemID.KARILS_LEATHERTOP_0),
	KARILS_LEATHERTOP_75(ItemID.KARILS_LEATHERTOP_75, 7500, ItemID.KARILS_LEATHERTOP_0),
	KARILS_LEATHERTOP_100(ItemID.KARILS_LEATHERTOP_100, 10000, ItemID.KARILS_LEATHERTOP_0),
	KARILS_LEATHERSKIRT_25(ItemID.KARILS_LEATHERSKIRT_25, 2500, ItemID.KARILS_LEATHERSKIRT_0),
	KARILS_LEATHERSKIRT_50(ItemID.KARILS_LEATHERSKIRT_50, 5000, ItemID.KARILS_LEATHERSKIRT_0),
	KARILS_LEATHERSKIRT_75(ItemID.KARILS_LEATHERSKIRT_75, 7500, ItemID.KARILS_LEATHERSKIRT_0),
	KARILS_LEATHERSKIRT_100(ItemID.KARILS_LEATHERSKIRT_100, 10000, ItemID.KARILS_LEATHERSKIRT_0),
	KARILS_CROSSBOW_25(ItemID.KARILS_CROSSBOW_25, 2500, ItemID.KARILS_CROSSBOW_0),
	KARILS_CROSSBOW_50(ItemID.KARILS_CROSSBOW_50, 5000, ItemID.KARILS_CROSSBOW_0),
	KARILS_CROSSBOW_75(ItemID.KARILS_CROSSBOW_75, 7500, ItemID.KARILS_CROSSBOW_0),
	KARILS_CROSSBOW_100(ItemID.KARILS_CROSSBOW_100, 10000, ItemID.KARILS_CROSSBOW_0),

	DHAROKS_HELM_25(ItemID.DHAROKS_HELM_25, 2500, ItemID.DHAROKS_HELM_0),
	DHAROKS_HELM_50(ItemID.DHAROKS_HELM_50, 5000, ItemID.DHAROKS_HELM_0),
	DHAROKS_HELM_75(ItemID.DHAROKS_HELM_75, 7500, ItemID.DHAROKS_HELM_0),
	DHAROKS_HELM_100(ItemID.DHAROKS_HELM_100, 10000, ItemID.DHAROKS_HELM_0),
	DHAROKS_PLATEBODY_25(ItemID.DHAROKS_PLATEBODY_25, 2500, ItemID.DHAROKS_PLATEBODY_0),
	DHAROKS_PLATEBODY_50(ItemID.DHAROKS_PLATEBODY_50, 5000, ItemID.DHAROKS_PLATEBODY_0),
	DHAROKS_PLATEBODY_75(ItemID.DHAROKS_PLATEBODY_75, 7500, ItemID.DHAROKS_PLATEBODY_0),
	DHAROKS_PLATEBODY_100(ItemID.DHAROKS_PLATEBODY_100, 10000, ItemID.DHAROKS_PLATEBODY_0),
	DHAROKS_PLATELEGS_25(ItemID.DHAROKS_PLATELEGS_25, 2500, ItemID.DHAROKS_PLATELEGS_0),
	DHAROKS_PLATELEGS_50(ItemID.DHAROKS_PLATELEGS_50, 5000, ItemID.DHAROKS_PLATELEGS_0),
	DHAROKS_PLATELEGS_75(ItemID.DHAROKS_PLATELEGS_75, 7500, ItemID.DHAROKS_PLATELEGS_0),
	DHAROKS_PLATELEGS_100(ItemID.DHAROKS_PLATELEGS_100, 10000, ItemID.DHAROKS_PLATELEGS_0),
	DHAROKS_GREATAXE_25(ItemID.DHAROKS_GREATAXE_25, 2500, ItemID.DHAROKS_GREATAXE_0),
	DHAROKS_GREATAXE_50(ItemID.DHAROKS_GREATAXE_50, 5000, ItemID.DHAROKS_GREATAXE_0),
	DHAROKS_GREATAXE_75(ItemID.DHAROKS_GREATAXE_75, 7500, ItemID.DHAROKS_GREATAXE_0),
	DHAROKS_GREATAXE_100(ItemID.DHAROKS_GREATAXE_100, 10000, ItemID.DHAROKS_GREATAXE_0),

	GUTHANS_HELM_25(ItemID.GUTHANS_HELM_25, 2500, ItemID.GUTHANS_HELM_0),
	GUTHANS_HELM_50(ItemID.GUTHANS_HELM_50, 5000, ItemID.GUTHANS_HELM_0),
	GUTHANS_HELM_75(ItemID.GUTHANS_HELM_75, 7500, ItemID.GUTHANS_HELM_0),
	GUTHANS_HELM_100(ItemID.GUTHANS_HELM_100, 10000, ItemID.GUTHANS_HELM_0),
	GUTHANS_PLATEBODY_25(ItemID.GUTHANS_PLATEBODY_25, 2500, ItemID.GUTHANS_PLATEBODY_0),
	GUTHANS_PLATEBODY_50(ItemID.GUTHANS_PLATEBODY_50, 5000, ItemID.GUTHANS_PLATEBODY_0),
	GUTHANS_PLATEBODY_75(ItemID.GUTHANS_PLATEBODY_75, 7500, ItemID.GUTHANS_PLATEBODY_0),
	GUTHANS_PLATEBODY_100(ItemID.GUTHANS_PLATEBODY_100, 10000, ItemID.GUTHANS_PLATEBODY_0),
	GUTHANS_CHAINSKIRT_25(ItemID.GUTHANS_CHAINSKIRT_25, 2500, ItemID.GUTHANS_CHAINSKIRT_0),
	GUTHANS_CHAINSKIRT_50(ItemID.GUTHANS_CHAINSKIRT_50, 5000, ItemID.GUTHANS_CHAINSKIRT_0),
	GUTHANS_CHAINSKIRT_75(ItemID.GUTHANS_CHAINSKIRT_75, 7500, ItemID.GUTHANS_CHAINSKIRT_0),
	GUTHANS_CHAINSKIRT_100(ItemID.GUTHANS_CHAINSKIRT_100, 10000, ItemID.GUTHANS_CHAINSKIRT_0),
	GUTHANS_WARSPEAR_25(ItemID.GUTHANS_WARSPEAR_25, 2500, ItemID.GUTHANS_WARSPEAR_0),
	GUTHANS_WARSPEAR_50(ItemID.GUTHANS_WARSPEAR_50, 5000, ItemID.GUTHANS_WARSPEAR_0),
	GUTHANS_WARSPEAR_75(ItemID.GUTHANS_WARSPEAR_75, 7500, ItemID.GUTHANS_WARSPEAR_0),
	GUTHANS_WARSPEAR_100(ItemID.GUTHANS_WARSPEAR_100, 10000, ItemID.GUTHANS_WARSPEAR_0),

	TORAGS_HELM_25(ItemID.TORAGS_HELM_25, 2500, ItemID.TORAGS_HELM_0),
	TORAGS_HELM_50(ItemID.TORAGS_HELM_50, 5000, ItemID.TORAGS_HELM_0),
	TORAGS_HELM_75(ItemID.TORAGS_HELM_75, 7500, ItemID.TORAGS_HELM_0),
	TORAGS_HELM_100(ItemID.TORAGS_HELM_100, 10000, ItemID.TORAGS_HELM_0),
	TORAGS_PLATEBODY_25(ItemID.TORAGS_PLATEBODY_25, 2500, ItemID.TORAGS_PLATEBODY_0),
	TORAGS_PLATEBODY_50(ItemID.TORAGS_PLATEBODY_50, 5000, ItemID.TORAGS_PLATEBODY_0),
	TORAGS_PLATEBODY_75(ItemID.TORAGS_PLATEBODY_75, 7500, ItemID.TORAGS_PLATEBODY_0),
	TORAGS_PLATEBODY_100(ItemID.TORAGS_PLATEBODY_100, 10000, ItemID.TORAGS_PLATEBODY_0),
	TORAGS_PLATELEGS_25(ItemID.TORAGS_PLATELEGS_25, 2500, ItemID.TORAGS_PLATELEGS_0),
	TORAGS_PLATELEGS_50(ItemID.TORAGS_PLATELEGS_50, 5000, ItemID.TORAGS_PLATELEGS_0),
	TORAGS_PLATELEGS_75(ItemID.TORAGS_PLATELEGS_75, 7500, ItemID.TORAGS_PLATELEGS_0),
	TORAGS_PLATELEGS_100(ItemID.TORAGS_PLATELEGS_100, 10000, ItemID.TORAGS_PLATELEGS_0),
	TORAGS_HAMMERS_25(ItemID.TORAGS_HAMMERS_25, 2500, ItemID.TORAGS_HAMMERS_0),
	TORAGS_HAMMERS_50(ItemID.TORAGS_HAMMERS_50, 5000, ItemID.TORAGS_HAMMERS_0),
	TORAGS_HAMMERS_75(ItemID.TORAGS_HAMMERS_75, 7500, ItemID.TORAGS_HAMMERS_0),
	TORAGS_HAMMERS_100(ItemID.TORAGS_HAMMERS_100, 10000, ItemID.TORAGS_HAMMERS_0),

	VERACS_HELM_25(ItemID.VERACS_HELM_25, 2500, ItemID.VERACS_HELM_0),
	VERACS_HELM_50(ItemID.VERACS_HELM_50, 5000, ItemID.VERACS_HELM_0),
	VERACS_HELM_75(ItemID.VERACS_HELM_75, 7500, ItemID.VERACS_HELM_0),
	VERACS_HELM_100(ItemID.VERACS_HELM_100, 10000, ItemID.VERACS_HELM_0),
	VERACS_BRASSARD_25(ItemID.VERACS_BRASSARD_25, 2500, ItemID.VERACS_BRASSARD_0),
	VERACS_BRASSARD_50(ItemID.VERACS_BRASSARD_50, 5000, ItemID.VERACS_BRASSARD_0),
	VERACS_BRASSARD_75(ItemID.VERACS_BRASSARD_75, 7500, ItemID.VERACS_BRASSARD_0),
	VERACS_BRASSARD_100(ItemID.VERACS_BRASSARD_100, 10000, ItemID.VERACS_BRASSARD_0),
	VERACS_PLATESKIRT_25(ItemID.VERACS_PLATESKIRT_25, 2500, ItemID.VERACS_PLATESKIRT_0),
	VERACS_PLATESKIRT_50(ItemID.VERACS_PLATESKIRT_50, 5000, ItemID.VERACS_PLATESKIRT_0),
	VERACS_PLATESKIRT_75(ItemID.VERACS_PLATESKIRT_75, 7500, ItemID.VERACS_PLATESKIRT_0),
	VERACS_PLATESKIRT_100(ItemID.VERACS_PLATESKIRT_100, 10000, ItemID.VERACS_PLATESKIRT_0),
	VERACS_FLAIL_25(ItemID.VERACS_FLAIL_25, 2500, ItemID.VERACS_FLAIL_0),
	VERACS_FLAIL_50(ItemID.VERACS_FLAIL_50, 5000, ItemID.VERACS_FLAIL_0),
	VERACS_FLAIL_75(ItemID.VERACS_FLAIL_75, 7500, ItemID.VERACS_FLAIL_0),
	VERACS_FLAIL_100(ItemID.VERACS_FLAIL_100, 10000, ItemID.VERACS_FLAIL_0),

	AVERNIC_DEFENDER(ItemID.AVERNIC_DEFENDER, 4040000),

	ETERNAL_TELEPORT_CRYSTAL(ItemID.ETERNAL_TELEPORT_CRYSTAL, 78500),
	;

	private final int itemId;
	private final int offset;
	private final int baseId;

	private static final Map<Integer, FixedPriceItem> FIXED_ITEMS;

	static
	{
		final ImmutableMap.Builder<Integer, FixedPriceItem> map = ImmutableMap.builder();
		for (final FixedPriceItem p : values())
		{
			map.put(p.itemId, p);
		}
		FIXED_ITEMS = map.build();
	}

	FixedPriceItem(final int itemId, final int offset, final int baseId)
	{
		this.itemId = itemId;
		this.offset = offset;
		this.baseId = baseId;
	}

	FixedPriceItem(final int itemId, final int offset)
	{
		this(itemId, offset, -1);
	}

	@Nullable
	static FixedPriceItem find(int itemId)
	{
		return FIXED_ITEMS.get(itemId);
	}
}
