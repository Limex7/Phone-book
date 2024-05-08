public class RunMyCode {
    public static void main(String[] args){
        PhoneBook cool = new PhoneBook("Conner", "Wilson", "123 ahhhhh", "burlington", "001001001");
        Builder build = new Builder();
        for (int i = 0; i < 3; i++){
            build.add(cool, "Jon" + i, "Jonzz", "1912 st", "arlington", "s001001002");
        }
        build.set(cool, "les", "go", "1912 st", "bellingham", "1111111111", 2);
        build.print(cool);
    }
}
