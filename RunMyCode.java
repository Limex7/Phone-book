public class RunMyCode {
    public static void main(String[] args){
        ListNode cool = new ListNode(10);
        Builder build = new Builder();
        for (int i = 0; i < 3; i++){
            build.add(cool, i * 10);
        }
        build.add(cool, 100, 1);
        build.remove(cool, 3);
        build.print(cool);
    }
}
