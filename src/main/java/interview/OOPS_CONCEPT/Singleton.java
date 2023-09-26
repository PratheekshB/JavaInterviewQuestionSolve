package interview.OOPS_CONCEPT;

class Singleton {
    static class A {
        private static final A obj = new A();

        private A() {
        }

        public static A getA() {
            return obj;
        }

    }
}
