class Coins {
    public static void main(String args[]) {
        int cents = Integer.parseInt(args[0]);
        int quarter = cents/25;
        int centsLeft = cents%25;
        System.out.println("Use " + quarter + " quarters and " + centsLeft + " cents ");
    }
}