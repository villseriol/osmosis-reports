// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.config;

import java.lang.Character.UnicodeBlock;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Represents a Unicode block (character range), as defined by the Unicode
 * Character Database "Blocks.txt".
 *
 * Each constant is defined as NAME(alias, block), where block is the
 * {@link UnicodeBlock} the range delegates its membership tests to.
 */
public enum UnicodeRange {
    /**
     * Basic Latin.
     *
     * https://www.unicodepedia.com/groups/basic-latin/
     */
    BASIC_LATIN("basic-latin", UnicodeBlock.BASIC_LATIN),
    /**
     * Latin-1 Supplement.
     *
     * https://www.unicodepedia.com/groups/latin-1-supplement/
     */
    LATIN_1_SUPPLEMENT("latin-1-supplement", UnicodeBlock.LATIN_1_SUPPLEMENT),
    /**
     * Latin Extended-A.
     *
     * https://www.unicodepedia.com/groups/latin-extended-a/
     */
    LATIN_EXTENDED_A("latin-extended-a", UnicodeBlock.LATIN_EXTENDED_A),
    /**
     * Latin Extended-B.
     *
     * https://www.unicodepedia.com/groups/latin-extended-b/
     */
    LATIN_EXTENDED_B("latin-extended-b", UnicodeBlock.LATIN_EXTENDED_B),
    /**
     * IPA Extensions.
     *
     * https://www.unicodepedia.com/groups/ipa-extensions/
     */
    IPA_EXTENSIONS("ipa-extensions", UnicodeBlock.IPA_EXTENSIONS),
    /**
     * Spacing Modifier Letters.
     *
     * https://www.unicodepedia.com/groups/spacing-modifier-letters/
     */
    SPACING_MODIFIER_LETTERS("spacing-modifier-letters", UnicodeBlock.SPACING_MODIFIER_LETTERS),
    /**
     * Combining Diacritical Marks.
     *
     * https://www.unicodepedia.com/groups/combining-diacritical-marks/
     */
    COMBINING_DIACRITICAL_MARKS("combining-diacritical-marks", UnicodeBlock.COMBINING_DIACRITICAL_MARKS),
    /**
     * Greek and Coptic.
     *
     * https://www.unicodepedia.com/groups/greek-and-coptic/
     */
    GREEK_AND_COPTIC("greek-and-coptic", UnicodeBlock.GREEK),
    /**
     * Cyrillic.
     *
     * https://www.unicodepedia.com/groups/cyrillic/
     */
    CYRILLIC("cyrillic", UnicodeBlock.CYRILLIC),
    /**
     * Cyrillic Supplement.
     *
     * https://www.unicodepedia.com/groups/cyrillic-supplement/
     */
    CYRILLIC_SUPPLEMENT("cyrillic-supplement", UnicodeBlock.CYRILLIC_SUPPLEMENTARY),
    /**
     * Armenian.
     *
     * https://www.unicodepedia.com/groups/armenian/
     */
    ARMENIAN("armenian", UnicodeBlock.ARMENIAN),
    /**
     * Hebrew.
     *
     * https://www.unicodepedia.com/groups/hebrew/
     */
    HEBREW("hebrew", UnicodeBlock.HEBREW),
    /**
     * Arabic.
     *
     * https://www.unicodepedia.com/groups/arabic/
     */
    ARABIC("arabic", UnicodeBlock.ARABIC),
    /**
     * Syriac.
     *
     * https://www.unicodepedia.com/groups/syriac/
     */
    SYRIAC("syriac", UnicodeBlock.SYRIAC),
    /**
     * Arabic Supplement.
     *
     * https://www.unicodepedia.com/groups/arabic-supplement/
     */
    ARABIC_SUPPLEMENT("arabic-supplement", UnicodeBlock.ARABIC_SUPPLEMENT),
    /**
     * Thaana.
     *
     * https://www.unicodepedia.com/groups/thaana/
     */
    THAANA("thaana", UnicodeBlock.THAANA),
    /**
     * NKo.
     *
     * https://www.unicodepedia.com/groups/nko/
     */
    NKO("nko", UnicodeBlock.NKO),
    /**
     * Samaritan.
     *
     * https://www.unicodepedia.com/groups/samaritan/
     */
    SAMARITAN("samaritan", UnicodeBlock.SAMARITAN),
    /**
     * Mandaic.
     *
     * https://www.unicodepedia.com/groups/mandaic/
     */
    MANDAIC("mandaic", UnicodeBlock.MANDAIC),
    /**
     * Devanagari.
     *
     * https://www.unicodepedia.com/groups/devanagari/
     */
    DEVANAGARI("devanagari", UnicodeBlock.DEVANAGARI),
    /**
     * Bengali.
     *
     * https://www.unicodepedia.com/groups/bengali/
     */
    BENGALI("bengali", UnicodeBlock.BENGALI),
    /**
     * Gurmukhi.
     *
     * https://www.unicodepedia.com/groups/gurmukhi/
     */
    GURMUKHI("gurmukhi", UnicodeBlock.GURMUKHI),
    /**
     * Gujarati.
     *
     * https://www.unicodepedia.com/groups/gujarati/
     */
    GUJARATI("gujarati", UnicodeBlock.GUJARATI),
    /**
     * Oriya.
     *
     * https://www.unicodepedia.com/groups/oriya/
     */
    ORIYA("oriya", UnicodeBlock.ORIYA),
    /**
     * Tamil.
     *
     * https://www.unicodepedia.com/groups/tamil/
     */
    TAMIL("tamil", UnicodeBlock.TAMIL),
    /**
     * Telugu.
     *
     * https://www.unicodepedia.com/groups/telugu/
     */
    TELUGU("telugu", UnicodeBlock.TELUGU),
    /**
     * Kannada.
     *
     * https://www.unicodepedia.com/groups/kannada/
     */
    KANNADA("kannada", UnicodeBlock.KANNADA),
    /**
     * Malayalam.
     *
     * https://www.unicodepedia.com/groups/malayalam/
     */
    MALAYALAM("malayalam", UnicodeBlock.MALAYALAM),
    /**
     * Sinhala.
     *
     * https://www.unicodepedia.com/groups/sinhala/
     */
    SINHALA("sinhala", UnicodeBlock.SINHALA),
    /**
     * Thai.
     *
     * https://www.unicodepedia.com/groups/thai/
     */
    THAI("thai", UnicodeBlock.THAI),
    /**
     * Lao.
     *
     * https://www.unicodepedia.com/groups/lao/
     */
    LAO("lao", UnicodeBlock.LAO),
    /**
     * Tibetan.
     *
     * https://www.unicodepedia.com/groups/tibetan/
     */
    TIBETAN("tibetan", UnicodeBlock.TIBETAN),
    /**
     * Myanmar.
     *
     * https://www.unicodepedia.com/groups/myanmar/
     */
    MYANMAR("myanmar", UnicodeBlock.MYANMAR),
    /**
     * Georgian.
     *
     * https://www.unicodepedia.com/groups/georgian/
     */
    GEORGIAN("georgian", UnicodeBlock.GEORGIAN),
    /**
     * Hangul Jamo.
     *
     * https://www.unicodepedia.com/groups/hangul-jamo/
     */
    HANGUL_JAMO("hangul-jamo", UnicodeBlock.HANGUL_JAMO),
    /**
     * Ethiopic.
     *
     * https://www.unicodepedia.com/groups/ethiopic/
     */
    ETHIOPIC("ethiopic", UnicodeBlock.ETHIOPIC),
    /**
     * Ethiopic Supplement.
     *
     * https://www.unicodepedia.com/groups/ethiopic-supplement/
     */
    ETHIOPIC_SUPPLEMENT("ethiopic-supplement", UnicodeBlock.ETHIOPIC_SUPPLEMENT),
    /**
     * Cherokee.
     *
     * https://www.unicodepedia.com/groups/cherokee/
     */
    CHEROKEE("cherokee", UnicodeBlock.CHEROKEE),
    /**
     * Unified Canadian Aboriginal Syllabics.
     *
     * https://www.unicodepedia.com/groups/unified-canadian-aboriginal-syllabics/
     */
    UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS("canadian-aborig-syllabics",
            UnicodeBlock.UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS),
    /**
     * Ogham.
     *
     * https://www.unicodepedia.com/groups/ogham/
     */
    OGHAM("ogham", UnicodeBlock.OGHAM),
    /**
     * Runic.
     *
     * https://www.unicodepedia.com/groups/runic/
     */
    RUNIC("runic", UnicodeBlock.RUNIC),
    /**
     * Tagalog.
     *
     * https://www.unicodepedia.com/groups/tagalog/
     */
    TAGALOG("tagalog", UnicodeBlock.TAGALOG),
    /**
     * Hanunoo.
     *
     * https://www.unicodepedia.com/groups/hanunoo/
     */
    HANUNOO("hanunoo", UnicodeBlock.HANUNOO),
    /**
     * Buhid.
     *
     * https://www.unicodepedia.com/groups/buhid/
     */
    BUHID("buhid", UnicodeBlock.BUHID),
    /**
     * Tagbanwa.
     *
     * https://www.unicodepedia.com/groups/tagbanwa/
     */
    TAGBANWA("tagbanwa", UnicodeBlock.TAGBANWA),
    /**
     * Khmer.
     *
     * https://www.unicodepedia.com/groups/khmer/
     */
    KHMER("khmer", UnicodeBlock.KHMER),
    /**
     * Mongolian.
     *
     * https://www.unicodepedia.com/groups/mongolian/
     */
    MONGOLIAN("mongolian", UnicodeBlock.MONGOLIAN),
    /**
     * Unified Canadian Aboriginal Syllabics Extended.
     *
     * https://www.unicodepedia.com/groups/unified-canadian-aboriginal-syllabics-extended/
     */
    UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED("canadian-aborig-syllabics-ext",
            UnicodeBlock.UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED),
    /**
     * Limbu.
     *
     * https://www.unicodepedia.com/groups/limbu/
     */
    LIMBU("limbu", UnicodeBlock.LIMBU),
    /**
     * Tai Le.
     *
     * https://www.unicodepedia.com/groups/tai-le/
     */
    TAI_LE("tai-le", UnicodeBlock.TAI_LE),
    /**
     * New Tai Lue.
     *
     * https://www.unicodepedia.com/groups/new-tai-lue/
     */
    NEW_TAI_LUE("new-tai-lue", UnicodeBlock.NEW_TAI_LUE),
    /**
     * Khmer Symbols.
     *
     * https://www.unicodepedia.com/groups/khmer-symbols/
     */
    KHMER_SYMBOLS("khmer-symbols", UnicodeBlock.KHMER_SYMBOLS),
    /**
     * Buginese.
     *
     * https://www.unicodepedia.com/groups/buginese/
     */
    BUGINESE("buginese", UnicodeBlock.BUGINESE),
    /**
     * Tai Tham.
     *
     * https://www.unicodepedia.com/groups/tai-tham/
     */
    TAI_THAM("tai-tham", UnicodeBlock.TAI_THAM),
    /**
     * Balinese.
     *
     * https://www.unicodepedia.com/groups/balinese/
     */
    BALINESE("balinese", UnicodeBlock.BALINESE),
    /**
     * Sundanese.
     *
     * https://www.unicodepedia.com/groups/sundanese/
     */
    SUNDANESE("sundanese", UnicodeBlock.SUNDANESE),
    /**
     * Batak.
     *
     * https://www.unicodepedia.com/groups/batak/
     */
    BATAK("batak", UnicodeBlock.BATAK),
    /**
     * Lepcha.
     *
     * https://www.unicodepedia.com/groups/lepcha/
     */
    LEPCHA("lepcha", UnicodeBlock.LEPCHA),
    /**
     * Ol Chiki.
     *
     * https://www.unicodepedia.com/groups/ol-chiki/
     */
    OL_CHIKI("ol-chiki", UnicodeBlock.OL_CHIKI),
    /**
     * Vedic Extensions.
     *
     * https://www.unicodepedia.com/groups/vedic-extensions/
     */
    VEDIC_EXTENSIONS("vedic-extensions", UnicodeBlock.VEDIC_EXTENSIONS),
    /**
     * Phonetic Extensions.
     *
     * https://www.unicodepedia.com/groups/phonetic-extensions/
     */
    PHONETIC_EXTENSIONS("phonetic-extensions", UnicodeBlock.PHONETIC_EXTENSIONS),
    /**
     * Phonetic Extensions Supplement.
     *
     * https://www.unicodepedia.com/groups/phonetic-extensions-supplement/
     */
    PHONETIC_EXTENSIONS_SUPPLEMENT("phonetic-extensions-supplement", UnicodeBlock.PHONETIC_EXTENSIONS_SUPPLEMENT),
    /**
     * Combining Diacritical Marks Supplement.
     *
     * https://www.unicodepedia.com/groups/combining-diacritical-marks-supplement/
     */
    COMBINING_DIACRITICAL_MARKS_SUPPLEMENT("combining-diacritical-marks-sup",
            UnicodeBlock.COMBINING_DIACRITICAL_MARKS_SUPPLEMENT),
    /**
     * Latin Extended Additional.
     *
     * https://www.unicodepedia.com/groups/latin-extended-additional/
     */
    LATIN_EXTENDED_ADDITIONAL("latin-extended-additional", UnicodeBlock.LATIN_EXTENDED_ADDITIONAL),
    /**
     * Greek Extended.
     *
     * https://www.unicodepedia.com/groups/greek-extended/
     */
    GREEK_EXTENDED("greek-extended", UnicodeBlock.GREEK_EXTENDED),
    /**
     * General Punctuation.
     *
     * https://www.unicodepedia.com/groups/general-punctuation/
     */
    GENERAL_PUNCTUATION("general-punctuation", UnicodeBlock.GENERAL_PUNCTUATION),
    /**
     * Superscripts and Subscripts.
     *
     * https://www.unicodepedia.com/groups/superscripts-and-subscripts/
     */
    SUPERSCRIPTS_AND_SUBSCRIPTS("superscripts-and-subscripts", UnicodeBlock.SUPERSCRIPTS_AND_SUBSCRIPTS),
    /**
     * Currency Symbols.
     *
     * https://www.unicodepedia.com/groups/currency-symbols/
     */
    CURRENCY_SYMBOLS("currency-symbols", UnicodeBlock.CURRENCY_SYMBOLS),
    /**
     * Combining Diacritical Marks for Symbols.
     *
     * https://www.unicodepedia.com/groups/combining-diacritical-marks-for-symbols/
     */
    COMBINING_DIACRITICAL_MARKS_FOR_SYMBOLS("combining-diacritical-marks-sym",
            UnicodeBlock.COMBINING_MARKS_FOR_SYMBOLS),
    /**
     * Letterlike Symbols.
     *
     * https://www.unicodepedia.com/groups/letterlike-symbols/
     */
    LETTERLIKE_SYMBOLS("letterlike-symbols", UnicodeBlock.LETTERLIKE_SYMBOLS),
    /**
     * Number Forms.
     *
     * https://www.unicodepedia.com/groups/number-forms/
     */
    NUMBER_FORMS("number-forms", UnicodeBlock.NUMBER_FORMS),
    /**
     * Arrows.
     *
     * https://www.unicodepedia.com/groups/arrows/
     */
    ARROWS("arrows", UnicodeBlock.ARROWS),
    /**
     * Mathematical Operators.
     *
     * https://www.unicodepedia.com/groups/mathematical-operators/
     */
    MATHEMATICAL_OPERATORS("mathematical-operators", UnicodeBlock.MATHEMATICAL_OPERATORS),
    /**
     * Miscellaneous Technical.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-technical/
     */
    MISCELLANEOUS_TECHNICAL("miscellaneous-technical", UnicodeBlock.MISCELLANEOUS_TECHNICAL),
    /**
     * Control Pictures.
     *
     * https://www.unicodepedia.com/groups/control-pictures/
     */
    CONTROL_PICTURES("control-pictures", UnicodeBlock.CONTROL_PICTURES),
    /**
     * Optical Character Recognition.
     *
     * https://www.unicodepedia.com/groups/optical-character-recognition/
     */
    OPTICAL_CHARACTER_RECOGNITION("optical-character-recognition", UnicodeBlock.OPTICAL_CHARACTER_RECOGNITION),
    /**
     * Enclosed Alphanumerics.
     *
     * https://www.unicodepedia.com/groups/enclosed-alphanumerics/
     */
    ENCLOSED_ALPHANUMERICS("enclosed-alphanumerics", UnicodeBlock.ENCLOSED_ALPHANUMERICS),
    /**
     * Box Drawing.
     *
     * https://www.unicodepedia.com/groups/box-drawing/
     */
    BOX_DRAWING("box-drawing", UnicodeBlock.BOX_DRAWING),
    /**
     * Block Elements.
     *
     * https://www.unicodepedia.com/groups/block-elements/
     */
    BLOCK_ELEMENTS("block-elements", UnicodeBlock.BLOCK_ELEMENTS),
    /**
     * Geometric Shapes.
     *
     * https://www.unicodepedia.com/groups/geometric-shapes/
     */
    GEOMETRIC_SHAPES("geometric-shapes", UnicodeBlock.GEOMETRIC_SHAPES),
    /**
     * Miscellaneous Symbols.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-symbols/
     */
    MISCELLANEOUS_SYMBOLS("miscellaneous-symbols", UnicodeBlock.MISCELLANEOUS_SYMBOLS),
    /**
     * Dingbats.
     *
     * https://www.unicodepedia.com/groups/dingbats/
     */
    DINGBATS("dingbats", UnicodeBlock.DINGBATS),
    /**
     * Miscellaneous Mathematical Symbols-A.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-mathematical-symbols-a/
     */
    MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A("miscellaneous-math-symbols-a",
            UnicodeBlock.MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A),
    /**
     * Supplemental Arrows-A.
     *
     * https://www.unicodepedia.com/groups/supplemental-arrows-a/
     */
    SUPPLEMENTAL_ARROWS_A("supplemental-arrows-a", UnicodeBlock.SUPPLEMENTAL_ARROWS_A),
    /**
     * Braille Patterns.
     *
     * https://www.unicodepedia.com/groups/braille-patterns/
     */
    BRAILLE_PATTERNS("braille-patterns", UnicodeBlock.BRAILLE_PATTERNS),
    /**
     * Supplemental Arrows-B.
     *
     * https://www.unicodepedia.com/groups/supplemental-arrows-b/
     */
    SUPPLEMENTAL_ARROWS_B("supplemental-arrows-b", UnicodeBlock.SUPPLEMENTAL_ARROWS_B),
    /**
     * Miscellaneous Mathematical Symbols-B.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-mathematical-symbols-b/
     */
    MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B("miscellaneous-math-symbols-b",
            UnicodeBlock.MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B),
    /**
     * Supplemental Mathematical Operators.
     *
     * https://www.unicodepedia.com/groups/supplemental-mathematical-operators/
     */
    SUPPLEMENTAL_MATHEMATICAL_OPERATORS("supplemental-math-operators",
            UnicodeBlock.SUPPLEMENTAL_MATHEMATICAL_OPERATORS),
    /**
     * Miscellaneous Symbols and Arrows.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-symbols-and-arrows/
     */
    MISCELLANEOUS_SYMBOLS_AND_ARROWS("misc-symbols-and-arrows", UnicodeBlock.MISCELLANEOUS_SYMBOLS_AND_ARROWS),
    /**
     * Glagolitic.
     *
     * https://www.unicodepedia.com/groups/glagolitic/
     */
    GLAGOLITIC("glagolitic", UnicodeBlock.GLAGOLITIC),
    /**
     * Latin Extended-C.
     *
     * https://www.unicodepedia.com/groups/latin-extended-c/
     */
    LATIN_EXTENDED_C("latin-extended-c", UnicodeBlock.LATIN_EXTENDED_C),
    /**
     * Coptic.
     *
     * https://www.unicodepedia.com/groups/coptic/
     */
    COPTIC("coptic", UnicodeBlock.COPTIC),
    /**
     * Georgian Supplement.
     *
     * https://www.unicodepedia.com/groups/georgian-supplement/
     */
    GEORGIAN_SUPPLEMENT("georgian-supplement", UnicodeBlock.GEORGIAN_SUPPLEMENT),
    /**
     * Tifinagh.
     *
     * https://www.unicodepedia.com/groups/tifinagh/
     */
    TIFINAGH("tifinagh", UnicodeBlock.TIFINAGH),
    /**
     * Ethiopic Extended.
     *
     * https://www.unicodepedia.com/groups/ethiopic-extended/
     */
    ETHIOPIC_EXTENDED("ethiopic-extended", UnicodeBlock.ETHIOPIC_EXTENDED),
    /**
     * Cyrillic Extended-A.
     *
     * https://www.unicodepedia.com/groups/cyrillic-extended-a/
     */
    CYRILLIC_EXTENDED_A("cyrillic-extended-a", UnicodeBlock.CYRILLIC_EXTENDED_A),
    /**
     * Supplemental Punctuation.
     *
     * https://www.unicodepedia.com/groups/supplemental-punctuation/
     */
    SUPPLEMENTAL_PUNCTUATION("supplemental-punctuation", UnicodeBlock.SUPPLEMENTAL_PUNCTUATION),
    /**
     * CJK Radicals Supplement.
     *
     * https://www.unicodepedia.com/groups/cjk-radicals-supplement/
     */
    CJK_RADICALS_SUPPLEMENT("cjk-radicals-supplement", UnicodeBlock.CJK_RADICALS_SUPPLEMENT),
    /**
     * Kangxi Radicals.
     *
     * https://www.unicodepedia.com/groups/kangxi-radicals/
     */
    KANGXI_RADICALS("kangxi-radicals", UnicodeBlock.KANGXI_RADICALS),
    /**
     * Ideographic Description Characters.
     *
     * https://www.unicodepedia.com/groups/ideographic-description-characters/
     */
    IDEOGRAPHIC_DESCRIPTION_CHARACTERS("ideographic-description-chars",
            UnicodeBlock.IDEOGRAPHIC_DESCRIPTION_CHARACTERS),
    /**
     * CJK Symbols and Punctuation.
     *
     * https://www.unicodepedia.com/groups/cjk-symbols-and-punctuation/
     */
    CJK_SYMBOLS_AND_PUNCTUATION("cjk-symbols-and-punctuation", UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION),
    /**
     * Hiragana.
     *
     * https://www.unicodepedia.com/groups/hiragana/
     */
    HIRAGANA("hiragana", UnicodeBlock.HIRAGANA),
    /**
     * Katakana.
     *
     * https://www.unicodepedia.com/groups/katakana/
     */
    KATAKANA("katakana", UnicodeBlock.KATAKANA),
    /**
     * Bopomofo.
     *
     * https://www.unicodepedia.com/groups/bopomofo/
     */
    BOPOMOFO("bopomofo", UnicodeBlock.BOPOMOFO),
    /**
     * Hangul Compatibility Jamo.
     *
     * https://www.unicodepedia.com/groups/hangul-compatibility-jamo/
     */
    HANGUL_COMPATIBILITY_JAMO("hangul-compatibility-jamo", UnicodeBlock.HANGUL_COMPATIBILITY_JAMO),
    /**
     * Kanbun.
     *
     * https://www.unicodepedia.com/groups/kanbun/
     */
    KANBUN("kanbun", UnicodeBlock.KANBUN),
    /**
     * Bopomofo Extended.
     *
     * https://www.unicodepedia.com/groups/bopomofo-extended/
     */
    BOPOMOFO_EXTENDED("bopomofo-extended", UnicodeBlock.BOPOMOFO_EXTENDED),
    /**
     * CJK Strokes.
     *
     * https://www.unicodepedia.com/groups/cjk-strokes/
     */
    CJK_STROKES("cjk-strokes", UnicodeBlock.CJK_STROKES),
    /**
     * Katakana Phonetic Extensions.
     *
     * https://www.unicodepedia.com/groups/katakana-phonetic-extensions/
     */
    KATAKANA_PHONETIC_EXTENSIONS("katakana-phonetic-extensions", UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS),
    /**
     * Enclosed CJK Letters and Months.
     *
     * https://www.unicodepedia.com/groups/enclosed-cjk-letters-and-months/
     */
    ENCLOSED_CJK_LETTERS_AND_MONTHS("enclosed-cjk-letters-and-months", UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS),
    /**
     * CJK Compatibility.
     *
     * https://www.unicodepedia.com/groups/cjk-compatibility/
     */
    CJK_COMPATIBILITY("cjk-compatibility", UnicodeBlock.CJK_COMPATIBILITY),
    /**
     * CJK Unified Ideographs Extension A.
     *
     * https://www.unicodepedia.com/groups/cjk-unified-ideographs-extension-a/
     */
    CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A("cjk-unified-ideographs-ext-a", UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A),
    /**
     * Yijing Hexagram Symbols.
     *
     * https://www.unicodepedia.com/groups/yijing-hexagram-symbols/
     */
    YIJING_HEXAGRAM_SYMBOLS("yijing-hexagram-symbols", UnicodeBlock.YIJING_HEXAGRAM_SYMBOLS),
    /**
     * CJK Unified Ideographs.
     *
     * https://www.unicodepedia.com/groups/cjk-unified-ideographs/
     */
    CJK_UNIFIED_IDEOGRAPHS("cjk-unified-ideographs", UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS),
    /**
     * Yi Syllables.
     *
     * https://www.unicodepedia.com/groups/yi-syllables/
     */
    YI_SYLLABLES("yi-syllables", UnicodeBlock.YI_SYLLABLES),
    /**
     * Yi Radicals.
     *
     * https://www.unicodepedia.com/groups/yi-radicals/
     */
    YI_RADICALS("yi-radicals", UnicodeBlock.YI_RADICALS),
    /**
     * Lisu.
     *
     * https://www.unicodepedia.com/groups/lisu/
     */
    LISU("lisu", UnicodeBlock.LISU),
    /**
     * Vai.
     *
     * https://www.unicodepedia.com/groups/vai/
     */
    VAI("vai", UnicodeBlock.VAI),
    /**
     * Cyrillic Extended-B.
     *
     * https://www.unicodepedia.com/groups/cyrillic-extended-b/
     */
    CYRILLIC_EXTENDED_B("cyrillic-extended-b", UnicodeBlock.CYRILLIC_EXTENDED_B),
    /**
     * Bamum.
     *
     * https://www.unicodepedia.com/groups/bamum/
     */
    BAMUM("bamum", UnicodeBlock.BAMUM),
    /**
     * Modifier Tone Letters.
     *
     * https://www.unicodepedia.com/groups/modifier-tone-letters/
     */
    MODIFIER_TONE_LETTERS("modifier-tone-letters", UnicodeBlock.MODIFIER_TONE_LETTERS),
    /**
     * Latin Extended-D.
     *
     * https://www.unicodepedia.com/groups/latin-extended-d/
     */
    LATIN_EXTENDED_D("latin-extended-d", UnicodeBlock.LATIN_EXTENDED_D),
    /**
     * Syloti Nagri.
     *
     * https://www.unicodepedia.com/groups/syloti-nagri/
     */
    SYLOTI_NAGRI("syloti-nagri", UnicodeBlock.SYLOTI_NAGRI),
    /**
     * Common Indic Number Forms.
     *
     * https://www.unicodepedia.com/groups/common-indic-number-forms/
     */
    COMMON_INDIC_NUMBER_FORMS("common-indic-number-forms", UnicodeBlock.COMMON_INDIC_NUMBER_FORMS),
    /**
     * Phags-pa.
     *
     * https://www.unicodepedia.com/groups/phags-pa/
     */
    PHAGS_PA("phags-pa", UnicodeBlock.PHAGS_PA),
    /**
     * Saurashtra.
     *
     * https://www.unicodepedia.com/groups/saurashtra/
     */
    SAURASHTRA("saurashtra", UnicodeBlock.SAURASHTRA),
    /**
     * Devanagari Extended.
     *
     * https://www.unicodepedia.com/groups/devanagari-extended/
     */
    DEVANAGARI_EXTENDED("devanagari-extended", UnicodeBlock.DEVANAGARI_EXTENDED),
    /**
     * Kayah Li.
     *
     * https://www.unicodepedia.com/groups/kayah-li/
     */
    KAYAH_LI("kayah-li", UnicodeBlock.KAYAH_LI),
    /**
     * Rejang.
     *
     * https://www.unicodepedia.com/groups/rejang/
     */
    REJANG("rejang", UnicodeBlock.REJANG),
    /**
     * Hangul Jamo Extended-A.
     *
     * https://www.unicodepedia.com/groups/hangul-jamo-extended-a/
     */
    HANGUL_JAMO_EXTENDED_A("hangul-jamo-extended-a", UnicodeBlock.HANGUL_JAMO_EXTENDED_A),
    /**
     * Javanese.
     *
     * https://www.unicodepedia.com/groups/javanese/
     */
    JAVANESE("javanese", UnicodeBlock.JAVANESE),
    /**
     * Cham.
     *
     * https://www.unicodepedia.com/groups/cham/
     */
    CHAM("cham", UnicodeBlock.CHAM),
    /**
     * Myanmar Extended-A.
     *
     * https://www.unicodepedia.com/groups/myanmar-extended-a/
     */
    MYANMAR_EXTENDED_A("myanmar-extended-a", UnicodeBlock.MYANMAR_EXTENDED_A),
    /**
     * Tai Viet.
     *
     * https://www.unicodepedia.com/groups/tai-viet/
     */
    TAI_VIET("tai-viet", UnicodeBlock.TAI_VIET),
    /**
     * Ethiopic Extended-A.
     *
     * https://www.unicodepedia.com/groups/ethiopic-extended-a/
     */
    ETHIOPIC_EXTENDED_A("ethiopic-extended-a", UnicodeBlock.ETHIOPIC_EXTENDED_A),
    /**
     * Meetei Mayek.
     *
     * https://www.unicodepedia.com/groups/meetei-mayek/
     */
    MEETEI_MAYEK("meetei-mayek", UnicodeBlock.MEETEI_MAYEK),
    /**
     * Hangul Syllables.
     *
     * https://www.unicodepedia.com/groups/hangul-syllables/
     */
    HANGUL_SYLLABLES("hangul-syllables", UnicodeBlock.HANGUL_SYLLABLES),
    /**
     * Hangul Jamo Extended-B.
     *
     * https://www.unicodepedia.com/groups/hangul-jamo-extended-b/
     */
    HANGUL_JAMO_EXTENDED_B("hangul-jamo-extended-b", UnicodeBlock.HANGUL_JAMO_EXTENDED_B),
    /**
     * High Surrogates.
     *
     * https://www.unicodepedia.com/groups/high-surrogates/
     */
    HIGH_SURROGATES("high-surrogates", UnicodeBlock.HIGH_SURROGATES),
    /**
     * High Private Use Surrogates.
     *
     * https://www.unicodepedia.com/groups/high-private-use-surrogates/
     */
    HIGH_PRIVATE_USE_SURROGATES("high-private-use-surrogates", UnicodeBlock.HIGH_PRIVATE_USE_SURROGATES),
    /**
     * Low Surrogates.
     *
     * https://www.unicodepedia.com/groups/low-surrogates/
     */
    LOW_SURROGATES("low-surrogates", UnicodeBlock.LOW_SURROGATES),
    /**
     * Private Use Area.
     *
     * https://www.unicodepedia.com/groups/private-use-area/
     */
    PRIVATE_USE_AREA("private-use-area", UnicodeBlock.PRIVATE_USE_AREA),
    /**
     * CJK Compatibility Ideographs.
     *
     * https://www.unicodepedia.com/groups/cjk-compatibility-ideographs/
     */
    CJK_COMPATIBILITY_IDEOGRAPHS("cjk-compatibility-ideographs", UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS),
    /**
     * Alphabetic Presentation Forms.
     *
     * https://www.unicodepedia.com/groups/alphabetic-presentation-forms/
     */
    ALPHABETIC_PRESENTATION_FORMS("alphabetic-presentation-forms", UnicodeBlock.ALPHABETIC_PRESENTATION_FORMS),
    /**
     * Arabic Presentation Forms-A.
     *
     * https://www.unicodepedia.com/groups/arabic-presentation-forms-a/
     */
    ARABIC_PRESENTATION_FORMS_A("arabic-presentation-forms-a", UnicodeBlock.ARABIC_PRESENTATION_FORMS_A),
    /**
     * Variation Selectors.
     *
     * https://www.unicodepedia.com/groups/variation-selectors/
     */
    VARIATION_SELECTORS("variation-selectors", UnicodeBlock.VARIATION_SELECTORS),
    /**
     * Vertical Forms.
     *
     * https://www.unicodepedia.com/groups/vertical-forms/
     */
    VERTICAL_FORMS("vertical-forms", UnicodeBlock.VERTICAL_FORMS),
    /**
     * Combining Half Marks.
     *
     * https://www.unicodepedia.com/groups/combining-half-marks/
     */
    COMBINING_HALF_MARKS("combining-half-marks", UnicodeBlock.COMBINING_HALF_MARKS),
    /**
     * CJK Compatibility Forms.
     *
     * https://www.unicodepedia.com/groups/cjk-compatibility-forms/
     */
    CJK_COMPATIBILITY_FORMS("cjk-compatibility-forms", UnicodeBlock.CJK_COMPATIBILITY_FORMS),
    /**
     * Small Form Variants.
     *
     * https://www.unicodepedia.com/groups/small-form-variants/
     */
    SMALL_FORM_VARIANTS("small-form-variants", UnicodeBlock.SMALL_FORM_VARIANTS),
    /**
     * Arabic Presentation Forms-B.
     *
     * https://www.unicodepedia.com/groups/arabic-presentation-forms-b/
     */
    ARABIC_PRESENTATION_FORMS_B("arabic-presentation-forms-b", UnicodeBlock.ARABIC_PRESENTATION_FORMS_B),
    /**
     * Halfwidth and Fullwidth Forms.
     *
     * https://www.unicodepedia.com/groups/halfwidth-and-fullwidth-forms/
     */
    HALFWIDTH_AND_FULLWIDTH_FORMS("halfwidth-and-fullwidth-forms", UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS),
    /**
     * Specials.
     *
     * https://www.unicodepedia.com/groups/specials/
     */
    SPECIALS("specials", UnicodeBlock.SPECIALS),
    /**
     * Linear B Syllabary.
     *
     * https://www.unicodepedia.com/groups/linear-b-syllabary/
     */
    LINEAR_B_SYLLABARY("linear-b-syllabary", UnicodeBlock.LINEAR_B_SYLLABARY),
    /**
     * Linear B Ideograms.
     *
     * https://www.unicodepedia.com/groups/linear-b-ideograms/
     */
    LINEAR_B_IDEOGRAMS("linear-b-ideograms", UnicodeBlock.LINEAR_B_IDEOGRAMS),
    /**
     * Aegean Numbers.
     *
     * https://www.unicodepedia.com/groups/aegean-numbers/
     */
    AEGEAN_NUMBERS("aegean-numbers", UnicodeBlock.AEGEAN_NUMBERS),
    /**
     * Ancient Greek Numbers.
     *
     * https://www.unicodepedia.com/groups/ancient-greek-numbers/
     */
    ANCIENT_GREEK_NUMBERS("ancient-greek-numbers", UnicodeBlock.ANCIENT_GREEK_NUMBERS),
    /**
     * Ancient Symbols.
     *
     * https://www.unicodepedia.com/groups/ancient-symbols/
     */
    ANCIENT_SYMBOLS("ancient-symbols", UnicodeBlock.ANCIENT_SYMBOLS),
    /**
     * Phaistos Disc.
     *
     * https://www.unicodepedia.com/groups/phaistos-disc/
     */
    PHAISTOS_DISC("phaistos-disc", UnicodeBlock.PHAISTOS_DISC),
    /**
     * Lycian.
     *
     * https://www.unicodepedia.com/groups/lycian/
     */
    LYCIAN("lycian", UnicodeBlock.LYCIAN),
    /**
     * Carian.
     *
     * https://www.unicodepedia.com/groups/carian/
     */
    CARIAN("carian", UnicodeBlock.CARIAN),
    /**
     * Old Italic.
     *
     * https://www.unicodepedia.com/groups/old-italic/
     */
    OLD_ITALIC("old-italic", UnicodeBlock.OLD_ITALIC),
    /**
     * Gothic.
     *
     * https://www.unicodepedia.com/groups/gothic/
     */
    GOTHIC("gothic", UnicodeBlock.GOTHIC),
    /**
     * Ugaritic.
     *
     * https://www.unicodepedia.com/groups/ugaritic/
     */
    UGARITIC("ugaritic", UnicodeBlock.UGARITIC),
    /**
     * Old Persian.
     *
     * https://www.unicodepedia.com/groups/old-persian/
     */
    OLD_PERSIAN("old-persian", UnicodeBlock.OLD_PERSIAN),
    /**
     * Deseret.
     *
     * https://www.unicodepedia.com/groups/deseret/
     */
    DESERET("deseret", UnicodeBlock.DESERET),
    /**
     * Shavian.
     *
     * https://www.unicodepedia.com/groups/shavian/
     */
    SHAVIAN("shavian", UnicodeBlock.SHAVIAN),
    /**
     * Osmanya.
     *
     * https://www.unicodepedia.com/groups/osmanya/
     */
    OSMANYA("osmanya", UnicodeBlock.OSMANYA),
    /**
     * Cypriot Syllabary.
     *
     * https://www.unicodepedia.com/groups/cypriot-syllabary/
     */
    CYPRIOT_SYLLABARY("cypriot-syllabary", UnicodeBlock.CYPRIOT_SYLLABARY),
    /**
     * Imperial Aramaic.
     *
     * https://www.unicodepedia.com/groups/imperial-aramaic/
     */
    IMPERIAL_ARAMAIC("imperial-aramaic", UnicodeBlock.IMPERIAL_ARAMAIC),
    /**
     * Phoenician.
     *
     * https://www.unicodepedia.com/groups/phoenician/
     */
    PHOENICIAN("phoenician", UnicodeBlock.PHOENICIAN),
    /**
     * Lydian.
     *
     * https://www.unicodepedia.com/groups/lydian/
     */
    LYDIAN("lydian", UnicodeBlock.LYDIAN),
    /**
     * Kharoshthi.
     *
     * https://www.unicodepedia.com/groups/kharoshthi/
     */
    KHAROSHTHI("kharoshthi", UnicodeBlock.KHAROSHTHI),
    /**
     * Old South Arabian.
     *
     * https://www.unicodepedia.com/groups/old-south-arabian/
     */
    OLD_SOUTH_ARABIAN("old-south-arabian", UnicodeBlock.OLD_SOUTH_ARABIAN),
    /**
     * Avestan.
     *
     * https://www.unicodepedia.com/groups/avestan/
     */
    AVESTAN("avestan", UnicodeBlock.AVESTAN),
    /**
     * Inscriptional Parthian.
     *
     * https://www.unicodepedia.com/groups/inscriptional-parthian/
     */
    INSCRIPTIONAL_PARTHIAN("inscriptional-parthian", UnicodeBlock.INSCRIPTIONAL_PARTHIAN),
    /**
     * Inscriptional Pahlavi.
     *
     * https://www.unicodepedia.com/groups/inscriptional-pahlavi/
     */
    INSCRIPTIONAL_PAHLAVI("inscriptional-pahlavi", UnicodeBlock.INSCRIPTIONAL_PAHLAVI),
    /**
     * Old Turkic.
     *
     * https://www.unicodepedia.com/groups/old-turkic/
     */
    OLD_TURKIC("old-turkic", UnicodeBlock.OLD_TURKIC),
    /**
     * Rumi Numeral Symbols.
     *
     * https://www.unicodepedia.com/groups/rumi-numeral-symbols/
     */
    RUMI_NUMERAL_SYMBOLS("rumi-numeral-symbols", UnicodeBlock.RUMI_NUMERAL_SYMBOLS),
    /**
     * Brahmi.
     *
     * https://www.unicodepedia.com/groups/brahmi/
     */
    BRAHMI("brahmi", UnicodeBlock.BRAHMI),
    /**
     * Kaithi.
     *
     * https://www.unicodepedia.com/groups/kaithi/
     */
    KAITHI("kaithi", UnicodeBlock.KAITHI),
    /**
     * Cuneiform.
     *
     * https://www.unicodepedia.com/groups/cuneiform/
     */
    CUNEIFORM("cuneiform", UnicodeBlock.CUNEIFORM),
    /**
     * Cuneiform Numbers and Punctuation.
     *
     * https://www.unicodepedia.com/groups/cuneiform-numbers-and-punctuation/
     */
    CUNEIFORM_NUMBERS_AND_PUNCTUATION("cuneiform-numbers-punctuation", UnicodeBlock.CUNEIFORM_NUMBERS_AND_PUNCTUATION),
    /**
     * Egyptian Hieroglyphs.
     *
     * https://www.unicodepedia.com/groups/egyptian-hieroglyphs/
     */
    EGYPTIAN_HIEROGLYPHS("egyptian-hieroglyphs", UnicodeBlock.EGYPTIAN_HIEROGLYPHS),
    /**
     * Bamum Supplement.
     *
     * https://www.unicodepedia.com/groups/bamum-supplement/
     */
    BAMUM_SUPPLEMENT("bamum-supplement", UnicodeBlock.BAMUM_SUPPLEMENT),
    /**
     * Kana Supplement.
     *
     * https://www.unicodepedia.com/groups/kana-supplement/
     */
    KANA_SUPPLEMENT("kana-supplement", UnicodeBlock.KANA_SUPPLEMENT),
    /**
     * Byzantine Musical Symbols.
     *
     * https://www.unicodepedia.com/groups/byzantine-musical-symbols/
     */
    BYZANTINE_MUSICAL_SYMBOLS("byzantine-musical-symbols", UnicodeBlock.BYZANTINE_MUSICAL_SYMBOLS),
    /**
     * Musical Symbols.
     *
     * https://www.unicodepedia.com/groups/musical-symbols/
     */
    MUSICAL_SYMBOLS("musical-symbols", UnicodeBlock.MUSICAL_SYMBOLS),
    /**
     * Ancient Greek Musical Notation.
     *
     * https://www.unicodepedia.com/groups/ancient-greek-musical-notation/
     */
    ANCIENT_GREEK_MUSICAL_NOTATION("ancient-greek-musical-notation", UnicodeBlock.ANCIENT_GREEK_MUSICAL_NOTATION),
    /**
     * Tai Xuan Jing Symbols.
     *
     * https://www.unicodepedia.com/groups/tai-xuan-jing-symbols/
     */
    TAI_XUAN_JING_SYMBOLS("tai-xuan-jing-symbols", UnicodeBlock.TAI_XUAN_JING_SYMBOLS),
    /**
     * Counting Rod Numerals.
     *
     * https://www.unicodepedia.com/groups/counting-rod-numerals/
     */
    COUNTING_ROD_NUMERALS("counting-rod-numerals", UnicodeBlock.COUNTING_ROD_NUMERALS),
    /**
     * Mathematical Alphanumeric Symbols.
     *
     * https://www.unicodepedia.com/groups/mathematical-alphanumeric-symbols/
     */
    MATHEMATICAL_ALPHANUMERIC_SYMBOLS("math-alphanumeric-symbols", UnicodeBlock.MATHEMATICAL_ALPHANUMERIC_SYMBOLS),
    /**
     * Mahjong Tiles.
     *
     * https://www.unicodepedia.com/groups/mahjong-tiles/
     */
    MAHJONG_TILES("mahjong-tiles", UnicodeBlock.MAHJONG_TILES),
    /**
     * Domino Tiles.
     *
     * https://www.unicodepedia.com/groups/domino-tiles/
     */
    DOMINO_TILES("domino-tiles", UnicodeBlock.DOMINO_TILES),
    /**
     * Playing Cards.
     *
     * https://www.unicodepedia.com/groups/playing-cards/
     */
    PLAYING_CARDS("playing-cards", UnicodeBlock.PLAYING_CARDS),
    /**
     * Enclosed Alphanumeric Supplement.
     *
     * https://www.unicodepedia.com/groups/enclosed-alphanumeric-supplement/
     */
    ENCLOSED_ALPHANUMERIC_SUPPLEMENT("enclosed-alphanumeric-supp", UnicodeBlock.ENCLOSED_ALPHANUMERIC_SUPPLEMENT),
    /**
     * Enclosed Ideographic Supplement.
     *
     * https://www.unicodepedia.com/groups/enclosed-ideographic-supplement/
     */
    ENCLOSED_IDEOGRAPHIC_SUPPLEMENT("enclosed-ideographic-supplement", UnicodeBlock.ENCLOSED_IDEOGRAPHIC_SUPPLEMENT),
    /**
     * Miscellaneous Symbols And Pictographs.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-symbols-and-pictographs/
     */
    MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS("misc-symbols-and-pictographs",
            UnicodeBlock.MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS),
    /**
     * Emoticons.
     *
     * https://www.unicodepedia.com/groups/emoticons/
     */
    EMOTICONS("emoticons", UnicodeBlock.EMOTICONS),
    /**
     * Transport And Map Symbols.
     *
     * https://www.unicodepedia.com/groups/transport-and-map-symbols/
     */
    TRANSPORT_AND_MAP_SYMBOLS("transport-and-map-symbols", UnicodeBlock.TRANSPORT_AND_MAP_SYMBOLS),
    /**
     * Alchemical Symbols.
     *
     * https://www.unicodepedia.com/groups/alchemical-symbols/
     */
    ALCHEMICAL_SYMBOLS("alchemical-symbols", UnicodeBlock.ALCHEMICAL_SYMBOLS),
    /**
     * CJK Unified Ideographs Extension B.
     *
     * https://www.unicodepedia.com/groups/cjk-unified-ideographs-extension-b/
     */
    CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B("cjk-unified-ideographs-ext-b", UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B),
    /**
     * CJK Unified Ideographs Extension C.
     *
     * https://www.unicodepedia.com/groups/cjk-unified-ideographs-extension-c/
     */
    CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C("cjk-unified-ideographs-ext-c", UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C),
    /**
     * CJK Unified Ideographs Extension D.
     *
     * https://www.unicodepedia.com/groups/cjk-unified-ideographs-extension-d/
     */
    CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D("cjk-unified-ideographs-ext-d", UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D),
    /**
     * CJK Compatibility Ideographs Supplement.
     *
     * https://www.unicodepedia.com/groups/cjk-compatibility-ideographs-supplement/
     */
    CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT("cjk-compat-ideographs-sup",
            UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT),
    /**
     * Tags.
     *
     * https://www.unicodepedia.com/groups/tags/
     */
    TAGS("tags", UnicodeBlock.TAGS),
    /**
     * Variation Selectors Supplement.
     *
     * https://www.unicodepedia.com/groups/variation-selectors-supplement/
     */
    VARIATION_SELECTORS_SUPPLEMENT("variation-selectors-supplement", UnicodeBlock.VARIATION_SELECTORS_SUPPLEMENT),
    /**
     * Supplementary Private Use Area-A.
     *
     * https://www.unicodepedia.com/groups/supplementary-private-use-area-a/
     */
    SUPPLEMENTARY_PRIVATE_USE_AREA_A("supplementary-private-use-a", UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_A),
    /**
     * Supplementary Private Use Area-B.
     *
     * https://www.unicodepedia.com/groups/supplementary-private-use-area-b/
     */
    SUPPLEMENTARY_PRIVATE_USE_AREA_B("supplementary-private-use-b", UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_B);

    private final String alias;
    private final UnicodeBlock block;

    UnicodeRange(String alias, UnicodeBlock block) {
        this.alias = alias;
        this.block = block;
    }


    @JsonValue
    public String getAlias() {
        return alias;
    }


    public UnicodeBlock getBlock() {
        return block;
    }


    public boolean contains(int codePoint) {
        return block.equals(UnicodeBlock.of(codePoint));
    }


    @JsonCreator
    public static UnicodeRange fromAlias(String alias) {
        for (UnicodeRange value : values()) {
            if (value.alias.equals(alias)) {
                return value;
            }
        }

        throw new IllegalArgumentException("Unknown unicode range: " + alias);
    }


    public static UnicodeRange fromCodePoint(int codePoint) {
        UnicodeBlock block = UnicodeBlock.of(codePoint);

        for (UnicodeRange value : values()) {
            if (value.block.equals(block)) {
                return value;
            }
        }

        throw new IllegalArgumentException("No unicode range for code point: " + codePoint);
    }


    public static UnicodeRange fromCharacter(Character character) {
        return fromCodePoint(character);
    }
}
