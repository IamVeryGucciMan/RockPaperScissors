class RPS {
    public static void main(String args[]){
        System.out.println(Config.printRules());
        Player you = new Player();
        Player bot = new Player();
        you.setPcChoice();
        bot.setNpcChoice();
        System.out.println(Config.printOutcome(Config.calculateWinner(you.getChoice(), bot.getChoice())));
    }
}
