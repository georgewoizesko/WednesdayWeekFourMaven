package com.projectfive.ui;

import android.app.Activity;

import com.projectfive.VelcroModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
    injects = {
        MainActivity.class
    },
    addsTo = VelcroModule.class,
    library = true
)
public class ActivityModule {
  private final Activity activity;

  public ActivityModule(Activity activity) {
    this.activity = activity;
  }

  @Provides @Singleton Activity provideActivityContext() {
    return activity;
  }
}
