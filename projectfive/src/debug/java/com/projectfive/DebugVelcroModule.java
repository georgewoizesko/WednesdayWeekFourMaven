package com.projectfive;

import com.projectfive.data.DebugDataModule;
import com.projectfive.ui.DebugUiModule;

import dagger.Module;

@Module(
    addsTo = VelcroModule.class,
    includes = {
        DebugUiModule.class,
        DebugDataModule.class
    },
    overrides = true
)
public final class DebugVelcroModule {
}
