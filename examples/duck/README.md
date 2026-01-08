# Duck Simulator Example (Strategy Pattern)

This example demonstrates the Strategy pattern using a Duck simulator: ducks have interchangeable flying and quacking behaviors.

## Suggested package layout
- `com.example.duck.behavior` — interfaces: `FlyBehavior`, `QuackBehavior`
- `com.example.duck.behavior.impl` — concrete behaviors: `FlyWithWings`, `NoFly`, `Quack`, `Squeak`, `MuteQuack`
- `com.example.duck` — `Duck` (abstract), `MallardDuck`, `RubberDuck`, `Simulator` (main)

## Minimal examples

FlyBehavior:

```java
package com.example.duck.behavior;

public interface FlyBehavior {
    void fly();
}
```

FlyWithWings:

```java
package com.example.duck.behavior.impl;

import com.example.duck.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings!");
    }
}
```

Duck (context):

```java
package com.example.duck;

import com.example.duck.behavior.FlyBehavior;
import com.example.duck.behavior.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void performFly() {
        if (flyBehavior != null) flyBehavior.fly();
    }

    public void performQuack() {
        if (quackBehavior != null) quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public abstract void display();
}
```

How to attach the diagram image:

Place the diagram in `images/strategy_Pattern_Duck_simulator.png` at the repository root and reference it like this:

```markdown
![Duck Simulator UML](../../images/strategy_Pattern_Duck_simulator.png)
```

You can also add the Java source examples under `src/main/java/com/example/duck/...`. If you'd like, I can create those files and a small JUnit test that swaps strategies at runtime.

