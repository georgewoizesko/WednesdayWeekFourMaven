package com.projectfive;

final class Modules {
    static Object[] list(VelcroApp app) {
        return new Object[]{
                new VelcroModule(app)
        };
    }

    private Modules() {
        // No instances.
    }
}
