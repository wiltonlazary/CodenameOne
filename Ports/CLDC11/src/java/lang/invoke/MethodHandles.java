/*
 * Copyright (c) 2008, 2010, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores
 * CA 94065 USA or visit www.oracle.com if you need additional information or
 * have any questions.
 */
package java.lang.invoke;

/**
 * @deprecated these classes are used internally for Lambda compatibility
 */
public abstract class MethodHandles {
  public MethodHandles() {
  }

  public static java.lang.invoke.MethodHandles.Lookup lookup() {
      return null;
  }
  public static java.lang.invoke.MethodHandles.Lookup publicLookup() {
      return null;
  }
  public static <T> T reflectAs(java.lang.Class<T> a, java.lang.invoke.MethodHandle b) {
      return null;
  }
  public static java.lang.invoke.MethodHandle arrayElementGetter(java.lang.Class<?> a) throws java.lang.IllegalArgumentException {
      return null;
  }
  
  public static java.lang.invoke.MethodHandle arrayElementSetter(java.lang.Class<?> a) throws java.lang.IllegalArgumentException {
        return null;
  }
  public static java.lang.invoke.MethodHandle spreadInvoker(java.lang.invoke.MethodType a, int b) {
        return null;
  }

  public static java.lang.invoke.MethodHandle exactInvoker(java.lang.invoke.MethodType a) {
        return null;
  }

  public static java.lang.invoke.MethodHandle invoker(java.lang.invoke.MethodType a) {
        return null;
  }

  static java.lang.invoke.MethodHandle basicInvoker(java.lang.invoke.MethodType a) {
        return null;
  }

  public static java.lang.invoke.MethodHandle explicitCastArguments(java.lang.invoke.MethodHandle a, java.lang.invoke.MethodType b) {
        return null;
  }

  public static java.lang.invoke.MethodHandle permuteArguments(java.lang.invoke.MethodHandle a, java.lang.invoke.MethodType b, int... c) {
        return null;
  }

  public static java.lang.invoke.MethodHandle constant(java.lang.Class<?> a, java.lang.Object b) {
        return null;
  }

  public static java.lang.invoke.MethodHandle identity(java.lang.Class<?> a) {
        return null;
  }

  public static java.lang.invoke.MethodHandle insertArguments(java.lang.invoke.MethodHandle a, int b, java.lang.Object... c) {
        return null;
  }

  public static java.lang.invoke.MethodHandle dropArguments(java.lang.invoke.MethodHandle a, int b, java.util.List<java.lang.Class<?>> c) {
        return null;
  }

  public static java.lang.invoke.MethodHandle dropArguments(java.lang.invoke.MethodHandle a, int b, java.lang.Class<?>... c) {
        return null;
  }

  public static java.lang.invoke.MethodHandle filterArguments(java.lang.invoke.MethodHandle a, int b, java.lang.invoke.MethodHandle... c) {
        return null;
  }

  public static java.lang.invoke.MethodHandle collectArguments(java.lang.invoke.MethodHandle a, int b, java.lang.invoke.MethodHandle c) {
        return null;
  }

  public static java.lang.invoke.MethodHandle filterReturnValue(java.lang.invoke.MethodHandle a, java.lang.invoke.MethodHandle b) {
        return null;
  }

  public static java.lang.invoke.MethodHandle foldArguments(java.lang.invoke.MethodHandle a, java.lang.invoke.MethodHandle b) {
        return null;
  }

  public static java.lang.invoke.MethodHandle guardWithTest(java.lang.invoke.MethodHandle a, java.lang.invoke.MethodHandle b, java.lang.invoke.MethodHandle c) {
        return null;
  }

  static java.lang.RuntimeException misMatchedTypes(java.lang.String a, java.lang.invoke.MethodType b, java.lang.invoke.MethodType c) {
        return null;
  }

  public static java.lang.invoke.MethodHandle catchException(java.lang.invoke.MethodHandle a, java.lang.Class<? extends java.lang.Throwable> b, java.lang.invoke.MethodHandle c) {
        return null;
  }

  public static java.lang.invoke.MethodHandle throwException(java.lang.Class<?> a, java.lang.Class<? extends java.lang.Throwable> b) {
        return null;
  }

  
  public static class Lookup {
    public static final int PUBLIC = 1;
    public static final int PRIVATE = 2;
    public static final int PROTECTED = 4;
    public static final int PACKAGE = 8;
    public Lookup() {}
    public java.lang.Class<?> lookupClass() {
        return null;
    }
    public int lookupModes() {
        return 0;
    }
    public Lookup in(java.lang.Class<?> a) {
        return null;
    }
    public java.lang.invoke.MethodHandle findStatic(java.lang.Class<?> a, java.lang.String b, java.lang.invoke.MethodType c) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException {
        return null;
    }
    public java.lang.invoke.MethodHandle findVirtual(java.lang.Class<?> a, java.lang.String b, java.lang.invoke.MethodType c) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException {
        return null;
    }
    public java.lang.invoke.MethodHandle findConstructor(java.lang.Class<?> a, java.lang.invoke.MethodType b) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException {
        return null;
    }
    public java.lang.invoke.MethodHandle findSpecial(java.lang.Class<?> a, java.lang.String b, java.lang.invoke.MethodType c, java.lang.Class<?> d) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException {
        return null;
    }
    public java.lang.invoke.MethodHandle findGetter(java.lang.Class<?> a, java.lang.String b, java.lang.Class<?> c) throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
        return null;
    }
    public java.lang.invoke.MethodHandle findSetter(java.lang.Class<?> a, java.lang.String b, java.lang.Class<?> c) throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
        return null;
    }
    public java.lang.invoke.MethodHandle findStaticGetter(java.lang.Class<?> a, java.lang.String b, java.lang.Class<?> c) throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
        return null;
    }
    public java.lang.invoke.MethodHandle findStaticSetter(java.lang.Class<?> a, java.lang.String b, java.lang.Class<?> c) throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
        return null;        
    }
    public java.lang.invoke.MethodHandle bind(java.lang.Object a, java.lang.String b, java.lang.invoke.MethodType c) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException {
        return null;
    }
    public java.lang.invoke.MethodHandle unreflect(java.lang.Object a) throws java.lang.IllegalAccessException {
        return null;
    }
    public java.lang.invoke.MethodHandle unreflectSpecial(java.lang.Object a, java.lang.Class<?> b) throws java.lang.IllegalAccessException {
        return null;
    }
    public java.lang.invoke.MethodHandle unreflectConstructor(java.lang.Object a) throws java.lang.IllegalAccessException {
        return null;
    }
    public java.lang.invoke.MethodHandle unreflectGetter(java.lang.Object a) throws java.lang.IllegalAccessException {
        return null;        
    }
    public java.lang.invoke.MethodHandle unreflectSetter(java.lang.Object a) throws java.lang.IllegalAccessException {
        return null;
    }
    public java.lang.invoke.MethodHandleInfo revealDirect(java.lang.invoke.MethodHandle a) {
        return null;
    }
  }
}
