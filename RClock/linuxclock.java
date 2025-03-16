package RClock;

import javax.swing.SwingUtilities;

public class linuxclock 
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(RClock::new);
    }
}
