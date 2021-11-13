package toothpick.smoothie.provider;

import android.app.Activity;
import java.lang.Override;
import toothpick.Factory;
import toothpick.Scope;

public final class LayoutInflaterProvider$$Factory implements Factory<LayoutInflaterProvider> {
  @Override
  public LayoutInflaterProvider createInstance(Scope scope) {
    scope = getTargetScope(scope);
    Activity param1 = scope.getInstance(Activity.class);
    LayoutInflaterProvider layoutInflaterProvider = new LayoutInflaterProvider(param1);
    return layoutInflaterProvider;
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
