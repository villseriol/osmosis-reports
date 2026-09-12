// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.config;

import java.lang.Character.UnicodeBlock;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Represents a Unicode block (character range), as defined by the Unicode
 * Character Database "Blocks.txt".
 *
 * Each constant is defined as NAME(alias, block, lower, upper), where block is
 * the {@link UnicodeBlock} the range delegates its membership tests to, and
 * lower and upper are the inclusive bounds of the code points it covers.
 */
public enum UnicodeRange {
    /**
     * Basic Latin.
     *
     * https://www.unicodepedia.com/groups/basic-latin/
     */
    BASIC_LATIN("basic-latin", UnicodeBlock.BASIC_LATIN, 0x0000, 0x007F),
    /**
     * Latin-1 Supplement.
     *
     * https://www.unicodepedia.com/groups/latin-1-supplement/
     */
    LATIN_1_SUPPLEMENT("latin-1-supplement", UnicodeBlock.LATIN_1_SUPPLEMENT, 0x0080, 0x00FF),
    /**
     * Latin Extended-A.
     *
     * https://www.unicodepedia.com/groups/latin-extended-a/
     */
    LATIN_EXTENDED_A("latin-extended-a", UnicodeBlock.LATIN_EXTENDED_A, 0x0100, 0x017F),
    /**
     * Latin Extended-B.
     *
     * https://www.unicodepedia.com/groups/latin-extended-b/
     */
    LATIN_EXTENDED_B("latin-extended-b", UnicodeBlock.LATIN_EXTENDED_B, 0x0180, 0x024F),
    /**
     * IPA Extensions.
     *
     * https://www.unicodepedia.com/groups/ipa-extensions/
     */
    IPA_EXTENSIONS("ipa-extensions", UnicodeBlock.IPA_EXTENSIONS, 0x0250, 0x02AF),
    /**
     * Spacing Modifier Letters.
     *
     * https://www.unicodepedia.com/groups/spacing-modifier-letters/
     */
    SPACING_MODIFIER_LETTERS("spacing-modifier-letters", UnicodeBlock.SPACING_MODIFIER_LETTERS, 0x02B0, 0x02FF),
    /**
     * Combining Diacritical Marks.
     *
     * https://www.unicodepedia.com/groups/combining-diacritical-marks/
     */
    COMBINING_DIACRITICAL_MARKS("combining-diacritical-marks", UnicodeBlock.COMBINING_DIACRITICAL_MARKS, 0x0300,
            0x036F),
    /**
     * Greek and Coptic.
     *
     * https://www.unicodepedia.com/groups/greek-and-coptic/
     */
    GREEK_AND_COPTIC("greek-and-coptic", UnicodeBlock.GREEK, 0x0370, 0x03FF),
    /**
     * Cyrillic.
     *
     * https://www.unicodepedia.com/groups/cyrillic/
     */
    CYRILLIC("cyrillic", UnicodeBlock.CYRILLIC, 0x0400, 0x04FF),
    /**
     * Cyrillic Supplement.
     *
     * https://www.unicodepedia.com/groups/cyrillic-supplement/
     */
    CYRILLIC_SUPPLEMENT("cyrillic-supplement", UnicodeBlock.CYRILLIC_SUPPLEMENTARY, 0x0500, 0x052F),
    /**
     * Armenian.
     *
     * https://www.unicodepedia.com/groups/armenian/
     */
    ARMENIAN("armenian", UnicodeBlock.ARMENIAN, 0x0530, 0x058F),
    /**
     * Hebrew.
     *
     * https://www.unicodepedia.com/groups/hebrew/
     */
    HEBREW("hebrew", UnicodeBlock.HEBREW, 0x0590, 0x05FF),
    /**
     * Arabic.
     *
     * https://www.unicodepedia.com/groups/arabic/
     */
    ARABIC("arabic", UnicodeBlock.ARABIC, 0x0600, 0x06FF),
    /**
     * Syriac.
     *
     * https://www.unicodepedia.com/groups/syriac/
     */
    SYRIAC("syriac", UnicodeBlock.SYRIAC, 0x0700, 0x074F),
    /**
     * Arabic Supplement.
     *
     * https://www.unicodepedia.com/groups/arabic-supplement/
     */
    ARABIC_SUPPLEMENT("arabic-supplement", UnicodeBlock.ARABIC_SUPPLEMENT, 0x0750, 0x077F),
    /**
     * Thaana.
     *
     * https://www.unicodepedia.com/groups/thaana/
     */
    THAANA("thaana", UnicodeBlock.THAANA, 0x0780, 0x07BF),
    /**
     * NKo.
     *
     * https://www.unicodepedia.com/groups/nko/
     */
    NKO("nko", UnicodeBlock.NKO, 0x07C0, 0x07FF),
    /**
     * Samaritan.
     *
     * https://www.unicodepedia.com/groups/samaritan/
     */
    SAMARITAN("samaritan", UnicodeBlock.SAMARITAN, 0x0800, 0x083F),
    /**
     * Mandaic.
     *
     * https://www.unicodepedia.com/groups/mandaic/
     */
    MANDAIC("mandaic", UnicodeBlock.MANDAIC, 0x0840, 0x085F),
    /**
     * Devanagari.
     *
     * https://www.unicodepedia.com/groups/devanagari/
     */
    DEVANAGARI("devanagari", UnicodeBlock.DEVANAGARI, 0x0900, 0x097F),
    /**
     * Bengali.
     *
     * https://www.unicodepedia.com/groups/bengali/
     */
    BENGALI("bengali", UnicodeBlock.BENGALI, 0x0980, 0x09FF),
    /**
     * Gurmukhi.
     *
     * https://www.unicodepedia.com/groups/gurmukhi/
     */
    GURMUKHI("gurmukhi", UnicodeBlock.GURMUKHI, 0x0A00, 0x0A7F),
    /**
     * Gujarati.
     *
     * https://www.unicodepedia.com/groups/gujarati/
     */
    GUJARATI("gujarati", UnicodeBlock.GUJARATI, 0x0A80, 0x0AFF),
    /**
     * Oriya.
     *
     * https://www.unicodepedia.com/groups/oriya/
     */
    ORIYA("oriya", UnicodeBlock.ORIYA, 0x0B00, 0x0B7F),
    /**
     * Tamil.
     *
     * https://www.unicodepedia.com/groups/tamil/
     */
    TAMIL("tamil", UnicodeBlock.TAMIL, 0x0B80, 0x0BFF),
    /**
     * Telugu.
     *
     * https://www.unicodepedia.com/groups/telugu/
     */
    TELUGU("telugu", UnicodeBlock.TELUGU, 0x0C00, 0x0C7F),
    /**
     * Kannada.
     *
     * https://www.unicodepedia.com/groups/kannada/
     */
    KANNADA("kannada", UnicodeBlock.KANNADA, 0x0C80, 0x0CFF),
    /**
     * Malayalam.
     *
     * https://www.unicodepedia.com/groups/malayalam/
     */
    MALAYALAM("malayalam", UnicodeBlock.MALAYALAM, 0x0D00, 0x0D7F),
    /**
     * Sinhala.
     *
     * https://www.unicodepedia.com/groups/sinhala/
     */
    SINHALA("sinhala", UnicodeBlock.SINHALA, 0x0D80, 0x0DFF),
    /**
     * Thai.
     *
     * https://www.unicodepedia.com/groups/thai/
     */
    THAI("thai", UnicodeBlock.THAI, 0x0E00, 0x0E7F),
    /**
     * Lao.
     *
     * https://www.unicodepedia.com/groups/lao/
     */
    LAO("lao", UnicodeBlock.LAO, 0x0E80, 0x0EFF),
    /**
     * Tibetan.
     *
     * https://www.unicodepedia.com/groups/tibetan/
     */
    TIBETAN("tibetan", UnicodeBlock.TIBETAN, 0x0F00, 0x0FFF),
    /**
     * Myanmar.
     *
     * https://www.unicodepedia.com/groups/myanmar/
     */
    MYANMAR("myanmar", UnicodeBlock.MYANMAR, 0x1000, 0x109F),
    /**
     * Georgian.
     *
     * https://www.unicodepedia.com/groups/georgian/
     */
    GEORGIAN("georgian", UnicodeBlock.GEORGIAN, 0x10A0, 0x10FF),
    /**
     * Hangul Jamo.
     *
     * https://www.unicodepedia.com/groups/hangul-jamo/
     */
    HANGUL_JAMO("hangul-jamo", UnicodeBlock.HANGUL_JAMO, 0x1100, 0x11FF),
    /**
     * Ethiopic.
     *
     * https://www.unicodepedia.com/groups/ethiopic/
     */
    ETHIOPIC("ethiopic", UnicodeBlock.ETHIOPIC, 0x1200, 0x137F),
    /**
     * Ethiopic Supplement.
     *
     * https://www.unicodepedia.com/groups/ethiopic-supplement/
     */
    ETHIOPIC_SUPPLEMENT("ethiopic-supplement", UnicodeBlock.ETHIOPIC_SUPPLEMENT, 0x1380, 0x139F),
    /**
     * Cherokee.
     *
     * https://www.unicodepedia.com/groups/cherokee/
     */
    CHEROKEE("cherokee", UnicodeBlock.CHEROKEE, 0x13A0, 0x13FF),
    /**
     * Unified Canadian Aboriginal Syllabics.
     *
     * https://www.unicodepedia.com/groups/unified-canadian-aboriginal-syllabics/
     */
    UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS("canadian-aborig-syllabics",
            UnicodeBlock.UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS, 0x1400, 0x167F),
    /**
     * Ogham.
     *
     * https://www.unicodepedia.com/groups/ogham/
     */
    OGHAM("ogham", UnicodeBlock.OGHAM, 0x1680, 0x169F),
    /**
     * Runic.
     *
     * https://www.unicodepedia.com/groups/runic/
     */
    RUNIC("runic", UnicodeBlock.RUNIC, 0x16A0, 0x16FF),
    /**
     * Tagalog.
     *
     * https://www.unicodepedia.com/groups/tagalog/
     */
    TAGALOG("tagalog", UnicodeBlock.TAGALOG, 0x1700, 0x171F),
    /**
     * Hanunoo.
     *
     * https://www.unicodepedia.com/groups/hanunoo/
     */
    HANUNOO("hanunoo", UnicodeBlock.HANUNOO, 0x1720, 0x173F),
    /**
     * Buhid.
     *
     * https://www.unicodepedia.com/groups/buhid/
     */
    BUHID("buhid", UnicodeBlock.BUHID, 0x1740, 0x175F),
    /**
     * Tagbanwa.
     *
     * https://www.unicodepedia.com/groups/tagbanwa/
     */
    TAGBANWA("tagbanwa", UnicodeBlock.TAGBANWA, 0x1760, 0x177F),
    /**
     * Khmer.
     *
     * https://www.unicodepedia.com/groups/khmer/
     */
    KHMER("khmer", UnicodeBlock.KHMER, 0x1780, 0x17FF),
    /**
     * Mongolian.
     *
     * https://www.unicodepedia.com/groups/mongolian/
     */
    MONGOLIAN("mongolian", UnicodeBlock.MONGOLIAN, 0x1800, 0x18AF),
    /**
     * Unified Canadian Aboriginal Syllabics Extended.
     *
     * https://www.unicodepedia.com/groups/unified-canadian-aboriginal-syllabics-extended/
     */
    UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED("canadian-aborig-syllabics-ext",
            UnicodeBlock.UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED, 0x18B0, 0x18FF),
    /**
     * Limbu.
     *
     * https://www.unicodepedia.com/groups/limbu/
     */
    LIMBU("limbu", UnicodeBlock.LIMBU, 0x1900, 0x194F),
    /**
     * Tai Le.
     *
     * https://www.unicodepedia.com/groups/tai-le/
     */
    TAI_LE("tai-le", UnicodeBlock.TAI_LE, 0x1950, 0x197F),
    /**
     * New Tai Lue.
     *
     * https://www.unicodepedia.com/groups/new-tai-lue/
     */
    NEW_TAI_LUE("new-tai-lue", UnicodeBlock.NEW_TAI_LUE, 0x1980, 0x19DF),
    /**
     * Khmer Symbols.
     *
     * https://www.unicodepedia.com/groups/khmer-symbols/
     */
    KHMER_SYMBOLS("khmer-symbols", UnicodeBlock.KHMER_SYMBOLS, 0x19E0, 0x19FF),
    /**
     * Buginese.
     *
     * https://www.unicodepedia.com/groups/buginese/
     */
    BUGINESE("buginese", UnicodeBlock.BUGINESE, 0x1A00, 0x1A1F),
    /**
     * Tai Tham.
     *
     * https://www.unicodepedia.com/groups/tai-tham/
     */
    TAI_THAM("tai-tham", UnicodeBlock.TAI_THAM, 0x1A20, 0x1AAF),
    /**
     * Balinese.
     *
     * https://www.unicodepedia.com/groups/balinese/
     */
    BALINESE("balinese", UnicodeBlock.BALINESE, 0x1B00, 0x1B7F),
    /**
     * Sundanese.
     *
     * https://www.unicodepedia.com/groups/sundanese/
     */
    SUNDANESE("sundanese", UnicodeBlock.SUNDANESE, 0x1B80, 0x1BBF),
    /**
     * Batak.
     *
     * https://www.unicodepedia.com/groups/batak/
     */
    BATAK("batak", UnicodeBlock.BATAK, 0x1BC0, 0x1BFF),
    /**
     * Lepcha.
     *
     * https://www.unicodepedia.com/groups/lepcha/
     */
    LEPCHA("lepcha", UnicodeBlock.LEPCHA, 0x1C00, 0x1C4F),
    /**
     * Ol Chiki.
     *
     * https://www.unicodepedia.com/groups/ol-chiki/
     */
    OL_CHIKI("ol-chiki", UnicodeBlock.OL_CHIKI, 0x1C50, 0x1C7F),
    /**
     * Vedic Extensions.
     *
     * https://www.unicodepedia.com/groups/vedic-extensions/
     */
    VEDIC_EXTENSIONS("vedic-extensions", UnicodeBlock.VEDIC_EXTENSIONS, 0x1CD0, 0x1CFF),
    /**
     * Phonetic Extensions.
     *
     * https://www.unicodepedia.com/groups/phonetic-extensions/
     */
    PHONETIC_EXTENSIONS("phonetic-extensions", UnicodeBlock.PHONETIC_EXTENSIONS, 0x1D00, 0x1D7F),
    /**
     * Phonetic Extensions Supplement.
     *
     * https://www.unicodepedia.com/groups/phonetic-extensions-supplement/
     */
    PHONETIC_EXTENSIONS_SUPPLEMENT("phonetic-extensions-supplement", UnicodeBlock.PHONETIC_EXTENSIONS_SUPPLEMENT,
            0x1D80, 0x1DBF),
    /**
     * Combining Diacritical Marks Supplement.
     *
     * https://www.unicodepedia.com/groups/combining-diacritical-marks-supplement/
     */
    COMBINING_DIACRITICAL_MARKS_SUPPLEMENT("combining-diacritical-marks-sup",
            UnicodeBlock.COMBINING_DIACRITICAL_MARKS_SUPPLEMENT, 0x1DC0, 0x1DFF),
    /**
     * Latin Extended Additional.
     *
     * https://www.unicodepedia.com/groups/latin-extended-additional/
     */
    LATIN_EXTENDED_ADDITIONAL("latin-extended-additional", UnicodeBlock.LATIN_EXTENDED_ADDITIONAL, 0x1E00, 0x1EFF),
    /**
     * Greek Extended.
     *
     * https://www.unicodepedia.com/groups/greek-extended/
     */
    GREEK_EXTENDED("greek-extended", UnicodeBlock.GREEK_EXTENDED, 0x1F00, 0x1FFF),
    /**
     * General Punctuation.
     *
     * https://www.unicodepedia.com/groups/general-punctuation/
     */
    GENERAL_PUNCTUATION("general-punctuation", UnicodeBlock.GENERAL_PUNCTUATION, 0x2000, 0x206F),
    /**
     * Superscripts and Subscripts.
     *
     * https://www.unicodepedia.com/groups/superscripts-and-subscripts/
     */
    SUPERSCRIPTS_AND_SUBSCRIPTS("superscripts-and-subscripts", UnicodeBlock.SUPERSCRIPTS_AND_SUBSCRIPTS, 0x2070,
            0x209F),
    /**
     * Currency Symbols.
     *
     * https://www.unicodepedia.com/groups/currency-symbols/
     */
    CURRENCY_SYMBOLS("currency-symbols", UnicodeBlock.CURRENCY_SYMBOLS, 0x20A0, 0x20CF),
    /**
     * Combining Diacritical Marks for Symbols.
     *
     * https://www.unicodepedia.com/groups/combining-diacritical-marks-for-symbols/
     */
    COMBINING_DIACRITICAL_MARKS_FOR_SYMBOLS("combining-diacritical-marks-sym", UnicodeBlock.COMBINING_MARKS_FOR_SYMBOLS,
            0x20D0, 0x20FF),
    /**
     * Letterlike Symbols.
     *
     * https://www.unicodepedia.com/groups/letterlike-symbols/
     */
    LETTERLIKE_SYMBOLS("letterlike-symbols", UnicodeBlock.LETTERLIKE_SYMBOLS, 0x2100, 0x214F),
    /**
     * Number Forms.
     *
     * https://www.unicodepedia.com/groups/number-forms/
     */
    NUMBER_FORMS("number-forms", UnicodeBlock.NUMBER_FORMS, 0x2150, 0x218F),
    /**
     * Arrows.
     *
     * https://www.unicodepedia.com/groups/arrows/
     */
    ARROWS("arrows", UnicodeBlock.ARROWS, 0x2190, 0x21FF),
    /**
     * Mathematical Operators.
     *
     * https://www.unicodepedia.com/groups/mathematical-operators/
     */
    MATHEMATICAL_OPERATORS("mathematical-operators", UnicodeBlock.MATHEMATICAL_OPERATORS, 0x2200, 0x22FF),
    /**
     * Miscellaneous Technical.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-technical/
     */
    MISCELLANEOUS_TECHNICAL("miscellaneous-technical", UnicodeBlock.MISCELLANEOUS_TECHNICAL, 0x2300, 0x23FF),
    /**
     * Control Pictures.
     *
     * https://www.unicodepedia.com/groups/control-pictures/
     */
    CONTROL_PICTURES("control-pictures", UnicodeBlock.CONTROL_PICTURES, 0x2400, 0x243F),
    /**
     * Optical Character Recognition.
     *
     * https://www.unicodepedia.com/groups/optical-character-recognition/
     */
    OPTICAL_CHARACTER_RECOGNITION("optical-character-recognition", UnicodeBlock.OPTICAL_CHARACTER_RECOGNITION, 0x2440,
            0x245F),
    /**
     * Enclosed Alphanumerics.
     *
     * https://www.unicodepedia.com/groups/enclosed-alphanumerics/
     */
    ENCLOSED_ALPHANUMERICS("enclosed-alphanumerics", UnicodeBlock.ENCLOSED_ALPHANUMERICS, 0x2460, 0x24FF),
    /**
     * Box Drawing.
     *
     * https://www.unicodepedia.com/groups/box-drawing/
     */
    BOX_DRAWING("box-drawing", UnicodeBlock.BOX_DRAWING, 0x2500, 0x257F),
    /**
     * Block Elements.
     *
     * https://www.unicodepedia.com/groups/block-elements/
     */
    BLOCK_ELEMENTS("block-elements", UnicodeBlock.BLOCK_ELEMENTS, 0x2580, 0x259F),
    /**
     * Geometric Shapes.
     *
     * https://www.unicodepedia.com/groups/geometric-shapes/
     */
    GEOMETRIC_SHAPES("geometric-shapes", UnicodeBlock.GEOMETRIC_SHAPES, 0x25A0, 0x25FF),
    /**
     * Miscellaneous Symbols.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-symbols/
     */
    MISCELLANEOUS_SYMBOLS("miscellaneous-symbols", UnicodeBlock.MISCELLANEOUS_SYMBOLS, 0x2600, 0x26FF),
    /**
     * Dingbats.
     *
     * https://www.unicodepedia.com/groups/dingbats/
     */
    DINGBATS("dingbats", UnicodeBlock.DINGBATS, 0x2700, 0x27BF),
    /**
     * Miscellaneous Mathematical Symbols-A.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-mathematical-symbols-a/
     */
    MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A("miscellaneous-math-symbols-a",
            UnicodeBlock.MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A, 0x27C0, 0x27EF),
    /**
     * Supplemental Arrows-A.
     *
     * https://www.unicodepedia.com/groups/supplemental-arrows-a/
     */
    SUPPLEMENTAL_ARROWS_A("supplemental-arrows-a", UnicodeBlock.SUPPLEMENTAL_ARROWS_A, 0x27F0, 0x27FF),
    /**
     * Braille Patterns.
     *
     * https://www.unicodepedia.com/groups/braille-patterns/
     */
    BRAILLE_PATTERNS("braille-patterns", UnicodeBlock.BRAILLE_PATTERNS, 0x2800, 0x28FF),
    /**
     * Supplemental Arrows-B.
     *
     * https://www.unicodepedia.com/groups/supplemental-arrows-b/
     */
    SUPPLEMENTAL_ARROWS_B("supplemental-arrows-b", UnicodeBlock.SUPPLEMENTAL_ARROWS_B, 0x2900, 0x297F),
    /**
     * Miscellaneous Mathematical Symbols-B.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-mathematical-symbols-b/
     */
    MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B("miscellaneous-math-symbols-b",
            UnicodeBlock.MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B, 0x2980, 0x29FF),
    /**
     * Supplemental Mathematical Operators.
     *
     * https://www.unicodepedia.com/groups/supplemental-mathematical-operators/
     */
    SUPPLEMENTAL_MATHEMATICAL_OPERATORS("supplemental-math-operators", UnicodeBlock.SUPPLEMENTAL_MATHEMATICAL_OPERATORS,
            0x2A00, 0x2AFF),
    /**
     * Miscellaneous Symbols and Arrows.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-symbols-and-arrows/
     */
    MISCELLANEOUS_SYMBOLS_AND_ARROWS("misc-symbols-and-arrows", UnicodeBlock.MISCELLANEOUS_SYMBOLS_AND_ARROWS, 0x2B00,
            0x2BFF),
    /**
     * Glagolitic.
     *
     * https://www.unicodepedia.com/groups/glagolitic/
     */
    GLAGOLITIC("glagolitic", UnicodeBlock.GLAGOLITIC, 0x2C00, 0x2C5F),
    /**
     * Latin Extended-C.
     *
     * https://www.unicodepedia.com/groups/latin-extended-c/
     */
    LATIN_EXTENDED_C("latin-extended-c", UnicodeBlock.LATIN_EXTENDED_C, 0x2C60, 0x2C7F),
    /**
     * Coptic.
     *
     * https://www.unicodepedia.com/groups/coptic/
     */
    COPTIC("coptic", UnicodeBlock.COPTIC, 0x2C80, 0x2CFF),
    /**
     * Georgian Supplement.
     *
     * https://www.unicodepedia.com/groups/georgian-supplement/
     */
    GEORGIAN_SUPPLEMENT("georgian-supplement", UnicodeBlock.GEORGIAN_SUPPLEMENT, 0x2D00, 0x2D2F),
    /**
     * Tifinagh.
     *
     * https://www.unicodepedia.com/groups/tifinagh/
     */
    TIFINAGH("tifinagh", UnicodeBlock.TIFINAGH, 0x2D30, 0x2D7F),
    /**
     * Ethiopic Extended.
     *
     * https://www.unicodepedia.com/groups/ethiopic-extended/
     */
    ETHIOPIC_EXTENDED("ethiopic-extended", UnicodeBlock.ETHIOPIC_EXTENDED, 0x2D80, 0x2DDF),
    /**
     * Cyrillic Extended-A.
     *
     * https://www.unicodepedia.com/groups/cyrillic-extended-a/
     */
    CYRILLIC_EXTENDED_A("cyrillic-extended-a", UnicodeBlock.CYRILLIC_EXTENDED_A, 0x2DE0, 0x2DFF),
    /**
     * Supplemental Punctuation.
     *
     * https://www.unicodepedia.com/groups/supplemental-punctuation/
     */
    SUPPLEMENTAL_PUNCTUATION("supplemental-punctuation", UnicodeBlock.SUPPLEMENTAL_PUNCTUATION, 0x2E00, 0x2E7F),
    /**
     * CJK Radicals Supplement.
     *
     * https://www.unicodepedia.com/groups/cjk-radicals-supplement/
     */
    CJK_RADICALS_SUPPLEMENT("cjk-radicals-supplement", UnicodeBlock.CJK_RADICALS_SUPPLEMENT, 0x2E80, 0x2EFF),
    /**
     * Kangxi Radicals.
     *
     * https://www.unicodepedia.com/groups/kangxi-radicals/
     */
    KANGXI_RADICALS("kangxi-radicals", UnicodeBlock.KANGXI_RADICALS, 0x2F00, 0x2FDF),
    /**
     * Ideographic Description Characters.
     *
     * https://www.unicodepedia.com/groups/ideographic-description-characters/
     */
    IDEOGRAPHIC_DESCRIPTION_CHARACTERS("ideographic-description-chars", UnicodeBlock.IDEOGRAPHIC_DESCRIPTION_CHARACTERS,
            0x2FF0, 0x2FFF),
    /**
     * CJK Symbols and Punctuation.
     *
     * https://www.unicodepedia.com/groups/cjk-symbols-and-punctuation/
     */
    CJK_SYMBOLS_AND_PUNCTUATION("cjk-symbols-and-punctuation", UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION, 0x3000,
            0x303F),
    /**
     * Hiragana.
     *
     * https://www.unicodepedia.com/groups/hiragana/
     */
    HIRAGANA("hiragana", UnicodeBlock.HIRAGANA, 0x3040, 0x309F),
    /**
     * Katakana.
     *
     * https://www.unicodepedia.com/groups/katakana/
     */
    KATAKANA("katakana", UnicodeBlock.KATAKANA, 0x30A0, 0x30FF),
    /**
     * Bopomofo.
     *
     * https://www.unicodepedia.com/groups/bopomofo/
     */
    BOPOMOFO("bopomofo", UnicodeBlock.BOPOMOFO, 0x3100, 0x312F),
    /**
     * Hangul Compatibility Jamo.
     *
     * https://www.unicodepedia.com/groups/hangul-compatibility-jamo/
     */
    HANGUL_COMPATIBILITY_JAMO("hangul-compatibility-jamo", UnicodeBlock.HANGUL_COMPATIBILITY_JAMO, 0x3130, 0x318F),
    /**
     * Kanbun.
     *
     * https://www.unicodepedia.com/groups/kanbun/
     */
    KANBUN("kanbun", UnicodeBlock.KANBUN, 0x3190, 0x319F),
    /**
     * Bopomofo Extended.
     *
     * https://www.unicodepedia.com/groups/bopomofo-extended/
     */
    BOPOMOFO_EXTENDED("bopomofo-extended", UnicodeBlock.BOPOMOFO_EXTENDED, 0x31A0, 0x31BF),
    /**
     * CJK Strokes.
     *
     * https://www.unicodepedia.com/groups/cjk-strokes/
     */
    CJK_STROKES("cjk-strokes", UnicodeBlock.CJK_STROKES, 0x31C0, 0x31EF),
    /**
     * Katakana Phonetic Extensions.
     *
     * https://www.unicodepedia.com/groups/katakana-phonetic-extensions/
     */
    KATAKANA_PHONETIC_EXTENSIONS("katakana-phonetic-extensions", UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS, 0x31F0,
            0x31FF),
    /**
     * Enclosed CJK Letters and Months.
     *
     * https://www.unicodepedia.com/groups/enclosed-cjk-letters-and-months/
     */
    ENCLOSED_CJK_LETTERS_AND_MONTHS("enclosed-cjk-letters-and-months", UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS,
            0x3200, 0x32FF),
    /**
     * CJK Compatibility.
     *
     * https://www.unicodepedia.com/groups/cjk-compatibility/
     */
    CJK_COMPATIBILITY("cjk-compatibility", UnicodeBlock.CJK_COMPATIBILITY, 0x3300, 0x33FF),
    /**
     * CJK Unified Ideographs Extension A.
     *
     * https://www.unicodepedia.com/groups/cjk-unified-ideographs-extension-a/
     */
    CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A("cjk-unified-ideographs-ext-a", UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A,
            0x3400, 0x4DBF),
    /**
     * Yijing Hexagram Symbols.
     *
     * https://www.unicodepedia.com/groups/yijing-hexagram-symbols/
     */
    YIJING_HEXAGRAM_SYMBOLS("yijing-hexagram-symbols", UnicodeBlock.YIJING_HEXAGRAM_SYMBOLS, 0x4DC0, 0x4DFF),
    /**
     * CJK Unified Ideographs.
     *
     * https://www.unicodepedia.com/groups/cjk-unified-ideographs/
     */
    CJK_UNIFIED_IDEOGRAPHS("cjk-unified-ideographs", UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS, 0x4E00, 0x9FFF),
    /**
     * Yi Syllables.
     *
     * https://www.unicodepedia.com/groups/yi-syllables/
     */
    YI_SYLLABLES("yi-syllables", UnicodeBlock.YI_SYLLABLES, 0xA000, 0xA48F),
    /**
     * Yi Radicals.
     *
     * https://www.unicodepedia.com/groups/yi-radicals/
     */
    YI_RADICALS("yi-radicals", UnicodeBlock.YI_RADICALS, 0xA490, 0xA4CF),
    /**
     * Lisu.
     *
     * https://www.unicodepedia.com/groups/lisu/
     */
    LISU("lisu", UnicodeBlock.LISU, 0xA4D0, 0xA4FF),
    /**
     * Vai.
     *
     * https://www.unicodepedia.com/groups/vai/
     */
    VAI("vai", UnicodeBlock.VAI, 0xA500, 0xA63F),
    /**
     * Cyrillic Extended-B.
     *
     * https://www.unicodepedia.com/groups/cyrillic-extended-b/
     */
    CYRILLIC_EXTENDED_B("cyrillic-extended-b", UnicodeBlock.CYRILLIC_EXTENDED_B, 0xA640, 0xA69F),
    /**
     * Bamum.
     *
     * https://www.unicodepedia.com/groups/bamum/
     */
    BAMUM("bamum", UnicodeBlock.BAMUM, 0xA6A0, 0xA6FF),
    /**
     * Modifier Tone Letters.
     *
     * https://www.unicodepedia.com/groups/modifier-tone-letters/
     */
    MODIFIER_TONE_LETTERS("modifier-tone-letters", UnicodeBlock.MODIFIER_TONE_LETTERS, 0xA700, 0xA71F),
    /**
     * Latin Extended-D.
     *
     * https://www.unicodepedia.com/groups/latin-extended-d/
     */
    LATIN_EXTENDED_D("latin-extended-d", UnicodeBlock.LATIN_EXTENDED_D, 0xA720, 0xA7FF),
    /**
     * Syloti Nagri.
     *
     * https://www.unicodepedia.com/groups/syloti-nagri/
     */
    SYLOTI_NAGRI("syloti-nagri", UnicodeBlock.SYLOTI_NAGRI, 0xA800, 0xA82F),
    /**
     * Common Indic Number Forms.
     *
     * https://www.unicodepedia.com/groups/common-indic-number-forms/
     */
    COMMON_INDIC_NUMBER_FORMS("common-indic-number-forms", UnicodeBlock.COMMON_INDIC_NUMBER_FORMS, 0xA830, 0xA83F),
    /**
     * Phags-pa.
     *
     * https://www.unicodepedia.com/groups/phags-pa/
     */
    PHAGS_PA("phags-pa", UnicodeBlock.PHAGS_PA, 0xA840, 0xA87F),
    /**
     * Saurashtra.
     *
     * https://www.unicodepedia.com/groups/saurashtra/
     */
    SAURASHTRA("saurashtra", UnicodeBlock.SAURASHTRA, 0xA880, 0xA8DF),
    /**
     * Devanagari Extended.
     *
     * https://www.unicodepedia.com/groups/devanagari-extended/
     */
    DEVANAGARI_EXTENDED("devanagari-extended", UnicodeBlock.DEVANAGARI_EXTENDED, 0xA8E0, 0xA8FF),
    /**
     * Kayah Li.
     *
     * https://www.unicodepedia.com/groups/kayah-li/
     */
    KAYAH_LI("kayah-li", UnicodeBlock.KAYAH_LI, 0xA900, 0xA92F),
    /**
     * Rejang.
     *
     * https://www.unicodepedia.com/groups/rejang/
     */
    REJANG("rejang", UnicodeBlock.REJANG, 0xA930, 0xA95F),
    /**
     * Hangul Jamo Extended-A.
     *
     * https://www.unicodepedia.com/groups/hangul-jamo-extended-a/
     */
    HANGUL_JAMO_EXTENDED_A("hangul-jamo-extended-a", UnicodeBlock.HANGUL_JAMO_EXTENDED_A, 0xA960, 0xA97F),
    /**
     * Javanese.
     *
     * https://www.unicodepedia.com/groups/javanese/
     */
    JAVANESE("javanese", UnicodeBlock.JAVANESE, 0xA980, 0xA9DF),
    /**
     * Cham.
     *
     * https://www.unicodepedia.com/groups/cham/
     */
    CHAM("cham", UnicodeBlock.CHAM, 0xAA00, 0xAA5F),
    /**
     * Myanmar Extended-A.
     *
     * https://www.unicodepedia.com/groups/myanmar-extended-a/
     */
    MYANMAR_EXTENDED_A("myanmar-extended-a", UnicodeBlock.MYANMAR_EXTENDED_A, 0xAA60, 0xAA7F),
    /**
     * Tai Viet.
     *
     * https://www.unicodepedia.com/groups/tai-viet/
     */
    TAI_VIET("tai-viet", UnicodeBlock.TAI_VIET, 0xAA80, 0xAADF),
    /**
     * Ethiopic Extended-A.
     *
     * https://www.unicodepedia.com/groups/ethiopic-extended-a/
     */
    ETHIOPIC_EXTENDED_A("ethiopic-extended-a", UnicodeBlock.ETHIOPIC_EXTENDED_A, 0xAB00, 0xAB2F),
    /**
     * Meetei Mayek.
     *
     * https://www.unicodepedia.com/groups/meetei-mayek/
     */
    MEETEI_MAYEK("meetei-mayek", UnicodeBlock.MEETEI_MAYEK, 0xABC0, 0xABFF),
    /**
     * Hangul Syllables.
     *
     * https://www.unicodepedia.com/groups/hangul-syllables/
     */
    HANGUL_SYLLABLES("hangul-syllables", UnicodeBlock.HANGUL_SYLLABLES, 0xAC00, 0xD7AF),
    /**
     * Hangul Jamo Extended-B.
     *
     * https://www.unicodepedia.com/groups/hangul-jamo-extended-b/
     */
    HANGUL_JAMO_EXTENDED_B("hangul-jamo-extended-b", UnicodeBlock.HANGUL_JAMO_EXTENDED_B, 0xD7B0, 0xD7FF),
    /**
     * High Surrogates.
     *
     * https://www.unicodepedia.com/groups/high-surrogates/
     */
    HIGH_SURROGATES("high-surrogates", UnicodeBlock.HIGH_SURROGATES, 0xD800, 0xDB7F),
    /**
     * High Private Use Surrogates.
     *
     * https://www.unicodepedia.com/groups/high-private-use-surrogates/
     */
    HIGH_PRIVATE_USE_SURROGATES("high-private-use-surrogates", UnicodeBlock.HIGH_PRIVATE_USE_SURROGATES, 0xDB80,
            0xDBFF),
    /**
     * Low Surrogates.
     *
     * https://www.unicodepedia.com/groups/low-surrogates/
     */
    LOW_SURROGATES("low-surrogates", UnicodeBlock.LOW_SURROGATES, 0xDC00, 0xDFFF),
    /**
     * Private Use Area.
     *
     * https://www.unicodepedia.com/groups/private-use-area/
     */
    PRIVATE_USE_AREA("private-use-area", UnicodeBlock.PRIVATE_USE_AREA, 0xE000, 0xF8FF),
    /**
     * CJK Compatibility Ideographs.
     *
     * https://www.unicodepedia.com/groups/cjk-compatibility-ideographs/
     */
    CJK_COMPATIBILITY_IDEOGRAPHS("cjk-compatibility-ideographs", UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS, 0xF900,
            0xFAFF),
    /**
     * Alphabetic Presentation Forms.
     *
     * https://www.unicodepedia.com/groups/alphabetic-presentation-forms/
     */
    ALPHABETIC_PRESENTATION_FORMS("alphabetic-presentation-forms", UnicodeBlock.ALPHABETIC_PRESENTATION_FORMS, 0xFB00,
            0xFB4F),
    /**
     * Arabic Presentation Forms-A.
     *
     * https://www.unicodepedia.com/groups/arabic-presentation-forms-a/
     */
    ARABIC_PRESENTATION_FORMS_A("arabic-presentation-forms-a", UnicodeBlock.ARABIC_PRESENTATION_FORMS_A, 0xFB50,
            0xFDFF),
    /**
     * Variation Selectors.
     *
     * https://www.unicodepedia.com/groups/variation-selectors/
     */
    VARIATION_SELECTORS("variation-selectors", UnicodeBlock.VARIATION_SELECTORS, 0xFE00, 0xFE0F),
    /**
     * Vertical Forms.
     *
     * https://www.unicodepedia.com/groups/vertical-forms/
     */
    VERTICAL_FORMS("vertical-forms", UnicodeBlock.VERTICAL_FORMS, 0xFE10, 0xFE1F),
    /**
     * Combining Half Marks.
     *
     * https://www.unicodepedia.com/groups/combining-half-marks/
     */
    COMBINING_HALF_MARKS("combining-half-marks", UnicodeBlock.COMBINING_HALF_MARKS, 0xFE20, 0xFE2F),
    /**
     * CJK Compatibility Forms.
     *
     * https://www.unicodepedia.com/groups/cjk-compatibility-forms/
     */
    CJK_COMPATIBILITY_FORMS("cjk-compatibility-forms", UnicodeBlock.CJK_COMPATIBILITY_FORMS, 0xFE30, 0xFE4F),
    /**
     * Small Form Variants.
     *
     * https://www.unicodepedia.com/groups/small-form-variants/
     */
    SMALL_FORM_VARIANTS("small-form-variants", UnicodeBlock.SMALL_FORM_VARIANTS, 0xFE50, 0xFE6F),
    /**
     * Arabic Presentation Forms-B.
     *
     * https://www.unicodepedia.com/groups/arabic-presentation-forms-b/
     */
    ARABIC_PRESENTATION_FORMS_B("arabic-presentation-forms-b", UnicodeBlock.ARABIC_PRESENTATION_FORMS_B, 0xFE70,
            0xFEFF),
    /**
     * Halfwidth and Fullwidth Forms.
     *
     * https://www.unicodepedia.com/groups/halfwidth-and-fullwidth-forms/
     */
    HALFWIDTH_AND_FULLWIDTH_FORMS("halfwidth-and-fullwidth-forms", UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS, 0xFF00,
            0xFFEF),
    /**
     * Specials.
     *
     * https://www.unicodepedia.com/groups/specials/
     */
    SPECIALS("specials", UnicodeBlock.SPECIALS, 0xFFF0, 0xFFFF),
    /**
     * Linear B Syllabary.
     *
     * https://www.unicodepedia.com/groups/linear-b-syllabary/
     */
    LINEAR_B_SYLLABARY("linear-b-syllabary", UnicodeBlock.LINEAR_B_SYLLABARY, 0x10000, 0x1007F),
    /**
     * Linear B Ideograms.
     *
     * https://www.unicodepedia.com/groups/linear-b-ideograms/
     */
    LINEAR_B_IDEOGRAMS("linear-b-ideograms", UnicodeBlock.LINEAR_B_IDEOGRAMS, 0x10080, 0x100FF),
    /**
     * Aegean Numbers.
     *
     * https://www.unicodepedia.com/groups/aegean-numbers/
     */
    AEGEAN_NUMBERS("aegean-numbers", UnicodeBlock.AEGEAN_NUMBERS, 0x10100, 0x1013F),
    /**
     * Ancient Greek Numbers.
     *
     * https://www.unicodepedia.com/groups/ancient-greek-numbers/
     */
    ANCIENT_GREEK_NUMBERS("ancient-greek-numbers", UnicodeBlock.ANCIENT_GREEK_NUMBERS, 0x10140, 0x1018F),
    /**
     * Ancient Symbols.
     *
     * https://www.unicodepedia.com/groups/ancient-symbols/
     */
    ANCIENT_SYMBOLS("ancient-symbols", UnicodeBlock.ANCIENT_SYMBOLS, 0x10190, 0x101CF),
    /**
     * Phaistos Disc.
     *
     * https://www.unicodepedia.com/groups/phaistos-disc/
     */
    PHAISTOS_DISC("phaistos-disc", UnicodeBlock.PHAISTOS_DISC, 0x101D0, 0x101FF),
    /**
     * Lycian.
     *
     * https://www.unicodepedia.com/groups/lycian/
     */
    LYCIAN("lycian", UnicodeBlock.LYCIAN, 0x10280, 0x1029F),
    /**
     * Carian.
     *
     * https://www.unicodepedia.com/groups/carian/
     */
    CARIAN("carian", UnicodeBlock.CARIAN, 0x102A0, 0x102DF),
    /**
     * Old Italic.
     *
     * https://www.unicodepedia.com/groups/old-italic/
     */
    OLD_ITALIC("old-italic", UnicodeBlock.OLD_ITALIC, 0x10300, 0x1032F),
    /**
     * Gothic.
     *
     * https://www.unicodepedia.com/groups/gothic/
     */
    GOTHIC("gothic", UnicodeBlock.GOTHIC, 0x10330, 0x1034F),
    /**
     * Ugaritic.
     *
     * https://www.unicodepedia.com/groups/ugaritic/
     */
    UGARITIC("ugaritic", UnicodeBlock.UGARITIC, 0x10380, 0x1039F),
    /**
     * Old Persian.
     *
     * https://www.unicodepedia.com/groups/old-persian/
     */
    OLD_PERSIAN("old-persian", UnicodeBlock.OLD_PERSIAN, 0x103A0, 0x103DF),
    /**
     * Deseret.
     *
     * https://www.unicodepedia.com/groups/deseret/
     */
    DESERET("deseret", UnicodeBlock.DESERET, 0x10400, 0x1044F),
    /**
     * Shavian.
     *
     * https://www.unicodepedia.com/groups/shavian/
     */
    SHAVIAN("shavian", UnicodeBlock.SHAVIAN, 0x10450, 0x1047F),
    /**
     * Osmanya.
     *
     * https://www.unicodepedia.com/groups/osmanya/
     */
    OSMANYA("osmanya", UnicodeBlock.OSMANYA, 0x10480, 0x104AF),
    /**
     * Cypriot Syllabary.
     *
     * https://www.unicodepedia.com/groups/cypriot-syllabary/
     */
    CYPRIOT_SYLLABARY("cypriot-syllabary", UnicodeBlock.CYPRIOT_SYLLABARY, 0x10800, 0x1083F),
    /**
     * Imperial Aramaic.
     *
     * https://www.unicodepedia.com/groups/imperial-aramaic/
     */
    IMPERIAL_ARAMAIC("imperial-aramaic", UnicodeBlock.IMPERIAL_ARAMAIC, 0x10840, 0x1085F),
    /**
     * Phoenician.
     *
     * https://www.unicodepedia.com/groups/phoenician/
     */
    PHOENICIAN("phoenician", UnicodeBlock.PHOENICIAN, 0x10900, 0x1091F),
    /**
     * Lydian.
     *
     * https://www.unicodepedia.com/groups/lydian/
     */
    LYDIAN("lydian", UnicodeBlock.LYDIAN, 0x10920, 0x1093F),
    /**
     * Kharoshthi.
     *
     * https://www.unicodepedia.com/groups/kharoshthi/
     */
    KHAROSHTHI("kharoshthi", UnicodeBlock.KHAROSHTHI, 0x10A00, 0x10A5F),
    /**
     * Old South Arabian.
     *
     * https://www.unicodepedia.com/groups/old-south-arabian/
     */
    OLD_SOUTH_ARABIAN("old-south-arabian", UnicodeBlock.OLD_SOUTH_ARABIAN, 0x10A60, 0x10A7F),
    /**
     * Avestan.
     *
     * https://www.unicodepedia.com/groups/avestan/
     */
    AVESTAN("avestan", UnicodeBlock.AVESTAN, 0x10B00, 0x10B3F),
    /**
     * Inscriptional Parthian.
     *
     * https://www.unicodepedia.com/groups/inscriptional-parthian/
     */
    INSCRIPTIONAL_PARTHIAN("inscriptional-parthian", UnicodeBlock.INSCRIPTIONAL_PARTHIAN, 0x10B40, 0x10B5F),
    /**
     * Inscriptional Pahlavi.
     *
     * https://www.unicodepedia.com/groups/inscriptional-pahlavi/
     */
    INSCRIPTIONAL_PAHLAVI("inscriptional-pahlavi", UnicodeBlock.INSCRIPTIONAL_PAHLAVI, 0x10B60, 0x10B7F),
    /**
     * Old Turkic.
     *
     * https://www.unicodepedia.com/groups/old-turkic/
     */
    OLD_TURKIC("old-turkic", UnicodeBlock.OLD_TURKIC, 0x10C00, 0x10C4F),
    /**
     * Rumi Numeral Symbols.
     *
     * https://www.unicodepedia.com/groups/rumi-numeral-symbols/
     */
    RUMI_NUMERAL_SYMBOLS("rumi-numeral-symbols", UnicodeBlock.RUMI_NUMERAL_SYMBOLS, 0x10E60, 0x10E7F),
    /**
     * Brahmi.
     *
     * https://www.unicodepedia.com/groups/brahmi/
     */
    BRAHMI("brahmi", UnicodeBlock.BRAHMI, 0x11000, 0x1107F),
    /**
     * Kaithi.
     *
     * https://www.unicodepedia.com/groups/kaithi/
     */
    KAITHI("kaithi", UnicodeBlock.KAITHI, 0x11080, 0x110CF),
    /**
     * Cuneiform.
     *
     * https://www.unicodepedia.com/groups/cuneiform/
     */
    CUNEIFORM("cuneiform", UnicodeBlock.CUNEIFORM, 0x12000, 0x123FF),
    /**
     * Cuneiform Numbers and Punctuation.
     *
     * https://www.unicodepedia.com/groups/cuneiform-numbers-and-punctuation/
     */
    CUNEIFORM_NUMBERS_AND_PUNCTUATION("cuneiform-numbers-punctuation", UnicodeBlock.CUNEIFORM_NUMBERS_AND_PUNCTUATION,
            0x12400, 0x1247F),
    /**
     * Egyptian Hieroglyphs.
     *
     * https://www.unicodepedia.com/groups/egyptian-hieroglyphs/
     */
    EGYPTIAN_HIEROGLYPHS("egyptian-hieroglyphs", UnicodeBlock.EGYPTIAN_HIEROGLYPHS, 0x13000, 0x1342F),
    /**
     * Bamum Supplement.
     *
     * https://www.unicodepedia.com/groups/bamum-supplement/
     */
    BAMUM_SUPPLEMENT("bamum-supplement", UnicodeBlock.BAMUM_SUPPLEMENT, 0x16800, 0x16A3F),
    /**
     * Kana Supplement.
     *
     * https://www.unicodepedia.com/groups/kana-supplement/
     */
    KANA_SUPPLEMENT("kana-supplement", UnicodeBlock.KANA_SUPPLEMENT, 0x1B000, 0x1B0FF),
    /**
     * Byzantine Musical Symbols.
     *
     * https://www.unicodepedia.com/groups/byzantine-musical-symbols/
     */
    BYZANTINE_MUSICAL_SYMBOLS("byzantine-musical-symbols", UnicodeBlock.BYZANTINE_MUSICAL_SYMBOLS, 0x1D000, 0x1D0FF),
    /**
     * Musical Symbols.
     *
     * https://www.unicodepedia.com/groups/musical-symbols/
     */
    MUSICAL_SYMBOLS("musical-symbols", UnicodeBlock.MUSICAL_SYMBOLS, 0x1D100, 0x1D1FF),
    /**
     * Ancient Greek Musical Notation.
     *
     * https://www.unicodepedia.com/groups/ancient-greek-musical-notation/
     */
    ANCIENT_GREEK_MUSICAL_NOTATION("ancient-greek-musical-notation", UnicodeBlock.ANCIENT_GREEK_MUSICAL_NOTATION,
            0x1D200, 0x1D24F),
    /**
     * Tai Xuan Jing Symbols.
     *
     * https://www.unicodepedia.com/groups/tai-xuan-jing-symbols/
     */
    TAI_XUAN_JING_SYMBOLS("tai-xuan-jing-symbols", UnicodeBlock.TAI_XUAN_JING_SYMBOLS, 0x1D300, 0x1D35F),
    /**
     * Counting Rod Numerals.
     *
     * https://www.unicodepedia.com/groups/counting-rod-numerals/
     */
    COUNTING_ROD_NUMERALS("counting-rod-numerals", UnicodeBlock.COUNTING_ROD_NUMERALS, 0x1D360, 0x1D37F),
    /**
     * Mathematical Alphanumeric Symbols.
     *
     * https://www.unicodepedia.com/groups/mathematical-alphanumeric-symbols/
     */
    MATHEMATICAL_ALPHANUMERIC_SYMBOLS("math-alphanumeric-symbols", UnicodeBlock.MATHEMATICAL_ALPHANUMERIC_SYMBOLS,
            0x1D400, 0x1D7FF),
    /**
     * Mahjong Tiles.
     *
     * https://www.unicodepedia.com/groups/mahjong-tiles/
     */
    MAHJONG_TILES("mahjong-tiles", UnicodeBlock.MAHJONG_TILES, 0x1F000, 0x1F02F),
    /**
     * Domino Tiles.
     *
     * https://www.unicodepedia.com/groups/domino-tiles/
     */
    DOMINO_TILES("domino-tiles", UnicodeBlock.DOMINO_TILES, 0x1F030, 0x1F09F),
    /**
     * Playing Cards.
     *
     * https://www.unicodepedia.com/groups/playing-cards/
     */
    PLAYING_CARDS("playing-cards", UnicodeBlock.PLAYING_CARDS, 0x1F0A0, 0x1F0FF),
    /**
     * Enclosed Alphanumeric Supplement.
     *
     * https://www.unicodepedia.com/groups/enclosed-alphanumeric-supplement/
     */
    ENCLOSED_ALPHANUMERIC_SUPPLEMENT("enclosed-alphanumeric-supp", UnicodeBlock.ENCLOSED_ALPHANUMERIC_SUPPLEMENT,
            0x1F100, 0x1F1FF),
    /**
     * Enclosed Ideographic Supplement.
     *
     * https://www.unicodepedia.com/groups/enclosed-ideographic-supplement/
     */
    ENCLOSED_IDEOGRAPHIC_SUPPLEMENT("enclosed-ideographic-supplement", UnicodeBlock.ENCLOSED_IDEOGRAPHIC_SUPPLEMENT,
            0x1F200, 0x1F2FF),
    /**
     * Miscellaneous Symbols And Pictographs.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-symbols-and-pictographs/
     */
    MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS("misc-symbols-and-pictographs",
            UnicodeBlock.MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS, 0x1F300, 0x1F5FF),
    /**
     * Emoticons.
     *
     * https://www.unicodepedia.com/groups/emoticons/
     */
    EMOTICONS("emoticons", UnicodeBlock.EMOTICONS, 0x1F600, 0x1F64F),
    /**
     * Transport And Map Symbols.
     *
     * https://www.unicodepedia.com/groups/transport-and-map-symbols/
     */
    TRANSPORT_AND_MAP_SYMBOLS("transport-and-map-symbols", UnicodeBlock.TRANSPORT_AND_MAP_SYMBOLS, 0x1F680, 0x1F6FF),
    /**
     * Alchemical Symbols.
     *
     * https://www.unicodepedia.com/groups/alchemical-symbols/
     */
    ALCHEMICAL_SYMBOLS("alchemical-symbols", UnicodeBlock.ALCHEMICAL_SYMBOLS, 0x1F700, 0x1F77F),
    /**
     * CJK Unified Ideographs Extension B.
     *
     * https://www.unicodepedia.com/groups/cjk-unified-ideographs-extension-b/
     */
    CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B("cjk-unified-ideographs-ext-b", UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B,
            0x20000, 0x2A6DF),
    /**
     * CJK Unified Ideographs Extension C.
     *
     * https://www.unicodepedia.com/groups/cjk-unified-ideographs-extension-c/
     */
    CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C("cjk-unified-ideographs-ext-c", UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C,
            0x2A700, 0x2B73F),
    /**
     * CJK Unified Ideographs Extension D.
     *
     * https://www.unicodepedia.com/groups/cjk-unified-ideographs-extension-d/
     */
    CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D("cjk-unified-ideographs-ext-d", UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D,
            0x2B740, 0x2B81F),
    /**
     * CJK Compatibility Ideographs Supplement.
     *
     * https://www.unicodepedia.com/groups/cjk-compatibility-ideographs-supplement/
     */
    CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT("cjk-compat-ideographs-sup",
            UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT, 0x2F800, 0x2FA1F),
    /**
     * Tags.
     *
     * https://www.unicodepedia.com/groups/tags/
     */
    TAGS("tags", UnicodeBlock.TAGS, 0xE0000, 0xE007F),
    /**
     * Variation Selectors Supplement.
     *
     * https://www.unicodepedia.com/groups/variation-selectors-supplement/
     */
    VARIATION_SELECTORS_SUPPLEMENT("variation-selectors-supplement", UnicodeBlock.VARIATION_SELECTORS_SUPPLEMENT,
            0xE0100, 0xE01EF),
    /**
     * Supplementary Private Use Area-A.
     *
     * https://www.unicodepedia.com/groups/supplementary-private-use-area-a/
     */
    SUPPLEMENTARY_PRIVATE_USE_AREA_A("supplementary-private-use-a", UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_A,
            0xF0000, 0xFFFFF),
    /**
     * Supplementary Private Use Area-B.
     *
     * https://www.unicodepedia.com/groups/supplementary-private-use-area-b/
     */
    SUPPLEMENTARY_PRIVATE_USE_AREA_B("supplementary-private-use-b", UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_B,
            0x100000, 0x10FFFF);

    private final String alias;
    private final UnicodeBlock block;
    private final int lower;
    private final int upper;

    UnicodeRange(String alias, UnicodeBlock block, int lower, int upper) {
        this.alias = alias;
        this.block = block;
        this.lower = lower;
        this.upper = upper;
    }


    @JsonValue
    public String getAlias() {
        return alias;
    }


    public UnicodeBlock getBlock() {
        return block;
    }


    public int getLower() {
        return lower;
    }


    public int getUpper() {
        return upper;
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


    public static UnicodeRange fromBlock(UnicodeBlock block) {
        for (UnicodeRange value : values()) {
            if (value.block.equals(block)) {
                return value;
            }
        }

        throw new IllegalArgumentException("No unicode range for block: " + block);
    }
}
