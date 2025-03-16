package RClock;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RClock extends JFrame 
{
    private JLabel ClockLabel;
    private JLabel ClockText;

    public RClock()
    {
        setTitle("Linus' Clock");
        setSize(720, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the clock label
        ClockLabel = new JLabel();
        ClockLabel.setFont(new Font("Arial", Font.BOLD, 36));
        ClockLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(ClockLabel, BorderLayout.CENTER);

        // create clock text
        ClockText = new JLabel();
        ClockText.setFont(new Font("Arial", Font.BOLD, 56));
        ClockText.setHorizontalAlignment(SwingConstants.CENTER);
        ClockText.setVerticalAlignment(SwingConstants.TOP);
        ClockText.setText("Linux Clock");
        add(ClockText, BorderLayout.NORTH);


        // Start the clock
        Timer timer = new Timer(1000, e -> updateClock());
        timer.start();

        // Initialize update
        updateClock();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void updateClock()
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm a");
        String time = dateFormat.format(new Date());
        ClockLabel.setText(time);
    }
}