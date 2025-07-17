// Create an interface Playable with method play(). Implement it in a class Music.

interface Playable {
    void play();
}

class Music implements Playable {
    public void play() {
        System.out.println("Playing music...");
    }

    public static void main(String[] args) {
        Music m = new Music();
        m.play();
    }
}
