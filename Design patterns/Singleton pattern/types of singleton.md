
# Singleton is a creational design pattern that ensures a class has only one instance and provides a global point of access to it. 

    Use Cases of Singleton
	•	Logging frameworks (Logger)
	•	Configuration settings
	•	Thread pools
	•	Caches
    •	Database connection pools
	•	Registry objects
	•	Load balancers

# Basic Singleton (Eager Initialization)

➕ Simple and thread-safe
➖ Not lazy, instance created even if not used

    public class EagerSingleton {

        private static final EagerSingleton instance = new EagerSingleton();

        private EagerSingleton() {}  // private constructor

        public static EagerSingleton getInstance() {
            return instance;
        }
    }

# Lazy Initialization (Non-thread-safe)

➕ Lazy — only created when needed
➖ Not thread-safe

    public class LazySingleton {
        private static LazySingleton instance;

        private LazySingleton() {}

        public static LazySingleton getInstance() {
            if (instance == null) {
                instance = new LazySingleton();  // Not thread-safe!
            }
            return instance;
        }
    }

# 3. Lazy Initialization (Thread-safe with synchronized)

➕ Thread-safe
➖ Performance hit due to synchronized

    public class SynchronizedSingleton {
        private static SynchronizedSingleton instance;

        private SynchronizedSingleton() {}

        public static synchronized SynchronizedSingleton getInstance() {
            if (instance == null) {
                instance = new SynchronizedSingleton();
            }
            return instance;
        }
    }

# Double-Checked Locking (Best of both worlds)
➕ Thread-safe and fast
➕ Lazy initialization
➖ Slightly complex syntax

    public class DoubleCheckedLockingSingleton {
        private static volatile DoubleCheckedLockingSingleton instance;

        private DoubleCheckedLockingSingleton() {}

        public static DoubleCheckedLockingSingleton getInstance() {
            if (instance == null) {
                synchronized (DoubleCheckedLockingSingleton.class) {
                    if (instance == null) {
                        instance = new DoubleCheckedLockingSingleton();
                    }
                }
            }
            return instance;
        }
    }

# Enum Singleton (Most Robust)

➕ Thread-safe
➕ Serialization safe
➖ Hard to lazy-initialize

    public enum EnumSingleton {
        INSTANCE;

        public void doSomething() {
            System.out.println("Doing something...");
        }
    }