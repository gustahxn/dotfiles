package java.io;

import java.nio.charset.Charset;
import java.util.Formatter;
import java.util.Locale;

public class PrintStream extends FilterOutputStream implements Appendable, Closeable {

    private final boolean autoFlush;
    private boolean trouble;
    private Formatter formatter;
    private final Charset charset;
    private BufferedWriter textOut;
    private OutputStreamWriter charOut;
    private boolean closing;

    private static <T extends Object> T requireNonNull(T obj, String message) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: ifnonnull     13
         * 4: new           #1                  // class java/lang/NullPointerException
         * 7: dup
         * 8: aload_1
         * 9: invokespecial #3                  // Method java/lang/NullPointerException."<init>":(Ljava/lang/String;)V
         * 12: athrow
         * 13: aload_0
         * 14: areturn
         *  */
        // </editor-fold>
    }

    private static Charset toCharset(String csn) throws UnsupportedEncodingException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: ldc           #7                  // String charsetName
         * 3: invokestatic  #9                  // Method requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
         * 6: pop
         * 7: aload_0
         * 8: invokestatic  #15                 // Method java/nio/charset/Charset.forName:(Ljava/lang/String;)Ljava/nio/charset/Charset;
         * 11: areturn
         * 12: astore_1
         * 13: new           #25                 // class java/io/UnsupportedEncodingException
         * 16: dup
         * 17: aload_0
         * 18: invokespecial #27                 // Method java/io/UnsupportedEncodingException."<init>":(Ljava/lang/String;)V
         * 21: athrow
         * Exception table:
         * from    to  target type
         * 7    11    12   Class java/nio/charset/IllegalCharsetNameException
         * 7    11    12   Class java/nio/charset/UnsupportedCharsetException
         *  */
        // </editor-fold>
    }

    private PrintStream(boolean autoFlush, OutputStream out) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_2
         * 2: invokespecial #28                 // Method java/io/FilterOutputStream."<init>":(Ljava/io/OutputStream;)V
         * 5: aload_0
         * 6: iconst_0
         * 7: putfield      #33                 // Field trouble:Z
         * 10: aload_0
         * 11: iconst_0
         * 12: putfield      #37                 // Field closing:Z
         * 15: aload_0
         * 16: iload_1
         * 17: putfield      #40                 // Field autoFlush:Z
         * 20: aload_0
         * 21: aload_2
         * 22: instanceof    #10                 // class java/io/PrintStream
         * 25: ifeq          40
         * 28: aload_2
         * 29: checkcast     #10                 // class java/io/PrintStream
         * 32: astore_3
         * 33: aload_3
         * 34: invokevirtual #43                 // Method charset:()Ljava/nio/charset/Charset;
         * 37: goto          43
         * 40: invokestatic  #47                 // Method java/nio/charset/Charset.defaultCharset:()Ljava/nio/charset/Charset;
         * 43: putfield      #50                 // Field charset:Ljava/nio/charset/Charset;
         * 46: aload_0
         * 47: new           #53                 // class java/io/OutputStreamWriter
         * 50: dup
         * 51: aload_0
         * 52: aload_0
         * 53: getfield      #50                 // Field charset:Ljava/nio/charset/Charset;
         * 56: invokespecial #55                 // Method java/io/OutputStreamWriter."<init>":(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
         * 59: putfield      #58                 // Field charOut:Ljava/io/OutputStreamWriter;
         * 62: aload_0
         * 63: new           #62                 // class java/io/BufferedWriter
         * 66: dup
         * 67: aload_0
         * 68: getfield      #58                 // Field charOut:Ljava/io/OutputStreamWriter;
         * 71: invokespecial #64                 // Method java/io/BufferedWriter."<init>":(Ljava/io/Writer;)V
         * 74: putfield      #67                 // Field textOut:Ljava/io/BufferedWriter;
         * 77: return
         *  */
        // </editor-fold>
    }

    private PrintStream(boolean autoFlush, Charset charset, OutputStream out) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_3
         * 2: iload_1
         * 3: aload_2
         * 4: invokespecial #71                 // Method "<init>":(Ljava/io/OutputStream;ZLjava/nio/charset/Charset;)V
         * 7: return
         *  */
        // </editor-fold>
    }

    public PrintStream(OutputStream out) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: iconst_0
         * 3: invokespecial #74                 // Method "<init>":(Ljava/io/OutputStream;Z)V
         * 6: return
         *  */
        // </editor-fold>
    }

    public PrintStream(OutputStream out, boolean autoFlush) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iload_2
         * 2: aload_1
         * 3: ldc           #77                 // String Null output stream
         * 5: invokestatic  #9                  // Method requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
         * 8: checkcast     #79                 // class java/io/OutputStream
         * 11: invokespecial #81                 // Method "<init>":(ZLjava/io/OutputStream;)V
         * 14: return
         *  */
        // </editor-fold>
    }

    public PrintStream(OutputStream out, boolean autoFlush, String encoding) throws UnsupportedEncodingException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: ldc           #77                 // String Null output stream
         * 4: invokestatic  #9                  // Method requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
         * 7: checkcast     #79                 // class java/io/OutputStream
         * 10: iload_2
         * 11: aload_3
         * 12: invokestatic  #84                 // Method toCharset:(Ljava/lang/String;)Ljava/nio/charset/Charset;
         * 15: invokespecial #71                 // Method "<init>":(Ljava/io/OutputStream;ZLjava/nio/charset/Charset;)V
         * 18: return
         *  */
        // </editor-fold>
    }

    public PrintStream(OutputStream out, boolean autoFlush, Charset charset) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokespecial #28                 // Method java/io/FilterOutputStream."<init>":(Ljava/io/OutputStream;)V
         * 5: aload_0
         * 6: iconst_0
         * 7: putfield      #33                 // Field trouble:Z
         * 10: aload_0
         * 11: iconst_0
         * 12: putfield      #37                 // Field closing:Z
         * 15: aload_0
         * 16: iload_2
         * 17: putfield      #40                 // Field autoFlush:Z
         * 20: aload_0
         * 21: new           #53                 // class java/io/OutputStreamWriter
         * 24: dup
         * 25: aload_0
         * 26: aload_3
         * 27: invokespecial #55                 // Method java/io/OutputStreamWriter."<init>":(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
         * 30: putfield      #58                 // Field charOut:Ljava/io/OutputStreamWriter;
         * 33: aload_0
         * 34: new           #62                 // class java/io/BufferedWriter
         * 37: dup
         * 38: aload_0
         * 39: getfield      #58                 // Field charOut:Ljava/io/OutputStreamWriter;
         * 42: invokespecial #64                 // Method java/io/BufferedWriter."<init>":(Ljava/io/Writer;)V
         * 45: putfield      #67                 // Field textOut:Ljava/io/BufferedWriter;
         * 48: aload_0
         * 49: aload_3
         * 50: putfield      #50                 // Field charset:Ljava/nio/charset/Charset;
         * 53: return
         *  */
        // </editor-fold>
    }

    public PrintStream(String fileName) throws FileNotFoundException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iconst_0
         * 2: new           #87                 // class java/io/FileOutputStream
         * 5: dup
         * 6: aload_1
         * 7: invokespecial #89                 // Method java/io/FileOutputStream."<init>":(Ljava/lang/String;)V
         * 10: invokespecial #81                 // Method "<init>":(ZLjava/io/OutputStream;)V
         * 13: return
         *  */
        // </editor-fold>
    }

    public PrintStream(String fileName, String csn) throws FileNotFoundException, UnsupportedEncodingException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iconst_0
         * 2: aload_2
         * 3: invokestatic  #84                 // Method toCharset:(Ljava/lang/String;)Ljava/nio/charset/Charset;
         * 6: new           #87                 // class java/io/FileOutputStream
         * 9: dup
         * 10: aload_1
         * 11: invokespecial #89                 // Method java/io/FileOutputStream."<init>":(Ljava/lang/String;)V
         * 14: invokespecial #90                 // Method "<init>":(ZLjava/nio/charset/Charset;Ljava/io/OutputStream;)V
         * 17: return
         *  */
        // </editor-fold>
    }

    public PrintStream(String fileName, Charset charset) throws IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iconst_0
         * 2: aload_2
         * 3: ldc           #93                 // String charset
         * 5: invokestatic  #9                  // Method requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
         * 8: checkcast     #16                 // class java/nio/charset/Charset
         * 11: new           #87                 // class java/io/FileOutputStream
         * 14: dup
         * 15: aload_1
         * 16: invokespecial #89                 // Method java/io/FileOutputStream."<init>":(Ljava/lang/String;)V
         * 19: invokespecial #90                 // Method "<init>":(ZLjava/nio/charset/Charset;Ljava/io/OutputStream;)V
         * 22: return
         *  */
        // </editor-fold>
    }

    public PrintStream(File file) throws FileNotFoundException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iconst_0
         * 2: new           #87                 // class java/io/FileOutputStream
         * 5: dup
         * 6: aload_1
         * 7: invokespecial #94                 // Method java/io/FileOutputStream."<init>":(Ljava/io/File;)V
         * 10: invokespecial #81                 // Method "<init>":(ZLjava/io/OutputStream;)V
         * 13: return
         *  */
        // </editor-fold>
    }

    public PrintStream(File file, String csn) throws FileNotFoundException, UnsupportedEncodingException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iconst_0
         * 2: aload_2
         * 3: invokestatic  #84                 // Method toCharset:(Ljava/lang/String;)Ljava/nio/charset/Charset;
         * 6: new           #87                 // class java/io/FileOutputStream
         * 9: dup
         * 10: aload_1
         * 11: invokespecial #94                 // Method java/io/FileOutputStream."<init>":(Ljava/io/File;)V
         * 14: invokespecial #90                 // Method "<init>":(ZLjava/nio/charset/Charset;Ljava/io/OutputStream;)V
         * 17: return
         *  */
        // </editor-fold>
    }

    public PrintStream(File file, Charset charset) throws IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iconst_0
         * 2: aload_2
         * 3: ldc           #93                 // String charset
         * 5: invokestatic  #9                  // Method requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
         * 8: checkcast     #16                 // class java/nio/charset/Charset
         * 11: new           #87                 // class java/io/FileOutputStream
         * 14: dup
         * 15: aload_1
         * 16: invokespecial #94                 // Method java/io/FileOutputStream."<init>":(Ljava/io/File;)V
         * 19: invokespecial #90                 // Method "<init>":(ZLjava/nio/charset/Charset;Ljava/io/OutputStream;)V
         * 22: return
         *  */
        // </editor-fold>
    }

    private void ensureOpen() throws IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #97                 // Field out:Ljava/io/OutputStream;
         * 4: ifnonnull     17
         * 7: new           #101                // class java/io/IOException
         * 10: dup
         * 11: ldc           #103                // String Stream closed
         * 13: invokespecial #105                // Method java/io/IOException."<init>":(Ljava/lang/String;)V
         * 16: athrow
         * 17: return
         *  */
        // </editor-fold>
    }

    public void flush() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: dup
         * 2: astore_1
         * 3: monitorenter
         * 4: aload_0
         * 5: invokevirtual #106                // Method ensureOpen:()V
         * 8: aload_0
         * 9: getfield      #97                 // Field out:Ljava/io/OutputStream;
         * 12: invokevirtual #110                // Method java/io/OutputStream.flush:()V
         * 15: goto          24
         * 18: astore_2
         * 19: aload_0
         * 20: iconst_1
         * 21: putfield      #33                 // Field trouble:Z
         * 24: aload_1
         * 25: monitorexit
         * 26: goto          34
         * 29: astore_3
         * 30: aload_1
         * 31: monitorexit
         * 32: aload_3
         * 33: athrow
         * 34: return
         * Exception table:
         * from    to  target type
         * 4    15    18   Class java/io/IOException
         * 4    26    29   any
         * 29    32    29   any
         *  */
        // </editor-fold>
    }

    public void close() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: dup
         * 2: astore_1
         * 3: monitorenter
         * 4: aload_0
         * 5: getfield      #37                 // Field closing:Z
         * 8: ifne          54
         * 11: aload_0
         * 12: iconst_1
         * 13: putfield      #37                 // Field closing:Z
         * 16: aload_0
         * 17: getfield      #67                 // Field textOut:Ljava/io/BufferedWriter;
         * 20: invokevirtual #113                // Method java/io/BufferedWriter.close:()V
         * 23: aload_0
         * 24: getfield      #97                 // Field out:Ljava/io/OutputStream;
         * 27: invokevirtual #116                // Method java/io/OutputStream.close:()V
         * 30: goto          39
         * 33: astore_2
         * 34: aload_0
         * 35: iconst_1
         * 36: putfield      #33                 // Field trouble:Z
         * 39: aload_0
         * 40: aconst_null
         * 41: putfield      #67                 // Field textOut:Ljava/io/BufferedWriter;
         * 44: aload_0
         * 45: aconst_null
         * 46: putfield      #58                 // Field charOut:Ljava/io/OutputStreamWriter;
         * 49: aload_0
         * 50: aconst_null
         * 51: putfield      #97                 // Field out:Ljava/io/OutputStream;
         * 54: aload_1
         * 55: monitorexit
         * 56: goto          64
         * 59: astore_3
         * 60: aload_1
         * 61: monitorexit
         * 62: aload_3
         * 63: athrow
         * 64: return
         * Exception table:
         * from    to  target type
         * 16    30    33   Class java/io/IOException
         * 4    56    59   any
         * 59    62    59   any
         *  */
        // </editor-fold>
    }

    public boolean checkError() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #97                 // Field out:Ljava/io/OutputStream;
         * 4: ifnull        11
         * 7: aload_0
         * 8: invokevirtual #117                // Method flush:()V
         * 11: aload_0
         * 12: getfield      #97                 // Field out:Ljava/io/OutputStream;
         * 15: astore_2
         * 16: aload_2
         * 17: instanceof    #10                 // class java/io/PrintStream
         * 20: ifeq          33
         * 23: aload_2
         * 24: checkcast     #10                 // class java/io/PrintStream
         * 27: astore_1
         * 28: aload_1
         * 29: invokevirtual #118                // Method checkError:()Z
         * 32: ireturn
         * 33: aload_0
         * 34: getfield      #33                 // Field trouble:Z
         * 37: ireturn
         *  */
        // </editor-fold>
    }

    protected void setError() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iconst_1
         * 2: putfield      #33                 // Field trouble:Z
         * 5: return
         *  */
        // </editor-fold>
    }

    protected void clearError() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iconst_0
         * 2: putfield      #33                 // Field trouble:Z
         * 5: return
         *  */
        // </editor-fold>
    }

    public void write(int b) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: dup
         * 2: astore_2
         * 3: monitorenter
         * 4: aload_0
         * 5: invokevirtual #106                // Method ensureOpen:()V
         * 8: aload_0
         * 9: getfield      #97                 // Field out:Ljava/io/OutputStream;
         * 12: iload_1
         * 13: invokevirtual #122                // Method java/io/OutputStream.write:(I)V
         * 16: iload_1
         * 17: bipush        10
         * 19: if_icmpne     36
         * 22: aload_0
         * 23: getfield      #40                 // Field autoFlush:Z
         * 26: ifeq          36
         * 29: aload_0
         * 30: getfield      #97                 // Field out:Ljava/io/OutputStream;
         * 33: invokevirtual #110                // Method java/io/OutputStream.flush:()V
         * 36: aload_2
         * 37: monitorexit
         * 38: goto          46
         * 41: astore_3
         * 42: aload_2
         * 43: monitorexit
         * 44: aload_3
         * 45: athrow
         * 46: goto          55
         * 49: astore_2
         * 50: aload_0
         * 51: iconst_1
         * 52: putfield      #33                 // Field trouble:Z
         * 55: return
         * Exception table:
         * from    to  target type
         * 4    38    41   any
         * 41    44    41   any
         * 0    46    49   Class java/io/IOException
         *  */
        // </editor-fold>
    }

    public void write(byte[] buf, int off, int len) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: dup
         * 2: astore        4
         * 4: monitorenter
         * 5: aload_0
         * 6: invokevirtual #106                // Method ensureOpen:()V
         * 9: aload_0
         * 10: getfield      #97                 // Field out:Ljava/io/OutputStream;
         * 13: aload_1
         * 14: iload_2
         * 15: iload_3
         * 16: invokevirtual #126                // Method java/io/OutputStream.write:([BII)V
         * 19: aload_0
         * 20: getfield      #40                 // Field autoFlush:Z
         * 23: ifeq          33
         * 26: aload_0
         * 27: getfield      #97                 // Field out:Ljava/io/OutputStream;
         * 30: invokevirtual #110                // Method java/io/OutputStream.flush:()V
         * 33: aload         4
         * 35: monitorexit
         * 36: goto          47
         * 39: astore        5
         * 41: aload         4
         * 43: monitorexit
         * 44: aload         5
         * 46: athrow
         * 47: goto          57
         * 50: astore        4
         * 52: aload_0
         * 53: iconst_1
         * 54: putfield      #33                 // Field trouble:Z
         * 57: return
         * Exception table:
         * from    to  target type
         * 5    36    39   any
         * 39    44    39   any
         * 0    47    50   Class java/io/IOException
         *  */
        // </editor-fold>
    }

    public void write(byte[] buf) throws IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: iconst_0
         * 3: aload_1
         * 4: arraylength
         * 5: invokevirtual #129                // Method write:([BII)V
         * 8: return
         *  */
        // </editor-fold>
    }

    public void writeBytes(byte[] buf) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: iconst_0
         * 3: aload_1
         * 4: arraylength
         * 5: invokevirtual #129                // Method write:([BII)V
         * 8: return
         *  */
        // </editor-fold>
    }

    private void write(char[] buf) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: dup
         * 2: astore_2
         * 3: monitorenter
         * 4: aload_0
         * 5: invokevirtual #106                // Method ensureOpen:()V
         * 8: aload_0
         * 9: getfield      #67                 // Field textOut:Ljava/io/BufferedWriter;
         * 12: aload_1
         * 13: invokevirtual #130                // Method java/io/BufferedWriter.write:([C)V
         * 16: aload_0
         * 17: getfield      #67                 // Field textOut:Ljava/io/BufferedWriter;
         * 20: invokevirtual #133                // Method java/io/BufferedWriter.flushBuffer:()V
         * 23: aload_0
         * 24: getfield      #58                 // Field charOut:Ljava/io/OutputStreamWriter;
         * 27: invokevirtual #136                // Method java/io/OutputStreamWriter.flushBuffer:()V
         * 30: aload_0
         * 31: getfield      #40                 // Field autoFlush:Z
         * 34: ifeq          69
         * 37: iconst_0
         * 38: istore_3
         * 39: iload_3
         * 40: aload_1
         * 41: arraylength
         * 42: if_icmpge     69
         * 45: aload_1
         * 46: iload_3
         * 47: caload
         * 48: bipush        10
         * 50: if_icmpne     63
         * 53: aload_0
         * 54: getfield      #97                 // Field out:Ljava/io/OutputStream;
         * 57: invokevirtual #110                // Method java/io/OutputStream.flush:()V
         * 60: goto          69
         * 63: iinc          3, 1
         * 66: goto          39
         * 69: aload_2
         * 70: monitorexit
         * 71: goto          81
         * 74: astore        4
         * 76: aload_2
         * 77: monitorexit
         * 78: aload         4
         * 80: athrow
         * 81: goto          90
         * 84: astore_2
         * 85: aload_0
         * 86: iconst_1
         * 87: putfield      #33                 // Field trouble:Z
         * 90: return
         * Exception table:
         * from    to  target type
         * 4    71    74   any
         * 74    78    74   any
         * 0    81    84   Class java/io/IOException
         *  */
        // </editor-fold>
    }

    private void writeln(char[] buf) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: dup
         * 2: astore_2
         * 3: monitorenter
         * 4: aload_0
         * 5: invokevirtual #106                // Method ensureOpen:()V
         * 8: aload_0
         * 9: getfield      #67                 // Field textOut:Ljava/io/BufferedWriter;
         * 12: aload_1
         * 13: invokevirtual #130                // Method java/io/BufferedWriter.write:([C)V
         * 16: aload_0
         * 17: getfield      #67                 // Field textOut:Ljava/io/BufferedWriter;
         * 20: invokevirtual #137                // Method java/io/BufferedWriter.newLine:()V
         * 23: aload_0
         * 24: getfield      #67                 // Field textOut:Ljava/io/BufferedWriter;
         * 27: invokevirtual #133                // Method java/io/BufferedWriter.flushBuffer:()V
         * 30: aload_0
         * 31: getfield      #58                 // Field charOut:Ljava/io/OutputStreamWriter;
         * 34: invokevirtual #136                // Method java/io/OutputStreamWriter.flushBuffer:()V
         * 37: aload_0
         * 38: getfield      #40                 // Field autoFlush:Z
         * 41: ifeq          51
         * 44: aload_0
         * 45: getfield      #97                 // Field out:Ljava/io/OutputStream;
         * 48: invokevirtual #110                // Method java/io/OutputStream.flush:()V
         * 51: aload_2
         * 52: monitorexit
         * 53: goto          61
         * 56: astore_3
         * 57: aload_2
         * 58: monitorexit
         * 59: aload_3
         * 60: athrow
         * 61: goto          70
         * 64: astore_2
         * 65: aload_0
         * 66: iconst_1
         * 67: putfield      #33                 // Field trouble:Z
         * 70: return
         * Exception table:
         * from    to  target type
         * 4    53    56   any
         * 56    59    56   any
         * 0    61    64   Class java/io/IOException
         *  */
        // </editor-fold>
    }

    private void write(String s) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: dup
         * 2: astore_2
         * 3: monitorenter
         * 4: aload_0
         * 5: invokevirtual #106                // Method ensureOpen:()V
         * 8: aload_0
         * 9: getfield      #67                 // Field textOut:Ljava/io/BufferedWriter;
         * 12: aload_1
         * 13: invokevirtual #140                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
         * 16: aload_0
         * 17: getfield      #67                 // Field textOut:Ljava/io/BufferedWriter;
         * 20: invokevirtual #133                // Method java/io/BufferedWriter.flushBuffer:()V
         * 23: aload_0
         * 24: getfield      #58                 // Field charOut:Ljava/io/OutputStreamWriter;
         * 27: invokevirtual #136                // Method java/io/OutputStreamWriter.flushBuffer:()V
         * 30: aload_0
         * 31: getfield      #40                 // Field autoFlush:Z
         * 34: ifeq          53
         * 37: aload_1
         * 38: bipush        10
         * 40: invokevirtual #142                // Method java/lang/String.indexOf:(I)I
         * 43: iflt          53
         * 46: aload_0
         * 47: getfield      #97                 // Field out:Ljava/io/OutputStream;
         * 50: invokevirtual #110                // Method java/io/OutputStream.flush:()V
         * 53: aload_2
         * 54: monitorexit
         * 55: goto          63
         * 58: astore_3
         * 59: aload_2
         * 60: monitorexit
         * 61: aload_3
         * 62: athrow
         * 63: goto          72
         * 66: astore_2
         * 67: aload_0
         * 68: iconst_1
         * 69: putfield      #33                 // Field trouble:Z
         * 72: return
         * Exception table:
         * from    to  target type
         * 4    55    58   any
         * 58    61    58   any
         * 0    63    66   Class java/io/IOException
         *  */
        // </editor-fold>
    }

    private void writeln(String s) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: dup
         * 2: astore_2
         * 3: monitorenter
         * 4: aload_0
         * 5: invokevirtual #106                // Method ensureOpen:()V
         * 8: aload_0
         * 9: getfield      #67                 // Field textOut:Ljava/io/BufferedWriter;
         * 12: aload_1
         * 13: invokevirtual #140                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
         * 16: aload_0
         * 17: getfield      #67                 // Field textOut:Ljava/io/BufferedWriter;
         * 20: invokevirtual #137                // Method java/io/BufferedWriter.newLine:()V
         * 23: aload_0
         * 24: getfield      #67                 // Field textOut:Ljava/io/BufferedWriter;
         * 27: invokevirtual #133                // Method java/io/BufferedWriter.flushBuffer:()V
         * 30: aload_0
         * 31: getfield      #58                 // Field charOut:Ljava/io/OutputStreamWriter;
         * 34: invokevirtual #136                // Method java/io/OutputStreamWriter.flushBuffer:()V
         * 37: aload_0
         * 38: getfield      #40                 // Field autoFlush:Z
         * 41: ifeq          51
         * 44: aload_0
         * 45: getfield      #97                 // Field out:Ljava/io/OutputStream;
         * 48: invokevirtual #110                // Method java/io/OutputStream.flush:()V
         * 51: aload_2
         * 52: monitorexit
         * 53: goto          61
         * 56: astore_3
         * 57: aload_2
         * 58: monitorexit
         * 59: aload_3
         * 60: athrow
         * 61: goto          70
         * 64: astore_2
         * 65: aload_0
         * 66: iconst_1
         * 67: putfield      #33                 // Field trouble:Z
         * 70: return
         * Exception table:
         * from    to  target type
         * 4    53    56   any
         * 56    59    56   any
         * 0    61    64   Class java/io/IOException
         *  */
        // </editor-fold>
    }

    private void newLine() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: dup
         * 2: astore_1
         * 3: monitorenter
         * 4: aload_0
         * 5: invokevirtual #106                // Method ensureOpen:()V
         * 8: aload_0
         * 9: getfield      #67                 // Field textOut:Ljava/io/BufferedWriter;
         * 12: invokevirtual #137                // Method java/io/BufferedWriter.newLine:()V
         * 15: aload_0
         * 16: getfield      #67                 // Field textOut:Ljava/io/BufferedWriter;
         * 19: invokevirtual #133                // Method java/io/BufferedWriter.flushBuffer:()V
         * 22: aload_0
         * 23: getfield      #58                 // Field charOut:Ljava/io/OutputStreamWriter;
         * 26: invokevirtual #136                // Method java/io/OutputStreamWriter.flushBuffer:()V
         * 29: aload_0
         * 30: getfield      #40                 // Field autoFlush:Z
         * 33: ifeq          43
         * 36: aload_0
         * 37: getfield      #97                 // Field out:Ljava/io/OutputStream;
         * 40: invokevirtual #110                // Method java/io/OutputStream.flush:()V
         * 43: aload_1
         * 44: monitorexit
         * 45: goto          53
         * 48: astore_2
         * 49: aload_1
         * 50: monitorexit
         * 51: aload_2
         * 52: athrow
         * 53: goto          62
         * 56: astore_1
         * 57: aload_0
         * 58: iconst_1
         * 59: putfield      #33                 // Field trouble:Z
         * 62: return
         * Exception table:
         * from    to  target type
         * 4    45    48   any
         * 48    51    48   any
         * 0    53    56   Class java/io/IOException
         *  */
        // </editor-fold>
    }

    public void print(boolean b) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iload_1
         * 2: invokestatic  #148                // Method java/lang/String.valueOf:(Z)Ljava/lang/String;
         * 5: invokevirtual #152                // Method write:(Ljava/lang/String;)V
         * 8: return
         *  */
        // </editor-fold>
    }

    public void print(char c) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iload_1
         * 2: invokestatic  #153                // Method java/lang/String.valueOf:(C)Ljava/lang/String;
         * 5: invokevirtual #152                // Method write:(Ljava/lang/String;)V
         * 8: return
         *  */
        // </editor-fold>
    }

    public void print(int i) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iload_1
         * 2: invokestatic  #156                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
         * 5: invokevirtual #152                // Method write:(Ljava/lang/String;)V
         * 8: return
         *  */
        // </editor-fold>
    }

    public void print(long l) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: lload_1
         * 2: invokestatic  #159                // Method java/lang/String.valueOf:(J)Ljava/lang/String;
         * 5: invokevirtual #152                // Method write:(Ljava/lang/String;)V
         * 8: return
         *  */
        // </editor-fold>
    }

    public void print(float f) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: fload_1
         * 2: invokestatic  #162                // Method java/lang/String.valueOf:(F)Ljava/lang/String;
         * 5: invokevirtual #152                // Method write:(Ljava/lang/String;)V
         * 8: return
         *  */
        // </editor-fold>
    }

    public void print(double d) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: dload_1
         * 2: invokestatic  #165                // Method java/lang/String.valueOf:(D)Ljava/lang/String;
         * 5: invokevirtual #152                // Method write:(Ljava/lang/String;)V
         * 8: return
         *  */
        // </editor-fold>
    }

    public void print(char[] s) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokevirtual #168                // Method write:([C)V
         * 5: return
         *  */
        // </editor-fold>
    }

    public void print(String s) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokestatic  #169                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
         * 5: invokevirtual #152                // Method write:(Ljava/lang/String;)V
         * 8: return
         *  */
        // </editor-fold>
    }

    public void print(Object obj) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokestatic  #169                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
         * 5: invokevirtual #152                // Method write:(Ljava/lang/String;)V
         * 8: return
         *  */
        // </editor-fold>
    }

    public void println() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual #172                // Method newLine:()V
         * 4: return
         *  */
        // </editor-fold>
    }

    public void println(boolean x) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual #173                // Method java/lang/Object.getClass:()Ljava/lang/Class;
         * 4: ldc           #10                 // class java/io/PrintStream
         * 6: if_acmpne     20
         * 9: aload_0
         * 10: iload_1
         * 11: invokestatic  #148                // Method java/lang/String.valueOf:(Z)Ljava/lang/String;
         * 14: invokevirtual #179                // Method writeln:(Ljava/lang/String;)V
         * 17: goto          43
         * 20: aload_0
         * 21: dup
         * 22: astore_2
         * 23: monitorenter
         * 24: aload_0
         * 25: iload_1
         * 26: invokevirtual #182                // Method print:(Z)V
         * 29: aload_0
         * 30: invokevirtual #172                // Method newLine:()V
         * 33: aload_2
         * 34: monitorexit
         * 35: goto          43
         * 38: astore_3
         * 39: aload_2
         * 40: monitorexit
         * 41: aload_3
         * 42: athrow
         * 43: return
         * Exception table:
         * from    to  target type
         * 24    35    38   any
         * 38    41    38   any
         *  */
        // </editor-fold>
    }

    public void println(char x) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual #173                // Method java/lang/Object.getClass:()Ljava/lang/Class;
         * 4: ldc           #10                 // class java/io/PrintStream
         * 6: if_acmpne     20
         * 9: aload_0
         * 10: iload_1
         * 11: invokestatic  #153                // Method java/lang/String.valueOf:(C)Ljava/lang/String;
         * 14: invokevirtual #179                // Method writeln:(Ljava/lang/String;)V
         * 17: goto          43
         * 20: aload_0
         * 21: dup
         * 22: astore_2
         * 23: monitorenter
         * 24: aload_0
         * 25: iload_1
         * 26: invokevirtual #186                // Method print:(C)V
         * 29: aload_0
         * 30: invokevirtual #172                // Method newLine:()V
         * 33: aload_2
         * 34: monitorexit
         * 35: goto          43
         * 38: astore_3
         * 39: aload_2
         * 40: monitorexit
         * 41: aload_3
         * 42: athrow
         * 43: return
         * Exception table:
         * from    to  target type
         * 24    35    38   any
         * 38    41    38   any
         *  */
        // </editor-fold>
    }

    public void println(int x) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual #173                // Method java/lang/Object.getClass:()Ljava/lang/Class;
         * 4: ldc           #10                 // class java/io/PrintStream
         * 6: if_acmpne     20
         * 9: aload_0
         * 10: iload_1
         * 11: invokestatic  #156                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
         * 14: invokevirtual #179                // Method writeln:(Ljava/lang/String;)V
         * 17: goto          43
         * 20: aload_0
         * 21: dup
         * 22: astore_2
         * 23: monitorenter
         * 24: aload_0
         * 25: iload_1
         * 26: invokevirtual #189                // Method print:(I)V
         * 29: aload_0
         * 30: invokevirtual #172                // Method newLine:()V
         * 33: aload_2
         * 34: monitorexit
         * 35: goto          43
         * 38: astore_3
         * 39: aload_2
         * 40: monitorexit
         * 41: aload_3
         * 42: athrow
         * 43: return
         * Exception table:
         * from    to  target type
         * 24    35    38   any
         * 38    41    38   any
         *  */
        // </editor-fold>
    }

    public void println(long x) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual #173                // Method java/lang/Object.getClass:()Ljava/lang/Class;
         * 4: ldc           #10                 // class java/io/PrintStream
         * 6: if_acmpne     20
         * 9: aload_0
         * 10: lload_1
         * 11: invokestatic  #159                // Method java/lang/String.valueOf:(J)Ljava/lang/String;
         * 14: invokevirtual #179                // Method writeln:(Ljava/lang/String;)V
         * 17: goto          45
         * 20: aload_0
         * 21: dup
         * 22: astore_3
         * 23: monitorenter
         * 24: aload_0
         * 25: lload_1
         * 26: invokevirtual #191                // Method print:(J)V
         * 29: aload_0
         * 30: invokevirtual #172                // Method newLine:()V
         * 33: aload_3
         * 34: monitorexit
         * 35: goto          45
         * 38: astore        4
         * 40: aload_3
         * 41: monitorexit
         * 42: aload         4
         * 44: athrow
         * 45: return
         * Exception table:
         * from    to  target type
         * 24    35    38   any
         * 38    42    38   any
         *  */
        // </editor-fold>
    }

    public void println(float x) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual #173                // Method java/lang/Object.getClass:()Ljava/lang/Class;
         * 4: ldc           #10                 // class java/io/PrintStream
         * 6: if_acmpne     20
         * 9: aload_0
         * 10: fload_1
         * 11: invokestatic  #162                // Method java/lang/String.valueOf:(F)Ljava/lang/String;
         * 14: invokevirtual #179                // Method writeln:(Ljava/lang/String;)V
         * 17: goto          43
         * 20: aload_0
         * 21: dup
         * 22: astore_2
         * 23: monitorenter
         * 24: aload_0
         * 25: fload_1
         * 26: invokevirtual #194                // Method print:(F)V
         * 29: aload_0
         * 30: invokevirtual #172                // Method newLine:()V
         * 33: aload_2
         * 34: monitorexit
         * 35: goto          43
         * 38: astore_3
         * 39: aload_2
         * 40: monitorexit
         * 41: aload_3
         * 42: athrow
         * 43: return
         * Exception table:
         * from    to  target type
         * 24    35    38   any
         * 38    41    38   any
         *  */
        // </editor-fold>
    }

    public void println(double x) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual #173                // Method java/lang/Object.getClass:()Ljava/lang/Class;
         * 4: ldc           #10                 // class java/io/PrintStream
         * 6: if_acmpne     20
         * 9: aload_0
         * 10: dload_1
         * 11: invokestatic  #165                // Method java/lang/String.valueOf:(D)Ljava/lang/String;
         * 14: invokevirtual #179                // Method writeln:(Ljava/lang/String;)V
         * 17: goto          45
         * 20: aload_0
         * 21: dup
         * 22: astore_3
         * 23: monitorenter
         * 24: aload_0
         * 25: dload_1
         * 26: invokevirtual #197                // Method print:(D)V
         * 29: aload_0
         * 30: invokevirtual #172                // Method newLine:()V
         * 33: aload_3
         * 34: monitorexit
         * 35: goto          45
         * 38: astore        4
         * 40: aload_3
         * 41: monitorexit
         * 42: aload         4
         * 44: athrow
         * 45: return
         * Exception table:
         * from    to  target type
         * 24    35    38   any
         * 38    42    38   any
         *  */
        // </editor-fold>
    }

    public void println(char[] x) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual #173                // Method java/lang/Object.getClass:()Ljava/lang/Class;
         * 4: ldc           #10                 // class java/io/PrintStream
         * 6: if_acmpne     17
         * 9: aload_0
         * 10: aload_1
         * 11: invokevirtual #200                // Method writeln:([C)V
         * 14: goto          40
         * 17: aload_0
         * 18: dup
         * 19: astore_2
         * 20: monitorenter
         * 21: aload_0
         * 22: aload_1
         * 23: invokevirtual #202                // Method print:([C)V
         * 26: aload_0
         * 27: invokevirtual #172                // Method newLine:()V
         * 30: aload_2
         * 31: monitorexit
         * 32: goto          40
         * 35: astore_3
         * 36: aload_2
         * 37: monitorexit
         * 38: aload_3
         * 39: athrow
         * 40: return
         * Exception table:
         * from    to  target type
         * 21    32    35   any
         * 35    38    35   any
         *  */
        // </editor-fold>
    }

    public void println(String x) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual #173                // Method java/lang/Object.getClass:()Ljava/lang/Class;
         * 4: ldc           #10                 // class java/io/PrintStream
         * 6: if_acmpne     20
         * 9: aload_0
         * 10: aload_1
         * 11: invokestatic  #169                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
         * 14: invokevirtual #179                // Method writeln:(Ljava/lang/String;)V
         * 17: goto          43
         * 20: aload_0
         * 21: dup
         * 22: astore_2
         * 23: monitorenter
         * 24: aload_0
         * 25: aload_1
         * 26: invokevirtual #204                // Method print:(Ljava/lang/String;)V
         * 29: aload_0
         * 30: invokevirtual #172                // Method newLine:()V
         * 33: aload_2
         * 34: monitorexit
         * 35: goto          43
         * 38: astore_3
         * 39: aload_2
         * 40: monitorexit
         * 41: aload_3
         * 42: athrow
         * 43: return
         * Exception table:
         * from    to  target type
         * 24    35    38   any
         * 38    41    38   any
         *  */
        // </editor-fold>
    }

    public void println(Object x) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: invokestatic  #169                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
         * 4: astore_2
         * 5: aload_0
         * 6: invokevirtual #173                // Method java/lang/Object.getClass:()Ljava/lang/Class;
         * 9: ldc           #10                 // class java/io/PrintStream
         * 11: if_acmpne     25
         * 14: aload_0
         * 15: aload_2
         * 16: invokestatic  #169                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
         * 19: invokevirtual #179                // Method writeln:(Ljava/lang/String;)V
         * 22: goto          50
         * 25: aload_0
         * 26: dup
         * 27: astore_3
         * 28: monitorenter
         * 29: aload_0
         * 30: aload_2
         * 31: invokevirtual #204                // Method print:(Ljava/lang/String;)V
         * 34: aload_0
         * 35: invokevirtual #172                // Method newLine:()V
         * 38: aload_3
         * 39: monitorexit
         * 40: goto          50
         * 43: astore        4
         * 45: aload_3
         * 46: monitorexit
         * 47: aload         4
         * 49: athrow
         * 50: return
         * Exception table:
         * from    to  target type
         * 29    40    43   any
         * 43    47    43   any
         *  */
        // </editor-fold>
    }

    public PrintStream printf(String format, Object[] args) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: aload_2
         * 3: invokevirtual #206                // Method format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
         * 6: areturn
         *  */
        // </editor-fold>
    }

    public PrintStream printf(Locale l, String format, Object[] args) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: aload_2
         * 3: aload_3
         * 4: invokevirtual #210                // Method format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
         * 7: areturn
         *  */
        // </editor-fold>
    }

    public PrintStream format(String format, Object[] args) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: dup
         * 2: astore_3
         * 3: monitorenter
         * 4: aload_0
         * 5: invokevirtual #106                // Method ensureOpen:()V
         * 8: aload_0
         * 9: getfield      #213                // Field formatter:Ljava/util/Formatter;
         * 12: ifnull        31
         * 15: aload_0
         * 16: getfield      #213                // Field formatter:Ljava/util/Formatter;
         * 19: invokevirtual #217                // Method java/util/Formatter.locale:()Ljava/util/Locale;
         * 22: getstatic     #223                // Field java/util/Locale$Category.FORMAT:Ljava/util/Locale$Category;
         * 25: invokestatic  #229                // Method java/util/Locale.getDefault:(Ljava/util/Locale$Category;)Ljava/util/Locale;
         * 28: if_acmpeq     43
         * 31: aload_0
         * 32: new           #218                // class java/util/Formatter
         * 35: dup
         * 36: aload_0
         * 37: invokespecial #235                // Method java/util/Formatter."<init>":(Ljava/lang/Appendable;)V
         * 40: putfield      #213                // Field formatter:Ljava/util/Formatter;
         * 43: aload_0
         * 44: getfield      #213                // Field formatter:Ljava/util/Formatter;
         * 47: getstatic     #223                // Field java/util/Locale$Category.FORMAT:Ljava/util/Locale$Category;
         * 50: invokestatic  #229                // Method java/util/Locale.getDefault:(Ljava/util/Locale$Category;)Ljava/util/Locale;
         * 53: aload_1
         * 54: aload_2
         * 55: invokevirtual #238                // Method java/util/Formatter.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
         * 58: pop
         * 59: aload_3
         * 60: monitorexit
         * 61: goto          71
         * 64: astore        4
         * 66: aload_3
         * 67: monitorexit
         * 68: aload         4
         * 70: athrow
         * 71: goto          80
         * 74: astore_3
         * 75: aload_0
         * 76: iconst_1
         * 77: putfield      #33                 // Field trouble:Z
         * 80: aload_0
         * 81: areturn
         * Exception table:
         * from    to  target type
         * 4    61    64   any
         * 64    68    64   any
         * 0    71    74   Class java/io/IOException
         *  */
        // </editor-fold>
    }

    public PrintStream format(Locale l, String format, Object[] args) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: dup
         * 2: astore        4
         * 4: monitorenter
         * 5: aload_0
         * 6: invokevirtual #106                // Method ensureOpen:()V
         * 9: aload_0
         * 10: getfield      #213                // Field formatter:Ljava/util/Formatter;
         * 13: ifnull        27
         * 16: aload_0
         * 17: getfield      #213                // Field formatter:Ljava/util/Formatter;
         * 20: invokevirtual #217                // Method java/util/Formatter.locale:()Ljava/util/Locale;
         * 23: aload_1
         * 24: if_acmpeq     40
         * 27: aload_0
         * 28: new           #218                // class java/util/Formatter
         * 31: dup
         * 32: aload_0
         * 33: aload_1
         * 34: invokespecial #241                // Method java/util/Formatter."<init>":(Ljava/lang/Appendable;Ljava/util/Locale;)V
         * 37: putfield      #213                // Field formatter:Ljava/util/Formatter;
         * 40: aload_0
         * 41: getfield      #213                // Field formatter:Ljava/util/Formatter;
         * 44: aload_1
         * 45: aload_2
         * 46: aload_3
         * 47: invokevirtual #238                // Method java/util/Formatter.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
         * 50: pop
         * 51: aload         4
         * 53: monitorexit
         * 54: goto          65
         * 57: astore        5
         * 59: aload         4
         * 61: monitorexit
         * 62: aload         5
         * 64: athrow
         * 65: goto          75
         * 68: astore        4
         * 70: aload_0
         * 71: iconst_1
         * 72: putfield      #33                 // Field trouble:Z
         * 75: aload_0
         * 76: areturn
         * Exception table:
         * from    to  target type
         * 5    54    57   any
         * 57    62    57   any
         * 0    65    68   Class java/io/IOException
         *  */
        // </editor-fold>
    }

    public PrintStream append(CharSequence csq) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokestatic  #169                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
         * 5: invokevirtual #204                // Method print:(Ljava/lang/String;)V
         * 8: aload_0
         * 9: areturn
         *  */
        // </editor-fold>
    }

    public PrintStream append(CharSequence csq, int start, int end) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: ifnonnull     7
         * 4: ldc           #244                // String null
         * 6: astore_1
         * 7: aload_0
         * 8: aload_1
         * 9: iload_2
         * 10: iload_3
         * 11: invokeinterface #246,  3          // InterfaceMethod java/lang/CharSequence.subSequence:(II)Ljava/lang/CharSequence;
         * 16: invokevirtual #252                // Method append:(Ljava/lang/CharSequence;)Ljava/io/PrintStream;
         * 19: areturn
         *  */
        // </editor-fold>
    }

    public PrintStream append(char c) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iload_1
         * 2: invokevirtual #186                // Method print:(C)V
         * 5: aload_0
         * 6: areturn
         *  */
        // </editor-fold>
    }

    public Charset charset() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #50                 // Field charset:Ljava/nio/charset/Charset;
         * 4: areturn
         *  */
        // </editor-fold>
    }
}
