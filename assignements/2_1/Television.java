public class Television {
    private boolean on;        // TV power state
    private int channel;       // Current channel
    private final int MAX_CHANNEL = 10; // Maximum channel number

    // Constructor: TV starts off, default channel is 1
    public Television() {
        this.on = false;
        this.channel = 1;
    }

    // Turn TV on or off
    public void pressOnOff() {
        on = !on;
    }

    // Check if TV is on
    public boolean isOn() {
        return on;
    }

    // Get the current channel
    public int getChannel() {
        return channel;
    }

    // Set the channel
    public void setChannel(int newChannel) {
        // Wrap around if channel exceeds MAX_CHANNEL
        if (newChannel > MAX_CHANNEL) {
            channel = newChannel % MAX_CHANNEL;
            if (channel == 0) {
                channel = MAX_CHANNEL;
            }
        } else {
            channel = newChannel;
        }
    }
}
