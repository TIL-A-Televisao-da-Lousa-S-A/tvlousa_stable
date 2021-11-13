package toothpick.smoothie.provider;

import android.app.Activity;
import java.lang.Override;
import toothpick.Factory;
import toothpick.Scope;

public final class SupportFragmentManagerProvider$$Factory implements Factory<SupportFragmentManagerProvider> {
  @Override
  public SupportFragmentManagerProvider createInstance(Scope scope) {
    scope = getTargetScope(scope);
    Activity param1 = scope.getInstance(Activity.class);
    SupportFragmentManagerProvider supportFragmentManagerProvider = new SupportFragmentManagerProvider(param1);
    return supportFragmentManagerProvider;
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
