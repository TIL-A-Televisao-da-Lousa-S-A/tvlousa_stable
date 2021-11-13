package toothpick.smoothie.provider;

import android.app.Application;
import java.lang.Override;
import toothpick.Factory;
import toothpick.Scope;

public final class SharedPreferencesProvider$$Factory implements Factory<SharedPreferencesProvider> {
  @Override
  public SharedPreferencesProvider createInstance(Scope scope) {
    scope = getTargetScope(scope);
    Application param1 = scope.getInstance(Application.class);
    SharedPreferencesProvider sharedPreferencesProvider = new SharedPreferencesProvider(param1);
    return sharedPreferencesProvider;
  }

  @Override
  public Scope getTargetScope(Scope scope) {
    return scope;
  }

  @Override
  public boolean hasScopeAnnotation() {
    return false;
  }

  @Override
  public boolean hasProvidesSingletonInScopeAnnotation() {
    return false;
  }
}
