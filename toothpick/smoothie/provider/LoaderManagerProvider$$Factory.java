package toothpick.smoothie.provider;

import android.app.Activity;
import java.lang.Override;
import toothpick.Factory;
import toothpick.Scope;

public final class LoaderManagerProvider$$Factory implements Factory<LoaderManagerProvider> {
  @Override
  public LoaderManagerProvider createInstance(Scope scope) {
    scope = getTargetScope(scope);
    Activity param1 = scope.getInstance(Activity.class);
    LoaderManagerProvider loaderManagerProvider = new LoaderManagerProvider(param1);
    return loaderManagerProvider;
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
