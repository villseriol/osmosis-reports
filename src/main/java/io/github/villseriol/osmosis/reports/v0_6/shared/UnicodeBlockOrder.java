// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.shared;

import java.lang.Character.UnicodeBlock;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


/**
 * Orders {@link UnicodeBlock} values by the first code point they cover.
 */
public final class UnicodeBlockOrder {
    /**
     * Maps every block to the first code point that belongs to it.
     */
    private static final Map<UnicodeBlock, Integer> STARTS = starts();

    /**
     * Compares blocks by their start code point, unknown blocks sorting last.
     */
    private static final Comparator<UnicodeBlock> BY_START = Comparator
            .comparingInt(block -> STARTS.getOrDefault(block, Integer.MAX_VALUE));

    private UnicodeBlockOrder() {
        super();
    }


    private static Map<UnicodeBlock, Integer> starts() {
        Map<UnicodeBlock, Integer> starts = new HashMap<>();

        for (int codePoint = Character.MIN_CODE_POINT; codePoint <= Character.MAX_CODE_POINT; codePoint++) {
            UnicodeBlock block = UnicodeBlock.of(codePoint);

            if (block != null) {
                starts.putIfAbsent(block, codePoint);
            }
        }

        return starts;
    }


    public static Comparator<UnicodeBlock> byStart() {
        return BY_START;
    }


    public static <T> Comparator<Map.Entry<UnicodeBlock, T>> byEntryStart() {
        return Map.Entry.comparingByKey(BY_START);
    }
}
