package toothpick.smoothie.provider;

import android.app.Application;
import java.lang.Override;
import toothpick.Factory;
import toothpick.Scope;

public final class PackageManagerProvider$$Factory implements Factory<PackageManagerProvider> {
  @Override
  public PackageManagerProvider createInstance(Scope scope) {
    scope = getTargetScope(scope);
    Application param1 = scope.getInstance(Application.class);
    PackageManagerProvider packageManagerProvider = new PackageManagerProvider(param1);
    return packageManagerProvider;
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
