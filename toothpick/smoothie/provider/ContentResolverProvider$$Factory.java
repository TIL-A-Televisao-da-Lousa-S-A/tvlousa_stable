package toothpick.smoothie.provider;

import android.app.Application;
import java.lang.Override;
import toothpick.Factory;
import toothpick.Scope;

public final class ContentResolverProvider$$Factory implements Factory<ContentResolverProvider> {
  @Override
  public ContentResolverProvider createInstance(Scope scope) {
    scope = getTargetScope(scope);
    Application param1 = scope.getInstance(Application.class);
    ContentResolverProvider contentResolverProvider = new ContentResolverProvider(param1);
    return contentResolverProvider;
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
