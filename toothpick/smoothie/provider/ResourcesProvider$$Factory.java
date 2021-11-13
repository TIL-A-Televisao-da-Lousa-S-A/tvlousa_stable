package toothpick.smoothie.provider;

import android.app.Application;
import java.lang.Override;
import toothpick.Factory;
import toothpick.Scope;

public final class ResourcesProvider$$Factory implements Factory<ResourcesProvider> {
  @Override
  public ResourcesProvider createInstance(Scope scope) {
    scope = getTargetScope(scope);
    Application param1 = scope.getInstance(Application.class);
    ResourcesProvider resourcesProvider = new ResourcesProvider(param1);
    return resourcesProvider;
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
