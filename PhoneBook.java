public class PhoneBook {
    protected String fName;
    protected String lName;
    protected String adress;
    protected String city;
    protected String phoneNumber;
    protected ListNode next;

    public PhoneBook(String fName, String lName, String adress, String city, String phoneNumber){
        this.fName = fName;
        this.lName = lName;
        this.adress = adress;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.next = null;
    }
    public PhoneBook(String fName, String lName, String adress, String city, String phoneNumber, ListNode next){
        this.fName = fName;
        this.lName = lName;
        this.adress = adress;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.next = next;
    }

    public getfName(){return fName;}
    public getlName(){return lName;}
    public getAdress(){return adress;}
    public getCity(){return city;}
    public getPhoneNumber(){return phoneNumber;}

    public setfName(String fNames){
        this.fName = fNames;
    }
    public setlName(String lNames){
        this.lName = lNames;
    }
    public setAdress(String adresss){
        this.adress = adresss;
    }
    public setCity(String cities){
        this.city = cities;
    }
    public setPhoneNumber(String Phone){
        this.phoneNumber = Phone;
    }

   
    public String toString() {
        return String.format("Name: %s %s%nAdress: %s%nCity: %s%nPhoneNumber: %s%n", fName, lName, adress, city, phoneNumber);
    }

    
    
}
