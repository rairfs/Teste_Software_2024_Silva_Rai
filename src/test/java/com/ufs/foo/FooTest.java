package com.ufs.foo;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class FooTest {

    @Test
    public void dependencyIsNotCalled() {
        final Foo foo = new Foo();
        final Dependency dependency = mock(Dependency.class);
        foo.bar(dependency);

        verify(dependency, never()).someMethod();
    }
}