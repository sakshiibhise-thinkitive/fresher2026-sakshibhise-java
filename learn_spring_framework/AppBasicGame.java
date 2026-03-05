package learn_spring_framework;

class AppBasicGame {
    public static void main(String args[])
    {
       // var game = new MarioGame();
        var game = new SuperContraGame ();
       // var game= new PackMan();
        var gamerRunner= new GameRunner(game);
        gamerRunner.run();
    }

}