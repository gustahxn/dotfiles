package java.lang;

import java.io.Console;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.channels.Channel;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.function.Supplier;
import jdk.internal.javac.Restricted;
import jdk.internal.reflect.CallerSensitive;
import jdk.internal.vm.annotation.IntrinsicCandidate;
import jdk.internal.vm.annotation.Stable;

public final class System {

    public static interface Logger {

        public enum Level {
            ALL, TRACE, DEBUG, INFO, WARNING, ERROR, OFF;
            private final int severity;

            private Level(int severity) {
                // compiled code
            }

            public final String getName() {
                // <editor-fold defaultstate="collapsed" desc="Compiled Code">
                /* 0: aload_0
                 * 1: invokevirtual #48                 // Method name:()Ljava/lang/String;
                 * 4: areturn
                 *  */
                // </editor-fold>
            }

            public final int getSeverity() {
                // <editor-fold defaultstate="collapsed" desc="Compiled Code">
                /* 0: aload_0
                 * 1: getfield      #44                 // Field severity:I
                 * 4: ireturn
                 *  */
                // </editor-fold>
            }
        }

        public String getName();

        public boolean isLoggable(Level level);

        public default void log(Level level, String msg) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: aconst_null
             * 3: checkcast     #1                  // class java/util/ResourceBundle
             * 6: aload_2
             * 7: aconst_null
             * 8: checkcast     #3                  // class "[Ljava/lang/Object;"
             * 11: invokeinterface #5,  5            // InterfaceMethod log:(Ljava/lang/System$Logger$Level;Ljava/util/ResourceBundle;Ljava/lang/String;[Ljava/lang/Object;)V
             * 16: return
             *  */
            // </editor-fold>
        }

        public default void log(Level level, Supplier<String> msgSupplier) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_2
             * 1: invokestatic  #11                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
             * 4: pop
             * 5: aload_0
             * 6: aload_1
             * 7: invokestatic  #11                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
             * 10: checkcast     #17                 // class java/lang/System$Logger$Level
             * 13: invokeinterface #19,  2           // InterfaceMethod isLoggable:(Ljava/lang/System$Logger$Level;)Z
             * 18: ifeq          45
             * 21: aload_0
             * 22: aload_1
             * 23: aconst_null
             * 24: checkcast     #1                  // class java/util/ResourceBundle
             * 27: aload_2
             * 28: invokeinterface #23,  1           // InterfaceMethod java/util/function/Supplier.get:()Ljava/lang/Object;
             * 33: checkcast     #29                 // class java/lang/String
             * 36: aconst_null
             * 37: checkcast     #3                  // class "[Ljava/lang/Object;"
             * 40: invokeinterface #5,  5            // InterfaceMethod log:(Ljava/lang/System$Logger$Level;Ljava/util/ResourceBundle;Ljava/lang/String;[Ljava/lang/Object;)V
             * 45: return
             *  */
            // </editor-fold>
        }

        public default void log(Level level, Object obj) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_2
             * 1: invokestatic  #11                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
             * 4: pop
             * 5: aload_0
             * 6: aload_1
             * 7: invokestatic  #11                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
             * 10: checkcast     #17                 // class java/lang/System$Logger$Level
             * 13: invokeinterface #19,  2           // InterfaceMethod isLoggable:(Ljava/lang/System$Logger$Level;)Z
             * 18: ifeq          40
             * 21: aload_0
             * 22: aload_1
             * 23: aconst_null
             * 24: checkcast     #1                  // class java/util/ResourceBundle
             * 27: aload_2
             * 28: invokevirtual #31                 // Method java/lang/Object.toString:()Ljava/lang/String;
             * 31: aconst_null
             * 32: checkcast     #3                  // class "[Ljava/lang/Object;"
             * 35: invokeinterface #5,  5            // InterfaceMethod log:(Ljava/lang/System$Logger$Level;Ljava/util/ResourceBundle;Ljava/lang/String;[Ljava/lang/Object;)V
             * 40: return
             *  */
            // </editor-fold>
        }

        public default void log(Level level, String msg, Throwable thrown) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: aconst_null
             * 3: aload_2
             * 4: aload_3
             * 5: invokeinterface #37,  5           // InterfaceMethod log:(Ljava/lang/System$Logger$Level;Ljava/util/ResourceBundle;Ljava/lang/String;Ljava/lang/Throwable;)V
             * 10: return
             *  */
            // </editor-fold>
        }

        public default void log(Level level, Supplier<String> msgSupplier, Throwable thrown) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_2
             * 1: invokestatic  #11                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
             * 4: pop
             * 5: aload_0
             * 6: aload_1
             * 7: invokestatic  #11                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
             * 10: checkcast     #17                 // class java/lang/System$Logger$Level
             * 13: invokeinterface #19,  2           // InterfaceMethod isLoggable:(Ljava/lang/System$Logger$Level;)Z
             * 18: ifeq          39
             * 21: aload_0
             * 22: aload_1
             * 23: aconst_null
             * 24: aload_2
             * 25: invokeinterface #23,  1           // InterfaceMethod java/util/function/Supplier.get:()Ljava/lang/Object;
             * 30: checkcast     #29                 // class java/lang/String
             * 33: aload_3
             * 34: invokeinterface #37,  5           // InterfaceMethod log:(Ljava/lang/System$Logger$Level;Ljava/util/ResourceBundle;Ljava/lang/String;Ljava/lang/Throwable;)V
             * 39: return
             *  */
            // </editor-fold>
        }

        public default void log(Level level, String format, Object[] params) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: aconst_null
             * 3: aload_2
             * 4: aload_3
             * 5: invokeinterface #5,  5            // InterfaceMethod log:(Ljava/lang/System$Logger$Level;Ljava/util/ResourceBundle;Ljava/lang/String;[Ljava/lang/Object;)V
             * 10: return
             *  */
            // </editor-fold>
        }

        public void log(Level level, ResourceBundle rb, String string, Throwable thrwbl);

        public void log(Level level, ResourceBundle rb, String string, Object[] os);
    }

    public static abstract class LoggerFinder {

        private static volatile_or_acc_bridge LoggerFinder service;

        protected LoggerFinder() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
             * 4: return
             *  */
            // </editor-fold>
        }

        public abstract Logger getLogger(String string, Module module);

        public Logger getLocalizedLogger(String name, ResourceBundle bundle, Module module) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           #7                  // class jdk/internal/logger/LocalizedLoggerWrapper
             * 3: dup
             * 4: aload_0
             * 5: aload_1
             * 6: aload_3
             * 7: invokevirtual #9                  // Method getLogger:(Ljava/lang/String;Ljava/lang/Module;)Ljava/lang/System$Logger;
             * 10: aload_2
             * 11: invokespecial #15                 // Method jdk/internal/logger/LocalizedLoggerWrapper."<init>":(Ljava/lang/System$Logger;Ljava/util/ResourceBundle;)V
             * 14: areturn
             *  */
            // </editor-fold>
        }

        public static LoggerFinder getLoggerFinder() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: invokestatic  #18                 // Method accessProvider:()Ljava/lang/System$LoggerFinder;
             * 3: areturn
             *  */
            // </editor-fold>
        }

        static LoggerFinder accessProvider() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: getstatic     #22                 // Field service:Ljava/lang/System$LoggerFinder;
             * 3: astore_0
             * 4: aload_0
             * 5: ifnonnull     25
             * 8: invokestatic  #26                 // Method jdk/internal/logger/LoggerFinderLoader.getLoggerFinder:()Ljava/lang/System$LoggerFinder;
             * 11: astore_0
             * 12: aload_0
             * 13: instanceof    #31                 // class jdk/internal/logger/LoggerFinderLoader$TemporaryLoggerFinder
             * 16: ifeq          21
             * 19: aload_0
             * 20: areturn
             * 21: aload_0
             * 22: putstatic     #22                 // Field service:Ljava/lang/System$LoggerFinder;
             * 25: aload_0
             * 26: areturn
             *  */
            // </editor-fold>
        }
    }

    private static class In extends FileInputStream {

        In(FileDescriptor fd) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: invokespecial #1                  // Method java/io/FileInputStream."<init>":(Ljava/io/FileDescriptor;)V
             * 5: return
             *  */
            // </editor-fold>
        }

        public int read() throws IOException {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: invokestatic  #7                  // Method jdk/internal/misc/Blocker.begin:()Z
             * 3: istore_1
             * 4: aload_0
             * 5: invokespecial #13                 // Method java/io/FileInputStream.read:()I
             * 8: istore_2
             * 9: iload_1
             * 10: invokestatic  #17                 // Method jdk/internal/misc/Blocker.end:(Z)V
             * 13: iload_2
             * 14: ireturn
             * 15: astore_3
             * 16: iload_1
             * 17: invokestatic  #17                 // Method jdk/internal/misc/Blocker.end:(Z)V
             * 20: aload_3
             * 21: athrow
             * Exception table:
             * from    to  target type
             * 4     9    15   any
             *  */
            // </editor-fold>
        }

        public int read(byte[] b) throws IOException {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: invokestatic  #7                  // Method jdk/internal/misc/Blocker.begin:()Z
             * 3: istore_2
             * 4: aload_0
             * 5: aload_1
             * 6: invokespecial #21                 // Method java/io/FileInputStream.read:([B)I
             * 9: istore_3
             * 10: iload_2
             * 11: invokestatic  #17                 // Method jdk/internal/misc/Blocker.end:(Z)V
             * 14: iload_3
             * 15: ireturn
             * 16: astore        4
             * 18: iload_2
             * 19: invokestatic  #17                 // Method jdk/internal/misc/Blocker.end:(Z)V
             * 22: aload         4
             * 24: athrow
             * Exception table:
             * from    to  target type
             * 4    10    16   any
             * 16    18    16   any
             *  */
            // </editor-fold>
        }

        public int read(byte[] b, int off, int len) throws IOException {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: invokestatic  #7                  // Method jdk/internal/misc/Blocker.begin:()Z
             * 3: istore        4
             * 5: aload_0
             * 6: aload_1
             * 7: iload_2
             * 8: iload_3
             * 9: invokespecial #24                 // Method java/io/FileInputStream.read:([BII)I
             * 12: istore        5
             * 14: iload         4
             * 16: invokestatic  #17                 // Method jdk/internal/misc/Blocker.end:(Z)V
             * 19: iload         5
             * 21: ireturn
             * 22: astore        6
             * 24: iload         4
             * 26: invokestatic  #17                 // Method jdk/internal/misc/Blocker.end:(Z)V
             * 29: aload         6
             * 31: athrow
             * Exception table:
             * from    to  target type
             * 5    14    22   any
             * 22    24    22   any
             *  */
            // </editor-fold>
        }
    }

    private static class Out extends FileOutputStream {

        Out(FileDescriptor fd) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: invokespecial #1                  // Method java/io/FileOutputStream."<init>":(Ljava/io/FileDescriptor;)V
             * 5: return
             *  */
            // </editor-fold>
        }

        public void write(int b) throws IOException {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: invokestatic  #7                  // Method jdk/internal/misc/Blocker.begin:()Z
             * 3: istore_2
             * 4: aload_0
             * 5: iload_1
             * 6: invokespecial #13                 // Method java/io/FileOutputStream.write:(I)V
             * 9: iload_2
             * 10: invokestatic  #17                 // Method jdk/internal/misc/Blocker.end:(Z)V
             * 13: goto          23
             * 16: astore_3
             * 17: iload_2
             * 18: invokestatic  #17                 // Method jdk/internal/misc/Blocker.end:(Z)V
             * 21: aload_3
             * 22: athrow
             * 23: return
             * Exception table:
             * from    to  target type
             * 4     9    16   any
             *  */
            // </editor-fold>
        }

        public void write(byte[] b) throws IOException {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: invokestatic  #7                  // Method jdk/internal/misc/Blocker.begin:()Z
             * 3: istore_2
             * 4: aload_0
             * 5: aload_1
             * 6: invokespecial #21                 // Method java/io/FileOutputStream.write:([B)V
             * 9: iload_2
             * 10: invokestatic  #17                 // Method jdk/internal/misc/Blocker.end:(Z)V
             * 13: goto          23
             * 16: astore_3
             * 17: iload_2
             * 18: invokestatic  #17                 // Method jdk/internal/misc/Blocker.end:(Z)V
             * 21: aload_3
             * 22: athrow
             * 23: return
             * Exception table:
             * from    to  target type
             * 4     9    16   any
             *  */
            // </editor-fold>
        }

        public void write(byte[] b, int off, int len) throws IOException {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: invokestatic  #7                  // Method jdk/internal/misc/Blocker.begin:()Z
             * 3: istore        4
             * 5: aload_0
             * 6: aload_1
             * 7: iload_2
             * 8: iload_3
             * 9: invokespecial #24                 // Method java/io/FileOutputStream.write:([BII)V
             * 12: iload         4
             * 14: invokestatic  #17                 // Method jdk/internal/misc/Blocker.end:(Z)V
             * 17: goto          30
             * 20: astore        5
             * 22: iload         4
             * 24: invokestatic  #17                 // Method jdk/internal/misc/Blocker.end:(Z)V
             * 27: aload         5
             * 29: athrow
             * 30: return
             * Exception table:
             * from    to  target type
             * 5    12    20   any
             * 20    22    20   any
             *  */
            // </editor-fold>
        }
    }
    public static final InputStream in;
    public static final PrintStream out;
    public static final PrintStream err;
    @Stable
    private static InputStream initialIn;
    @Stable
    private static PrintStream initialErr;
    private static String notSupportedJnuEncoding;
    private static volatile_or_acc_bridge Console cons;
    private static Properties props;
    private static String lineSeparator;
    static ModuleLayer bootLayer;

    private static native void registerNatives();

    private System() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         * 4: return
         *  */
        // </editor-fold>
    }

    public static void setIn(InputStream in) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokestatic  #7                  // Method setIn0:(Ljava/io/InputStream;)V
         * 4: return
         *  */
        // </editor-fold>
    }

    public static void setOut(PrintStream out) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokestatic  #13                 // Method setOut0:(Ljava/io/PrintStream;)V
         * 4: return
         *  */
        // </editor-fold>
    }

    public static void setErr(PrintStream err) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokestatic  #17                 // Method setErr0:(Ljava/io/PrintStream;)V
         * 4: return
         *  */
        // </editor-fold>
    }

    public static Console console() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     #20                 // Field cons:Ljava/io/Console;
         * 3: dup
         * 4: astore_0
         * 5: ifnonnull     44
         * 8: ldc           #8                  // class java/lang/System
         * 10: dup
         * 11: astore_1
         * 12: monitorenter
         * 13: getstatic     #20                 // Field cons:Ljava/io/Console;
         * 16: dup
         * 17: astore_0
         * 18: ifnonnull     34
         * 21: invokestatic  #24                 // Method jdk/internal/access/SharedSecrets.getJavaIOAccess:()Ljdk/internal/access/JavaIOAccess;
         * 24: invokeinterface #30,  1           // InterfaceMethod jdk/internal/access/JavaIOAccess.console:()Ljava/io/Console;
         * 29: dup
         * 30: astore_0
         * 31: putstatic     #20                 // Field cons:Ljava/io/Console;
         * 34: aload_1
         * 35: monitorexit
         * 36: goto          44
         * 39: astore_2
         * 40: aload_1
         * 41: monitorexit
         * 42: aload_2
         * 43: athrow
         * 44: aload_0
         * 45: areturn
         * Exception table:
         * from    to  target type
         * 13    36    39   any
         * 39    42    39   any
         *  */
        // </editor-fold>
    }

    public static Channel inheritedChannel() throws IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  #36                 // Method java/nio/channels/spi/SelectorProvider.provider:()Ljava/nio/channels/spi/SelectorProvider;
         * 3: invokevirtual #42                 // Method java/nio/channels/spi/SelectorProvider.inheritedChannel:()Ljava/nio/channels/Channel;
         * 6: areturn
         *  */
        // </editor-fold>
    }

    private static native void setIn0(InputStream in);

    private static native void setOut0(PrintStream stream);

    private static native void setErr0(PrintStream stream);

    @Deprecated(since = "17", forRemoval = true)
    public static void setSecurityManager(SecurityManager sm) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #46                 // class java/lang/UnsupportedOperationException
         * 3: dup
         * 4: ldc           #48                 // String Setting a Security Manager is not supported
         * 6: invokespecial #50                 // Method java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
         * 9: athrow
         *  */
        // </editor-fold>
    }

    @Deprecated(since = "17", forRemoval = true)
    public static SecurityManager getSecurityManager() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aconst_null
         * 1: areturn
         *  */
        // </editor-fold>
    }

    @IntrinsicCandidate
    public static native long currentTimeMillis();

    @IntrinsicCandidate
    public static native long nanoTime();

    @IntrinsicCandidate
    public static native void arraycopy(Object o, int i, Object o1, int i1, int i2);

    @IntrinsicCandidate
    public static native int identityHashCode(Object o);

    public static Properties getProperties() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     #53                 // Field props:Ljava/util/Properties;
         * 3: areturn
         *  */
        // </editor-fold>
    }

    public static String lineSeparator() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     #57                 // Field lineSeparator:Ljava/lang/String;
         * 3: areturn
         *  */
        // </editor-fold>
    }

    public static void setProperties(Properties props) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: ifnonnull     17
         * 4: invokestatic  #61                 // Method jdk/internal/util/SystemProps.initProperties:()Ljava/util/Map;
         * 7: astore_1
         * 8: aload_1
         * 9: invokestatic  #67                 // Method java/lang/VersionProps.init:(Ljava/util/Map;)V
         * 12: aload_1
         * 13: invokestatic  #73                 // Method createProperties:(Ljava/util/Map;)Ljava/util/Properties;
         * 16: astore_0
         * 17: aload_0
         * 18: putstatic     #53                 // Field props:Ljava/util/Properties;
         * 21: return
         *  */
        // </editor-fold>
    }

    public static String getProperty(String key) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokestatic  #77                 // Method checkKey:(Ljava/lang/String;)V
         * 4: getstatic     #53                 // Field props:Ljava/util/Properties;
         * 7: aload_0
         * 8: invokevirtual #80                 // Method java/util/Properties.getProperty:(Ljava/lang/String;)Ljava/lang/String;
         * 11: areturn
         *  */
        // </editor-fold>
    }

    public static String getProperty(String key, String def) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokestatic  #77                 // Method checkKey:(Ljava/lang/String;)V
         * 4: getstatic     #53                 // Field props:Ljava/util/Properties;
         * 7: aload_0
         * 8: aload_1
         * 9: invokevirtual #86                 // Method java/util/Properties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
         * 12: areturn
         *  */
        // </editor-fold>
    }

    public static String setProperty(String key, String value) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokestatic  #77                 // Method checkKey:(Ljava/lang/String;)V
         * 4: getstatic     #53                 // Field props:Ljava/util/Properties;
         * 7: aload_0
         * 8: aload_1
         * 9: invokevirtual #89                 // Method java/util/Properties.setProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
         * 12: checkcast     #93                 // class java/lang/String
         * 15: areturn
         *  */
        // </editor-fold>
    }

    public static String clearProperty(String key) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokestatic  #77                 // Method checkKey:(Ljava/lang/String;)V
         * 4: getstatic     #53                 // Field props:Ljava/util/Properties;
         * 7: aload_0
         * 8: invokevirtual #95                 // Method java/util/Properties.remove:(Ljava/lang/Object;)Ljava/lang/Object;
         * 11: checkcast     #93                 // class java/lang/String
         * 14: areturn
         *  */
        // </editor-fold>
    }

    private static void checkKey(String key) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: ifnonnull     14
         * 4: new           #99                 // class java/lang/NullPointerException
         * 7: dup
         * 8: ldc           #101                // String key can\'t be null
         * 10: invokespecial #103                // Method java/lang/NullPointerException."<init>":(Ljava/lang/String;)V
         * 13: athrow
         * 14: aload_0
         * 15: invokevirtual #104                // Method java/lang/String.isEmpty:()Z
         * 18: ifeq          31
         * 21: new           #108                // class java/lang/IllegalArgumentException
         * 24: dup
         * 25: ldc           #110                // String key can\'t be empty
         * 27: invokespecial #112                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
         * 30: athrow
         * 31: return
         *  */
        // </editor-fold>
    }

    public static String getenv(String name) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokestatic  #113                // Method java/lang/ProcessEnvironment.getenv:(Ljava/lang/String;)Ljava/lang/String;
         * 4: areturn
         *  */
        // </editor-fold>
    }

    public static Map<String, String> getenv() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  #118                // Method java/lang/ProcessEnvironment.getenv:()Ljava/util/Map;
         * 3: areturn
         *  */
        // </editor-fold>
    }

    @CallerSensitive
    public static Logger getLogger(String name) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokestatic  #120                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         * 4: pop
         * 5: invokestatic  #125                // Method jdk/internal/reflect/Reflection.getCallerClass:()Ljava/lang/Class;
         * 8: astore_1
         * 9: aload_1
         * 10: ifnonnull     23
         * 13: new           #131                // class java/lang/IllegalCallerException
         * 16: dup
         * 17: ldc           #133                // String no caller frame
         * 19: invokespecial #135                // Method java/lang/IllegalCallerException."<init>":(Ljava/lang/String;)V
         * 22: athrow
         * 23: aload_0
         * 24: aload_1
         * 25: invokevirtual #136                // Method java/lang/Class.getModule:()Ljava/lang/Module;
         * 28: invokestatic  #142                // Method jdk/internal/logger/LazyLoggers.getLogger:(Ljava/lang/String;Ljava/lang/Module;)Ljava/lang/System$Logger;
         * 31: areturn
         *  */
        // </editor-fold>
    }

    @CallerSensitive
    public static Logger getLogger(String name, ResourceBundle bundle) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: invokestatic  #120                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         * 4: checkcast     #148                // class java/util/ResourceBundle
         * 7: astore_2
         * 8: aload_0
         * 9: invokestatic  #120                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         * 12: pop
         * 13: invokestatic  #125                // Method jdk/internal/reflect/Reflection.getCallerClass:()Ljava/lang/Class;
         * 16: astore_3
         * 17: aload_3
         * 18: ifnonnull     31
         * 21: new           #131                // class java/lang/IllegalCallerException
         * 24: dup
         * 25: ldc           #133                // String no caller frame
         * 27: invokespecial #135                // Method java/lang/IllegalCallerException."<init>":(Ljava/lang/String;)V
         * 30: athrow
         * 31: invokestatic  #150                // Method java/lang/System$LoggerFinder.accessProvider:()Ljava/lang/System$LoggerFinder;
         * 34: aload_0
         * 35: aload_2
         * 36: aload_3
         * 37: invokevirtual #136                // Method java/lang/Class.getModule:()Ljava/lang/Module;
         * 40: invokevirtual #156                // Method java/lang/System$LoggerFinder.getLocalizedLogger:(Ljava/lang/String;Ljava/util/ResourceBundle;Ljava/lang/Module;)Ljava/lang/System$Logger;
         * 43: areturn
         *  */
        // </editor-fold>
    }

    public static void exit(int status) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  #160                // Method java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
         * 3: iload_0
         * 4: invokevirtual #166                // Method java/lang/Runtime.exit:(I)V
         * 7: return
         *  */
        // </editor-fold>
    }

    public static void gc() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  #160                // Method java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
         * 3: invokevirtual #170                // Method java/lang/Runtime.gc:()V
         * 6: return
         *  */
        // </editor-fold>
    }

    @Deprecated(since = "18", forRemoval = true)
    public static void runFinalization() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  #160                // Method java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
         * 3: invokevirtual #173                // Method java/lang/Runtime.runFinalization:()V
         * 6: return
         *  */
        // </editor-fold>
    }

    @CallerSensitive
    @Restricted
    public static void load(String filename) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  #125                // Method jdk/internal/reflect/Reflection.getCallerClass:()Ljava/lang/Class;
         * 3: astore_1
         * 4: aload_1
         * 5: ldc           #8                  // class java/lang/System
         * 7: ldc           #176                // String load
         * 9: iconst_0
         * 10: invokestatic  #178                // Method jdk/internal/reflect/Reflection.ensureNativeAccess:(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Z)V
         * 13: invokestatic  #160                // Method java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
         * 16: aload_1
         * 17: aload_0
         * 18: invokevirtual #182                // Method java/lang/Runtime.load0:(Ljava/lang/Class;Ljava/lang/String;)V
         * 21: return
         *  */
        // </editor-fold>
    }

    @CallerSensitive
    @Restricted
    public static void loadLibrary(String libname) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  #125                // Method jdk/internal/reflect/Reflection.getCallerClass:()Ljava/lang/Class;
         * 3: astore_1
         * 4: aload_1
         * 5: ldc           #8                  // class java/lang/System
         * 7: ldc           #186                // String loadLibrary
         * 9: iconst_0
         * 10: invokestatic  #178                // Method jdk/internal/reflect/Reflection.ensureNativeAccess:(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Z)V
         * 13: invokestatic  #160                // Method java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
         * 16: aload_1
         * 17: aload_0
         * 18: invokevirtual #188                // Method java/lang/Runtime.loadLibrary0:(Ljava/lang/Class;Ljava/lang/String;)V
         * 21: return
         *  */
        // </editor-fold>
    }

    public static native String mapLibraryName(String string);

    private static PrintStream newPrintStream(OutputStream out, String enc) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: ifnull        31
         * 4: new           #191                // class java/io/PrintStream
         * 7: dup
         * 8: new           #193                // class java/io/BufferedOutputStream
         * 11: dup
         * 12: aload_0
         * 13: sipush        128
         * 16: invokespecial #195                // Method java/io/BufferedOutputStream."<init>":(Ljava/io/OutputStream;I)V
         * 19: iconst_1
         * 20: aload_1
         * 21: getstatic     #198                // Field sun/nio/cs/UTF_8.INSTANCE:Lsun/nio/cs/UTF_8;
         * 24: invokestatic  #204                // Method java/nio/charset/Charset.forName:(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;
         * 27: invokespecial #210                // Method java/io/PrintStream."<init>":(Ljava/io/OutputStream;ZLjava/nio/charset/Charset;)V
         * 30: areturn
         * 31: new           #191                // class java/io/PrintStream
         * 34: dup
         * 35: new           #193                // class java/io/BufferedOutputStream
         * 38: dup
         * 39: aload_0
         * 40: sipush        128
         * 43: invokespecial #195                // Method java/io/BufferedOutputStream."<init>":(Ljava/io/OutputStream;I)V
         * 46: iconst_1
         * 47: invokespecial #213                // Method java/io/PrintStream."<init>":(Ljava/io/OutputStream;Z)V
         * 50: areturn
         *  */
        // </editor-fold>
    }

    private static void logInitException(boolean printToStderr, boolean printStackTrace, String msg, Throwable e) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  #216                // Method jdk/internal/misc/VM.initLevel:()I
         * 3: iconst_1
         * 4: if_icmpge     17
         * 7: new           #222                // class java/lang/InternalError
         * 10: dup
         * 11: ldc           #224                // String system classes not initialized
         * 13: invokespecial #226                // Method java/lang/InternalError."<init>":(Ljava/lang/String;)V
         * 16: athrow
         * 17: iload_0
         * 18: ifeq          27
         * 21: getstatic     #227                // Field err:Ljava/io/PrintStream;
         * 24: goto          30
         * 27: getstatic     #231                // Field out:Ljava/io/PrintStream;
         * 30: astore        4
         * 32: aload_2
         * 33: ifnull        42
         * 36: aload         4
         * 38: aload_2
         * 39: invokevirtual #234                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 42: iload_1
         * 43: ifeq          55
         * 46: aload_3
         * 47: aload         4
         * 49: invokevirtual #237                // Method java/lang/Throwable.printStackTrace:(Ljava/io/PrintStream;)V
         * 52: goto          157
         * 55: aload         4
         * 57: aload_3
         * 58: invokevirtual #242                // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
         * 61: aload_3
         * 62: invokevirtual #245                // Method java/lang/Throwable.getSuppressed:()[Ljava/lang/Throwable;
         * 65: astore        5
         * 67: aload         5
         * 69: arraylength
         * 70: istore        6
         * 72: iconst_0
         * 73: istore        7
         * 75: iload         7
         * 77: iload         6
         * 79: if_icmpge     120
         * 82: aload         5
         * 84: iload         7
         * 86: aaload
         * 87: astore        8
         * 89: aload         4
         * 91: new           #249                // class java/lang/StringBuilder
         * 94: dup
         * 95: invokespecial #251                // Method java/lang/StringBuilder."<init>":()V
         * 98: ldc           #252                // String Suppressed:
         * 100: invokevirtual #254                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 103: aload         8
         * 105: invokevirtual #258                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 108: invokevirtual #261                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 111: invokevirtual #234                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 114: iinc          7, 1
         * 117: goto          75
         * 120: aload_3
         * 121: invokevirtual #265                // Method java/lang/Throwable.getCause:()Ljava/lang/Throwable;
         * 124: astore        5
         * 126: aload         5
         * 128: ifnull        157
         * 131: aload         4
         * 133: new           #249                // class java/lang/StringBuilder
         * 136: dup
         * 137: invokespecial #251                // Method java/lang/StringBuilder."<init>":()V
         * 140: ldc_w         #269                // String Caused by:
         * 143: invokevirtual #254                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 146: aload         5
         * 148: invokevirtual #258                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 151: invokevirtual #261                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 154: invokevirtual #234                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 157: return
         *  */
        // </editor-fold>
    }

    private static Properties createProperties(Map<String, String> initialProps) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #81                 // class java/util/Properties
         * 3: dup
         * 4: aload_0
         * 5: invokeinterface #271,  1          // InterfaceMethod java/util/Map.size:()I
         * 10: invokespecial #276                // Method java/util/Properties."<init>":(I)V
         * 13: astore_1
         * 14: aload_0
         * 15: invokeinterface #278,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
         * 20: invokeinterface #282,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
         * 25: astore_2
         * 26: aload_2
         * 27: invokeinterface #288,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
         * 32: ifeq          259
         * 35: aload_2
         * 36: invokeinterface #293,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
         * 41: checkcast     #297                // class java/util/Map$Entry
         * 44: astore_3
         * 45: aload_3
         * 46: invokeinterface #299,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
         * 51: checkcast     #93                 // class java/lang/String
         * 54: astore        4
         * 56: aload         4
         * 58: astore        5
         * 60: iconst_m1
         * 61: istore        6
         * 63: aload         5
         * 65: invokevirtual #302                // Method java/lang/String.hashCode:()I
         * 68: lookupswitch  { // 5
         * -1594982994: 188
         * -903405997: 120
         * -137219825: 171
         * 82382212: 137
         * 2006761672: 154
         * default: 202
         * }
         * 120: aload         5
         * 122: ldc_w         #305                // String sun.nio.MaxDirectMemorySize
         * 125: invokevirtual #307                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 128: ifeq          202
         * 131: iconst_0
         * 132: istore        6
         * 134: goto          202
         * 137: aload         5
         * 139: ldc_w         #311                // String sun.nio.PageAlignDirectMemory
         * 142: invokevirtual #307                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 145: ifeq          202
         * 148: iconst_1
         * 149: istore        6
         * 151: goto          202
         * 154: aload         5
         * 156: ldc_w         #313                // String java.lang.Integer.IntegerCache.high
         * 159: invokevirtual #307                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 162: ifeq          202
         * 165: iconst_2
         * 166: istore        6
         * 168: goto          202
         * 171: aload         5
         * 173: ldc_w         #315                // String sun.java.launcher.diag
         * 176: invokevirtual #307                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 179: ifeq          202
         * 182: iconst_3
         * 183: istore        6
         * 185: goto          202
         * 188: aload         5
         * 190: ldc_w         #317                // String jdk.boot.class.path.append
         * 193: invokevirtual #307                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 196: ifeq          202
         * 199: iconst_4
         * 200: istore        6
         * 202: iload         6
         * 204: tableswitch   { // 0 to 4
         * 0: 240
         * 1: 240
         * 2: 240
         * 3: 240
         * 4: 240
         * default: 243
         * }
         * 240: goto          256
         * 243: aload_1
         * 244: aload         4
         * 246: aload_3
         * 247: invokeinterface #319,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
         * 252: invokevirtual #322                // Method java/util/Properties.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         * 255: pop
         * 256: goto          26
         * 259: aload_1
         * 260: areturn
         *  */
        // </editor-fold>
    }

    private static void initPhase1() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  #326                // Method setJavaLangAccess:()V
         * 3: invokestatic  #61                 // Method jdk/internal/util/SystemProps.initProperties:()Ljava/util/Map;
         * 6: astore_0
         * 7: aload_0
         * 8: invokestatic  #67                 // Method java/lang/VersionProps.init:(Ljava/util/Map;)V
         * 11: aload_0
         * 12: invokestatic  #329                // Method jdk/internal/misc/VM.saveProperties:(Ljava/util/Map;)V
         * 15: aload_0
         * 16: invokestatic  #73                 // Method createProperties:(Ljava/util/Map;)Ljava/util/Properties;
         * 19: putstatic     #53                 // Field props:Ljava/util/Properties;
         * 22: getstatic     #53                 // Field props:Ljava/util/Properties;
         * 25: ldc_w         #332                // String sun.jnu.encoding
         * 28: invokevirtual #80                 // Method java/util/Properties.getProperty:(Ljava/lang/String;)Ljava/lang/String;
         * 31: astore_1
         * 32: aload_1
         * 33: ifnull        43
         * 36: aload_1
         * 37: invokestatic  #334                // Method java/nio/charset/Charset.isSupported:(Ljava/lang/String;)Z
         * 40: ifne          70
         * 43: aload_1
         * 44: ifnonnull     53
         * 47: ldc_w         #338                // String null
         * 50: goto          54
         * 53: aload_1
         * 54: putstatic     #340                // Field notSupportedJnuEncoding:Ljava/lang/String;
         * 57: getstatic     #53                 // Field props:Ljava/util/Properties;
         * 60: ldc_w         #332                // String sun.jnu.encoding
         * 63: ldc_w         #343                // String UTF-8
         * 66: invokevirtual #89                 // Method java/util/Properties.setProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
         * 69: pop
         * 70: invokestatic  #345                // Method jdk/internal/util/StaticProperty.javaHome:()Ljava/lang/String;
         * 73: pop
         * 74: getstatic     #53                 // Field props:Ljava/util/Properties;
         * 77: ldc_w         #350                // String line.separator
         * 80: invokevirtual #80                 // Method java/util/Properties.getProperty:(Ljava/lang/String;)Ljava/lang/String;
         * 83: putstatic     #57                 // Field lineSeparator:Ljava/lang/String;
         * 86: new           #352                // class java/lang/System$In
         * 89: dup
         * 90: getstatic     #354                // Field java/io/FileDescriptor.in:Ljava/io/FileDescriptor;
         * 93: invokespecial #360                // Method java/lang/System$In."<init>":(Ljava/io/FileDescriptor;)V
         * 96: astore_2
         * 97: new           #363                // class java/lang/System$Out
         * 100: dup
         * 101: getstatic     #365                // Field java/io/FileDescriptor.out:Ljava/io/FileDescriptor;
         * 104: invokespecial #367                // Method java/lang/System$Out."<init>":(Ljava/io/FileDescriptor;)V
         * 107: astore_3
         * 108: new           #363                // class java/lang/System$Out
         * 111: dup
         * 112: getstatic     #368                // Field java/io/FileDescriptor.err:Ljava/io/FileDescriptor;
         * 115: invokespecial #367                // Method java/lang/System$Out."<init>":(Ljava/io/FileDescriptor;)V
         * 118: astore        4
         * 120: new           #370                // class java/io/BufferedInputStream
         * 123: dup
         * 124: aload_2
         * 125: invokespecial #372                // Method java/io/BufferedInputStream."<init>":(Ljava/io/InputStream;)V
         * 128: putstatic     #374                // Field initialIn:Ljava/io/InputStream;
         * 131: getstatic     #374                // Field initialIn:Ljava/io/InputStream;
         * 134: invokestatic  #7                  // Method setIn0:(Ljava/io/InputStream;)V
         * 137: aload_3
         * 138: getstatic     #53                 // Field props:Ljava/util/Properties;
         * 141: ldc_w         #378                // String stdout.encoding
         * 144: invokevirtual #80                 // Method java/util/Properties.getProperty:(Ljava/lang/String;)Ljava/lang/String;
         * 147: invokestatic  #380                // Method newPrintStream:(Ljava/io/OutputStream;Ljava/lang/String;)Ljava/io/PrintStream;
         * 150: invokestatic  #13                 // Method setOut0:(Ljava/io/PrintStream;)V
         * 153: aload         4
         * 155: getstatic     #53                 // Field props:Ljava/util/Properties;
         * 158: ldc_w         #384                // String stderr.encoding
         * 161: invokevirtual #80                 // Method java/util/Properties.getProperty:(Ljava/lang/String;)Ljava/lang/String;
         * 164: invokestatic  #380                // Method newPrintStream:(Ljava/io/OutputStream;Ljava/lang/String;)Ljava/io/PrintStream;
         * 167: putstatic     #386                // Field initialErr:Ljava/io/PrintStream;
         * 170: getstatic     #386                // Field initialErr:Ljava/io/PrintStream;
         * 173: invokestatic  #17                 // Method setErr0:(Ljava/io/PrintStream;)V
         * 176: invokestatic  #389                // Method java/lang/Terminator.setup:()V
         * 179: invokestatic  #394                // Method jdk/internal/misc/VM.initializeOSEnvironment:()V
         * 182: invokestatic  #397                // Method jdk/internal/access/SharedSecrets.getJavaLangRefAccess:()Ljdk/internal/access/JavaLangRefAccess;
         * 185: invokeinterface #401,  1          // InterfaceMethod jdk/internal/access/JavaLangRefAccess.startThreads:()V
         * 190: iconst_1
         * 191: invokestatic  #406                // Method jdk/internal/misc/VM.initLevel:(I)V
         * 194: return
         *  */
        // </editor-fold>
    }

    private static int initPhase2(boolean printToStderr, boolean printStackTrace) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  #408                // Method jdk/internal/module/ModuleBootstrap.boot:()Ljava/lang/ModuleLayer;
         * 3: putstatic     #414                // Field bootLayer:Ljava/lang/ModuleLayer;
         * 6: goto          21
         * 9: astore_2
         * 10: iload_0
         * 11: iload_1
         * 12: ldc_w         #422                // String Error occurred during initialization of boot layer
         * 15: aload_2
         * 16: invokestatic  #424                // Method logInitException:(ZZLjava/lang/String;Ljava/lang/Throwable;)V
         * 19: iconst_m1
         * 20: ireturn
         * 21: iconst_2
         * 22: invokestatic  #406                // Method jdk/internal/misc/VM.initLevel:(I)V
         * 25: iconst_0
         * 26: ireturn
         * Exception table:
         * from    to  target type
         * 0     6     9   Class java/lang/Exception
         * 0     6     9   Class java/lang/Error
         *  */
        // </editor-fold>
    }

    private static void initPhase3() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  #428                // Method jdk/internal/util/SystemProps.isBadIoTmpdir:()Z
         * 3: ifeq          15
         * 6: getstatic     #227                // Field err:Ljava/io/PrintStream;
         * 9: ldc_w         #431                // String WARNING: java.io.tmpdir directory does not exist
         * 12: invokevirtual #234                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 15: ldc_w         #433                // String java.security.manager
         * 18: invokestatic  #435                // Method getProperty:(Ljava/lang/String;)Ljava/lang/String;
         * 21: astore_0
         * 22: aload_0
         * 23: ifnull        178
         * 26: aload_0
         * 27: astore_1
         * 28: iconst_m1
         * 29: istore_2
         * 30: aload_1
         * 31: invokevirtual #302                // Method java/lang/String.hashCode:()I
         * 34: lookupswitch  { // 4
         * 0: 106
         * 92906313: 91
         * 271239035: 76
         * 1544803905: 121
         * default: 133
         * }
         * 76: aload_1
         * 77: ldc_w         #436                // String disallow
         * 80: invokevirtual #307                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 83: ifeq          133
         * 86: iconst_0
         * 87: istore_2
         * 88: goto          133
         * 91: aload_1
         * 92: ldc_w         #438                // String allow
         * 95: invokevirtual #307                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 98: ifeq          133
         * 101: iconst_1
         * 102: istore_2
         * 103: goto          133
         * 106: aload_1
         * 107: ldc_w         #440                // String
         * 110: invokevirtual #307                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 113: ifeq          133
         * 116: iconst_2
         * 117: istore_2
         * 118: goto          133
         * 121: aload_1
         * 122: ldc_w         #442                // String default
         * 125: invokevirtual #307                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 128: ifeq          133
         * 131: iconst_3
         * 132: istore_2
         * 133: iload_2
         * 134: tableswitch   { // 0 to 3
         * 0: 164
         * 1: 167
         * 2: 167
         * 3: 167
         * default: 167
         * }
         * 164: goto          178
         * 167: new           #420                // class java/lang/Error
         * 170: dup
         * 171: ldc_w         #444                // String A command line option has attempted to allow or enable the Security Manager. Enabling a Security Manager is not supported.
         * 174: invokespecial #446                // Method java/lang/Error."<init>":(Ljava/lang/String;)V
         * 177: athrow
         * 178: getstatic     #340                // Field notSupportedJnuEncoding:Ljava/lang/String;
         * 181: ifnull        212
         * 184: getstatic     #227                // Field err:Ljava/io/PrintStream;
         * 187: new           #249                // class java/lang/StringBuilder
         * 190: dup
         * 191: invokespecial #251                // Method java/lang/StringBuilder."<init>":()V
         * 194: ldc_w         #447                // String WARNING: The encoding of the underlying platform\'s file system is not supported:
         * 197: invokevirtual #254                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 200: getstatic     #340                // Field notSupportedJnuEncoding:Ljava/lang/String;
         * 203: invokevirtual #254                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 206: invokevirtual #261                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 209: invokevirtual #234                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 212: iconst_3
         * 213: invokestatic  #406                // Method jdk/internal/misc/VM.initLevel:(I)V
         * 216: invokestatic  #449                // Method java/lang/ClassLoader.initSystemClassLoader:()Ljava/lang/ClassLoader;
         * 219: astore_1
         * 220: invokestatic  #455                // Method java/lang/Thread.currentThread:()Ljava/lang/Thread;
         * 223: aload_1
         * 224: invokevirtual #461                // Method java/lang/Thread.setContextClassLoader:(Ljava/lang/ClassLoader;)V
         * 227: iconst_4
         * 228: invokestatic  #406                // Method jdk/internal/misc/VM.initLevel:(I)V
         * 231: return
         *  */
        // </editor-fold>
    }

    private static void setJavaLangAccess() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #465                // class java/lang/System$1
         * 3: dup
         * 4: invokespecial #467                // Method java/lang/System$1."<init>":()V
         * 7: invokestatic  #468                // Method jdk/internal/access/SharedSecrets.setJavaLangAccess:(Ljdk/internal/access/JavaLangAccess;)V
         * 10: return
         *  */
        // </editor-fold>
    }
}
