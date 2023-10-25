package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.lang.*;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {
  @Test
  void fire_Success(){
    // Arrange
    TorpedoStore store = new TorpedoStore(1);

    // Act
    boolean result = store.fire(1);

    // Assert
    assertEquals(true, result);
  }

  @Test
  void fire_one() {
    TorpedoStore store = new TorpedoStore(1);
    assertEquals(true, store.fire(1));
  }

  @Test
  void invalid_argument() {
    TorpedoStore store = new TorpedoStore(1);

    
    assertThrows(IllegalArgumentException.class, () -> store.fire(-1));
    


  }
}
