package Module3;

/**
 * Created by George on 20/02/2017.
 */
    public class Bird{
        public static void main(String[] args) {
            Bird bird = new Bird();

            bird.sing("I am singing");
            bird.sing("I am flying");
            bird.sing("I am singing");
            bird.sing("I am a Bird");
        }

        private void sing(String song) {
            System.out.println(song);
        }

}
