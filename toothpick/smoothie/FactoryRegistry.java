// Generated code from Toothpick. Do not modify!
package toothpick.smoothie;

import java.lang.Class;
import java.lang.String;
import toothpick.Factory;
import toothpick.registries.factory.AbstractFactoryRegistry;

public final class FactoryRegistry extends AbstractFactoryRegistry {
  public FactoryRegistry() {
  }

  public <T> Factory<T> getFactory(Class<T> clazz) {
    String className = clazz.getName();
    int bucket = (className.hashCode() & 0);
    switch(bucket) {
      case (0):
      return getFactoryBucket0(clazz, className);
      default:
      return getFactoryInChildrenRegistries(clazz);
    }
  }

  private <T> Factory<T> getFactoryBucket0(Class<T> clazz, String className) {
    switch(className) {
      case ("toothpick.smoothie.provider.AccountManagerProvider"):
      return (Factory<T>) new toothpick.smoothie.provider.AccountManagerProvider$$Factory();
      case ("toothpick.smoothie.provider.AssetManagerProvider"):
      return (Factory<T>) new toothpick.smoothie.provider.AssetManagerProvider$$Factory();
      case ("toothpick.smoothie.provider.ContentResolverProvider"):
      return (Factory<T>) new toothpick.smoothie.provider.ContentResolverProvider$$Factory();
      case ("toothpick.smoothie.provider.FragmentManagerProvider"):
      return (Factory<T>) new toothpick.smoothie.provider.FragmentManagerProvider$$Factory();
      case ("toothpick.smoothie.provider.HandlerProvider"):
      return (Factory<T>) new toothpick.smoothie.provider.HandlerProvider$$Factory();
      case ("toothpick.smoothie.provider.LayoutInflaterProvider"):
      return (Factory<T>) new toothpick.smoothie.provider.LayoutInflaterProvider$$Factory();
      case ("toothpick.smoothie.provider.LoaderManagerProvider"):
      return (Factory<T>) new toothpick.smoothie.provider.LoaderManagerProvider$$Factory();
      case ("toothpick.smoothie.provider.PackageManagerProvider"):
      return (Factory<T>) new toothpick.smoothie.provider.PackageManagerProvider$$Factory();
      case ("toothpick.smoothie.provider.ResourcesProvider"):
      return (Factory<T>) new toothpick.smoothie.provider.ResourcesProvider$$Factory();
      case ("toothpick.smoothie.provider.SharedPreferencesProvider"):
      return (Factory<T>) new toothpick.smoothie.provider.SharedPreferencesProvider$$Factory();
      case ("toothpick.smoothie.provider.SupportFragmentManagerProvider"):
      return (Factory<T>) new toothpick.smoothie.provider.SupportFragmentManagerProvider$$Factory();
      case ("toothpick.smoothie.provider.SupportLoaderManagerProvider"):
      return (Factory<T>) new toothpick.smoothie.provider.SupportLoaderManagerProvider$$Factory();
      default:
      return getFactoryInChildrenRegistries(clazz);
    }
  }
}
