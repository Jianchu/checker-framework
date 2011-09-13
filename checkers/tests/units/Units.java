import checkers.units.*;
import checkers.units.quals.*;
import static checkers.units.UnitsTools.s;

public class Units {
    @m int m1 = 5 * UnitsTools.m;

    // The advantage of using the multiplication with a unit is that
    // also double, float, etc. are easily handled and we don't need
    // to end a huge number of methods to UnitsTools.
    @m double dm = 9.34d * UnitsTools.m;
  
    // With a static import:
    @s float time = 5.32f * s;
}
