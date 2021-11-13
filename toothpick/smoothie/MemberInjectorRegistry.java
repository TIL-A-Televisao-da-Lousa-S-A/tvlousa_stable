// Generated code from Toothpick. Do not modify!
package toothpick.smoothie;

import java.lang.Class;
import toothpick.MemberInjector;
import toothpick.registries.memberinjector.AbstractMemberInjectorRegistry;

public final class MemberInjectorRegistry extends AbstractMemberInjectorRegistry {
  public MemberInjectorRegistry() {
  }

  public <T> MemberInjector<T> getMemberInjector(Class<T> clazz) {
    String className = clazz.getName();
    int bucket = (className.hashCode() & -1);
    switch(bucket) {
      default:
      return getMemberInjectorInChildrenRegistries(clazz);
    }
  }
}
