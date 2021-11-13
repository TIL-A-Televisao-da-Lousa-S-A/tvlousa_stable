package toothpick.smoothie.provider;

import java.lang.Override;
import toothpick.Factory;
import toothpick.Scope;

public final class HandlerProvider$$Factory implements Factory<HandlerProvider> {
  @Override
  public HandlerProvider createInstance(Scope scope) {
    HandlerProvider handlerProvider = new HandlerProvider();
    return handlerProvider;
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
