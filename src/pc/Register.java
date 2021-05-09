package pc;

public class Register<T> {
  private volatile T value;

  public Register(T initial) { value = initial; }

  public T read() { return value; }

  public void write(T v) { value = v; }
}

