package com.projectfive;

import android.app.Application;

import com.projectfive.data.DataModule;
import com.projectfive.ui.UiModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
    includes = {
        UiModule.class,
        DataModule.class
    },
    injects = {
        VelcroApp.class
    }
)
public final class VelcroModule {
  private final VelcroApp app;

  public VelcroModule(VelcroApp app) {
    this.app = app;
  }

  @Provides @Singleton Application provideApplication() {
    return app;
  }
}
