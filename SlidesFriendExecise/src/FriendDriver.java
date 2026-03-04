public class FriendDriver {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Zahra", 17, 165);
        friend1.grow(100);

        Friend friend2 = new Friend("Ahmed", 18, 175);
        friend2.saySomething("How you doing!");

        Friend friend3 = new Friend("Mohammed", 19, 170);
        friend3.saySomething("HLA! HLA!");
    }
}
