package toothpick.smoothie.provider;

import android.app.Activity;
import java.lang.Override;
import toothpick.Factory;
import toothpick.Scope;

public final class SupportLoaderManagerProvider$$Factory implements Factory<SupportLoaderManagerProvider> {
  @Override
  public SupportLoaderManagerProvider createInstance(Scope scope) {
    scope = getTargetScope(scope);
    Activity param1 = scope.getInstance(Activity.class);
    SupportLoaderManagerProvider supportLoaderManagerProvider = new SupportLoaderManagerProvider(param1);
    return supportLoaderManagerProvider;
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
