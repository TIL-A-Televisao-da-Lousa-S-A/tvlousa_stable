package toothpick.smoothie.provider;

import android.app.Application;
import java.lang.Override;
import toothpick.Factory;
import toothpick.Scope;

public final class AssetManagerProvider$$Factory implements Factory<AssetManagerProvider> {
  @Override
  public AssetManagerProvider createInstance(Scope scope) {
    scope = getTargetScope(scope);
    Application param1 = scope.getInstance(Application.class);
    AssetManagerProvider assetManagerProvider = new AssetManagerProvider(param1);
    return assetManagerProvider;
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
