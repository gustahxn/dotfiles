package java.lang;

import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;
import java.lang.invoke.MethodHandles;
import java.util.Optional;
import jdk.internal.ValueBased;
import jdk.internal.vm.annotation.ForceInline;
import jdk.internal.vm.annotation.IntrinsicCandidate;
import jdk.internal.vm.annotation.Stable;

@ValueBased
public final class Integer extends Number implements Comparable<Integer>, Constable, ConstantDesc {

    private static final class IntegerCache {

        static final int low = -128;
        static final int high;
        @Stable
        static final Integer[] cache;
        static Integer[] archivedCache;

        private IntegerCache() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
             * 4: return
             *  */
            // </editor-fold>
        }
    }
    public static final int MIN_VALUE = -2147483648;
    public static final int MAX_VALUE = 2147483647;
    public static final Class<Integer> TYPE;
    @Stable
    static final byte[] digits;
    private final int value;
    public static final int SIZE = 32;
    public static final int BYTES = 4;
    private static final long serialVersionUID = 1360826667806852920L;

    public static String toString(int i, int radix) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_1
         * 1: iconst_2
         * 2: if_icmplt     11
         * 5: iload_1
         * 6: bipush        36
         * 8: if_icmple     14
         * 11: bipush        10
         * 13: istore_1
         * 14: iload_1
         * 15: bipush        10
         * 17: if_icmpne     25
         * 20: iload_0
         * 21: invokestatic  #7                  // Method toString:(I)Ljava/lang/String;
         * 24: areturn
         * 25: getstatic     #11                 // Field java/lang/String.COMPACT_STRINGS:Z
         * 28: ifeq          120
         * 31: bipush        33
         * 33: newarray       byte
         * 35: astore_2
         * 36: iload_0
         * 37: ifge          44
         * 40: iconst_1
         * 41: goto          45
         * 44: iconst_0
         * 45: istore_3
         * 46: bipush        32
         * 48: istore        4
         * 50: iload_3
         * 51: ifne          57
         * 54: iload_0
         * 55: ineg
         * 56: istore_0
         * 57: iload_0
         * 58: iload_1
         * 59: ineg
         * 60: if_icmpgt     85
         * 63: aload_2
         * 64: iload         4
         * 66: iinc          4, -1
         * 69: getstatic     #17                 // Field digits:[B
         * 72: iload_0
         * 73: iload_1
         * 74: irem
         * 75: ineg
         * 76: baload
         * 77: bastore
         * 78: iload_0
         * 79: iload_1
         * 80: idiv
         * 81: istore_0
         * 82: goto          57
         * 85: aload_2
         * 86: iload         4
         * 88: getstatic     #17                 // Field digits:[B
         * 91: iload_0
         * 92: ineg
         * 93: baload
         * 94: bastore
         * 95: iload_3
         * 96: ifeq          108
         * 99: aload_2
         * 100: iinc          4, -1
         * 103: iload         4
         * 105: bipush        45
         * 107: bastore
         * 108: aload_2
         * 109: iload         4
         * 111: bipush        33
         * 113: iload         4
         * 115: isub
         * 116: invokestatic  #21                 // Method java/lang/StringLatin1.newString:([BII)Ljava/lang/String;
         * 119: areturn
         * 120: iload_0
         * 121: iload_1
         * 122: invokestatic  #27                 // Method toStringUTF16:(II)Ljava/lang/String;
         * 125: areturn
         *  */
        // </editor-fold>
    }

    private static String toStringUTF16(int i, int radix) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: bipush        66
         * 2: newarray       byte
         * 4: astore_2
         * 5: iload_0
         * 6: ifge          13
         * 9: iconst_1
         * 10: goto          14
         * 13: iconst_0
         * 14: istore_3
         * 15: bipush        32
         * 17: istore        4
         * 19: iload_3
         * 20: ifne          26
         * 23: iload_0
         * 24: ineg
         * 25: istore_0
         * 26: iload_0
         * 27: iload_1
         * 28: ineg
         * 29: if_icmpgt     56
         * 32: aload_2
         * 33: iload         4
         * 35: iinc          4, -1
         * 38: getstatic     #17                 // Field digits:[B
         * 41: iload_0
         * 42: iload_1
         * 43: irem
         * 44: ineg
         * 45: baload
         * 46: invokestatic  #31                 // Method java/lang/StringUTF16.putChar:([BII)V
         * 49: iload_0
         * 50: iload_1
         * 51: idiv
         * 52: istore_0
         * 53: goto          26
         * 56: aload_2
         * 57: iload         4
         * 59: getstatic     #17                 // Field digits:[B
         * 62: iload_0
         * 63: ineg
         * 64: baload
         * 65: invokestatic  #31                 // Method java/lang/StringUTF16.putChar:([BII)V
         * 68: iload_3
         * 69: ifeq          83
         * 72: aload_2
         * 73: iinc          4, -1
         * 76: iload         4
         * 78: bipush        45
         * 80: invokestatic  #31                 // Method java/lang/StringUTF16.putChar:([BII)V
         * 83: aload_2
         * 84: iload         4
         * 86: bipush        33
         * 88: iload         4
         * 90: isub
         * 91: invokestatic  #37                 // Method java/lang/StringUTF16.newString:([BII)Ljava/lang/String;
         * 94: areturn
         *  */
        // </editor-fold>
    }

    public static String toUnsignedString(int i, int radix) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: invokestatic  #38                 // Method toUnsignedLong:(I)J
         * 4: iload_1
         * 5: invokestatic  #42                 // Method java/lang/Long.toUnsignedString:(JI)Ljava/lang/String;
         * 8: areturn
         *  */
        // </editor-fold>
    }

    public static String toHexString(int i) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: iconst_4
         * 2: invokestatic  #48                 // Method toUnsignedString0:(II)Ljava/lang/String;
         * 5: areturn
         *  */
        // </editor-fold>
    }

    public static String toOctalString(int i) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: iconst_3
         * 2: invokestatic  #48                 // Method toUnsignedString0:(II)Ljava/lang/String;
         * 5: areturn
         *  */
        // </editor-fold>
    }

    public static String toBinaryString(int i) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: iconst_1
         * 2: invokestatic  #48                 // Method toUnsignedString0:(II)Ljava/lang/String;
         * 5: areturn
         *  */
        // </editor-fold>
    }

    private static String toUnsignedString0(int val, int shift) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: bipush        32
         * 2: iload_0
         * 3: invokestatic  #51                 // Method numberOfLeadingZeros:(I)I
         * 6: isub
         * 7: istore_2
         * 8: iload_2
         * 9: iload_1
         * 10: iconst_1
         * 11: isub
         * 12: iadd
         * 13: iload_1
         * 14: idiv
         * 15: iconst_1
         * 16: invokestatic  #55                 // Method java/lang/Math.max:(II)I
         * 19: istore_3
         * 20: iload_3
         * 21: newarray       byte
         * 23: astore        4
         * 25: iload_0
         * 26: iload_1
         * 27: aload         4
         * 29: iload_3
         * 30: invokestatic  #61                 // Method formatUnsignedInt:(II[BI)V
         * 33: aload         4
         * 35: invokestatic  #65                 // Method java/lang/String.newStringWithLatin1Bytes:([B)Ljava/lang/String;
         * 38: areturn
         *  */
        // </editor-fold>
    }

    private static void formatUnsignedInt(int val, int shift, byte[] buf, int len) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_3
         * 1: istore        4
         * 3: iconst_1
         * 4: iload_1
         * 5: ishl
         * 6: istore        5
         * 8: iload         5
         * 10: iconst_1
         * 11: isub
         * 12: istore        6
         * 14: aload_2
         * 15: iinc          4, -1
         * 18: iload         4
         * 20: getstatic     #17                 // Field digits:[B
         * 23: iload_0
         * 24: iload         6
         * 26: iand
         * 27: baload
         * 28: bastore
         * 29: iload_0
         * 30: iload_1
         * 31: iushr
         * 32: istore_0
         * 33: iload         4
         * 35: ifgt          14
         * 38: return
         *  */
        // </editor-fold>
    }

    @IntrinsicCandidate
    public static String toString(int i) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: invokestatic  #69                 // Method jdk/internal/util/DecimalDigits.stringSize:(I)I
         * 4: istore_1
         * 5: iload_1
         * 6: newarray       byte
         * 8: astore_2
         * 9: iload_0
         * 10: iload_1
         * 11: aload_2
         * 12: invokestatic  #74                 // Method jdk/internal/util/DecimalDigits.uncheckedGetCharsLatin1:(II[B)I
         * 15: pop
         * 16: aload_2
         * 17: invokestatic  #65                 // Method java/lang/String.newStringWithLatin1Bytes:([B)Ljava/lang/String;
         * 20: areturn
         *  */
        // </editor-fold>
    }

    public static String toUnsignedString(int i) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: invokestatic  #38                 // Method toUnsignedLong:(I)J
         * 4: invokestatic  #78                 // Method java/lang/Long.toString:(J)Ljava/lang/String;
         * 7: areturn
         *  */
        // </editor-fold>
    }

    public static int parseInt(String s, int radix) throws NumberFormatException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: ifnonnull     14
         * 4: new           #81                 // class java/lang/NumberFormatException
         * 7: dup
         * 8: ldc           #83                 // String Cannot parse null string
         * 10: invokespecial #85                 // Method java/lang/NumberFormatException."<init>":(Ljava/lang/String;)V
         * 13: athrow
         * 14: iload_1
         * 15: iconst_2
         * 16: if_icmpge     43
         * 19: new           #81                 // class java/lang/NumberFormatException
         * 22: dup
         * 23: ldc           #89                 // String radix %s less than Character.MIN_RADIX
         * 25: iconst_1
         * 26: anewarray     #91                 // class java/lang/Object
         * 29: dup
         * 30: iconst_0
         * 31: iload_1
         * 32: invokestatic  #93                 // Method valueOf:(I)Ljava/lang/Integer;
         * 35: aastore
         * 36: invokestatic  #97                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
         * 39: invokespecial #85                 // Method java/lang/NumberFormatException."<init>":(Ljava/lang/String;)V
         * 42: athrow
         * 43: iload_1
         * 44: bipush        36
         * 46: if_icmple     73
         * 49: new           #81                 // class java/lang/NumberFormatException
         * 52: dup
         * 53: ldc           #101                // String radix %s greater than Character.MAX_RADIX
         * 55: iconst_1
         * 56: anewarray     #91                 // class java/lang/Object
         * 59: dup
         * 60: iconst_0
         * 61: iload_1
         * 62: invokestatic  #93                 // Method valueOf:(I)Ljava/lang/Integer;
         * 65: aastore
         * 66: invokestatic  #97                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
         * 69: invokespecial #85                 // Method java/lang/NumberFormatException."<init>":(Ljava/lang/String;)V
         * 72: athrow
         * 73: aload_0
         * 74: invokevirtual #103                // Method java/lang/String.length:()I
         * 77: istore_2
         * 78: iload_2
         * 79: ifne          89
         * 82: ldc           #107                // String
         * 84: iload_1
         * 85: invokestatic  #109                // Method java/lang/NumberFormatException.forInputString:(Ljava/lang/String;I)Ljava/lang/NumberFormatException;
         * 88: athrow
         * 89: sipush        -256
         * 92: istore_3
         * 93: iconst_0
         * 94: istore        4
         * 96: aload_0
         * 97: iload         4
         * 99: iinc          4, 1
         * 102: invokevirtual #113                // Method java/lang/String.charAt:(I)C
         * 105: istore        5
         * 107: iload         5
         * 109: bipush        45
         * 111: if_icmpeq     128
         * 114: iload         5
         * 116: bipush        43
         * 118: if_icmpeq     128
         * 121: iload         5
         * 123: iload_1
         * 124: invokestatic  #117                // Method java/lang/Character.digit:(CI)I
         * 127: istore_3
         * 128: iload_3
         * 129: ifge          144
         * 132: iload_3
         * 133: sipush        -256
         * 136: if_icmpne     279
         * 139: iload_2
         * 140: iconst_1
         * 141: if_icmple     279
         * 144: iload         5
         * 146: bipush        45
         * 148: if_icmpeq     156
         * 151: ldc           #121                // int -2147483647
         * 153: goto          158
         * 156: ldc           #122                // int -2147483648
         * 158: istore        6
         * 160: iload         6
         * 162: iload_1
         * 163: idiv
         * 164: istore        7
         * 166: iload_3
         * 167: sipush        255
         * 170: iand
         * 171: ineg
         * 172: istore        8
         * 174: iconst_1
         * 175: istore        9
         * 177: iload         4
         * 179: iload_2
         * 180: if_icmpge     248
         * 183: aload_0
         * 184: iload         4
         * 186: iinc          4, 1
         * 189: invokevirtual #113                // Method java/lang/String.charAt:(I)C
         * 192: iload_1
         * 193: invokestatic  #117                // Method java/lang/Character.digit:(CI)I
         * 196: dup
         * 197: istore_3
         * 198: iflt          248
         * 201: iload         8
         * 203: iload         7
         * 205: if_icmpgt     226
         * 208: iload         8
         * 210: iload         7
         * 212: if_icmpne     230
         * 215: iload_3
         * 216: iload_1
         * 217: iload         7
         * 219: imul
         * 220: iload         6
         * 222: isub
         * 223: if_icmpgt     230
         * 226: iconst_1
         * 227: goto          231
         * 230: iconst_0
         * 231: dup
         * 232: istore        9
         * 234: ifeq          248
         * 237: iload_1
         * 238: iload         8
         * 240: imul
         * 241: iload_3
         * 242: isub
         * 243: istore        8
         * 245: goto          177
         * 248: iload         9
         * 250: ifeq          279
         * 253: iload         4
         * 255: iload_2
         * 256: if_icmpne     279
         * 259: iload_3
         * 260: iflt          279
         * 263: iload         5
         * 265: bipush        45
         * 267: if_icmpeq     276
         * 270: iload         8
         * 272: ineg
         * 273: goto          278
         * 276: iload         8
         * 278: ireturn
         * 279: aload_0
         * 280: iload_1
         * 281: invokestatic  #109                // Method java/lang/NumberFormatException.forInputString:(Ljava/lang/String;I)Ljava/lang/NumberFormatException;
         * 284: athrow
         *  */
        // </editor-fold>
    }

    public static int parseInt(CharSequence s, int beginIndex, int endIndex, int radix) throws NumberFormatException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokestatic  #123                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         * 4: pop
         * 5: iload_1
         * 6: iload_2
         * 7: aload_0
         * 8: invokeinterface #129,  1          // InterfaceMethod java/lang/CharSequence.length:()I
         * 13: invokestatic  #132                // Method java/util/Objects.checkFromToIndex:(III)I
         * 16: pop
         * 17: iload_3
         * 18: iconst_2
         * 19: if_icmpge     46
         * 22: new           #81                 // class java/lang/NumberFormatException
         * 25: dup
         * 26: ldc           #89                 // String radix %s less than Character.MIN_RADIX
         * 28: iconst_1
         * 29: anewarray     #91                 // class java/lang/Object
         * 32: dup
         * 33: iconst_0
         * 34: iload_3
         * 35: invokestatic  #93                 // Method valueOf:(I)Ljava/lang/Integer;
         * 38: aastore
         * 39: invokestatic  #97                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
         * 42: invokespecial #85                 // Method java/lang/NumberFormatException."<init>":(Ljava/lang/String;)V
         * 45: athrow
         * 46: iload_3
         * 47: bipush        36
         * 49: if_icmple     76
         * 52: new           #81                 // class java/lang/NumberFormatException
         * 55: dup
         * 56: ldc           #101                // String radix %s greater than Character.MAX_RADIX
         * 58: iconst_1
         * 59: anewarray     #91                 // class java/lang/Object
         * 62: dup
         * 63: iconst_0
         * 64: iload_3
         * 65: invokestatic  #93                 // Method valueOf:(I)Ljava/lang/Integer;
         * 68: aastore
         * 69: invokestatic  #97                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
         * 72: invokespecial #85                 // Method java/lang/NumberFormatException."<init>":(Ljava/lang/String;)V
         * 75: athrow
         * 76: iload_1
         * 77: iload_2
         * 78: if_icmpne     88
         * 81: ldc           #107                // String
         * 83: iload_3
         * 84: invokestatic  #109                // Method java/lang/NumberFormatException.forInputString:(Ljava/lang/String;I)Ljava/lang/NumberFormatException;
         * 87: athrow
         * 88: sipush        -256
         * 91: istore        4
         * 93: iload_1
         * 94: istore        5
         * 96: aload_0
         * 97: iload         5
         * 99: iinc          5, 1
         * 102: invokeinterface #136,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C
         * 107: istore        6
         * 109: iload         6
         * 111: bipush        45
         * 113: if_icmpeq     131
         * 116: iload         6
         * 118: bipush        43
         * 120: if_icmpeq     131
         * 123: iload         6
         * 125: iload_3
         * 126: invokestatic  #117                // Method java/lang/Character.digit:(CI)I
         * 129: istore        4
         * 131: iload         4
         * 133: ifge          151
         * 136: iload         4
         * 138: sipush        -256
         * 141: if_icmpne     293
         * 144: iload_2
         * 145: iload_1
         * 146: isub
         * 147: iconst_1
         * 148: if_icmple     293
         * 151: iload         6
         * 153: bipush        45
         * 155: if_icmpeq     163
         * 158: ldc           #121                // int -2147483647
         * 160: goto          165
         * 163: ldc           #122                // int -2147483648
         * 165: istore        7
         * 167: iload         7
         * 169: iload_3
         * 170: idiv
         * 171: istore        8
         * 173: iload         4
         * 175: sipush        255
         * 178: iand
         * 179: ineg
         * 180: istore        9
         * 182: iconst_1
         * 183: istore        10
         * 185: iload         5
         * 187: iload_2
         * 188: if_icmpge     261
         * 191: aload_0
         * 192: iload         5
         * 194: iinc          5, 1
         * 197: invokeinterface #136,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C
         * 202: iload_3
         * 203: invokestatic  #117                // Method java/lang/Character.digit:(CI)I
         * 206: dup
         * 207: istore        4
         * 209: iflt          261
         * 212: iload         9
         * 214: iload         8
         * 216: if_icmpgt     238
         * 219: iload         9
         * 221: iload         8
         * 223: if_icmpne     242
         * 226: iload         4
         * 228: iload_3
         * 229: iload         8
         * 231: imul
         * 232: iload         7
         * 234: isub
         * 235: if_icmpgt     242
         * 238: iconst_1
         * 239: goto          243
         * 242: iconst_0
         * 243: dup
         * 244: istore        10
         * 246: ifeq          261
         * 249: iload_3
         * 250: iload         9
         * 252: imul
         * 253: iload         4
         * 255: isub
         * 256: istore        9
         * 258: goto          185
         * 261: iload         10
         * 263: ifeq          293
         * 266: iload         5
         * 268: iload_2
         * 269: if_icmpne     293
         * 272: iload         4
         * 274: iflt          293
         * 277: iload         6
         * 279: bipush        45
         * 281: if_icmpeq     290
         * 284: iload         9
         * 286: ineg
         * 287: goto          292
         * 290: iload         9
         * 292: ireturn
         * 293: aload_0
         * 294: iload_1
         * 295: iload_2
         * 296: iload         5
         * 298: iload         4
         * 300: iconst_m1
         * 301: if_icmpge     308
         * 304: iconst_0
         * 305: goto          309
         * 308: iconst_1
         * 309: isub
         * 310: invokestatic  #137                // Method java/lang/NumberFormatException.forCharSequence:(Ljava/lang/CharSequence;III)Ljava/lang/NumberFormatException;
         * 313: athrow
         *  */
        // </editor-fold>
    }

    public static int parseInt(String s) throws NumberFormatException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: bipush        10
         * 3: invokestatic  #141                // Method parseInt:(Ljava/lang/String;I)I
         * 6: ireturn
         *  */
        // </editor-fold>
    }

    public static int parseUnsignedInt(String s, int radix) throws NumberFormatException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: ifnonnull     14
         * 4: new           #81                 // class java/lang/NumberFormatException
         * 7: dup
         * 8: ldc           #83                 // String Cannot parse null string
         * 10: invokespecial #85                 // Method java/lang/NumberFormatException."<init>":(Ljava/lang/String;)V
         * 13: athrow
         * 14: iload_1
         * 15: iconst_2
         * 16: if_icmpge     43
         * 19: new           #81                 // class java/lang/NumberFormatException
         * 22: dup
         * 23: ldc           #89                 // String radix %s less than Character.MIN_RADIX
         * 25: iconst_1
         * 26: anewarray     #91                 // class java/lang/Object
         * 29: dup
         * 30: iconst_0
         * 31: iload_1
         * 32: invokestatic  #93                 // Method valueOf:(I)Ljava/lang/Integer;
         * 35: aastore
         * 36: invokestatic  #97                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
         * 39: invokespecial #85                 // Method java/lang/NumberFormatException."<init>":(Ljava/lang/String;)V
         * 42: athrow
         * 43: iload_1
         * 44: bipush        36
         * 46: if_icmple     73
         * 49: new           #81                 // class java/lang/NumberFormatException
         * 52: dup
         * 53: ldc           #101                // String radix %s greater than Character.MAX_RADIX
         * 55: iconst_1
         * 56: anewarray     #91                 // class java/lang/Object
         * 59: dup
         * 60: iconst_0
         * 61: iload_1
         * 62: invokestatic  #93                 // Method valueOf:(I)Ljava/lang/Integer;
         * 65: aastore
         * 66: invokestatic  #97                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
         * 69: invokespecial #85                 // Method java/lang/NumberFormatException."<init>":(Ljava/lang/String;)V
         * 72: athrow
         * 73: aload_0
         * 74: invokevirtual #103                // Method java/lang/String.length:()I
         * 77: istore_2
         * 78: iload_2
         * 79: ifne          88
         * 82: aload_0
         * 83: iload_1
         * 84: invokestatic  #109                // Method java/lang/NumberFormatException.forInputString:(Ljava/lang/String;I)Ljava/lang/NumberFormatException;
         * 87: athrow
         * 88: iconst_0
         * 89: istore_3
         * 90: aload_0
         * 91: iload_3
         * 92: iinc          3, 1
         * 95: invokevirtual #113                // Method java/lang/String.charAt:(I)C
         * 98: istore        4
         * 100: iload         4
         * 102: bipush        45
         * 104: if_icmpne     128
         * 107: new           #81                 // class java/lang/NumberFormatException
         * 110: dup
         * 111: ldc           #145                // String Illegal leading minus sign on unsigned string %s.
         * 113: iconst_1
         * 114: anewarray     #91                 // class java/lang/Object
         * 117: dup
         * 118: iconst_0
         * 119: aload_0
         * 120: aastore
         * 121: invokestatic  #97                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
         * 124: invokespecial #85                 // Method java/lang/NumberFormatException."<init>":(Ljava/lang/String;)V
         * 127: athrow
         * 128: sipush        -256
         * 131: istore        5
         * 133: iload         4
         * 135: bipush        43
         * 137: if_icmpeq     148
         * 140: iload         4
         * 142: iload_1
         * 143: invokestatic  #117                // Method java/lang/Character.digit:(CI)I
         * 146: istore        5
         * 148: iload         5
         * 150: ifge          166
         * 153: iload         5
         * 155: sipush        -256
         * 158: if_icmpne     275
         * 161: iload_2
         * 162: iconst_1
         * 163: if_icmple     275
         * 166: iconst_m1
         * 167: iload_1
         * 168: invokestatic  #147                // Method divideUnsigned:(II)I
         * 171: istore        6
         * 173: iload         5
         * 175: sipush        255
         * 178: iand
         * 179: istore        7
         * 181: iconst_1
         * 182: istore        8
         * 184: iload_3
         * 185: iload_2
         * 186: if_icmpge     257
         * 189: aload_0
         * 190: iload_3
         * 191: iinc          3, 1
         * 194: invokevirtual #113                // Method java/lang/String.charAt:(I)C
         * 197: iload_1
         * 198: invokestatic  #117                // Method java/lang/Character.digit:(CI)I
         * 201: dup
         * 202: istore        5
         * 204: iflt          257
         * 207: iload         7
         * 209: iload         6
         * 211: invokestatic  #150                // Method compareUnsigned:(II)I
         * 214: iflt          234
         * 217: iload         7
         * 219: iload         6
         * 221: if_icmpne     238
         * 224: iload         5
         * 226: iload_1
         * 227: ineg
         * 228: iload         6
         * 230: imul
         * 231: if_icmpge     238
         * 234: iconst_1
         * 235: goto          239
         * 238: iconst_0
         * 239: dup
         * 240: istore        8
         * 242: ifeq          257
         * 245: iload_1
         * 246: iload         7
         * 248: imul
         * 249: iload         5
         * 251: iadd
         * 252: istore        7
         * 254: goto          184
         * 257: iload         8
         * 259: ifeq          275
         * 262: iload_3
         * 263: iload_2
         * 264: if_icmpne     275
         * 267: iload         5
         * 269: iflt          275
         * 272: iload         7
         * 274: ireturn
         * 275: iload         5
         * 277: ifge          286
         * 280: aload_0
         * 281: iload_1
         * 282: invokestatic  #109                // Method java/lang/NumberFormatException.forInputString:(Ljava/lang/String;I)Ljava/lang/NumberFormatException;
         * 285: athrow
         * 286: new           #81                 // class java/lang/NumberFormatException
         * 289: dup
         * 290: ldc           #153                // String String value %s exceeds range of unsigned int.
         * 292: iconst_1
         * 293: anewarray     #91                 // class java/lang/Object
         * 296: dup
         * 297: iconst_0
         * 298: aload_0
         * 299: aastore
         * 300: invokestatic  #97                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
         * 303: invokespecial #85                 // Method java/lang/NumberFormatException."<init>":(Ljava/lang/String;)V
         * 306: athrow
         *  */
        // </editor-fold>
    }

    public static int parseUnsignedInt(CharSequence s, int beginIndex, int endIndex, int radix) throws NumberFormatException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokestatic  #123                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         * 4: pop
         * 5: iload_1
         * 6: iload_2
         * 7: aload_0
         * 8: invokeinterface #129,  1          // InterfaceMethod java/lang/CharSequence.length:()I
         * 13: invokestatic  #132                // Method java/util/Objects.checkFromToIndex:(III)I
         * 16: pop
         * 17: iload_3
         * 18: iconst_2
         * 19: if_icmpge     46
         * 22: new           #81                 // class java/lang/NumberFormatException
         * 25: dup
         * 26: ldc           #89                 // String radix %s less than Character.MIN_RADIX
         * 28: iconst_1
         * 29: anewarray     #91                 // class java/lang/Object
         * 32: dup
         * 33: iconst_0
         * 34: iload_3
         * 35: invokestatic  #93                 // Method valueOf:(I)Ljava/lang/Integer;
         * 38: aastore
         * 39: invokestatic  #97                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
         * 42: invokespecial #85                 // Method java/lang/NumberFormatException."<init>":(Ljava/lang/String;)V
         * 45: athrow
         * 46: iload_3
         * 47: bipush        36
         * 49: if_icmple     76
         * 52: new           #81                 // class java/lang/NumberFormatException
         * 55: dup
         * 56: ldc           #101                // String radix %s greater than Character.MAX_RADIX
         * 58: iconst_1
         * 59: anewarray     #91                 // class java/lang/Object
         * 62: dup
         * 63: iconst_0
         * 64: iload_3
         * 65: invokestatic  #93                 // Method valueOf:(I)Ljava/lang/Integer;
         * 68: aastore
         * 69: invokestatic  #97                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
         * 72: invokespecial #85                 // Method java/lang/NumberFormatException."<init>":(Ljava/lang/String;)V
         * 75: athrow
         * 76: iload_1
         * 77: iload_2
         * 78: if_icmpne     88
         * 81: ldc           #107                // String
         * 83: iload_3
         * 84: invokestatic  #109                // Method java/lang/NumberFormatException.forInputString:(Ljava/lang/String;I)Ljava/lang/NumberFormatException;
         * 87: athrow
         * 88: iload_1
         * 89: istore        4
         * 91: aload_0
         * 92: iload         4
         * 94: iinc          4, 1
         * 97: invokeinterface #136,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C
         * 102: istore        5
         * 104: iload         5
         * 106: bipush        45
         * 108: if_icmpne     143
         * 111: new           #81                 // class java/lang/NumberFormatException
         * 114: dup
         * 115: new           #155                // class java/lang/StringBuilder
         * 118: dup
         * 119: invokespecial #157                // Method java/lang/StringBuilder."<init>":()V
         * 122: ldc           #160                // String Illegal leading minus sign on unsigned string
         * 124: invokevirtual #162                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 127: aload_0
         * 128: invokevirtual #166                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 131: ldc           #169                // String .
         * 133: invokevirtual #162                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 136: invokevirtual #171                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 139: invokespecial #85                 // Method java/lang/NumberFormatException."<init>":(Ljava/lang/String;)V
         * 142: athrow
         * 143: sipush        -256
         * 146: istore        6
         * 148: iload         5
         * 150: bipush        43
         * 152: if_icmpeq     163
         * 155: iload         5
         * 157: iload_3
         * 158: invokestatic  #117                // Method java/lang/Character.digit:(CI)I
         * 161: istore        6
         * 163: iload         6
         * 165: ifge          183
         * 168: iload         6
         * 170: sipush        -256
         * 173: if_icmpne     297
         * 176: iload_2
         * 177: iload_1
         * 178: isub
         * 179: iconst_1
         * 180: if_icmple     297
         * 183: iconst_m1
         * 184: iload_3
         * 185: invokestatic  #147                // Method divideUnsigned:(II)I
         * 188: istore        7
         * 190: iload         6
         * 192: sipush        255
         * 195: iand
         * 196: istore        8
         * 198: iconst_1
         * 199: istore        9
         * 201: iload         4
         * 203: iload_2
         * 204: if_icmpge     278
         * 207: aload_0
         * 208: iload         4
         * 210: iinc          4, 1
         * 213: invokeinterface #136,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C
         * 218: iload_3
         * 219: invokestatic  #117                // Method java/lang/Character.digit:(CI)I
         * 222: dup
         * 223: istore        6
         * 225: iflt          278
         * 228: iload         8
         * 230: iload         7
         * 232: invokestatic  #150                // Method compareUnsigned:(II)I
         * 235: iflt          255
         * 238: iload         8
         * 240: iload         7
         * 242: if_icmpne     259
         * 245: iload         6
         * 247: iload_3
         * 248: ineg
         * 249: iload         7
         * 251: imul
         * 252: if_icmpge     259
         * 255: iconst_1
         * 256: goto          260
         * 259: iconst_0
         * 260: dup
         * 261: istore        9
         * 263: ifeq          278
         * 266: iload_3
         * 267: iload         8
         * 269: imul
         * 270: iload         6
         * 272: iadd
         * 273: istore        8
         * 275: goto          201
         * 278: iload         9
         * 280: ifeq          297
         * 283: iload         4
         * 285: iload_2
         * 286: if_icmpne     297
         * 289: iload         6
         * 291: iflt          297
         * 294: iload         8
         * 296: ireturn
         * 297: iload         6
         * 299: ifge          323
         * 302: aload_0
         * 303: iload_1
         * 304: iload_2
         * 305: iload         4
         * 307: iload         6
         * 309: iconst_m1
         * 310: if_icmpge     317
         * 313: iconst_0
         * 314: goto          318
         * 317: iconst_1
         * 318: isub
         * 319: invokestatic  #137                // Method java/lang/NumberFormatException.forCharSequence:(Ljava/lang/CharSequence;III)Ljava/lang/NumberFormatException;
         * 322: athrow
         * 323: new           #81                 // class java/lang/NumberFormatException
         * 326: dup
         * 327: ldc           #153                // String String value %s exceeds range of unsigned int.
         * 329: iconst_1
         * 330: anewarray     #91                 // class java/lang/Object
         * 333: dup
         * 334: iconst_0
         * 335: aload_0
         * 336: aastore
         * 337: invokestatic  #97                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
         * 340: invokespecial #85                 // Method java/lang/NumberFormatException."<init>":(Ljava/lang/String;)V
         * 343: athrow
         *  */
        // </editor-fold>
    }

    public static int parseUnsignedInt(String s) throws NumberFormatException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: bipush        10
         * 3: invokestatic  #174                // Method parseUnsignedInt:(Ljava/lang/String;I)I
         * 6: ireturn
         *  */
        // </editor-fold>
    }

    public static Integer valueOf(String s, int radix) throws NumberFormatException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iload_1
         * 2: invokestatic  #141                // Method parseInt:(Ljava/lang/String;I)I
         * 5: invokestatic  #93                 // Method valueOf:(I)Ljava/lang/Integer;
         * 8: areturn
         *  */
        // </editor-fold>
    }

    public static Integer valueOf(String s) throws NumberFormatException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: bipush        10
         * 3: invokestatic  #141                // Method parseInt:(Ljava/lang/String;I)I
         * 6: invokestatic  #93                 // Method valueOf:(I)Ljava/lang/Integer;
         * 9: areturn
         *  */
        // </editor-fold>
    }

    @IntrinsicCandidate
    public static Integer valueOf(int i) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: bipush        -128
         * 3: if_icmplt     23
         * 6: iload_0
         * 7: getstatic     #179                // Field java/lang/Integer$IntegerCache.high:I
         * 10: if_icmpgt     23
         * 13: getstatic     #183                // Field java/lang/Integer$IntegerCache.cache:[Ljava/lang/Integer;
         * 16: iload_0
         * 17: sipush        128
         * 20: iadd
         * 21: aaload
         * 22: areturn
         * 23: new           #1                  // class java/lang/Integer
         * 26: dup
         * 27: iload_0
         * 28: invokespecial #187                // Method "<init>":(I)V
         * 31: areturn
         *  */
        // </editor-fold>
    }

    @Deprecated(since = "9")
    public Integer(int value) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #190                // Method java/lang/Number."<init>":()V
         * 4: aload_0
         * 5: iload_1
         * 6: putfield      #193                // Field value:I
         * 9: return
         *  */
        // </editor-fold>
    }

    @Deprecated(since = "9")
    public Integer(String s) throws NumberFormatException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #190                // Method java/lang/Number."<init>":()V
         * 4: aload_0
         * 5: aload_1
         * 6: bipush        10
         * 8: invokestatic  #141                // Method parseInt:(Ljava/lang/String;I)I
         * 11: putfield      #193                // Field value:I
         * 14: return
         *  */
        // </editor-fold>
    }

    public byte byteValue() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #193                // Field value:I
         * 4: i2b
         * 5: ireturn
         *  */
        // </editor-fold>
    }

    public short shortValue() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #193                // Field value:I
         * 4: i2s
         * 5: ireturn
         *  */
        // </editor-fold>
    }

    @IntrinsicCandidate
    public int intValue() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #193                // Field value:I
         * 4: ireturn
         *  */
        // </editor-fold>
    }

    public long longValue() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #193                // Field value:I
         * 4: i2l
         * 5: lreturn
         *  */
        // </editor-fold>
    }

    public float floatValue() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #193                // Field value:I
         * 4: i2f
         * 5: freturn
         *  */
        // </editor-fold>
    }

    public double doubleValue() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #193                // Field value:I
         * 4: i2d
         * 5: dreturn
         *  */
        // </editor-fold>
    }

    public String toString() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #193                // Field value:I
         * 4: invokestatic  #7                  // Method toString:(I)Ljava/lang/String;
         * 7: areturn
         *  */
        // </editor-fold>
    }

    public int hashCode() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #193                // Field value:I
         * 4: invokestatic  #196                // Method hashCode:(I)I
         * 7: ireturn
         *  */
        // </editor-fold>
    }

    public static int hashCode(int value) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: ireturn
         *  */
        // </editor-fold>
    }

    public boolean equals(Object obj) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: instanceof    #1                  // class java/lang/Integer
         * 4: ifeq          29
         * 7: aload_1
         * 8: checkcast     #1                  // class java/lang/Integer
         * 11: astore_2
         * 12: aload_0
         * 13: getfield      #193                // Field value:I
         * 16: aload_2
         * 17: invokevirtual #199                // Method intValue:()I
         * 20: if_icmpne     27
         * 23: iconst_1
         * 24: goto          28
         * 27: iconst_0
         * 28: ireturn
         * 29: iconst_0
         * 30: ireturn
         *  */
        // </editor-fold>
    }

    public static Integer getInteger(String nm) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aconst_null
         * 2: invokestatic  #202                // Method getInteger:(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
         * 5: areturn
         *  */
        // </editor-fold>
    }

    public static Integer getInteger(String nm, int val) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aconst_null
         * 2: invokestatic  #202                // Method getInteger:(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
         * 5: astore_2
         * 6: aload_2
         * 7: ifnonnull     17
         * 10: iload_1
         * 11: invokestatic  #93                 // Method valueOf:(I)Ljava/lang/Integer;
         * 14: goto          18
         * 17: aload_2
         * 18: areturn
         *  */
        // </editor-fold>
    }

    public static Integer getInteger(String nm, Integer val) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: ifnull        18
         * 4: aload_0
         * 5: invokevirtual #206                // Method java/lang/String.isEmpty:()Z
         * 8: ifne          18
         * 11: aload_0
         * 12: invokestatic  #210                // Method java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
         * 15: goto          19
         * 18: aconst_null
         * 19: astore_2
         * 20: aload_2
         * 21: ifnull        30
         * 24: aload_2
         * 25: invokestatic  #216                // Method decode:(Ljava/lang/String;)Ljava/lang/Integer;
         * 28: areturn
         * 29: astore_3
         * 30: aload_1
         * 31: areturn
         * Exception table:
         * from    to  target type
         * 24    28    29   Class java/lang/NumberFormatException
         *  */
        // </editor-fold>
    }

    public static Integer decode(String nm) throws NumberFormatException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: bipush        10
         * 2: istore_1
         * 3: iconst_0
         * 4: istore_2
         * 5: iconst_0
         * 6: istore_3
         * 7: aload_0
         * 8: invokevirtual #206                // Method java/lang/String.isEmpty:()Z
         * 11: ifeq          24
         * 14: new           #81                 // class java/lang/NumberFormatException
         * 17: dup
         * 18: ldc           #220                // String Zero length string
         * 20: invokespecial #85                 // Method java/lang/NumberFormatException."<init>":(Ljava/lang/String;)V
         * 23: athrow
         * 24: aload_0
         * 25: iconst_0
         * 26: invokevirtual #113                // Method java/lang/String.charAt:(I)C
         * 29: istore        5
         * 31: iload         5
         * 33: bipush        45
         * 35: if_icmpne     46
         * 38: iconst_1
         * 39: istore_3
         * 40: iinc          2, 1
         * 43: goto          56
         * 46: iload         5
         * 48: bipush        43
         * 50: if_icmpne     56
         * 53: iinc          2, 1
         * 56: aload_0
         * 57: ldc           #222                // String 0x
         * 59: iload_2
         * 60: invokevirtual #224                // Method java/lang/String.startsWith:(Ljava/lang/String;I)Z
         * 63: ifne          76
         * 66: aload_0
         * 67: ldc           #228                // String 0X
         * 69: iload_2
         * 70: invokevirtual #224                // Method java/lang/String.startsWith:(Ljava/lang/String;I)Z
         * 73: ifeq          85
         * 76: iinc          2, 2
         * 79: bipush        16
         * 81: istore_1
         * 82: goto          130
         * 85: aload_0
         * 86: ldc           #230                // String #
         * 88: iload_2
         * 89: invokevirtual #224                // Method java/lang/String.startsWith:(Ljava/lang/String;I)Z
         * 92: ifeq          104
         * 95: iinc          2, 1
         * 98: bipush        16
         * 100: istore_1
         * 101: goto          130
         * 104: aload_0
         * 105: ldc           #232                // String 0
         * 107: iload_2
         * 108: invokevirtual #224                // Method java/lang/String.startsWith:(Ljava/lang/String;I)Z
         * 111: ifeq          130
         * 114: aload_0
         * 115: invokevirtual #103                // Method java/lang/String.length:()I
         * 118: iconst_1
         * 119: iload_2
         * 120: iadd
         * 121: if_icmple     130
         * 124: iinc          2, 1
         * 127: bipush        8
         * 129: istore_1
         * 130: aload_0
         * 131: ldc           #234                // String -
         * 133: iload_2
         * 134: invokevirtual #224                // Method java/lang/String.startsWith:(Ljava/lang/String;I)Z
         * 137: ifne          150
         * 140: aload_0
         * 141: ldc           #236                // String +
         * 143: iload_2
         * 144: invokevirtual #224                // Method java/lang/String.startsWith:(Ljava/lang/String;I)Z
         * 147: ifeq          160
         * 150: new           #81                 // class java/lang/NumberFormatException
         * 153: dup
         * 154: ldc           #238                // String Sign character in wrong position
         * 156: invokespecial #85                 // Method java/lang/NumberFormatException."<init>":(Ljava/lang/String;)V
         * 159: athrow
         * 160: aload_0
         * 161: iload_2
         * 162: aload_0
         * 163: invokevirtual #103                // Method java/lang/String.length:()I
         * 166: iload_1
         * 167: invokestatic  #240                // Method parseInt:(Ljava/lang/CharSequence;III)I
         * 170: istore        4
         * 172: iload_3
         * 173: ifeq          182
         * 176: iload         4
         * 178: ineg
         * 179: goto          184
         * 182: iload         4
         * 184: istore        4
         * 186: goto          236
         * 189: astore        6
         * 191: iload_3
         * 192: ifeq          221
         * 195: new           #155                // class java/lang/StringBuilder
         * 198: dup
         * 199: invokespecial #157                // Method java/lang/StringBuilder."<init>":()V
         * 202: ldc           #234                // String -
         * 204: invokevirtual #162                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 207: aload_0
         * 208: iload_2
         * 209: invokevirtual #243                // Method java/lang/String.substring:(I)Ljava/lang/String;
         * 212: invokevirtual #162                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 215: invokevirtual #171                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 218: goto          226
         * 221: aload_0
         * 222: iload_2
         * 223: invokevirtual #243                // Method java/lang/String.substring:(I)Ljava/lang/String;
         * 226: astore        7
         * 228: aload         7
         * 230: iload_1
         * 231: invokestatic  #141                // Method parseInt:(Ljava/lang/String;I)I
         * 234: istore        4
         * 236: iload         4
         * 238: invokestatic  #93                 // Method valueOf:(I)Ljava/lang/Integer;
         * 241: areturn
         * Exception table:
         * from    to  target type
         * 160   186   189   Class java/lang/NumberFormatException
         *  */
        // </editor-fold>
    }

    public int compareTo(Integer anotherInteger) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #193                // Field value:I
         * 4: aload_1
         * 5: getfield      #193                // Field value:I
         * 8: invokestatic  #246                // Method compare:(II)I
         * 11: ireturn
         *  */
        // </editor-fold>
    }

    public static int compare(int x, int y) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: iload_1
         * 2: if_icmpge     9
         * 5: iconst_m1
         * 6: goto          19
         * 9: iload_0
         * 10: iload_1
         * 11: if_icmpne     18
         * 14: iconst_0
         * 15: goto          19
         * 18: iconst_1
         * 19: ireturn
         *  */
        // </editor-fold>
    }

    @IntrinsicCandidate
    public static int compareUnsigned(int x, int y) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: ldc           #122                // int -2147483648
         * 3: iadd
         * 4: iload_1
         * 5: ldc           #122                // int -2147483648
         * 7: iadd
         * 8: invokestatic  #246                // Method compare:(II)I
         * 11: ireturn
         *  */
        // </editor-fold>
    }

    public static long toUnsignedLong(int x) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: i2l
         * 2: ldc2_w        #249                // long 4294967295l
         * 5: land
         * 6: lreturn
         *  */
        // </editor-fold>
    }

    @IntrinsicCandidate
    public static int divideUnsigned(int dividend, int divisor) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: invokestatic  #38                 // Method toUnsignedLong:(I)J
         * 4: iload_1
         * 5: invokestatic  #38                 // Method toUnsignedLong:(I)J
         * 8: ldiv
         * 9: l2i
         * 10: ireturn
         *  */
        // </editor-fold>
    }

    @IntrinsicCandidate
    public static int remainderUnsigned(int dividend, int divisor) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: invokestatic  #38                 // Method toUnsignedLong:(I)J
         * 4: iload_1
         * 5: invokestatic  #38                 // Method toUnsignedLong:(I)J
         * 8: lrem
         * 9: l2i
         * 10: ireturn
         *  */
        // </editor-fold>
    }

    public static int highestOneBit(int i) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: ldc           #122                // int -2147483648
         * 3: iload_0
         * 4: invokestatic  #51                 // Method numberOfLeadingZeros:(I)I
         * 7: iushr
         * 8: iand
         * 9: ireturn
         *  */
        // </editor-fold>
    }

    public static int lowestOneBit(int i) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: iload_0
         * 2: ineg
         * 3: iand
         * 4: ireturn
         *  */
        // </editor-fold>
    }

    @IntrinsicCandidate
    public static int numberOfLeadingZeros(int i) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: ifgt          15
         * 4: iload_0
         * 5: ifne          13
         * 8: bipush        32
         * 10: goto          14
         * 13: iconst_0
         * 14: ireturn
         * 15: bipush        31
         * 17: istore_1
         * 18: iload_0
         * 19: ldc           #251                // int 65536
         * 21: if_icmplt     32
         * 24: iinc          1, -16
         * 27: iload_0
         * 28: bipush        16
         * 30: iushr
         * 31: istore_0
         * 32: iload_0
         * 33: sipush        256
         * 36: if_icmplt     47
         * 39: iinc          1, -8
         * 42: iload_0
         * 43: bipush        8
         * 45: iushr
         * 46: istore_0
         * 47: iload_0
         * 48: bipush        16
         * 50: if_icmplt     60
         * 53: iinc          1, -4
         * 56: iload_0
         * 57: iconst_4
         * 58: iushr
         * 59: istore_0
         * 60: iload_0
         * 61: iconst_4
         * 62: if_icmplt     72
         * 65: iinc          1, -2
         * 68: iload_0
         * 69: iconst_2
         * 70: iushr
         * 71: istore_0
         * 72: iload_1
         * 73: iload_0
         * 74: iconst_1
         * 75: iushr
         * 76: isub
         * 77: ireturn
         *  */
        // </editor-fold>
    }

    @IntrinsicCandidate
    public static int numberOfTrailingZeros(int i) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: iconst_m1
         * 2: ixor
         * 3: iload_0
         * 4: iconst_1
         * 5: isub
         * 6: iand
         * 7: istore_0
         * 8: iload_0
         * 9: ifgt          17
         * 12: iload_0
         * 13: bipush        32
         * 15: iand
         * 16: ireturn
         * 17: iconst_1
         * 18: istore_1
         * 19: iload_0
         * 20: ldc           #251                // int 65536
         * 22: if_icmple     33
         * 25: iinc          1, 16
         * 28: iload_0
         * 29: bipush        16
         * 31: iushr
         * 32: istore_0
         * 33: iload_0
         * 34: sipush        256
         * 37: if_icmple     48
         * 40: iinc          1, 8
         * 43: iload_0
         * 44: bipush        8
         * 46: iushr
         * 47: istore_0
         * 48: iload_0
         * 49: bipush        16
         * 51: if_icmple     61
         * 54: iinc          1, 4
         * 57: iload_0
         * 58: iconst_4
         * 59: iushr
         * 60: istore_0
         * 61: iload_0
         * 62: iconst_4
         * 63: if_icmple     73
         * 66: iinc          1, 2
         * 69: iload_0
         * 70: iconst_2
         * 71: iushr
         * 72: istore_0
         * 73: iload_1
         * 74: iload_0
         * 75: iconst_1
         * 76: iushr
         * 77: iadd
         * 78: ireturn
         *  */
        // </editor-fold>
    }

    @IntrinsicCandidate
    public static int bitCount(int i) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: iload_0
         * 2: iconst_1
         * 3: iushr
         * 4: ldc           #252                // int 1431655765
         * 6: iand
         * 7: isub
         * 8: istore_0
         * 9: iload_0
         * 10: ldc           #253                // int 858993459
         * 12: iand
         * 13: iload_0
         * 14: iconst_2
         * 15: iushr
         * 16: ldc           #253                // int 858993459
         * 18: iand
         * 19: iadd
         * 20: istore_0
         * 21: iload_0
         * 22: iload_0
         * 23: iconst_4
         * 24: iushr
         * 25: iadd
         * 26: ldc           #254                // int 252645135
         * 28: iand
         * 29: istore_0
         * 30: iload_0
         * 31: iload_0
         * 32: bipush        8
         * 34: iushr
         * 35: iadd
         * 36: istore_0
         * 37: iload_0
         * 38: iload_0
         * 39: bipush        16
         * 41: iushr
         * 42: iadd
         * 43: istore_0
         * 44: iload_0
         * 45: bipush        63
         * 47: iand
         * 48: ireturn
         *  */
        // </editor-fold>
    }

    public static int rotateLeft(int i, int distance) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: iload_1
         * 2: ishl
         * 3: iload_0
         * 4: iload_1
         * 5: ineg
         * 6: iushr
         * 7: ior
         * 8: ireturn
         *  */
        // </editor-fold>
    }

    public static int rotateRight(int i, int distance) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: iload_1
         * 2: iushr
         * 3: iload_0
         * 4: iload_1
         * 5: ineg
         * 6: ishl
         * 7: ior
         * 8: ireturn
         *  */
        // </editor-fold>
    }

    @IntrinsicCandidate
    public static int reverse(int i) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: ldc           #252                // int 1431655765
         * 3: iand
         * 4: iconst_1
         * 5: ishl
         * 6: iload_0
         * 7: iconst_1
         * 8: iushr
         * 9: ldc           #252                // int 1431655765
         * 11: iand
         * 12: ior
         * 13: istore_0
         * 14: iload_0
         * 15: ldc           #253                // int 858993459
         * 17: iand
         * 18: iconst_2
         * 19: ishl
         * 20: iload_0
         * 21: iconst_2
         * 22: iushr
         * 23: ldc           #253                // int 858993459
         * 25: iand
         * 26: ior
         * 27: istore_0
         * 28: iload_0
         * 29: ldc           #254                // int 252645135
         * 31: iand
         * 32: iconst_4
         * 33: ishl
         * 34: iload_0
         * 35: iconst_4
         * 36: iushr
         * 37: ldc           #254                // int 252645135
         * 39: iand
         * 40: ior
         * 41: istore_0
         * 42: iload_0
         * 43: invokestatic  #255                // Method reverseBytes:(I)I
         * 46: ireturn
         *  */
        // </editor-fold>
    }

    @IntrinsicCandidate
    public static int compress(int i, int mask) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: iload_1
         * 2: iand
         * 3: istore_0
         * 4: iload_1
         * 5: iconst_m1
         * 6: ixor
         * 7: iconst_1
         * 8: ishl
         * 9: istore_2
         * 10: iconst_0
         * 11: istore_3
         * 12: iload_3
         * 13: iconst_5
         * 14: if_icmpge     72
         * 17: iload_2
         * 18: invokestatic  #258                // Method parallelSuffix:(I)I
         * 21: istore        4
         * 23: iload         4
         * 25: iload_1
         * 26: iand
         * 27: istore        5
         * 29: iload_1
         * 30: iload         5
         * 32: ixor
         * 33: iload         5
         * 35: iconst_1
         * 36: iload_3
         * 37: ishl
         * 38: iushr
         * 39: ior
         * 40: istore_1
         * 41: iload_0
         * 42: iload         5
         * 44: iand
         * 45: istore        6
         * 47: iload_0
         * 48: iload         6
         * 50: ixor
         * 51: iload         6
         * 53: iconst_1
         * 54: iload_3
         * 55: ishl
         * 56: iushr
         * 57: ior
         * 58: istore_0
         * 59: iload_2
         * 60: iload         4
         * 62: iconst_m1
         * 63: ixor
         * 64: iand
         * 65: istore_2
         * 66: iinc          3, 1
         * 69: goto          12
         * 72: iload_0
         * 73: ireturn
         *  */
        // </editor-fold>
    }

    @IntrinsicCandidate
    public static int expand(int i, int mask) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_1
         * 1: istore_2
         * 2: iload_1
         * 3: iconst_m1
         * 4: ixor
         * 5: iconst_1
         * 6: ishl
         * 7: istore_3
         * 8: iload_3
         * 9: invokestatic  #258                // Method parallelSuffix:(I)I
         * 12: istore        4
         * 14: iload         4
         * 16: iload_1
         * 17: iand
         * 18: istore        5
         * 20: iload_1
         * 21: iload         5
         * 23: ixor
         * 24: iload         5
         * 26: iconst_1
         * 27: iushr
         * 28: ior
         * 29: istore_1
         * 30: iload_3
         * 31: iload         4
         * 33: iconst_m1
         * 34: ixor
         * 35: iand
         * 36: istore_3
         * 37: iload_3
         * 38: invokestatic  #258                // Method parallelSuffix:(I)I
         * 41: istore        4
         * 43: iload         4
         * 45: iload_1
         * 46: iand
         * 47: istore        6
         * 49: iload_1
         * 50: iload         6
         * 52: ixor
         * 53: iload         6
         * 55: iconst_2
         * 56: iushr
         * 57: ior
         * 58: istore_1
         * 59: iload_3
         * 60: iload         4
         * 62: iconst_m1
         * 63: ixor
         * 64: iand
         * 65: istore_3
         * 66: iload_3
         * 67: invokestatic  #258                // Method parallelSuffix:(I)I
         * 70: istore        4
         * 72: iload         4
         * 74: iload_1
         * 75: iand
         * 76: istore        7
         * 78: iload_1
         * 79: iload         7
         * 81: ixor
         * 82: iload         7
         * 84: iconst_4
         * 85: iushr
         * 86: ior
         * 87: istore_1
         * 88: iload_3
         * 89: iload         4
         * 91: iconst_m1
         * 92: ixor
         * 93: iand
         * 94: istore_3
         * 95: iload_3
         * 96: invokestatic  #258                // Method parallelSuffix:(I)I
         * 99: istore        4
         * 101: iload         4
         * 103: iload_1
         * 104: iand
         * 105: istore        8
         * 107: iload_1
         * 108: iload         8
         * 110: ixor
         * 111: iload         8
         * 113: bipush        8
         * 115: iushr
         * 116: ior
         * 117: istore_1
         * 118: iload_3
         * 119: iload         4
         * 121: iconst_m1
         * 122: ixor
         * 123: iand
         * 124: istore_3
         * 125: iload_3
         * 126: invokestatic  #258                // Method parallelSuffix:(I)I
         * 129: istore        4
         * 131: iload         4
         * 133: iload_1
         * 134: iand
         * 135: istore        9
         * 137: iload_0
         * 138: bipush        16
         * 140: ishl
         * 141: istore        10
         * 143: iload_0
         * 144: iload         9
         * 146: iconst_m1
         * 147: ixor
         * 148: iand
         * 149: iload         10
         * 151: iload         9
         * 153: iand
         * 154: ior
         * 155: istore_0
         * 156: iload_0
         * 157: bipush        8
         * 159: ishl
         * 160: istore        10
         * 162: iload_0
         * 163: iload         8
         * 165: iconst_m1
         * 166: ixor
         * 167: iand
         * 168: iload         10
         * 170: iload         8
         * 172: iand
         * 173: ior
         * 174: istore_0
         * 175: iload_0
         * 176: iconst_4
         * 177: ishl
         * 178: istore        10
         * 180: iload_0
         * 181: iload         7
         * 183: iconst_m1
         * 184: ixor
         * 185: iand
         * 186: iload         10
         * 188: iload         7
         * 190: iand
         * 191: ior
         * 192: istore_0
         * 193: iload_0
         * 194: iconst_2
         * 195: ishl
         * 196: istore        10
         * 198: iload_0
         * 199: iload         6
         * 201: iconst_m1
         * 202: ixor
         * 203: iand
         * 204: iload         10
         * 206: iload         6
         * 208: iand
         * 209: ior
         * 210: istore_0
         * 211: iload_0
         * 212: iconst_1
         * 213: ishl
         * 214: istore        10
         * 216: iload_0
         * 217: iload         5
         * 219: iconst_m1
         * 220: ixor
         * 221: iand
         * 222: iload         10
         * 224: iload         5
         * 226: iand
         * 227: ior
         * 228: istore_0
         * 229: iload_0
         * 230: iload_2
         * 231: iand
         * 232: ireturn
         *  */
        // </editor-fold>
    }

    @ForceInline
    private static int parallelSuffix(int maskCount) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: iload_0
         * 2: iconst_1
         * 3: ishl
         * 4: ixor
         * 5: istore_1
         * 6: iload_1
         * 7: iload_1
         * 8: iconst_2
         * 9: ishl
         * 10: ixor
         * 11: istore_1
         * 12: iload_1
         * 13: iload_1
         * 14: iconst_4
         * 15: ishl
         * 16: ixor
         * 17: istore_1
         * 18: iload_1
         * 19: iload_1
         * 20: bipush        8
         * 22: ishl
         * 23: ixor
         * 24: istore_1
         * 25: iload_1
         * 26: iload_1
         * 27: bipush        16
         * 29: ishl
         * 30: ixor
         * 31: istore_1
         * 32: iload_1
         * 33: ireturn
         *  */
        // </editor-fold>
    }

    public static int signum(int i) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: bipush        31
         * 3: ishr
         * 4: iload_0
         * 5: ineg
         * 6: bipush        31
         * 8: iushr
         * 9: ior
         * 10: ireturn
         *  */
        // </editor-fold>
    }

    @IntrinsicCandidate
    public static int reverseBytes(int i) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: bipush        24
         * 3: ishl
         * 4: iload_0
         * 5: ldc_w         #261                // int 65280
         * 8: iand
         * 9: bipush        8
         * 11: ishl
         * 12: ior
         * 13: iload_0
         * 14: bipush        8
         * 16: iushr
         * 17: ldc_w         #261                // int 65280
         * 20: iand
         * 21: ior
         * 22: iload_0
         * 23: bipush        24
         * 25: iushr
         * 26: ior
         * 27: ireturn
         *  */
        // </editor-fold>
    }

    public static int sum(int a, int b) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: iload_1
         * 2: iadd
         * 3: ireturn
         *  */
        // </editor-fold>
    }

    public static int max(int a, int b) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: iload_1
         * 2: invokestatic  #55                 // Method java/lang/Math.max:(II)I
         * 5: ireturn
         *  */
        // </editor-fold>
    }

    public static int min(int a, int b) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: iload_1
         * 2: invokestatic  #262                // Method java/lang/Math.min:(II)I
         * 5: ireturn
         *  */
        // </editor-fold>
    }

    public Optional<Integer> describeConstable() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokestatic  #265                // Method java/util/Optional.of:(Ljava/lang/Object;)Ljava/util/Optional;
         * 4: areturn
         *  */
        // </editor-fold>
    }

    public Integer resolveConstantDesc(MethodHandles.Lookup lookup) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: areturn
         *  */
        // </editor-fold>
    }
}
